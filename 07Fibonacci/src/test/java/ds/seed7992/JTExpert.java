package ds.seed7992;
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
Evaluations : 2
search time (ms): 73
total runtime (ms): 1198
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Fibonacci[]
2)----->fibIter[752]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase0() throws Throwable {
    Fibonacci clsUTFibonacci=null;
      clsUTFibonacci=new Fibonacci();
    int clsUTFibonacciP2P1=752;
    int clsUTFibonacciP2R=0;
      clsUTFibonacciP2R=Fibonacci.fibIter(clsUTFibonacciP2P1);
    assertEquals(-1796675035,clsUTFibonacciP2R);
  }
  /** 
 * Chromosome :
1)----->ds.Fibonacci[]
2)----->fibIter[-306]
 Covered Branches:[1]
 */
  @Test public void TestCase1() throws Throwable {
    Fibonacci clsUTFibonacci=null;
      clsUTFibonacci=new Fibonacci();
    int clsUTFibonacciP2P1=-306;
    int clsUTFibonacciP2R=0;
      clsUTFibonacciP2R=Fibonacci.fibIter(clsUTFibonacciP2P1);
    assertEquals(0,clsUTFibonacciP2R);
  }
}
