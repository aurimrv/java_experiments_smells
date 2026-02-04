package ds.seed5482;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed5482 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('#');
    boolean var2 = var0.valid_f((char)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test2() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('4');
    boolean var2 = var0.valid_f((char)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test3() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character(' ');
    boolean var4 = var0.valid_s((char)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test4() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('#');
    boolean var4 = var0.valid_f((char)var3);
    ds.Identifier var5 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test5() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('#');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character(':');
    boolean var6 = var0.valid_f((char)var5);
    boolean var7 = var0.valid_s((char)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test6() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('a');
    boolean var2 = var0.valid_s((char)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test7() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character(' ');
    boolean var2 = var0.valid_f((char)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test8() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('#');
    boolean var2 = var0.valid_s((char)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test9() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('#');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character(':');
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

  public void test10() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('#');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character(':');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('2');
    boolean var8 = var0.valid_f((char)var7);
    boolean var9 = var0.validateIdentifier(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test11() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('f');
    boolean var2 = var0.valid_s((char)var1);
    ds.Identifier var3 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test12() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('f');
    boolean var2 = var0.valid_s((char)var1);
    boolean var3 = var0.valid_f((char)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test13() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('#');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character(':');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('2');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('v');
    boolean var10 = var0.valid_f((char)var9);
    ds.Identifier var11 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test14() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('#');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character(':');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('2');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('v');
    boolean var11 = var1.valid_f((char)var10);
    boolean var12 = var0.valid_f((char)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test15() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('#');
    boolean var5 = var1.valid_f((char)var4);
    boolean var6 = var0.valid_f((char)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test16() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('3');
    boolean var2 = var0.valid_s((char)var1);
    ds.Identifier var3 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test17() throws Throwable {

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

  public void test18() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('4');
    boolean var2 = var0.valid_s((char)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test19() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('f');
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

  public void test20() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('f');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('6');
    boolean var4 = var0.valid_f((char)var3);
    ds.Identifier var5 = new ds.Identifier();
    java.lang.String var6 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var7 = var5.validateIdentifier(var6);
    boolean var8 = var0.validateIdentifier(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test21() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('#');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character(':');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('2');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('v');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('4');
    boolean var12 = var0.valid_f((char)var11);
    boolean var13 = var0.validateIdentifier(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test22() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('a');
    boolean var2 = var0.valid_f((char)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test23() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('#');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character(':');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('2');
    boolean var9 = var1.valid_f((char)var8);
    boolean var10 = var0.valid_s((char)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test24() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('f');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('6');
    boolean var5 = var1.valid_f((char)var4);
    boolean var6 = var0.valid_s((char)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test25() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('N');
    boolean var2 = var0.valid_s((char)var1);
    boolean var3 = var0.valid_f((char)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test26() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('3');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('6');
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

  public void test27() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "3652748019";
    boolean var2 = var0.validateIdentifier(var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.Character var4 = new java.lang.Character('f');
    boolean var5 = var3.valid_s((char)var4);
    boolean var6 = var0.valid_f((char)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test28() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "3652748019";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('#');
    boolean var4 = var0.valid_f((char)var3);
    boolean var5 = var0.validateIdentifier(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test29() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "3652748019";
    boolean var3 = var1.validateIdentifier(var2);
    boolean var4 = var0.validateIdentifier(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test30() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "3652748019";
    boolean var2 = var0.validateIdentifier(var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.Character var4 = new java.lang.Character('3');
    boolean var5 = var3.valid_s((char)var4);
    java.lang.Character var6 = new java.lang.Character('6');
    boolean var7 = var3.valid_f((char)var6);
    boolean var8 = var0.valid_s((char)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test31() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('f');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('6');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('5');
    boolean var6 = var0.valid_f((char)var5);
    ds.Identifier var7 = new ds.Identifier();
    java.lang.String var8 = "3652748019";
    boolean var9 = var7.validateIdentifier(var8);
    boolean var10 = var0.validateIdentifier(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test32() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('f');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('6');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('5');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('T');
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

  public void test33() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var3 = var1.validateIdentifier(var2);
    boolean var4 = var0.validateIdentifier(var2);
    ds.Identifier var5 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test34() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "3652748019";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('#');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character(':');
    boolean var6 = var0.valid_f((char)var5);
    ds.Identifier var7 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test35() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('f');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('#');
    boolean var4 = var0.valid_f((char)var3);
    boolean var5 = var0.valid_s((char)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test36() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "3652748019";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('#');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character(':');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('T');
    boolean var8 = var0.valid_f((char)var7);
    boolean var9 = var0.valid_s((char)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test37() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('f');
    boolean var3 = var1.valid_s((char)var2);
    boolean var4 = var0.valid_f((char)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test38() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "3652748019";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('#');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character(':');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('T');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('7');
    boolean var10 = var0.valid_f((char)var9);
    boolean var11 = var0.valid_s((char)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test39() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('N');
    boolean var3 = var1.valid_s((char)var2);
    boolean var4 = var0.valid_f((char)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test40() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "3652748019";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('#');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character(':');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('T');
    boolean var9 = var1.valid_f((char)var8);
    boolean var10 = var0.valid_f((char)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test41() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character(' ');
    boolean var2 = var0.valid_s((char)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test42() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('#');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character(':');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('2');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('v');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('4');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('e');
    boolean var14 = var0.valid_f((char)var13);
    boolean var15 = var0.valid_s((char)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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
    assertTrue(var15 == true);

  }

  public void test43() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('3');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('6');
    boolean var5 = var1.valid_f((char)var4);
    boolean var6 = var0.valid_s((char)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test44() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('#');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character(':');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('2');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('v');
    boolean var11 = var1.valid_f((char)var10);
    boolean var12 = var0.valid_s((char)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test45() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('f');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('#');
    boolean var4 = var0.valid_f((char)var3);
    ds.Identifier var5 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test46() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('f');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('#');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character(':');
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
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test47() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('f');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('#');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character(':');
    boolean var7 = var1.valid_f((char)var6);
    boolean var8 = var0.valid_f((char)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test48() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('f');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('6');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('5');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('T');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('v');
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

  public void test49() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('f');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('#');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character(':');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('2');
    boolean var8 = var0.valid_f((char)var7);
    ds.Identifier var9 = new ds.Identifier();
    java.lang.String var10 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var11 = var9.validateIdentifier(var10);
    boolean var12 = var0.validateIdentifier(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test50() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('f');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('6');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('5');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('T');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('v');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character(' ');
    boolean var12 = var0.valid_f((char)var11);
    ds.Identifier var13 = new ds.Identifier();
    
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
    assertTrue(var12 == false);

  }

  public void test51() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('f');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('#');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character(':');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('2');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('v');
    boolean var10 = var0.valid_f((char)var9);
    ds.Identifier var11 = new ds.Identifier();
    java.lang.String var12 = "3652748019";
    boolean var13 = var11.validateIdentifier(var12);
    boolean var14 = var0.validateIdentifier(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test52() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('f');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('6');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('5');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('T');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('v');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character(' ');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('e');
    boolean var14 = var0.valid_f((char)var13);
    ds.Identifier var15 = new ds.Identifier();
    java.lang.String var16 = "3652748019";
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
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test53() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var3 = var1.validateIdentifier(var2);
    boolean var4 = var0.validateIdentifier(var2);
    java.lang.Character var5 = new java.lang.Character('#');
    boolean var6 = var0.valid_f((char)var5);
    ds.Identifier var7 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test54() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('f');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('#');
    boolean var5 = var1.valid_f((char)var4);
    boolean var6 = var0.valid_f((char)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test55() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('f');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('6');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('5');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('T');
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

  public void test56() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('f');
    boolean var3 = var1.valid_s((char)var2);
    boolean var4 = var0.valid_s((char)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test57() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "3652748019";
    boolean var2 = var0.validateIdentifier(var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.String var4 = "3652748019";
    boolean var5 = var3.validateIdentifier(var4);
    java.lang.Character var6 = new java.lang.Character('#');
    boolean var7 = var3.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character(':');
    boolean var9 = var3.valid_f((char)var8);
    boolean var10 = var0.valid_s((char)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test58() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var2 = var0.validateIdentifier(var1);
    ds.Identifier var3 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test59() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('#');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character(':');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('2');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('v');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('4');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('e');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('0');
    boolean var16 = var0.valid_f((char)var15);
    ds.Identifier var17 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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

  }

  public void test60() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('6');
    boolean var4 = var0.valid_f((char)var3);
    ds.Identifier var5 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test61() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('f');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('6');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('5');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('T');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('v');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character(' ');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('e');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('Y');
    boolean var16 = var0.valid_f((char)var15);
    boolean var17 = var0.valid_s((char)var15);
    
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
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test62() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('6');
    boolean var5 = var1.valid_f((char)var4);
    boolean var6 = var0.valid_f((char)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test63() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "3652748019";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('#');
    boolean var5 = var1.valid_f((char)var4);
    boolean var6 = var0.valid_f((char)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test64() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('N');
    boolean var2 = var0.valid_s((char)var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.String var4 = "3652748019";
    boolean var5 = var3.validateIdentifier(var4);
    boolean var6 = var0.validateIdentifier(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test65() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var3 = var1.validateIdentifier(var2);
    boolean var4 = var0.validateIdentifier(var2);
    java.lang.Character var5 = new java.lang.Character('#');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character(':');
    boolean var8 = var0.valid_f((char)var7);
    boolean var9 = var1.validateIdentifier(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test66() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "3652748019";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('#');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character(':');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('T');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('7');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('4');
    boolean var12 = var0.valid_f((char)var11);
    boolean var13 = var0.valid_s((char)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test67() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('#');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character(':');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('2');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('v');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('4');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('e');
    boolean var15 = var1.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('0');
    boolean var17 = var1.valid_f((char)var16);
    boolean var18 = var0.valid_s((char)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
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
    assertTrue(var18 == false);

  }

  public void test68() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "3652748019";
    boolean var2 = var0.validateIdentifier(var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.String var4 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var5 = var3.validateIdentifier(var4);
    java.lang.Character var6 = new java.lang.Character('#');
    boolean var7 = var3.valid_f((char)var6);
    boolean var8 = var0.valid_f((char)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test69() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var3 = var1.validateIdentifier(var2);
    boolean var4 = var0.validateIdentifier(var2);
    java.lang.Character var5 = new java.lang.Character('#');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character(':');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('T');
    boolean var10 = var0.valid_f((char)var9);
    ds.Identifier var11 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test70() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('#');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character(':');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('2');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('v');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('4');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('e');
    boolean var15 = var1.valid_f((char)var14);
    boolean var16 = var0.valid_s((char)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
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
    assertTrue(var16 == true);

  }

  public void test71() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    ds.Identifier var2 = new ds.Identifier();
    java.lang.String var3 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var4 = var2.validateIdentifier(var3);
    boolean var5 = var1.validateIdentifier(var3);
    boolean var6 = var0.validateIdentifier(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test72() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "3652748019";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('#');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character(':');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('T');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('7');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('4');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('e');
    boolean var14 = var0.valid_f((char)var13);
    boolean var15 = var0.valid_s((char)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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
    assertTrue(var15 == true);

  }

  public void test73() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "3652748019";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('#');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character(':');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('T');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('7');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('4');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('e');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('Y');
    boolean var16 = var0.valid_f((char)var15);
    boolean var17 = var0.validateIdentifier(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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
    assertTrue(var17 == false);

  }

  public void test74() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('f');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('#');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character(':');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('2');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('v');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('4');
    boolean var12 = var0.valid_f((char)var11);
    ds.Identifier var13 = new ds.Identifier();
    java.lang.String var14 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var15 = var13.validateIdentifier(var14);
    boolean var16 = var0.validateIdentifier(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
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

  }

  public void test75() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('6');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('5');
    boolean var6 = var0.valid_f((char)var5);
    ds.Identifier var7 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test76() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('f');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('#');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character(':');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('2');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('v');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('4');
    boolean var13 = var1.valid_f((char)var12);
    boolean var14 = var0.valid_f((char)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test77() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var3 = var1.validateIdentifier(var2);
    boolean var4 = var0.validateIdentifier(var2);
    java.lang.Character var5 = new java.lang.Character('#');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character(':');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('T');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('7');
    boolean var12 = var0.valid_f((char)var11);
    boolean var13 = var1.validateIdentifier(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
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
    assertTrue(var13 == false);

  }

  public void test78() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('6');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('5');
    boolean var7 = var1.valid_f((char)var6);
    boolean var8 = var0.valid_s((char)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test79() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('6');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('5');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('2');
    boolean var8 = var0.valid_f((char)var7);
    boolean var9 = var0.validateIdentifier(var1);
    
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

  public void test80() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('f');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('6');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('5');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('T');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('v');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character(' ');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('e');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('Y');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('1');
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
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test81() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('f');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('6');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('5');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('T');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('v');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character(' ');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('e');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('Y');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('1');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('X');
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
    assertTrue(var12 == false);
    
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

  public void test82() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "3652748019";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('6');
    boolean var4 = var0.valid_f((char)var3);
    boolean var5 = var0.valid_s((char)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test83() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('#');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character(':');
    boolean var7 = var1.valid_f((char)var6);
    boolean var8 = var0.valid_f((char)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test84() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "3652748019";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('#');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character(':');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('T');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('7');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('4');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('e');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('Y');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('1');
    boolean var18 = var0.valid_f((char)var17);
    boolean var19 = var0.valid_s((char)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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
    assertTrue(var19 == false);

  }

  public void test85() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "3652748019";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('#');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character(':');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('T');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('7');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('4');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('e');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('Y');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('1');
    boolean var18 = var0.valid_f((char)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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

  }

  public void test86() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('f');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('#');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character(':');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('2');
    boolean var9 = var1.valid_f((char)var8);
    boolean var10 = var0.valid_f((char)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test87() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "3652748019";
    boolean var3 = var1.validateIdentifier(var2);
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

  public void test88() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('6');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('5');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('2');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('v');
    boolean var10 = var0.valid_f((char)var9);
    boolean var11 = var0.validateIdentifier(var1);
    
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
    assertTrue(var11 == false);

  }

  public void test89() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "f";
    boolean var2 = var0.validateIdentifier(var1);
    ds.Identifier var3 = new ds.Identifier();
    ds.Identifier var4 = new ds.Identifier();
    java.lang.String var5 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var6 = var4.validateIdentifier(var5);
    boolean var7 = var3.validateIdentifier(var5);
    java.lang.Character var8 = new java.lang.Character('#');
    boolean var9 = var3.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character(':');
    boolean var11 = var3.valid_f((char)var10);
    boolean var12 = var0.valid_s((char)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test90() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('f');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('#');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character(':');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('2');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('v');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('4');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('8');
    boolean var14 = var0.valid_f((char)var13);
    ds.Identifier var15 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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

  public void test91() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('#');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character(':');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('2');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('v');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('4');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('e');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('0');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('1');
    boolean var18 = var0.valid_f((char)var17);
    boolean var19 = var0.validateIdentifier(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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
    assertTrue(var19 == false);

  }

  public void test92() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('f');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('#');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character(':');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('2');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('v');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('4');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('8');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('Y');
    boolean var16 = var0.valid_f((char)var15);
    ds.Identifier var17 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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

  }

  public void test93() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('f');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('#');
    boolean var5 = var1.valid_f((char)var4);
    boolean var6 = var0.valid_s((char)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test94() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "3652748019";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('#');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character(':');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('T');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('7');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('4');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('e');
    boolean var15 = var1.valid_f((char)var14);
    boolean var16 = var0.valid_f((char)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
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
    assertTrue(var16 == true);

  }

  public void test95() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('#');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character(':');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('2');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('v');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('4');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('e');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('0');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('1');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('X');
    boolean var20 = var0.valid_f((char)var19);
    boolean var21 = var0.valid_s((char)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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
    assertTrue(var21 == true);

  }

  public void test96() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('f');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('6');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('5');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('T');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('v');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character(' ');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('e');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('Y');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('1');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('X');
    boolean var20 = var0.valid_f((char)var19);
    java.lang.Character var21 = new java.lang.Character('[');
    boolean var22 = var0.valid_f((char)var21);
    ds.Identifier var23 = new ds.Identifier();
    
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
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test97() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('f');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('6');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('5');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('T');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('v');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character(' ');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('e');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('Y');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('1');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('X');
    boolean var20 = var0.valid_f((char)var19);
    java.lang.Character var21 = new java.lang.Character('[');
    boolean var22 = var0.valid_f((char)var21);
    
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
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test98() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('f');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('#');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character(':');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('2');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('v');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('4');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('8');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('Y');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('1');
    boolean var18 = var0.valid_f((char)var17);
    boolean var19 = var0.valid_s((char)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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
    assertTrue(var19 == false);

  }

  public void test99() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('f');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('#');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character(':');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('2');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('v');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('4');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('8');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('Y');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('1');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('X');
    boolean var20 = var0.valid_f((char)var19);
    java.lang.String var21 = "";
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var22 = var0.validateIdentifier(var21);
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

  public void test100() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('f');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('#');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character(':');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('2');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('v');
    boolean var11 = var1.valid_f((char)var10);
    boolean var12 = var0.valid_f((char)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test101() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('#');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character(':');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('2');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('v');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('4');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('e');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('0');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('1');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('X');
    boolean var20 = var0.valid_f((char)var19);
    java.lang.Character var21 = new java.lang.Character('[');
    boolean var22 = var0.valid_f((char)var21);
    boolean var23 = var0.valid_s((char)var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test102() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('#');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character(':');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('2');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('v');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('4');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('e');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('0');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('1');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('X');
    boolean var20 = var0.valid_f((char)var19);
    java.lang.Character var21 = new java.lang.Character('[');
    boolean var22 = var0.valid_f((char)var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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
    assertTrue(var22 == false);

  }

  public void test103() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('#');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character(':');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('2');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('v');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('4');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('e');
    boolean var15 = var1.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('0');
    boolean var17 = var1.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('1');
    boolean var19 = var1.valid_f((char)var18);
    java.lang.Character var20 = new java.lang.Character('X');
    boolean var21 = var1.valid_f((char)var20);
    java.lang.Character var22 = new java.lang.Character('[');
    boolean var23 = var1.valid_f((char)var22);
    boolean var24 = var0.valid_f((char)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
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
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test104() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "f";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('#');
    boolean var4 = var0.valid_f((char)var3);
    boolean var5 = var0.validateIdentifier(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test105() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('f');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('#');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character(':');
    boolean var6 = var0.valid_f((char)var5);
    ds.Identifier var7 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test106() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('f');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('#');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character(':');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('2');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('v');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('4');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('8');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('Y');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('1');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('X');
    boolean var20 = var0.valid_f((char)var19);
    java.lang.Character var21 = new java.lang.Character('[');
    boolean var22 = var0.valid_f((char)var21);
    ds.Identifier var23 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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
    assertTrue(var22 == false);

  }

  public void test107() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('f');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('#');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character(':');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('2');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('v');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('4');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('8');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('Y');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('1');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('X');
    boolean var20 = var0.valid_f((char)var19);
    java.lang.Character var21 = new java.lang.Character('[');
    boolean var22 = var0.valid_f((char)var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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
    assertTrue(var22 == false);

  }

  public void test108() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('N');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('#');
    boolean var4 = var0.valid_f((char)var3);
    ds.Identifier var5 = new ds.Identifier();
    java.lang.String var6 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var7 = var5.validateIdentifier(var6);
    boolean var8 = var0.validateIdentifier(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test109() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('N');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('#');
    boolean var4 = var0.valid_f((char)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test110() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "3652748019";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('6');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('5');
    boolean var6 = var0.valid_f((char)var5);
    boolean var7 = var0.validateIdentifier(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test111() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var3 = var1.validateIdentifier(var2);
    boolean var4 = var0.validateIdentifier(var2);
    java.lang.Character var5 = new java.lang.Character('6');
    boolean var6 = var0.valid_f((char)var5);
    boolean var7 = var1.validateIdentifier(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test112() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('f');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('#');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character(':');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('T');
    boolean var8 = var0.valid_f((char)var7);
    ds.Identifier var9 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test113() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('f');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('#');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character(':');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('T');
    boolean var8 = var0.valid_f((char)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test114() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('6');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('5');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('2');
    boolean var8 = var0.valid_f((char)var7);
    ds.Identifier var9 = new ds.Identifier();
    ds.Identifier var10 = new ds.Identifier();
    java.lang.String var11 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var12 = var10.validateIdentifier(var11);
    boolean var13 = var9.validateIdentifier(var11);
    java.lang.Character var14 = new java.lang.Character('#');
    boolean var15 = var9.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character(':');
    boolean var17 = var9.valid_f((char)var16);
    boolean var18 = var0.valid_s((char)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test115() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var3 = var1.validateIdentifier(var2);
    boolean var4 = var0.validateIdentifier(var2);
    java.lang.Character var5 = new java.lang.Character('6');
    boolean var6 = var0.valid_f((char)var5);
    ds.Identifier var7 = new ds.Identifier();
    java.lang.String var8 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var9 = var7.validateIdentifier(var8);
    boolean var10 = var0.validateIdentifier(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test116() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var2 = var0.validateIdentifier(var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.Character var4 = new java.lang.Character('f');
    boolean var5 = var3.valid_s((char)var4);
    java.lang.Character var6 = new java.lang.Character('#');
    boolean var7 = var3.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character(':');
    boolean var9 = var3.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('2');
    boolean var11 = var3.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('v');
    boolean var13 = var3.valid_f((char)var12);
    boolean var14 = var0.valid_s((char)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test117() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('N');
    boolean var2 = var0.valid_s((char)var1);
    ds.Identifier var3 = new ds.Identifier();
    ds.Identifier var4 = new ds.Identifier();
    java.lang.String var5 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var6 = var4.validateIdentifier(var5);
    boolean var7 = var3.validateIdentifier(var5);
    java.lang.Character var8 = new java.lang.Character('#');
    boolean var9 = var3.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character(':');
    boolean var11 = var3.valid_f((char)var10);
    ds.Identifier var12 = new ds.Identifier();
    java.lang.String var13 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var14 = var12.validateIdentifier(var13);
    boolean var15 = var3.validateIdentifier(var13);
    boolean var16 = var0.validateIdentifier(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test118() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "3652748019";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('#');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character(':');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('T');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('7');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('4');
    boolean var12 = var0.valid_f((char)var11);
    ds.Identifier var13 = new ds.Identifier();
    java.lang.String var14 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var15 = var13.validateIdentifier(var14);
    java.lang.Character var16 = new java.lang.Character('#');
    boolean var17 = var13.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character(':');
    boolean var19 = var13.valid_f((char)var18);
    boolean var20 = var0.valid_f((char)var18);
    java.lang.String var21 = "";
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var22 = var0.validateIdentifier(var21);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test119() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('#');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character(':');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('2');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('v');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('4');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('e');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('0');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('1');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.String var19 = "";
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var20 = var0.validateIdentifier(var19);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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

  }

  public void test120() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('#');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character(':');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('2');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('v');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('4');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('e');
    boolean var15 = var1.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('0');
    boolean var17 = var1.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('1');
    boolean var19 = var1.valid_f((char)var18);
    boolean var20 = var0.valid_s((char)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
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
    assertTrue(var20 == false);

  }

  public void test121() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('f');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('6');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('5');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('T');
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

  public void test122() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "f";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('#');
    boolean var5 = var1.valid_f((char)var4);
    boolean var6 = var0.valid_s((char)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test123() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('f');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('#');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character(':');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('2');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('v');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('4');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('8');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('Y');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('#');
    boolean var18 = var0.valid_f((char)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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
    assertTrue(var18 == false);

  }

  public void test124() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('f');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('6');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('5');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('T');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('v');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character(' ');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('e');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('Y');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('1');
    boolean var18 = var0.valid_f((char)var17);
    ds.Identifier var19 = new ds.Identifier();
    java.lang.Character var20 = new java.lang.Character('f');
    boolean var21 = var19.valid_s((char)var20);
    java.lang.Character var22 = new java.lang.Character('6');
    boolean var23 = var19.valid_f((char)var22);
    java.lang.Character var24 = new java.lang.Character('5');
    boolean var25 = var19.valid_f((char)var24);
    boolean var26 = var0.valid_s((char)var24);
    ds.Identifier var27 = new ds.Identifier();
    ds.Identifier var28 = new ds.Identifier();
    java.lang.String var29 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var30 = var28.validateIdentifier(var29);
    boolean var31 = var27.validateIdentifier(var29);
    java.lang.Character var32 = new java.lang.Character('#');
    boolean var33 = var27.valid_f((char)var32);
    boolean var34 = var0.valid_s((char)var32);
    
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
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test125() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('#');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character(':');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('2');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('v');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('4');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('e');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('0');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('1');
    boolean var18 = var0.valid_f((char)var17);
    ds.Identifier var19 = new ds.Identifier();
    ds.Identifier var20 = new ds.Identifier();
    java.lang.Character var21 = new java.lang.Character('f');
    boolean var22 = var20.valid_s((char)var21);
    java.lang.Character var23 = new java.lang.Character('6');
    boolean var24 = var20.valid_f((char)var23);
    java.lang.Character var25 = new java.lang.Character('5');
    boolean var26 = var20.valid_f((char)var25);
    boolean var27 = var19.valid_f((char)var25);
    boolean var28 = var0.valid_s((char)var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test126() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var2 = var0.validateIdentifier(var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.String var4 = "3652748019";
    boolean var5 = var3.validateIdentifier(var4);
    boolean var6 = var0.validateIdentifier(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test127() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    ds.Identifier var2 = new ds.Identifier();
    java.lang.String var3 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var4 = var2.validateIdentifier(var3);
    boolean var5 = var1.validateIdentifier(var3);
    java.lang.Character var6 = new java.lang.Character('#');
    boolean var7 = var1.valid_f((char)var6);
    boolean var8 = var0.valid_f((char)var6);
    ds.Identifier var9 = new ds.Identifier();
    java.lang.String var10 = "3652748019";
    boolean var11 = var9.validateIdentifier(var10);
    boolean var12 = var0.validateIdentifier(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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

  }

  public void test128() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('#');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character(':');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('2');
    boolean var9 = var1.valid_f((char)var8);
    boolean var10 = var0.valid_f((char)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test129() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('N');
    boolean var2 = var0.valid_s((char)var1);
    ds.Identifier var3 = new ds.Identifier();
    ds.Identifier var4 = new ds.Identifier();
    java.lang.String var5 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var6 = var4.validateIdentifier(var5);
    boolean var7 = var3.validateIdentifier(var5);
    boolean var8 = var0.validateIdentifier(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test130() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "3652748019";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('#');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character(':');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('T');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('7');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('4');
    boolean var12 = var0.valid_f((char)var11);
    ds.Identifier var13 = new ds.Identifier();
    java.lang.String var14 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var15 = var13.validateIdentifier(var14);
    java.lang.Character var16 = new java.lang.Character('#');
    boolean var17 = var13.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character(':');
    boolean var19 = var13.valid_f((char)var18);
    boolean var20 = var0.valid_f((char)var18);
    ds.Identifier var21 = new ds.Identifier();
    java.lang.String var22 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var23 = var21.validateIdentifier(var22);
    java.lang.Character var24 = new java.lang.Character('#');
    boolean var25 = var21.valid_f((char)var24);
    java.lang.Character var26 = new java.lang.Character(':');
    boolean var27 = var21.valid_f((char)var26);
    java.lang.Character var28 = new java.lang.Character('2');
    boolean var29 = var21.valid_f((char)var28);
    java.lang.Character var30 = new java.lang.Character('v');
    boolean var31 = var21.valid_f((char)var30);
    java.lang.Character var32 = new java.lang.Character('4');
    boolean var33 = var21.valid_f((char)var32);
    java.lang.Character var34 = new java.lang.Character('e');
    boolean var35 = var21.valid_f((char)var34);
    java.lang.Character var36 = new java.lang.Character('0');
    boolean var37 = var21.valid_f((char)var36);
    java.lang.Character var38 = new java.lang.Character('1');
    boolean var39 = var21.valid_f((char)var38);
    boolean var40 = var0.valid_s((char)var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
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
    assertTrue(var40 == false);

  }

  public void test131() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('f');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('#');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character(':');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('2');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('v');
    boolean var10 = var0.valid_f((char)var9);
    ds.Identifier var11 = new ds.Identifier();
    ds.Identifier var12 = new ds.Identifier();
    java.lang.String var13 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var14 = var12.validateIdentifier(var13);
    boolean var15 = var11.validateIdentifier(var13);
    boolean var16 = var0.validateIdentifier(var13);
    ds.Identifier var17 = new ds.Identifier();
    ds.Identifier var18 = new ds.Identifier();
    java.lang.String var19 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var20 = var18.validateIdentifier(var19);
    boolean var21 = var17.validateIdentifier(var19);
    boolean var22 = var0.validateIdentifier(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test132() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('f');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('6');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('5');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('T');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('v');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character(' ');
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
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test133() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('6');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('5');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('2');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('v');
    boolean var10 = var0.valid_f((char)var9);
    ds.Identifier var11 = new ds.Identifier();
    java.lang.Character var12 = new java.lang.Character('f');
    boolean var13 = var11.valid_s((char)var12);
    java.lang.Character var14 = new java.lang.Character('#');
    boolean var15 = var11.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character(':');
    boolean var17 = var11.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('2');
    boolean var19 = var11.valid_f((char)var18);
    java.lang.Character var20 = new java.lang.Character('v');
    boolean var21 = var11.valid_f((char)var20);
    java.lang.Character var22 = new java.lang.Character('4');
    boolean var23 = var11.valid_f((char)var22);
    java.lang.Character var24 = new java.lang.Character('8');
    boolean var25 = var11.valid_f((char)var24);
    java.lang.Character var26 = new java.lang.Character('Y');
    boolean var27 = var11.valid_f((char)var26);
    java.lang.Character var28 = new java.lang.Character('1');
    boolean var29 = var11.valid_f((char)var28);
    java.lang.Character var30 = new java.lang.Character('X');
    boolean var31 = var11.valid_f((char)var30);
    boolean var32 = var0.valid_s((char)var30);
    ds.Identifier var33 = new ds.Identifier();
    java.lang.Character var34 = new java.lang.Character('f');
    boolean var35 = var33.valid_s((char)var34);
    java.lang.Character var36 = new java.lang.Character('#');
    boolean var37 = var33.valid_f((char)var36);
    java.lang.Character var38 = new java.lang.Character(':');
    boolean var39 = var33.valid_f((char)var38);
    java.lang.Character var40 = new java.lang.Character('2');
    boolean var41 = var33.valid_f((char)var40);
    java.lang.Character var42 = new java.lang.Character('v');
    boolean var43 = var33.valid_f((char)var42);
    boolean var44 = var0.valid_f((char)var42);
    ds.Identifier var45 = new ds.Identifier();
    ds.Identifier var46 = new ds.Identifier();
    java.lang.String var47 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var48 = var46.validateIdentifier(var47);
    boolean var49 = var45.validateIdentifier(var47);
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
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
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
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);

  }

  public void test134() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "3652748019";
    boolean var2 = var0.validateIdentifier(var1);
    ds.Identifier var3 = new ds.Identifier();
    ds.Identifier var4 = new ds.Identifier();
    java.lang.String var5 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var6 = var4.validateIdentifier(var5);
    java.lang.Character var7 = new java.lang.Character('6');
    boolean var8 = var4.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('5');
    boolean var10 = var4.valid_f((char)var9);
    boolean var11 = var3.valid_f((char)var9);
    ds.Identifier var12 = new ds.Identifier();
    java.lang.String var13 = "3652748019";
    boolean var14 = var12.validateIdentifier(var13);
    java.lang.Character var15 = new java.lang.Character('#');
    boolean var16 = var12.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character(':');
    boolean var18 = var12.valid_f((char)var17);
    boolean var19 = var3.valid_s((char)var17);
    boolean var20 = var0.valid_f((char)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test135() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('f');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('#');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character(':');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('2');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('v');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('4');
    boolean var12 = var0.valid_f((char)var11);
    ds.Identifier var13 = new ds.Identifier();
    java.lang.String var14 = "3652748019";
    boolean var15 = var13.validateIdentifier(var14);
    java.lang.Character var16 = new java.lang.Character('#');
    boolean var17 = var13.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character(':');
    boolean var19 = var13.valid_f((char)var18);
    java.lang.Character var20 = new java.lang.Character('T');
    boolean var21 = var13.valid_f((char)var20);
    java.lang.Character var22 = new java.lang.Character('7');
    boolean var23 = var13.valid_f((char)var22);
    java.lang.Character var24 = new java.lang.Character('4');
    boolean var25 = var13.valid_f((char)var24);
    java.lang.Character var26 = new java.lang.Character('e');
    boolean var27 = var13.valid_f((char)var26);
    java.lang.Character var28 = new java.lang.Character('Y');
    boolean var29 = var13.valid_f((char)var28);
    boolean var30 = var0.valid_f((char)var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
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
    assertTrue(var30 == true);

  }

  public void test136() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "3652748019";
    boolean var2 = var0.validateIdentifier(var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.String var4 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var5 = var3.validateIdentifier(var4);
    boolean var6 = var0.validateIdentifier(var4);
    ds.Identifier var7 = new ds.Identifier();
    java.lang.String var8 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var9 = var7.validateIdentifier(var8);
    java.lang.Character var10 = new java.lang.Character('#');
    boolean var11 = var7.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character(':');
    boolean var13 = var7.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('2');
    boolean var15 = var7.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('v');
    boolean var17 = var7.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('4');
    boolean var19 = var7.valid_f((char)var18);
    java.lang.Character var20 = new java.lang.Character('e');
    boolean var21 = var7.valid_f((char)var20);
    java.lang.Character var22 = new java.lang.Character('0');
    boolean var23 = var7.valid_f((char)var22);
    java.lang.Character var24 = new java.lang.Character('1');
    boolean var25 = var7.valid_f((char)var24);
    java.lang.Character var26 = new java.lang.Character('X');
    boolean var27 = var7.valid_f((char)var26);
    boolean var28 = var0.valid_s((char)var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
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
    assertTrue(var28 == true);

  }

  public void test137() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('#');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character(':');
    boolean var6 = var0.valid_f((char)var5);
    ds.Identifier var7 = new ds.Identifier();
    java.lang.String var8 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var9 = var7.validateIdentifier(var8);
    java.lang.Character var10 = new java.lang.Character('6');
    boolean var11 = var7.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('5');
    boolean var13 = var7.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('2');
    boolean var15 = var7.valid_f((char)var14);
    boolean var16 = var0.valid_s((char)var14);
    ds.Identifier var17 = new ds.Identifier();
    java.lang.String var18 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var19 = var17.validateIdentifier(var18);
    boolean var20 = var0.validateIdentifier(var18);
    
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
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test138() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('6');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('5');
    boolean var7 = var1.valid_f((char)var6);
    boolean var8 = var0.valid_f((char)var6);
    ds.Identifier var9 = new ds.Identifier();
    ds.Identifier var10 = new ds.Identifier();
    java.lang.String var11 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var12 = var10.validateIdentifier(var11);
    boolean var13 = var9.validateIdentifier(var11);
    java.lang.Character var14 = new java.lang.Character('#');
    boolean var15 = var9.valid_f((char)var14);
    boolean var16 = var0.valid_s((char)var14);
    ds.Identifier var17 = new ds.Identifier();
    java.lang.String var18 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var19 = var17.validateIdentifier(var18);
    java.lang.Character var20 = new java.lang.Character('#');
    boolean var21 = var17.valid_f((char)var20);
    java.lang.Character var22 = new java.lang.Character(':');
    boolean var23 = var17.valid_f((char)var22);
    java.lang.Character var24 = new java.lang.Character('2');
    boolean var25 = var17.valid_f((char)var24);
    java.lang.Character var26 = new java.lang.Character('v');
    boolean var27 = var17.valid_f((char)var26);
    java.lang.Character var28 = new java.lang.Character('4');
    boolean var29 = var17.valid_f((char)var28);
    java.lang.Character var30 = new java.lang.Character('e');
    boolean var31 = var17.valid_f((char)var30);
    boolean var32 = var0.valid_s((char)var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
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

  }

  public void test139() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('f');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('6');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('5');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('T');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('v');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character(' ');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('e');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('Y');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('1');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('X');
    boolean var20 = var0.valid_f((char)var19);
    ds.Identifier var21 = new ds.Identifier();
    ds.Identifier var22 = new ds.Identifier();
    java.lang.String var23 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var24 = var22.validateIdentifier(var23);
    java.lang.Character var25 = new java.lang.Character('6');
    boolean var26 = var22.valid_f((char)var25);
    java.lang.Character var27 = new java.lang.Character('5');
    boolean var28 = var22.valid_f((char)var27);
    boolean var29 = var21.valid_f((char)var27);
    ds.Identifier var30 = new ds.Identifier();
    ds.Identifier var31 = new ds.Identifier();
    java.lang.String var32 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var33 = var31.validateIdentifier(var32);
    boolean var34 = var30.validateIdentifier(var32);
    java.lang.Character var35 = new java.lang.Character('#');
    boolean var36 = var30.valid_f((char)var35);
    boolean var37 = var21.valid_s((char)var35);
    boolean var38 = var0.valid_s((char)var35);
    
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
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test140() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    ds.Identifier var2 = new ds.Identifier();
    java.lang.String var3 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var4 = var2.validateIdentifier(var3);
    boolean var5 = var1.validateIdentifier(var3);
    java.lang.Character var6 = new java.lang.Character('#');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character(':');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('T');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('7');
    boolean var13 = var1.valid_f((char)var12);
    boolean var14 = var0.valid_f((char)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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
    assertTrue(var14 == true);

  }

  public void test141() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var2 = var0.validateIdentifier(var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.String var4 = "3652748019";
    boolean var5 = var3.validateIdentifier(var4);
    java.lang.Character var6 = new java.lang.Character('#');
    boolean var7 = var3.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character(':');
    boolean var9 = var3.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('T');
    boolean var11 = var3.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('7');
    boolean var13 = var3.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('4');
    boolean var15 = var3.valid_f((char)var14);
    ds.Identifier var16 = new ds.Identifier();
    java.lang.String var17 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var18 = var16.validateIdentifier(var17);
    java.lang.Character var19 = new java.lang.Character('#');
    boolean var20 = var16.valid_f((char)var19);
    java.lang.Character var21 = new java.lang.Character(':');
    boolean var22 = var16.valid_f((char)var21);
    boolean var23 = var3.valid_f((char)var21);
    boolean var24 = var0.valid_s((char)var21);
    ds.Identifier var25 = new ds.Identifier();
    java.lang.String var26 = "3652748019";
    boolean var27 = var25.validateIdentifier(var26);
    boolean var28 = var0.validateIdentifier(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
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
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test142() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('#');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character(':');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('2');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('v');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('4');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('e');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('0');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.String var17 = "hi!";
    boolean var18 = var0.validateIdentifier(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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

  }

  public void test143() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "3652748019";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('#');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character(':');
    boolean var7 = var1.valid_f((char)var6);
    ds.Identifier var8 = new ds.Identifier();
    java.lang.Character var9 = new java.lang.Character('f');
    boolean var10 = var8.valid_s((char)var9);
    java.lang.Character var11 = new java.lang.Character('6');
    boolean var12 = var8.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('5');
    boolean var14 = var8.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('T');
    boolean var16 = var8.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('v');
    boolean var18 = var8.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character(' ');
    boolean var20 = var8.valid_f((char)var19);
    java.lang.Character var21 = new java.lang.Character('e');
    boolean var22 = var8.valid_f((char)var21);
    java.lang.Character var23 = new java.lang.Character('Y');
    boolean var24 = var8.valid_f((char)var23);
    java.lang.Character var25 = new java.lang.Character('1');
    boolean var26 = var8.valid_f((char)var25);
    boolean var27 = var1.valid_s((char)var25);
    boolean var28 = var0.valid_s((char)var25);
    ds.Identifier var29 = new ds.Identifier();
    java.lang.String var30 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var31 = var29.validateIdentifier(var30);
    java.lang.Character var32 = new java.lang.Character('#');
    boolean var33 = var29.valid_f((char)var32);
    java.lang.Character var34 = new java.lang.Character(':');
    boolean var35 = var29.valid_f((char)var34);
    java.lang.Character var36 = new java.lang.Character('2');
    boolean var37 = var29.valid_f((char)var36);
    boolean var38 = var0.valid_f((char)var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
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
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);

  }

  public void test144() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('3');
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

  public void test145() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('3');
    boolean var3 = var1.valid_s((char)var2);
    boolean var4 = var0.valid_s((char)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test146() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('f');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('6');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('5');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('T');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('v');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character(' ');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('e');
    boolean var14 = var0.valid_f((char)var13);
    ds.Identifier var15 = new ds.Identifier();
    java.lang.Character var16 = new java.lang.Character('f');
    boolean var17 = var15.valid_s((char)var16);
    java.lang.Character var18 = new java.lang.Character('6');
    boolean var19 = var15.valid_f((char)var18);
    boolean var20 = var0.valid_s((char)var18);
    
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
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test147() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('f');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('#');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character(':');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('2');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('v');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('4');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('8');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('Y');
    boolean var16 = var0.valid_f((char)var15);
    ds.Identifier var17 = new ds.Identifier();
    java.lang.String var18 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var19 = var17.validateIdentifier(var18);
    java.lang.Character var20 = new java.lang.Character('#');
    boolean var21 = var17.valid_f((char)var20);
    java.lang.Character var22 = new java.lang.Character(':');
    boolean var23 = var17.valid_f((char)var22);
    ds.Identifier var24 = new ds.Identifier();
    java.lang.String var25 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var26 = var24.validateIdentifier(var25);
    java.lang.Character var27 = new java.lang.Character('6');
    boolean var28 = var24.valid_f((char)var27);
    java.lang.Character var29 = new java.lang.Character('5');
    boolean var30 = var24.valid_f((char)var29);
    java.lang.Character var31 = new java.lang.Character('2');
    boolean var32 = var24.valid_f((char)var31);
    boolean var33 = var17.valid_s((char)var31);
    boolean var34 = var0.valid_s((char)var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
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
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test148() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var3 = var1.validateIdentifier(var2);
    boolean var4 = var0.validateIdentifier(var2);
    ds.Identifier var5 = new ds.Identifier();
    java.lang.String var6 = "3652748019";
    boolean var7 = var5.validateIdentifier(var6);
    ds.Identifier var8 = new ds.Identifier();
    java.lang.String var9 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var10 = var8.validateIdentifier(var9);
    boolean var11 = var5.validateIdentifier(var9);
    boolean var12 = var0.validateIdentifier(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test149() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "hi!";
    boolean var2 = var0.validateIdentifier(var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.String var4 = "f";
    boolean var5 = var3.validateIdentifier(var4);
    ds.Identifier var6 = new ds.Identifier();
    java.lang.String var7 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var8 = var6.validateIdentifier(var7);
    ds.Identifier var9 = new ds.Identifier();
    java.lang.Character var10 = new java.lang.Character('f');
    boolean var11 = var9.valid_s((char)var10);
    java.lang.Character var12 = new java.lang.Character('6');
    boolean var13 = var9.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('5');
    boolean var15 = var9.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('T');
    boolean var17 = var9.valid_f((char)var16);
    boolean var18 = var6.valid_f((char)var16);
    boolean var19 = var3.valid_f((char)var16);
    boolean var20 = var0.valid_f((char)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test150() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('f');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('6');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('5');
    boolean var6 = var0.valid_f((char)var5);
    ds.Identifier var7 = new ds.Identifier();
    java.lang.Character var8 = new java.lang.Character('f');
    boolean var9 = var7.valid_s((char)var8);
    java.lang.Character var10 = new java.lang.Character('#');
    boolean var11 = var7.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character(':');
    boolean var13 = var7.valid_f((char)var12);
    boolean var14 = var0.valid_s((char)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test151() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    ds.Identifier var2 = new ds.Identifier();
    java.lang.Character var3 = new java.lang.Character('f');
    boolean var4 = var2.valid_s((char)var3);
    java.lang.Character var5 = new java.lang.Character('6');
    boolean var6 = var2.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('5');
    boolean var8 = var2.valid_f((char)var7);
    boolean var9 = var1.valid_f((char)var7);
    boolean var10 = var0.valid_f((char)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test152() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('#');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character(':');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('2');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('v');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('4');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('e');
    boolean var14 = var0.valid_f((char)var13);
    ds.Identifier var15 = new ds.Identifier();
    java.lang.String var16 = "3652748019";
    boolean var17 = var15.validateIdentifier(var16);
    boolean var18 = var0.validateIdentifier(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test153() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('#');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character(':');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('2');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('v');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('4');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('e');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('0');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('1');
    boolean var18 = var0.valid_f((char)var17);
    ds.Identifier var19 = new ds.Identifier();
    ds.Identifier var20 = new ds.Identifier();
    java.lang.Character var21 = new java.lang.Character('f');
    boolean var22 = var20.valid_s((char)var21);
    java.lang.Character var23 = new java.lang.Character('#');
    boolean var24 = var20.valid_f((char)var23);
    java.lang.Character var25 = new java.lang.Character(':');
    boolean var26 = var20.valid_f((char)var25);
    java.lang.Character var27 = new java.lang.Character('2');
    boolean var28 = var20.valid_f((char)var27);
    ds.Identifier var29 = new ds.Identifier();
    java.lang.String var30 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var31 = var29.validateIdentifier(var30);
    java.lang.Character var32 = new java.lang.Character('6');
    boolean var33 = var29.valid_f((char)var32);
    java.lang.Character var34 = new java.lang.Character('5');
    boolean var35 = var29.valid_f((char)var34);
    java.lang.Character var36 = new java.lang.Character('2');
    boolean var37 = var29.valid_f((char)var36);
    boolean var38 = var20.valid_f((char)var36);
    boolean var39 = var19.valid_s((char)var36);
    boolean var40 = var0.valid_s((char)var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);

  }

  public void test154() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('6');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('5');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('2');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('v');
    boolean var10 = var0.valid_f((char)var9);
    ds.Identifier var11 = new ds.Identifier();
    java.lang.Character var12 = new java.lang.Character('f');
    boolean var13 = var11.valid_s((char)var12);
    java.lang.Character var14 = new java.lang.Character('#');
    boolean var15 = var11.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character(':');
    boolean var17 = var11.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('2');
    boolean var19 = var11.valid_f((char)var18);
    java.lang.Character var20 = new java.lang.Character('v');
    boolean var21 = var11.valid_f((char)var20);
    java.lang.Character var22 = new java.lang.Character('4');
    boolean var23 = var11.valid_f((char)var22);
    java.lang.Character var24 = new java.lang.Character('8');
    boolean var25 = var11.valid_f((char)var24);
    java.lang.Character var26 = new java.lang.Character('Y');
    boolean var27 = var11.valid_f((char)var26);
    java.lang.Character var28 = new java.lang.Character('1');
    boolean var29 = var11.valid_f((char)var28);
    java.lang.Character var30 = new java.lang.Character('X');
    boolean var31 = var11.valid_f((char)var30);
    boolean var32 = var0.valid_s((char)var30);
    ds.Identifier var33 = new ds.Identifier();
    java.lang.Character var34 = new java.lang.Character('f');
    boolean var35 = var33.valid_s((char)var34);
    java.lang.Character var36 = new java.lang.Character('#');
    boolean var37 = var33.valid_f((char)var36);
    java.lang.Character var38 = new java.lang.Character(':');
    boolean var39 = var33.valid_f((char)var38);
    java.lang.Character var40 = new java.lang.Character('2');
    boolean var41 = var33.valid_f((char)var40);
    java.lang.Character var42 = new java.lang.Character('v');
    boolean var43 = var33.valid_f((char)var42);
    boolean var44 = var0.valid_f((char)var42);
    ds.Identifier var45 = new ds.Identifier();
    java.lang.String var46 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var47 = var45.validateIdentifier(var46);
    java.lang.Character var48 = new java.lang.Character('#');
    boolean var49 = var45.valid_f((char)var48);
    java.lang.Character var50 = new java.lang.Character(':');
    boolean var51 = var45.valid_f((char)var50);
    java.lang.Character var52 = new java.lang.Character('2');
    boolean var53 = var45.valid_f((char)var52);
    java.lang.Character var54 = new java.lang.Character('v');
    boolean var55 = var45.valid_f((char)var54);
    java.lang.Character var56 = new java.lang.Character('4');
    boolean var57 = var45.valid_f((char)var56);
    java.lang.Character var58 = new java.lang.Character('e');
    boolean var59 = var45.valid_f((char)var58);
    java.lang.Character var60 = new java.lang.Character('0');
    boolean var61 = var45.valid_f((char)var60);
    java.lang.Character var62 = new java.lang.Character('1');
    boolean var63 = var45.valid_f((char)var62);
    ds.Identifier var64 = new ds.Identifier();
    java.lang.Character var65 = new java.lang.Character('f');
    boolean var66 = var64.valid_s((char)var65);
    java.lang.Character var67 = new java.lang.Character('#');
    boolean var68 = var64.valid_f((char)var67);
    java.lang.Character var69 = new java.lang.Character(':');
    boolean var70 = var64.valid_f((char)var69);
    java.lang.Character var71 = new java.lang.Character('2');
    boolean var72 = var64.valid_f((char)var71);
    java.lang.Character var73 = new java.lang.Character('v');
    boolean var74 = var64.valid_f((char)var73);
    java.lang.Character var75 = new java.lang.Character('4');
    boolean var76 = var64.valid_f((char)var75);
    java.lang.Character var77 = new java.lang.Character('8');
    boolean var78 = var64.valid_f((char)var77);
    boolean var79 = var45.valid_s((char)var77);
    boolean var80 = var0.valid_s((char)var77);
    
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
    assertTrue(var15 == false);
    
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
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
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
    assertTrue(var66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);

  }

  public void test155() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "N#:Tv eYLX[Mj~%*Zg-_p/W)z=^+{nfdh(Isc<a.G;}Kt?rJR@PDmbuykx>`E'FCiS|&B]wHU$VQOoql_!A\\\\\\\\\\\\\"";
    boolean var3 = var1.validateIdentifier(var2);
    boolean var4 = var0.validateIdentifier(var2);
    java.lang.Character var5 = new java.lang.Character('#');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character(':');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('T');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('7');
    boolean var12 = var0.valid_f((char)var11);
    ds.Identifier var13 = new ds.Identifier();
    java.lang.String var14 = "3652748019";
    boolean var15 = var13.validateIdentifier(var14);
    boolean var16 = var0.validateIdentifier(var14);
    ds.Identifier var17 = new ds.Identifier();
    ds.Identifier var18 = new ds.Identifier();
    java.lang.Character var19 = new java.lang.Character('3');
    boolean var20 = var18.valid_s((char)var19);
    java.lang.Character var21 = new java.lang.Character('6');
    boolean var22 = var18.valid_f((char)var21);
    boolean var23 = var17.valid_f((char)var21);
    ds.Identifier var24 = new ds.Identifier();
    java.lang.Character var25 = new java.lang.Character('f');
    boolean var26 = var24.valid_s((char)var25);
    java.lang.Character var27 = new java.lang.Character('#');
    boolean var28 = var24.valid_f((char)var27);
    java.lang.Character var29 = new java.lang.Character(':');
    boolean var30 = var24.valid_f((char)var29);
    java.lang.Character var31 = new java.lang.Character('2');
    boolean var32 = var24.valid_f((char)var31);
    java.lang.Character var33 = new java.lang.Character('v');
    boolean var34 = var24.valid_f((char)var33);
    java.lang.Character var35 = new java.lang.Character('4');
    boolean var36 = var24.valid_f((char)var35);
    java.lang.Character var37 = new java.lang.Character('8');
    boolean var38 = var24.valid_f((char)var37);
    java.lang.Character var39 = new java.lang.Character('Y');
    boolean var40 = var24.valid_f((char)var39);
    boolean var41 = var17.valid_s((char)var39);
    boolean var42 = var0.valid_s((char)var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
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

  }

  public void test156() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "3652748019";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('6');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('5');
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

}
