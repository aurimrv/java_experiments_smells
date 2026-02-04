package ds.seed5831;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import java.util.Arrays;
import ds.MaxMin1;
/** 
 * This class was automatically generated to test the ds.MaxMin1 class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6]
Uncovered branches: []
Total number of branches: 6
Total number of covered branches: 6
Coverage : 100%
Evaluations : 52
search time (ms): 202
total runtime (ms): 1582
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.MaxMin1[]
2)----->maxMin1[[-435,-745,-1,999], -937]
 Covered Branches:[1]
 */
  @Test public void TestCase0() throws Throwable {
    MaxMin1 clsUTMaxMin1=null;
      clsUTMaxMin1=new MaxMin1();
    int[] clsUTMaxMin1P2P1=new int[]{-435,-745,-1,999};
    int clsUTMaxMin1P2P2=-937;
    int[] clsUTMaxMin1P2R=null;
      clsUTMaxMin1P2R=MaxMin1.maxMin1(clsUTMaxMin1P2P1,clsUTMaxMin1P2P2);
    assertTrue(Arrays.equals(new int[]{-435,-745,-1,999},clsUTMaxMin1P2P1));
    assertTrue(Arrays.equals(new int[]{-435,-435},clsUTMaxMin1P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin1[]
2)----->maxMin1[[3,429], 2]
 Covered Branches:[1, 2, 3, 6]
 */
  @Test public void TestCase1() throws Throwable {
    MaxMin1 clsUTMaxMin1=null;
      clsUTMaxMin1=new MaxMin1();
    int[] clsUTMaxMin1P2P1=new int[]{3,429};
    int clsUTMaxMin1P2P2=2;
    int[] clsUTMaxMin1P2R=null;
      clsUTMaxMin1P2R=MaxMin1.maxMin1(clsUTMaxMin1P2P1,clsUTMaxMin1P2P2);
    assertTrue(Arrays.equals(new int[]{3,429},clsUTMaxMin1P2P1));
    assertTrue(Arrays.equals(new int[]{429,3},clsUTMaxMin1P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin1[]
2)----->maxMin1[[-348,-647,515], 2]
 Covered Branches:[1, 2, 4, 5]
 */
  @Test public void TestCase2() throws Throwable {
    MaxMin1 clsUTMaxMin1=null;
      clsUTMaxMin1=new MaxMin1();
    int[] clsUTMaxMin1P2P1=new int[]{-348,-647,515};
    int clsUTMaxMin1P2P2=2;
    int[] clsUTMaxMin1P2R=null;
      clsUTMaxMin1P2R=MaxMin1.maxMin1(clsUTMaxMin1P2P1,clsUTMaxMin1P2P2);
    assertTrue(Arrays.equals(new int[]{-348,-647,515},clsUTMaxMin1P2P1));
    assertTrue(Arrays.equals(new int[]{-348,-647},clsUTMaxMin1P2R));
  }
}
