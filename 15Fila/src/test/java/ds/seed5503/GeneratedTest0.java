package ds.seed5503;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed5503 in this file.
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
    var0.enfileira((java.lang.Object)var0);

  }

  public void test3() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    java.lang.Short var2 = new java.lang.Short((short)100);
    var0.enfileira((java.lang.Object)var2);
    boolean var4 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test4() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    var0.enfileira((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test5() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Byte var1 = new java.lang.Byte((byte)1);
    var0.enfileira((java.lang.Object)var1);
    java.lang.Object var3 = var0.desenfileira();
    ds.Fila var4 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + (byte)1+ "'", var3.equals((byte)1));

  }

  public void test6() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Byte var1 = new java.lang.Byte((byte)1);
    var0.enfileira((java.lang.Object)var1);
    java.lang.Object var3 = var0.desenfileira();
    java.lang.Byte var4 = new java.lang.Byte((byte)1);
    var0.enfileira((java.lang.Object)var4);
    ds.Fila var6 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + (byte)1+ "'", var3.equals((byte)1));

  }

  public void test7() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Integer var1 = new java.lang.Integer(10);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();

  }

  public void test8() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Integer var2 = new java.lang.Integer(10);
    var1.enfileira((java.lang.Object)var2);
    var0.enfileira((java.lang.Object)var1);
    java.lang.Object var5 = var1.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10+ "'", var5.equals(10));

  }

  public void test9() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    java.lang.Integer var2 = new java.lang.Integer(100);
    var0.enfileira((java.lang.Object)var2);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test10() throws Throwable {

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

  public void test11() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Byte var1 = new java.lang.Byte((byte)1);
    var0.enfileira((java.lang.Object)var1);
    java.lang.Object var3 = var0.desenfileira();
    java.lang.Byte var4 = new java.lang.Byte((byte)1);
    var0.enfileira((java.lang.Object)var4);
    ds.Fila var6 = new ds.Fila();
    ds.Fila var7 = new ds.Fila();
    java.lang.Integer var8 = new java.lang.Integer(10);
    var7.enfileira((java.lang.Object)var8);
    var6.enfileira((java.lang.Object)var7);
    var0.enfileira((java.lang.Object)var6);
    ds.Fila var12 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + (byte)1+ "'", var3.equals((byte)1));

  }

  public void test12() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    var0.imprime();
    ds.Fila var3 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test13() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Short var1 = new java.lang.Short((short)10);
    var0.enfileira((java.lang.Object)var1);
    var0.imprime();

  }

  public void test14() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Byte var1 = new java.lang.Byte((byte)1);
    var0.enfileira((java.lang.Object)var1);
    java.lang.Object var3 = var0.desenfileira();
    java.lang.Byte var4 = new java.lang.Byte((byte)1);
    var0.enfileira((java.lang.Object)var4);
    ds.Fila var6 = new ds.Fila();
    ds.Fila var7 = new ds.Fila();
    java.lang.Integer var8 = new java.lang.Integer(10);
    var7.enfileira((java.lang.Object)var8);
    var6.enfileira((java.lang.Object)var7);
    var0.enfileira((java.lang.Object)var6);
    var6.imprime();
    ds.Fila var13 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + (byte)1+ "'", var3.equals((byte)1));

  }

  public void test15() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Short var1 = new java.lang.Short((short)10);
    var0.enfileira((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test16() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    ds.Fila var2 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test17() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Integer var1 = new java.lang.Integer(10);
    var0.enfileira((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    ds.Fila var4 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test18() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Short var1 = new java.lang.Short((short)10);
    var0.enfileira((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    java.lang.Long var4 = new java.lang.Long(0L);
    var0.enfileira((java.lang.Object)var4);
    boolean var6 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test19() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    java.lang.String var2 = "";
    var0.enfileira((java.lang.Object)var2);
    java.lang.Object var4 = var0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test20() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    java.lang.String var2 = "";
    var0.enfileira((java.lang.Object)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test21() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Integer var1 = new java.lang.Integer(10);
    var0.enfileira((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    java.lang.Double var4 = new java.lang.Double(1.0d);
    var0.enfileira((java.lang.Object)var4);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test22() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    java.lang.Short var3 = new java.lang.Short((short)100);
    var1.enfileira((java.lang.Object)var3);
    var0.enfileira((java.lang.Object)var1);
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

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
    boolean var2 = var1.vazia();
    java.lang.Short var3 = new java.lang.Short((short)100);
    var1.enfileira((java.lang.Object)var3);
    var0.enfileira((java.lang.Object)var1);
    boolean var6 = var1.vazia();
    java.lang.Object var7 = var1.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (short)100+ "'", var7.equals((short)100));

  }

  public void test25() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    java.lang.Short var3 = new java.lang.Short((short)100);
    var1.enfileira((java.lang.Object)var3);
    var0.enfileira((java.lang.Object)var1);
    boolean var6 = var1.vazia();
    java.lang.Double var7 = new java.lang.Double(1.0d);
    var1.enfileira((java.lang.Object)var7);
    boolean var9 = var1.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test26() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Short var1 = new java.lang.Short((short)10);
    var0.enfileira((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    java.lang.Long var4 = new java.lang.Long(0L);
    var0.enfileira((java.lang.Object)var4);
    java.lang.Integer var6 = new java.lang.Integer((-1));
    var0.enfileira((java.lang.Object)var6);
    java.lang.Object var8 = var0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (short)10+ "'", var8.equals((short)10));

  }

  public void test27() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Byte var1 = new java.lang.Byte((byte)0);
    var0.enfileira((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    ds.Fila var4 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test28() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    java.lang.Short var3 = new java.lang.Short((short)100);
    var1.enfileira((java.lang.Object)var3);
    var0.enfileira((java.lang.Object)var1);
    boolean var6 = var1.vazia();
    java.lang.Double var7 = new java.lang.Double(1.0d);
    var1.enfileira((java.lang.Object)var7);
    ds.Fila var9 = new ds.Fila();
    java.lang.Byte var10 = new java.lang.Byte((byte)1);
    var9.enfileira((java.lang.Object)var10);
    java.lang.Object var12 = var9.desenfileira();
    java.lang.Byte var13 = new java.lang.Byte((byte)1);
    var9.enfileira((java.lang.Object)var13);
    ds.Fila var15 = new ds.Fila();
    ds.Fila var16 = new ds.Fila();
    java.lang.Integer var17 = new java.lang.Integer(10);
    var16.enfileira((java.lang.Object)var17);
    var15.enfileira((java.lang.Object)var16);
    var9.enfileira((java.lang.Object)var15);
    var1.enfileira((java.lang.Object)var9);
    ds.Fila var22 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + (byte)1+ "'", var12.equals((byte)1));

  }

  public void test29() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Integer var1 = new java.lang.Integer(10);
    var0.enfileira((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    java.lang.Double var4 = new java.lang.Double(1.0d);
    var0.enfileira((java.lang.Object)var4);
    java.lang.Short var6 = new java.lang.Short((short)(-1));
    var0.enfileira((java.lang.Object)var6);
    boolean var8 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test30() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Byte var1 = new java.lang.Byte((byte)0);
    var0.enfileira((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    ds.Fila var4 = new ds.Fila();
    boolean var5 = var4.vazia();
    var0.enfileira((java.lang.Object)var5);
    boolean var7 = var4.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test31() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Byte var1 = new java.lang.Byte((byte)0);
    var0.enfileira((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    ds.Fila var4 = new ds.Fila();
    boolean var5 = var4.vazia();
    var0.enfileira((java.lang.Object)var5);
    ds.Fila var7 = new ds.Fila();
    boolean var8 = var7.vazia();
    java.lang.Integer var9 = new java.lang.Integer(100);
    var7.enfileira((java.lang.Object)var9);
    var0.enfileira((java.lang.Object)var9);
    ds.Fila var12 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test32() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Byte var1 = new java.lang.Byte((byte)0);
    var0.enfileira((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    ds.Fila var4 = new ds.Fila();
    boolean var5 = var4.vazia();
    var0.enfileira((java.lang.Object)var5);
    ds.Fila var7 = new ds.Fila();
    boolean var8 = var7.vazia();
    java.lang.Integer var9 = new java.lang.Integer(100);
    var7.enfileira((java.lang.Object)var9);
    var0.enfileira((java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test33() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Integer var1 = new java.lang.Integer(10);
    var0.enfileira((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    java.lang.Double var4 = new java.lang.Double(1.0d);
    var0.enfileira((java.lang.Object)var4);
    java.lang.Short var6 = new java.lang.Short((short)(-1));
    var0.enfileira((java.lang.Object)var6);
    var0.imprime();
    boolean var9 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test34() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    java.lang.Short var3 = new java.lang.Short((short)100);
    var1.enfileira((java.lang.Object)var3);
    var0.enfileira((java.lang.Object)var1);
    boolean var6 = var1.vazia();
    java.lang.Double var7 = new java.lang.Double(1.0d);
    var1.enfileira((java.lang.Object)var7);
    ds.Fila var9 = new ds.Fila();
    java.lang.Byte var10 = new java.lang.Byte((byte)1);
    var9.enfileira((java.lang.Object)var10);
    java.lang.Object var12 = var9.desenfileira();
    java.lang.Byte var13 = new java.lang.Byte((byte)1);
    var9.enfileira((java.lang.Object)var13);
    ds.Fila var15 = new ds.Fila();
    ds.Fila var16 = new ds.Fila();
    java.lang.Integer var17 = new java.lang.Integer(10);
    var16.enfileira((java.lang.Object)var17);
    var15.enfileira((java.lang.Object)var16);
    var9.enfileira((java.lang.Object)var15);
    var1.enfileira((java.lang.Object)var9);
    var9.imprime();
    var16.enfileira((java.lang.Object)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + (byte)1+ "'", var12.equals((byte)1));

  }

  public void test35() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Short var1 = new java.lang.Short((short)10);
    var0.enfileira((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    java.lang.Long var4 = new java.lang.Long(0L);
    var0.enfileira((java.lang.Object)var4);
    java.lang.Integer var6 = new java.lang.Integer((-1));
    var0.enfileira((java.lang.Object)var6);
    var0.imprime();
    var0.enfileira((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test36() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Short var1 = new java.lang.Short((short)10);
    var0.enfileira((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    java.lang.Long var4 = new java.lang.Long(0L);
    var0.enfileira((java.lang.Object)var4);
    java.lang.Integer var6 = new java.lang.Integer((-1));
    var0.enfileira((java.lang.Object)var6);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test37() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    ds.Fila var2 = new ds.Fila();
    boolean var3 = var2.vazia();
    var0.enfileira((java.lang.Object)var3);
    var2.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test38() throws Throwable {

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

  public void test39() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Integer var2 = new java.lang.Integer(10);
    var1.enfileira((java.lang.Object)var2);
    var0.enfileira((java.lang.Object)var1);
    boolean var5 = var1.vazia();
    ds.Fila var6 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test40() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Integer var2 = new java.lang.Integer(10);
    var1.enfileira((java.lang.Object)var2);
    var0.enfileira((java.lang.Object)var1);
    boolean var5 = var1.vazia();
    ds.Fila var6 = new ds.Fila();
    ds.Fila var7 = new ds.Fila();
    java.lang.Integer var8 = new java.lang.Integer(10);
    var7.enfileira((java.lang.Object)var8);
    var6.enfileira((java.lang.Object)var7);
    var1.enfileira((java.lang.Object)var6);
    var7.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test41() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Integer var2 = new java.lang.Integer(10);
    var1.enfileira((java.lang.Object)var2);
    var0.enfileira((java.lang.Object)var1);
    boolean var5 = var1.vazia();
    ds.Fila var6 = new ds.Fila();
    ds.Fila var7 = new ds.Fila();
    java.lang.Integer var8 = new java.lang.Integer(10);
    var7.enfileira((java.lang.Object)var8);
    var6.enfileira((java.lang.Object)var7);
    var1.enfileira((java.lang.Object)var6);
    ds.Fila var12 = new ds.Fila();
    boolean var13 = var12.vazia();
    var6.enfileira((java.lang.Object)var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var15 = var12.desenfileira();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test42() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Integer var2 = new java.lang.Integer(10);
    var1.enfileira((java.lang.Object)var2);
    var0.enfileira((java.lang.Object)var1);
    boolean var5 = var1.vazia();
    ds.Fila var6 = new ds.Fila();
    ds.Fila var7 = new ds.Fila();
    java.lang.Integer var8 = new java.lang.Integer(10);
    var7.enfileira((java.lang.Object)var8);
    var6.enfileira((java.lang.Object)var7);
    var1.enfileira((java.lang.Object)var6);
    ds.Fila var12 = new ds.Fila();
    boolean var13 = var12.vazia();
    var6.enfileira((java.lang.Object)var12);
    var12.imprime();
    var12.enfileira((java.lang.Object)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test43() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    java.lang.Short var3 = new java.lang.Short((short)100);
    var1.enfileira((java.lang.Object)var3);
    var0.enfileira((java.lang.Object)var1);
    boolean var6 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test44() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Integer var2 = new java.lang.Integer(10);
    var1.enfileira((java.lang.Object)var2);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var5 = new ds.Fila();
    var1.enfileira((java.lang.Object)var5);

  }

  public void test45() throws Throwable {

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

  public void test46() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    java.lang.Boolean var2 = new java.lang.Boolean(false);
    var0.enfileira((java.lang.Object)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test47() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Byte var1 = new java.lang.Byte((byte)0);
    var0.enfileira((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    ds.Fila var4 = new ds.Fila();
    boolean var5 = var4.vazia();
    var0.enfileira((java.lang.Object)var5);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test48() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    java.lang.Short var2 = new java.lang.Short((short)100);
    var0.enfileira((java.lang.Object)var2);
    java.lang.Object var4 = var0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (short)100+ "'", var4.equals((short)100));

  }

  public void test49() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test50() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    java.lang.Short var3 = new java.lang.Short((short)100);
    var1.enfileira((java.lang.Object)var3);
    var0.enfileira((java.lang.Object)var1);
    boolean var6 = var1.vazia();
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test51() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Integer var2 = new java.lang.Integer(10);
    var1.enfileira((java.lang.Object)var2);
    var0.enfileira((java.lang.Object)var1);
    boolean var5 = var1.vazia();
    ds.Fila var6 = new ds.Fila();
    ds.Fila var7 = new ds.Fila();
    java.lang.Integer var8 = new java.lang.Integer(10);
    var7.enfileira((java.lang.Object)var8);
    var6.enfileira((java.lang.Object)var7);
    var1.enfileira((java.lang.Object)var6);
    ds.Fila var12 = new ds.Fila();
    boolean var13 = var12.vazia();
    var6.enfileira((java.lang.Object)var12);
    var12.imprime();
    boolean var16 = var12.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test52() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Integer var2 = new java.lang.Integer(10);
    var1.enfileira((java.lang.Object)var2);
    var0.enfileira((java.lang.Object)var1);
    boolean var5 = var1.vazia();
    ds.Fila var6 = new ds.Fila();
    boolean var7 = var6.vazia();
    var1.enfileira((java.lang.Object)var6);
    ds.Fila var9 = new ds.Fila();
    boolean var10 = var9.vazia();
    var9.imprime();
    var6.enfileira((java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test53() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Byte var1 = new java.lang.Byte((byte)1);
    var0.enfileira((java.lang.Object)var1);
    java.lang.Object var3 = var0.desenfileira();
    java.lang.Byte var4 = new java.lang.Byte((byte)1);
    var0.enfileira((java.lang.Object)var4);
    ds.Fila var6 = new ds.Fila();
    ds.Fila var7 = new ds.Fila();
    java.lang.Integer var8 = new java.lang.Integer(10);
    var7.enfileira((java.lang.Object)var8);
    var6.enfileira((java.lang.Object)var7);
    var0.enfileira((java.lang.Object)var6);
    ds.Fila var12 = new ds.Fila();
    java.lang.Byte var13 = new java.lang.Byte((byte)1);
    var12.enfileira((java.lang.Object)var13);
    java.lang.Object var15 = var12.desenfileira();
    java.lang.Byte var16 = new java.lang.Byte((byte)1);
    var12.enfileira((java.lang.Object)var16);
    ds.Fila var18 = new ds.Fila();
    ds.Fila var19 = new ds.Fila();
    java.lang.Integer var20 = new java.lang.Integer(10);
    var19.enfileira((java.lang.Object)var20);
    var18.enfileira((java.lang.Object)var19);
    var12.enfileira((java.lang.Object)var18);
    var18.imprime();
    var0.enfileira((java.lang.Object)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + (byte)1+ "'", var3.equals((byte)1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + (byte)1+ "'", var15.equals((byte)1));

  }

  public void test54() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    java.lang.Float var2 = new java.lang.Float(1.0f);
    var0.enfileira((java.lang.Object)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test55() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    java.lang.Short var3 = new java.lang.Short((short)100);
    var1.enfileira((java.lang.Object)var3);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var6 = new ds.Fila();
    java.lang.Byte var7 = new java.lang.Byte((byte)0);
    var6.enfileira((java.lang.Object)var7);
    java.lang.Object var9 = var6.desenfileira();
    var0.enfileira((java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + (byte)0+ "'", var9.equals((byte)0));

  }

  public void test56() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    var0.imprime();
    boolean var3 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test57() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Integer var2 = new java.lang.Integer(10);
    var1.enfileira((java.lang.Object)var2);
    var0.enfileira((java.lang.Object)var1);
    boolean var5 = var1.vazia();
    ds.Fila var6 = new ds.Fila();
    boolean var7 = var6.vazia();
    var1.enfileira((java.lang.Object)var6);
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test58() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Byte var1 = new java.lang.Byte((byte)0);
    var0.enfileira((java.lang.Object)var1);
    java.lang.Object var3 = var0.desenfileira();
    ds.Fila var4 = new ds.Fila();
    ds.Fila var5 = new ds.Fila();
    boolean var6 = var5.vazia();
    java.lang.Short var7 = new java.lang.Short((short)100);
    var5.enfileira((java.lang.Object)var7);
    var4.enfileira((java.lang.Object)var5);
    boolean var10 = var5.vazia();
    java.lang.Double var11 = new java.lang.Double(1.0d);
    var5.enfileira((java.lang.Object)var11);
    ds.Fila var13 = new ds.Fila();
    java.lang.Byte var14 = new java.lang.Byte((byte)1);
    var13.enfileira((java.lang.Object)var14);
    java.lang.Object var16 = var13.desenfileira();
    java.lang.Byte var17 = new java.lang.Byte((byte)1);
    var13.enfileira((java.lang.Object)var17);
    ds.Fila var19 = new ds.Fila();
    ds.Fila var20 = new ds.Fila();
    java.lang.Integer var21 = new java.lang.Integer(10);
    var20.enfileira((java.lang.Object)var21);
    var19.enfileira((java.lang.Object)var20);
    var13.enfileira((java.lang.Object)var19);
    var5.enfileira((java.lang.Object)var13);
    var0.enfileira((java.lang.Object)var13);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + (byte)0+ "'", var3.equals((byte)0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + (byte)1+ "'", var16.equals((byte)1));

  }

  public void test59() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Integer var1 = new java.lang.Integer(10);
    var0.enfileira((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    java.lang.Double var4 = new java.lang.Double(1.0d);
    var0.enfileira((java.lang.Object)var4);
    java.lang.Short var6 = new java.lang.Short((short)(-1));
    var0.enfileira((java.lang.Object)var6);
    var0.imprime();
    java.lang.Object var9 = var0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 10+ "'", var9.equals(10));

  }

  public void test60() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Integer var1 = new java.lang.Integer(10);
    var0.enfileira((java.lang.Object)var1);
    java.lang.Object var3 = var0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 10+ "'", var3.equals(10));

  }

  public void test61() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Integer var2 = new java.lang.Integer(10);
    var1.enfileira((java.lang.Object)var2);
    var0.enfileira((java.lang.Object)var1);
    boolean var5 = var1.vazia();
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test62() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    var0.imprime();

  }

  public void test63() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.imprime();
    boolean var2 = var0.vazia();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test64() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Byte var1 = new java.lang.Byte((byte)0);
    var0.enfileira((java.lang.Object)var1);
    java.lang.Object var3 = var0.desenfileira();
    ds.Fila var4 = new ds.Fila();
    ds.Fila var5 = new ds.Fila();
    boolean var6 = var5.vazia();
    java.lang.Short var7 = new java.lang.Short((short)100);
    var5.enfileira((java.lang.Object)var7);
    var4.enfileira((java.lang.Object)var5);
    boolean var10 = var5.vazia();
    java.lang.Double var11 = new java.lang.Double(1.0d);
    var5.enfileira((java.lang.Object)var11);
    ds.Fila var13 = new ds.Fila();
    java.lang.Byte var14 = new java.lang.Byte((byte)1);
    var13.enfileira((java.lang.Object)var14);
    java.lang.Object var16 = var13.desenfileira();
    java.lang.Byte var17 = new java.lang.Byte((byte)1);
    var13.enfileira((java.lang.Object)var17);
    ds.Fila var19 = new ds.Fila();
    ds.Fila var20 = new ds.Fila();
    java.lang.Integer var21 = new java.lang.Integer(10);
    var20.enfileira((java.lang.Object)var21);
    var19.enfileira((java.lang.Object)var20);
    var13.enfileira((java.lang.Object)var19);
    var5.enfileira((java.lang.Object)var13);
    var0.enfileira((java.lang.Object)var13);
    ds.Fila var27 = new ds.Fila();
    boolean var28 = var27.vazia();
    var0.enfileira((java.lang.Object)var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + (byte)0+ "'", var3.equals((byte)0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + (byte)1+ "'", var16.equals((byte)1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);

  }

  public void test65() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Integer var2 = new java.lang.Integer(10);
    var1.enfileira((java.lang.Object)var2);
    var0.enfileira((java.lang.Object)var1);
    boolean var5 = var1.vazia();
    ds.Fila var6 = new ds.Fila();
    ds.Fila var7 = new ds.Fila();
    java.lang.Integer var8 = new java.lang.Integer(10);
    var7.enfileira((java.lang.Object)var8);
    var6.enfileira((java.lang.Object)var7);
    var1.enfileira((java.lang.Object)var6);
    ds.Fila var12 = new ds.Fila();
    boolean var13 = var12.vazia();
    var6.enfileira((java.lang.Object)var12);
    var6.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test66() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Integer var2 = new java.lang.Integer(10);
    var1.enfileira((java.lang.Object)var2);
    var0.enfileira((java.lang.Object)var1);
    boolean var5 = var1.vazia();
    ds.Fila var6 = new ds.Fila();
    boolean var7 = var6.vazia();
    var1.enfileira((java.lang.Object)var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var6.desenfileira();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test67() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    boolean var2 = var1.vazia();
    java.lang.Short var3 = new java.lang.Short((short)100);
    var1.enfileira((java.lang.Object)var3);
    var0.enfileira((java.lang.Object)var1);
    boolean var6 = var1.vazia();
    java.lang.Double var7 = new java.lang.Double(1.0d);
    var1.enfileira((java.lang.Object)var7);
    ds.Fila var9 = new ds.Fila();
    java.lang.Byte var10 = new java.lang.Byte((byte)1);
    var9.enfileira((java.lang.Object)var10);
    java.lang.Object var12 = var9.desenfileira();
    java.lang.Byte var13 = new java.lang.Byte((byte)1);
    var9.enfileira((java.lang.Object)var13);
    ds.Fila var15 = new ds.Fila();
    ds.Fila var16 = new ds.Fila();
    java.lang.Integer var17 = new java.lang.Integer(10);
    var16.enfileira((java.lang.Object)var17);
    var15.enfileira((java.lang.Object)var16);
    var9.enfileira((java.lang.Object)var15);
    var1.enfileira((java.lang.Object)var9);
    var9.imprime();
    var9.imprime();
    java.lang.Object var24 = var9.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + (byte)1+ "'", var12.equals((byte)1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + (byte)1+ "'", var24.equals((byte)1));

  }

}
