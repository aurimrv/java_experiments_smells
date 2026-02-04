package ds.seed5503;
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
Evaluations : 3755
search time (ms): 1849
total runtime (ms): 3001
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.MaxMin4[]
2)----->maxMin4[[814,279,-184], 1, 1]
 Covered Branches:[1, 2, 5]
 */
  @Test public void TestCase0() throws Throwable {
    MaxMin4 clsUTMaxMin4=null;
      clsUTMaxMin4=new MaxMin4();
    int[] clsUTMaxMin4P2P1=new int[]{814,279,-184};
    int clsUTMaxMin4P2P2=1;
    int clsUTMaxMin4P2P3=1;
    int[] clsUTMaxMin4P2R=null;
      clsUTMaxMin4P2R=MaxMin4.maxMin4(clsUTMaxMin4P2P1,clsUTMaxMin4P2P2,clsUTMaxMin4P2P3);
    assertTrue(Arrays.equals(new int[]{814,279,-184},clsUTMaxMin4P2P1));
    assertTrue(Arrays.equals(new int[]{279,279},clsUTMaxMin4P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin4[]
2)----->maxMin4[[-618,2,645], 0, 2]
 Covered Branches:[1, 2, 3, 4, 5, 7, 8]
 */
  @Test public void TestCase1() throws Throwable {
    MaxMin4 clsUTMaxMin4=null;
      clsUTMaxMin4=new MaxMin4();
    int[] clsUTMaxMin4P2P1=new int[]{-618,2,645};
    int clsUTMaxMin4P2P2=0;
    int clsUTMaxMin4P2P3=2;
    int[] clsUTMaxMin4P2R=null;
      clsUTMaxMin4P2R=MaxMin4.maxMin4(clsUTMaxMin4P2P1,clsUTMaxMin4P2P2,clsUTMaxMin4P2P3);
    assertTrue(Arrays.equals(new int[]{-618,2,645},clsUTMaxMin4P2P1));
    assertTrue(Arrays.equals(new int[]{645,-618},clsUTMaxMin4P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin4[]
2)----->maxMin4[[889,-324,650,-546], 1, 2]
 Covered Branches:[1, 2, 4]
 */
  @Test public void TestCase2() throws Throwable {
    MaxMin4 clsUTMaxMin4=null;
      clsUTMaxMin4=new MaxMin4();
    int[] clsUTMaxMin4P2P1=new int[]{889,-324,650,-546};
    int clsUTMaxMin4P2P2=1;
    int clsUTMaxMin4P2P3=2;
    int[] clsUTMaxMin4P2R=null;
      clsUTMaxMin4P2R=MaxMin4.maxMin4(clsUTMaxMin4P2P1,clsUTMaxMin4P2P2,clsUTMaxMin4P2P3);
    assertTrue(Arrays.equals(new int[]{889,-324,650,-546},clsUTMaxMin4P2P1));
    assertTrue(Arrays.equals(new int[]{650,-324},clsUTMaxMin4P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin4[]
2)----->maxMin4[[2,-551,-35], 0, 2]
 Covered Branches:[1, 2, 3, 5, 6, 8]
 */
  @Test public void TestCase3() throws Throwable {
    MaxMin4 clsUTMaxMin4=null;
      clsUTMaxMin4=new MaxMin4();
    int[] clsUTMaxMin4P2P1=new int[]{2,-551,-35};
    int clsUTMaxMin4P2P2=0;
    int clsUTMaxMin4P2P3=2;
    int[] clsUTMaxMin4P2R=null;
      clsUTMaxMin4P2R=MaxMin4.maxMin4(clsUTMaxMin4P2P1,clsUTMaxMin4P2P2,clsUTMaxMin4P2P3);
    assertTrue(Arrays.equals(new int[]{2,-551,-35},clsUTMaxMin4P2P1));
    assertTrue(Arrays.equals(new int[]{2,-551},clsUTMaxMin4P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin4[]
2)----->maxMin4[[966,698,6,-525], 0, 3]
 Covered Branches:[1, 2, 3, 5, 6, 9]
 */
  @Test public void TestCase4() throws Throwable {
    MaxMin4 clsUTMaxMin4=null;
      clsUTMaxMin4=new MaxMin4();
    int[] clsUTMaxMin4P2P1=new int[]{966,698,6,-525};
    int clsUTMaxMin4P2P2=0;
    int clsUTMaxMin4P2P3=3;
    int[] clsUTMaxMin4P2R=null;
      clsUTMaxMin4P2R=MaxMin4.maxMin4(clsUTMaxMin4P2P1,clsUTMaxMin4P2P2,clsUTMaxMin4P2P3);
    assertTrue(Arrays.equals(new int[]{966,698,6,-525},clsUTMaxMin4P2P1));
    assertTrue(Arrays.equals(new int[]{966,-525},clsUTMaxMin4P2R));
  }
}
