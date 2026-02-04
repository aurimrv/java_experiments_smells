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

  public void test3() throws Throwable {

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
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test6() throws Throwable {

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

  public void test7() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Integer var3 = new java.lang.Integer(10);
    var1.enfileira((java.lang.Object)var3);
    var1.imprime();

  }

  public void test8() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Integer var3 = new java.lang.Integer(10);
    var1.enfileira((java.lang.Object)var3);
    boolean var5 = var1.vazia();
    var1.enfileira((java.lang.Object)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test9() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Byte var1 = new java.lang.Byte((byte)10);
    var0.enfileira((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test10() throws Throwable {

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

  public void test11() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Integer var3 = new java.lang.Integer(10);
    var1.enfileira((java.lang.Object)var3);
    boolean var5 = var1.vazia();
    boolean var6 = var1.vazia();
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test12() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Byte var1 = new java.lang.Byte((byte)10);
    var0.enfileira((java.lang.Object)var1);
    java.lang.Float var3 = new java.lang.Float(10.0f);
    var0.enfileira((java.lang.Object)var3);
    var0.imprime();

  }

  public void test13() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.enfileira((java.lang.Object)var0);

  }

  public void test14() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Integer var3 = new java.lang.Integer(10);
    var1.enfileira((java.lang.Object)var3);
    boolean var5 = var1.vazia();
    boolean var6 = var1.vazia();
    boolean var7 = var1.vazia();
    java.lang.Object var8 = var1.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 10+ "'", var8.equals(10));

  }

  public void test15() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Byte var1 = new java.lang.Byte((byte)10);
    var0.enfileira((java.lang.Object)var1);
    java.lang.Float var3 = new java.lang.Float(10.0f);
    var0.enfileira((java.lang.Object)var3);
    var0.imprime();
    java.lang.Object var6 = var0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + (byte)10+ "'", var6.equals((byte)10));

  }

  public void test16() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    var0.enfileira((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test17() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Integer var3 = new java.lang.Integer(10);
    var1.enfileira((java.lang.Object)var3);
    boolean var5 = var1.vazia();
    boolean var6 = var1.vazia();
    boolean var7 = var1.vazia();
    boolean var8 = var1.vazia();
    var1.enfileira((java.lang.Object)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test18() throws Throwable {

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

  public void test19() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    var0.enfileira((java.lang.Object)var2);
    ds.Fila var4 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test20() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    var0.enfileira((java.lang.Object)var2);
    java.lang.Long var4 = new java.lang.Long(100L);
    var0.enfileira((java.lang.Object)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var1.desenfileira();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test21() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Float var1 = new java.lang.Float(100.0f);
    var0.enfileira((java.lang.Object)var1);
    var0.imprime();

  }

  public void test22() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    var0.enfileira((java.lang.Object)var2);
    java.lang.Long var4 = new java.lang.Long(100L);
    var0.enfileira((java.lang.Object)var4);
    java.lang.Object var6 = var0.desenfileira();
    ds.Fila var7 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + true+ "'", var6.equals(true));

  }

  public void test23() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    var0.enfileira((java.lang.Object)var2);
    java.lang.Long var4 = new java.lang.Long(100L);
    var0.enfileira((java.lang.Object)var4);
    java.lang.Object var6 = var0.desenfileira();
    java.lang.Object var7 = var0.desenfileira();
    ds.Fila var8 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + true+ "'", var6.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 100L+ "'", var7.equals(100L));

  }

  public void test24() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();

  }

  public void test25() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Float var1 = new java.lang.Float(100.0f);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    java.lang.Float var4 = new java.lang.Float(100.0f);
    var3.enfileira((java.lang.Object)var4);
    var0.enfileira((java.lang.Object)var3);
    java.lang.Object var7 = var3.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 100.0f+ "'", var7.equals(100.0f));

  }

  public void test26() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    var0.enfileira((java.lang.Object)var2);
    java.lang.Long var4 = new java.lang.Long(100L);
    var0.enfileira((java.lang.Object)var4);
    java.lang.Object var6 = var0.desenfileira();
    java.lang.Object var7 = var0.desenfileira();
    boolean var8 = var0.vazia();
    ds.Fila var9 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + true+ "'", var6.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 100L+ "'", var7.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test27() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Float var1 = new java.lang.Float(100.0f);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    java.lang.Float var4 = new java.lang.Float(100.0f);
    var3.enfileira((java.lang.Object)var4);
    var0.enfileira((java.lang.Object)var3);
    boolean var7 = var0.vazia();
    java.lang.Object var8 = var3.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 100.0f+ "'", var8.equals(100.0f));

  }

  public void test28() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    ds.Fila var4 = new ds.Fila();
    var3.enfileira((java.lang.Object)var4);
    java.lang.Integer var6 = new java.lang.Integer(10);
    var4.enfileira((java.lang.Object)var6);
    boolean var8 = var4.vazia();
    boolean var9 = var4.vazia();
    var1.enfileira((java.lang.Object)var9);
    var4.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test29() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Float var1 = new java.lang.Float(100.0f);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    java.lang.Float var4 = new java.lang.Float(100.0f);
    var3.enfileira((java.lang.Object)var4);
    var0.enfileira((java.lang.Object)var3);
    boolean var7 = var0.vazia();
    java.lang.Object var8 = var0.desenfileira();
    boolean var9 = var3.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 100.0f+ "'", var8.equals(100.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test30() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    ds.Fila var4 = new ds.Fila();
    var3.enfileira((java.lang.Object)var4);
    java.lang.Integer var6 = new java.lang.Integer(10);
    var4.enfileira((java.lang.Object)var6);
    boolean var8 = var4.vazia();
    boolean var9 = var4.vazia();
    var1.enfileira((java.lang.Object)var9);
    boolean var11 = var1.vazia();
    ds.Fila var12 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test31() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Float var1 = new java.lang.Float(100.0f);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    java.lang.Float var4 = new java.lang.Float(100.0f);
    var3.enfileira((java.lang.Object)var4);
    var0.enfileira((java.lang.Object)var3);
    boolean var7 = var0.vazia();
    java.lang.Object var8 = var0.desenfileira();
    boolean var9 = var0.vazia();
    java.lang.Object var10 = var3.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 100.0f+ "'", var8.equals(100.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + 100.0f+ "'", var10.equals(100.0f));

  }

  public void test32() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    ds.Fila var4 = new ds.Fila();
    var3.enfileira((java.lang.Object)var4);
    java.lang.Integer var6 = new java.lang.Integer(10);
    var4.enfileira((java.lang.Object)var6);
    boolean var8 = var4.vazia();
    boolean var9 = var4.vazia();
    var1.enfileira((java.lang.Object)var9);
    boolean var11 = var1.vazia();
    java.lang.Object var12 = var1.desenfileira();
    var4.enfileira(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + false+ "'", var12.equals(false));

  }

  public void test33() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Float var1 = new java.lang.Float(100.0f);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    java.lang.Float var4 = new java.lang.Float(100.0f);
    var3.enfileira((java.lang.Object)var4);
    var0.enfileira((java.lang.Object)var3);
    boolean var7 = var0.vazia();
    java.lang.Object var8 = var0.desenfileira();
    boolean var9 = var0.vazia();
    boolean var10 = var0.vazia();
    var3.enfileira(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 100.0f+ "'", var8.equals(100.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test34() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    ds.Fila var2 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test35() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    ds.Fila var3 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test36() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    ds.Fila var4 = new ds.Fila();
    var3.enfileira((java.lang.Object)var4);
    java.lang.Integer var6 = new java.lang.Integer(10);
    var4.enfileira((java.lang.Object)var6);
    boolean var8 = var4.vazia();
    boolean var9 = var4.vazia();
    var1.enfileira((java.lang.Object)var9);
    boolean var11 = var1.vazia();
    java.lang.Object var12 = var1.desenfileira();
    boolean var13 = var1.vazia();
    var4.enfileira(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + false+ "'", var12.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test37() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Float var1 = new java.lang.Float(0.0f);
    var0.enfileira((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test38() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Float var1 = new java.lang.Float(0.0f);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    java.lang.Float var4 = new java.lang.Float(100.0f);
    var3.enfileira((java.lang.Object)var4);
    ds.Fila var6 = new ds.Fila();
    java.lang.Float var7 = new java.lang.Float(100.0f);
    var6.enfileira((java.lang.Object)var7);
    var3.enfileira((java.lang.Object)var6);
    boolean var10 = var3.vazia();
    java.lang.Object var11 = var3.desenfileira();
    boolean var12 = var3.vazia();
    boolean var13 = var3.vazia();
    var0.enfileira((java.lang.Object)var13);
    boolean var15 = var6.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 100.0f+ "'", var11.equals(100.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test39() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Float var1 = new java.lang.Float(0.0f);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    java.lang.Float var4 = new java.lang.Float(100.0f);
    var3.enfileira((java.lang.Object)var4);
    ds.Fila var6 = new ds.Fila();
    java.lang.Float var7 = new java.lang.Float(100.0f);
    var6.enfileira((java.lang.Object)var7);
    var3.enfileira((java.lang.Object)var6);
    boolean var10 = var3.vazia();
    java.lang.Object var11 = var3.desenfileira();
    boolean var12 = var3.vazia();
    boolean var13 = var3.vazia();
    var0.enfileira((java.lang.Object)var13);
    var0.imprime();
    ds.Fila var16 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 100.0f+ "'", var11.equals(100.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test40() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    ds.Fila var4 = new ds.Fila();
    var3.enfileira((java.lang.Object)var4);
    java.lang.Integer var6 = new java.lang.Integer(10);
    var4.enfileira((java.lang.Object)var6);
    var1.enfileira((java.lang.Object)var4);
    boolean var9 = var4.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test41() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    ds.Fila var4 = new ds.Fila();
    var3.enfileira((java.lang.Object)var4);
    java.lang.Integer var6 = new java.lang.Integer(10);
    var4.enfileira((java.lang.Object)var6);
    var1.enfileira((java.lang.Object)var4);

  }

  public void test42() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    ds.Fila var4 = new ds.Fila();
    var3.enfileira((java.lang.Object)var4);
    java.lang.Integer var6 = new java.lang.Integer(10);
    var4.enfileira((java.lang.Object)var6);
    boolean var8 = var4.vazia();
    boolean var9 = var4.vazia();
    var1.enfileira((java.lang.Object)var9);
    boolean var11 = var1.vazia();
    java.lang.Object var12 = var1.desenfileira();
    boolean var13 = var1.vazia();
    boolean var14 = var1.vazia();
    java.lang.Object var15 = var4.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + false+ "'", var12.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + 10+ "'", var15.equals(10));

  }

  public void test43() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    ds.Fila var4 = new ds.Fila();
    var3.enfileira((java.lang.Object)var4);
    java.lang.Integer var6 = new java.lang.Integer(10);
    var4.enfileira((java.lang.Object)var6);
    boolean var8 = var4.vazia();
    boolean var9 = var4.vazia();
    var1.enfileira((java.lang.Object)var9);
    boolean var11 = var1.vazia();
    java.lang.Object var12 = var1.desenfileira();
    boolean var13 = var1.vazia();
    boolean var14 = var1.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + false+ "'", var12.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test44() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Byte var3 = new java.lang.Byte((byte)0);
    var0.enfileira((java.lang.Object)var3);
    boolean var5 = var1.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test45() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Byte var3 = new java.lang.Byte((byte)0);
    var0.enfileira((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test46() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Byte var3 = new java.lang.Byte((byte)0);
    var0.enfileira((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    boolean var6 = var0.vazia();
    ds.Fila var7 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test47() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    ds.Fila var2 = new ds.Fila();
    boolean var3 = var2.vazia();
    var0.enfileira((java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test48() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    ds.Fila var2 = new ds.Fila();
    boolean var3 = var2.vazia();
    boolean var4 = var2.vazia();
    var0.enfileira((java.lang.Object)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test49() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Float var1 = new java.lang.Float(100.0f);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    java.lang.Float var4 = new java.lang.Float(100.0f);
    var3.enfileira((java.lang.Object)var4);
    var0.enfileira((java.lang.Object)var3);
    boolean var7 = var0.vazia();
    java.lang.Object var8 = var0.desenfileira();
    boolean var9 = var0.vazia();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 100.0f+ "'", var8.equals(100.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test50() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Float var1 = new java.lang.Float(0.0f);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    java.lang.Float var4 = new java.lang.Float(100.0f);
    var3.enfileira((java.lang.Object)var4);
    ds.Fila var6 = new ds.Fila();
    java.lang.Float var7 = new java.lang.Float(100.0f);
    var6.enfileira((java.lang.Object)var7);
    var3.enfileira((java.lang.Object)var6);
    boolean var10 = var3.vazia();
    java.lang.Object var11 = var3.desenfileira();
    boolean var12 = var3.vazia();
    boolean var13 = var3.vazia();
    var0.enfileira((java.lang.Object)var13);
    var0.imprime();
    ds.Fila var16 = new ds.Fila();
    var0.enfileira((java.lang.Object)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 100.0f+ "'", var11.equals(100.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test51() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    var1.imprime();

  }

  public void test52() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    ds.Fila var2 = new ds.Fila();
    boolean var3 = var2.vazia();
    var0.enfileira((java.lang.Object)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test53() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Byte var1 = new java.lang.Byte((byte)10);
    var0.enfileira((java.lang.Object)var1);
    java.lang.Integer var3 = new java.lang.Integer(0);
    var0.enfileira((java.lang.Object)var3);
    ds.Fila var5 = new ds.Fila();
    var0.enfileira((java.lang.Object)var5);
    java.lang.Byte var7 = new java.lang.Byte((byte)(-1));
    var0.enfileira((java.lang.Object)var7);

  }

  public void test54() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Byte var3 = new java.lang.Byte((byte)0);
    var0.enfileira((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    boolean var6 = var0.vazia();
    ds.Fila var7 = new ds.Fila();
    ds.Fila var8 = new ds.Fila();
    var7.enfileira((java.lang.Object)var8);
    var7.imprime();
    var0.enfileira((java.lang.Object)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test55() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    var0.imprime();
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

  }

  public void test56() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    java.lang.Short var2 = new java.lang.Short((short)0);
    var0.enfileira((java.lang.Object)var2);
    boolean var4 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test57() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    ds.Fila var2 = new ds.Fila();
    boolean var3 = var2.vazia();
    boolean var4 = var2.vazia();
    boolean var5 = var2.vazia();
    var0.enfileira((java.lang.Object)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test58() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Float var1 = new java.lang.Float(100.0f);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    java.lang.Float var4 = new java.lang.Float(100.0f);
    var3.enfileira((java.lang.Object)var4);
    var0.enfileira((java.lang.Object)var3);
    boolean var7 = var0.vazia();
    java.lang.Object var8 = var0.desenfileira();
    boolean var9 = var0.vazia();
    boolean var10 = var0.vazia();
    boolean var11 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 100.0f+ "'", var8.equals(100.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test59() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Byte var3 = new java.lang.Byte((byte)0);
    var0.enfileira((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    java.lang.Object var6 = var0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test60() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    ds.Fila var4 = new ds.Fila();
    var3.enfileira((java.lang.Object)var4);
    java.lang.Integer var6 = new java.lang.Integer(10);
    var4.enfileira((java.lang.Object)var6);
    boolean var8 = var4.vazia();
    boolean var9 = var4.vazia();
    var1.enfileira((java.lang.Object)var9);
    java.lang.Object var11 = var1.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + false+ "'", var11.equals(false));

  }

  public void test61() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    boolean var3 = var0.vazia();
    ds.Fila var4 = new ds.Fila();
    ds.Fila var5 = new ds.Fila();
    var4.enfileira((java.lang.Object)var5);
    java.lang.Integer var7 = new java.lang.Integer(10);
    var5.enfileira((java.lang.Object)var7);
    boolean var9 = var5.vazia();
    boolean var10 = var5.vazia();
    java.lang.Object var11 = var5.desenfileira();
    var0.enfileira((java.lang.Object)var5);
    java.lang.Object var13 = var0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 10+ "'", var11.equals(10));

  }

  public void test62() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Integer var3 = new java.lang.Integer(10);
    var1.enfileira((java.lang.Object)var3);
    boolean var5 = var1.vazia();
    boolean var6 = var1.vazia();
    boolean var7 = var1.vazia();
    ds.Fila var8 = new ds.Fila();
    var1.enfileira((java.lang.Object)var8);
    boolean var10 = var8.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test63() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    boolean var4 = var3.vazia();
    var1.enfileira((java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test64() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    var0.enfileira((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    java.lang.Object var6 = var0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test65() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Byte var1 = new java.lang.Byte((byte)10);
    var0.enfileira((java.lang.Object)var1);
    java.lang.Integer var3 = new java.lang.Integer(0);
    var0.enfileira((java.lang.Object)var3);
    ds.Fila var5 = new ds.Fila();
    ds.Fila var6 = new ds.Fila();
    var5.enfileira((java.lang.Object)var6);
    java.lang.Object var8 = var5.desenfileira();
    var0.enfileira(var8);

  }

  public void test66() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test67() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Integer var3 = new java.lang.Integer(10);
    var1.enfileira((java.lang.Object)var3);
    boolean var5 = var1.vazia();
    boolean var6 = var1.vazia();
    boolean var7 = var1.vazia();
    ds.Fila var8 = new ds.Fila();
    var1.enfileira((java.lang.Object)var8);
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test68() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    ds.Fila var2 = new ds.Fila();
    var1.enfileira((java.lang.Object)var2);
    java.lang.Integer var4 = new java.lang.Integer(10);
    var2.enfileira((java.lang.Object)var4);
    boolean var6 = var2.vazia();
    boolean var7 = var2.vazia();
    boolean var8 = var2.vazia();
    boolean var9 = var2.vazia();
    var0.enfileira((java.lang.Object)var2);
    boolean var11 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test69() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.imprime();
    ds.Fila var2 = new ds.Fila();
    ds.Fila var3 = new ds.Fila();
    var2.enfileira((java.lang.Object)var3);
    java.lang.Integer var5 = new java.lang.Integer(10);
    var3.enfileira((java.lang.Object)var5);
    boolean var7 = var3.vazia();
    var0.enfileira((java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test70() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    ds.Fila var3 = new ds.Fila();
    var0.enfileira((java.lang.Object)var3);
    var0.imprime();
    boolean var6 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test71() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Integer var3 = new java.lang.Integer(10);
    var1.enfileira((java.lang.Object)var3);
    boolean var5 = var1.vazia();
    boolean var6 = var1.vazia();
    boolean var7 = var1.vazia();
    boolean var8 = var1.vazia();
    ds.Fila var9 = new ds.Fila();
    var1.enfileira((java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test72() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.imprime();
    boolean var2 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test73() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Float var1 = new java.lang.Float(0.0f);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    java.lang.Float var4 = new java.lang.Float(100.0f);
    var3.enfileira((java.lang.Object)var4);
    ds.Fila var6 = new ds.Fila();
    java.lang.Float var7 = new java.lang.Float(100.0f);
    var6.enfileira((java.lang.Object)var7);
    var3.enfileira((java.lang.Object)var6);
    boolean var10 = var3.vazia();
    java.lang.Object var11 = var3.desenfileira();
    boolean var12 = var3.vazia();
    boolean var13 = var3.vazia();
    var0.enfileira((java.lang.Object)var13);
    var0.imprime();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 100.0f+ "'", var11.equals(100.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test74() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    boolean var3 = var0.vazia();
    boolean var4 = var0.vazia();
    boolean var5 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test75() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    var0.enfileira((java.lang.Object)var2);
    java.lang.Long var4 = new java.lang.Long(100L);
    var0.enfileira((java.lang.Object)var4);
    java.lang.Object var6 = var0.desenfileira();
    java.lang.Object var7 = var0.desenfileira();
    boolean var8 = var0.vazia();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + true+ "'", var6.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 100L+ "'", var7.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test76() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    ds.Fila var2 = new ds.Fila();
    var1.enfileira((java.lang.Object)var2);
    java.lang.Integer var4 = new java.lang.Integer(10);
    var2.enfileira((java.lang.Object)var4);
    boolean var6 = var2.vazia();
    boolean var7 = var2.vazia();
    var0.enfileira((java.lang.Object)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test77() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Float var1 = new java.lang.Float(100.0f);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    java.lang.Float var4 = new java.lang.Float(100.0f);
    var3.enfileira((java.lang.Object)var4);
    var0.enfileira((java.lang.Object)var3);
    boolean var7 = var0.vazia();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test78() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Byte var1 = new java.lang.Byte((byte)10);
    var0.enfileira((java.lang.Object)var1);
    java.lang.Float var3 = new java.lang.Float(10.0f);
    var0.enfileira((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test79() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Byte var1 = new java.lang.Byte((byte)10);
    var0.enfileira((java.lang.Object)var1);
    var0.imprime();
    java.lang.Object var4 = var0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (byte)10+ "'", var4.equals((byte)10));

  }

  public void test80() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Integer var3 = new java.lang.Integer(10);
    var1.enfileira((java.lang.Object)var3);
    ds.Fila var5 = new ds.Fila();
    ds.Fila var6 = new ds.Fila();
    var5.enfileira((java.lang.Object)var6);
    ds.Fila var8 = new ds.Fila();
    ds.Fila var9 = new ds.Fila();
    var8.enfileira((java.lang.Object)var9);
    java.lang.Integer var11 = new java.lang.Integer(10);
    var9.enfileira((java.lang.Object)var11);
    boolean var13 = var9.vazia();
    boolean var14 = var9.vazia();
    var6.enfileira((java.lang.Object)var14);
    boolean var16 = var6.vazia();
    java.lang.Object var17 = var6.desenfileira();
    boolean var18 = var6.vazia();
    var6.imprime();
    ds.Fila var20 = new ds.Fila();
    ds.Fila var21 = new ds.Fila();
    boolean var22 = var21.vazia();
    var20.enfileira((java.lang.Object)var22);
    java.lang.Long var24 = new java.lang.Long(100L);
    var20.enfileira((java.lang.Object)var24);
    java.lang.Object var26 = var20.desenfileira();
    boolean var27 = var20.vazia();
    var6.enfileira((java.lang.Object)var20);
    var1.enfileira((java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + false+ "'", var17.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + true+ "'", var26.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test81() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    ds.Fila var2 = new ds.Fila();
    var1.enfileira((java.lang.Object)var2);
    var0.enfileira((java.lang.Object)var2);

  }

  public void test82() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Float var1 = new java.lang.Float(100.0f);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    java.lang.Float var4 = new java.lang.Float(100.0f);
    var3.enfileira((java.lang.Object)var4);
    var0.enfileira((java.lang.Object)var3);
    var3.imprime();

  }

  public void test83() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    boolean var3 = var1.vazia();
    boolean var4 = var1.vazia();
    ds.Fila var5 = new ds.Fila();
    ds.Fila var6 = new ds.Fila();
    var5.enfileira((java.lang.Object)var6);
    java.lang.Integer var8 = new java.lang.Integer(10);
    var6.enfileira((java.lang.Object)var8);
    boolean var10 = var6.vazia();
    boolean var11 = var6.vazia();
    java.lang.Object var12 = var6.desenfileira();
    var1.enfileira((java.lang.Object)var6);
    var0.enfileira((java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + 10+ "'", var12.equals(10));

  }

  public void test84() throws Throwable {

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

  public void test85() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    var0.enfileira((java.lang.Object)var2);
    java.lang.Long var4 = new java.lang.Long(100L);
    var0.enfileira((java.lang.Object)var4);
    java.lang.Object var6 = var0.desenfileira();
    ds.Fila var7 = new ds.Fila();
    ds.Fila var8 = new ds.Fila();
    var7.enfileira((java.lang.Object)var8);
    var0.enfileira((java.lang.Object)var8);
    boolean var11 = var8.vazia();
    boolean var12 = var8.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + true+ "'", var6.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test86() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    ds.Fila var2 = new ds.Fila();
    var1.enfileira((java.lang.Object)var2);
    java.lang.Integer var4 = new java.lang.Integer(10);
    var2.enfileira((java.lang.Object)var4);
    boolean var6 = var2.vazia();
    boolean var7 = var2.vazia();
    boolean var8 = var2.vazia();
    boolean var9 = var2.vazia();
    var0.enfileira((java.lang.Object)var2);
    boolean var11 = var2.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

}
