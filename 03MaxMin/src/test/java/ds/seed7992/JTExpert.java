package ds.seed7992;
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
Evaluations : 1370
search time (ms): 811
total runtime (ms): 1921
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.MaxMin2[]
2)----->maxMin2[[2,2,-19], 2]
 Covered Branches:[1, 2, 4, 6]
 */
  @Test public void TestCase0() throws Throwable {
    MaxMin2 clsUTMaxMin2=null;
      clsUTMaxMin2=new MaxMin2();
    int[] clsUTMaxMin2P2P1=new int[]{2,2,-19};
    int clsUTMaxMin2P2P2=2;
    int[] clsUTMaxMin2P2R=null;
      clsUTMaxMin2P2R=MaxMin2.maxMin2(clsUTMaxMin2P2P1,clsUTMaxMin2P2P2);
    assertTrue(Arrays.equals(new int[]{2,2,-19},clsUTMaxMin2P2P1));
    assertTrue(Arrays.equals(new int[]{2,2},clsUTMaxMin2P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin2[]
2)----->maxMin2[[2,803,-315,493], 3]
 Covered Branches:[1, 2, 3, 4, 5]
 */
  @Test public void TestCase1() throws Throwable {
    MaxMin2 clsUTMaxMin2=null;
      clsUTMaxMin2=new MaxMin2();
    int[] clsUTMaxMin2P2P1=new int[]{2,803,-315,493};
    int clsUTMaxMin2P2P2=3;
    int[] clsUTMaxMin2P2R=null;
      clsUTMaxMin2P2R=MaxMin2.maxMin2(clsUTMaxMin2P2P1,clsUTMaxMin2P2P2);
    assertTrue(Arrays.equals(new int[]{2,803,-315,493},clsUTMaxMin2P2P1));
    assertTrue(Arrays.equals(new int[]{803,-315},clsUTMaxMin2P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin2[]
2)----->maxMin2[[-392,666,-533], -603]
 Covered Branches:[1]
 */
  @Test public void TestCase2() throws Throwable {
    MaxMin2 clsUTMaxMin2=null;
      clsUTMaxMin2=new MaxMin2();
    int[] clsUTMaxMin2P2P1=new int[]{-392,666,-533};
    int clsUTMaxMin2P2P2=-603;
    int[] clsUTMaxMin2P2R=null;
      clsUTMaxMin2P2R=MaxMin2.maxMin2(clsUTMaxMin2P2P1,clsUTMaxMin2P2P2);
    assertTrue(Arrays.equals(new int[]{-392,666,-533},clsUTMaxMin2P2P1));
    assertTrue(Arrays.equals(new int[]{-392,-392},clsUTMaxMin2P2R));
  }
}
