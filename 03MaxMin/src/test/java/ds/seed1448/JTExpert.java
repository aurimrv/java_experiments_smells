package ds.seed1448;
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
Evaluations : 864
search time (ms): 646
total runtime (ms): 1875
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.MaxMin2[]
2)----->maxMin2[[387], -178]
 Covered Branches:[1]
 */
  @Test public void TestCase0() throws Throwable {
    MaxMin2 clsUTMaxMin2=null;
      clsUTMaxMin2=new MaxMin2();
    int[] clsUTMaxMin2P2P1=new int[]{387};
    int clsUTMaxMin2P2P2=-178;
    int[] clsUTMaxMin2P2R=null;
      clsUTMaxMin2P2R=MaxMin2.maxMin2(clsUTMaxMin2P2P1,clsUTMaxMin2P2P2);
    assertTrue(Arrays.equals(new int[]{387},clsUTMaxMin2P2P1));
    assertTrue(Arrays.equals(new int[]{387,387},clsUTMaxMin2P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin2[]
2)----->maxMin2[[-509,-211,-1], 2]
 Covered Branches:[1, 2, 3]
 */
  @Test public void TestCase1() throws Throwable {
    MaxMin2 clsUTMaxMin2=null;
      clsUTMaxMin2=new MaxMin2();
    int[] clsUTMaxMin2P2P1=new int[]{-509,-211,-1};
    int clsUTMaxMin2P2P2=2;
    int[] clsUTMaxMin2P2R=null;
      clsUTMaxMin2P2R=MaxMin2.maxMin2(clsUTMaxMin2P2P1,clsUTMaxMin2P2P2);
    assertTrue(Arrays.equals(new int[]{-509,-211,-1},clsUTMaxMin2P2P1));
    assertTrue(Arrays.equals(new int[]{-211,-509},clsUTMaxMin2P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin2[]
2)----->maxMin2[[882,623,768], 2]
 Covered Branches:[1, 2, 4, 5]
 */
  @Test public void TestCase2() throws Throwable {
    MaxMin2 clsUTMaxMin2=null;
      clsUTMaxMin2=new MaxMin2();
    int[] clsUTMaxMin2P2P1=new int[]{882,623,768};
    int clsUTMaxMin2P2P2=2;
    int[] clsUTMaxMin2P2R=null;
      clsUTMaxMin2P2R=MaxMin2.maxMin2(clsUTMaxMin2P2P1,clsUTMaxMin2P2P2);
    assertTrue(Arrays.equals(new int[]{882,623,768},clsUTMaxMin2P2P1));
    assertTrue(Arrays.equals(new int[]{882,623},clsUTMaxMin2P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin2[]
2)----->maxMin2[[-332,351,-260], 3]
 Covered Branches:[1, 2, 3, 4, 6]
 */
  @Test public void TestCase3() throws Throwable {
    MaxMin2 clsUTMaxMin2=null;
      clsUTMaxMin2=new MaxMin2();
    int[] clsUTMaxMin2P2P1=new int[]{-332,351,-260};
    int clsUTMaxMin2P2P2=3;
    int[] clsUTMaxMin2P2R=null;
      clsUTMaxMin2P2R=MaxMin2.maxMin2(clsUTMaxMin2P2P1,clsUTMaxMin2P2P2);
    assertTrue(Arrays.equals(new int[]{-332,351,-260},clsUTMaxMin2P2P1));
    assertTrue(Arrays.equals(new int[]{351,-332},clsUTMaxMin2P2R));
  }
}
