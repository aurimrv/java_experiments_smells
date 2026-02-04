package ds.seed9006;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed9006 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Byte var1 = new java.lang.Byte((byte)(-1));
    var0.enfileira((java.lang.Object)var1);
    java.lang.Object var3 = var0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + (byte)(-1)+ "'", var3.equals((byte)(-1)));

  }

  public void test2() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Byte var1 = new java.lang.Byte((byte)(-1));
    var0.enfileira((java.lang.Object)var1);
    java.lang.Double var3 = new java.lang.Double(10.0d);
    var0.enfileira((java.lang.Object)var3);
    ds.Fila var5 = new ds.Fila();

  }

  public void test3() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Byte var1 = new java.lang.Byte((byte)(-1));
    var0.enfileira((java.lang.Object)var1);
    java.lang.Double var3 = new java.lang.Double(10.0d);
    var0.enfileira((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    ds.Fila var6 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test4() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.enfileira((java.lang.Object)var0);

  }

  public void test5() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Byte var1 = new java.lang.Byte((byte)(-1));
    var0.enfileira((java.lang.Object)var1);
    java.lang.Double var3 = new java.lang.Double(10.0d);
    var0.enfileira((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    java.lang.Float var6 = new java.lang.Float(10.0f);
    var0.enfileira((java.lang.Object)var6);
    ds.Fila var8 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

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
    java.lang.Byte var1 = new java.lang.Byte((byte)(-1));
    var0.enfileira((java.lang.Object)var1);
    java.lang.Double var3 = new java.lang.Double(10.0d);
    var0.enfileira((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    java.lang.Float var6 = new java.lang.Float(10.0f);
    var0.enfileira((java.lang.Object)var6);
    var0.imprime();
    var0.enfileira((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test8() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Long var1 = new java.lang.Long(1L);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();

  }

  public void test9() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Long var1 = new java.lang.Long(1L);
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

  public void test10() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Long var1 = new java.lang.Long(1L);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    var0.enfileira((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    var3.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test11() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Byte var1 = new java.lang.Byte((byte)(-1));
    var0.enfileira((java.lang.Object)var1);
    java.lang.Double var3 = new java.lang.Double(10.0d);
    var0.enfileira((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    java.lang.Float var6 = new java.lang.Float(10.0f);
    var0.enfileira((java.lang.Object)var6);
    var0.imprime();
    boolean var9 = var0.vazia();
    java.lang.Object var10 = var0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (byte)(-1)+ "'", var10.equals((byte)(-1)));

  }

  public void test12() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Byte var1 = new java.lang.Byte((byte)(-1));
    var0.enfileira((java.lang.Object)var1);
    java.lang.Double var3 = new java.lang.Double(10.0d);
    var0.enfileira((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    java.lang.Float var6 = new java.lang.Float(10.0f);
    var0.enfileira((java.lang.Object)var6);
    var0.imprime();
    boolean var9 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test13() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Long var1 = new java.lang.Long(1L);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    var0.enfileira((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    java.lang.Short var6 = new java.lang.Short((short)0);
    var0.enfileira((java.lang.Object)var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var3.desenfileira();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test14() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Long var1 = new java.lang.Long(1L);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    var0.enfileira((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    java.lang.Short var6 = new java.lang.Short((short)0);
    var0.enfileira((java.lang.Object)var6);
    var0.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var3.desenfileira();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test15() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    ds.Fila var2 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test16() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Long var1 = new java.lang.Long(1L);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    var0.enfileira((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    java.lang.Short var6 = new java.lang.Short((short)0);
    var0.enfileira((java.lang.Object)var6);
    var0.imprime();
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
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test17() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test18() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test19() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    var1.imprime();

  }

  public void test20() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    boolean var3 = var1.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test21() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    var0.enfileira((java.lang.Object)var3);
    var3.imprime();

  }

  public void test22() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Long var3 = new java.lang.Long(0L);
    var1.enfileira((java.lang.Object)var3);
    java.lang.Object var5 = var1.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 0L+ "'", var5.equals(0L));

  }

  public void test23() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Long var3 = new java.lang.Long(0L);
    var1.enfileira((java.lang.Object)var3);
    ds.Fila var5 = new ds.Fila();
    java.lang.Long var6 = new java.lang.Long(1L);
    var5.enfileira((java.lang.Object)var6);
    ds.Fila var8 = new ds.Fila();
    var5.enfileira((java.lang.Object)var8);
    boolean var10 = var5.vazia();
    java.lang.Short var11 = new java.lang.Short((short)0);
    var5.enfileira((java.lang.Object)var11);
    var1.enfileira((java.lang.Object)var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var14 = var8.desenfileira();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test24() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Long var2 = new java.lang.Long(1L);
    var1.enfileira((java.lang.Object)var2);
    ds.Fila var4 = new ds.Fila();
    var1.enfileira((java.lang.Object)var4);
    boolean var6 = var1.vazia();
    java.lang.Short var7 = new java.lang.Short((short)0);
    var1.enfileira((java.lang.Object)var7);
    var1.imprime();
    boolean var10 = var1.vazia();
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var12 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test25() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Long var2 = new java.lang.Long(1L);
    var1.enfileira((java.lang.Object)var2);
    ds.Fila var4 = new ds.Fila();
    var1.enfileira((java.lang.Object)var4);
    boolean var6 = var1.vazia();
    java.lang.Short var7 = new java.lang.Short((short)0);
    var1.enfileira((java.lang.Object)var7);
    var1.imprime();
    boolean var10 = var1.vazia();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Double var12 = new java.lang.Double(0.0d);
    var0.enfileira((java.lang.Object)var12);
    boolean var14 = var4.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test26() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Long var3 = new java.lang.Long(0L);
    var1.enfileira((java.lang.Object)var3);
    ds.Fila var5 = new ds.Fila();
    java.lang.Long var6 = new java.lang.Long(1L);
    var5.enfileira((java.lang.Object)var6);
    ds.Fila var8 = new ds.Fila();
    var5.enfileira((java.lang.Object)var8);
    boolean var10 = var5.vazia();
    java.lang.Short var11 = new java.lang.Short((short)0);
    var5.enfileira((java.lang.Object)var11);
    var1.enfileira((java.lang.Object)var11);
    ds.Fila var14 = new ds.Fila();
    ds.Fila var15 = new ds.Fila();
    java.lang.Long var16 = new java.lang.Long(1L);
    var15.enfileira((java.lang.Object)var16);
    ds.Fila var18 = new ds.Fila();
    var15.enfileira((java.lang.Object)var18);
    boolean var20 = var15.vazia();
    java.lang.Short var21 = new java.lang.Short((short)0);
    var15.enfileira((java.lang.Object)var21);
    var15.imprime();
    boolean var24 = var15.vazia();
    var14.enfileira((java.lang.Object)var15);
    var1.enfileira((java.lang.Object)var14);
    ds.Fila var27 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test27() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Long var2 = new java.lang.Long(1L);
    var1.enfileira((java.lang.Object)var2);
    ds.Fila var4 = new ds.Fila();
    var1.enfileira((java.lang.Object)var4);
    var0.enfileira((java.lang.Object)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var4.desenfileira();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test28() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Long var2 = new java.lang.Long(1L);
    var1.enfileira((java.lang.Object)var2);
    ds.Fila var4 = new ds.Fila();
    var1.enfileira((java.lang.Object)var4);
    var0.enfileira((java.lang.Object)var1);
    java.lang.Long var7 = new java.lang.Long(1L);
    var0.enfileira((java.lang.Object)var7);
    ds.Fila var9 = new ds.Fila();

  }

  public void test29() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Long var3 = new java.lang.Long(0L);
    var1.enfileira((java.lang.Object)var3);
    ds.Fila var5 = new ds.Fila();
    java.lang.Long var6 = new java.lang.Long(1L);
    var5.enfileira((java.lang.Object)var6);
    ds.Fila var8 = new ds.Fila();
    var5.enfileira((java.lang.Object)var8);
    boolean var10 = var5.vazia();
    java.lang.Short var11 = new java.lang.Short((short)0);
    var5.enfileira((java.lang.Object)var11);
    var1.enfileira((java.lang.Object)var11);
    ds.Fila var14 = new ds.Fila();
    ds.Fila var15 = new ds.Fila();
    java.lang.Long var16 = new java.lang.Long(1L);
    var15.enfileira((java.lang.Object)var16);
    ds.Fila var18 = new ds.Fila();
    var15.enfileira((java.lang.Object)var18);
    boolean var20 = var15.vazia();
    java.lang.Short var21 = new java.lang.Short((short)0);
    var15.enfileira((java.lang.Object)var21);
    var15.imprime();
    boolean var24 = var15.vazia();
    var14.enfileira((java.lang.Object)var15);
    var1.enfileira((java.lang.Object)var14);
    boolean var27 = var1.vazia();
    var18.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test30() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Long var3 = new java.lang.Long(0L);
    var1.enfileira((java.lang.Object)var3);
    ds.Fila var5 = new ds.Fila();
    java.lang.Long var6 = new java.lang.Long(1L);
    var5.enfileira((java.lang.Object)var6);
    ds.Fila var8 = new ds.Fila();
    var5.enfileira((java.lang.Object)var8);
    boolean var10 = var5.vazia();
    java.lang.Short var11 = new java.lang.Short((short)0);
    var5.enfileira((java.lang.Object)var11);
    var1.enfileira((java.lang.Object)var11);
    ds.Fila var14 = new ds.Fila();
    ds.Fila var15 = new ds.Fila();
    java.lang.Long var16 = new java.lang.Long(1L);
    var15.enfileira((java.lang.Object)var16);
    ds.Fila var18 = new ds.Fila();
    var15.enfileira((java.lang.Object)var18);
    boolean var20 = var15.vazia();
    java.lang.Short var21 = new java.lang.Short((short)0);
    var15.enfileira((java.lang.Object)var21);
    var15.imprime();
    boolean var24 = var15.vazia();
    var14.enfileira((java.lang.Object)var15);
    var1.enfileira((java.lang.Object)var14);
    boolean var27 = var1.vazia();
    boolean var28 = var1.vazia();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var29 = var18.desenfileira();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test31() throws Throwable {

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

  public void test32() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Long var2 = new java.lang.Long(1L);
    var1.enfileira((java.lang.Object)var2);
    ds.Fila var4 = new ds.Fila();
    var1.enfileira((java.lang.Object)var4);
    boolean var6 = var1.vazia();
    java.lang.Short var7 = new java.lang.Short((short)0);
    var1.enfileira((java.lang.Object)var7);
    var1.imprime();
    boolean var10 = var1.vazia();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Double var12 = new java.lang.Double(0.0d);
    var0.enfileira((java.lang.Object)var12);
    ds.Fila var14 = new ds.Fila();
    var0.enfileira((java.lang.Object)var14);
    ds.Fila var16 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test33() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Long var2 = new java.lang.Long(1L);
    var1.enfileira((java.lang.Object)var2);
    ds.Fila var4 = new ds.Fila();
    var1.enfileira((java.lang.Object)var4);
    boolean var6 = var1.vazia();
    java.lang.Short var7 = new java.lang.Short((short)0);
    var1.enfileira((java.lang.Object)var7);
    var1.imprime();
    boolean var10 = var1.vazia();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Double var12 = new java.lang.Double(0.0d);
    var0.enfileira((java.lang.Object)var12);
    ds.Fila var14 = new ds.Fila();
    var0.enfileira((java.lang.Object)var14);
    java.lang.Long var16 = new java.lang.Long(100L);
    var0.enfileira((java.lang.Object)var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var18 = var14.desenfileira();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test34() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    ds.Fila var2 = new ds.Fila();
    java.lang.Long var3 = new java.lang.Long(1L);
    var2.enfileira((java.lang.Object)var3);
    ds.Fila var5 = new ds.Fila();
    var2.enfileira((java.lang.Object)var5);
    var1.enfileira((java.lang.Object)var2);
    java.lang.Long var8 = new java.lang.Long(1L);
    var1.enfileira((java.lang.Object)var8);
    var0.enfileira((java.lang.Object)var8);
    var5.imprime();

  }

  public void test35() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    var0.enfileira((java.lang.Object)var3);
    ds.Fila var5 = new ds.Fila();
    ds.Fila var6 = new ds.Fila();
    var5.enfileira((java.lang.Object)var6);
    var3.enfileira((java.lang.Object)var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var6.desenfileira();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test36() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    ds.Fila var2 = new ds.Fila();
    java.lang.Long var3 = new java.lang.Long(1L);
    var2.enfileira((java.lang.Object)var3);
    ds.Fila var5 = new ds.Fila();
    var2.enfileira((java.lang.Object)var5);
    var1.enfileira((java.lang.Object)var2);
    java.lang.Long var8 = new java.lang.Long(1L);
    var1.enfileira((java.lang.Object)var8);
    var0.enfileira((java.lang.Object)var8);
    ds.Fila var11 = new ds.Fila();
    java.lang.Byte var12 = new java.lang.Byte((byte)(-1));
    var11.enfileira((java.lang.Object)var12);
    java.lang.Double var14 = new java.lang.Double(10.0d);
    var11.enfileira((java.lang.Object)var14);
    boolean var16 = var11.vazia();
    java.lang.Float var17 = new java.lang.Float(10.0f);
    var11.enfileira((java.lang.Object)var17);
    var0.enfileira((java.lang.Object)var17);
    ds.Fila var20 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test37() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    ds.Fila var2 = new ds.Fila();
    java.lang.Long var3 = new java.lang.Long(1L);
    var2.enfileira((java.lang.Object)var3);
    ds.Fila var5 = new ds.Fila();
    var2.enfileira((java.lang.Object)var5);
    var1.enfileira((java.lang.Object)var2);
    java.lang.Long var8 = new java.lang.Long(1L);
    var1.enfileira((java.lang.Object)var8);
    var0.enfileira((java.lang.Object)var8);
    ds.Fila var11 = new ds.Fila();
    java.lang.Byte var12 = new java.lang.Byte((byte)(-1));
    var11.enfileira((java.lang.Object)var12);
    java.lang.Double var14 = new java.lang.Double(10.0d);
    var11.enfileira((java.lang.Object)var14);
    boolean var16 = var11.vazia();
    java.lang.Float var17 = new java.lang.Float(10.0f);
    var11.enfileira((java.lang.Object)var17);
    var0.enfileira((java.lang.Object)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test38() throws Throwable {

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

  public void test39() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Long var2 = new java.lang.Long(1L);
    var1.enfileira((java.lang.Object)var2);
    ds.Fila var4 = new ds.Fila();
    var1.enfileira((java.lang.Object)var4);
    boolean var6 = var1.vazia();
    java.lang.Short var7 = new java.lang.Short((short)0);
    var1.enfileira((java.lang.Object)var7);
    var1.imprime();
    boolean var10 = var1.vazia();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Double var12 = new java.lang.Double(0.0d);
    var0.enfileira((java.lang.Object)var12);
    ds.Fila var14 = new ds.Fila();
    var0.enfileira((java.lang.Object)var14);
    java.lang.Long var16 = new java.lang.Long(100L);
    var0.enfileira((java.lang.Object)var16);
    boolean var18 = var0.vazia();
    var14.enfileira((java.lang.Object)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test40() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Long var2 = new java.lang.Long(1L);
    var1.enfileira((java.lang.Object)var2);
    ds.Fila var4 = new ds.Fila();
    var1.enfileira((java.lang.Object)var4);
    boolean var6 = var1.vazia();
    java.lang.Short var7 = new java.lang.Short((short)0);
    var1.enfileira((java.lang.Object)var7);
    var1.imprime();
    boolean var10 = var1.vazia();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Double var12 = new java.lang.Double(0.0d);
    var0.enfileira((java.lang.Object)var12);
    ds.Fila var14 = new ds.Fila();
    var0.enfileira((java.lang.Object)var14);
    java.lang.Long var16 = new java.lang.Long(100L);
    var0.enfileira((java.lang.Object)var16);
    boolean var18 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test41() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Long var1 = new java.lang.Long(1L);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    var0.enfileira((java.lang.Object)var3);
    ds.Fila var5 = new ds.Fila();
    boolean var6 = var5.vazia();
    var0.enfileira((java.lang.Object)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test42() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    var0.enfileira((java.lang.Object)var3);
    ds.Fila var5 = new ds.Fila();
    ds.Fila var6 = new ds.Fila();
    var5.enfileira((java.lang.Object)var6);
    var3.enfileira((java.lang.Object)var6);
    var6.imprime();

  }

  public void test43() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Long var1 = new java.lang.Long(1L);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    var0.enfileira((java.lang.Object)var3);
    java.lang.Short var5 = new java.lang.Short((short)(-1));
    var3.enfileira((java.lang.Object)var5);

  }

  public void test44() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    var0.enfileira((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test45() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Object var3 = var0.desenfileira();

  }

  public void test46() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Byte var1 = new java.lang.Byte((byte)(-1));
    var0.enfileira((java.lang.Object)var1);
    java.lang.Double var3 = new java.lang.Double(10.0d);
    var0.enfileira((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    java.lang.Float var6 = new java.lang.Float(10.0f);
    var0.enfileira((java.lang.Object)var6);
    java.lang.String var8 = "hi!";
    var0.enfileira((java.lang.Object)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test47() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test48() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Long var2 = new java.lang.Long(1L);
    var1.enfileira((java.lang.Object)var2);
    ds.Fila var4 = new ds.Fila();
    var1.enfileira((java.lang.Object)var4);
    boolean var6 = var1.vazia();
    java.lang.Short var7 = new java.lang.Short((short)0);
    var1.enfileira((java.lang.Object)var7);
    var1.imprime();
    boolean var10 = var1.vazia();
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var12 = new ds.Fila();
    ds.Fila var13 = new ds.Fila();
    var12.enfileira((java.lang.Object)var13);
    var1.enfileira((java.lang.Object)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test49() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Long var2 = new java.lang.Long(1L);
    var1.enfileira((java.lang.Object)var2);
    ds.Fila var4 = new ds.Fila();
    var1.enfileira((java.lang.Object)var4);
    boolean var6 = var1.vazia();
    java.lang.Short var7 = new java.lang.Short((short)0);
    var1.enfileira((java.lang.Object)var7);
    var1.imprime();
    boolean var10 = var1.vazia();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Double var12 = new java.lang.Double(0.0d);
    var0.enfileira((java.lang.Object)var12);
    ds.Fila var14 = new ds.Fila();
    var0.enfileira((java.lang.Object)var14);
    java.lang.Long var16 = new java.lang.Long(100L);
    var0.enfileira((java.lang.Object)var16);
    java.lang.Object var18 = var0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test50() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Double var1 = new java.lang.Double(1.0d);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    var0.enfileira((java.lang.Object)var3);
    var3.imprime();

  }

  public void test51() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Long var3 = new java.lang.Long(0L);
    var1.enfileira((java.lang.Object)var3);
    ds.Fila var5 = new ds.Fila();
    java.lang.Long var6 = new java.lang.Long(1L);
    var5.enfileira((java.lang.Object)var6);
    ds.Fila var8 = new ds.Fila();
    var5.enfileira((java.lang.Object)var8);
    boolean var10 = var5.vazia();
    java.lang.Short var11 = new java.lang.Short((short)0);
    var5.enfileira((java.lang.Object)var11);
    var1.enfileira((java.lang.Object)var11);
    ds.Fila var14 = new ds.Fila();
    ds.Fila var15 = new ds.Fila();
    java.lang.Long var16 = new java.lang.Long(1L);
    var15.enfileira((java.lang.Object)var16);
    ds.Fila var18 = new ds.Fila();
    var15.enfileira((java.lang.Object)var18);
    boolean var20 = var15.vazia();
    java.lang.Short var21 = new java.lang.Short((short)0);
    var15.enfileira((java.lang.Object)var21);
    var15.imprime();
    boolean var24 = var15.vazia();
    var14.enfileira((java.lang.Object)var15);
    var1.enfileira((java.lang.Object)var14);
    boolean var27 = var1.vazia();
    java.lang.Object var28 = var1.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + 0L+ "'", var28.equals(0L));

  }

  public void test52() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Long var1 = new java.lang.Long(100L);
    var0.enfileira((java.lang.Object)var1);

  }

  public void test53() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Double var1 = new java.lang.Double(10.0d);
    var0.enfileira((java.lang.Object)var1);
    java.lang.Object var3 = var0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 10.0d+ "'", var3.equals(10.0d));

  }

  public void test54() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    ds.Fila var2 = new ds.Fila();
    var1.enfileira((java.lang.Object)var2);
    java.lang.Long var4 = new java.lang.Long(0L);
    var2.enfileira((java.lang.Object)var4);
    ds.Fila var6 = new ds.Fila();
    java.lang.Long var7 = new java.lang.Long(1L);
    var6.enfileira((java.lang.Object)var7);
    ds.Fila var9 = new ds.Fila();
    var6.enfileira((java.lang.Object)var9);
    boolean var11 = var6.vazia();
    java.lang.Short var12 = new java.lang.Short((short)0);
    var6.enfileira((java.lang.Object)var12);
    var2.enfileira((java.lang.Object)var12);
    ds.Fila var15 = new ds.Fila();
    ds.Fila var16 = new ds.Fila();
    java.lang.Long var17 = new java.lang.Long(1L);
    var16.enfileira((java.lang.Object)var17);
    ds.Fila var19 = new ds.Fila();
    var16.enfileira((java.lang.Object)var19);
    boolean var21 = var16.vazia();
    java.lang.Short var22 = new java.lang.Short((short)0);
    var16.enfileira((java.lang.Object)var22);
    var16.imprime();
    boolean var25 = var16.vazia();
    var15.enfileira((java.lang.Object)var16);
    var2.enfileira((java.lang.Object)var15);
    boolean var28 = var2.vazia();
    boolean var29 = var2.vazia();
    boolean var30 = var2.vazia();
    var0.enfileira((java.lang.Object)var2);
    java.lang.Object var32 = var0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test55() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Long var2 = new java.lang.Long(1L);
    var1.enfileira((java.lang.Object)var2);
    ds.Fila var4 = new ds.Fila();
    var1.enfileira((java.lang.Object)var4);
    var0.enfileira((java.lang.Object)var1);
    var1.imprime();

  }

  public void test56() throws Throwable {

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

  public void test57() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Short var3 = new java.lang.Short((short)(-1));
    var1.enfileira((java.lang.Object)var3);

  }

  public void test58() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Byte var1 = new java.lang.Byte((byte)(-1));
    var0.enfileira((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test59() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Long var1 = new java.lang.Long(1L);
    var0.enfileira((java.lang.Object)var1);
    var0.imprime();

  }

  public void test60() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Long var3 = new java.lang.Long(0L);
    var1.enfileira((java.lang.Object)var3);
    ds.Fila var5 = new ds.Fila();
    java.lang.Long var6 = new java.lang.Long(1L);
    var5.enfileira((java.lang.Object)var6);
    ds.Fila var8 = new ds.Fila();
    var5.enfileira((java.lang.Object)var8);
    boolean var10 = var5.vazia();
    java.lang.Short var11 = new java.lang.Short((short)0);
    var5.enfileira((java.lang.Object)var11);
    var1.enfileira((java.lang.Object)var11);
    ds.Fila var14 = new ds.Fila();
    ds.Fila var15 = new ds.Fila();
    java.lang.Long var16 = new java.lang.Long(1L);
    var15.enfileira((java.lang.Object)var16);
    ds.Fila var18 = new ds.Fila();
    var15.enfileira((java.lang.Object)var18);
    boolean var20 = var15.vazia();
    java.lang.Short var21 = new java.lang.Short((short)0);
    var15.enfileira((java.lang.Object)var21);
    var15.imprime();
    boolean var24 = var15.vazia();
    var14.enfileira((java.lang.Object)var15);
    var1.enfileira((java.lang.Object)var14);
    boolean var27 = var1.vazia();
    boolean var28 = var1.vazia();
    boolean var29 = var1.vazia();
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test61() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Long var2 = new java.lang.Long(1L);
    var1.enfileira((java.lang.Object)var2);
    ds.Fila var4 = new ds.Fila();
    var1.enfileira((java.lang.Object)var4);
    boolean var6 = var1.vazia();
    java.lang.Short var7 = new java.lang.Short((short)0);
    var1.enfileira((java.lang.Object)var7);
    var1.imprime();
    boolean var10 = var1.vazia();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Double var12 = new java.lang.Double(0.0d);
    var0.enfileira((java.lang.Object)var12);
    ds.Fila var14 = new ds.Fila();
    var0.enfileira((java.lang.Object)var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var16 = var14.desenfileira();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test62() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Long var3 = new java.lang.Long(0L);
    var1.enfileira((java.lang.Object)var3);
    ds.Fila var5 = new ds.Fila();
    java.lang.Long var6 = new java.lang.Long(1L);
    var5.enfileira((java.lang.Object)var6);
    ds.Fila var8 = new ds.Fila();
    var5.enfileira((java.lang.Object)var8);
    boolean var10 = var5.vazia();
    java.lang.Short var11 = new java.lang.Short((short)0);
    var5.enfileira((java.lang.Object)var11);
    var1.enfileira((java.lang.Object)var11);
    ds.Fila var14 = new ds.Fila();
    ds.Fila var15 = new ds.Fila();
    java.lang.Long var16 = new java.lang.Long(1L);
    var15.enfileira((java.lang.Object)var16);
    ds.Fila var18 = new ds.Fila();
    var15.enfileira((java.lang.Object)var18);
    boolean var20 = var15.vazia();
    java.lang.Short var21 = new java.lang.Short((short)0);
    var15.enfileira((java.lang.Object)var21);
    var15.imprime();
    boolean var24 = var15.vazia();
    var14.enfileira((java.lang.Object)var15);
    var1.enfileira((java.lang.Object)var14);
    boolean var27 = var1.vazia();
    boolean var28 = var1.vazia();
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test63() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Long var2 = new java.lang.Long(1L);
    var1.enfileira((java.lang.Object)var2);
    ds.Fila var4 = new ds.Fila();
    var1.enfileira((java.lang.Object)var4);
    var0.enfileira((java.lang.Object)var1);
    boolean var7 = var1.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test64() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    ds.Fila var2 = new ds.Fila();
    java.lang.Long var3 = new java.lang.Long(1L);
    var2.enfileira((java.lang.Object)var3);
    ds.Fila var5 = new ds.Fila();
    var2.enfileira((java.lang.Object)var5);
    boolean var7 = var2.vazia();
    java.lang.Short var8 = new java.lang.Short((short)0);
    var2.enfileira((java.lang.Object)var8);
    var2.imprime();
    boolean var11 = var2.vazia();
    var1.enfileira((java.lang.Object)var2);
    java.lang.Double var13 = new java.lang.Double(0.0d);
    var1.enfileira((java.lang.Object)var13);
    ds.Fila var15 = new ds.Fila();
    var1.enfileira((java.lang.Object)var15);
    boolean var17 = var1.vazia();
    var0.enfileira((java.lang.Object)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test65() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Long var2 = new java.lang.Long(1L);
    var1.enfileira((java.lang.Object)var2);
    ds.Fila var4 = new ds.Fila();
    var1.enfileira((java.lang.Object)var4);
    boolean var6 = var1.vazia();
    java.lang.Short var7 = new java.lang.Short((short)0);
    var1.enfileira((java.lang.Object)var7);
    var1.imprime();
    boolean var10 = var1.vazia();
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var12 = new ds.Fila();
    var1.enfileira((java.lang.Object)var12);
    var12.imprime();
    var12.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test66() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.imprime();
    var0.imprime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var0.desenfileira();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test67() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Byte var1 = new java.lang.Byte((byte)(-1));
    var0.enfileira((java.lang.Object)var1);
    java.lang.Double var3 = new java.lang.Double(10.0d);
    var0.enfileira((java.lang.Object)var3);
    var0.imprime();

  }

  public void test68() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Long var2 = new java.lang.Long(1L);
    var1.enfileira((java.lang.Object)var2);
    ds.Fila var4 = new ds.Fila();
    var1.enfileira((java.lang.Object)var4);
    boolean var6 = var1.vazia();
    java.lang.Short var7 = new java.lang.Short((short)0);
    var1.enfileira((java.lang.Object)var7);
    var1.imprime();
    boolean var10 = var1.vazia();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Double var12 = new java.lang.Double(0.0d);
    var0.enfileira((java.lang.Object)var12);
    ds.Fila var14 = new ds.Fila();
    var0.enfileira((java.lang.Object)var14);
    boolean var16 = var14.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test69() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Long var3 = new java.lang.Long(0L);
    var1.enfileira((java.lang.Object)var3);
    ds.Fila var5 = new ds.Fila();
    java.lang.Long var6 = new java.lang.Long(1L);
    var5.enfileira((java.lang.Object)var6);
    ds.Fila var8 = new ds.Fila();
    var5.enfileira((java.lang.Object)var8);
    boolean var10 = var5.vazia();
    java.lang.Short var11 = new java.lang.Short((short)0);
    var5.enfileira((java.lang.Object)var11);
    var1.enfileira((java.lang.Object)var11);
    ds.Fila var14 = new ds.Fila();
    ds.Fila var15 = new ds.Fila();
    java.lang.Long var16 = new java.lang.Long(1L);
    var15.enfileira((java.lang.Object)var16);
    ds.Fila var18 = new ds.Fila();
    var15.enfileira((java.lang.Object)var18);
    boolean var20 = var15.vazia();
    java.lang.Short var21 = new java.lang.Short((short)0);
    var15.enfileira((java.lang.Object)var21);
    var15.imprime();
    boolean var24 = var15.vazia();
    var14.enfileira((java.lang.Object)var15);
    var1.enfileira((java.lang.Object)var14);
    boolean var27 = var1.vazia();
    boolean var28 = var1.vazia();
    boolean var29 = var1.vazia();
    ds.Fila var30 = new ds.Fila();
    var1.enfileira((java.lang.Object)var30);
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test70() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Long var1 = new java.lang.Long(1L);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    var0.enfileira((java.lang.Object)var3);
    var0.imprime();
    ds.Fila var6 = new ds.Fila();
    var6.imprime();
    var0.enfileira((java.lang.Object)var6);

  }

  public void test71() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Float var1 = new java.lang.Float(0.0f);
    var0.enfileira((java.lang.Object)var1);

  }

  public void test72() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    java.lang.Object var4 = var0.desenfileira();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test73() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    ds.Fila var2 = new ds.Fila();
    var1.enfileira((java.lang.Object)var2);
    java.lang.Long var4 = new java.lang.Long(0L);
    var2.enfileira((java.lang.Object)var4);
    ds.Fila var6 = new ds.Fila();
    java.lang.Long var7 = new java.lang.Long(1L);
    var6.enfileira((java.lang.Object)var7);
    ds.Fila var9 = new ds.Fila();
    var6.enfileira((java.lang.Object)var9);
    boolean var11 = var6.vazia();
    java.lang.Short var12 = new java.lang.Short((short)0);
    var6.enfileira((java.lang.Object)var12);
    var2.enfileira((java.lang.Object)var12);
    ds.Fila var15 = new ds.Fila();
    ds.Fila var16 = new ds.Fila();
    java.lang.Long var17 = new java.lang.Long(1L);
    var16.enfileira((java.lang.Object)var17);
    ds.Fila var19 = new ds.Fila();
    var16.enfileira((java.lang.Object)var19);
    boolean var21 = var16.vazia();
    java.lang.Short var22 = new java.lang.Short((short)0);
    var16.enfileira((java.lang.Object)var22);
    var16.imprime();
    boolean var25 = var16.vazia();
    var15.enfileira((java.lang.Object)var16);
    var2.enfileira((java.lang.Object)var15);
    boolean var28 = var2.vazia();
    boolean var29 = var2.vazia();
    boolean var30 = var2.vazia();
    var0.enfileira((java.lang.Object)var2);
    ds.Fila var32 = new ds.Fila();
    java.lang.Double var33 = new java.lang.Double(10.0d);
    var32.enfileira((java.lang.Object)var33);
    var2.enfileira((java.lang.Object)var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

}
