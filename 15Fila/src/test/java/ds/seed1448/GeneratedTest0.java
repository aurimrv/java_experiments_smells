package ds.seed1448;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed1448 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = var0.desenfileira();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test2() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    java.lang.Short var2 = new java.lang.Short((short)1);
    var0.enfileira((java.lang.Object)var2);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test3() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    java.lang.Short var2 = new java.lang.Short((short)1);
    var0.enfileira((java.lang.Object)var2);
    ds.Fila var4 = new ds.Fila();
    boolean var5 = var4.vazia();
    var0.enfileira((java.lang.Object)var4);
    ds.Fila var7 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test4() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.enfileira((java.lang.Object)var0);

  }

  public void test5() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var1 = var0.desenfileira();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    java.lang.Short var2 = new java.lang.Short((short)1);
    var0.enfileira((java.lang.Object)var2);
    ds.Fila var4 = new ds.Fila();
    boolean var5 = var4.vazia();
    var0.enfileira((java.lang.Object)var4);
    boolean var7 = var0.vazia();
    var4.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test7() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    java.lang.Short var2 = new java.lang.Short((short)1);
    var0.enfileira((java.lang.Object)var2);
    ds.Fila var4 = new ds.Fila();
    boolean var5 = var4.vazia();
    var0.enfileira((java.lang.Object)var4);
    boolean var7 = var0.vazia();
    boolean var8 = var0.vazia();
    var4.enfileira((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test8() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    java.lang.Short var2 = new java.lang.Short((short)1);
    var0.enfileira((java.lang.Object)var2);
    ds.Fila var4 = new ds.Fila();
    boolean var5 = var4.vazia();
    var0.enfileira((java.lang.Object)var4);
    boolean var7 = var0.vazia();
    boolean var8 = var0.vazia();
    boolean var9 = var0.vazia();
    ds.Fila var10 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test9() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    ds.Fila var2 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test10() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    java.lang.Double var2 = new java.lang.Double(10.0d);
    var0.enfileira((java.lang.Object)var2);
    boolean var4 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test11() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    java.lang.Double var2 = new java.lang.Double(10.0d);
    var0.enfileira((java.lang.Object)var2);
    java.lang.Character var4 = new java.lang.Character('4');
    var0.enfileira((java.lang.Object)var4);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test12() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    java.lang.Boolean var2 = new java.lang.Boolean(true);
    var0.enfileira((java.lang.Object)var2);
    boolean var4 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test13() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    java.lang.Boolean var2 = new java.lang.Boolean(true);
    var0.enfileira((java.lang.Object)var2);
    ds.Fila var4 = new ds.Fila();
    boolean var5 = var4.vazia();
    java.lang.Short var6 = new java.lang.Short((short)1);
    var4.enfileira((java.lang.Object)var6);
    ds.Fila var8 = new ds.Fila();
    boolean var9 = var8.vazia();
    var4.enfileira((java.lang.Object)var8);
    boolean var11 = var4.vazia();
    boolean var12 = var4.vazia();
    var0.enfileira((java.lang.Object)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var14 = var8.desenfileira();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test14() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    java.lang.Double var2 = new java.lang.Double(10.0d);
    var0.enfileira((java.lang.Object)var2);
    java.lang.Character var4 = new java.lang.Character('4');
    var0.enfileira((java.lang.Object)var4);
    boolean var6 = var0.vazia();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test15() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Boolean var1 = new java.lang.Boolean(true);
    var0.enfileira((java.lang.Object)var1);
    java.lang.Object var3 = var0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + true+ "'", var3.equals(true));

  }

  public void test16() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    java.lang.Boolean var2 = new java.lang.Boolean(true);
    var0.enfileira((java.lang.Object)var2);
    ds.Fila var4 = new ds.Fila();
    boolean var5 = var4.vazia();
    java.lang.Short var6 = new java.lang.Short((short)1);
    var4.enfileira((java.lang.Object)var6);
    ds.Fila var8 = new ds.Fila();
    boolean var9 = var8.vazia();
    var4.enfileira((java.lang.Object)var8);
    boolean var11 = var4.vazia();
    boolean var12 = var4.vazia();
    var0.enfileira((java.lang.Object)var4);
    java.lang.Object var14 = var4.desenfileira();
    var8.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + (short)1+ "'", var14.equals((short)1));

  }

  public void test17() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Integer var1 = new java.lang.Integer(10);
    var0.enfileira((java.lang.Object)var1);
    java.lang.Object var3 = var0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 10+ "'", var3.equals(10));

  }

  public void test18() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    java.lang.Short var3 = new java.lang.Short((short)1);
    var1.enfileira((java.lang.Object)var3);
    ds.Fila var5 = new ds.Fila();
    boolean var6 = var5.vazia();
    var1.enfileira((java.lang.Object)var5);
    boolean var8 = var1.vazia();
    var0.enfileira((java.lang.Object)var8);
    ds.Fila var10 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test19() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    java.lang.Boolean var2 = new java.lang.Boolean(true);
    var0.enfileira((java.lang.Object)var2);
    ds.Fila var4 = new ds.Fila();
    boolean var5 = var4.vazia();
    java.lang.Short var6 = new java.lang.Short((short)1);
    var4.enfileira((java.lang.Object)var6);
    ds.Fila var8 = new ds.Fila();
    boolean var9 = var8.vazia();
    var4.enfileira((java.lang.Object)var8);
    boolean var11 = var4.vazia();
    boolean var12 = var4.vazia();
    var0.enfileira((java.lang.Object)var4);
    java.lang.Object var14 = var4.desenfileira();
    boolean var15 = var4.vazia();
    var8.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + (short)1+ "'", var14.equals((short)1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test20() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    java.lang.Boolean var2 = new java.lang.Boolean(true);
    var0.enfileira((java.lang.Object)var2);
    ds.Fila var4 = new ds.Fila();
    boolean var5 = var4.vazia();
    java.lang.Short var6 = new java.lang.Short((short)1);
    var4.enfileira((java.lang.Object)var6);
    ds.Fila var8 = new ds.Fila();
    boolean var9 = var8.vazia();
    var4.enfileira((java.lang.Object)var8);
    boolean var11 = var4.vazia();
    boolean var12 = var4.vazia();
    var0.enfileira((java.lang.Object)var4);
    java.lang.Object var14 = var4.desenfileira();
    boolean var15 = var4.vazia();
    boolean var16 = var4.vazia();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var17 = var8.desenfileira();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + (short)1+ "'", var14.equals((short)1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test21() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    java.lang.Double var2 = new java.lang.Double(10.0d);
    var0.enfileira((java.lang.Object)var2);
    java.lang.Character var4 = new java.lang.Character('4');
    var0.enfileira((java.lang.Object)var4);
    boolean var6 = var0.vazia();
    boolean var7 = var0.vazia();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test22() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    java.lang.Double var2 = new java.lang.Double(10.0d);
    var0.enfileira((java.lang.Object)var2);
    java.lang.Character var4 = new java.lang.Character('4');
    var0.enfileira((java.lang.Object)var4);
    boolean var6 = var0.vazia();
    boolean var7 = var0.vazia();
    boolean var8 = var0.vazia();
    var0.enfileira((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test23() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    java.lang.Double var2 = new java.lang.Double(10.0d);
    var0.enfileira((java.lang.Object)var2);
    java.lang.Character var4 = new java.lang.Character('4');
    var0.enfileira((java.lang.Object)var4);
    boolean var6 = var0.vazia();
    boolean var7 = var0.vazia();
    boolean var8 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test24() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Integer var1 = new java.lang.Integer(10);
    var0.enfileira((java.lang.Object)var1);
    java.lang.Long var3 = new java.lang.Long(10L);
    var0.enfileira((java.lang.Object)var3);
    var0.imprime();
    boolean var6 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test25() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Integer var1 = new java.lang.Integer(10);
    var0.enfileira((java.lang.Object)var1);
    java.lang.Long var3 = new java.lang.Long(10L);
    var0.enfileira((java.lang.Object)var3);
    var0.imprime();
    boolean var6 = var0.vazia();
    var0.enfileira((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test26() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    java.lang.Short var3 = new java.lang.Short((short)1);
    var1.enfileira((java.lang.Object)var3);
    ds.Fila var5 = new ds.Fila();
    boolean var6 = var5.vazia();
    var1.enfileira((java.lang.Object)var5);
    boolean var8 = var1.vazia();
    var0.enfileira((java.lang.Object)var8);
    ds.Fila var10 = new ds.Fila();
    var0.enfileira((java.lang.Object)var10);
    var10.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var13 = var10.desenfileira();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test27() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    var1.imprime();

  }

  public void test28() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    java.lang.Short var3 = new java.lang.Short((short)1);
    var1.enfileira((java.lang.Object)var3);
    ds.Fila var5 = new ds.Fila();
    boolean var6 = var5.vazia();
    var1.enfileira((java.lang.Object)var5);
    boolean var8 = var1.vazia();
    var0.enfileira((java.lang.Object)var8);
    ds.Fila var10 = new ds.Fila();
    var0.enfileira((java.lang.Object)var10);
    var10.imprime();
    boolean var13 = var10.vazia();
    var10.enfileira((java.lang.Object)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test29() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Boolean var1 = new java.lang.Boolean(true);
    var0.enfileira((java.lang.Object)var1);
    java.lang.Character var3 = new java.lang.Character('a');
    var0.enfileira((java.lang.Object)var3);
    ds.Fila var5 = new ds.Fila();

  }

  public void test30() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Boolean var1 = new java.lang.Boolean(true);
    var0.enfileira((java.lang.Object)var1);
    java.lang.Character var3 = new java.lang.Character('a');
    var0.enfileira((java.lang.Object)var3);
    var0.imprime();
    java.lang.Object var6 = var0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + true+ "'", var6.equals(true));

  }

  public void test31() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Short var3 = new java.lang.Short((short)10);
    var0.enfileira((java.lang.Object)var3);
    ds.Fila var5 = new ds.Fila();

  }

  public void test32() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Short var3 = new java.lang.Short((short)10);
    var0.enfileira((java.lang.Object)var3);
    var0.imprime();
    ds.Fila var6 = new ds.Fila();

  }

  public void test33() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Character var1 = new java.lang.Character('4');
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();

  }

  public void test34() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Short var3 = new java.lang.Short((short)10);
    var0.enfileira((java.lang.Object)var3);
    var0.imprime();
    boolean var6 = var0.vazia();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var1.desenfileira();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test35() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    java.lang.Short var3 = new java.lang.Short((short)1);
    var1.enfileira((java.lang.Object)var3);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var6 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test36() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    java.lang.Short var3 = new java.lang.Short((short)1);
    var1.enfileira((java.lang.Object)var3);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var6 = new ds.Fila();
    var0.enfileira((java.lang.Object)var6);
    boolean var8 = var6.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test37() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Character var1 = new java.lang.Character('4');
    var0.enfileira((java.lang.Object)var1);
    java.lang.Boolean var3 = new java.lang.Boolean(true);
    var0.enfileira((java.lang.Object)var3);
    ds.Fila var5 = new ds.Fila();

  }

  public void test38() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    java.lang.String var2 = "hi!";
    var0.enfileira((java.lang.Object)var2);
    boolean var4 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test39() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    java.lang.Short var3 = new java.lang.Short((short)1);
    var1.enfileira((java.lang.Object)var3);
    var0.enfileira((java.lang.Object)var1);
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test40() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    java.lang.Boolean var3 = new java.lang.Boolean(true);
    var1.enfileira((java.lang.Object)var3);
    var0.enfileira((java.lang.Object)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test41() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    java.lang.Short var2 = new java.lang.Short((short)1);
    var0.enfileira((java.lang.Object)var2);
    ds.Fila var4 = new ds.Fila();
    java.lang.Boolean var5 = new java.lang.Boolean(true);
    var4.enfileira((java.lang.Object)var5);
    var0.enfileira((java.lang.Object)var5);
    java.lang.Object var8 = var0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (short)1+ "'", var8.equals((short)1));

  }

  public void test42() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.imprime();
    boolean var2 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test43() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Short var3 = new java.lang.Short((short)10);
    var0.enfileira((java.lang.Object)var3);
    var0.imprime();
    boolean var6 = var0.vazia();
    boolean var7 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test44() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Character var1 = new java.lang.Character('4');
    var0.enfileira((java.lang.Object)var1);
    java.lang.Boolean var3 = new java.lang.Boolean(true);
    var0.enfileira((java.lang.Object)var3);
    var0.imprime();

  }

  public void test45() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    java.lang.Short var3 = new java.lang.Short((short)1);
    var1.enfileira((java.lang.Object)var3);
    ds.Fila var5 = new ds.Fila();
    boolean var6 = var5.vazia();
    var1.enfileira((java.lang.Object)var5);
    boolean var8 = var1.vazia();
    var0.enfileira((java.lang.Object)var8);
    ds.Fila var10 = new ds.Fila();
    var0.enfileira((java.lang.Object)var10);
    var10.imprime();
    boolean var13 = var10.vazia();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var14 = var10.desenfileira();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test46() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    java.lang.Short var2 = new java.lang.Short((short)1);
    var0.enfileira((java.lang.Object)var2);
    ds.Fila var4 = new ds.Fila();
    boolean var5 = var4.vazia();
    var0.enfileira((java.lang.Object)var4);
    boolean var7 = var0.vazia();
    boolean var8 = var0.vazia();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test47() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    java.lang.Short var3 = new java.lang.Short((short)1);
    var1.enfileira((java.lang.Object)var3);
    ds.Fila var5 = new ds.Fila();
    boolean var6 = var5.vazia();
    var1.enfileira((java.lang.Object)var5);
    boolean var8 = var1.vazia();
    var0.enfileira((java.lang.Object)var8);
    ds.Fila var10 = new ds.Fila();
    var0.enfileira((java.lang.Object)var10);
    java.lang.Object var12 = var0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + false+ "'", var12.equals(false));

  }

  public void test48() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    var1.imprime();
    var1.imprime();
    var0.enfileira((java.lang.Object)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test49() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    ds.Fila var2 = new ds.Fila();
    java.lang.Integer var3 = new java.lang.Integer(10);
    var2.enfileira((java.lang.Object)var3);
    java.lang.Long var5 = new java.lang.Long(10L);
    var2.enfileira((java.lang.Object)var5);
    var0.enfileira((java.lang.Object)var2);
    boolean var8 = var2.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test50() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Boolean var1 = new java.lang.Boolean(true);
    var0.enfileira((java.lang.Object)var1);
    java.lang.Character var3 = new java.lang.Character('a');
    var0.enfileira((java.lang.Object)var3);
    var0.imprime();
    boolean var6 = var0.vazia();
    var0.imprime();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test51() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Integer var2 = new java.lang.Integer(10);
    var1.enfileira((java.lang.Object)var2);
    var0.enfileira((java.lang.Object)var2);

  }

  public void test52() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    ds.Fila var2 = new ds.Fila();
    java.lang.Integer var3 = new java.lang.Integer(10);
    var2.enfileira((java.lang.Object)var3);
    java.lang.Long var5 = new java.lang.Long(10L);
    var2.enfileira((java.lang.Object)var5);
    var0.enfileira((java.lang.Object)var2);
    var2.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test53() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Integer var1 = new java.lang.Integer(10);
    var0.enfileira((java.lang.Object)var1);
    java.lang.Long var3 = new java.lang.Long(10L);
    var0.enfileira((java.lang.Object)var3);
    var0.imprime();
    java.lang.Object var6 = var0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 10+ "'", var6.equals(10));

  }

  public void test54() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    ds.Fila var2 = new ds.Fila();
    boolean var3 = var2.vazia();
    java.lang.Short var4 = new java.lang.Short((short)1);
    var2.enfileira((java.lang.Object)var4);
    var1.enfileira((java.lang.Object)var2);
    ds.Fila var7 = new ds.Fila();
    var1.enfileira((java.lang.Object)var7);
    var0.enfileira((java.lang.Object)var7);
    boolean var10 = var7.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test55() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    java.lang.Short var2 = new java.lang.Short((short)1);
    var0.enfileira((java.lang.Object)var2);
    ds.Fila var4 = new ds.Fila();
    boolean var5 = var4.vazia();
    var0.enfileira((java.lang.Object)var4);
    boolean var7 = var0.vazia();
    boolean var8 = var0.vazia();
    java.lang.Object var9 = var0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + (short)1+ "'", var9.equals((short)1));

  }

  public void test56() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    java.lang.Short var3 = new java.lang.Short((short)1);
    var1.enfileira((java.lang.Object)var3);
    var0.enfileira((java.lang.Object)var1);
    java.lang.Object var6 = var1.desenfileira();
    ds.Fila var7 = new ds.Fila();
    boolean var8 = var7.vazia();
    java.lang.Short var9 = new java.lang.Short((short)1);
    var7.enfileira((java.lang.Object)var9);
    ds.Fila var11 = new ds.Fila();
    boolean var12 = var11.vazia();
    var7.enfileira((java.lang.Object)var11);
    var1.enfileira((java.lang.Object)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + (short)1+ "'", var6.equals((short)1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test57() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    java.lang.Boolean var2 = new java.lang.Boolean(true);
    var0.enfileira((java.lang.Object)var2);
    ds.Fila var4 = new ds.Fila();
    boolean var5 = var4.vazia();
    java.lang.Short var6 = new java.lang.Short((short)1);
    var4.enfileira((java.lang.Object)var6);
    ds.Fila var8 = new ds.Fila();
    boolean var9 = var8.vazia();
    var4.enfileira((java.lang.Object)var8);
    boolean var11 = var4.vazia();
    boolean var12 = var4.vazia();
    var0.enfileira((java.lang.Object)var4);
    java.lang.Object var14 = var4.desenfileira();
    var4.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + (short)1+ "'", var14.equals((short)1));

  }

  public void test58() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    java.lang.Float var2 = new java.lang.Float(10.0f);
    var0.enfileira((java.lang.Object)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test59() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    java.lang.Short var2 = new java.lang.Short((short)1);
    var0.enfileira((java.lang.Object)var2);
    ds.Fila var4 = new ds.Fila();
    boolean var5 = var4.vazia();
    var0.enfileira((java.lang.Object)var4);
    boolean var7 = var0.vazia();
    boolean var8 = var0.vazia();
    boolean var9 = var0.vazia();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test60() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Long var1 = new java.lang.Long((-1L));
    var0.enfileira((java.lang.Object)var1);

  }

  public void test61() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    var0.enfileira((java.lang.Object)var2);
    ds.Fila var4 = new ds.Fila();
    var4.imprime();
    var0.enfileira((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test62() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Object var3 = var0.desenfileira();

  }

  public void test63() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    java.lang.Short var3 = new java.lang.Short((short)1);
    var1.enfileira((java.lang.Object)var3);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var6 = new ds.Fila();
    var0.enfileira((java.lang.Object)var6);
    var0.imprime();
    ds.Fila var9 = new ds.Fila();
    java.lang.Boolean var10 = new java.lang.Boolean(true);
    var9.enfileira((java.lang.Object)var10);
    java.lang.Character var12 = new java.lang.Character('a');
    var9.enfileira((java.lang.Object)var12);
    var9.imprime();
    var0.enfileira((java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test64() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    java.lang.String var2 = "hi!";
    var0.enfileira((java.lang.Object)var2);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test65() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    ds.Fila var2 = new ds.Fila();
    boolean var3 = var2.vazia();
    java.lang.Short var4 = new java.lang.Short((short)1);
    var2.enfileira((java.lang.Object)var4);
    var1.enfileira((java.lang.Object)var2);
    var0.enfileira((java.lang.Object)var1);
    java.lang.Object var8 = var0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test66() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    java.lang.Boolean var3 = new java.lang.Boolean(true);
    var1.enfileira((java.lang.Object)var3);
    java.lang.Object var5 = var1.desenfileira();
    var0.enfileira(var5);
    java.lang.Long var7 = new java.lang.Long(100L);
    var0.enfileira((java.lang.Object)var7);
    ds.Fila var9 = new ds.Fila();
    ds.Fila var10 = new ds.Fila();
    var9.enfileira((java.lang.Object)var10);
    var0.enfileira((java.lang.Object)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + true+ "'", var5.equals(true));

  }

  public void test67() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    boolean var3 = var1.vazia();
    var1.imprime();
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test68() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    java.lang.Short var3 = new java.lang.Short((short)1);
    var1.enfileira((java.lang.Object)var3);
    var0.enfileira((java.lang.Object)var1);
    boolean var6 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test69() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Boolean var2 = new java.lang.Boolean(true);
    var1.enfileira((java.lang.Object)var2);
    var0.enfileira((java.lang.Object)var1);
    var1.imprime();

  }

  public void test70() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    java.lang.Boolean var3 = new java.lang.Boolean(true);
    var1.enfileira((java.lang.Object)var3);
    ds.Fila var5 = new ds.Fila();
    boolean var6 = var5.vazia();
    java.lang.Short var7 = new java.lang.Short((short)1);
    var5.enfileira((java.lang.Object)var7);
    ds.Fila var9 = new ds.Fila();
    boolean var10 = var9.vazia();
    var5.enfileira((java.lang.Object)var9);
    boolean var12 = var5.vazia();
    boolean var13 = var5.vazia();
    var1.enfileira((java.lang.Object)var5);
    java.lang.Object var15 = var5.desenfileira();
    boolean var16 = var5.vazia();
    boolean var17 = var5.vazia();
    var0.enfileira((java.lang.Object)var5);
    java.lang.Object var19 = new java.lang.Object();
    var5.enfileira(var19);
    boolean var21 = var5.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + (short)1+ "'", var15.equals((short)1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test71() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Short var3 = new java.lang.Short((short)10);
    var0.enfileira((java.lang.Object)var3);
    var0.imprime();
    java.lang.Object var6 = var0.desenfileira();

  }

  public void test72() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    java.lang.Short var3 = new java.lang.Short((short)1);
    var1.enfileira((java.lang.Object)var3);
    ds.Fila var5 = new ds.Fila();
    boolean var6 = var5.vazia();
    var1.enfileira((java.lang.Object)var5);
    boolean var8 = var1.vazia();
    boolean var9 = var1.vazia();
    var0.enfileira((java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test73() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    java.lang.String var2 = "hi!";
    var0.enfileira((java.lang.Object)var2);
    ds.Fila var4 = new ds.Fila();
    ds.Fila var5 = new ds.Fila();
    boolean var6 = var5.vazia();
    java.lang.Short var7 = new java.lang.Short((short)1);
    var5.enfileira((java.lang.Object)var7);
    var4.enfileira((java.lang.Object)var5);
    ds.Fila var10 = new ds.Fila();
    var4.enfileira((java.lang.Object)var10);
    var4.imprime();
    var0.enfileira((java.lang.Object)var4);
    java.lang.Character var14 = new java.lang.Character(' ');
    var0.enfileira((java.lang.Object)var14);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

}
