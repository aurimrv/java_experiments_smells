package ds.seed5838;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed5838 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

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

  public void test2() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test3() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    ds.Fila var3 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test4() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    boolean var3 = var0.vazia();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test5() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    boolean var3 = var0.vazia();
    boolean var4 = var0.vazia();
    var0.enfileira((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test6() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    boolean var3 = var0.vazia();
    boolean var4 = var0.vazia();
    java.lang.Short var5 = new java.lang.Short((short)10);
    var0.enfileira((java.lang.Object)var5);
    ds.Fila var7 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test7() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.enfileira((java.lang.Object)var0);

  }

  public void test8() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    boolean var3 = var0.vazia();
    boolean var4 = var0.vazia();
    java.lang.Short var5 = new java.lang.Short((short)10);
    var0.enfileira((java.lang.Object)var5);
    var0.imprime();
    boolean var8 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test9() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    boolean var3 = var0.vazia();
    boolean var4 = var0.vazia();
    java.lang.Short var5 = new java.lang.Short((short)10);
    var0.enfileira((java.lang.Object)var5);
    var0.imprime();
    boolean var8 = var0.vazia();
    ds.Fila var9 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test10() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Short var1 = new java.lang.Short((short)(-1));
    var0.enfileira((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test11() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    var0.enfileira((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test12() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    var0.enfileira((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test13() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.imprime();
    boolean var2 = var0.vazia();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var0.desenfileira();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test14() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Short var1 = new java.lang.Short((short)(-1));
    var0.enfileira((java.lang.Object)var1);
    java.lang.Integer var3 = new java.lang.Integer((-1));
    var0.enfileira((java.lang.Object)var3);
    var0.imprime();

  }

  public void test15() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.imprime();
    var0.enfileira((java.lang.Object)var0);

  }

  public void test16() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    boolean var3 = var0.vazia();
    ds.Fila var4 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test17() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = var0.desenfileira();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    boolean var3 = var0.vazia();
    boolean var4 = var0.vazia();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test19() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    boolean var3 = var0.vazia();
    boolean var4 = var0.vazia();
    ds.Fila var5 = new ds.Fila();
    boolean var6 = var5.vazia();
    boolean var7 = var5.vazia();
    var0.enfileira((java.lang.Object)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var5.desenfileira();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test20() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    boolean var3 = var0.vazia();
    boolean var4 = var0.vazia();
    ds.Fila var5 = new ds.Fila();
    boolean var6 = var5.vazia();
    boolean var7 = var5.vazia();
    var0.enfileira((java.lang.Object)var7);
    var0.imprime();
    var5.enfileira((java.lang.Object)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test21() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Short var1 = new java.lang.Short((short)(-1));
    var0.enfileira((java.lang.Object)var1);
    java.lang.Integer var3 = new java.lang.Integer((-1));
    var0.enfileira((java.lang.Object)var3);
    java.lang.Object var5 = var0.desenfileira();
    ds.Fila var6 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + (short)(-1)+ "'", var5.equals((short)(-1)));

  }

  public void test22() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    boolean var3 = var0.vazia();
    boolean var4 = var0.vazia();
    ds.Fila var5 = new ds.Fila();
    boolean var6 = var5.vazia();
    boolean var7 = var5.vazia();
    var0.enfileira((java.lang.Object)var7);
    var0.imprime();
    boolean var10 = var0.vazia();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var11 = var5.desenfileira();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test23() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.imprime();
    boolean var2 = var0.vazia();
    ds.Fila var3 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test24() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Short var1 = new java.lang.Short((short)(-1));
    var0.enfileira((java.lang.Object)var1);
    java.lang.Integer var3 = new java.lang.Integer((-1));
    var0.enfileira((java.lang.Object)var3);
    java.lang.Object var5 = var0.desenfileira();
    boolean var6 = var0.vazia();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + (short)(-1)+ "'", var5.equals((short)(-1)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test25() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Short var1 = new java.lang.Short((short)(-1));
    var0.enfileira((java.lang.Object)var1);
    java.lang.Integer var3 = new java.lang.Integer((-1));
    var0.enfileira((java.lang.Object)var3);
    java.lang.Object var5 = var0.desenfileira();
    boolean var6 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + (short)(-1)+ "'", var5.equals((short)(-1)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test26() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.String var1 = "hi!";
    var0.enfileira((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test27() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.String var1 = "hi!";
    var0.enfileira((java.lang.Object)var1);
    var0.imprime();
    java.lang.Object var4 = var0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));

  }

  public void test28() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.imprime();
    ds.Fila var2 = new ds.Fila();

  }

  public void test29() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    boolean var3 = var0.vazia();
    boolean var4 = var0.vazia();
    ds.Fila var5 = new ds.Fila();
    var0.enfileira((java.lang.Object)var5);
    boolean var7 = var5.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test30() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    boolean var3 = var1.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test31() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    boolean var3 = var0.vazia();
    boolean var4 = var0.vazia();
    ds.Fila var5 = new ds.Fila();
    var0.enfileira((java.lang.Object)var5);
    var0.imprime();
    ds.Fila var8 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test32() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Short var1 = new java.lang.Short((short)10);
    var0.enfileira((java.lang.Object)var1);
    java.lang.Object var3 = var0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + (short)10+ "'", var3.equals((short)10));

  }

  public void test33() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Short var1 = new java.lang.Short((short)10);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    boolean var4 = var3.vazia();
    boolean var5 = var3.vazia();
    boolean var6 = var3.vazia();
    var0.enfileira((java.lang.Object)var6);
    var3.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test34() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    boolean var3 = var0.vazia();
    boolean var4 = var0.vazia();
    ds.Fila var5 = new ds.Fila();
    var0.enfileira((java.lang.Object)var5);
    var0.imprime();
    boolean var8 = var0.vazia();
    ds.Fila var9 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test35() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    var1.enfileira((java.lang.Object)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var3.desenfileira();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test36() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    var1.enfileira((java.lang.Object)var3);
    boolean var5 = var1.vazia();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var3.desenfileira();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test37() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Short var1 = new java.lang.Short((short)10);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    boolean var4 = var3.vazia();
    boolean var5 = var3.vazia();
    boolean var6 = var3.vazia();
    var0.enfileira((java.lang.Object)var6);
    java.lang.Object var8 = var0.desenfileira();
    ds.Fila var9 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (short)10+ "'", var8.equals((short)10));

  }

  public void test38() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Short var1 = new java.lang.Short((short)10);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    boolean var4 = var3.vazia();
    boolean var5 = var3.vazia();
    boolean var6 = var3.vazia();
    var0.enfileira((java.lang.Object)var6);
    java.lang.Object var8 = var0.desenfileira();
    boolean var9 = var0.vazia();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var10 = var3.desenfileira();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (short)10+ "'", var8.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test39() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    ds.Fila var2 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test40() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var1.desenfileira();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test41() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var1.imprime();
    var0.enfileira((java.lang.Object)var1);
    var1.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var1.desenfileira();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test42() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    boolean var3 = var0.vazia();
    boolean var4 = var0.vazia();
    ds.Fila var5 = new ds.Fila();
    boolean var6 = var5.vazia();
    boolean var7 = var5.vazia();
    var0.enfileira((java.lang.Object)var7);
    var0.imprime();
    java.lang.Object var10 = var0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + true+ "'", var10.equals(true));

  }

  public void test43() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.imprime();
    boolean var2 = var0.vazia();
    ds.Fila var3 = new ds.Fila();
    var0.enfileira((java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test44() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    boolean var3 = var1.vazia();
    boolean var4 = var1.vazia();
    boolean var5 = var1.vazia();
    var0.enfileira((java.lang.Object)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test45() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var1.imprime();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Object var4 = var0.desenfileira();

  }

  public void test46() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    var1.enfileira((java.lang.Object)var3);
    boolean var5 = var3.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test47() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var0.desenfileira();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test48() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    boolean var3 = var0.vazia();
    boolean var4 = var0.vazia();
    java.lang.Short var5 = new java.lang.Short((short)10);
    var0.enfileira((java.lang.Object)var5);
    java.lang.Object var7 = var0.desenfileira();
    boolean var8 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (short)10+ "'", var7.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test49() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    var1.enfileira((java.lang.Object)var3);
    boolean var5 = var1.vazia();
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test50() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.String var1 = "hi!";
    var0.enfileira((java.lang.Object)var1);
    var0.imprime();
    boolean var4 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test51() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.imprime();
    var0.imprime();
    var0.imprime();

  }

  public void test52() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    boolean var3 = var0.vazia();
    boolean var4 = var0.vazia();
    java.lang.Short var5 = new java.lang.Short((short)10);
    var0.enfileira((java.lang.Object)var5);
    java.lang.Object var7 = var0.desenfileira();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (short)10+ "'", var7.equals((short)10));

  }

  public void test53() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.imprime();
    boolean var2 = var0.vazia();
    var0.imprime();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test54() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Short var1 = new java.lang.Short((short)10);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    boolean var4 = var3.vazia();
    boolean var5 = var3.vazia();
    boolean var6 = var3.vazia();
    var0.enfileira((java.lang.Object)var6);
    boolean var8 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test55() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Short var1 = new java.lang.Short((short)(-1));
    var0.enfileira((java.lang.Object)var1);
    java.lang.Integer var3 = new java.lang.Integer((-1));
    var0.enfileira((java.lang.Object)var3);
    java.lang.Object var5 = var0.desenfileira();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + (short)(-1)+ "'", var5.equals((short)(-1)));

  }

  public void test56() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Float var1 = new java.lang.Float(1.0f);
    var0.enfileira((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test57() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Short var1 = new java.lang.Short((short)10);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    boolean var4 = var3.vazia();
    boolean var5 = var3.vazia();
    boolean var6 = var3.vazia();
    var0.enfileira((java.lang.Object)var6);
    java.lang.Object var8 = var0.desenfileira();
    ds.Fila var9 = new ds.Fila();
    var9.imprime();
    boolean var11 = var9.vazia();
    boolean var12 = var9.vazia();
    var0.enfileira((java.lang.Object)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (short)10+ "'", var8.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test58() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    ds.Fila var2 = new ds.Fila();
    java.lang.Short var3 = new java.lang.Short((short)(-1));
    var2.enfileira((java.lang.Object)var3);
    var0.enfileira((java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test59() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    var1.enfileira((java.lang.Object)var3);
    java.lang.Object var5 = var1.desenfileira();

  }

  public void test60() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Byte var1 = new java.lang.Byte((byte)0);
    var0.enfileira((java.lang.Object)var1);

  }

  public void test61() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    boolean var3 = var1.vazia();
    boolean var4 = var1.vazia();
    boolean var5 = var1.vazia();
    ds.Fila var6 = new ds.Fila();
    var1.enfileira((java.lang.Object)var6);
    java.lang.Object var8 = new java.lang.Object();
    var1.enfileira(var8);
    var0.enfileira(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test62() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.imprime();
    ds.Fila var2 = new ds.Fila();
    ds.Fila var3 = new ds.Fila();
    var3.imprime();
    var2.enfileira((java.lang.Object)var3);
    var3.imprime();
    var0.enfileira((java.lang.Object)var3);

  }

  public void test63() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Short var1 = new java.lang.Short((short)10);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    boolean var4 = var3.vazia();
    boolean var5 = var3.vazia();
    boolean var6 = var3.vazia();
    var0.enfileira((java.lang.Object)var6);
    java.lang.Object var8 = var0.desenfileira();
    boolean var9 = var0.vazia();
    var0.imprime();
    boolean var11 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (short)10+ "'", var8.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test64() throws Throwable {

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

  public void test65() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    boolean var3 = var0.vazia();
    boolean var4 = var0.vazia();
    ds.Fila var5 = new ds.Fila();
    var0.enfileira((java.lang.Object)var5);
    var0.imprime();
    java.lang.Object var8 = var0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test66() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    boolean var3 = var0.vazia();
    boolean var4 = var0.vazia();
    ds.Fila var5 = new ds.Fila();
    var0.enfileira((java.lang.Object)var5);
    var0.imprime();
    boolean var8 = var0.vazia();
    boolean var9 = var0.vazia();
    ds.Fila var10 = new ds.Fila();
    var10.imprime();
    boolean var12 = var10.vazia();
    boolean var13 = var10.vazia();
    var0.enfileira((java.lang.Object)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test67() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    boolean var3 = var0.vazia();
    java.lang.Object var4 = new java.lang.Object();
    var0.enfileira(var4);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test68() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Short var1 = new java.lang.Short((short)10);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    boolean var4 = var3.vazia();
    boolean var5 = var3.vazia();
    boolean var6 = var3.vazia();
    var0.enfileira((java.lang.Object)var6);
    java.lang.Object var8 = var0.desenfileira();
    boolean var9 = var0.vazia();
    java.lang.Object var10 = var0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (short)10+ "'", var8.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + true+ "'", var10.equals(true));

  }

  public void test69() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Short var1 = new java.lang.Short((short)10);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    boolean var4 = var3.vazia();
    boolean var5 = var3.vazia();
    boolean var6 = var3.vazia();
    var0.enfileira((java.lang.Object)var6);
    java.lang.Object var8 = var0.desenfileira();
    boolean var9 = var0.vazia();
    boolean var10 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (short)10+ "'", var8.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test70() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var1.imprime();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Double var4 = new java.lang.Double((-1.0d));
    var1.enfileira((java.lang.Object)var4);

  }

  public void test71() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var1.imprime();
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var4 = new ds.Fila();
    ds.Fila var5 = new ds.Fila();
    boolean var6 = var5.vazia();
    boolean var7 = var5.vazia();
    boolean var8 = var5.vazia();
    boolean var9 = var5.vazia();
    ds.Fila var10 = new ds.Fila();
    boolean var11 = var10.vazia();
    boolean var12 = var10.vazia();
    var5.enfileira((java.lang.Object)var12);
    var5.imprime();
    boolean var15 = var5.vazia();
    var4.enfileira((java.lang.Object)var5);
    var1.enfileira((java.lang.Object)var5);
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test72() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.imprime();
    boolean var2 = var0.vazia();
    var0.imprime();
    ds.Fila var4 = new ds.Fila();
    var4.imprime();
    boolean var6 = var4.vazia();
    boolean var7 = var4.vazia();
    var0.enfileira((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test73() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Short var1 = new java.lang.Short((short)10);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    boolean var4 = var3.vazia();
    boolean var5 = var3.vazia();
    boolean var6 = var3.vazia();
    var0.enfileira((java.lang.Object)var6);
    java.lang.Object var8 = var0.desenfileira();
    boolean var9 = var0.vazia();
    ds.Fila var10 = new ds.Fila();
    var0.enfileira((java.lang.Object)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var12 = var10.desenfileira();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (short)10+ "'", var8.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test74() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.imprime();
    boolean var2 = var0.vazia();
    var0.imprime();
    java.lang.Integer var4 = new java.lang.Integer(100);
    var0.enfileira((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test75() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test76() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    boolean var3 = var0.vazia();
    boolean var4 = var0.vazia();
    ds.Fila var5 = new ds.Fila();
    var0.enfileira((java.lang.Object)var5);
    var0.imprime();
    boolean var8 = var0.vazia();
    ds.Fila var9 = new ds.Fila();
    ds.Fila var10 = new ds.Fila();
    ds.Fila var11 = new ds.Fila();
    var11.imprime();
    var10.enfileira((java.lang.Object)var11);
    var11.imprime();
    var9.enfileira((java.lang.Object)var11);
    var0.enfileira((java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

}
