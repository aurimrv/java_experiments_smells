package ds.seed6733;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed6733 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    int var1 = var0.tamanho();
    ds.Pilha var2 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test2() throws Throwable {

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

  public void test3() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    var0.empilha((java.lang.Object)var0);

  }

  public void test4() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Float var1 = new java.lang.Float((-1.0f));
    var0.empilha((java.lang.Object)var1);
    java.lang.Object var3 = var0.desempilha();
    var0.empilha(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + (-1.0f)+ "'", var3.equals((-1.0f)));

  }

  public void test5() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    var0.empilha((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    int var4 = var1.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test6() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Byte var1 = new java.lang.Byte((byte)1);
    var0.empilha((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test7() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    var0.empilha((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    boolean var4 = var0.vazia();
    int var5 = var1.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test8() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    int var1 = var0.tamanho();
    boolean var2 = var0.vazia();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var0.desempilha();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test9() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Float var1 = new java.lang.Float((-1.0f));
    var0.empilha((java.lang.Object)var1);
    java.lang.Object var3 = var0.desempilha();
    boolean var4 = var0.vazia();
    ds.Pilha var5 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + (-1.0f)+ "'", var3.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test10() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Byte var1 = new java.lang.Byte((byte)1);
    var0.empilha((java.lang.Object)var1);
    java.lang.Object var3 = var0.desempilha();
    int var4 = var0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + (byte)1+ "'", var3.equals((byte)1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test11() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    ds.Pilha var2 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test12() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Byte var1 = new java.lang.Byte((byte)1);
    var0.empilha((java.lang.Object)var1);
    java.lang.Object var3 = var0.desempilha();
    boolean var4 = var0.vazia();
    int var5 = var0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + (byte)1+ "'", var3.equals((byte)1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test13() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    int var2 = var0.tamanho();
    ds.Pilha var3 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test14() throws Throwable {

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

  public void test15() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Byte var1 = new java.lang.Byte((byte)(-1));
    var0.empilha((java.lang.Object)var1);
    java.lang.Object var3 = var0.desempilha();
    ds.Pilha var4 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + (byte)(-1)+ "'", var3.equals((byte)(-1)));

  }

  public void test16() throws Throwable {

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

  public void test17() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Byte var1 = new java.lang.Byte((byte)(-1));
    var0.empilha((java.lang.Object)var1);
    java.lang.Object var3 = var0.desempilha();
    boolean var4 = var0.vazia();
    ds.Pilha var5 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + (byte)(-1)+ "'", var3.equals((byte)(-1)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test18() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Byte var1 = new java.lang.Byte((byte)(-1));
    var0.empilha((java.lang.Object)var1);
    java.lang.Object var3 = var0.desempilha();
    boolean var4 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + (byte)(-1)+ "'", var3.equals((byte)(-1)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test19() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    int var2 = var0.tamanho();
    var0.empilha((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test20() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Character var1 = new java.lang.Character('4');
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var3 = new ds.Pilha();

  }

  public void test21() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    int var1 = var0.tamanho();
    boolean var2 = var0.vazia();
    ds.Pilha var3 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test22() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Character var1 = new java.lang.Character('4');
    var0.empilha((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    java.lang.Object var4 = var0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + '4'+ "'", var4.equals('4'));

  }

  public void test23() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Character var1 = new java.lang.Character('4');
    var0.empilha((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    boolean var4 = var0.vazia();
    java.lang.Object var5 = var0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + '4'+ "'", var5.equals('4'));

  }

  public void test24() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Character var1 = new java.lang.Character('4');
    var0.empilha((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    boolean var4 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test25() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    var0.empilha((java.lang.Object)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var1.desempilha();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    var0.empilha((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test27() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    var0.empilha((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    ds.Pilha var4 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test28() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    var0.empilha((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    boolean var4 = var0.vazia();
    var1.empilha((java.lang.Object)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test29() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    var0.empilha((java.lang.Object)var1);
    boolean var3 = var1.vazia();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var1.desempilha();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test30() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    var0.empilha((java.lang.Object)var1);
    boolean var3 = var1.vazia();
    boolean var4 = var1.vazia();
    ds.Pilha var5 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test31() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    var0.empilha((java.lang.Object)var1);
    boolean var3 = var1.vazia();
    boolean var4 = var1.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test32() throws Throwable {

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

  public void test33() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    int var1 = var0.tamanho();
    var0.empilha((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test34() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Boolean var1 = new java.lang.Boolean(true);
    var0.empilha((java.lang.Object)var1);
    int var3 = var0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test35() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Boolean var1 = new java.lang.Boolean(true);
    var0.empilha((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    int var4 = var0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test36() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Boolean var1 = new java.lang.Boolean(true);
    var0.empilha((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    boolean var4 = var0.vazia();
    ds.Pilha var5 = new ds.Pilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test37() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Boolean var1 = new java.lang.Boolean(true);
    var0.empilha((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    boolean var4 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test38() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    int var1 = var0.tamanho();
    boolean var2 = var0.vazia();
    var0.empilha((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test39() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    var0.empilha((java.lang.Object)var1);
    java.lang.Object var3 = var0.desempilha();
    var1.empilha(var3);

  }

  public void test40() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    var0.empilha((java.lang.Object)var1);
    java.lang.Object var3 = var0.desempilha();
    boolean var4 = var0.vazia();
    var1.empilha(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test41() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    ds.Pilha var2 = new ds.Pilha();
    var1.empilha((java.lang.Object)var2);
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var5 = new ds.Pilha();

  }

  public void test42() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Float var1 = new java.lang.Float((-1.0f));
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
    assertTrue("'" + var3 + "' != '" + (-1.0f)+ "'", var3.equals((-1.0f)));

  }

  public void test43() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    var0.empilha((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    boolean var4 = var0.vazia();
    boolean var5 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test44() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Float var1 = new java.lang.Float((-1.0f));
    var0.empilha((java.lang.Object)var1);
    java.lang.Object var3 = var0.desempilha();
    boolean var4 = var0.vazia();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var0.desempilha();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + (-1.0f)+ "'", var3.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test45() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    var0.empilha((java.lang.Object)var1);
    java.lang.Object var3 = var0.desempilha();
    boolean var4 = var0.vazia();
    int var5 = var0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test46() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Byte var1 = new java.lang.Byte((byte)(-1));
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var3 = new ds.Pilha();
    java.lang.Byte var4 = new java.lang.Byte((byte)(-1));
    var3.empilha((java.lang.Object)var4);
    var0.empilha((java.lang.Object)var3);
    ds.Pilha var7 = new ds.Pilha();
    int var8 = var7.tamanho();
    var0.empilha((java.lang.Object)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test47() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    int var3 = var1.tamanho();
    boolean var4 = var1.vazia();
    var0.empilha((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test48() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    int var2 = var0.tamanho();
    java.lang.Double var3 = new java.lang.Double(1.0d);
    var0.empilha((java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test49() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    var0.empilha((java.lang.Object)var1);
    int var3 = var1.tamanho();
    boolean var4 = var1.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test50() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var3 = new ds.Pilha();
    ds.Pilha var4 = new ds.Pilha();
    ds.Pilha var5 = new ds.Pilha();
    var4.empilha((java.lang.Object)var5);
    var3.empilha((java.lang.Object)var4);
    var0.empilha((java.lang.Object)var3);
    int var9 = var0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2);

  }

  public void test51() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    var0.empilha((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    boolean var4 = var0.vazia();
    java.lang.Boolean var5 = new java.lang.Boolean(false);
    var0.empilha((java.lang.Object)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test52() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Float var1 = new java.lang.Float(10.0f);
    var0.empilha((java.lang.Object)var1);

  }

  public void test53() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Byte var1 = new java.lang.Byte((byte)(-1));
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var3 = new ds.Pilha();
    java.lang.Byte var4 = new java.lang.Byte((byte)(-1));
    var3.empilha((java.lang.Object)var4);
    var0.empilha((java.lang.Object)var3);
    boolean var7 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test54() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    int var1 = var0.tamanho();
    ds.Pilha var2 = new ds.Pilha();
    boolean var3 = var2.vazia();
    int var4 = var2.tamanho();
    var0.empilha((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test55() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    var0.empilha((java.lang.Object)var1);
    int var3 = var0.tamanho();
    ds.Pilha var4 = new ds.Pilha();
    ds.Pilha var5 = new ds.Pilha();
    var4.empilha((java.lang.Object)var5);
    boolean var7 = var4.vazia();
    int var8 = var4.tamanho();
    var0.empilha((java.lang.Object)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);

  }

  public void test56() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var4 = new ds.Pilha();
    java.lang.Byte var5 = new java.lang.Byte((byte)1);
    var4.empilha((java.lang.Object)var5);
    java.lang.Object var7 = var4.desempilha();
    boolean var8 = var4.vazia();
    var1.empilha((java.lang.Object)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (byte)1+ "'", var7.equals((byte)1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test57() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    int var2 = var0.tamanho();
    java.lang.Object var3 = new java.lang.Object();
    var0.empilha(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test58() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    int var2 = var0.tamanho();
    ds.Pilha var3 = new ds.Pilha();
    int var4 = var3.tamanho();
    var0.empilha((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test59() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    int var1 = var0.tamanho();
    java.lang.Double var2 = new java.lang.Double(10.0d);
    var0.empilha((java.lang.Object)var2);
    int var4 = var0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test60() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    int var2 = var0.tamanho();
    boolean var3 = var0.vazia();
    ds.Pilha var4 = new ds.Pilha();
    int var5 = var4.tamanho();
    var0.empilha((java.lang.Object)var4);
    boolean var7 = var4.vazia();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var4.desempilha();
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
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test61() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    int var1 = var0.tamanho();
    boolean var2 = var0.vazia();
    int var3 = var0.tamanho();
    int var4 = var0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test62() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    boolean var2 = var1.vazia();
    var0.empilha((java.lang.Object)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test63() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Byte var1 = new java.lang.Byte((byte)1);
    var0.empilha((java.lang.Object)var1);
    java.lang.Object var3 = var0.desempilha();
    boolean var4 = var0.vazia();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var0.desempilha();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + (byte)1+ "'", var3.equals((byte)1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test64() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Byte var1 = new java.lang.Byte((byte)1);
    var0.empilha((java.lang.Object)var1);
    java.lang.Object var3 = var0.desempilha();
    boolean var4 = var0.vazia();
    boolean var5 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + (byte)1+ "'", var3.equals((byte)1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test65() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    int var2 = var1.tamanho();
    boolean var3 = var1.vazia();
    var0.empilha((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test66() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    int var1 = var0.tamanho();
    boolean var2 = var0.vazia();
    ds.Pilha var3 = new ds.Pilha();
    ds.Pilha var4 = new ds.Pilha();
    int var5 = var4.tamanho();
    int var6 = var4.tamanho();
    var3.empilha((java.lang.Object)var6);
    var0.empilha((java.lang.Object)var3);
    java.lang.Object var9 = new java.lang.Object();
    var0.empilha(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test67() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    int var2 = var1.tamanho();
    int var3 = var1.tamanho();
    var0.empilha((java.lang.Object)var3);
    boolean var5 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test68() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    int var1 = var0.tamanho();
    ds.Pilha var2 = new ds.Pilha();
    ds.Pilha var3 = new ds.Pilha();
    var2.empilha((java.lang.Object)var3);
    java.lang.Object var5 = var2.desempilha();
    var0.empilha((java.lang.Object)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test69() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    int var2 = var0.tamanho();
    boolean var3 = var0.vazia();
    ds.Pilha var4 = new ds.Pilha();
    int var5 = var4.tamanho();
    var0.empilha((java.lang.Object)var4);
    int var7 = var0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);

  }

  public void test70() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Character var1 = new java.lang.Character('4');
    var0.empilha((java.lang.Object)var1);
    int var3 = var0.tamanho();
    boolean var4 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test71() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    var0.empilha((java.lang.Object)var1);
    int var3 = var0.tamanho();
    boolean var4 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test72() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    var0.empilha((java.lang.Object)var1);
    int var3 = var1.tamanho();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var1.desempilha();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test73() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    int var2 = var1.tamanho();
    var0.empilha((java.lang.Object)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var1.desempilha();
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test74() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    var0.empilha((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    ds.Pilha var4 = new ds.Pilha();
    var0.empilha((java.lang.Object)var4);
    boolean var6 = var4.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test75() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    boolean var2 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test76() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    var0.empilha((java.lang.Object)var1);
    int var3 = var1.tamanho();
    ds.Pilha var4 = new ds.Pilha();
    ds.Pilha var5 = new ds.Pilha();
    var4.empilha((java.lang.Object)var5);
    boolean var7 = var4.vazia();
    boolean var8 = var4.vazia();
    var1.empilha((java.lang.Object)var8);
    int var10 = var1.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);

  }

  public void test77() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    int var1 = var0.tamanho();
    ds.Pilha var2 = new ds.Pilha();
    int var3 = var2.tamanho();
    boolean var4 = var2.vazia();
    ds.Pilha var5 = new ds.Pilha();
    ds.Pilha var6 = new ds.Pilha();
    var5.empilha((java.lang.Object)var6);
    java.lang.Object var8 = var5.desempilha();
    var2.empilha(var8);
    var0.empilha((java.lang.Object)var2);
    int var11 = var2.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);

  }

  public void test78() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    boolean var1 = var0.vazia();
    int var2 = var0.tamanho();
    int var3 = var0.tamanho();
    boolean var4 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test79() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    ds.Pilha var2 = new ds.Pilha();
    var1.empilha((java.lang.Object)var2);
    boolean var4 = var1.vazia();
    var0.empilha((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test80() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Object var1 = new java.lang.Object();
    var0.empilha(var1);

  }

  public void test81() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var3 = new ds.Pilha();
    ds.Pilha var4 = new ds.Pilha();
    ds.Pilha var5 = new ds.Pilha();
    var4.empilha((java.lang.Object)var5);
    var3.empilha((java.lang.Object)var4);
    var0.empilha((java.lang.Object)var3);
    java.lang.Object var9 = var3.desempilha();

  }

  public void test82() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    var0.empilha((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    int var4 = var0.tamanho();
    java.lang.Object var5 = var0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test83() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    int var1 = var0.tamanho();
    boolean var2 = var0.vazia();
    int var3 = var0.tamanho();
    boolean var4 = var0.vazia();
    boolean var5 = var0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test84() throws Throwable {

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

  public void test85() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    var0.empilha((java.lang.Object)var1);
    ds.Pilha var3 = new ds.Pilha();
    ds.Pilha var4 = new ds.Pilha();
    ds.Pilha var5 = new ds.Pilha();
    var4.empilha((java.lang.Object)var5);
    var3.empilha((java.lang.Object)var4);
    var0.empilha((java.lang.Object)var3);
    java.lang.Long var9 = new java.lang.Long(10L);
    var3.empilha((java.lang.Object)var9);

  }

  public void test86() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    int var2 = var1.tamanho();
    int var3 = var1.tamanho();
    var0.empilha((java.lang.Object)var3);
    ds.Pilha var5 = new ds.Pilha();
    ds.Pilha var6 = new ds.Pilha();
    var5.empilha((java.lang.Object)var6);
    java.lang.Object var8 = var5.desempilha();
    var0.empilha((java.lang.Object)var5);
    ds.Pilha var10 = new ds.Pilha();
    ds.Pilha var11 = new ds.Pilha();
    boolean var12 = var11.vazia();
    int var13 = var11.tamanho();
    boolean var14 = var11.vazia();
    ds.Pilha var15 = new ds.Pilha();
    int var16 = var15.tamanho();
    var11.empilha((java.lang.Object)var15);
    boolean var18 = var15.vazia();
    ds.Pilha var19 = new ds.Pilha();
    ds.Pilha var20 = new ds.Pilha();
    var19.empilha((java.lang.Object)var20);
    boolean var22 = var19.vazia();
    int var23 = var19.tamanho();
    var15.empilha((java.lang.Object)var19);
    var10.empilha((java.lang.Object)var19);
    int var26 = var19.tamanho();
    boolean var27 = var19.vazia();
    var0.empilha((java.lang.Object)var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test87() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    int var1 = var0.tamanho();
    boolean var2 = var0.vazia();
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
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test88() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    java.lang.Character var2 = new java.lang.Character('4');
    var1.empilha((java.lang.Object)var2);
    var0.empilha((java.lang.Object)var2);

  }

  public void test89() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    java.lang.Byte var1 = new java.lang.Byte((byte)1);
    var0.empilha((java.lang.Object)var1);
    int var3 = var0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test90() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    int var1 = var0.tamanho();
    boolean var2 = var0.vazia();
    boolean var3 = var0.vazia();
    int var4 = var0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test91() throws Throwable {

    ds.Pilha var0 = new ds.Pilha();
    ds.Pilha var1 = new ds.Pilha();
    var0.empilha((java.lang.Object)var1);
    boolean var3 = var0.vazia();
    int var4 = var0.tamanho();
    int var5 = var0.tamanho();
    java.lang.Object var6 = var0.desempilha();
    int var7 = var0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

}
