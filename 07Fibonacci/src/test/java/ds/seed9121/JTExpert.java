package ds.seed9121;
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
Evaluations : 3
search time (ms): 73
total runtime (ms): 1204
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Fibonacci[]
2)----->fibIter[25]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase0() throws Throwable {
    Fibonacci clsUTFibonacci=null;
      clsUTFibonacci=new Fibonacci();
    int clsUTFibonacciP2P1=25;
    int clsUTFibonacciP2R=0;
      clsUTFibonacciP2R=Fibonacci.fibIter(clsUTFibonacciP2P1);
    assertEquals(75025,clsUTFibonacciP2R);
  }
  /** 
 * Chromosome :
1)----->ds.Fibonacci[]
2)----->fibIter[-950]
 Covered Branches:[1]
 */
  @Test public void TestCase1() throws Throwable {
    Fibonacci clsUTFibonacci=null;
      clsUTFibonacci=new Fibonacci();
    int clsUTFibonacciP2P1=-950;
    int clsUTFibonacciP2R=0;
      clsUTFibonacciP2R=Fibonacci.fibIter(clsUTFibonacciP2P1);
    assertEquals(0,clsUTFibonacciP2R);
  }
}
