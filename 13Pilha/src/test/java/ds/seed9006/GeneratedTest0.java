package ds.seed9006;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed9006 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Byte var1 = new java.lang.Byte((byte)(-1));
    var0.empilha((java.lang.Object)var1);
    java.lang.Object var3 = var0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + (byte)(-1)+ "'", var3.equals((byte)(-1)));

  }

  public void test2() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Byte var1 = new java.lang.Byte((byte)(-1));
    var0.empilha((java.lang.Object)var1);
    int var3 = var0.tamanho();
    java.lang.Object var4 = var0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (byte)(-1)+ "'", var4.equals((byte)(-1)));

  }

  public void test3() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Byte var1 = new java.lang.Byte((byte)(-1));
    var0.empilha((java.lang.Object)var1);
    int var3 = var0.tamanho();
    boolean var4 = var0.vazia();
    int var5 = var0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);

  }

  public void test4() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Byte var1 = new java.lang.Byte((byte)(-1));
    var0.empilha((java.lang.Object)var1);
    int var3 = var0.tamanho();
    boolean var4 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test5() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    var0.empilha((java.lang.Object)var0);

  }

  public void test6() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var1 = var0.desempilha();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    var0.empilha((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test8() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = var0.desempilha();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test9() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    int var2 = var0.tamanho();
    boolean var3 = var0.vazia();
    ds.Pilha var4 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test10() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Short var1 = new java.lang.Short((short)1);
    var0.empilha((java.lang.Object)var1);
    java.lang.Object var3 = var0.desempilha();
    var0.empilha(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + (short)1+ "'", var3.equals((short)1));

  }

  public void test11() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Byte var1 = new java.lang.Byte((byte)100);
    var0.empilha((java.lang.Object)var1);
    int var3 = var0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test12() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    int var2 = var0.tamanho();
    var0.empilha((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test13() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    int var3 = var1.tamanho();
    var0.empilha((java.lang.Object)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var1.desempilha();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test14() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    int var3 = var1.tamanho();
    var0.empilha((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var1.desempilha();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test15() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Byte var1 = new java.lang.Byte((byte)100);
    var0.empilha((java.lang.Object)var1);
    java.lang.Object var3 = var0.desempilha();
    ds.Pilha var4 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + (byte)100+ "'", var3.equals((byte)100));

  }

  public void test16() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Short var1 = new java.lang.Short((short)1);
    var0.empilha((java.lang.Object)var1);
    java.lang.Object var3 = var0.desempilha();
    boolean var4 = var0.vazia();
    int var5 = var0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + (short)1+ "'", var3.equals((short)1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test17() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    int var2 = var0.tamanho();
    ds.Pilha var3 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test18() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    var0.empilha((java.lang.Object)var2);
    ds.Pilha var4 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test19() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    var0.empilha((java.lang.Object)var2);
    java.lang.Object var4 = var0.desempilha();
    var1.empilha(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test20() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    int var2 = var0.tamanho();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var0.desempilha();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test21() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    int var2 = var0.tamanho();
    boolean var3 = var0.vazia();
    var0.empilha((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test22() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    var0.empilha((java.lang.Object)var2);
    java.lang.Object var4 = var0.desempilha();
    boolean var5 = var0.vazia();
    ds.Pilha var6 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test23() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Byte var1 = new java.lang.Byte((byte)100);
    var0.empilha((java.lang.Object)var1);
    java.lang.Object var3 = var0.desempilha();
    boolean var4 = var0.vazia();
    ds.Pilha var5 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + (byte)100+ "'", var3.equals((byte)100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test24() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    var0.empilha((java.lang.Object)var2);
    java.lang.Object var4 = var0.desempilha();
    boolean var5 = var0.vazia();
    boolean var6 = var0.vazia();
    ds.Pilha var7 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test25() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Short var1 = new java.lang.Short((short)1);
    var0.empilha((java.lang.Object)var1);
    java.lang.Object var3 = var0.desempilha();
    boolean var4 = var0.vazia();
    boolean var5 = var0.vazia();
    var0.empilha(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + (short)1+ "'", var3.equals((short)1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test26() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Short var1 = new java.lang.Short((short)1);
    var0.empilha((java.lang.Object)var1);
    java.lang.Object var3 = var0.desempilha();
    boolean var4 = var0.vazia();
    boolean var5 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + (short)1+ "'", var3.equals((short)1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test27() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    int var3 = var1.tamanho();
    var0.empilha((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    boolean var6 = var0.vazia();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var1.desempilha();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test28() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    int var3 = var1.tamanho();
    var0.empilha((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    boolean var6 = var0.vazia();
    boolean var7 = var0.vazia();
    int var8 = var1.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test29() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Byte var1 = new java.lang.Byte((byte)100);
    var0.empilha((java.lang.Object)var1);
    java.lang.Object var3 = var0.desempilha();
    boolean var4 = var0.vazia();
    boolean var5 = var0.vazia();
    ds.Pilha var6 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + (byte)100+ "'", var3.equals((byte)100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test30() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Byte var1 = new java.lang.Byte((byte)100);
    var0.empilha((java.lang.Object)var1);
    java.lang.Object var3 = var0.desempilha();
    boolean var4 = var0.vazia();
    boolean var5 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + (byte)100+ "'", var3.equals((byte)100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test31() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Character var1 = new java.lang.Character('4');
    var0.empilha((java.lang.Object)var1);
    java.lang.Object var3 = var0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + '4'+ "'", var3.equals('4'));

  }

  public void test32() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Character var1 = new java.lang.Character('4');
    var0.empilha((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    var0.empilha((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test33() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    java.lang.Short var2 = new java.lang.Short((short)1);
    var1.empilha((java.lang.Object)var2);
    var0.empilha((java.lang.Object)var1);
    java.lang.Object var5 = var1.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + (short)1+ "'", var5.equals((short)1));

  }

  public void test34() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Character var1 = new java.lang.Character('4');
    var0.empilha((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    boolean var4 = var0.vazia();
    ds.Pilha var5 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test35() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Character var1 = new java.lang.Character('4');
    var0.empilha((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    boolean var4 = var0.vazia();
    boolean var5 = var0.vazia();
    java.lang.Object var6 = var0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + '4'+ "'", var6.equals('4'));

  }

  public void test36() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    var0.empilha((java.lang.Object)var1);
    int var3 = var1.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test37() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    var0.empilha((java.lang.Object)var1);

  }

  public void test38() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    int var3 = var1.tamanho();
    boolean var4 = var1.vazia();
    var0.empilha((java.lang.Object)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var1.desempilha();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test39() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    int var3 = var1.tamanho();
    var0.empilha((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    int var6 = var0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);

  }

  public void test40() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    ds.Pilha var2 = new ds.Pilha();
    ds.Pilha var3 = new ds.Pilha();
    boolean var4 = var3.vazia();
    int var5 = var3.tamanho();
    boolean var6 = var3.vazia();
    var2.empilha((java.lang.Object)var6);
    var0.empilha((java.lang.Object)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test41() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    var0.empilha((java.lang.Object)var2);
    java.lang.Object var4 = var0.desempilha();
    int var5 = var0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test42() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    int var1 = var0.tamanho();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = var0.desempilha();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test43() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Byte var1 = new java.lang.Byte((byte)(-1));
    var0.empilha((java.lang.Object)var1);
    int var3 = var0.tamanho();
    java.lang.Object var4 = new java.lang.Object();
    var0.empilha(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test44() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    int var3 = var1.tamanho();
    var0.empilha((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    ds.Pilha var6 = new ds.Pilha();
    java.lang.Character var7 = new java.lang.Character('4');
    var6.empilha((java.lang.Object)var7);
    ds.Pilha var9 = new ds.Pilha();
    java.lang.Byte var10 = new java.lang.Byte((byte)(-1));
    var9.empilha((java.lang.Object)var10);
    int var12 = var9.tamanho();
    var6.empilha((java.lang.Object)var12);
    boolean var14 = var6.vazia();
    var0.empilha((java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test45() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Byte var1 = new java.lang.Byte((byte)(-1));
    var0.empilha((java.lang.Object)var1);
    int var3 = var0.tamanho();
    ds.Pilha var4 = new ds.Pilha();
    var0.empilha((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test46() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    var0.empilha((java.lang.Object)var2);
    java.lang.Object var4 = var0.desempilha();
    boolean var5 = var0.vazia();
    int var6 = var0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test47() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    ds.Pilha var2 = new ds.Pilha();
    var0.empilha((java.lang.Object)var2);
    int var4 = var0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test48() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    int var2 = var0.tamanho();
    boolean var3 = var0.vazia();
    int var4 = var0.tamanho();
    int var5 = var0.tamanho();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var0.desempilha();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test49() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    int var2 = var0.tamanho();
    boolean var3 = var0.vazia();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var0.desempilha();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test50() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    int var3 = var1.tamanho();
    var0.empilha((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    boolean var6 = var0.vazia();
    boolean var7 = var0.vazia();
    boolean var8 = var0.vazia();
    int var9 = var0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);

  }

  public void test51() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    java.lang.Short var2 = new java.lang.Short((short)1);
    var1.empilha((java.lang.Object)var2);
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var5 = new ds.Pilha();
    var0.empilha((java.lang.Object)var5);

  }

  public void test52() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    var0.empilha((java.lang.Object)var2);
    java.lang.Object var4 = var0.desempilha();
    ds.Pilha var5 = new ds.Pilha();
    int var6 = var5.tamanho();
    var0.empilha((java.lang.Object)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test53() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test54() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    var0.empilha((java.lang.Object)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test55() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    var0.empilha((java.lang.Object)var2);
    java.lang.Object var4 = var0.desempilha();
    boolean var5 = var0.vazia();
    boolean var6 = var0.vazia();
    ds.Pilha var7 = new ds.Pilha();
    boolean var8 = var7.vazia();
    int var9 = var7.tamanho();
    var0.empilha((java.lang.Object)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test56() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    int var3 = var1.tamanho();
    ds.Pilha var4 = new ds.Pilha();
    boolean var5 = var4.vazia();
    int var6 = var4.tamanho();
    boolean var7 = var4.vazia();
    var1.empilha((java.lang.Object)var4);
    var0.empilha((java.lang.Object)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test57() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    int var1 = var0.tamanho();
    boolean var2 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test58() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    int var3 = var1.tamanho();
    var0.empilha((java.lang.Object)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test59() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    ds.Pilha var2 = new ds.Pilha();
    boolean var3 = var2.vazia();
    var0.empilha((java.lang.Object)var2);
    java.lang.Float var5 = new java.lang.Float(0.0f);
    var0.empilha((java.lang.Object)var5);
    boolean var7 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test60() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    var0.empilha((java.lang.Object)var2);
    java.lang.Object var4 = var0.desempilha();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var0.desempilha();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test61() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    int var2 = var0.tamanho();
    java.lang.Short var3 = new java.lang.Short((short)100);
    var0.empilha((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test62() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    java.lang.Short var2 = new java.lang.Short((short)1);
    var1.empilha((java.lang.Object)var2);
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var5 = new ds.Pilha();
    java.lang.Short var6 = new java.lang.Short((short)1);
    var5.empilha((java.lang.Object)var6);
    java.lang.Object var8 = var5.desempilha();
    var0.empilha(var8);
    int var10 = var0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (short)1+ "'", var8.equals((short)1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2);

  }

  public void test63() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    java.lang.Byte var2 = new java.lang.Byte((byte)100);
    var1.empilha((java.lang.Object)var2);
    java.lang.Object var4 = var1.desempilha();
    var0.empilha(var4);
    java.lang.Object var6 = var0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (byte)100+ "'", var4.equals((byte)100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + (byte)100+ "'", var6.equals((byte)100));

  }

  public void test64() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    int var3 = var1.tamanho();
    boolean var4 = var1.vazia();
    int var5 = var1.tamanho();
    int var6 = var1.tamanho();
    int var7 = var1.tamanho();
    var0.empilha((java.lang.Object)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test65() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Character var1 = new java.lang.Character('4');
    var0.empilha((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    boolean var4 = var0.vazia();
    boolean var5 = var0.vazia();
    ds.Pilha var6 = new ds.Pilha();
    boolean var7 = var6.vazia();
    int var8 = var6.tamanho();
    var0.empilha((java.lang.Object)var6);
    java.lang.String var10 = "";
    var0.empilha((java.lang.Object)var10);
    ds.Pilha var12 = new ds.Pilha();
    java.lang.Character var13 = new java.lang.Character('4');
    var12.empilha((java.lang.Object)var13);
    ds.Pilha var15 = new ds.Pilha();
    java.lang.Byte var16 = new java.lang.Byte((byte)(-1));
    var15.empilha((java.lang.Object)var16);
    int var18 = var15.tamanho();
    var12.empilha((java.lang.Object)var18);
    boolean var20 = var12.vazia();
    var0.empilha((java.lang.Object)var20);
    java.lang.Double var22 = new java.lang.Double((-1.0d));
    var0.empilha((java.lang.Object)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test66() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Character var1 = new java.lang.Character('4');
    var0.empilha((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    boolean var4 = var0.vazia();
    boolean var5 = var0.vazia();
    ds.Pilha var6 = new ds.Pilha();
    ds.Pilha var7 = new ds.Pilha();
    boolean var8 = var7.vazia();
    var6.empilha((java.lang.Object)var8);
    java.lang.Object var10 = var6.desempilha();
    var0.empilha(var10);
    java.lang.Object var12 = var0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + true+ "'", var10.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + true+ "'", var12.equals(true));

  }

  public void test67() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    int var3 = var1.tamanho();
    var0.empilha((java.lang.Object)var3);
    ds.Pilha var5 = new ds.Pilha();
    boolean var6 = var5.vazia();
    var0.empilha((java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test68() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Short var1 = new java.lang.Short((short)1);
    var0.empilha((java.lang.Object)var1);
    java.lang.Object var3 = var0.desempilha();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var0.desempilha();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + (short)1+ "'", var3.equals((short)1));

  }

  public void test69() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    int var2 = var0.tamanho();
    int var3 = var0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test70() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    ds.Pilha var2 = new ds.Pilha();
    boolean var3 = var2.vazia();
    int var4 = var2.tamanho();
    boolean var5 = var2.vazia();
    var1.empilha((java.lang.Object)var5);
    var0.empilha((java.lang.Object)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test71() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    ds.Pilha var2 = new ds.Pilha();
    java.lang.Byte var3 = new java.lang.Byte((byte)100);
    var2.empilha((java.lang.Object)var3);
    java.lang.Object var5 = var2.desempilha();
    var0.empilha((java.lang.Object)var2);
    int var7 = var2.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + (byte)100+ "'", var5.equals((byte)100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test72() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    int var3 = var1.tamanho();
    var0.empilha((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    boolean var6 = var0.vazia();
    boolean var7 = var0.vazia();
    boolean var8 = var0.vazia();
    ds.Pilha var9 = new ds.Pilha();
    ds.Pilha var10 = new ds.Pilha();
    boolean var11 = var10.vazia();
    int var12 = var10.tamanho();
    var9.empilha((java.lang.Object)var12);
    boolean var14 = var9.vazia();
    boolean var15 = var9.vazia();
    var0.empilha((java.lang.Object)var15);
    java.lang.Object var17 = var0.desempilha();
    java.lang.Object var18 = var0.desempilha();
    java.lang.Character var19 = new java.lang.Character(' ');
    var0.empilha((java.lang.Object)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + false+ "'", var17.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + 0+ "'", var18.equals(0));

  }

  public void test73() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Character var1 = new java.lang.Character('4');
    var0.empilha((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    boolean var4 = var0.vazia();
    boolean var5 = var0.vazia();
    ds.Pilha var6 = new ds.Pilha();
    boolean var7 = var6.vazia();
    int var8 = var6.tamanho();
    var0.empilha((java.lang.Object)var6);
    java.lang.String var10 = "";
    var0.empilha((java.lang.Object)var10);
    ds.Pilha var12 = new ds.Pilha();
    ds.Pilha var13 = new ds.Pilha();
    java.lang.Short var14 = new java.lang.Short((short)1);
    var13.empilha((java.lang.Object)var14);
    var12.empilha((java.lang.Object)var13);
    ds.Pilha var17 = new ds.Pilha();
    java.lang.Short var18 = new java.lang.Short((short)1);
    var17.empilha((java.lang.Object)var18);
    java.lang.Object var20 = var17.desempilha();
    var12.empilha(var20);
    boolean var22 = var12.vazia();
    var0.empilha((java.lang.Object)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + (short)1+ "'", var20.equals((short)1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test74() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    int var2 = var0.tamanho();
    ds.Pilha var3 = new ds.Pilha();
    var0.empilha((java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test75() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    int var1 = var0.tamanho();
    ds.Pilha var2 = new ds.Pilha();
    java.lang.Character var3 = new java.lang.Character('4');
    var2.empilha((java.lang.Object)var3);
    boolean var5 = var2.vazia();
    boolean var6 = var2.vazia();
    boolean var7 = var2.vazia();
    ds.Pilha var8 = new ds.Pilha();
    ds.Pilha var9 = new ds.Pilha();
    boolean var10 = var9.vazia();
    var8.empilha((java.lang.Object)var10);
    java.lang.Object var12 = var8.desempilha();
    var2.empilha(var12);
    var0.empilha((java.lang.Object)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + true+ "'", var12.equals(true));

  }

}
