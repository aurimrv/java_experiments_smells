package ds.seed6733;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Fibonacci;
/** 
 * This class was automatically generated to test the ds.Fibonacci class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2]
Uncovered branches: []
Total number of branches: 2
Total number of covered branches: 2
Coverage : 100%
Evaluations : 11
search time (ms): 111
total runtime (ms): 1603
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Fibonacci[]
2)----->fibIter[-750]
 Covered Branches:[1]
 */
  @Test public void TestCase0() throws Throwable {
    Fibonacci clsUTFibonacci=null;
      clsUTFibonacci=new Fibonacci();
    int clsUTFibonacciP2P1=-750;
    int clsUTFibonacciP2R=0;
      clsUTFibonacciP2R=Fibonacci.fibIter(clsUTFibonacciP2P1);
    assertEquals(0,clsUTFibonacciP2R);
  }
  /** 
 * Chromosome :
1)----->ds.Fibonacci[]
2)----->fibIter[249]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase1() throws Throwable {
    Fibonacci clsUTFibonacci=null;
      clsUTFibonacci=new Fibonacci();
    int clsUTFibonacciP2P1=249;
    int clsUTFibonacciP2R=0;
      clsUTFibonacciP2R=Fibonacci.fibIter(clsUTFibonacciP2P1);
    assertEquals(1149767586,clsUTFibonacciP2R);
  }
}
