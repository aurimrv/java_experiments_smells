package ds.seed9121;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed9121 in this file.
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
    java.lang.Byte var1 = new java.lang.Byte((byte)1);
    var0.enfileira((java.lang.Object)var1);
    var0.imprime();

  }

  public void test3() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Byte var1 = new java.lang.Byte((byte)1);
    var0.enfileira((java.lang.Object)var1);
    java.lang.Integer var3 = new java.lang.Integer(1);
    var0.enfileira((java.lang.Object)var3);
    java.lang.Object var5 = var0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + (byte)1+ "'", var5.equals((byte)1));

  }

  public void test4() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Boolean var1 = new java.lang.Boolean(true);
    var0.enfileira((java.lang.Object)var1);
    var0.imprime();

  }

  public void test5() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.enfileira((java.lang.Object)var0);

  }

  public void test6() throws Throwable {

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

  public void test7() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Byte var1 = new java.lang.Byte((byte)1);
    var0.enfileira((java.lang.Object)var1);
    java.lang.Integer var3 = new java.lang.Integer(1);
    var0.enfileira((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    var0.enfileira((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test8() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Byte var1 = new java.lang.Byte((byte)1);
    var0.enfileira((java.lang.Object)var1);
    java.lang.Integer var3 = new java.lang.Integer(1);
    var0.enfileira((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    boolean var6 = var0.vazia();
    ds.Fila var7 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test9() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Boolean var1 = new java.lang.Boolean(true);
    var0.enfileira((java.lang.Object)var1);
    java.lang.Double var3 = new java.lang.Double(0.0d);
    var0.enfileira((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test10() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Byte var1 = new java.lang.Byte((byte)1);
    var0.enfileira((java.lang.Object)var1);
    java.lang.Integer var3 = new java.lang.Integer(1);
    var0.enfileira((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    boolean var6 = var0.vazia();
    boolean var7 = var0.vazia();
    var0.enfileira((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

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
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test13() throws Throwable {

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

  public void test14() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.imprime();
    boolean var2 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test15() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    boolean var3 = var0.vazia();
    var0.imprime();
    var0.enfileira((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test16() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.imprime();
    var0.enfileira((java.lang.Object)var0);

  }

  public void test17() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Boolean var1 = new java.lang.Boolean(true);
    var0.enfileira((java.lang.Object)var1);
    java.lang.Double var3 = new java.lang.Double(0.0d);
    var0.enfileira((java.lang.Object)var3);
    java.lang.Object var5 = var0.desenfileira();
    boolean var6 = var0.vazia();
    java.lang.Object var7 = var0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + true+ "'", var5.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 0.0d+ "'", var7.equals(0.0d));

  }

  public void test18() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Boolean var1 = new java.lang.Boolean(true);
    var0.enfileira((java.lang.Object)var1);
    java.lang.Double var3 = new java.lang.Double(0.0d);
    var0.enfileira((java.lang.Object)var3);
    java.lang.Object var5 = var0.desenfileira();
    boolean var6 = var0.vazia();
    boolean var7 = var0.vazia();
    var0.enfileira(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + true+ "'", var5.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test19() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Boolean var1 = new java.lang.Boolean(true);
    var0.enfileira((java.lang.Object)var1);
    java.lang.Double var3 = new java.lang.Double(0.0d);
    var0.enfileira((java.lang.Object)var3);
    java.lang.Object var5 = var0.desenfileira();
    boolean var6 = var0.vazia();
    boolean var7 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + true+ "'", var5.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test20() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Boolean var2 = new java.lang.Boolean(true);
    var1.enfileira((java.lang.Object)var2);
    java.lang.Double var4 = new java.lang.Double(0.0d);
    var1.enfileira((java.lang.Object)var4);
    java.lang.Object var6 = var1.desenfileira();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Character var8 = new java.lang.Character('a');
    var1.enfileira((java.lang.Object)var8);
    boolean var10 = var1.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + true+ "'", var6.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test21() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Boolean var2 = new java.lang.Boolean(true);
    var1.enfileira((java.lang.Object)var2);
    java.lang.Double var4 = new java.lang.Double(0.0d);
    var1.enfileira((java.lang.Object)var4);
    java.lang.Object var6 = var1.desenfileira();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Character var8 = new java.lang.Character('a');
    var1.enfileira((java.lang.Object)var8);
    java.lang.Object var10 = var1.desenfileira();
    ds.Fila var11 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + true+ "'", var6.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + 0.0d+ "'", var10.equals(0.0d));

  }

  public void test22() throws Throwable {

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

  public void test23() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    ds.Fila var3 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test24() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    boolean var3 = var0.vazia();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var0.desenfileira();
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

  }

  public void test25() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    ds.Fila var2 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test26() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();

  }

  public void test27() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    java.lang.Byte var4 = new java.lang.Byte((byte)1);
    var3.enfileira((java.lang.Object)var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    var3.enfileira((java.lang.Object)var6);
    boolean var8 = var3.vazia();
    var0.enfileira((java.lang.Object)var8);
    ds.Fila var10 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test28() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    java.lang.Byte var4 = new java.lang.Byte((byte)1);
    var3.enfileira((java.lang.Object)var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    var3.enfileira((java.lang.Object)var6);
    boolean var8 = var3.vazia();
    var0.enfileira((java.lang.Object)var8);
    boolean var10 = var0.vazia();
    java.lang.Object var11 = var3.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + (byte)1+ "'", var11.equals((byte)1));

  }

  public void test29() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    var0.enfileira((java.lang.Object)var1);
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test30() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var4 = new ds.Fila();
    var1.enfileira((java.lang.Object)var4);
    ds.Fila var6 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test31() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var4 = new ds.Fila();
    var1.enfileira((java.lang.Object)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var4.desenfileira();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test32() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var4 = new ds.Fila();
    var1.enfileira((java.lang.Object)var4);
    boolean var6 = var1.vazia();
    var4.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test33() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var4 = new ds.Fila();
    var1.enfileira((java.lang.Object)var4);
    boolean var6 = var1.vazia();
    boolean var7 = var1.vazia();
    var4.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test34() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Boolean var2 = new java.lang.Boolean(true);
    var1.enfileira((java.lang.Object)var2);
    java.lang.Double var4 = new java.lang.Double(0.0d);
    var1.enfileira((java.lang.Object)var4);
    java.lang.Object var6 = var1.desenfileira();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Character var8 = new java.lang.Character('a');
    var1.enfileira((java.lang.Object)var8);
    java.lang.Object var10 = var1.desenfileira();
    boolean var11 = var1.vazia();
    boolean var12 = var1.vazia();
    var1.enfileira(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + true+ "'", var6.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + 0.0d+ "'", var10.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test35() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    java.lang.Byte var4 = new java.lang.Byte((byte)1);
    var3.enfileira((java.lang.Object)var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    var3.enfileira((java.lang.Object)var6);
    boolean var8 = var3.vazia();
    var0.enfileira((java.lang.Object)var8);
    boolean var10 = var0.vazia();
    java.lang.Object var11 = var0.desenfileira();
    var3.enfileira(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test36() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var4 = new ds.Fila();
    var1.enfileira((java.lang.Object)var4);
    boolean var6 = var1.vazia();
    boolean var7 = var1.vazia();
    boolean var8 = var1.vazia();
    var4.enfileira((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test37() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    boolean var3 = var0.vazia();
    var0.imprime();
    boolean var5 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test38() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Boolean var1 = new java.lang.Boolean(true);
    var0.enfileira((java.lang.Object)var1);
    java.lang.Double var3 = new java.lang.Double(0.0d);
    var0.enfileira((java.lang.Object)var3);
    var0.imprime();

  }

  public void test39() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Byte var1 = new java.lang.Byte((byte)1);
    var0.enfileira((java.lang.Object)var1);
    java.lang.Integer var3 = new java.lang.Integer(1);
    var0.enfileira((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    boolean var6 = var0.vazia();
    ds.Fila var7 = new ds.Fila();
    ds.Fila var8 = new ds.Fila();
    var7.enfileira((java.lang.Object)var8);
    ds.Fila var10 = new ds.Fila();
    java.lang.Byte var11 = new java.lang.Byte((byte)1);
    var10.enfileira((java.lang.Object)var11);
    java.lang.Integer var13 = new java.lang.Integer(1);
    var10.enfileira((java.lang.Object)var13);
    boolean var15 = var10.vazia();
    var7.enfileira((java.lang.Object)var15);
    var0.enfileira((java.lang.Object)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test40() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    boolean var3 = var0.vazia();
    boolean var4 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test41() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    var0.enfileira((java.lang.Object)var1);
    boolean var4 = var1.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test42() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Boolean var2 = new java.lang.Boolean(true);
    var1.enfileira((java.lang.Object)var2);
    java.lang.Double var4 = new java.lang.Double(0.0d);
    var1.enfileira((java.lang.Object)var4);
    java.lang.Object var6 = var1.desenfileira();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Character var8 = new java.lang.Character('a');
    var1.enfileira((java.lang.Object)var8);
    java.lang.Object var10 = var1.desenfileira();
    boolean var11 = var1.vazia();
    boolean var12 = var1.vazia();
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + true+ "'", var6.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + 0.0d+ "'", var10.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test43() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    ds.Fila var2 = new ds.Fila();
    java.lang.Boolean var3 = new java.lang.Boolean(true);
    var2.enfileira((java.lang.Object)var3);
    java.lang.Double var5 = new java.lang.Double(0.0d);
    var2.enfileira((java.lang.Object)var5);
    java.lang.Object var7 = var2.desenfileira();
    var1.enfileira((java.lang.Object)var2);
    java.lang.Character var9 = new java.lang.Character('a');
    var2.enfileira((java.lang.Object)var9);
    java.lang.Object var11 = var2.desenfileira();
    boolean var12 = var2.vazia();
    java.lang.Object var13 = var2.desenfileira();
    var0.enfileira((java.lang.Object)var2);
    boolean var15 = var2.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + true+ "'", var7.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 0.0d+ "'", var11.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + 'a'+ "'", var13.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test44() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Byte var2 = new java.lang.Byte((byte)1);
    var1.enfileira((java.lang.Object)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    var1.enfileira((java.lang.Object)var4);
    boolean var6 = var1.vazia();
    boolean var7 = var1.vazia();
    boolean var8 = var1.vazia();
    var0.enfileira((java.lang.Object)var1);
    boolean var10 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test45() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Boolean var2 = new java.lang.Boolean(true);
    var1.enfileira((java.lang.Object)var2);
    java.lang.Double var4 = new java.lang.Double(0.0d);
    var1.enfileira((java.lang.Object)var4);
    java.lang.Object var6 = var1.desenfileira();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Object var8 = var1.desenfileira();
    boolean var9 = var1.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + true+ "'", var6.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 0.0d+ "'", var8.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test46() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Double var1 = new java.lang.Double(1.0d);
    var0.enfileira((java.lang.Object)var1);
    var0.imprime();

  }

  public void test47() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Byte var1 = new java.lang.Byte((byte)1);
    var0.enfileira((java.lang.Object)var1);
    java.lang.Integer var3 = new java.lang.Integer(1);
    var0.enfileira((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    ds.Fila var6 = new ds.Fila();
    var0.enfileira((java.lang.Object)var6);
    boolean var8 = var6.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test48() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    ds.Fila var3 = new ds.Fila();
    ds.Fila var4 = new ds.Fila();
    java.lang.Boolean var5 = new java.lang.Boolean(true);
    var4.enfileira((java.lang.Object)var5);
    java.lang.Double var7 = new java.lang.Double(0.0d);
    var4.enfileira((java.lang.Object)var7);
    java.lang.Object var9 = var4.desenfileira();
    var3.enfileira((java.lang.Object)var4);
    java.lang.Character var11 = new java.lang.Character('a');
    var4.enfileira((java.lang.Object)var11);
    java.lang.Object var13 = var4.desenfileira();
    boolean var14 = var4.vazia();
    boolean var15 = var4.vazia();
    var0.enfileira((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + true+ "'", var9.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + 0.0d+ "'", var13.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test49() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    var1.imprime();

  }

  public void test50() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    ds.Fila var2 = new ds.Fila();
    java.lang.Boolean var3 = new java.lang.Boolean(true);
    var2.enfileira((java.lang.Object)var3);
    java.lang.Double var5 = new java.lang.Double(0.0d);
    var2.enfileira((java.lang.Object)var5);
    java.lang.Object var7 = var2.desenfileira();
    var1.enfileira((java.lang.Object)var2);
    java.lang.Character var9 = new java.lang.Character('a');
    var2.enfileira((java.lang.Object)var9);
    java.lang.Object var11 = var2.desenfileira();
    boolean var12 = var2.vazia();
    boolean var13 = var2.vazia();
    var0.enfileira((java.lang.Object)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + true+ "'", var7.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 0.0d+ "'", var11.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test51() throws Throwable {

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

  public void test52() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    ds.Fila var2 = new ds.Fila();
    java.lang.Byte var3 = new java.lang.Byte((byte)1);
    var2.enfileira((java.lang.Object)var3);
    java.lang.Integer var5 = new java.lang.Integer(1);
    var2.enfileira((java.lang.Object)var5);
    boolean var7 = var2.vazia();
    boolean var8 = var2.vazia();
    boolean var9 = var2.vazia();
    var1.enfileira((java.lang.Object)var2);
    var0.enfileira((java.lang.Object)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test53() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    java.lang.Byte var4 = new java.lang.Byte((byte)1);
    var3.enfileira((java.lang.Object)var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    var3.enfileira((java.lang.Object)var6);
    boolean var8 = var3.vazia();
    var0.enfileira((java.lang.Object)var8);
    boolean var10 = var0.vazia();
    boolean var11 = var0.vazia();
    ds.Fila var12 = new ds.Fila();
    boolean var13 = var12.vazia();
    boolean var14 = var12.vazia();
    boolean var15 = var12.vazia();
    var12.imprime();
    var0.enfileira((java.lang.Object)var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var18 = var12.desenfileira();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test54() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var4 = new ds.Fila();
    var1.enfileira((java.lang.Object)var4);
    boolean var6 = var1.vazia();
    boolean var7 = var1.vazia();
    ds.Fila var8 = new ds.Fila();
    java.lang.Byte var9 = new java.lang.Byte((byte)1);
    var8.enfileira((java.lang.Object)var9);
    java.lang.Integer var11 = new java.lang.Integer(1);
    var8.enfileira((java.lang.Object)var11);
    boolean var13 = var8.vazia();
    boolean var14 = var8.vazia();
    boolean var15 = var8.vazia();
    java.lang.Object var16 = var8.desenfileira();
    var1.enfileira((java.lang.Object)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + (byte)1+ "'", var16.equals((byte)1));

  }

  public void test55() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test56() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Boolean var1 = new java.lang.Boolean(true);
    var0.enfileira((java.lang.Object)var1);
    java.lang.Double var3 = new java.lang.Double(0.0d);
    var0.enfileira((java.lang.Object)var3);
    java.lang.Object var5 = var0.desenfileira();
    boolean var6 = var0.vazia();
    var0.imprime();
    ds.Fila var8 = new ds.Fila();
    boolean var9 = var8.vazia();
    boolean var10 = var8.vazia();
    boolean var11 = var8.vazia();
    var8.imprime();
    var0.enfileira((java.lang.Object)var8);
    ds.Fila var14 = new ds.Fila();
    var8.enfileira((java.lang.Object)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + true+ "'", var5.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test57() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    boolean var3 = var1.vazia();
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var5 = new ds.Fila();
    ds.Fila var6 = new ds.Fila();
    boolean var7 = var6.vazia();
    var5.enfileira((java.lang.Object)var6);
    java.lang.String var9 = "hi!";
    var5.enfileira((java.lang.Object)var9);
    var0.enfileira((java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test58() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Byte var1 = new java.lang.Byte((byte)1);
    var0.enfileira((java.lang.Object)var1);
    java.lang.Integer var3 = new java.lang.Integer(1);
    var0.enfileira((java.lang.Object)var3);
    var0.imprime();

  }

  public void test59() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Byte var2 = new java.lang.Byte((byte)1);
    var1.enfileira((java.lang.Object)var2);
    java.lang.Integer var4 = new java.lang.Integer(1);
    var1.enfileira((java.lang.Object)var4);
    boolean var6 = var1.vazia();
    boolean var7 = var1.vazia();
    boolean var8 = var1.vazia();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Object var10 = var0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test60() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Boolean var1 = new java.lang.Boolean(true);
    var0.enfileira((java.lang.Object)var1);
    java.lang.Double var3 = new java.lang.Double(0.0d);
    var0.enfileira((java.lang.Object)var3);
    java.lang.Object var5 = var0.desenfileira();
    boolean var6 = var0.vazia();
    var0.imprime();
    ds.Fila var8 = new ds.Fila();
    ds.Fila var9 = new ds.Fila();
    boolean var10 = var9.vazia();
    var8.enfileira((java.lang.Object)var9);
    java.lang.String var12 = "hi!";
    var8.enfileira((java.lang.Object)var12);
    var0.enfileira((java.lang.Object)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + true+ "'", var5.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test61() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Boolean var2 = new java.lang.Boolean(true);
    var1.enfileira((java.lang.Object)var2);
    java.lang.Double var4 = new java.lang.Double(0.0d);
    var1.enfileira((java.lang.Object)var4);
    java.lang.Object var6 = var1.desenfileira();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Object var8 = var0.desenfileira();
    ds.Fila var9 = new ds.Fila();
    ds.Fila var10 = new ds.Fila();
    boolean var11 = var10.vazia();
    var9.enfileira((java.lang.Object)var10);
    ds.Fila var13 = new ds.Fila();
    var10.enfileira((java.lang.Object)var13);
    boolean var15 = var10.vazia();
    boolean var16 = var10.vazia();
    boolean var17 = var10.vazia();
    var0.enfileira((java.lang.Object)var10);
    boolean var19 = var10.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + true+ "'", var6.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test62() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    java.lang.Byte var4 = new java.lang.Byte((byte)1);
    var3.enfileira((java.lang.Object)var4);
    java.lang.Integer var6 = new java.lang.Integer(1);
    var3.enfileira((java.lang.Object)var6);
    boolean var8 = var3.vazia();
    var0.enfileira((java.lang.Object)var8);
    boolean var10 = var0.vazia();
    java.lang.Object var11 = var0.desenfileira();
    java.lang.Object var12 = var0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + false+ "'", var12.equals(false));

  }

  public void test63() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    ds.Fila var2 = new ds.Fila();
    java.lang.Boolean var3 = new java.lang.Boolean(true);
    var2.enfileira((java.lang.Object)var3);
    java.lang.Double var5 = new java.lang.Double(0.0d);
    var2.enfileira((java.lang.Object)var5);
    java.lang.Object var7 = var2.desenfileira();
    var1.enfileira((java.lang.Object)var2);
    ds.Fila var9 = new ds.Fila();
    ds.Fila var10 = new ds.Fila();
    java.lang.Boolean var11 = new java.lang.Boolean(true);
    var10.enfileira((java.lang.Object)var11);
    java.lang.Double var13 = new java.lang.Double(0.0d);
    var10.enfileira((java.lang.Object)var13);
    java.lang.Object var15 = var10.desenfileira();
    var9.enfileira((java.lang.Object)var10);
    var1.enfileira((java.lang.Object)var10);
    java.lang.Object var18 = var10.desenfileira();
    var0.enfileira((java.lang.Object)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + true+ "'", var7.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + true+ "'", var15.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + 0.0d+ "'", var18.equals(0.0d));

  }

}
