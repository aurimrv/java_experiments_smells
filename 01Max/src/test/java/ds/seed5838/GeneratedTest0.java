package ds.seed5838;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed5838 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    ds.Max var0 = new ds.Max();

  }

  public void test2() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    java.lang.Integer var1 = new java.lang.Integer(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var2 = ds.Max.max(var0, (int)var1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    java.lang.Integer var1 = new java.lang.Integer(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var2 = ds.Max.max(var0, (int)var1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    java.lang.Integer var1 = new java.lang.Integer((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var2 = ds.Max.max(var0, (int)var1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    java.lang.Integer var1 = new java.lang.Integer(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var2 = ds.Max.max(var0, (int)var1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    ds.Item[] var0 = new ds.Item[] { };
    java.lang.Integer var1 = new java.lang.Integer(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      ds.Item var2 = ds.Max.max(var0, (int)var1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

}
