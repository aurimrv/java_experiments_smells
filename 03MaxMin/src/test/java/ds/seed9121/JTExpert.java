package ds.seed9121;
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
Evaluations : 510
search time (ms): 465
total runtime (ms): 1593
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.MaxMin2[]
2)----->maxMin2[[220,-966], 2]
 Covered Branches:[1, 2, 4, 5]
 */
  @Test public void TestCase0() throws Throwable {
    MaxMin2 clsUTMaxMin2=null;
      clsUTMaxMin2=new MaxMin2();
    int[] clsUTMaxMin2P2P1=new int[]{220,-966};
    int clsUTMaxMin2P2P2=2;
    int[] clsUTMaxMin2P2R=null;
      clsUTMaxMin2P2R=MaxMin2.maxMin2(clsUTMaxMin2P2P1,clsUTMaxMin2P2P2);
    assertTrue(Arrays.equals(new int[]{220,-966},clsUTMaxMin2P2P1));
    assertTrue(Arrays.equals(new int[]{220,-966},clsUTMaxMin2P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin2[]
2)----->maxMin2[[-858,2,2,-408], 2]
 Covered Branches:[1, 2, 3]
 */
  @Test public void TestCase1() throws Throwable {
    MaxMin2 clsUTMaxMin2=null;
      clsUTMaxMin2=new MaxMin2();
    int[] clsUTMaxMin2P2P1=new int[]{-858,2,2,-408};
    int clsUTMaxMin2P2P2=2;
    int[] clsUTMaxMin2P2R=null;
      clsUTMaxMin2P2R=MaxMin2.maxMin2(clsUTMaxMin2P2P1,clsUTMaxMin2P2P2);
    assertTrue(Arrays.equals(new int[]{-858,2,2,-408},clsUTMaxMin2P2P1));
    assertTrue(Arrays.equals(new int[]{2,-858},clsUTMaxMin2P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin2[]
2)----->maxMin2[[412,611,-1,481], -440]
 Covered Branches:[1]
 */
  @Test public void TestCase2() throws Throwable {
    MaxMin2 clsUTMaxMin2=null;
      clsUTMaxMin2=new MaxMin2();
    int[] clsUTMaxMin2P2P1=new int[]{412,611,-1,481};
    int clsUTMaxMin2P2P2=-440;
    int[] clsUTMaxMin2P2R=null;
      clsUTMaxMin2P2R=MaxMin2.maxMin2(clsUTMaxMin2P2P1,clsUTMaxMin2P2P2);
    assertTrue(Arrays.equals(new int[]{412,611,-1,481},clsUTMaxMin2P2P1));
    assertTrue(Arrays.equals(new int[]{412,412},clsUTMaxMin2P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin2[]
2)----->maxMin2[[768,-989,521,28], 3]
 Covered Branches:[1, 2, 4, 5, 6]
 */
  @Test public void TestCase3() throws Throwable {
    MaxMin2 clsUTMaxMin2=null;
      clsUTMaxMin2=new MaxMin2();
    int[] clsUTMaxMin2P2P1=new int[]{768,-989,521,28};
    int clsUTMaxMin2P2P2=3;
    int[] clsUTMaxMin2P2R=null;
      clsUTMaxMin2P2R=MaxMin2.maxMin2(clsUTMaxMin2P2P1,clsUTMaxMin2P2P2);
    assertTrue(Arrays.equals(new int[]{768,-989,521,28},clsUTMaxMin2P2P1));
    assertTrue(Arrays.equals(new int[]{768,-989},clsUTMaxMin2P2R));
  }
}
