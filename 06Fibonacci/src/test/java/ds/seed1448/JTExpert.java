package ds.seed1448;
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
Evaluations : 1
search time (ms): 107
total runtime (ms): 1238
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Fibonacci[]
2)----->fibIter[594]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase0() throws Throwable {
    Fibonacci clsUTFibonacci=null;
      clsUTFibonacci=new Fibonacci();
    int clsUTFibonacciP2P1=594;
    int clsUTFibonacciP2R=0;
      clsUTFibonacciP2R=Fibonacci.fibIter(clsUTFibonacciP2P1);
    assertEquals(-675996392,clsUTFibonacciP2R);
  }
}
