package ds.seed6733;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.MaxMin4;
import java.util.Arrays;
/** 
 * This class was automatically generated to test the ds.MaxMin4 class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6, 7, 8, 9]
Uncovered branches: []
Total number of branches: 9
Total number of covered branches: 9
Coverage : 100%
Evaluations : 693
search time (ms): 830
total runtime (ms): 2066
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.MaxMin4[]
2)----->maxMin4[[-779,345,-661,-591], 1, 2]
 Covered Branches:[1, 2, 5]
 */
  @Test public void TestCase0() throws Throwable {
    MaxMin4 clsUTMaxMin4=null;
      clsUTMaxMin4=new MaxMin4();
    int[] clsUTMaxMin4P2P1=new int[]{-779,345,-661,-591};
    int clsUTMaxMin4P2P2=1;
    int clsUTMaxMin4P2P3=2;
    int[] clsUTMaxMin4P2R=null;
      clsUTMaxMin4P2R=MaxMin4.maxMin4(clsUTMaxMin4P2P1,clsUTMaxMin4P2P2,clsUTMaxMin4P2P3);
    assertTrue(Arrays.equals(new int[]{-779,345,-661,-591},clsUTMaxMin4P2P1));
    assertTrue(Arrays.equals(new int[]{345,-661},clsUTMaxMin4P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin4[]
2)----->maxMin4[[452,1,574], 0, 2]
 Covered Branches:[1, 2, 3, 5, 7, 8]
 */
  @Test public void TestCase1() throws Throwable {
    MaxMin4 clsUTMaxMin4=null;
      clsUTMaxMin4=new MaxMin4();
    int[] clsUTMaxMin4P2P1=new int[]{452,1,574};
    int clsUTMaxMin4P2P2=0;
    int clsUTMaxMin4P2P3=2;
    int[] clsUTMaxMin4P2R=null;
      clsUTMaxMin4P2R=MaxMin4.maxMin4(clsUTMaxMin4P2P1,clsUTMaxMin4P2P2,clsUTMaxMin4P2P3);
    assertTrue(Arrays.equals(new int[]{452,1,574},clsUTMaxMin4P2P1));
    assertTrue(Arrays.equals(new int[]{574,1},clsUTMaxMin4P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin4[]
2)----->maxMin4[[-500,568,-285,367], 3, 1]
 Covered Branches:[1, 2, 4]
 */
  @Test public void TestCase2() throws Throwable {
    MaxMin4 clsUTMaxMin4=null;
      clsUTMaxMin4=new MaxMin4();
    int[] clsUTMaxMin4P2P1=new int[]{-500,568,-285,367};
    int clsUTMaxMin4P2P2=3;
    int clsUTMaxMin4P2P3=1;
    int[] clsUTMaxMin4P2R=null;
      clsUTMaxMin4P2R=MaxMin4.maxMin4(clsUTMaxMin4P2P1,clsUTMaxMin4P2P2,clsUTMaxMin4P2P3);
    assertTrue(Arrays.equals(new int[]{-500,568,-285,367},clsUTMaxMin4P2P1));
    assertTrue(Arrays.equals(new int[]{568,367},clsUTMaxMin4P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin4[]
2)----->maxMin4[[1,1,-293,1], 0, 2]
 Covered Branches:[1, 2, 3, 5, 6, 9]
 */
  @Test public void TestCase3() throws Throwable {
    MaxMin4 clsUTMaxMin4=null;
      clsUTMaxMin4=new MaxMin4();
    int[] clsUTMaxMin4P2P1=new int[]{1,1,-293,1};
    int clsUTMaxMin4P2P2=0;
    int clsUTMaxMin4P2P3=2;
    int[] clsUTMaxMin4P2R=null;
      clsUTMaxMin4P2R=MaxMin4.maxMin4(clsUTMaxMin4P2P1,clsUTMaxMin4P2P2,clsUTMaxMin4P2P3);
    assertTrue(Arrays.equals(new int[]{1,1,-293,1},clsUTMaxMin4P2P1));
    assertTrue(Arrays.equals(new int[]{1,-293},clsUTMaxMin4P2R));
  }
}
