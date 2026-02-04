package ds.seed9006;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed9006 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.imprime();
    var0.enfileira((java.lang.Object)var0);

  }

  public void test2() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.enfileira((java.lang.Object)var0);

  }

  public void test3() throws Throwable {

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

  public void test4() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    var0.imprime();
    ds.Fila var3 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test5() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.imprime();
    boolean var2 = var0.vazia();
    ds.Fila var3 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test6() throws Throwable {

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

  public void test7() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    var0.imprime();
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

  }

  public void test8() throws Throwable {

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

  public void test9() throws Throwable {

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

  public void test10() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Byte var1 = new java.lang.Byte((byte)100);
    var0.enfileira((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test11() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.imprime();
    ds.Fila var2 = new ds.Fila();

  }

  public void test12() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Byte var1 = new java.lang.Byte((byte)100);
    var0.enfileira((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    boolean var4 = var0.vazia();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test13() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var1.imprime();
    boolean var3 = var1.vazia();
    var0.enfileira((java.lang.Object)var3);
    boolean var5 = var1.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test14() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Long var1 = new java.lang.Long(1L);
    var0.enfileira((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test15() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    var0.enfileira((java.lang.Object)var2);
    boolean var4 = var1.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test16() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var1.imprime();
    boolean var3 = var1.vazia();
    var0.enfileira((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    ds.Fila var6 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test17() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Byte var2 = new java.lang.Byte((byte)100);
    var1.enfileira((java.lang.Object)var2);
    boolean var4 = var1.vazia();
    var0.enfileira((java.lang.Object)var4);
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test18() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();

  }

  public void test19() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Byte var2 = new java.lang.Byte((byte)100);
    var1.enfileira((java.lang.Object)var2);
    boolean var4 = var1.vazia();
    var0.enfileira((java.lang.Object)var4);
    boolean var6 = var0.vazia();
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test20() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Byte var2 = new java.lang.Byte((byte)100);
    var1.enfileira((java.lang.Object)var2);
    boolean var4 = var1.vazia();
    var0.enfileira((java.lang.Object)var4);
    boolean var6 = var0.vazia();
    boolean var7 = var0.vazia();
    ds.Fila var8 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test21() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    var0.enfileira((java.lang.Object)var2);
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test22() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Object var3 = var0.desenfileira();
    var1.imprime();

  }

  public void test23() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    var0.imprime();
    var0.enfileira((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test24() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Object var3 = var0.desenfileira();
    boolean var4 = var0.vazia();
    var1.enfileira(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test25() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Long var1 = new java.lang.Long(1L);
    var0.enfileira((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test26() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    var0.enfileira((java.lang.Object)var2);
    java.lang.Object var4 = var0.desenfileira();
    var1.enfileira(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test27() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    var0.enfileira((java.lang.Object)var2);
    java.lang.Object var4 = var0.desenfileira();
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test28() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    var0.enfileira((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test29() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    var0.enfileira((java.lang.Object)var2);
    java.lang.Object var4 = var0.desenfileira();
    boolean var5 = var0.vazia();
    ds.Fila var6 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test30() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var1.imprime();
    boolean var3 = var1.vazia();
    var0.enfileira((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    boolean var6 = var0.vazia();
    var1.enfileira((java.lang.Object)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test31() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Byte var2 = new java.lang.Byte((byte)100);
    var1.enfileira((java.lang.Object)var2);
    boolean var4 = var1.vazia();
    var0.enfileira((java.lang.Object)var4);
    boolean var6 = var0.vazia();
    boolean var7 = var0.vazia();
    var0.imprime();
    ds.Fila var9 = new ds.Fila();
    ds.Fila var10 = new ds.Fila();
    java.lang.Byte var11 = new java.lang.Byte((byte)100);
    var10.enfileira((java.lang.Object)var11);
    boolean var13 = var10.vazia();
    var9.enfileira((java.lang.Object)var13);
    boolean var15 = var9.vazia();
    var0.enfileira((java.lang.Object)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test32() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test33() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    var0.enfileira((java.lang.Object)var2);
    java.lang.Object var4 = var0.desenfileira();
    boolean var5 = var0.vazia();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var0.desenfileira();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test34() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.imprime();
    boolean var2 = var0.vazia();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test35() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Byte var1 = new java.lang.Byte((byte)100);
    var0.enfileira((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    boolean var4 = var0.vazia();
    ds.Fila var5 = new ds.Fila();
    var0.enfileira((java.lang.Object)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var5.desenfileira();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test36() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Float var1 = new java.lang.Float((-1.0f));
    var0.enfileira((java.lang.Object)var1);

  }

  public void test37() throws Throwable {

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

  public void test38() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    var1.imprime();
    var1.imprime();
    ds.Fila var5 = new ds.Fila();
    var1.enfileira((java.lang.Object)var5);
    var0.enfileira((java.lang.Object)var5);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test39() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    var0.imprime();
    var0.imprime();
    var0.imprime();
    ds.Fila var5 = new ds.Fila();
    var5.imprime();
    boolean var7 = var5.vazia();
    boolean var8 = var5.vazia();
    var0.enfileira((java.lang.Object)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test40() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    var0.imprime();
    var0.imprime();
    var0.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var0.desenfileira();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test41() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    var0.imprime();

  }

  public void test42() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    ds.Fila var2 = new ds.Fila();
    boolean var3 = var2.vazia();
    var2.imprime();
    var0.enfileira((java.lang.Object)var2);
    ds.Fila var6 = new ds.Fila();
    ds.Fila var7 = new ds.Fila();
    java.lang.Byte var8 = new java.lang.Byte((byte)100);
    var7.enfileira((java.lang.Object)var8);
    boolean var10 = var7.vazia();
    var6.enfileira((java.lang.Object)var10);
    boolean var12 = var6.vazia();
    var2.enfileira((java.lang.Object)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test43() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var1.imprime();
    boolean var3 = var1.vazia();
    var0.enfileira((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    boolean var6 = var0.vazia();
    boolean var7 = var0.vazia();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test44() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Long var1 = new java.lang.Long(1L);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    boolean var4 = var3.vazia();
    var3.imprime();
    var3.imprime();
    var3.imprime();
    var0.enfileira((java.lang.Object)var3);
    java.lang.Object var9 = var0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 1L+ "'", var9.equals(1L));

  }

  public void test45() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Long var1 = new java.lang.Long(1L);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    boolean var4 = var3.vazia();
    var3.imprime();
    var3.imprime();
    var3.imprime();
    var0.enfileira((java.lang.Object)var3);
    boolean var9 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test46() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    var0.imprime();
    boolean var3 = var0.vazia();
    boolean var4 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test47() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Byte var2 = new java.lang.Byte((byte)100);
    var1.enfileira((java.lang.Object)var2);
    boolean var4 = var1.vazia();
    boolean var5 = var1.vazia();
    ds.Fila var6 = new ds.Fila();
    var1.enfileira((java.lang.Object)var6);
    var0.enfileira((java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test48() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    var0.imprime();
    var0.imprime();
    ds.Fila var4 = new ds.Fila();
    var4.imprime();
    java.lang.Object var6 = new java.lang.Object();
    var4.enfileira(var6);
    boolean var8 = var4.vazia();
    var0.enfileira((java.lang.Object)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test49() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    var0.enfileira((java.lang.Object)var2);
    java.lang.Object var4 = var0.desenfileira();
    boolean var5 = var0.vazia();
    var0.imprime();
    java.lang.Character var7 = new java.lang.Character('4');
    var0.enfileira((java.lang.Object)var7);
    boolean var9 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test50() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Long var1 = new java.lang.Long(1L);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    boolean var4 = var3.vazia();
    var3.imprime();
    var3.imprime();
    var3.imprime();
    var0.enfileira((java.lang.Object)var3);
    var3.imprime();
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

  }

  public void test51() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Object var3 = var0.desenfileira();
    boolean var4 = var0.vazia();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var0.desenfileira();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test52() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Long var2 = new java.lang.Long(1L);
    var1.enfileira((java.lang.Object)var2);
    var0.enfileira((java.lang.Object)var2);
    ds.Fila var5 = new ds.Fila();
    ds.Fila var6 = new ds.Fila();
    java.lang.Byte var7 = new java.lang.Byte((byte)100);
    var6.enfileira((java.lang.Object)var7);
    boolean var9 = var6.vazia();
    var5.enfileira((java.lang.Object)var9);
    boolean var11 = var5.vazia();
    boolean var12 = var5.vazia();
    var5.imprime();
    var0.enfileira((java.lang.Object)var5);
    ds.Fila var15 = new ds.Fila();
    boolean var16 = var15.vazia();
    var15.imprime();
    boolean var18 = var15.vazia();
    var0.enfileira((java.lang.Object)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test53() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    var0.imprime();
    var0.imprime();
    java.lang.Character var4 = new java.lang.Character(' ');
    var0.enfileira((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test54() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.imprime();
    boolean var2 = var0.vazia();
    java.lang.Byte var3 = new java.lang.Byte((byte)100);
    var0.enfileira((java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test55() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var1.imprime();
    boolean var3 = var1.vazia();
    var0.enfileira((java.lang.Object)var3);
    ds.Fila var5 = new ds.Fila();
    ds.Fila var6 = new ds.Fila();
    boolean var7 = var6.vazia();
    var5.enfileira((java.lang.Object)var7);
    boolean var9 = var5.vazia();
    var0.enfileira((java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test56() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test57() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.imprime();
    boolean var2 = var0.vazia();
    ds.Fila var3 = new ds.Fila();
    ds.Fila var4 = new ds.Fila();
    boolean var5 = var4.vazia();
    var3.enfileira((java.lang.Object)var5);
    var3.imprime();
    var0.enfileira((java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test58() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.imprime();
    ds.Fila var2 = new ds.Fila();
    var0.enfileira((java.lang.Object)var2);
    ds.Fila var4 = new ds.Fila();
    var2.enfileira((java.lang.Object)var4);

  }

  public void test59() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.imprime();
    ds.Fila var2 = new ds.Fila();
    boolean var3 = var2.vazia();
    var2.imprime();
    var0.enfileira((java.lang.Object)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test60() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    var0.imprime();
    ds.Fila var3 = new ds.Fila();
    var0.enfileira((java.lang.Object)var3);
    java.lang.Object var5 = var0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test61() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Byte var1 = new java.lang.Byte((byte)100);
    var0.enfileira((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    boolean var4 = var0.vazia();
    ds.Fila var5 = new ds.Fila();
    var0.enfileira((java.lang.Object)var5);
    ds.Fila var7 = new ds.Fila();
    boolean var8 = var7.vazia();
    var0.enfileira((java.lang.Object)var8);
    ds.Fila var10 = new ds.Fila();
    java.lang.Character var11 = new java.lang.Character('4');
    var10.enfileira((java.lang.Object)var11);
    java.lang.Object var13 = var10.desenfileira();
    var0.enfileira(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + '4'+ "'", var13.equals('4'));

  }

  public void test62() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    var0.imprime();
    var0.imprime();
    boolean var4 = var0.vazia();
    ds.Fila var5 = new ds.Fila();
    java.lang.Long var6 = new java.lang.Long(1L);
    var5.enfileira((java.lang.Object)var6);
    ds.Fila var8 = new ds.Fila();
    boolean var9 = var8.vazia();
    var8.imprime();
    var8.imprime();
    var8.imprime();
    var5.enfileira((java.lang.Object)var8);
    var0.enfileira((java.lang.Object)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test63() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    var0.imprime();
    ds.Fila var3 = new ds.Fila();
    var3.imprime();
    var3.imprime();
    var0.enfileira((java.lang.Object)var3);
    ds.Fila var7 = new ds.Fila();
    var0.enfileira((java.lang.Object)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test64() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    var0.enfileira((java.lang.Object)var2);
    java.lang.Object var4 = var0.desenfileira();
    var0.imprime();
    java.lang.Long var6 = new java.lang.Long(0L);
    var0.enfileira((java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

}
