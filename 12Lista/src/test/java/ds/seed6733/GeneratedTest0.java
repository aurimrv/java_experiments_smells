package ds.seed6733;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed6733 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    var0.insere((java.lang.Object)var0);

  }

  public void test2() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    var0.insere((java.lang.Object)var1);
    ds.Lista var3 = new ds.Lista();

  }

  public void test3() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    var0.insere((java.lang.Object)var1);
    java.lang.Short var3 = new java.lang.Short((short)10);
    var1.insere((java.lang.Object)var3);
    boolean var5 = var1.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test4() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    var0.insere((java.lang.Object)var1);
    java.lang.Short var3 = new java.lang.Short((short)10);
    var1.insere((java.lang.Object)var3);
    java.lang.Double var5 = new java.lang.Double(10.0d);
    var1.insere((java.lang.Object)var5);
    boolean var7 = var1.vazia();
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test5() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    var0.insere((java.lang.Object)var1);
    java.lang.Short var3 = new java.lang.Short((short)10);
    var1.insere((java.lang.Object)var3);
    java.lang.Double var5 = new java.lang.Double(10.0d);
    var1.insere((java.lang.Object)var5);
    boolean var7 = var1.vazia();
    boolean var8 = var1.vazia();
    var1.insere((java.lang.Object)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test6() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    var0.insere((java.lang.Object)var1);
    java.lang.Short var3 = new java.lang.Short((short)10);
    var1.insere((java.lang.Object)var3);
    java.lang.Double var5 = new java.lang.Double(10.0d);
    var1.insere((java.lang.Object)var5);
    boolean var7 = var1.vazia();
    boolean var8 = var1.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test7() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    ds.Lista var2 = new ds.Lista();
    var1.insere((java.lang.Object)var2);
    java.lang.Short var4 = new java.lang.Short((short)10);
    var2.insere((java.lang.Object)var4);
    java.lang.Double var6 = new java.lang.Double(10.0d);
    var2.insere((java.lang.Object)var6);
    boolean var8 = var2.vazia();
    var0.insere((java.lang.Object)var8);
    boolean var10 = var2.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test8() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    ds.Lista var2 = new ds.Lista();
    var1.insere((java.lang.Object)var2);
    java.lang.Short var4 = new java.lang.Short((short)10);
    var2.insere((java.lang.Object)var4);
    java.lang.Double var6 = new java.lang.Double(10.0d);
    var2.insere((java.lang.Object)var6);
    var0.insere((java.lang.Object)var2);
    boolean var9 = var2.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test9() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    java.lang.Long var1 = new java.lang.Long(1L);
    var0.insere((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test10() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    var0.imprime();
    ds.Lista var2 = new ds.Lista();

  }

  public void test11() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    java.lang.Short var1 = new java.lang.Short((short)1);
    var0.insere((java.lang.Object)var1);
    ds.Lista var3 = new ds.Lista();

  }

  public void test12() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    ds.Lista var3 = new ds.Lista();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test13() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    boolean var1 = var0.vazia();
    ds.Lista var2 = new ds.Lista();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test14() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    ds.Lista var2 = new ds.Lista();
    var1.insere((java.lang.Object)var2);
    java.lang.Short var4 = new java.lang.Short((short)10);
    var2.insere((java.lang.Object)var4);
    java.lang.Double var6 = new java.lang.Double(10.0d);
    var2.insere((java.lang.Object)var6);
    boolean var8 = var2.vazia();
    var0.insere((java.lang.Object)var8);
    java.lang.Byte var10 = new java.lang.Byte((byte)1);
    var0.insere((java.lang.Object)var10);
    var2.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test15() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    ds.Lista var2 = new ds.Lista();
    var1.insere((java.lang.Object)var2);
    java.lang.Short var4 = new java.lang.Short((short)10);
    var2.insere((java.lang.Object)var4);
    java.lang.Double var6 = new java.lang.Double(10.0d);
    var2.insere((java.lang.Object)var6);
    var0.insere((java.lang.Object)var2);
    java.lang.Byte var9 = new java.lang.Byte((byte)(-1));
    var0.insere((java.lang.Object)var9);
    ds.Lista var11 = new ds.Lista();

  }

  public void test16() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    ds.Lista var2 = new ds.Lista();
    var1.insere((java.lang.Object)var2);
    java.lang.Short var4 = new java.lang.Short((short)10);
    var2.insere((java.lang.Object)var4);
    java.lang.Double var6 = new java.lang.Double(10.0d);
    var2.insere((java.lang.Object)var6);
    var0.insere((java.lang.Object)var2);
    java.lang.Byte var9 = new java.lang.Byte((byte)(-1));
    var0.insere((java.lang.Object)var9);
    ds.Lista var11 = new ds.Lista();
    boolean var12 = var11.vazia();
    boolean var13 = var11.vazia();
    var0.insere((java.lang.Object)var11);
    ds.Lista var15 = new ds.Lista();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test17() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    java.lang.Short var1 = new java.lang.Short((short)1);
    var0.insere((java.lang.Object)var1);
    java.lang.Double var3 = new java.lang.Double(10.0d);
    var0.insere((java.lang.Object)var3);
    ds.Lista var5 = new ds.Lista();

  }

  public void test18() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    var0.insere((java.lang.Object)var1);
    var1.imprime();

  }

  public void test19() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    java.lang.Short var1 = new java.lang.Short((short)1);
    var0.insere((java.lang.Object)var1);
    java.lang.Double var3 = new java.lang.Double(10.0d);
    var0.insere((java.lang.Object)var3);
    ds.Lista var5 = new ds.Lista();
    java.lang.Long var6 = new java.lang.Long(1L);
    var5.insere((java.lang.Object)var6);
    var0.insere((java.lang.Object)var5);
    boolean var9 = var5.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test20() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    java.lang.Long var1 = new java.lang.Long(1L);
    var0.insere((java.lang.Object)var1);
    ds.Lista var3 = new ds.Lista();
    var0.insere((java.lang.Object)var3);
    var3.imprime();

  }

  public void test21() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    ds.Lista var2 = new ds.Lista();
    var1.insere((java.lang.Object)var2);
    java.lang.Short var4 = new java.lang.Short((short)10);
    var2.insere((java.lang.Object)var4);
    java.lang.Double var6 = new java.lang.Double(10.0d);
    var2.insere((java.lang.Object)var6);
    var0.insere((java.lang.Object)var2);
    java.lang.Byte var9 = new java.lang.Byte((byte)(-1));
    var0.insere((java.lang.Object)var9);
    ds.Lista var11 = new ds.Lista();
    boolean var12 = var11.vazia();
    boolean var13 = var11.vazia();
    var0.insere((java.lang.Object)var11);
    boolean var15 = var11.vazia();
    ds.Lista var16 = new ds.Lista();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test22() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    ds.Lista var2 = new ds.Lista();
    var1.insere((java.lang.Object)var2);
    java.lang.Short var4 = new java.lang.Short((short)10);
    var2.insere((java.lang.Object)var4);
    java.lang.Double var6 = new java.lang.Double(10.0d);
    var2.insere((java.lang.Object)var6);
    var0.insere((java.lang.Object)var2);
    java.lang.Byte var9 = new java.lang.Byte((byte)(-1));
    var0.insere((java.lang.Object)var9);
    ds.Lista var11 = new ds.Lista();
    boolean var12 = var11.vazia();
    boolean var13 = var11.vazia();
    var0.insere((java.lang.Object)var11);
    boolean var15 = var11.vazia();
    boolean var16 = var11.vazia();
    ds.Lista var17 = new ds.Lista();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test23() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    var0.insere((java.lang.Object)var1);
    ds.Lista var3 = new ds.Lista();
    ds.Lista var4 = new ds.Lista();
    var3.insere((java.lang.Object)var4);
    var1.insere((java.lang.Object)var4);
    boolean var7 = var4.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test24() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    var0.insere((java.lang.Object)var1);
    ds.Lista var3 = new ds.Lista();
    ds.Lista var4 = new ds.Lista();
    var3.insere((java.lang.Object)var4);
    var1.insere((java.lang.Object)var4);
    java.lang.Short var7 = new java.lang.Short((short)100);
    var1.insere((java.lang.Object)var7);
    ds.Lista var9 = new ds.Lista();

  }

  public void test25() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    var0.insere((java.lang.Object)var1);
    ds.Lista var3 = new ds.Lista();
    ds.Lista var4 = new ds.Lista();
    var3.insere((java.lang.Object)var4);
    var1.insere((java.lang.Object)var4);
    java.lang.Short var7 = new java.lang.Short((short)100);
    var1.insere((java.lang.Object)var7);
    boolean var9 = var1.vazia();
    var4.insere((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test26() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    ds.Lista var2 = new ds.Lista();
    var1.insere((java.lang.Object)var2);
    java.lang.Short var4 = new java.lang.Short((short)10);
    var2.insere((java.lang.Object)var4);
    java.lang.Double var6 = new java.lang.Double(10.0d);
    var2.insere((java.lang.Object)var6);
    boolean var8 = var2.vazia();
    var0.insere((java.lang.Object)var2);
    ds.Lista var10 = new ds.Lista();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test27() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    var0.insere((java.lang.Object)var1);
    ds.Lista var3 = new ds.Lista();
    ds.Lista var4 = new ds.Lista();
    var3.insere((java.lang.Object)var4);
    var1.insere((java.lang.Object)var4);
    java.lang.Short var7 = new java.lang.Short((short)100);
    var1.insere((java.lang.Object)var7);
    boolean var9 = var1.vazia();
    boolean var10 = var1.vazia();
    var4.insere((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test28() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    ds.Lista var2 = new ds.Lista();
    var1.insere((java.lang.Object)var2);
    java.lang.Short var4 = new java.lang.Short((short)10);
    var2.insere((java.lang.Object)var4);
    java.lang.Double var6 = new java.lang.Double(10.0d);
    var2.insere((java.lang.Object)var6);
    boolean var8 = var2.vazia();
    var0.insere((java.lang.Object)var8);
    java.lang.Byte var10 = new java.lang.Byte((byte)1);
    var0.insere((java.lang.Object)var10);
    ds.Lista var12 = new ds.Lista();
    boolean var13 = var12.vazia();
    var0.insere((java.lang.Object)var12);
    boolean var15 = var12.vazia();
    ds.Lista var16 = new ds.Lista();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test29() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    java.lang.Long var1 = new java.lang.Long(1L);
    var0.insere((java.lang.Object)var1);
    ds.Lista var3 = new ds.Lista();
    var0.insere((java.lang.Object)var3);
    java.lang.Short var5 = new java.lang.Short((short)100);
    var3.insere((java.lang.Object)var5);
    ds.Lista var7 = new ds.Lista();

  }

  public void test30() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    java.lang.Long var1 = new java.lang.Long(1L);
    var0.insere((java.lang.Object)var1);
    ds.Lista var3 = new ds.Lista();
    var0.insere((java.lang.Object)var3);
    java.lang.Short var5 = new java.lang.Short((short)100);
    var3.insere((java.lang.Object)var5);
    boolean var7 = var3.vazia();
    var3.insere((java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test31() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    java.lang.Short var1 = new java.lang.Short((short)1);
    var0.insere((java.lang.Object)var1);
    java.lang.Double var3 = new java.lang.Double(10.0d);
    var0.insere((java.lang.Object)var3);
    ds.Lista var5 = new ds.Lista();
    java.lang.Long var6 = new java.lang.Long(1L);
    var5.insere((java.lang.Object)var6);
    var0.insere((java.lang.Object)var5);
    boolean var9 = var0.vazia();
    ds.Lista var10 = new ds.Lista();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test32() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    java.lang.Short var1 = new java.lang.Short((short)1);
    var0.insere((java.lang.Object)var1);
    java.lang.Double var3 = new java.lang.Double(10.0d);
    var0.insere((java.lang.Object)var3);
    ds.Lista var5 = new ds.Lista();
    java.lang.Long var6 = new java.lang.Long(1L);
    var5.insere((java.lang.Object)var6);
    var0.insere((java.lang.Object)var5);
    boolean var9 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test33() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    ds.Lista var2 = new ds.Lista();
    var1.insere((java.lang.Object)var2);
    java.lang.Short var4 = new java.lang.Short((short)10);
    var2.insere((java.lang.Object)var4);
    java.lang.Double var6 = new java.lang.Double(10.0d);
    var2.insere((java.lang.Object)var6);
    boolean var8 = var2.vazia();
    var0.insere((java.lang.Object)var2);
    java.lang.Integer var10 = new java.lang.Integer((-1));
    var0.insere((java.lang.Object)var10);
    boolean var12 = var2.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test34() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    ds.Lista var2 = new ds.Lista();
    var1.insere((java.lang.Object)var2);
    java.lang.Short var4 = new java.lang.Short((short)10);
    var2.insere((java.lang.Object)var4);
    java.lang.Double var6 = new java.lang.Double(10.0d);
    var2.insere((java.lang.Object)var6);
    boolean var8 = var2.vazia();
    var0.insere((java.lang.Object)var2);
    java.lang.Integer var10 = new java.lang.Integer((-1));
    var0.insere((java.lang.Object)var10);
    ds.Lista var12 = new ds.Lista();
    ds.Lista var13 = new ds.Lista();
    var12.insere((java.lang.Object)var13);
    ds.Lista var15 = new ds.Lista();
    ds.Lista var16 = new ds.Lista();
    var15.insere((java.lang.Object)var16);
    var13.insere((java.lang.Object)var16);
    var0.insere((java.lang.Object)var16);
    var16.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test35() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    ds.Lista var2 = new ds.Lista();
    var1.insere((java.lang.Object)var2);
    java.lang.Short var4 = new java.lang.Short((short)10);
    var2.insere((java.lang.Object)var4);
    java.lang.Double var6 = new java.lang.Double(10.0d);
    var2.insere((java.lang.Object)var6);
    boolean var8 = var2.vazia();
    var0.insere((java.lang.Object)var2);
    java.lang.Integer var10 = new java.lang.Integer((-1));
    var0.insere((java.lang.Object)var10);
    ds.Lista var12 = new ds.Lista();
    ds.Lista var13 = new ds.Lista();
    var12.insere((java.lang.Object)var13);
    ds.Lista var15 = new ds.Lista();
    ds.Lista var16 = new ds.Lista();
    var15.insere((java.lang.Object)var16);
    var13.insere((java.lang.Object)var16);
    var0.insere((java.lang.Object)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test36() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    java.lang.Long var1 = new java.lang.Long(100L);
    var0.insere((java.lang.Object)var1);

  }

  public void test37() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    java.lang.Double var1 = new java.lang.Double(1.0d);
    var0.insere((java.lang.Object)var1);

  }

  public void test38() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    ds.Lista var2 = new ds.Lista();
    var1.insere((java.lang.Object)var2);
    java.lang.Short var4 = new java.lang.Short((short)10);
    var2.insere((java.lang.Object)var4);
    java.lang.Double var6 = new java.lang.Double(10.0d);
    var2.insere((java.lang.Object)var6);
    var0.insere((java.lang.Object)var2);
    var0.imprime();

  }

  public void test39() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    ds.Lista var2 = new ds.Lista();
    ds.Lista var3 = new ds.Lista();
    var2.insere((java.lang.Object)var3);
    java.lang.Short var5 = new java.lang.Short((short)10);
    var3.insere((java.lang.Object)var5);
    java.lang.Double var7 = new java.lang.Double(10.0d);
    var3.insere((java.lang.Object)var7);
    boolean var9 = var3.vazia();
    var1.insere((java.lang.Object)var3);
    java.lang.Integer var11 = new java.lang.Integer((-1));
    var1.insere((java.lang.Object)var11);
    var0.insere((java.lang.Object)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test40() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    boolean var1 = var0.vazia();
    var0.imprime();
    boolean var3 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test41() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    var0.insere((java.lang.Object)var1);
    ds.Lista var3 = new ds.Lista();
    ds.Lista var4 = new ds.Lista();
    var3.insere((java.lang.Object)var4);
    var1.insere((java.lang.Object)var4);
    java.lang.Short var7 = new java.lang.Short((short)100);
    var1.insere((java.lang.Object)var7);
    ds.Lista var9 = new ds.Lista();
    java.lang.Short var10 = new java.lang.Short((short)1);
    var9.insere((java.lang.Object)var10);
    var1.insere((java.lang.Object)var9);

  }

  public void test42() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    var0.imprime();
    ds.Lista var2 = new ds.Lista();
    var0.insere((java.lang.Object)var2);
    ds.Lista var4 = new ds.Lista();
    java.lang.Short var5 = new java.lang.Short((short)1);
    var4.insere((java.lang.Object)var5);
    java.lang.Double var7 = new java.lang.Double(10.0d);
    var4.insere((java.lang.Object)var7);
    var2.insere((java.lang.Object)var4);

  }

  public void test43() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    ds.Lista var2 = new ds.Lista();
    var1.insere((java.lang.Object)var2);
    java.lang.Short var4 = new java.lang.Short((short)10);
    var2.insere((java.lang.Object)var4);
    java.lang.Double var6 = new java.lang.Double(10.0d);
    var2.insere((java.lang.Object)var6);
    boolean var8 = var2.vazia();
    var0.insere((java.lang.Object)var2);
    ds.Lista var10 = new ds.Lista();
    var2.insere((java.lang.Object)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test44() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    ds.Lista var2 = new ds.Lista();
    var1.insere((java.lang.Object)var2);
    java.lang.Short var4 = new java.lang.Short((short)10);
    var2.insere((java.lang.Object)var4);
    java.lang.Double var6 = new java.lang.Double(10.0d);
    var2.insere((java.lang.Object)var6);
    var0.insere((java.lang.Object)var2);
    java.lang.Byte var9 = new java.lang.Byte((byte)(-1));
    var0.insere((java.lang.Object)var9);
    ds.Lista var11 = new ds.Lista();
    boolean var12 = var11.vazia();
    boolean var13 = var11.vazia();
    var0.insere((java.lang.Object)var11);
    ds.Lista var15 = new ds.Lista();
    ds.Lista var16 = new ds.Lista();
    var15.insere((java.lang.Object)var16);
    java.lang.Short var18 = new java.lang.Short((short)10);
    var16.insere((java.lang.Object)var18);
    var11.insere((java.lang.Object)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test45() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    ds.Lista var2 = new ds.Lista();
    var1.insere((java.lang.Object)var2);
    java.lang.Short var4 = new java.lang.Short((short)10);
    var2.insere((java.lang.Object)var4);
    java.lang.Double var6 = new java.lang.Double(10.0d);
    var2.insere((java.lang.Object)var6);
    var0.insere((java.lang.Object)var2);
    var2.imprime();

  }

  public void test46() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    ds.Lista var2 = new ds.Lista();
    var1.insere((java.lang.Object)var2);
    java.lang.Short var4 = new java.lang.Short((short)10);
    var2.insere((java.lang.Object)var4);
    java.lang.Double var6 = new java.lang.Double(10.0d);
    var2.insere((java.lang.Object)var6);
    var0.insere((java.lang.Object)var2);
    java.lang.Byte var9 = new java.lang.Byte((byte)(-1));
    var0.insere((java.lang.Object)var9);
    ds.Lista var11 = new ds.Lista();
    boolean var12 = var11.vazia();
    boolean var13 = var11.vazia();
    var0.insere((java.lang.Object)var11);
    boolean var15 = var11.vazia();
    var11.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test47() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    java.lang.Long var1 = new java.lang.Long(1L);
    var0.insere((java.lang.Object)var1);
    ds.Lista var3 = new ds.Lista();
    var0.insere((java.lang.Object)var3);
    java.lang.Short var5 = new java.lang.Short((short)100);
    var3.insere((java.lang.Object)var5);
    boolean var7 = var3.vazia();
    boolean var8 = var3.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test48() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    ds.Lista var2 = new ds.Lista();
    var1.insere((java.lang.Object)var2);
    java.lang.Short var4 = new java.lang.Short((short)10);
    var2.insere((java.lang.Object)var4);
    java.lang.Double var6 = new java.lang.Double(10.0d);
    var2.insere((java.lang.Object)var6);
    boolean var8 = var2.vazia();
    var0.insere((java.lang.Object)var8);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test49() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    java.lang.Short var1 = new java.lang.Short((short)1);
    var0.insere((java.lang.Object)var1);
    java.lang.Double var3 = new java.lang.Double(10.0d);
    var0.insere((java.lang.Object)var3);
    ds.Lista var5 = new ds.Lista();
    java.lang.Long var6 = new java.lang.Long(1L);
    var5.insere((java.lang.Object)var6);
    var0.insere((java.lang.Object)var5);
    ds.Lista var9 = new ds.Lista();
    boolean var10 = var9.vazia();
    ds.Lista var11 = new ds.Lista();
    var9.insere((java.lang.Object)var11);
    var0.insere((java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test50() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    java.lang.Object var1 = new java.lang.Object();
    var0.insere(var1);

  }

  public void test51() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    ds.Lista var2 = new ds.Lista();
    ds.Lista var3 = new ds.Lista();
    var2.insere((java.lang.Object)var3);
    java.lang.Short var5 = new java.lang.Short((short)10);
    var3.insere((java.lang.Object)var5);
    java.lang.Double var7 = new java.lang.Double(10.0d);
    var3.insere((java.lang.Object)var7);
    var1.insere((java.lang.Object)var3);
    java.lang.Byte var10 = new java.lang.Byte((byte)(-1));
    var1.insere((java.lang.Object)var10);
    ds.Lista var12 = new ds.Lista();
    boolean var13 = var12.vazia();
    boolean var14 = var12.vazia();
    var1.insere((java.lang.Object)var12);
    boolean var16 = var12.vazia();
    boolean var17 = var12.vazia();
    var0.insere((java.lang.Object)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test52() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    ds.Lista var2 = new ds.Lista();
    var1.insere((java.lang.Object)var2);
    java.lang.Short var4 = new java.lang.Short((short)10);
    var2.insere((java.lang.Object)var4);
    java.lang.Double var6 = new java.lang.Double(10.0d);
    var2.insere((java.lang.Object)var6);
    boolean var8 = var2.vazia();
    var0.insere((java.lang.Object)var8);
    java.lang.Byte var10 = new java.lang.Byte((byte)1);
    var0.insere((java.lang.Object)var10);
    ds.Lista var12 = new ds.Lista();
    boolean var13 = var12.vazia();
    var0.insere((java.lang.Object)var12);
    boolean var15 = var12.vazia();
    ds.Lista var16 = new ds.Lista();
    java.lang.Long var17 = new java.lang.Long(1L);
    var16.insere((java.lang.Object)var17);
    var12.insere((java.lang.Object)var16);
    var12.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test53() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    java.lang.Short var1 = new java.lang.Short((short)1);
    var0.insere((java.lang.Object)var1);
    ds.Lista var3 = new ds.Lista();
    ds.Lista var4 = new ds.Lista();
    var3.insere((java.lang.Object)var4);
    java.lang.Short var6 = new java.lang.Short((short)10);
    var4.insere((java.lang.Object)var6);
    var0.insere((java.lang.Object)var4);
    boolean var9 = var4.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test54() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    var1.imprime();
    var0.insere((java.lang.Object)var1);
    var0.imprime();
    boolean var5 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test55() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    var1.imprime();
    var0.insere((java.lang.Object)var1);
    ds.Lista var4 = new ds.Lista();
    ds.Lista var5 = new ds.Lista();
    ds.Lista var6 = new ds.Lista();
    var5.insere((java.lang.Object)var6);
    java.lang.Short var8 = new java.lang.Short((short)10);
    var6.insere((java.lang.Object)var8);
    java.lang.Double var10 = new java.lang.Double(10.0d);
    var6.insere((java.lang.Object)var10);
    boolean var12 = var6.vazia();
    var4.insere((java.lang.Object)var6);
    var0.insere((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test56() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    var0.insere((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test57() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    var0.insere((java.lang.Object)var1);
    ds.Lista var3 = new ds.Lista();
    ds.Lista var4 = new ds.Lista();
    var3.insere((java.lang.Object)var4);
    var1.insere((java.lang.Object)var4);
    java.lang.Short var7 = new java.lang.Short((short)100);
    var1.insere((java.lang.Object)var7);
    boolean var9 = var1.vazia();
    boolean var10 = var1.vazia();
    boolean var11 = var1.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test58() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test59() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    ds.Lista var2 = new ds.Lista();
    var1.insere((java.lang.Object)var2);
    java.lang.Short var4 = new java.lang.Short((short)10);
    var2.insere((java.lang.Object)var4);
    java.lang.Double var6 = new java.lang.Double(10.0d);
    var2.insere((java.lang.Object)var6);
    boolean var8 = var2.vazia();
    var0.insere((java.lang.Object)var8);
    boolean var10 = var0.vazia();
    boolean var11 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test60() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    var1.imprime();
    var0.insere((java.lang.Object)var1);
    var0.imprime();
    var0.imprime();
    ds.Lista var6 = new ds.Lista();
    var6.imprime();
    ds.Lista var8 = new ds.Lista();
    var6.insere((java.lang.Object)var8);
    var0.insere((java.lang.Object)var8);

  }

  public void test61() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    ds.Lista var2 = new ds.Lista();
    var1.insere((java.lang.Object)var2);
    java.lang.Short var4 = new java.lang.Short((short)10);
    var2.insere((java.lang.Object)var4);
    java.lang.Double var6 = new java.lang.Double(10.0d);
    var2.insere((java.lang.Object)var6);
    var0.insere((java.lang.Object)var2);
    java.lang.Byte var9 = new java.lang.Byte((byte)(-1));
    var0.insere((java.lang.Object)var9);
    ds.Lista var11 = new ds.Lista();
    boolean var12 = var11.vazia();
    boolean var13 = var11.vazia();
    var0.insere((java.lang.Object)var11);
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test62() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    ds.Lista var2 = new ds.Lista();
    var1.insere((java.lang.Object)var2);
    java.lang.Short var4 = new java.lang.Short((short)10);
    var2.insere((java.lang.Object)var4);
    java.lang.Double var6 = new java.lang.Double(10.0d);
    var2.insere((java.lang.Object)var6);
    var0.insere((java.lang.Object)var2);
    ds.Lista var9 = new ds.Lista();
    ds.Lista var10 = new ds.Lista();
    var9.insere((java.lang.Object)var10);
    var2.insere((java.lang.Object)var9);
    ds.Lista var13 = new ds.Lista();
    ds.Lista var14 = new ds.Lista();
    boolean var15 = var14.vazia();
    boolean var16 = var14.vazia();
    var13.insere((java.lang.Object)var16);
    var2.insere((java.lang.Object)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test63() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    ds.Lista var2 = new ds.Lista();
    var1.insere((java.lang.Object)var2);
    java.lang.Short var4 = new java.lang.Short((short)10);
    var2.insere((java.lang.Object)var4);
    java.lang.Double var6 = new java.lang.Double(10.0d);
    var2.insere((java.lang.Object)var6);
    boolean var8 = var2.vazia();
    var0.insere((java.lang.Object)var2);
    boolean var10 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

}
