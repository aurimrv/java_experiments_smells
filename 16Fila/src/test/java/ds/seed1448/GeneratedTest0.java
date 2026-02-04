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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var1 = var0.desenfileira();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    var0.enfileira((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test4() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();

  }

  public void test5() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    java.lang.String var3 = "hi!";
    var0.enfileira((java.lang.Object)var3);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test6() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.enfileira((java.lang.Object)var0);

  }

  public void test7() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    java.lang.String var3 = "hi!";
    var0.enfileira((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test8() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    ds.Fila var4 = new ds.Fila();
    var3.enfileira((java.lang.Object)var4);
    var1.enfileira((java.lang.Object)var4);
    boolean var7 = var4.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test9() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    ds.Fila var4 = new ds.Fila();
    var3.enfileira((java.lang.Object)var4);
    var1.enfileira((java.lang.Object)var4);
    boolean var7 = var4.vazia();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var4.desenfileira();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test10() throws Throwable {

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

  public void test11() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.imprime();
    boolean var2 = var0.vazia();
    ds.Fila var3 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test12() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Double var1 = new java.lang.Double((-1.0d));
    var0.enfileira((java.lang.Object)var1);
    var0.imprime();

  }

  public void test13() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.imprime();
    var0.enfileira((java.lang.Object)var0);

  }

  public void test14() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Boolean var1 = new java.lang.Boolean(true);
    var0.enfileira((java.lang.Object)var1);
    var0.imprime();

  }

  public void test15() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Boolean var1 = new java.lang.Boolean(true);
    var0.enfileira((java.lang.Object)var1);
    java.lang.Float var3 = new java.lang.Float(1.0f);
    var0.enfileira((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test16() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    ds.Fila var3 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test17() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Double var1 = new java.lang.Double((-1.0d));
    var0.enfileira((java.lang.Object)var1);
    java.lang.Double var3 = new java.lang.Double((-1.0d));
    var0.enfileira((java.lang.Object)var3);
    java.lang.Object var5 = var0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + (-1.0d)+ "'", var5.equals((-1.0d)));

  }

  public void test18() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    java.lang.Integer var3 = new java.lang.Integer(1);
    var0.enfileira((java.lang.Object)var3);
    ds.Fila var5 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test19() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    ds.Fila var2 = new ds.Fila();
    var1.enfileira((java.lang.Object)var2);
    var0.enfileira((java.lang.Object)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var2.desenfileira();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    ds.Fila var2 = new ds.Fila();
    var1.enfileira((java.lang.Object)var2);
    var0.enfileira((java.lang.Object)var2);
    ds.Fila var5 = new ds.Fila();
    var2.enfileira((java.lang.Object)var5);
    boolean var7 = var5.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test21() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    ds.Fila var2 = new ds.Fila();
    var1.enfileira((java.lang.Object)var2);
    var0.enfileira((java.lang.Object)var2);
    ds.Fila var5 = new ds.Fila();
    var2.enfileira((java.lang.Object)var5);
    boolean var7 = var5.vazia();
    ds.Fila var8 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test22() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.imprime();
    boolean var2 = var0.vazia();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test23() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Float var1 = new java.lang.Float(0.0f);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();

  }

  public void test24() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    java.lang.Integer var3 = new java.lang.Integer(1);
    var0.enfileira((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    ds.Fila var6 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

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
    java.lang.Double var1 = new java.lang.Double((-1.0d));
    var0.enfileira((java.lang.Object)var1);
    java.lang.Double var3 = new java.lang.Double((-1.0d));
    var0.enfileira((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test27() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Boolean var1 = new java.lang.Boolean(true);
    var0.enfileira((java.lang.Object)var1);
    java.lang.Float var3 = new java.lang.Float(1.0f);
    var0.enfileira((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test28() throws Throwable {

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

  public void test29() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    var0.enfileira((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test30() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    ds.Fila var3 = new ds.Fila();
    var0.enfileira((java.lang.Object)var3);
    ds.Fila var5 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test31() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test32() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    ds.Fila var3 = new ds.Fila();
    var0.enfileira((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    var3.enfileira((java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test33() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Float var1 = new java.lang.Float(0.0f);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    java.lang.Float var4 = new java.lang.Float(0.0f);
    var3.enfileira((java.lang.Object)var4);
    var0.enfileira((java.lang.Object)var4);
    boolean var7 = var3.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test34() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Float var1 = new java.lang.Float(0.0f);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    java.lang.Float var4 = new java.lang.Float(0.0f);
    var3.enfileira((java.lang.Object)var4);
    var0.enfileira((java.lang.Object)var4);
    boolean var7 = var0.vazia();
    java.lang.Object var8 = var3.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 0.0f+ "'", var8.equals(0.0f));

  }

  public void test35() throws Throwable {

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

  public void test36() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.imprime();
    ds.Fila var2 = new ds.Fila();

  }

  public void test37() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var1.imprime();
    boolean var3 = var1.vazia();
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var5 = new ds.Fila();
    var5.imprime();
    boolean var7 = var5.vazia();
    var0.enfileira((java.lang.Object)var5);
    boolean var9 = var5.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test38() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var1.imprime();
    boolean var3 = var1.vazia();
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var5 = new ds.Fila();
    var5.imprime();
    boolean var7 = var5.vazia();
    var0.enfileira((java.lang.Object)var5);
    boolean var9 = var0.vazia();
    ds.Fila var10 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test39() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.imprime();
    boolean var2 = var0.vazia();
    var0.enfileira((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test40() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    ds.Fila var3 = new ds.Fila();
    var3.imprime();
    boolean var5 = var3.vazia();
    var0.enfileira((java.lang.Object)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var3.desenfileira();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test41() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    ds.Fila var3 = new ds.Fila();
    var3.imprime();
    boolean var5 = var3.vazia();
    var0.enfileira((java.lang.Object)var3);
    boolean var7 = var3.vazia();
    ds.Fila var8 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test42() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    java.lang.Boolean var3 = new java.lang.Boolean(true);
    var0.enfileira((java.lang.Object)var3);
    ds.Fila var5 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test43() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    java.lang.Boolean var3 = new java.lang.Boolean(true);
    var0.enfileira((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    var0.enfileira((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test44() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    java.lang.Boolean var3 = new java.lang.Boolean(true);
    var0.enfileira((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test45() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var1.imprime();
    var0.enfileira((java.lang.Object)var1);
    boolean var4 = var1.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test46() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    ds.Fila var3 = new ds.Fila();
    var0.enfileira((java.lang.Object)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var3.desenfileira();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test47() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    var1.imprime();

  }

  public void test48() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var1.imprime();
    boolean var3 = var1.vazia();
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var5 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test49() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    var0.enfileira((java.lang.Object)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var3.desenfileira();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test50() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    var0.enfileira((java.lang.Object)var3);

  }

  public void test51() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    boolean var3 = var1.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test52() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    ds.Fila var2 = new ds.Fila();
    var1.enfileira((java.lang.Object)var2);
    var0.enfileira((java.lang.Object)var1);
    var2.imprime();

  }

  public void test53() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Float var1 = new java.lang.Float(0.0f);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    var0.enfileira((java.lang.Object)var3);

  }

  public void test54() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.imprime();
    var0.imprime();

  }

  public void test55() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var1.imprime();
    var0.enfileira((java.lang.Object)var1);
    var1.imprime();

  }

  public void test56() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    ds.Fila var2 = new ds.Fila();
    var1.enfileira((java.lang.Object)var2);
    var0.enfileira((java.lang.Object)var2);
    boolean var5 = var2.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test57() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    java.lang.Integer var3 = new java.lang.Integer(1);
    var0.enfileira((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    java.lang.Object var6 = var0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 1+ "'", var6.equals(1));

  }

  public void test58() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    ds.Fila var2 = new ds.Fila();
    var1.enfileira((java.lang.Object)var2);
    var0.enfileira((java.lang.Object)var2);
    java.lang.Object var5 = var0.desenfileira();

  }

  public void test59() throws Throwable {

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

  public void test60() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Float var1 = new java.lang.Float(0.0f);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    java.lang.Float var4 = new java.lang.Float(0.0f);
    var3.enfileira((java.lang.Object)var4);
    var0.enfileira((java.lang.Object)var4);
    boolean var7 = var0.vazia();
    var0.imprime();
    java.lang.Object var9 = var0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 0.0f+ "'", var9.equals(0.0f));

  }

  public void test61() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.imprime();
    ds.Fila var2 = new ds.Fila();
    var0.enfileira((java.lang.Object)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var2.desenfileira();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test62() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.imprime();
    boolean var2 = var0.vazia();
    ds.Fila var3 = new ds.Fila();
    boolean var4 = var3.vazia();
    var0.enfileira((java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test63() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    ds.Fila var2 = new ds.Fila();
    var1.enfileira((java.lang.Object)var2);
    var0.enfileira((java.lang.Object)var2);
    ds.Fila var5 = new ds.Fila();
    var2.enfileira((java.lang.Object)var5);
    var2.imprime();

  }

  public void test64() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Object var3 = var0.desenfileira();
    boolean var4 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test65() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    var0.enfileira((java.lang.Object)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test66() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.imprime();
    ds.Fila var2 = new ds.Fila();
    java.lang.Double var3 = new java.lang.Double((-1.0d));
    var2.enfileira((java.lang.Object)var3);
    java.lang.Double var5 = new java.lang.Double((-1.0d));
    var2.enfileira((java.lang.Object)var5);
    boolean var7 = var2.vazia();
    java.lang.Integer var8 = new java.lang.Integer(100);
    var2.enfileira((java.lang.Object)var8);
    var0.enfileira((java.lang.Object)var8);
    java.lang.Long var11 = new java.lang.Long(100L);
    var0.enfileira((java.lang.Object)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test67() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Object var3 = var0.desenfileira();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var0.desenfileira();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test68() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.imprime();
    ds.Fila var2 = new ds.Fila();
    ds.Fila var3 = new ds.Fila();
    var3.imprime();
    boolean var5 = var3.vazia();
    var2.enfileira((java.lang.Object)var3);
    var3.imprime();
    var0.enfileira((java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test69() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var1.imprime();
    boolean var3 = var1.vazia();
    var0.enfileira((java.lang.Object)var3);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test70() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.imprime();
    ds.Fila var2 = new ds.Fila();
    var2.imprime();
    boolean var4 = var2.vazia();
    var0.enfileira((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test71() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.imprime();
    boolean var2 = var0.vazia();
    ds.Fila var3 = new ds.Fila();
    boolean var4 = var3.vazia();
    boolean var5 = var3.vazia();
    ds.Fila var6 = new ds.Fila();
    var6.imprime();
    boolean var8 = var6.vazia();
    var3.enfileira((java.lang.Object)var6);
    boolean var10 = var6.vazia();
    var0.enfileira((java.lang.Object)var10);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test72() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var1.imprime();
    boolean var3 = var1.vazia();
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var5 = new ds.Fila();
    var5.imprime();
    boolean var7 = var5.vazia();
    var0.enfileira((java.lang.Object)var5);
    ds.Fila var9 = new ds.Fila();
    boolean var10 = var9.vazia();
    boolean var11 = var9.vazia();
    java.lang.Integer var12 = new java.lang.Integer(1);
    var9.enfileira((java.lang.Object)var12);
    var5.enfileira((java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test73() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.imprime();
    boolean var2 = var0.vazia();
    boolean var3 = var0.vazia();
    boolean var4 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test74() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    ds.Fila var2 = new ds.Fila();
    var1.enfileira((java.lang.Object)var2);
    var0.enfileira((java.lang.Object)var2);
    ds.Fila var5 = new ds.Fila();
    var2.enfileira((java.lang.Object)var5);
    ds.Fila var7 = new ds.Fila();
    java.lang.Double var8 = new java.lang.Double((-1.0d));
    var7.enfileira((java.lang.Object)var8);
    java.lang.Double var10 = new java.lang.Double((-1.0d));
    var7.enfileira((java.lang.Object)var10);
    boolean var12 = var7.vazia();
    var2.enfileira((java.lang.Object)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test75() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    ds.Fila var2 = new ds.Fila();
    var2.imprime();
    boolean var4 = var2.vazia();
    var1.enfileira((java.lang.Object)var2);
    ds.Fila var6 = new ds.Fila();
    var6.imprime();
    boolean var8 = var6.vazia();
    var1.enfileira((java.lang.Object)var6);
    boolean var10 = var1.vazia();
    var0.enfileira((java.lang.Object)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test76() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Short var1 = new java.lang.Short((short)10);
    var0.enfileira((java.lang.Object)var1);

  }

  public void test77() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var1.imprime();
    boolean var3 = var1.vazia();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Object var5 = new java.lang.Object();
    var1.enfileira(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test78() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.imprime();
    ds.Fila var2 = new ds.Fila();
    java.lang.Float var3 = new java.lang.Float(0.0f);
    var2.enfileira((java.lang.Object)var3);
    ds.Fila var5 = new ds.Fila();
    java.lang.Float var6 = new java.lang.Float(0.0f);
    var5.enfileira((java.lang.Object)var6);
    var2.enfileira((java.lang.Object)var6);
    boolean var9 = var2.vazia();
    var2.imprime();
    var2.imprime();
    var0.enfileira((java.lang.Object)var2);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test79() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.imprime();
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
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test80() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    ds.Fila var3 = new ds.Fila();
    var3.imprime();
    boolean var5 = var3.vazia();
    var0.enfileira((java.lang.Object)var3);
    ds.Fila var7 = new ds.Fila();
    ds.Fila var8 = new ds.Fila();
    var7.enfileira((java.lang.Object)var8);
    var3.enfileira((java.lang.Object)var7);
    var7.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test81() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var1.imprime();
    boolean var3 = var1.vazia();
    var0.enfileira((java.lang.Object)var1);
    var1.imprime();
    ds.Fila var6 = new ds.Fila();
    boolean var7 = var6.vazia();
    boolean var8 = var6.vazia();
    boolean var9 = var6.vazia();
    var1.enfileira((java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test82() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Float var1 = new java.lang.Float(0.0f);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    java.lang.Float var4 = new java.lang.Float(0.0f);
    var3.enfileira((java.lang.Object)var4);
    var0.enfileira((java.lang.Object)var4);
    boolean var7 = var0.vazia();
    var0.imprime();
    ds.Fila var9 = new ds.Fila();
    ds.Fila var10 = new ds.Fila();
    var9.enfileira((java.lang.Object)var10);
    var0.enfileira((java.lang.Object)var10);
    var10.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test83() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    ds.Fila var3 = new ds.Fila();
    var0.enfileira((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    ds.Fila var6 = new ds.Fila();
    java.lang.Double var7 = new java.lang.Double((-1.0d));
    var6.enfileira((java.lang.Object)var7);
    var0.enfileira((java.lang.Object)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test84() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    ds.Fila var2 = new ds.Fila();
    var1.enfileira((java.lang.Object)var2);
    var0.enfileira((java.lang.Object)var2);
    var2.imprime();

  }

  public void test85() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    ds.Fila var3 = new ds.Fila();
    var3.imprime();
    boolean var5 = var3.vazia();
    var0.enfileira((java.lang.Object)var3);
    boolean var7 = var3.vazia();
    var3.imprime();
    boolean var9 = var3.vazia();
    var3.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test86() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.imprime();
    ds.Fila var2 = new ds.Fila();
    var2.imprime();
    var0.enfileira((java.lang.Object)var2);

  }

  public void test87() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    ds.Fila var3 = new ds.Fila();
    var0.enfileira((java.lang.Object)var3);
    var3.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test88() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    ds.Fila var2 = new ds.Fila();
    ds.Fila var3 = new ds.Fila();
    var2.enfileira((java.lang.Object)var3);
    var1.enfileira((java.lang.Object)var3);
    var0.enfileira((java.lang.Object)var1);

  }

  public void test89() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    java.lang.Boolean var3 = new java.lang.Boolean(true);
    var0.enfileira((java.lang.Object)var3);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test90() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    ds.Fila var2 = new ds.Fila();
    var1.enfileira((java.lang.Object)var2);
    var0.enfileira((java.lang.Object)var1);
    boolean var5 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test91() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.imprime();
    boolean var2 = var0.vazia();
    java.lang.Character var3 = new java.lang.Character('#');
    var0.enfileira((java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test92() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var1.imprime();
    boolean var3 = var1.vazia();
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var5 = new ds.Fila();
    var5.imprime();
    boolean var7 = var5.vazia();
    var0.enfileira((java.lang.Object)var5);
    var0.imprime();
    java.lang.Float var10 = new java.lang.Float(1.0f);
    var0.enfileira((java.lang.Object)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test93() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var1.imprime();
    boolean var3 = var1.vazia();
    var0.enfileira((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test94() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    ds.Fila var3 = new ds.Fila();
    var3.imprime();
    boolean var5 = var3.vazia();
    var0.enfileira((java.lang.Object)var3);
    ds.Fila var7 = new ds.Fila();
    ds.Fila var8 = new ds.Fila();
    var7.enfileira((java.lang.Object)var8);
    var3.enfileira((java.lang.Object)var7);
    boolean var11 = var3.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test95() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    ds.Fila var3 = new ds.Fila();
    var0.enfileira((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    boolean var6 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test96() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    java.lang.String var3 = "hi!";
    var0.enfileira((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    java.lang.Object var6 = var0.desenfileira();
    ds.Fila var7 = new ds.Fila();
    java.lang.Float var8 = new java.lang.Float(0.0f);
    var7.enfileira((java.lang.Object)var8);
    ds.Fila var10 = new ds.Fila();
    java.lang.Float var11 = new java.lang.Float(0.0f);
    var10.enfileira((java.lang.Object)var11);
    var7.enfileira((java.lang.Object)var11);
    boolean var14 = var7.vazia();
    var0.enfileira((java.lang.Object)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test97() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var1.imprime();
    boolean var3 = var1.vazia();
    var0.enfileira((java.lang.Object)var1);
    boolean var5 = var0.vazia();
    ds.Fila var6 = new ds.Fila();
    ds.Fila var7 = new ds.Fila();
    var7.imprime();
    boolean var9 = var7.vazia();
    var6.enfileira((java.lang.Object)var7);
    var7.imprime();
    ds.Fila var12 = new ds.Fila();
    boolean var13 = var12.vazia();
    boolean var14 = var12.vazia();
    java.lang.Boolean var15 = new java.lang.Boolean(true);
    var12.enfileira((java.lang.Object)var15);
    var7.enfileira((java.lang.Object)var15);
    var0.enfileira((java.lang.Object)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test98() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.imprime();
    java.lang.Float var2 = new java.lang.Float(1.0f);
    var0.enfileira((java.lang.Object)var2);

  }

  public void test99() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var1.imprime();
    boolean var3 = var1.vazia();
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var5 = new ds.Fila();
    var5.imprime();
    boolean var7 = var5.vazia();
    var0.enfileira((java.lang.Object)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var5.desenfileira();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test100() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test101() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Boolean var1 = new java.lang.Boolean(true);
    var0.enfileira((java.lang.Object)var1);
    java.lang.Float var3 = new java.lang.Float(1.0f);
    var0.enfileira((java.lang.Object)var3);
    ds.Fila var5 = new ds.Fila();
    var5.imprime();
    boolean var7 = var5.vazia();
    boolean var8 = var5.vazia();
    var0.enfileira((java.lang.Object)var5);
    boolean var10 = var5.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test102() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var1.imprime();
    boolean var3 = var1.vazia();
    var0.enfileira((java.lang.Object)var3);
    ds.Fila var5 = new ds.Fila();
    var5.imprime();
    boolean var7 = var5.vazia();
    var0.enfileira((java.lang.Object)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test103() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Boolean var1 = new java.lang.Boolean(true);
    var0.enfileira((java.lang.Object)var1);
    java.lang.Float var3 = new java.lang.Float(1.0f);
    var0.enfileira((java.lang.Object)var3);
    var0.imprime();
    ds.Fila var6 = new ds.Fila();
    var6.imprime();
    boolean var8 = var6.vazia();
    var0.enfileira((java.lang.Object)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test104() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    ds.Fila var3 = new ds.Fila();
    var0.enfileira((java.lang.Object)var3);
    ds.Fila var5 = new ds.Fila();
    ds.Fila var6 = new ds.Fila();
    var6.imprime();
    boolean var8 = var6.vazia();
    var5.enfileira((java.lang.Object)var6);
    var0.enfileira((java.lang.Object)var5);
    java.lang.Object var11 = var0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

}
