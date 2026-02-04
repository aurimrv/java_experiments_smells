package ds.seed5482;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed5482 in this file.
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
    boolean var3 = var1.vazia();
    ds.Lista var4 = new ds.Lista();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test4() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    java.lang.Boolean var1 = new java.lang.Boolean(false);
    var0.insere((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    var0.insere((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test5() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    java.lang.Boolean var2 = new java.lang.Boolean(false);
    var1.insere((java.lang.Object)var2);
    var0.insere((java.lang.Object)var1);
    var1.imprime();

  }

  public void test6() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    boolean var1 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test7() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    java.lang.Character var1 = new java.lang.Character(' ');
    var0.insere((java.lang.Object)var1);
    var0.imprime();

  }

  public void test8() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    var0.imprime();
    boolean var2 = var0.vazia();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test9() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    java.lang.Boolean var2 = new java.lang.Boolean(false);
    var1.insere((java.lang.Object)var2);
    var0.insere((java.lang.Object)var1);
    boolean var5 = var1.vazia();
    var1.insere((java.lang.Object)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test10() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    java.lang.Float var1 = new java.lang.Float(100.0f);
    var0.insere((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    ds.Lista var4 = new ds.Lista();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test11() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    java.lang.Byte var1 = new java.lang.Byte((byte)(-1));
    var0.insere((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    ds.Lista var4 = new ds.Lista();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test12() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    var0.imprime();
    ds.Lista var2 = new ds.Lista();

  }

  public void test13() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    var0.imprime();
    boolean var2 = var0.vazia();
    ds.Lista var3 = new ds.Lista();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test14() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    var1.imprime();
    var0.insere((java.lang.Object)var1);
    boolean var4 = var0.vazia();
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test15() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    java.lang.Double var1 = new java.lang.Double(100.0d);
    var0.insere((java.lang.Object)var1);
    ds.Lista var3 = new ds.Lista();

  }

  public void test16() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    java.lang.Double var1 = new java.lang.Double(100.0d);
    var0.insere((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    var0.insere((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test17() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    java.lang.Short var1 = new java.lang.Short((short)100);
    var0.insere((java.lang.Object)var1);
    var0.imprime();

  }

  public void test18() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    java.lang.Short var1 = new java.lang.Short((short)100);
    var0.insere((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test19() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    var1.imprime();
    var0.insere((java.lang.Object)var1);
    ds.Lista var4 = new ds.Lista();

  }

  public void test20() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    java.lang.Short var2 = new java.lang.Short((short)100);
    var1.insere((java.lang.Object)var2);
    var0.insere((java.lang.Object)var2);
    boolean var5 = var1.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test21() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    java.lang.Short var2 = new java.lang.Short((short)100);
    var1.insere((java.lang.Object)var2);
    var0.insere((java.lang.Object)var2);
    boolean var5 = var0.vazia();
    ds.Lista var6 = new ds.Lista();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test22() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    var1.imprime();
    var0.insere((java.lang.Object)var1);
    boolean var4 = var1.vazia();
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test23() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    var0.imprime();
    var0.insere((java.lang.Object)var0);

  }

  public void test24() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    java.lang.Character var1 = new java.lang.Character(' ');
    var0.insere((java.lang.Object)var1);
    ds.Lista var3 = new ds.Lista();

  }

  public void test25() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    java.lang.Character var1 = new java.lang.Character(' ');
    var0.insere((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    var0.insere((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test26() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    var1.imprime();
    boolean var3 = var1.vazia();
    var0.insere((java.lang.Object)var1);
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test27() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    var0.imprime();
    boolean var2 = var0.vazia();
    var0.insere((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test28() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    var1.imprime();
    boolean var3 = var1.vazia();
    var0.insere((java.lang.Object)var1);
    boolean var5 = var0.vazia();
    var1.insere((java.lang.Object)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test29() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    var1.imprime();
    var0.insere((java.lang.Object)var1);
    var1.imprime();

  }

  public void test30() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    var1.imprime();
    var0.insere((java.lang.Object)var1);
    boolean var4 = var0.vazia();
    ds.Lista var5 = new ds.Lista();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test31() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    ds.Lista var2 = new ds.Lista();
    java.lang.Short var3 = new java.lang.Short((short)100);
    var2.insere((java.lang.Object)var3);
    var1.insere((java.lang.Object)var3);
    var0.insere((java.lang.Object)var3);
    ds.Lista var7 = new ds.Lista();

  }

  public void test32() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    ds.Lista var2 = new ds.Lista();
    java.lang.Short var3 = new java.lang.Short((short)100);
    var2.insere((java.lang.Object)var3);
    var1.insere((java.lang.Object)var3);
    var0.insere((java.lang.Object)var3);
    boolean var7 = var0.vazia();
    var2.insere((java.lang.Object)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test33() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    java.lang.Double var2 = new java.lang.Double(100.0d);
    var1.insere((java.lang.Object)var2);
    var0.insere((java.lang.Object)var2);
    var1.imprime();

  }

  public void test34() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    var1.imprime();
    boolean var3 = var1.vazia();
    var0.insere((java.lang.Object)var1);
    boolean var5 = var0.vazia();
    ds.Lista var6 = new ds.Lista();
    ds.Lista var7 = new ds.Lista();
    var7.imprime();
    boolean var9 = var7.vazia();
    var6.insere((java.lang.Object)var7);
    boolean var11 = var6.vazia();
    var0.insere((java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test35() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    ds.Lista var2 = new ds.Lista();
    ds.Lista var3 = new ds.Lista();
    java.lang.Short var4 = new java.lang.Short((short)100);
    var3.insere((java.lang.Object)var4);
    var2.insere((java.lang.Object)var4);
    var1.insere((java.lang.Object)var4);
    var0.insere((java.lang.Object)var4);

  }

  public void test36() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    var0.imprime();
    ds.Lista var2 = new ds.Lista();
    ds.Lista var3 = new ds.Lista();
    var2.insere((java.lang.Object)var3);
    boolean var5 = var3.vazia();
    boolean var6 = var3.vazia();
    var0.insere((java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test37() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    var0.imprime();
    boolean var2 = var0.vazia();
    ds.Lista var3 = new ds.Lista();
    ds.Lista var4 = new ds.Lista();
    var4.imprime();
    boolean var6 = var4.vazia();
    var3.insere((java.lang.Object)var4);
    boolean var8 = var3.vazia();
    var0.insere((java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test38() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    var0.imprime();
    boolean var2 = var0.vazia();
    java.lang.Long var3 = new java.lang.Long(1L);
    var0.insere((java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test39() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    java.lang.Double var1 = new java.lang.Double(100.0d);
    var0.insere((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test40() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    java.lang.Boolean var2 = new java.lang.Boolean(false);
    var1.insere((java.lang.Object)var2);
    var0.insere((java.lang.Object)var1);
    boolean var5 = var1.vazia();
    ds.Lista var6 = new ds.Lista();
    var1.insere((java.lang.Object)var6);
    boolean var8 = var6.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test41() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    var0.imprime();
    java.lang.Double var2 = new java.lang.Double(0.0d);
    var0.insere((java.lang.Object)var2);

  }

  public void test42() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    java.lang.Short var1 = new java.lang.Short((short)100);
    var0.insere((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    ds.Lista var4 = new ds.Lista();
    java.lang.Byte var5 = new java.lang.Byte((byte)(-1));
    var4.insere((java.lang.Object)var5);
    var0.insere((java.lang.Object)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test43() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    java.lang.Double var2 = new java.lang.Double(100.0d);
    var1.insere((java.lang.Object)var2);
    var0.insere((java.lang.Object)var2);
    ds.Lista var5 = new ds.Lista();
    java.lang.Character var6 = new java.lang.Character(' ');
    var5.insere((java.lang.Object)var6);
    var0.insere((java.lang.Object)var6);

  }

  public void test44() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    var1.imprime();
    var0.insere((java.lang.Object)var1);
    boolean var4 = var1.vazia();
    boolean var5 = var1.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test45() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    var0.insere((java.lang.Object)var1);
    java.lang.Object var3 = new java.lang.Object();
    var0.insere(var3);

  }

  public void test46() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    java.lang.Short var1 = new java.lang.Short((short)0);
    var0.insere((java.lang.Object)var1);
    ds.Lista var3 = new ds.Lista();
    var0.insere((java.lang.Object)var3);

  }

  public void test47() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    var0.imprime();
    ds.Lista var2 = new ds.Lista();
    java.lang.Character var3 = new java.lang.Character(' ');
    var2.insere((java.lang.Object)var3);
    boolean var5 = var2.vazia();
    var2.imprime();
    var0.insere((java.lang.Object)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test48() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    var0.imprime();
    var0.imprime();
    var0.imprime();

  }

  public void test49() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    ds.Lista var2 = new ds.Lista();
    java.lang.Short var3 = new java.lang.Short((short)100);
    var2.insere((java.lang.Object)var3);
    var1.insere((java.lang.Object)var3);
    var0.insere((java.lang.Object)var3);
    boolean var7 = var0.vazia();
    ds.Lista var8 = new ds.Lista();
    var8.imprime();
    var0.insere((java.lang.Object)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test50() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    ds.Lista var2 = new ds.Lista();
    java.lang.Short var3 = new java.lang.Short((short)100);
    var2.insere((java.lang.Object)var3);
    var1.insere((java.lang.Object)var3);
    boolean var6 = var1.vazia();
    var0.insere((java.lang.Object)var1);
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test51() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    var0.imprime();
    ds.Lista var2 = new ds.Lista();
    var2.imprime();
    ds.Lista var4 = new ds.Lista();
    var4.imprime();
    var2.insere((java.lang.Object)var4);
    var0.insere((java.lang.Object)var2);

  }

  public void test52() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    var0.insere((java.lang.Object)var1);
    var0.imprime();
    java.lang.Character var4 = new java.lang.Character('#');
    var0.insere((java.lang.Object)var4);

  }

  public void test53() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    java.lang.Boolean var2 = new java.lang.Boolean(false);
    var1.insere((java.lang.Object)var2);
    var0.insere((java.lang.Object)var1);
    boolean var5 = var0.vazia();
    ds.Lista var6 = new ds.Lista();
    java.lang.Float var7 = new java.lang.Float(100.0f);
    var6.insere((java.lang.Object)var7);
    boolean var9 = var6.vazia();
    var0.insere((java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test54() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    java.lang.Double var1 = new java.lang.Double(100.0d);
    var0.insere((java.lang.Object)var1);
    var0.imprime();

  }

  public void test55() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    var0.imprime();
    ds.Lista var2 = new ds.Lista();
    var0.insere((java.lang.Object)var2);
    var2.imprime();

  }

  public void test56() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    var0.imprime();
    java.lang.Double var2 = new java.lang.Double(10.0d);
    var0.insere((java.lang.Object)var2);

  }

  public void test57() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    var0.imprime();
    boolean var2 = var0.vazia();
    boolean var3 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test58() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    java.lang.Short var2 = new java.lang.Short((short)100);
    var1.insere((java.lang.Object)var2);
    var0.insere((java.lang.Object)var2);
    boolean var5 = var0.vazia();
    ds.Lista var6 = new ds.Lista();
    var6.imprime();
    boolean var8 = var6.vazia();
    var0.insere((java.lang.Object)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test59() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    var0.imprime();
    ds.Lista var2 = new ds.Lista();
    var2.imprime();
    var0.insere((java.lang.Object)var2);
    boolean var5 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test60() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    java.lang.Character var1 = new java.lang.Character(' ');
    var0.insere((java.lang.Object)var1);
    ds.Lista var3 = new ds.Lista();
    ds.Lista var4 = new ds.Lista();
    var3.insere((java.lang.Object)var4);
    boolean var6 = var4.vazia();
    var0.insere((java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test61() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    var0.imprime();
    boolean var2 = var0.vazia();
    java.lang.Float var3 = new java.lang.Float(1.0f);
    var0.insere((java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test62() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    ds.Lista var2 = new ds.Lista();
    java.lang.Short var3 = new java.lang.Short((short)100);
    var2.insere((java.lang.Object)var3);
    var1.insere((java.lang.Object)var3);
    boolean var6 = var1.vazia();
    var0.insere((java.lang.Object)var1);
    boolean var8 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test63() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    java.lang.Boolean var2 = new java.lang.Boolean(false);
    var1.insere((java.lang.Object)var2);
    var0.insere((java.lang.Object)var1);
    boolean var5 = var1.vazia();
    var1.imprime();
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test64() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    var1.imprime();
    var0.insere((java.lang.Object)var1);
    boolean var4 = var0.vazia();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test65() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    java.lang.Short var1 = new java.lang.Short((short)0);
    var0.insere((java.lang.Object)var1);
    var0.imprime();

  }

  public void test66() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    var1.imprime();
    var0.insere((java.lang.Object)var1);
    ds.Lista var4 = new ds.Lista();
    ds.Lista var5 = new ds.Lista();
    ds.Lista var6 = new ds.Lista();
    java.lang.Short var7 = new java.lang.Short((short)100);
    var6.insere((java.lang.Object)var7);
    var5.insere((java.lang.Object)var7);
    var4.insere((java.lang.Object)var7);
    boolean var11 = var4.vazia();
    var1.insere((java.lang.Object)var11);
    var1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test67() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    var1.imprime();
    var0.insere((java.lang.Object)var1);
    ds.Lista var4 = new ds.Lista();
    var4.imprime();
    ds.Lista var6 = new ds.Lista();
    java.lang.Byte var7 = new java.lang.Byte((byte)(-1));
    var6.insere((java.lang.Object)var7);
    boolean var9 = var6.vazia();
    var4.insere((java.lang.Object)var9);
    var4.imprime();
    var0.insere((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test68() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    var0.imprime();
    var0.imprime();
    boolean var3 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test69() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    ds.Lista var2 = new ds.Lista();
    var1.insere((java.lang.Object)var2);
    boolean var4 = var2.vazia();
    boolean var5 = var2.vazia();
    var0.insere((java.lang.Object)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test70() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    java.lang.Boolean var1 = new java.lang.Boolean(false);
    var0.insere((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    var0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test71() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    var0.insere((java.lang.Object)var1);
    var0.imprime();
    var0.imprime();

  }

  public void test72() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    java.lang.Character var1 = new java.lang.Character('#');
    var0.insere((java.lang.Object)var1);

  }

  public void test73() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    java.lang.Character var1 = new java.lang.Character(' ');
    var0.insere((java.lang.Object)var1);
    ds.Lista var3 = new ds.Lista();
    var0.insere((java.lang.Object)var3);
    var0.imprime();

  }

  public void test74() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    var1.imprime();
    var0.insere((java.lang.Object)var1);
    boolean var4 = var1.vazia();
    ds.Lista var5 = new ds.Lista();
    ds.Lista var6 = new ds.Lista();
    var5.insere((java.lang.Object)var6);
    boolean var8 = var5.vazia();
    var1.insere((java.lang.Object)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test75() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    ds.Lista var1 = new ds.Lista();
    java.lang.Short var2 = new java.lang.Short((short)100);
    var1.insere((java.lang.Object)var2);
    var0.insere((java.lang.Object)var2);
    boolean var5 = var0.vazia();
    var0.imprime();
    boolean var7 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test76() throws Throwable {

    ds.Lista var0 = new ds.Lista();
    var0.imprime();
    ds.Lista var2 = new ds.Lista();
    var2.imprime();
    var0.insere((java.lang.Object)var2);
    boolean var5 = var2.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

}
