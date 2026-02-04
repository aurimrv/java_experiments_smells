package ds.seed5311;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed5311 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.enfileira((java.lang.Object)var0);

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
    var0.enfileira((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test4() throws Throwable {

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

  public void test5() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    ds.Fila var3 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test6() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Float var1 = new java.lang.Float(0.0f);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();

  }

  public void test7() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Float var1 = new java.lang.Float(0.0f);
    var0.enfileira((java.lang.Object)var1);
    java.lang.Byte var3 = new java.lang.Byte((byte)0);
    var0.enfileira((java.lang.Object)var3);
    var0.imprime();
    java.lang.Object var6 = var0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 0.0f+ "'", var6.equals(0.0f));

  }

  public void test8() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Float var1 = new java.lang.Float(0.0f);
    var0.enfileira((java.lang.Object)var1);
    java.lang.Byte var3 = new java.lang.Byte((byte)0);
    var0.enfileira((java.lang.Object)var3);
    var0.imprime();
    boolean var6 = var0.vazia();
    java.lang.Object var7 = var0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 0.0f+ "'", var7.equals(0.0f));

  }

  public void test9() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Float var1 = new java.lang.Float(0.0f);
    var0.enfileira((java.lang.Object)var1);
    java.lang.Byte var3 = new java.lang.Byte((byte)0);
    var0.enfileira((java.lang.Object)var3);
    var0.imprime();
    boolean var6 = var0.vazia();
    boolean var7 = var0.vazia();
    var0.enfileira((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test10() throws Throwable {

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

  public void test11() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Float var2 = new java.lang.Float(0.0f);
    var1.enfileira((java.lang.Object)var2);
    java.lang.Byte var4 = new java.lang.Byte((byte)0);
    var1.enfileira((java.lang.Object)var4);
    var1.imprime();
    boolean var7 = var1.vazia();
    var0.enfileira((java.lang.Object)var1);
    boolean var9 = var1.vazia();
    ds.Fila var10 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test12() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Integer var1 = new java.lang.Integer(0);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();

  }

  public void test13() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    var0.enfileira((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test14() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Integer var1 = new java.lang.Integer(0);
    var0.enfileira((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    java.lang.Object var4 = var0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0+ "'", var4.equals(0));

  }

  public void test15() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    var0.enfileira((java.lang.Object)var1);
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test16() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    var0.enfileira((java.lang.Object)var1);
    boolean var4 = var0.vazia();
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test17() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    var0.enfileira((java.lang.Object)var1);
    boolean var4 = var0.vazia();
    boolean var5 = var0.vazia();
    ds.Fila var6 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test18() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Byte var1 = new java.lang.Byte((byte)10);
    var0.enfileira((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test19() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    ds.Fila var2 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test20() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Integer var1 = new java.lang.Integer(0);
    var0.enfileira((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    boolean var4 = var0.vazia();
    ds.Fila var5 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test21() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Float var2 = new java.lang.Float(0.0f);
    var1.enfileira((java.lang.Object)var2);
    java.lang.Byte var4 = new java.lang.Byte((byte)0);
    var1.enfileira((java.lang.Object)var4);
    var1.imprime();
    boolean var7 = var1.vazia();
    var0.enfileira((java.lang.Object)var1);
    boolean var9 = var1.vazia();
    boolean var10 = var1.vazia();
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test22() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Byte var1 = new java.lang.Byte((byte)10);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    boolean var4 = var3.vazia();
    boolean var5 = var3.vazia();
    var0.enfileira((java.lang.Object)var5);
    var3.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test23() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Integer var1 = new java.lang.Integer(10);
    var0.enfileira((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    ds.Fila var4 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test24() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Integer var1 = new java.lang.Integer(10);
    var0.enfileira((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    boolean var4 = var0.vazia();
    java.lang.Object var5 = var0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10+ "'", var5.equals(10));

  }

  public void test25() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Integer var1 = new java.lang.Integer(10);
    var0.enfileira((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    boolean var4 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test26() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Byte var1 = new java.lang.Byte((byte)10);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    boolean var4 = var3.vazia();
    boolean var5 = var3.vazia();
    var0.enfileira((java.lang.Object)var5);
    var0.imprime();
    ds.Fila var8 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test27() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var4 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test28() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Byte var1 = new java.lang.Byte((byte)10);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    boolean var4 = var3.vazia();
    boolean var5 = var3.vazia();
    var0.enfileira((java.lang.Object)var5);
    var0.imprime();
    boolean var8 = var0.vazia();
    ds.Fila var9 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test29() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    var1.imprime();

  }

  public void test30() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Long var1 = new java.lang.Long(1L);
    var0.enfileira((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test31() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Byte var1 = new java.lang.Byte((byte)10);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    boolean var4 = var3.vazia();
    boolean var5 = var3.vazia();
    var0.enfileira((java.lang.Object)var5);
    var0.imprime();
    boolean var8 = var0.vazia();
    boolean var9 = var0.vazia();
    ds.Fila var10 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test32() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    boolean var3 = var1.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test33() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Integer var2 = new java.lang.Integer(0);
    var1.enfileira((java.lang.Object)var2);
    boolean var4 = var1.vazia();
    boolean var5 = var1.vazia();
    var0.enfileira((java.lang.Object)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test34() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Float var1 = new java.lang.Float(0.0f);
    var0.enfileira((java.lang.Object)var1);
    java.lang.Byte var3 = new java.lang.Byte((byte)0);
    var0.enfileira((java.lang.Object)var3);
    java.lang.Object var5 = var0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 0.0f+ "'", var5.equals(0.0f));

  }

  public void test35() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    java.lang.Character var2 = new java.lang.Character('a');
    var0.enfileira((java.lang.Object)var2);
    boolean var4 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test36() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Float var2 = new java.lang.Float(0.0f);
    var1.enfileira((java.lang.Object)var2);
    java.lang.Byte var4 = new java.lang.Byte((byte)0);
    var1.enfileira((java.lang.Object)var4);
    boolean var6 = var1.vazia();
    var0.enfileira((java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test37() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    ds.Fila var3 = new ds.Fila();
    ds.Fila var4 = new ds.Fila();
    java.lang.Float var5 = new java.lang.Float(0.0f);
    var4.enfileira((java.lang.Object)var5);
    java.lang.Byte var7 = new java.lang.Byte((byte)0);
    var4.enfileira((java.lang.Object)var7);
    var4.imprime();
    boolean var10 = var4.vazia();
    var3.enfileira((java.lang.Object)var4);
    var0.enfileira((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test38() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Byte var1 = new java.lang.Byte((byte)10);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    boolean var4 = var3.vazia();
    boolean var5 = var3.vazia();
    var0.enfileira((java.lang.Object)var5);
    var0.imprime();
    boolean var8 = var0.vazia();
    boolean var9 = var0.vazia();
    boolean var10 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test39() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    var0.imprime();
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

  }

  public void test40() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Float var2 = new java.lang.Float(0.0f);
    var1.enfileira((java.lang.Object)var2);
    java.lang.Byte var4 = new java.lang.Byte((byte)0);
    var1.enfileira((java.lang.Object)var4);
    boolean var6 = var1.vazia();
    java.lang.Object var7 = var1.desenfileira();
    var0.enfileira((java.lang.Object)var1);
    boolean var9 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 0.0f+ "'", var7.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test41() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Object var1 = new java.lang.Object();
    var0.enfileira(var1);

  }

  public void test42() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    ds.Fila var3 = new ds.Fila();
    boolean var4 = var3.vazia();
    boolean var5 = var3.vazia();
    var0.enfileira((java.lang.Object)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test43() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    java.lang.Object var2 = new java.lang.Object();
    var0.enfileira(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test44() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    ds.Fila var2 = new ds.Fila();
    ds.Fila var3 = new ds.Fila();
    java.lang.Float var4 = new java.lang.Float(0.0f);
    var3.enfileira((java.lang.Object)var4);
    java.lang.Byte var6 = new java.lang.Byte((byte)0);
    var3.enfileira((java.lang.Object)var6);
    var3.imprime();
    boolean var9 = var3.vazia();
    var2.enfileira((java.lang.Object)var3);
    java.lang.Object var11 = var3.desenfileira();
    var0.enfileira((java.lang.Object)var3);
    boolean var13 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 0.0f+ "'", var11.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test45() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Float var2 = new java.lang.Float(0.0f);
    var1.enfileira((java.lang.Object)var2);
    java.lang.Byte var4 = new java.lang.Byte((byte)0);
    var1.enfileira((java.lang.Object)var4);
    var0.enfileira((java.lang.Object)var1);
    var0.imprime();

  }

  public void test46() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Integer var1 = new java.lang.Integer(10);
    var0.enfileira((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test47() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    ds.Fila var2 = new ds.Fila();
    var1.enfileira((java.lang.Object)var2);
    var0.enfileira((java.lang.Object)var1);
    var1.imprime();

  }

  public void test48() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Float var1 = new java.lang.Float(0.0f);
    var0.enfileira((java.lang.Object)var1);
    java.lang.Byte var3 = new java.lang.Byte((byte)0);
    var0.enfileira((java.lang.Object)var3);
    java.lang.Integer var5 = new java.lang.Integer(10);
    var0.enfileira((java.lang.Object)var5);

  }

  public void test49() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    ds.Fila var2 = new ds.Fila();
    java.lang.Byte var3 = new java.lang.Byte((byte)10);
    var2.enfileira((java.lang.Object)var3);
    ds.Fila var5 = new ds.Fila();
    boolean var6 = var5.vazia();
    boolean var7 = var5.vazia();
    var2.enfileira((java.lang.Object)var7);
    var2.imprime();
    boolean var10 = var2.vazia();
    boolean var11 = var2.vazia();
    var0.enfileira((java.lang.Object)var2);
    java.lang.Object var13 = var0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test50() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Float var2 = new java.lang.Float(0.0f);
    var1.enfileira((java.lang.Object)var2);
    java.lang.Byte var4 = new java.lang.Byte((byte)0);
    var1.enfileira((java.lang.Object)var4);
    var1.imprime();
    boolean var7 = var1.vazia();
    var0.enfileira((java.lang.Object)var1);
    boolean var9 = var1.vazia();
    boolean var10 = var1.vazia();
    java.lang.Object var11 = new java.lang.Object();
    var1.enfileira(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test51() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    var0.enfileira((java.lang.Object)var1);
    boolean var4 = var0.vazia();
    boolean var5 = var0.vazia();
    var0.imprime();
    boolean var7 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test52() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var4 = new ds.Fila();
    var0.enfileira((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test53() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    ds.Fila var2 = new ds.Fila();
    var1.enfileira((java.lang.Object)var2);
    var0.enfileira((java.lang.Object)var1);
    java.lang.Object var5 = var1.desenfileira();
    ds.Fila var6 = new ds.Fila();
    ds.Fila var7 = new ds.Fila();
    ds.Fila var8 = new ds.Fila();
    var7.enfileira((java.lang.Object)var8);
    var6.enfileira((java.lang.Object)var7);
    java.lang.Object var11 = var7.desenfileira();
    var1.enfileira((java.lang.Object)var7);

  }

  public void test54() throws Throwable {

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

  public void test55() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.imprime();
    boolean var2 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test56() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Long var2 = new java.lang.Long(1L);
    var1.enfileira((java.lang.Object)var2);
    var0.enfileira((java.lang.Object)var1);

  }

  public void test57() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    var0.enfileira((java.lang.Object)var1);
    boolean var4 = var0.vazia();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test58() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.imprime();
    java.lang.Object var2 = new java.lang.Object();
    var0.enfileira(var2);

  }

  public void test59() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    var0.imprime();
    ds.Fila var4 = new ds.Fila();
    boolean var5 = var4.vazia();
    boolean var6 = var4.vazia();
    var0.enfileira((java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test60() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Float var2 = new java.lang.Float(0.0f);
    var1.enfileira((java.lang.Object)var2);
    java.lang.Byte var4 = new java.lang.Byte((byte)0);
    var1.enfileira((java.lang.Object)var4);
    var1.imprime();
    boolean var7 = var1.vazia();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Object var9 = var1.desenfileira();
    boolean var10 = var1.vazia();
    ds.Fila var11 = new ds.Fila();
    boolean var12 = var11.vazia();
    boolean var13 = var11.vazia();
    ds.Fila var14 = new ds.Fila();
    ds.Fila var15 = new ds.Fila();
    ds.Fila var16 = new ds.Fila();
    var15.enfileira((java.lang.Object)var16);
    var14.enfileira((java.lang.Object)var15);
    var11.enfileira((java.lang.Object)var15);
    var1.enfileira((java.lang.Object)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 0.0f+ "'", var9.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test61() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    ds.Fila var3 = new ds.Fila();
    ds.Fila var4 = new ds.Fila();
    ds.Fila var5 = new ds.Fila();
    var4.enfileira((java.lang.Object)var5);
    var3.enfileira((java.lang.Object)var4);
    var0.enfileira((java.lang.Object)var4);
    ds.Fila var9 = new ds.Fila();
    ds.Fila var10 = new ds.Fila();
    boolean var11 = var10.vazia();
    var9.enfileira((java.lang.Object)var10);
    var0.enfileira((java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test62() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    java.lang.Object var3 = new java.lang.Object();
    var0.enfileira(var3);
    var0.imprime();
    java.lang.Object var6 = var0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test63() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Float var1 = new java.lang.Float(0.0f);
    var0.enfileira((java.lang.Object)var1);
    java.lang.Byte var3 = new java.lang.Byte((byte)0);
    var0.enfileira((java.lang.Object)var3);
    var0.imprime();
    boolean var6 = var0.vazia();
    boolean var7 = var0.vazia();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

}
