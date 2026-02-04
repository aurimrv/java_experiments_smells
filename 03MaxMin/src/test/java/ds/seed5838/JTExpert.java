package ds.seed5838;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import java.util.Arrays;
import ds.MaxMin2;
/** 
 * This class was automatically generated to test the ds.MaxMin2 class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6]
Uncovered branches: []
Total number of branches: 6
Total number of covered branches: 6
Coverage : 100%
Evaluations : 333
search time (ms): 342
total runtime (ms): 1497
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.MaxMin2[]
2)----->maxMin2[[220,3,1], -535]
 Covered Branches:[1]
 */
  @Test public void TestCase0() throws Throwable {
    MaxMin2 clsUTMaxMin2=null;
      clsUTMaxMin2=new MaxMin2();
    int[] clsUTMaxMin2P2P1=new int[]{220,3,1};
    int clsUTMaxMin2P2P2=-535;
    int[] clsUTMaxMin2P2R=null;
      clsUTMaxMin2P2R=MaxMin2.maxMin2(clsUTMaxMin2P2P1,clsUTMaxMin2P2P2);
    assertTrue(Arrays.equals(new int[]{220,3,1},clsUTMaxMin2P2P1));
    assertTrue(Arrays.equals(new int[]{220,220},clsUTMaxMin2P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin2[]
2)----->maxMin2[[276,437], 2]
 Covered Branches:[1, 2, 3]
 */
  @Test public void TestCase1() throws Throwable {
    MaxMin2 clsUTMaxMin2=null;
      clsUTMaxMin2=new MaxMin2();
    int[] clsUTMaxMin2P2P1=new int[]{276,437};
    int clsUTMaxMin2P2P2=2;
    int[] clsUTMaxMin2P2R=null;
      clsUTMaxMin2P2R=MaxMin2.maxMin2(clsUTMaxMin2P2P1,clsUTMaxMin2P2P2);
    assertTrue(Arrays.equals(new int[]{276,437},clsUTMaxMin2P2P1));
    assertTrue(Arrays.equals(new int[]{437,276},clsUTMaxMin2P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin2[]
2)----->maxMin2[[-1,-611,186], 2]
 Covered Branches:[1, 2, 4, 5]
 */
  @Test public void TestCase2() throws Throwable {
    MaxMin2 clsUTMaxMin2=null;
      clsUTMaxMin2=new MaxMin2();
    int[] clsUTMaxMin2P2P1=new int[]{-1,-611,186};
    int clsUTMaxMin2P2P2=2;
    int[] clsUTMaxMin2P2R=null;
      clsUTMaxMin2P2R=MaxMin2.maxMin2(clsUTMaxMin2P2P1,clsUTMaxMin2P2P2);
    assertTrue(Arrays.equals(new int[]{-1,-611,186},clsUTMaxMin2P2P1));
    assertTrue(Arrays.equals(new int[]{-1,-611},clsUTMaxMin2P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin2[]
2)----->maxMin2[[1,1,629,0], 2]
 Covered Branches:[1, 2, 4, 6]
 */
  @Test public void TestCase3() throws Throwable {
    MaxMin2 clsUTMaxMin2=null;
      clsUTMaxMin2=new MaxMin2();
    int[] clsUTMaxMin2P2P1=new int[]{1,1,629,0};
    int clsUTMaxMin2P2P2=2;
    int[] clsUTMaxMin2P2R=null;
      clsUTMaxMin2P2R=MaxMin2.maxMin2(clsUTMaxMin2P2P1,clsUTMaxMin2P2P2);
    assertTrue(Arrays.equals(new int[]{1,1,629,0},clsUTMaxMin2P2P1));
    assertTrue(Arrays.equals(new int[]{1,1},clsUTMaxMin2P2R));
  }
}
