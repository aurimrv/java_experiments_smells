package ds.seed9121;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import java.util.Arrays;
import ds.MaxMin4;
/** 
 * This class was automatically generated to test the ds.MaxMin4 class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6, 7, 8, 9]
Uncovered branches: []
Total number of branches: 9
Total number of covered branches: 9
Coverage : 100%
Evaluations : 763
search time (ms): 632
total runtime (ms): 1780
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.MaxMin4[]
2)----->maxMin4[[724,142], 0, 1]
 Covered Branches:[1, 2, 5]
 */
  @Test public void TestCase0() throws Throwable {
    MaxMin4 clsUTMaxMin4=null;
      clsUTMaxMin4=new MaxMin4();
    int[] clsUTMaxMin4P2P1=new int[]{724,142};
    int clsUTMaxMin4P2P2=0;
    int clsUTMaxMin4P2P3=1;
    int[] clsUTMaxMin4P2R=null;
      clsUTMaxMin4P2R=MaxMin4.maxMin4(clsUTMaxMin4P2P1,clsUTMaxMin4P2P2,clsUTMaxMin4P2P3);
    assertTrue(Arrays.equals(new int[]{724,142},clsUTMaxMin4P2P1));
    assertTrue(Arrays.equals(new int[]{724,142},clsUTMaxMin4P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin4[]
2)----->maxMin4[[302,-555,-50], 2, 0]
 Covered Branches:[1, 2, 4]
 */
  @Test public void TestCase1() throws Throwable {
    MaxMin4 clsUTMaxMin4=null;
      clsUTMaxMin4=new MaxMin4();
    int[] clsUTMaxMin4P2P1=new int[]{302,-555,-50};
    int clsUTMaxMin4P2P2=2;
    int clsUTMaxMin4P2P3=0;
    int[] clsUTMaxMin4P2R=null;
      clsUTMaxMin4P2R=MaxMin4.maxMin4(clsUTMaxMin4P2P1,clsUTMaxMin4P2P2,clsUTMaxMin4P2P3);
    assertTrue(Arrays.equals(new int[]{302,-555,-50},clsUTMaxMin4P2P1));
    assertTrue(Arrays.equals(new int[]{302,-50},clsUTMaxMin4P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin4[]
2)----->maxMin4[[-543,-356,899], 0, 2]
 Covered Branches:[1, 2, 3, 4, 5, 7, 8]
 */
  @Test public void TestCase2() throws Throwable {
    MaxMin4 clsUTMaxMin4=null;
      clsUTMaxMin4=new MaxMin4();
    int[] clsUTMaxMin4P2P1=new int[]{-543,-356,899};
    int clsUTMaxMin4P2P2=0;
    int clsUTMaxMin4P2P3=2;
    int[] clsUTMaxMin4P2R=null;
      clsUTMaxMin4P2R=MaxMin4.maxMin4(clsUTMaxMin4P2P1,clsUTMaxMin4P2P2,clsUTMaxMin4P2P3);
    assertTrue(Arrays.equals(new int[]{-543,-356,899},clsUTMaxMin4P2P1));
    assertTrue(Arrays.equals(new int[]{899,-543},clsUTMaxMin4P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin4[]
2)----->maxMin4[[348,2,-526], 0, 2]
 Covered Branches:[1, 2, 3, 5, 6, 9]
 */
  @Test public void TestCase3() throws Throwable {
    MaxMin4 clsUTMaxMin4=null;
      clsUTMaxMin4=new MaxMin4();
    int[] clsUTMaxMin4P2P1=new int[]{348,2,-526};
    int clsUTMaxMin4P2P2=0;
    int clsUTMaxMin4P2P3=2;
    int[] clsUTMaxMin4P2R=null;
      clsUTMaxMin4P2R=MaxMin4.maxMin4(clsUTMaxMin4P2P1,clsUTMaxMin4P2P2,clsUTMaxMin4P2P3);
    assertTrue(Arrays.equals(new int[]{348,2,-526},clsUTMaxMin4P2P1));
    assertTrue(Arrays.equals(new int[]{348,-526},clsUTMaxMin4P2R));
  }
}
