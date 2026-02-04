package ds.seed9121;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed9121 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "hi!";
    boolean var2 = var0.validateIdentifier(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test2() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "df0j";
    boolean var2 = var0.validateIdentifier(var1);
    ds.Identifier var3 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test3() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "df0j";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('G');
    boolean var4 = var0.valid_f((char)var3);
    boolean var5 = var0.valid_s((char)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test4() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "df0j";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('G');
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

  public void test5() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "df0j";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('G');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('H');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('M');
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

  public void test6() throws Throwable {

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

  public void test7() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "df0j";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('G');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('H');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('M');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character(']');
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
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test8() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('#');
    boolean var2 = var0.valid_f((char)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test9() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "df0j";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('G');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('H');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('M');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character(']');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('0');
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
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test10() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "@";
    boolean var2 = var0.validateIdentifier(var1);
    ds.Identifier var3 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test11() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var2 = var0.validateIdentifier(var1);
    ds.Identifier var3 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test12() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "df0j";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('G');
    boolean var5 = var1.valid_f((char)var4);
    boolean var6 = var0.valid_s((char)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test13() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "@";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('G');
    boolean var4 = var0.valid_f((char)var3);
    boolean var5 = var0.valid_s((char)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test14() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('G');
    boolean var4 = var0.valid_f((char)var3);
    boolean var5 = var0.validateIdentifier(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test15() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "df0j";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('G');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('H');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('M');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character(']');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('0');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('v');
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
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test16() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "df0j";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('G');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('H');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('M');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character(']');
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
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test17() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('#');
    boolean var2 = var0.valid_s((char)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test18() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "df0j";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('G');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('H');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('M');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character(']');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('0');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('v');
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
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test19() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "@";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('G');
    boolean var5 = var1.valid_f((char)var4);
    boolean var6 = var0.valid_s((char)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test20() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('G');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('H');
    boolean var6 = var0.valid_f((char)var5);
    ds.Identifier var7 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test21() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "df0j";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('G');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('H');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('M');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character(']');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('0');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('v');
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
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test22() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "df0j";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('G');
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

  public void test23() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "df0j";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('G');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('H');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('M');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character(']');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('0');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('v');
    boolean var15 = var1.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('X');
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
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test24() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('G');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('H');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('M');
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

  public void test25() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "df0j";
    boolean var2 = var0.validateIdentifier(var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.String var4 = "@";
    boolean var5 = var3.validateIdentifier(var4);
    java.lang.Character var6 = new java.lang.Character('G');
    boolean var7 = var3.valid_f((char)var6);
    boolean var8 = var0.valid_s((char)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test26() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('G');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('H');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('M');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character(']');
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
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test27() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('G');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('H');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('M');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character(']');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('0');
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
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test28() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('4');
    boolean var2 = var0.valid_s((char)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test29() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('G');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('H');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('M');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character(']');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('0');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('v');
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
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test30() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('G');
    boolean var5 = var1.valid_f((char)var4);
    boolean var6 = var0.valid_f((char)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test31() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var2 = var0.validateIdentifier(var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.String var4 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var5 = var3.validateIdentifier(var4);
    java.lang.Character var6 = new java.lang.Character('G');
    boolean var7 = var3.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('H');
    boolean var9 = var3.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('M');
    boolean var11 = var3.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character(']');
    boolean var13 = var3.valid_f((char)var12);
    boolean var14 = var0.valid_s((char)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
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

  public void test32() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "@";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('G');
    boolean var5 = var1.valid_f((char)var4);
    boolean var6 = var0.valid_f((char)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test33() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "df0j";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('G');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('H');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('M');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character(']');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('0');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('v');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('X');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('g');
    boolean var18 = var0.valid_f((char)var17);
    boolean var19 = var0.validateIdentifier(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
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

  public void test34() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "df0j";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('G');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('H');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('M');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character(']');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('0');
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
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test35() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('G');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('H');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('M');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character(']');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('0');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('v');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('X');
    boolean var16 = var0.valid_f((char)var15);
    boolean var17 = var0.validateIdentifier(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test36() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('G');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('H');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('M');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character(']');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('0');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('v');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('X');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('g');
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
    assertTrue(var10 == false);
    
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

  public void test37() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "df0j";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('G');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('H');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('M');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character(']');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('0');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('v');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('X');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('g');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('_');
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
    assertTrue(var10 == false);
    
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
    assertTrue(var21 == false);

  }

  public void test38() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('G');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('H');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('M');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character(']');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('0');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('v');
    boolean var15 = var1.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('X');
    boolean var17 = var1.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('g');
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
    assertTrue(var11 == false);
    
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

  public void test39() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var2 = var0.validateIdentifier(var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.String var4 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var5 = var3.validateIdentifier(var4);
    java.lang.Character var6 = new java.lang.Character('G');
    boolean var7 = var3.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('H');
    boolean var9 = var3.valid_f((char)var8);
    boolean var10 = var0.valid_f((char)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test40() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('G');
    boolean var5 = var1.valid_f((char)var4);
    boolean var6 = var0.valid_s((char)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test41() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('G');
    boolean var4 = var0.valid_f((char)var3);
    boolean var5 = var0.valid_s((char)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test42() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('a');
    boolean var2 = var0.valid_f((char)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test43() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "df0j";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('G');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('H');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('M');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character(']');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('0');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('v');
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
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test44() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('G');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('H');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('M');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character(']');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('0');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('v');
    boolean var15 = var1.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('X');
    boolean var17 = var1.valid_f((char)var16);
    boolean var18 = var0.valid_f((char)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test45() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('G');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('H');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('M');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character(']');
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
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test46() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('G');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('H');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('M');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character(']');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('0');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('v');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('X');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('g');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('_');
    boolean var20 = var0.valid_f((char)var19);
    boolean var21 = var0.validateIdentifier(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
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
    assertTrue(var21 == false);

  }

  public void test47() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('b');
    boolean var2 = var0.valid_s((char)var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.String var4 = "df0j";
    boolean var5 = var3.validateIdentifier(var4);
    boolean var6 = var0.validateIdentifier(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test48() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "df0j";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('G');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('H');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('M');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character(']');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('0');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('v');
    boolean var15 = var1.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('X');
    boolean var17 = var1.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('g');
    boolean var19 = var1.valid_f((char)var18);
    boolean var20 = var0.valid_s((char)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
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

  public void test49() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('G');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('H');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('M');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character(']');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('0');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('v');
    boolean var15 = var1.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('X');
    boolean var17 = var1.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('g');
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
    assertTrue(var11 == false);
    
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

  public void test50() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('G');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('H');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('M');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character(']');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('0');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('v');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('X');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('g');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('_');
    boolean var20 = var0.valid_f((char)var19);
    java.lang.Character var21 = new java.lang.Character('S');
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
    assertTrue(var10 == false);
    
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

  }

  public void test51() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('b');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('D');
    boolean var4 = var0.valid_f((char)var3);
    ds.Identifier var5 = new ds.Identifier();
    java.lang.String var6 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
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

  public void test52() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('G');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('H');
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

  public void test53() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "df0j";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('G');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('H');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('M');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character(']');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('0');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('v');
    boolean var15 = var1.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('X');
    boolean var17 = var1.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('g');
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
    assertTrue(var11 == false);
    
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

  public void test54() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('G');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('H');
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

  public void test55() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('G');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('H');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('M');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character(']');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('0');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('v');
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
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test56() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('G');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('H');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('M');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character(']');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('0');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('v');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('X');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('g');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('_');
    boolean var20 = var0.valid_f((char)var19);
    java.lang.Character var21 = new java.lang.Character('S');
    boolean var22 = var0.valid_f((char)var21);
    java.lang.Character var23 = new java.lang.Character('#');
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
    assertTrue(var10 == false);
    
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
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test57() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('|');
    boolean var2 = var0.valid_s((char)var1);
    ds.Identifier var3 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test58() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('|');
    boolean var3 = var1.valid_s((char)var2);
    boolean var4 = var0.valid_s((char)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test59() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('b');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('D');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('[');
    boolean var6 = var0.valid_f((char)var5);
    boolean var7 = var0.valid_s((char)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test60() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('G');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('H');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('M');
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

  public void test61() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('|');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('o');
    boolean var4 = var0.valid_f((char)var3);
    ds.Identifier var5 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test62() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "df0j";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('G');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('H');
    boolean var6 = var0.valid_f((char)var5);
    boolean var7 = var0.validateIdentifier(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test63() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('b');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('D');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('[');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('_');
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

  public void test64() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "df0j";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('G');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('H');
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

  public void test65() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "df0j";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('G');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('H');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('M');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character(']');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('0');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('v');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('X');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('g');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('_');
    boolean var20 = var0.valid_f((char)var19);
    java.lang.Character var21 = new java.lang.Character('S');
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
    assertTrue(var10 == false);
    
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

  }

  public void test66() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "@";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('G');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('H');
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

  public void test67() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('G');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('H');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('M');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character(']');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('0');
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
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test68() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('b');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('D');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('[');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('_');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('F');
    boolean var10 = var0.valid_f((char)var9);
    ds.Identifier var11 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test69() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('G');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('H');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('M');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character(']');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('0');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('v');
    boolean var15 = var1.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('X');
    boolean var17 = var1.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('g');
    boolean var19 = var1.valid_f((char)var18);
    java.lang.Character var20 = new java.lang.Character('_');
    boolean var21 = var1.valid_f((char)var20);
    java.lang.Character var22 = new java.lang.Character('S');
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
    assertTrue(var11 == false);
    
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
    assertTrue(var24 == true);

  }

  public void test70() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('@');
    boolean var2 = var0.valid_s((char)var1);
    boolean var3 = var0.valid_f((char)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test71() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('|');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('o');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('6');
    boolean var6 = var0.valid_f((char)var5);
    ds.Identifier var7 = new ds.Identifier();
    java.lang.String var8 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var9 = var7.validateIdentifier(var8);
    boolean var10 = var0.validateIdentifier(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test72() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('|');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('o');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('6');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('_');
    boolean var8 = var0.valid_f((char)var7);
    ds.Identifier var9 = new ds.Identifier();
    java.lang.String var10 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var11 = var9.validateIdentifier(var10);
    boolean var12 = var0.validateIdentifier(var10);
    
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
    assertTrue(var12 == false);

  }

  public void test73() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('|');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('o');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('6');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('_');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('2');
    boolean var10 = var0.valid_f((char)var9);
    ds.Identifier var11 = new ds.Identifier();
    java.lang.String var12 = "df0j";
    boolean var13 = var11.validateIdentifier(var12);
    boolean var14 = var0.validateIdentifier(var12);
    
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
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test74() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('|');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('o');
    boolean var5 = var1.valid_f((char)var4);
    boolean var6 = var0.valid_s((char)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test75() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('@');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('f');
    boolean var4 = var0.valid_f((char)var3);
    ds.Identifier var5 = new ds.Identifier();
    java.lang.String var6 = "df0j";
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

  public void test76() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('@');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('f');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('[');
    boolean var6 = var0.valid_f((char)var5);
    boolean var7 = var0.valid_s((char)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test77() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('|');
    boolean var2 = var0.valid_s((char)var1);
    ds.Identifier var3 = new ds.Identifier();
    java.lang.String var4 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var5 = var3.validateIdentifier(var4);
    boolean var6 = var0.validateIdentifier(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test78() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "df0j";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('G');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('H');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('M');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character(']');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('0');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('v');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('X');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('g');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('_');
    boolean var20 = var0.valid_f((char)var19);
    java.lang.Character var21 = new java.lang.Character('S');
    boolean var22 = var0.valid_f((char)var21);
    java.lang.Character var23 = new java.lang.Character('#');
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
    assertTrue(var10 == false);
    
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
    assertTrue(var24 == false);

  }

  public void test79() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "df0j";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('G');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('H');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('M');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character(']');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('0');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('v');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('X');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('g');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('_');
    boolean var20 = var0.valid_f((char)var19);
    java.lang.Character var21 = new java.lang.Character('S');
    boolean var22 = var0.valid_f((char)var21);
    java.lang.Character var23 = new java.lang.Character('#');
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
    assertTrue(var10 == false);
    
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
    assertTrue(var24 == false);

  }

  public void test80() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('|');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('o');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('6');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('_');
    boolean var9 = var1.valid_f((char)var8);
    boolean var10 = var0.valid_s((char)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test81() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('|');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('D');
    boolean var4 = var0.valid_f((char)var3);
    ds.Identifier var5 = new ds.Identifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test82() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('G');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('H');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('M');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character(']');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('0');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('v');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('X');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('g');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('_');
    boolean var20 = var0.valid_f((char)var19);
    java.lang.Character var21 = new java.lang.Character('S');
    boolean var22 = var0.valid_f((char)var21);
    java.lang.Character var23 = new java.lang.Character('#');
    boolean var24 = var0.valid_f((char)var23);
    java.lang.Character var25 = new java.lang.Character('d');
    boolean var26 = var0.valid_f((char)var25);
    boolean var27 = var0.validateIdentifier(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
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
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test83() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('G');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('H');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('M');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character(']');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('0');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('v');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('X');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('g');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('_');
    boolean var20 = var0.valid_f((char)var19);
    java.lang.Character var21 = new java.lang.Character('S');
    boolean var22 = var0.valid_f((char)var21);
    java.lang.Character var23 = new java.lang.Character('#');
    boolean var24 = var0.valid_f((char)var23);
    java.lang.Character var25 = new java.lang.Character('d');
    boolean var26 = var0.valid_f((char)var25);
    java.lang.Character var27 = new java.lang.Character('k');
    boolean var28 = var0.valid_f((char)var27);
    boolean var29 = var0.valid_s((char)var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
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
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);

  }

  public void test84() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('G');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('H');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('M');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character(']');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('0');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('v');
    boolean var15 = var1.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('X');
    boolean var17 = var1.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('g');
    boolean var19 = var1.valid_f((char)var18);
    java.lang.Character var20 = new java.lang.Character('_');
    boolean var21 = var1.valid_f((char)var20);
    boolean var22 = var0.valid_f((char)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
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
    assertTrue(var22 == false);

  }

  public void test85() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('G');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('H');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('M');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character(']');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('0');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('v');
    boolean var15 = var1.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('X');
    boolean var17 = var1.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('g');
    boolean var19 = var1.valid_f((char)var18);
    java.lang.Character var20 = new java.lang.Character('_');
    boolean var21 = var1.valid_f((char)var20);
    java.lang.Character var22 = new java.lang.Character('S');
    boolean var23 = var1.valid_f((char)var22);
    java.lang.Character var24 = new java.lang.Character('#');
    boolean var25 = var1.valid_f((char)var24);
    java.lang.Character var26 = new java.lang.Character('d');
    boolean var27 = var1.valid_f((char)var26);
    java.lang.Character var28 = new java.lang.Character('k');
    boolean var29 = var1.valid_f((char)var28);
    boolean var30 = var0.valid_s((char)var28);
    ds.Identifier var31 = new ds.Identifier();
    java.lang.String var32 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var33 = var31.validateIdentifier(var32);
    java.lang.Character var34 = new java.lang.Character('G');
    boolean var35 = var31.valid_f((char)var34);
    boolean var36 = var0.valid_f((char)var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
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
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);

  }

  public void test86() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('G');
    boolean var4 = var0.valid_f((char)var3);
    ds.Identifier var5 = new ds.Identifier();
    java.lang.Character var6 = new java.lang.Character('b');
    boolean var7 = var5.valid_s((char)var6);
    java.lang.Character var8 = new java.lang.Character('D');
    boolean var9 = var5.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('[');
    boolean var11 = var5.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('_');
    boolean var13 = var5.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('F');
    boolean var15 = var5.valid_f((char)var14);
    boolean var16 = var0.valid_f((char)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test87() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('G');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('H');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('M');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character(']');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('0');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('v');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('X');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('g');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('_');
    boolean var20 = var0.valid_f((char)var19);
    java.lang.Character var21 = new java.lang.Character('S');
    boolean var22 = var0.valid_f((char)var21);
    java.lang.Character var23 = new java.lang.Character('#');
    boolean var24 = var0.valid_f((char)var23);
    ds.Identifier var25 = new ds.Identifier();
    java.lang.Character var26 = new java.lang.Character('|');
    boolean var27 = var25.valid_s((char)var26);
    java.lang.Character var28 = new java.lang.Character('o');
    boolean var29 = var25.valid_f((char)var28);
    java.lang.Character var30 = new java.lang.Character('6');
    boolean var31 = var25.valid_f((char)var30);
    java.lang.Character var32 = new java.lang.Character('_');
    boolean var33 = var25.valid_f((char)var32);
    java.lang.Character var34 = new java.lang.Character('2');
    boolean var35 = var25.valid_f((char)var34);
    ds.Identifier var36 = new ds.Identifier();
    java.lang.String var37 = "df0j";
    boolean var38 = var36.validateIdentifier(var37);
    java.lang.Character var39 = new java.lang.Character('G');
    boolean var40 = var36.valid_f((char)var39);
    java.lang.Character var41 = new java.lang.Character('H');
    boolean var42 = var36.valid_f((char)var41);
    java.lang.Character var43 = new java.lang.Character('M');
    boolean var44 = var36.valid_f((char)var43);
    ds.Identifier var45 = new ds.Identifier();
    java.lang.String var46 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var47 = var45.validateIdentifier(var46);
    boolean var48 = var36.validateIdentifier(var46);
    boolean var49 = var25.validateIdentifier(var46);
    boolean var50 = var0.validateIdentifier(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
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
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);

  }

  public void test88() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('|');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('D');
    boolean var5 = var1.valid_f((char)var4);
    boolean var6 = var0.valid_f((char)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test89() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('G');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('H');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('M');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character(']');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('0');
    boolean var12 = var0.valid_f((char)var11);
    ds.Identifier var13 = new ds.Identifier();
    java.lang.String var14 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var15 = var13.validateIdentifier(var14);
    java.lang.Character var16 = new java.lang.Character('G');
    boolean var17 = var13.valid_f((char)var16);
    boolean var18 = var0.valid_f((char)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
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

  }

  public void test90() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('@');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('f');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('[');
    boolean var6 = var0.valid_f((char)var5);
    ds.Identifier var7 = new ds.Identifier();
    ds.Identifier var8 = new ds.Identifier();
    ds.Identifier var9 = new ds.Identifier();
    java.lang.String var10 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var11 = var9.validateIdentifier(var10);
    boolean var12 = var8.validateIdentifier(var10);
    boolean var13 = var7.validateIdentifier(var10);
    ds.Identifier var14 = new ds.Identifier();
    java.lang.String var15 = "@";
    boolean var16 = var14.validateIdentifier(var15);
    java.lang.Character var17 = new java.lang.Character('G');
    boolean var18 = var14.valid_f((char)var17);
    boolean var19 = var7.valid_s((char)var17);
    boolean var20 = var0.valid_f((char)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test91() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "df0j";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('G');
    boolean var4 = var0.valid_f((char)var3);
    ds.Identifier var5 = new ds.Identifier();
    java.lang.String var6 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var7 = var5.validateIdentifier(var6);
    java.lang.Character var8 = new java.lang.Character('G');
    boolean var9 = var5.valid_f((char)var8);
    boolean var10 = var0.valid_s((char)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test92() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    ds.Identifier var2 = new ds.Identifier();
    java.lang.String var3 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var4 = var2.validateIdentifier(var3);
    boolean var5 = var1.validateIdentifier(var3);
    boolean var6 = var0.validateIdentifier(var3);
    ds.Identifier var7 = new ds.Identifier();
    java.lang.String var8 = "@";
    boolean var9 = var7.validateIdentifier(var8);
    java.lang.Character var10 = new java.lang.Character('G');
    boolean var11 = var7.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('H');
    boolean var13 = var7.valid_f((char)var12);
    boolean var14 = var0.valid_s((char)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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
    assertTrue(var14 == true);

  }

  public void test93() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('|');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('o');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('6');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('_');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('2');
    boolean var10 = var0.valid_f((char)var9);
    ds.Identifier var11 = new ds.Identifier();
    java.lang.String var12 = "df0j";
    boolean var13 = var11.validateIdentifier(var12);
    java.lang.Character var14 = new java.lang.Character('G');
    boolean var15 = var11.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('H');
    boolean var17 = var11.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('M');
    boolean var19 = var11.valid_f((char)var18);
    java.lang.Character var20 = new java.lang.Character(']');
    boolean var21 = var11.valid_f((char)var20);
    java.lang.Character var22 = new java.lang.Character('0');
    boolean var23 = var11.valid_f((char)var22);
    java.lang.Character var24 = new java.lang.Character('v');
    boolean var25 = var11.valid_f((char)var24);
    boolean var26 = var0.valid_s((char)var24);
    
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
    assertTrue(var26 == true);

  }

  public void test94() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "df0j";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('G');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('H');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('M');
    boolean var8 = var0.valid_f((char)var7);
    ds.Identifier var9 = new ds.Identifier();
    java.lang.String var10 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var11 = var9.validateIdentifier(var10);
    boolean var12 = var0.validateIdentifier(var10);
    ds.Identifier var13 = new ds.Identifier();
    java.lang.String var14 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var15 = var13.validateIdentifier(var14);
    java.lang.Character var16 = new java.lang.Character('G');
    boolean var17 = var13.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('H');
    boolean var19 = var13.valid_f((char)var18);
    java.lang.Character var20 = new java.lang.Character('M');
    boolean var21 = var13.valid_f((char)var20);
    java.lang.Character var22 = new java.lang.Character(']');
    boolean var23 = var13.valid_f((char)var22);
    java.lang.Character var24 = new java.lang.Character('0');
    boolean var25 = var13.valid_f((char)var24);
    java.lang.Character var26 = new java.lang.Character('v');
    boolean var27 = var13.valid_f((char)var26);
    java.lang.Character var28 = new java.lang.Character('X');
    boolean var29 = var13.valid_f((char)var28);
    java.lang.Character var30 = new java.lang.Character('g');
    boolean var31 = var13.valid_f((char)var30);
    java.lang.Character var32 = new java.lang.Character('_');
    boolean var33 = var13.valid_f((char)var32);
    java.lang.Character var34 = new java.lang.Character('S');
    boolean var35 = var13.valid_f((char)var34);
    java.lang.Character var36 = new java.lang.Character('#');
    boolean var37 = var13.valid_f((char)var36);
    java.lang.Character var38 = new java.lang.Character('d');
    boolean var39 = var13.valid_f((char)var38);
    java.lang.Character var40 = new java.lang.Character('k');
    boolean var41 = var13.valid_f((char)var40);
    boolean var42 = var0.valid_f((char)var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
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

  }

  public void test95() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('b');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('D');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('[');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('_');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('F');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('#');
    boolean var12 = var0.valid_s((char)var11);
    ds.Identifier var13 = new ds.Identifier();
    java.lang.String var14 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var15 = var13.validateIdentifier(var14);
    java.lang.Character var16 = new java.lang.Character('G');
    boolean var17 = var13.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('H');
    boolean var19 = var13.valid_f((char)var18);
    java.lang.Character var20 = new java.lang.Character('M');
    boolean var21 = var13.valid_f((char)var20);
    boolean var22 = var0.valid_s((char)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
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

  public void test96() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('G');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('H');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('M');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character(']');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('0');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('v');
    boolean var15 = var1.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('X');
    boolean var17 = var1.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('g');
    boolean var19 = var1.valid_f((char)var18);
    java.lang.Character var20 = new java.lang.Character('_');
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
    assertTrue(var11 == false);
    
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
    assertTrue(var22 == false);

  }

  public void test97() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "df0j";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('G');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('H');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('M');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character(']');
    boolean var11 = var1.valid_f((char)var10);
    java.lang.Character var12 = new java.lang.Character('0');
    boolean var13 = var1.valid_f((char)var12);
    java.lang.Character var14 = new java.lang.Character('v');
    boolean var15 = var1.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('X');
    boolean var17 = var1.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('g');
    boolean var19 = var1.valid_f((char)var18);
    java.lang.Character var20 = new java.lang.Character('_');
    boolean var21 = var1.valid_f((char)var20);
    boolean var22 = var0.valid_f((char)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
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
    assertTrue(var22 == false);

  }

  public void test98() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('G');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('H');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('M');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character(']');
    boolean var10 = var0.valid_f((char)var9);
    ds.Identifier var11 = new ds.Identifier();
    java.lang.String var12 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var13 = var11.validateIdentifier(var12);
    java.lang.Character var14 = new java.lang.Character('G');
    boolean var15 = var11.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('H');
    boolean var17 = var11.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('M');
    boolean var19 = var11.valid_f((char)var18);
    java.lang.Character var20 = new java.lang.Character(']');
    boolean var21 = var11.valid_f((char)var20);
    java.lang.Character var22 = new java.lang.Character('0');
    boolean var23 = var11.valid_f((char)var22);
    boolean var24 = var0.valid_s((char)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
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
    assertTrue(var24 == false);

  }

  public void test99() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('G');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('H');
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

  public void test100() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('|');
    boolean var3 = var1.valid_s((char)var2);
    java.lang.Character var4 = new java.lang.Character('o');
    boolean var5 = var1.valid_f((char)var4);
    java.lang.Character var6 = new java.lang.Character('6');
    boolean var7 = var1.valid_f((char)var6);
    java.lang.Character var8 = new java.lang.Character('_');
    boolean var9 = var1.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('2');
    boolean var11 = var1.valid_f((char)var10);
    ds.Identifier var12 = new ds.Identifier();
    java.lang.String var13 = "df0j";
    boolean var14 = var12.validateIdentifier(var13);
    java.lang.Character var15 = new java.lang.Character('G');
    boolean var16 = var12.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('H');
    boolean var18 = var12.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('M');
    boolean var20 = var12.valid_f((char)var19);
    ds.Identifier var21 = new ds.Identifier();
    java.lang.String var22 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var23 = var21.validateIdentifier(var22);
    boolean var24 = var12.validateIdentifier(var22);
    boolean var25 = var1.validateIdentifier(var22);
    boolean var26 = var0.validateIdentifier(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
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
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test101() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "df0j";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('G');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('H');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('M');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character(']');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('0');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('v');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('X');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('g');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('_');
    boolean var20 = var0.valid_f((char)var19);
    java.lang.Character var21 = new java.lang.Character('S');
    boolean var22 = var0.valid_f((char)var21);
    ds.Identifier var23 = new ds.Identifier();
    java.lang.String var24 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
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
    assertTrue(var10 == false);
    
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
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test102() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('@');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('f');
    boolean var4 = var0.valid_f((char)var3);
    ds.Identifier var5 = new ds.Identifier();
    ds.Identifier var6 = new ds.Identifier();
    ds.Identifier var7 = new ds.Identifier();
    java.lang.String var8 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var9 = var7.validateIdentifier(var8);
    boolean var10 = var6.validateIdentifier(var8);
    boolean var11 = var5.validateIdentifier(var8);
    boolean var12 = var0.validateIdentifier(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test103() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('|');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('o');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('6');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('_');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('2');
    boolean var10 = var0.valid_f((char)var9);
    ds.Identifier var11 = new ds.Identifier();
    java.lang.String var12 = "@";
    boolean var13 = var11.validateIdentifier(var12);
    ds.Identifier var14 = new ds.Identifier();
    ds.Identifier var15 = new ds.Identifier();
    java.lang.String var16 = "df0j";
    boolean var17 = var15.validateIdentifier(var16);
    java.lang.Character var18 = new java.lang.Character('G');
    boolean var19 = var15.valid_f((char)var18);
    boolean var20 = var14.valid_f((char)var18);
    boolean var21 = var11.valid_f((char)var18);
    boolean var22 = var0.valid_f((char)var18);
    
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
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);

  }

  public void test104() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('|');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('o');
    boolean var4 = var0.valid_f((char)var3);
    ds.Identifier var5 = new ds.Identifier();
    java.lang.String var6 = "df0j";
    boolean var7 = var5.validateIdentifier(var6);
    java.lang.Character var8 = new java.lang.Character('G');
    boolean var9 = var5.valid_f((char)var8);
    java.lang.Character var10 = new java.lang.Character('H');
    boolean var11 = var5.valid_f((char)var10);
    boolean var12 = var0.valid_f((char)var10);
    
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
    assertTrue(var12 == true);

  }

  public void test105() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "df0j";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('G');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('H');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('M');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character(']');
    boolean var10 = var0.valid_f((char)var9);
    ds.Identifier var11 = new ds.Identifier();
    java.lang.Character var12 = new java.lang.Character('|');
    boolean var13 = var11.valid_s((char)var12);
    java.lang.Character var14 = new java.lang.Character('o');
    boolean var15 = var11.valid_f((char)var14);
    boolean var16 = var0.valid_s((char)var14);
    ds.Identifier var17 = new ds.Identifier();
    java.lang.Character var18 = new java.lang.Character('@');
    boolean var19 = var17.valid_s((char)var18);
    java.lang.Character var20 = new java.lang.Character('f');
    boolean var21 = var17.valid_f((char)var20);
    java.lang.Character var22 = new java.lang.Character('[');
    boolean var23 = var17.valid_f((char)var22);
    ds.Identifier var24 = new ds.Identifier();
    ds.Identifier var25 = new ds.Identifier();
    ds.Identifier var26 = new ds.Identifier();
    java.lang.String var27 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var28 = var26.validateIdentifier(var27);
    boolean var29 = var25.validateIdentifier(var27);
    boolean var30 = var24.validateIdentifier(var27);
    boolean var31 = var17.validateIdentifier(var27);
    boolean var32 = var0.validateIdentifier(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test106() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "@";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('G');
    boolean var5 = var1.valid_f((char)var4);
    ds.Identifier var6 = new ds.Identifier();
    java.lang.String var7 = "@";
    boolean var8 = var6.validateIdentifier(var7);
    boolean var9 = var1.validateIdentifier(var7);
    boolean var10 = var0.validateIdentifier(var7);
    ds.Identifier var11 = new ds.Identifier();
    java.lang.String var12 = "df0j";
    boolean var13 = var11.validateIdentifier(var12);
    java.lang.Character var14 = new java.lang.Character('G');
    boolean var15 = var11.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('H');
    boolean var17 = var11.valid_f((char)var16);
    boolean var18 = var0.valid_f((char)var16);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test107() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    ds.Identifier var2 = new ds.Identifier();
    java.lang.String var3 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var4 = var2.validateIdentifier(var3);
    java.lang.Character var5 = new java.lang.Character('G');
    boolean var6 = var2.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('H');
    boolean var8 = var2.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('M');
    boolean var10 = var2.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character(']');
    boolean var12 = var2.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('0');
    boolean var14 = var2.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('v');
    boolean var16 = var2.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('X');
    boolean var18 = var2.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('g');
    boolean var20 = var2.valid_f((char)var19);
    java.lang.Character var21 = new java.lang.Character('_');
    boolean var22 = var2.valid_f((char)var21);
    java.lang.Character var23 = new java.lang.Character('S');
    boolean var24 = var2.valid_f((char)var23);
    java.lang.Character var25 = new java.lang.Character('#');
    boolean var26 = var2.valid_f((char)var25);
    boolean var27 = var1.valid_s((char)var25);
    boolean var28 = var0.valid_s((char)var25);
    ds.Identifier var29 = new ds.Identifier();
    java.lang.Character var30 = new java.lang.Character('@');
    boolean var31 = var29.valid_s((char)var30);
    java.lang.Character var32 = new java.lang.Character('f');
    boolean var33 = var29.valid_f((char)var32);
    java.lang.Character var34 = new java.lang.Character('[');
    boolean var35 = var29.valid_f((char)var34);
    ds.Identifier var36 = new ds.Identifier();
    ds.Identifier var37 = new ds.Identifier();
    ds.Identifier var38 = new ds.Identifier();
    java.lang.String var39 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var40 = var38.validateIdentifier(var39);
    boolean var41 = var37.validateIdentifier(var39);
    boolean var42 = var36.validateIdentifier(var39);
    boolean var43 = var29.validateIdentifier(var39);
    boolean var44 = var0.validateIdentifier(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);

  }

  public void test108() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    ds.Identifier var2 = new ds.Identifier();
    java.lang.String var3 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var4 = var2.validateIdentifier(var3);
    boolean var5 = var1.validateIdentifier(var3);
    boolean var6 = var0.validateIdentifier(var3);
    ds.Identifier var7 = new ds.Identifier();
    ds.Identifier var8 = new ds.Identifier();
    ds.Identifier var9 = new ds.Identifier();
    java.lang.String var10 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var11 = var9.validateIdentifier(var10);
    boolean var12 = var8.validateIdentifier(var10);
    boolean var13 = var7.validateIdentifier(var10);
    ds.Identifier var14 = new ds.Identifier();
    java.lang.String var15 = "@";
    boolean var16 = var14.validateIdentifier(var15);
    java.lang.Character var17 = new java.lang.Character('G');
    boolean var18 = var14.valid_f((char)var17);
    boolean var19 = var7.valid_s((char)var17);
    boolean var20 = var0.valid_s((char)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test109() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.Character var1 = new java.lang.Character('b');
    boolean var2 = var0.valid_s((char)var1);
    java.lang.Character var3 = new java.lang.Character('D');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('[');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('_');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character('F');
    boolean var10 = var0.valid_f((char)var9);
    ds.Identifier var11 = new ds.Identifier();
    java.lang.String var12 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var13 = var11.validateIdentifier(var12);
    java.lang.Character var14 = new java.lang.Character('G');
    boolean var15 = var11.valid_f((char)var14);
    java.lang.Character var16 = new java.lang.Character('H');
    boolean var17 = var11.valid_f((char)var16);
    java.lang.Character var18 = new java.lang.Character('M');
    boolean var19 = var11.valid_f((char)var18);
    java.lang.Character var20 = new java.lang.Character(']');
    boolean var21 = var11.valid_f((char)var20);
    java.lang.Character var22 = new java.lang.Character('0');
    boolean var23 = var11.valid_f((char)var22);
    java.lang.Character var24 = new java.lang.Character('v');
    boolean var25 = var11.valid_f((char)var24);
    java.lang.Character var26 = new java.lang.Character('X');
    boolean var27 = var11.valid_f((char)var26);
    java.lang.Character var28 = new java.lang.Character('g');
    boolean var29 = var11.valid_f((char)var28);
    java.lang.Character var30 = new java.lang.Character('_');
    boolean var31 = var11.valid_f((char)var30);
    java.lang.Character var32 = new java.lang.Character('S');
    boolean var33 = var11.valid_f((char)var32);
    java.lang.Character var34 = new java.lang.Character('#');
    boolean var35 = var11.valid_f((char)var34);
    boolean var36 = var0.valid_s((char)var34);
    ds.Identifier var37 = new ds.Identifier();
    java.lang.String var38 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var39 = var37.validateIdentifier(var38);
    java.lang.Character var40 = new java.lang.Character('G');
    boolean var41 = var37.valid_f((char)var40);
    boolean var42 = var0.valid_s((char)var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
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
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);

  }

  public void test110() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "df0j";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('G');
    boolean var4 = var0.valid_f((char)var3);
    ds.Identifier var5 = new ds.Identifier();
    ds.Identifier var6 = new ds.Identifier();
    java.lang.String var7 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var8 = var6.validateIdentifier(var7);
    boolean var9 = var5.validateIdentifier(var7);
    boolean var10 = var0.validateIdentifier(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test111() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "df0j";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('G');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('H');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('M');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character(']');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('0');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('v');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('X');
    boolean var16 = var0.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('g');
    boolean var18 = var0.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('_');
    boolean var20 = var0.valid_f((char)var19);
    java.lang.Character var21 = new java.lang.Character('S');
    boolean var22 = var0.valid_f((char)var21);
    ds.Identifier var23 = new ds.Identifier();
    java.lang.Character var24 = new java.lang.Character('|');
    boolean var25 = var23.valid_s((char)var24);
    java.lang.Character var26 = new java.lang.Character('o');
    boolean var27 = var23.valid_f((char)var26);
    java.lang.Character var28 = new java.lang.Character('6');
    boolean var29 = var23.valid_f((char)var28);
    java.lang.Character var30 = new java.lang.Character('_');
    boolean var31 = var23.valid_f((char)var30);
    boolean var32 = var0.valid_f((char)var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
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
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test112() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "df0j";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('G');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('H');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('M');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character(']');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('0');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('v');
    boolean var14 = var0.valid_f((char)var13);
    ds.Identifier var15 = new ds.Identifier();
    ds.Identifier var16 = new ds.Identifier();
    java.lang.String var17 = "@";
    boolean var18 = var16.validateIdentifier(var17);
    boolean var19 = var15.validateIdentifier(var17);
    ds.Identifier var20 = new ds.Identifier();
    java.lang.String var21 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var22 = var20.validateIdentifier(var21);
    java.lang.Character var23 = new java.lang.Character('G');
    boolean var24 = var20.valid_f((char)var23);
    boolean var25 = var15.valid_f((char)var23);
    boolean var26 = var0.valid_f((char)var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);

  }

  public void test113() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('G');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('H');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('M');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character(']');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('0');
    boolean var12 = var0.valid_f((char)var11);
    java.lang.Character var13 = new java.lang.Character('v');
    boolean var14 = var0.valid_f((char)var13);
    java.lang.Character var15 = new java.lang.Character('X');
    boolean var16 = var0.valid_f((char)var15);
    ds.Identifier var17 = new ds.Identifier();
    ds.Identifier var18 = new ds.Identifier();
    ds.Identifier var19 = new ds.Identifier();
    java.lang.String var20 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var21 = var19.validateIdentifier(var20);
    boolean var22 = var18.validateIdentifier(var20);
    boolean var23 = var17.validateIdentifier(var20);
    boolean var24 = var0.validateIdentifier(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test114() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "df0j";
    boolean var3 = var1.validateIdentifier(var2);
    java.lang.Character var4 = new java.lang.Character('G');
    boolean var5 = var1.valid_f((char)var4);
    boolean var6 = var0.valid_f((char)var4);
    ds.Identifier var7 = new ds.Identifier();
    ds.Identifier var8 = new ds.Identifier();
    java.lang.String var9 = "@";
    boolean var10 = var8.validateIdentifier(var9);
    boolean var11 = var7.validateIdentifier(var9);
    boolean var12 = var0.validateIdentifier(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test115() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('G');
    boolean var4 = var0.valid_f((char)var3);
    java.lang.Character var5 = new java.lang.Character('H');
    boolean var6 = var0.valid_f((char)var5);
    java.lang.Character var7 = new java.lang.Character('M');
    boolean var8 = var0.valid_f((char)var7);
    java.lang.Character var9 = new java.lang.Character(']');
    boolean var10 = var0.valid_f((char)var9);
    java.lang.Character var11 = new java.lang.Character('0');
    boolean var12 = var0.valid_f((char)var11);
    ds.Identifier var13 = new ds.Identifier();
    java.lang.Character var14 = new java.lang.Character('@');
    boolean var15 = var13.valid_s((char)var14);
    ds.Identifier var16 = new ds.Identifier();
    java.lang.String var17 = "@";
    boolean var18 = var16.validateIdentifier(var17);
    boolean var19 = var13.validateIdentifier(var17);
    boolean var20 = var0.validateIdentifier(var17);
    ds.Identifier var21 = new ds.Identifier();
    java.lang.String var22 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var23 = var21.validateIdentifier(var22);
    java.lang.Character var24 = new java.lang.Character('G');
    boolean var25 = var21.valid_f((char)var24);
    boolean var26 = var0.valid_f((char)var24);
    ds.Identifier var27 = new ds.Identifier();
    java.lang.Character var28 = new java.lang.Character('4');
    boolean var29 = var27.valid_f((char)var28);
    boolean var30 = var0.valid_s((char)var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
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
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test116() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    java.lang.String var1 = "df0j";
    boolean var2 = var0.validateIdentifier(var1);
    java.lang.Character var3 = new java.lang.Character('G');
    boolean var4 = var0.valid_f((char)var3);
    ds.Identifier var5 = new ds.Identifier();
    java.lang.String var6 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
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

  public void test117() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.Character var2 = new java.lang.Character('@');
    boolean var3 = var1.valid_s((char)var2);
    ds.Identifier var4 = new ds.Identifier();
    java.lang.String var5 = "@";
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

  public void test118() throws Throwable {

    ds.Identifier var0 = new ds.Identifier();
    ds.Identifier var1 = new ds.Identifier();
    java.lang.String var2 = "|D6_FbI[+R5w3 V^scJQ4=`iYATpZ-?GHM]0vXg_S#dkq;h(@Wx!f7~jm$.o2yraCzUn}9EPK*8)<L%BelO/>N':t1u&{\\\\\\\\\\\\\"";
    boolean var3 = var1.validateIdentifier(var2);
    boolean var4 = var0.validateIdentifier(var2);
    ds.Identifier var5 = new ds.Identifier();
    ds.Identifier var6 = new ds.Identifier();
    ds.Identifier var7 = new ds.Identifier();
    java.lang.String var8 = "df0j";
    boolean var9 = var7.validateIdentifier(var8);
    boolean var10 = var6.validateIdentifier(var8);
    boolean var11 = var5.validateIdentifier(var8);
    ds.Identifier var12 = new ds.Identifier();
    java.lang.String var13 = "df0j";
    boolean var14 = var12.validateIdentifier(var13);
    java.lang.Character var15 = new java.lang.Character('G');
    boolean var16 = var12.valid_f((char)var15);
    java.lang.Character var17 = new java.lang.Character('H');
    boolean var18 = var12.valid_f((char)var17);
    java.lang.Character var19 = new java.lang.Character('M');
    boolean var20 = var12.valid_f((char)var19);
    java.lang.Character var21 = new java.lang.Character(']');
    boolean var22 = var12.valid_f((char)var21);
    boolean var23 = var5.valid_s((char)var21);
    boolean var24 = var0.valid_s((char)var21);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

}
