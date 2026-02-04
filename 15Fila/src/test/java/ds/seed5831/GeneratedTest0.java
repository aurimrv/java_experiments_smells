package ds.seed5831;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed5831 in this file.
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
    java.lang.String var1 = "hi!";
    var0.enfileira((java.lang.Object)var1);
    java.lang.Object var3 = var0.desenfileira();
    var0.enfileira(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));

  }

  public void test3() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.enfileira((java.lang.Object)var0);

  }

  public void test4() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test5() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.String var1 = "hi!";
    var0.enfileira((java.lang.Object)var1);
    java.lang.Object var3 = var0.desenfileira();
    java.lang.Float var4 = new java.lang.Float(10.0f);
    var0.enfileira((java.lang.Object)var4);
    ds.Fila var6 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));

  }

  public void test6() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test7() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.String var1 = "hi!";
    var0.enfileira((java.lang.Object)var1);
    java.lang.Object var3 = var0.desenfileira();
    java.lang.Float var4 = new java.lang.Float(10.0f);
    var0.enfileira((java.lang.Object)var4);
    boolean var6 = var0.vazia();
    ds.Fila var7 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test8() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.String var1 = "hi!";
    var0.enfileira((java.lang.Object)var1);
    java.lang.Object var3 = var0.desenfileira();
    java.lang.Float var4 = new java.lang.Float(10.0f);
    var0.enfileira((java.lang.Object)var4);
    boolean var6 = var0.vazia();
    java.lang.Long var7 = new java.lang.Long(1L);
    var0.enfileira((java.lang.Object)var7);
    boolean var9 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test9() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Float var1 = new java.lang.Float(100.0f);
    var0.enfileira((java.lang.Object)var1);
    java.lang.Object var3 = var0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 100.0f+ "'", var3.equals(100.0f));

  }

  public void test10() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.String var1 = "hi!";
    var0.enfileira((java.lang.Object)var1);
    java.lang.Object var3 = var0.desenfileira();
    java.lang.Float var4 = new java.lang.Float(10.0f);
    var0.enfileira((java.lang.Object)var4);
    boolean var6 = var0.vazia();
    java.lang.Long var7 = new java.lang.Long(1L);
    var0.enfileira((java.lang.Object)var7);
    var0.imprime();
    boolean var10 = var0.vazia();
    java.lang.Object var11 = var0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 10.0f+ "'", var11.equals(10.0f));

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
    java.lang.Float var1 = new java.lang.Float(100.0f);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    var0.enfileira((java.lang.Object)var3);
    ds.Fila var5 = new ds.Fila();

  }

  public void test13() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Float var1 = new java.lang.Float(100.0f);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    var0.enfileira((java.lang.Object)var3);
    java.lang.Short var5 = new java.lang.Short((short)0);
    var3.enfileira((java.lang.Object)var5);
    java.lang.Object var7 = var3.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (short)0+ "'", var7.equals((short)0));

  }

  public void test14() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Float var1 = new java.lang.Float(100.0f);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    var0.enfileira((java.lang.Object)var3);
    java.lang.Short var5 = new java.lang.Short((short)0);
    var3.enfileira((java.lang.Object)var5);
    ds.Fila var7 = new ds.Fila();
    java.lang.String var8 = "hi!";
    var7.enfileira((java.lang.Object)var8);
    java.lang.Object var10 = var7.desenfileira();
    java.lang.Float var11 = new java.lang.Float(10.0f);
    var7.enfileira((java.lang.Object)var11);
    boolean var13 = var7.vazia();
    java.lang.Long var14 = new java.lang.Long(1L);
    var7.enfileira((java.lang.Object)var14);
    var3.enfileira((java.lang.Object)var14);
    boolean var17 = var7.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

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
    java.lang.Float var1 = new java.lang.Float(100.0f);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    var0.enfileira((java.lang.Object)var3);
    java.lang.Short var5 = new java.lang.Short((short)0);
    var3.enfileira((java.lang.Object)var5);
    ds.Fila var7 = new ds.Fila();
    java.lang.String var8 = "hi!";
    var7.enfileira((java.lang.Object)var8);
    java.lang.Object var10 = var7.desenfileira();
    java.lang.Float var11 = new java.lang.Float(10.0f);
    var7.enfileira((java.lang.Object)var11);
    boolean var13 = var7.vazia();
    java.lang.Long var14 = new java.lang.Long(1L);
    var7.enfileira((java.lang.Object)var14);
    var3.enfileira((java.lang.Object)var14);
    boolean var17 = var3.vazia();
    var7.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test18() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Float var1 = new java.lang.Float(100.0f);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    var0.enfileira((java.lang.Object)var3);
    java.lang.Short var5 = new java.lang.Short((short)0);
    var3.enfileira((java.lang.Object)var5);
    ds.Fila var7 = new ds.Fila();
    java.lang.String var8 = "hi!";
    var7.enfileira((java.lang.Object)var8);
    java.lang.Object var10 = var7.desenfileira();
    java.lang.Float var11 = new java.lang.Float(10.0f);
    var7.enfileira((java.lang.Object)var11);
    boolean var13 = var7.vazia();
    java.lang.Long var14 = new java.lang.Long(1L);
    var7.enfileira((java.lang.Object)var14);
    var3.enfileira((java.lang.Object)var14);
    boolean var17 = var3.vazia();
    boolean var18 = var3.vazia();
    var7.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test19() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    var0.enfileira((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test20() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Float var2 = new java.lang.Float(100.0f);
    var1.enfileira((java.lang.Object)var2);
    ds.Fila var4 = new ds.Fila();
    var1.enfileira((java.lang.Object)var4);
    java.lang.Short var6 = new java.lang.Short((short)0);
    var4.enfileira((java.lang.Object)var6);
    ds.Fila var8 = new ds.Fila();
    java.lang.String var9 = "hi!";
    var8.enfileira((java.lang.Object)var9);
    java.lang.Object var11 = var8.desenfileira();
    java.lang.Float var12 = new java.lang.Float(10.0f);
    var8.enfileira((java.lang.Object)var12);
    boolean var14 = var8.vazia();
    java.lang.Long var15 = new java.lang.Long(1L);
    var8.enfileira((java.lang.Object)var15);
    var4.enfileira((java.lang.Object)var15);
    var0.enfileira((java.lang.Object)var15);
    boolean var19 = var8.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test21() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Float var1 = new java.lang.Float(100.0f);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    var0.enfileira((java.lang.Object)var3);
    java.lang.Short var5 = new java.lang.Short((short)0);
    var3.enfileira((java.lang.Object)var5);
    ds.Fila var7 = new ds.Fila();
    java.lang.String var8 = "hi!";
    var7.enfileira((java.lang.Object)var8);
    java.lang.Object var10 = var7.desenfileira();
    java.lang.Float var11 = new java.lang.Float(10.0f);
    var7.enfileira((java.lang.Object)var11);
    boolean var13 = var7.vazia();
    java.lang.Long var14 = new java.lang.Long(1L);
    var7.enfileira((java.lang.Object)var14);
    var3.enfileira((java.lang.Object)var14);
    boolean var17 = var3.vazia();
    boolean var18 = var3.vazia();
    boolean var19 = var3.vazia();
    var7.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test22() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Float var2 = new java.lang.Float(100.0f);
    var1.enfileira((java.lang.Object)var2);
    ds.Fila var4 = new ds.Fila();
    var1.enfileira((java.lang.Object)var4);
    java.lang.Short var6 = new java.lang.Short((short)0);
    var4.enfileira((java.lang.Object)var6);
    ds.Fila var8 = new ds.Fila();
    java.lang.String var9 = "hi!";
    var8.enfileira((java.lang.Object)var9);
    java.lang.Object var11 = var8.desenfileira();
    java.lang.Float var12 = new java.lang.Float(10.0f);
    var8.enfileira((java.lang.Object)var12);
    boolean var14 = var8.vazia();
    java.lang.Long var15 = new java.lang.Long(1L);
    var8.enfileira((java.lang.Object)var15);
    var4.enfileira((java.lang.Object)var15);
    var0.enfileira((java.lang.Object)var15);
    boolean var19 = var0.vazia();
    var8.enfileira(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test23() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Double var1 = new java.lang.Double((-1.0d));
    var0.enfileira((java.lang.Object)var1);
    java.lang.Object var3 = var0.desenfileira();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + (-1.0d)+ "'", var3.equals((-1.0d)));

  }

  public void test24() throws Throwable {

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

  public void test25() throws Throwable {

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

  public void test26() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Float var2 = new java.lang.Float(100.0f);
    var1.enfileira((java.lang.Object)var2);
    ds.Fila var4 = new ds.Fila();
    var1.enfileira((java.lang.Object)var4);
    java.lang.Short var6 = new java.lang.Short((short)0);
    var4.enfileira((java.lang.Object)var6);
    ds.Fila var8 = new ds.Fila();
    java.lang.String var9 = "hi!";
    var8.enfileira((java.lang.Object)var9);
    java.lang.Object var11 = var8.desenfileira();
    java.lang.Float var12 = new java.lang.Float(10.0f);
    var8.enfileira((java.lang.Object)var12);
    boolean var14 = var8.vazia();
    java.lang.Long var15 = new java.lang.Long(1L);
    var8.enfileira((java.lang.Object)var15);
    var4.enfileira((java.lang.Object)var15);
    var0.enfileira((java.lang.Object)var15);
    boolean var19 = var0.vazia();
    ds.Fila var20 = new ds.Fila();
    boolean var21 = var20.vazia();
    boolean var22 = var20.vazia();
    var0.enfileira((java.lang.Object)var20);
    var20.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);

  }

  public void test27() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Double var1 = new java.lang.Double((-1.0d));
    var0.enfileira((java.lang.Object)var1);
    java.lang.Object var3 = var0.desenfileira();
    ds.Fila var4 = new ds.Fila();
    var0.enfileira((java.lang.Object)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var4.desenfileira();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + (-1.0d)+ "'", var3.equals((-1.0d)));

  }

  public void test28() throws Throwable {

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

  public void test29() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Float var2 = new java.lang.Float(100.0f);
    var1.enfileira((java.lang.Object)var2);
    ds.Fila var4 = new ds.Fila();
    var1.enfileira((java.lang.Object)var4);
    java.lang.Short var6 = new java.lang.Short((short)0);
    var4.enfileira((java.lang.Object)var6);
    ds.Fila var8 = new ds.Fila();
    java.lang.String var9 = "hi!";
    var8.enfileira((java.lang.Object)var9);
    java.lang.Object var11 = var8.desenfileira();
    java.lang.Float var12 = new java.lang.Float(10.0f);
    var8.enfileira((java.lang.Object)var12);
    boolean var14 = var8.vazia();
    java.lang.Long var15 = new java.lang.Long(1L);
    var8.enfileira((java.lang.Object)var15);
    var4.enfileira((java.lang.Object)var15);
    var0.enfileira((java.lang.Object)var15);
    boolean var19 = var0.vazia();
    ds.Fila var20 = new ds.Fila();
    boolean var21 = var20.vazia();
    boolean var22 = var20.vazia();
    var0.enfileira((java.lang.Object)var20);
    java.lang.Object var24 = var0.desenfileira();
    ds.Fila var25 = new ds.Fila();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + 1L+ "'", var24.equals(1L));

  }

  public void test30() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Object var3 = var0.desenfileira();
    var1.enfileira(var3);

  }

  public void test31() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Double var1 = new java.lang.Double((-1.0d));
    var0.enfileira((java.lang.Object)var1);
    java.lang.Object var3 = var0.desenfileira();
    ds.Fila var4 = new ds.Fila();
    var0.enfileira((java.lang.Object)var4);
    boolean var6 = var4.vazia();
    var4.enfileira((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + (-1.0d)+ "'", var3.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test32() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Object var3 = var0.desenfileira();
    ds.Fila var4 = new ds.Fila();
    ds.Fila var5 = new ds.Fila();
    var4.enfileira((java.lang.Object)var5);
    java.lang.Object var7 = var4.desenfileira();
    var0.enfileira((java.lang.Object)var4);
    boolean var9 = var5.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test33() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    ds.Fila var2 = new ds.Fila();
    var1.enfileira((java.lang.Object)var2);
    java.lang.Object var4 = var1.desenfileira();
    var0.enfileira(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var2.desenfileira();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test34() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    ds.Fila var2 = new ds.Fila();
    var1.enfileira((java.lang.Object)var2);
    java.lang.Object var4 = var1.desenfileira();
    var0.enfileira(var4);
    java.lang.Object var6 = var0.desenfileira();
    var2.enfileira(var6);

  }

  public void test35() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    ds.Fila var2 = new ds.Fila();
    var1.enfileira((java.lang.Object)var2);
    java.lang.Object var4 = var1.desenfileira();
    var0.enfileira(var4);
    java.lang.Object var6 = var0.desenfileira();

  }

  public void test36() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Double var1 = new java.lang.Double((-1.0d));
    var0.enfileira((java.lang.Object)var1);
    java.lang.Object var3 = var0.desenfileira();
    ds.Fila var4 = new ds.Fila();
    var0.enfileira((java.lang.Object)var4);
    boolean var6 = var4.vazia();
    ds.Fila var7 = new ds.Fila();
    ds.Fila var8 = new ds.Fila();
    ds.Fila var9 = new ds.Fila();
    var8.enfileira((java.lang.Object)var9);
    java.lang.Object var11 = var8.desenfileira();
    var7.enfileira(var11);
    var4.enfileira(var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var14 = var9.desenfileira();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + (-1.0d)+ "'", var3.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test37() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Double var1 = new java.lang.Double((-1.0d));
    var0.enfileira((java.lang.Object)var1);
    java.lang.Object var3 = var0.desenfileira();
    ds.Fila var4 = new ds.Fila();
    var0.enfileira((java.lang.Object)var4);
    boolean var6 = var4.vazia();
    ds.Fila var7 = new ds.Fila();
    ds.Fila var8 = new ds.Fila();
    ds.Fila var9 = new ds.Fila();
    var8.enfileira((java.lang.Object)var9);
    java.lang.Object var11 = var8.desenfileira();
    var7.enfileira(var11);
    var4.enfileira(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + (-1.0d)+ "'", var3.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test38() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.String var1 = "hi!";
    var0.enfileira((java.lang.Object)var1);
    java.lang.Object var3 = var0.desenfileira();
    java.lang.Float var4 = new java.lang.Float(10.0f);
    var0.enfileira((java.lang.Object)var4);
    boolean var6 = var0.vazia();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test39() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Double var1 = new java.lang.Double((-1.0d));
    var0.enfileira((java.lang.Object)var1);
    java.lang.Object var3 = var0.desenfileira();
    ds.Fila var4 = new ds.Fila();
    var0.enfileira((java.lang.Object)var4);
    boolean var6 = var4.vazia();
    ds.Fila var7 = new ds.Fila();
    ds.Fila var8 = new ds.Fila();
    java.lang.Float var9 = new java.lang.Float(100.0f);
    var8.enfileira((java.lang.Object)var9);
    ds.Fila var11 = new ds.Fila();
    var8.enfileira((java.lang.Object)var11);
    java.lang.Short var13 = new java.lang.Short((short)0);
    var11.enfileira((java.lang.Object)var13);
    ds.Fila var15 = new ds.Fila();
    java.lang.String var16 = "hi!";
    var15.enfileira((java.lang.Object)var16);
    java.lang.Object var18 = var15.desenfileira();
    java.lang.Float var19 = new java.lang.Float(10.0f);
    var15.enfileira((java.lang.Object)var19);
    boolean var21 = var15.vazia();
    java.lang.Long var22 = new java.lang.Long(1L);
    var15.enfileira((java.lang.Object)var22);
    var11.enfileira((java.lang.Object)var22);
    boolean var25 = var11.vazia();
    boolean var26 = var11.vazia();
    boolean var27 = var11.vazia();
    var7.enfileira((java.lang.Object)var11);
    java.lang.Object var29 = var11.desenfileira();
    var4.enfileira((java.lang.Object)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + (-1.0d)+ "'", var3.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + (short)0+ "'", var29.equals((short)0));

  }

  public void test40() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Long var1 = new java.lang.Long(10L);
    var0.enfileira((java.lang.Object)var1);

  }

  public void test41() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.imprime();
    boolean var2 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test42() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    ds.Fila var2 = new ds.Fila();
    var1.enfileira((java.lang.Object)var2);
    java.lang.Object var4 = var1.desenfileira();
    var0.enfileira(var4);
    boolean var6 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test43() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Float var2 = new java.lang.Float(100.0f);
    var1.enfileira((java.lang.Object)var2);
    ds.Fila var4 = new ds.Fila();
    var1.enfileira((java.lang.Object)var4);
    java.lang.Short var6 = new java.lang.Short((short)0);
    var4.enfileira((java.lang.Object)var6);
    ds.Fila var8 = new ds.Fila();
    java.lang.String var9 = "hi!";
    var8.enfileira((java.lang.Object)var9);
    java.lang.Object var11 = var8.desenfileira();
    java.lang.Float var12 = new java.lang.Float(10.0f);
    var8.enfileira((java.lang.Object)var12);
    boolean var14 = var8.vazia();
    java.lang.Long var15 = new java.lang.Long(1L);
    var8.enfileira((java.lang.Object)var15);
    var4.enfileira((java.lang.Object)var15);
    var0.enfileira((java.lang.Object)var15);
    boolean var19 = var0.vazia();
    ds.Fila var20 = new ds.Fila();
    boolean var21 = var20.vazia();
    boolean var22 = var20.vazia();
    var0.enfileira((java.lang.Object)var20);
    ds.Fila var24 = new ds.Fila();
    var0.enfileira((java.lang.Object)var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);

  }

  public void test44() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Object var3 = var0.desenfileira();
    ds.Fila var4 = new ds.Fila();
    ds.Fila var5 = new ds.Fila();
    var4.enfileira((java.lang.Object)var5);
    java.lang.Object var7 = var4.desenfileira();
    var0.enfileira((java.lang.Object)var4);
    ds.Fila var9 = new ds.Fila();
    var4.enfileira((java.lang.Object)var9);
    var9.imprime();

  }

  public void test45() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Float var2 = new java.lang.Float(100.0f);
    var1.enfileira((java.lang.Object)var2);
    ds.Fila var4 = new ds.Fila();
    var1.enfileira((java.lang.Object)var4);
    java.lang.Short var6 = new java.lang.Short((short)0);
    var4.enfileira((java.lang.Object)var6);
    ds.Fila var8 = new ds.Fila();
    java.lang.String var9 = "hi!";
    var8.enfileira((java.lang.Object)var9);
    java.lang.Object var11 = var8.desenfileira();
    java.lang.Float var12 = new java.lang.Float(10.0f);
    var8.enfileira((java.lang.Object)var12);
    boolean var14 = var8.vazia();
    java.lang.Long var15 = new java.lang.Long(1L);
    var8.enfileira((java.lang.Object)var15);
    var4.enfileira((java.lang.Object)var15);
    var0.enfileira((java.lang.Object)var15);
    boolean var19 = var0.vazia();
    ds.Fila var20 = new ds.Fila();
    boolean var21 = var20.vazia();
    boolean var22 = var20.vazia();
    var0.enfileira((java.lang.Object)var20);
    java.lang.Object var24 = var0.desenfileira();
    java.lang.Object var25 = var0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + 1L+ "'", var24.equals(1L));

  }

  public void test46() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Object var3 = var0.desenfileira();
    ds.Fila var4 = new ds.Fila();
    ds.Fila var5 = new ds.Fila();
    var4.enfileira((java.lang.Object)var5);
    java.lang.Object var7 = var4.desenfileira();
    var0.enfileira((java.lang.Object)var4);
    ds.Fila var9 = new ds.Fila();
    boolean var10 = var9.vazia();
    boolean var11 = var9.vazia();
    var0.enfileira((java.lang.Object)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test47() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.String var2 = "hi!";
    var1.enfileira((java.lang.Object)var2);
    java.lang.Object var4 = var1.desenfileira();
    java.lang.Float var5 = new java.lang.Float(10.0f);
    var1.enfileira((java.lang.Object)var5);
    boolean var7 = var1.vazia();
    java.lang.Long var8 = new java.lang.Long(1L);
    var1.enfileira((java.lang.Object)var8);
    var1.imprime();
    boolean var11 = var1.vazia();
    var0.enfileira((java.lang.Object)var1);
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test48() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Object var3 = var0.desenfileira();
    ds.Fila var4 = new ds.Fila();
    ds.Fila var5 = new ds.Fila();
    var4.enfileira((java.lang.Object)var5);
    java.lang.Object var7 = var4.desenfileira();
    var0.enfileira((java.lang.Object)var4);
    ds.Fila var9 = new ds.Fila();
    var4.enfileira((java.lang.Object)var9);
    ds.Fila var11 = new ds.Fila();
    java.lang.Double var12 = new java.lang.Double((-1.0d));
    var11.enfileira((java.lang.Object)var12);
    java.lang.Object var14 = var11.desenfileira();
    ds.Fila var15 = new ds.Fila();
    var11.enfileira((java.lang.Object)var15);
    var9.enfileira((java.lang.Object)var11);
    var9.imprime();
    java.lang.Object var19 = new java.lang.Object();
    var9.enfileira(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + (-1.0d)+ "'", var14.equals((-1.0d)));

  }

  public void test49() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    java.lang.Object var3 = var0.desenfileira();
    ds.Fila var4 = new ds.Fila();
    ds.Fila var5 = new ds.Fila();
    var4.enfileira((java.lang.Object)var5);
    java.lang.Object var7 = var4.desenfileira();
    var0.enfileira((java.lang.Object)var4);
    ds.Fila var9 = new ds.Fila();
    var4.enfileira((java.lang.Object)var9);
    ds.Fila var11 = new ds.Fila();
    java.lang.Double var12 = new java.lang.Double((-1.0d));
    var11.enfileira((java.lang.Object)var12);
    java.lang.Object var14 = var11.desenfileira();
    ds.Fila var15 = new ds.Fila();
    var11.enfileira((java.lang.Object)var15);
    var9.enfileira((java.lang.Object)var11);
    var9.imprime();
    java.lang.Object var19 = var9.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + (-1.0d)+ "'", var14.equals((-1.0d)));

  }

  public void test50() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Float var1 = new java.lang.Float(100.0f);
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    var0.enfileira((java.lang.Object)var3);
    java.lang.Short var5 = new java.lang.Short((short)0);
    var3.enfileira((java.lang.Object)var5);
    ds.Fila var7 = new ds.Fila();
    java.lang.String var8 = "hi!";
    var7.enfileira((java.lang.Object)var8);
    java.lang.Object var10 = var7.desenfileira();
    java.lang.Float var11 = new java.lang.Float(10.0f);
    var7.enfileira((java.lang.Object)var11);
    boolean var13 = var7.vazia();
    java.lang.Long var14 = new java.lang.Long(1L);
    var7.enfileira((java.lang.Object)var14);
    var3.enfileira((java.lang.Object)var14);
    ds.Fila var17 = new ds.Fila();
    ds.Fila var18 = new ds.Fila();
    java.lang.Float var19 = new java.lang.Float(100.0f);
    var18.enfileira((java.lang.Object)var19);
    ds.Fila var21 = new ds.Fila();
    var18.enfileira((java.lang.Object)var21);
    java.lang.Short var23 = new java.lang.Short((short)0);
    var21.enfileira((java.lang.Object)var23);
    ds.Fila var25 = new ds.Fila();
    java.lang.String var26 = "hi!";
    var25.enfileira((java.lang.Object)var26);
    java.lang.Object var28 = var25.desenfileira();
    java.lang.Float var29 = new java.lang.Float(10.0f);
    var25.enfileira((java.lang.Object)var29);
    boolean var31 = var25.vazia();
    java.lang.Long var32 = new java.lang.Long(1L);
    var25.enfileira((java.lang.Object)var32);
    var21.enfileira((java.lang.Object)var32);
    boolean var35 = var21.vazia();
    boolean var36 = var21.vazia();
    boolean var37 = var21.vazia();
    var17.enfileira((java.lang.Object)var21);
    java.lang.Object var39 = var21.desenfileira();
    ds.Fila var40 = new ds.Fila();
    java.lang.Float var41 = new java.lang.Float(100.0f);
    var40.enfileira((java.lang.Object)var41);
    ds.Fila var43 = new ds.Fila();
    var40.enfileira((java.lang.Object)var43);
    java.lang.Short var45 = new java.lang.Short((short)0);
    var43.enfileira((java.lang.Object)var45);
    ds.Fila var47 = new ds.Fila();
    java.lang.String var48 = "hi!";
    var47.enfileira((java.lang.Object)var48);
    java.lang.Object var50 = var47.desenfileira();
    java.lang.Float var51 = new java.lang.Float(10.0f);
    var47.enfileira((java.lang.Object)var51);
    boolean var53 = var47.vazia();
    java.lang.Long var54 = new java.lang.Long(1L);
    var47.enfileira((java.lang.Object)var54);
    var43.enfileira((java.lang.Object)var54);
    var21.enfileira((java.lang.Object)var54);
    var21.imprime();
    var3.enfileira((java.lang.Object)var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + (short)0+ "'", var39.equals((short)0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "hi!"+ "'", var50.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);

  }

  public void test51() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.Integer var1 = new java.lang.Integer(10);
    var0.enfileira((java.lang.Object)var1);

  }

  public void test52() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    java.lang.Float var2 = new java.lang.Float(100.0f);
    var1.enfileira((java.lang.Object)var2);
    ds.Fila var4 = new ds.Fila();
    var1.enfileira((java.lang.Object)var4);
    java.lang.Short var6 = new java.lang.Short((short)0);
    var4.enfileira((java.lang.Object)var6);
    ds.Fila var8 = new ds.Fila();
    java.lang.String var9 = "hi!";
    var8.enfileira((java.lang.Object)var9);
    java.lang.Object var11 = var8.desenfileira();
    java.lang.Float var12 = new java.lang.Float(10.0f);
    var8.enfileira((java.lang.Object)var12);
    boolean var14 = var8.vazia();
    java.lang.Long var15 = new java.lang.Long(1L);
    var8.enfileira((java.lang.Object)var15);
    var4.enfileira((java.lang.Object)var15);
    var0.enfileira((java.lang.Object)var15);
    java.lang.Object var19 = var0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + 1L+ "'", var19.equals(1L));

  }

  public void test53() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    var0.imprime();
    var0.imprime();

  }

  public void test54() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    java.lang.String var1 = "hi!";
    var0.enfileira((java.lang.Object)var1);
    java.lang.Object var3 = var0.desenfileira();
    java.lang.Float var4 = new java.lang.Float(10.0f);
    var0.enfileira((java.lang.Object)var4);
    boolean var6 = var0.vazia();
    boolean var7 = var0.vazia();
    boolean var8 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test55() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    boolean var1 = var0.vazia();
    ds.Fila var2 = new ds.Fila();
    var0.enfileira((java.lang.Object)var2);
    java.lang.Object var4 = var0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test56() throws Throwable {

    ds.Fila var0 = new ds.Fila();
    ds.Fila var1 = new ds.Fila();
    var0.enfileira((java.lang.Object)var1);
    ds.Fila var3 = new ds.Fila();
    ds.Fila var4 = new ds.Fila();
    java.lang.Float var5 = new java.lang.Float(100.0f);
    var4.enfileira((java.lang.Object)var5);
    ds.Fila var7 = new ds.Fila();
    var4.enfileira((java.lang.Object)var7);
    java.lang.Short var9 = new java.lang.Short((short)0);
    var7.enfileira((java.lang.Object)var9);
    ds.Fila var11 = new ds.Fila();
    java.lang.String var12 = "hi!";
    var11.enfileira((java.lang.Object)var12);
    java.lang.Object var14 = var11.desenfileira();
    java.lang.Float var15 = new java.lang.Float(10.0f);
    var11.enfileira((java.lang.Object)var15);
    boolean var17 = var11.vazia();
    java.lang.Long var18 = new java.lang.Long(1L);
    var11.enfileira((java.lang.Object)var18);
    var7.enfileira((java.lang.Object)var18);
    var3.enfileira((java.lang.Object)var18);
    boolean var22 = var3.vazia();
    ds.Fila var23 = new ds.Fila();
    boolean var24 = var23.vazia();
    boolean var25 = var23.vazia();
    var3.enfileira((java.lang.Object)var23);
    java.lang.Object var27 = var3.desenfileira();
    var0.enfileira((java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + 1L+ "'", var27.equals(1L));

  }

}
