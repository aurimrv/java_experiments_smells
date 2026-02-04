package ds.seed5831;
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
Evaluations : 719
search time (ms): 557
total runtime (ms): 1668
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.MaxMin2[]
2)----->maxMin2[[-377,763,-358,-553], 3]
 Covered Branches:[1, 2, 3, 4, 6]
 */
  @Test public void TestCase0() throws Throwable {
    MaxMin2 clsUTMaxMin2=null;
      clsUTMaxMin2=new MaxMin2();
    int[] clsUTMaxMin2P2P1=new int[]{-377,763,-358,-553};
    int clsUTMaxMin2P2P2=3;
    int[] clsUTMaxMin2P2R=null;
      clsUTMaxMin2P2R=MaxMin2.maxMin2(clsUTMaxMin2P2P1,clsUTMaxMin2P2P2);
    assertTrue(Arrays.equals(new int[]{-377,763,-358,-553},clsUTMaxMin2P2P1));
    assertTrue(Arrays.equals(new int[]{763,-377},clsUTMaxMin2P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin2[]
2)----->maxMin2[[-230,335,-77,737], 2]
 Covered Branches:[1, 2, 3]
 */
  @Test public void TestCase1() throws Throwable {
    MaxMin2 clsUTMaxMin2=null;
      clsUTMaxMin2=new MaxMin2();
    int[] clsUTMaxMin2P2P1=new int[]{-230,335,-77,737};
    int clsUTMaxMin2P2P2=2;
    int[] clsUTMaxMin2P2R=null;
      clsUTMaxMin2P2R=MaxMin2.maxMin2(clsUTMaxMin2P2P1,clsUTMaxMin2P2P2);
    assertTrue(Arrays.equals(new int[]{-230,335,-77,737},clsUTMaxMin2P2P1));
    assertTrue(Arrays.equals(new int[]{335,-230},clsUTMaxMin2P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin2[]
2)----->maxMin2[[892,55,0,0], -685]
 Covered Branches:[1]
 */
  @Test public void TestCase2() throws Throwable {
    MaxMin2 clsUTMaxMin2=null;
      clsUTMaxMin2=new MaxMin2();
    int[] clsUTMaxMin2P2P1=new int[]{892,55,0,0};
    int clsUTMaxMin2P2P2=-685;
    int[] clsUTMaxMin2P2R=null;
      clsUTMaxMin2P2R=MaxMin2.maxMin2(clsUTMaxMin2P2P1,clsUTMaxMin2P2P2);
    assertTrue(Arrays.equals(new int[]{892,55,0,0},clsUTMaxMin2P2P1));
    assertTrue(Arrays.equals(new int[]{892,892},clsUTMaxMin2P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin2[]
2)----->maxMin2[[0,2,-774], 3]
 Covered Branches:[1, 2, 3, 4, 5]
 */
  @Test public void TestCase3() throws Throwable {
    MaxMin2 clsUTMaxMin2=null;
      clsUTMaxMin2=new MaxMin2();
    int[] clsUTMaxMin2P2P1=new int[]{0,2,-774};
    int clsUTMaxMin2P2P2=3;
    int[] clsUTMaxMin2P2R=null;
      clsUTMaxMin2P2R=MaxMin2.maxMin2(clsUTMaxMin2P2P1,clsUTMaxMin2P2P2);
    assertTrue(Arrays.equals(new int[]{0,2,-774},clsUTMaxMin2P2P1));
    assertTrue(Arrays.equals(new int[]{2,-774},clsUTMaxMin2P2R));
  }
}
