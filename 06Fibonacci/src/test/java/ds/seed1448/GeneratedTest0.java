package ds.seed1448;

import junit.framework.*;

public class GeneratedTest0 extends TestCase {

  // Runs all the ds.seed1448 in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(GeneratedTest0.class);
  }

  public void test1() throws Throwable {

    ds.Fibonacci var0 = new ds.Fibonacci();
    java.lang.Integer var1 = new java.lang.Integer(1);
    int var2 = ds.Fibonacci.fibIter((int)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test2() throws Throwable {

    ds.Fibonacci var0 = new ds.Fibonacci();
    java.lang.Integer var1 = new java.lang.Integer(100);
    int var2 = ds.Fibonacci.fibIter((int)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-980107325));

  }

  public void test3() throws Throwable {

    ds.Fibonacci var0 = new ds.Fibonacci();

  }

  public void test4() throws Throwable {

    ds.Fibonacci var0 = new ds.Fibonacci();
    java.lang.Integer var1 = new java.lang.Integer(0);
    int var2 = ds.Fibonacci.fibIter((int)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test5() throws Throwable {

    ds.Fibonacci var0 = new ds.Fibonacci();
    java.lang.Integer var1 = new java.lang.Integer(10);
    int var2 = ds.Fibonacci.fibIter((int)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 55);

  }

  public void test6() throws Throwable {

    ds.Fibonacci var0 = new ds.Fibonacci();
    java.lang.Integer var1 = new java.lang.Integer((-1));
    int var2 = ds.Fibonacci.fibIter((int)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test7() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(100);
    int var1 = ds.Fibonacci.fibIter((int)var0);
    int var2 = ds.Fibonacci.fibIter((int)var1);
    int var3 = ds.Fibonacci.fibIter((int)var1);
    int var4 = ds.Fibonacci.fibIter((int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-980107325));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test8() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(10);
    int var1 = ds.Fibonacci.fibIter((int)var0);
    int var2 = ds.Fibonacci.fibIter((int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 55);

  }

  public void test9() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(100);
    int var1 = ds.Fibonacci.fibIter((int)var0);
    int var2 = ds.Fibonacci.fibIter((int)var1);
    int var3 = ds.Fibonacci.fibIter((int)var1);
    int var4 = ds.Fibonacci.fibIter((int)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-980107325));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test10() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(100);
    int var1 = ds.Fibonacci.fibIter((int)var0);
    int var2 = ds.Fibonacci.fibIter((int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-980107325));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-980107325));

  }

  public void test11() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(0);
    int var1 = ds.Fibonacci.fibIter((int)var0);
    int var2 = ds.Fibonacci.fibIter((int)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test12() throws Throwable {

    java.lang.Integer var0 = new java.lang.Integer(10);
    int var1 = ds.Fibonacci.fibIter((int)var0);
    int var2 = ds.Fibonacci.fibIter((int)var1);
    int var3 = ds.Fibonacci.fibIter((int)var1);
    int var4 = ds.Fibonacci.fibIter((int)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2144908973);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2144908973);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1570223573);

  }

}
