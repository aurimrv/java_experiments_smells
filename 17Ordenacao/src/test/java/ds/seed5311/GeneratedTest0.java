package ds.seed5311;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed5311 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    ds.Ordenacao var0 = new ds.Ordenacao();

  }

  public void test2() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    java.lang.Integer var1 = new java.lang.Integer(1);
    ds.Ordenacao.insercao(var0, (int)var1);

  }

  public void test3() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.Item[] var1 = new ds.Item[] { };
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.Ordenacao.heapsort(var1, (int)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.quicksort(var0, (int)var2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    java.lang.Integer var1 = new java.lang.Integer(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.quicksort(var0, (int)var1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    java.lang.Integer var1 = new java.lang.Integer(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.heapsort(var0, (int)var1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    java.lang.Integer var1 = new java.lang.Integer(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.shellsort(var0, (int)var1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    java.lang.Integer var1 = new java.lang.Integer((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.quicksort(var0, (int)var1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.Item[] var1 = new ds.Item[] { };
    java.lang.Integer var2 = new java.lang.Integer(1);
    ds.Ordenacao.shellsort(var1, (int)var2);
    ds.Ordenacao.selecao(var0, (int)var2);

  }

  public void test9() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.Item[] var1 = new ds.Item[] { };
    ds.Item[] var2 = new ds.Item[] { };
    java.lang.Integer var3 = new java.lang.Integer(1);
    ds.Ordenacao.heapsort(var2, (int)var3);
    ds.Ordenacao.selecao(var1, (int)var3);
    ds.Ordenacao.insercao(var0, (int)var3);

  }

  public void test10() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.Item[] var1 = new ds.Item[] { };
    ds.Item[] var2 = new ds.Item[] { };
    java.lang.Integer var3 = new java.lang.Integer((-1));
    ds.Ordenacao.shellsort(var2, (int)var3);
    ds.Ordenacao.shellsort(var1, (int)var3);
    ds.Ordenacao.shellsort(var0, (int)var3);

  }

  public void test11() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.Item[] var1 = new ds.Item[] { };
    ds.Item[] var2 = new ds.Item[] { };
    java.lang.Integer var3 = new java.lang.Integer((-1));
    ds.Ordenacao.shellsort(var2, (int)var3);
    ds.Ordenacao.shellsort(var1, (int)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.quicksort(var0, (int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.Item[] var1 = new ds.Item[] { };
    ds.Item[] var2 = new ds.Item[] { };
    java.lang.Integer var3 = new java.lang.Integer(1);
    ds.Ordenacao.heapsort(var2, (int)var3);
    ds.Ordenacao.heapsort(var1, (int)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.quicksort(var0, (int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.Item[] var1 = new ds.Item[] { };
    ds.Item[] var2 = new ds.Item[] { };
    java.lang.Integer var3 = new java.lang.Integer((-1));
    ds.Ordenacao.shellsort(var2, (int)var3);
    ds.Ordenacao.selecao(var1, (int)var3);
    ds.Ordenacao.selecao(var0, (int)var3);

  }

  public void test14() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.Item[] var1 = new ds.Item[] { };
    ds.Item[] var2 = new ds.Item[] { };
    java.lang.Integer var3 = new java.lang.Integer(1);
    ds.Ordenacao.heapsort(var2, (int)var3);
    ds.Ordenacao.shellsort(var1, (int)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.quicksort(var0, (int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.Item[] var1 = new ds.Item[] { };
    ds.Item[] var2 = new ds.Item[] { };
    ds.Item[] var3 = new ds.Item[] { };
    ds.Item[] var4 = new ds.Item[] { };
    ds.Item[] var5 = new ds.Item[] { };
    ds.Item[] var6 = new ds.Item[] { };
    java.lang.Integer var7 = new java.lang.Integer(1);
    ds.Ordenacao.heapsort(var6, (int)var7);
    ds.Ordenacao.heapsort(var5, (int)var7);
    ds.Ordenacao.selecao(var4, (int)var7);
    ds.Ordenacao.shellsort(var3, (int)var7);
    ds.Ordenacao.shellsort(var2, (int)var7);
    ds.Ordenacao.shellsort(var1, (int)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.quicksort(var0, (int)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test16() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.Item[] var1 = new ds.Item[] { };
    java.lang.Integer var2 = new java.lang.Integer((-1));
    ds.Ordenacao.shellsort(var1, (int)var2);
    ds.Ordenacao.heapsort(var0, (int)var2);

  }

  public void test17() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.Item[] var1 = new ds.Item[] { };
    ds.Item[] var2 = new ds.Item[] { };
    ds.Item[] var3 = new ds.Item[] { };
    java.lang.Integer var4 = new java.lang.Integer(1);
    ds.Ordenacao.heapsort(var3, (int)var4);
    ds.Ordenacao.heapsort(var2, (int)var4);
    ds.Ordenacao.insercao(var1, (int)var4);
    ds.Ordenacao.insercao(var0, (int)var4);

  }

  public void test18() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.Item[] var1 = new ds.Item[] { };
    ds.Item[] var2 = new ds.Item[] { };
    ds.Item[] var3 = new ds.Item[] { };
    java.lang.Integer var4 = new java.lang.Integer(1);
    ds.Ordenacao.heapsort(var3, (int)var4);
    ds.Ordenacao.shellsort(var2, (int)var4);
    ds.Ordenacao.heapsort(var1, (int)var4);
    ds.Ordenacao.heapsort(var0, (int)var4);

  }

  public void test19() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.Item[] var1 = new ds.Item[] { };
    java.lang.Integer var2 = new java.lang.Integer((-1));
    ds.Ordenacao.shellsort(var1, (int)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.quicksort(var0, (int)var2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.Item[] var1 = new ds.Item[] { };
    ds.Item[] var2 = new ds.Item[] { };
    ds.Item[] var3 = new ds.Item[] { };
    ds.Item[] var4 = new ds.Item[] { };
    java.lang.Integer var5 = new java.lang.Integer(1);
    ds.Ordenacao.heapsort(var4, (int)var5);
    ds.Ordenacao.shellsort(var3, (int)var5);
    ds.Ordenacao.selecao(var2, (int)var5);
    ds.Ordenacao.selecao(var1, (int)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.quicksort(var0, (int)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.Item[] var1 = new ds.Item[] { };
    ds.Item[] var2 = new ds.Item[] { };
    ds.Item[] var3 = new ds.Item[] { };
    ds.Item[] var4 = new ds.Item[] { };
    java.lang.Integer var5 = new java.lang.Integer(1);
    ds.Ordenacao.heapsort(var4, (int)var5);
    ds.Ordenacao.shellsort(var3, (int)var5);
    ds.Ordenacao.selecao(var2, (int)var5);
    ds.Ordenacao.selecao(var1, (int)var5);
    ds.Ordenacao.heapsort(var0, (int)var5);

  }

  public void test22() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.Item[] var1 = new ds.Item[] { };
    ds.Item[] var2 = new ds.Item[] { };
    java.lang.Integer var3 = new java.lang.Integer(1);
    ds.Ordenacao.heapsort(var2, (int)var3);
    ds.Ordenacao.shellsort(var1, (int)var3);
    ds.Ordenacao.shellsort(var0, (int)var3);

  }

  public void test23() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.Item[] var1 = new ds.Item[] { };
    ds.Item[] var2 = new ds.Item[] { };
    java.lang.Integer var3 = new java.lang.Integer(1);
    ds.Ordenacao.shellsort(var2, (int)var3);
    ds.Ordenacao.shellsort(var1, (int)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.quicksort(var0, (int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test24() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.Item[] var1 = new ds.Item[] { };
    ds.Item[] var2 = new ds.Item[] { };
    ds.Item[] var3 = new ds.Item[] { };
    java.lang.Integer var4 = new java.lang.Integer(1);
    ds.Ordenacao.heapsort(var3, (int)var4);
    ds.Ordenacao.shellsort(var2, (int)var4);
    ds.Ordenacao.selecao(var1, (int)var4);
    ds.Ordenacao.heapsort(var0, (int)var4);

  }

  public void test25() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.Item[] var1 = new ds.Item[] { };
    ds.Item[] var2 = new ds.Item[] { };
    ds.Item[] var3 = new ds.Item[] { };
    java.lang.Integer var4 = new java.lang.Integer(1);
    ds.Ordenacao.heapsort(var3, (int)var4);
    ds.Ordenacao.shellsort(var2, (int)var4);
    ds.Ordenacao.selecao(var1, (int)var4);
    ds.Ordenacao.insercao(var0, (int)var4);

  }

  public void test26() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.Item[] var1 = new ds.Item[] { };
    ds.Item[] var2 = new ds.Item[] { };
    ds.Item[] var3 = new ds.Item[] { };
    ds.Item[] var4 = new ds.Item[] { };
    ds.Item[] var5 = new ds.Item[] { };
    ds.Item[] var6 = new ds.Item[] { };
    java.lang.Integer var7 = new java.lang.Integer(1);
    ds.Ordenacao.heapsort(var6, (int)var7);
    ds.Ordenacao.heapsort(var5, (int)var7);
    ds.Ordenacao.selecao(var4, (int)var7);
    ds.Ordenacao.shellsort(var3, (int)var7);
    ds.Ordenacao.shellsort(var2, (int)var7);
    ds.Ordenacao.shellsort(var1, (int)var7);
    ds.Ordenacao.insercao(var0, (int)var7);

  }

  public void test27() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.Item[] var1 = new ds.Item[] { };
    ds.Item[] var2 = new ds.Item[] { };
    java.lang.Integer var3 = new java.lang.Integer(0);
    ds.Ordenacao.insercao(var2, (int)var3);
    ds.Ordenacao.insercao(var1, (int)var3);
    ds.Ordenacao.selecao(var0, (int)var3);

  }

  public void test28() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.Item[] var1 = new ds.Item[] { };
    ds.Item[] var2 = new ds.Item[] { };
    ds.Item[] var3 = new ds.Item[] { };
    ds.Item[] var4 = new ds.Item[] { };
    ds.Item[] var5 = new ds.Item[] { };
    java.lang.Integer var6 = new java.lang.Integer(1);
    ds.Ordenacao.heapsort(var5, (int)var6);
    ds.Ordenacao.heapsort(var4, (int)var6);
    ds.Ordenacao.insercao(var3, (int)var6);
    ds.Ordenacao.shellsort(var2, (int)var6);
    ds.Ordenacao.shellsort(var1, (int)var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.quicksort(var0, (int)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test29() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.Item[] var1 = new ds.Item[] { };
    ds.Item[] var2 = new ds.Item[] { };
    java.lang.Integer var3 = new java.lang.Integer(1);
    ds.Ordenacao.selecao(var2, (int)var3);
    ds.Ordenacao.insercao(var1, (int)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.quicksort(var0, (int)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test30() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.Item[] var1 = new ds.Item[] { };
    ds.Item[] var2 = new ds.Item[] { };
    ds.Item[] var3 = new ds.Item[] { };
    ds.Item[] var4 = new ds.Item[] { };
    java.lang.Integer var5 = new java.lang.Integer(1);
    ds.Ordenacao.heapsort(var4, (int)var5);
    ds.Ordenacao.heapsort(var3, (int)var5);
    ds.Ordenacao.heapsort(var2, (int)var5);
    ds.Ordenacao.shellsort(var1, (int)var5);
    ds.Ordenacao.heapsort(var0, (int)var5);

  }

  public void test31() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    java.lang.Integer var1 = new java.lang.Integer(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.quicksort(var0, (int)var1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test32() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.Item[] var1 = new ds.Item[] { };
    ds.Item[] var2 = new ds.Item[] { };
    ds.Item[] var3 = new ds.Item[] { };
    ds.Item[] var4 = new ds.Item[] { };
    ds.Item[] var5 = new ds.Item[] { };
    java.lang.Integer var6 = new java.lang.Integer(1);
    ds.Ordenacao.heapsort(var5, (int)var6);
    ds.Ordenacao.heapsort(var4, (int)var6);
    ds.Ordenacao.insercao(var3, (int)var6);
    ds.Ordenacao.shellsort(var2, (int)var6);
    ds.Ordenacao.shellsort(var1, (int)var6);
    ds.Ordenacao.selecao(var0, (int)var6);

  }

  public void test33() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.Item[] var1 = new ds.Item[] { };
    ds.Item[] var2 = new ds.Item[] { };
    ds.Item[] var3 = new ds.Item[] { };
    java.lang.Integer var4 = new java.lang.Integer(1);
    ds.Ordenacao.heapsort(var3, (int)var4);
    ds.Ordenacao.heapsort(var2, (int)var4);
    ds.Ordenacao.shellsort(var1, (int)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Ordenacao.quicksort(var0, (int)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test34() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.Item[] var1 = new ds.Item[] { };
    ds.Item[] var2 = new ds.Item[] { };
    java.lang.Integer var3 = new java.lang.Integer((-1));
    ds.Ordenacao.selecao(var2, (int)var3);
    ds.Ordenacao.heapsort(var1, (int)var3);
    ds.Ordenacao.shellsort(var0, (int)var3);

  }

  public void test35() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.Item[] var1 = new ds.Item[] { };
    ds.Item[] var2 = new ds.Item[] { };
    ds.Item[] var3 = new ds.Item[] { };
    ds.Item[] var4 = new ds.Item[] { };
    java.lang.Integer var5 = new java.lang.Integer(1);
    ds.Ordenacao.heapsort(var4, (int)var5);
    ds.Ordenacao.heapsort(var3, (int)var5);
    ds.Ordenacao.selecao(var2, (int)var5);
    ds.Ordenacao.shellsort(var1, (int)var5);
    ds.Ordenacao.selecao(var0, (int)var5);

  }

  public void test36() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.Item[] var1 = new ds.Item[] { };
    ds.Item[] var2 = new ds.Item[] { };
    java.lang.Integer var3 = new java.lang.Integer(1);
    ds.Ordenacao.heapsort(var2, (int)var3);
    ds.Ordenacao.selecao(var1, (int)var3);
    ds.Ordenacao.selecao(var0, (int)var3);

  }

  public void test37() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.Item[] var1 = new ds.Item[] { };
    ds.Item[] var2 = new ds.Item[] { };
    ds.Item[] var3 = new ds.Item[] { };
    ds.Item[] var4 = new ds.Item[] { };
    ds.Item[] var5 = new ds.Item[] { };
    java.lang.Integer var6 = new java.lang.Integer(1);
    ds.Ordenacao.heapsort(var5, (int)var6);
    ds.Ordenacao.heapsort(var4, (int)var6);
    ds.Ordenacao.insercao(var3, (int)var6);
    ds.Ordenacao.shellsort(var2, (int)var6);
    ds.Ordenacao.selecao(var1, (int)var6);
    ds.Ordenacao.insercao(var0, (int)var6);

  }

  public void test38() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.Item[] var1 = new ds.Item[] { };
    ds.Item[] var2 = new ds.Item[] { };
    ds.Item[] var3 = new ds.Item[] { };
    java.lang.Integer var4 = new java.lang.Integer(1);
    ds.Ordenacao.heapsort(var3, (int)var4);
    ds.Ordenacao.heapsort(var2, (int)var4);
    ds.Ordenacao.shellsort(var1, (int)var4);
    ds.Ordenacao.insercao(var0, (int)var4);

  }

  public void test39() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    ds.Item[] var1 = new ds.Item[] { };
    ds.Item[] var2 = new ds.Item[] { };
    ds.Item[] var3 = new ds.Item[] { };
    ds.Item[] var4 = new ds.Item[] { };
    java.lang.Integer var5 = new java.lang.Integer(1);
    ds.Ordenacao.heapsort(var4, (int)var5);
    ds.Ordenacao.heapsort(var3, (int)var5);
    ds.Ordenacao.insercao(var2, (int)var5);
    ds.Ordenacao.heapsort(var1, (int)var5);
    ds.Ordenacao.selecao(var0, (int)var5);

  }

}
