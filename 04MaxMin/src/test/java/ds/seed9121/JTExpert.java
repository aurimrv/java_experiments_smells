package ds.seed9121;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import java.util.Arrays;
import ds.MaxMin3;
/** 
 * This class was automatically generated to test the ds.MaxMin3 class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
Uncovered branches: []
Total number of branches: 16
Total number of covered branches: 16
Coverage : 100%
Evaluations : 178497
search time (ms): 38453
total runtime (ms): 39950
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.MaxMin3[]
2)----->maxMin3[[1,2,2,-449], 4]
 Covered Branches:[1, 3, 5, 6, 7, 10, 11]
 */
  @Test public void TestCase0() throws Throwable {
    MaxMin3 clsUTMaxMin3=null;
      clsUTMaxMin3=new MaxMin3();
    int[] clsUTMaxMin3P2P1=new int[]{1,2,2,-449};
    int clsUTMaxMin3P2P2=4;
    int[] clsUTMaxMin3P2R=null;
      clsUTMaxMin3P2R=MaxMin3.maxMin3(clsUTMaxMin3P2P1,clsUTMaxMin3P2P2);
    assertTrue(Arrays.equals(new int[]{1,2,2,-449},clsUTMaxMin3P2P1));
    assertTrue(Arrays.equals(new int[]{2,-449},clsUTMaxMin3P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin3[]
2)----->maxMin3[[-258,0,654,2], 4]
 Covered Branches:[1, 3, 5, 6, 7, 9, 12]
 */
  @Test public void TestCase1() throws Throwable {
    MaxMin3 clsUTMaxMin3=null;
      clsUTMaxMin3=new MaxMin3();
    int[] clsUTMaxMin3P2P1=new int[]{-258,0,654,2};
    int clsUTMaxMin3P2P2=4;
    int[] clsUTMaxMin3P2R=null;
      clsUTMaxMin3P2R=MaxMin3.maxMin3(clsUTMaxMin3P2P1,clsUTMaxMin3P2P2);
    assertTrue(Arrays.equals(new int[]{-258,0,654,2},clsUTMaxMin3P2P1));
    assertTrue(Arrays.equals(new int[]{654,-258},clsUTMaxMin3P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin3[]
2)----->maxMin3[[-508,-985,2,1], 3]
 Covered Branches:[1, 2, 4, 6, 8, 14, 15]
 */
  @Test public void TestCase2() throws Throwable {
    MaxMin3 clsUTMaxMin3=null;
      clsUTMaxMin3=new MaxMin3();
    int[] clsUTMaxMin3P2P1=new int[]{-508,-985,2,1};
    int clsUTMaxMin3P2P2=3;
    int[] clsUTMaxMin3P2R=null;
      clsUTMaxMin3P2R=MaxMin3.maxMin3(clsUTMaxMin3P2P1,clsUTMaxMin3P2P2);
    assertTrue(Arrays.equals(new int[]{2,-985},clsUTMaxMin3P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin3[]
2)----->maxMin3[[294,-616], -329]
 Covered Branches:[1, 3, 4]
 */
  @Test public void TestCase3() throws Throwable {
    MaxMin3 clsUTMaxMin3=null;
      clsUTMaxMin3=new MaxMin3();
    int[] clsUTMaxMin3P2P1=new int[]{294,-616};
    int clsUTMaxMin3P2P2=-329;
    int[] clsUTMaxMin3P2R=null;
      clsUTMaxMin3P2R=MaxMin3.maxMin3(clsUTMaxMin3P2P1,clsUTMaxMin3P2P2);
    assertTrue(Arrays.equals(new int[]{294,-616},clsUTMaxMin3P2P1));
    assertTrue(Arrays.equals(new int[]{294,-616},clsUTMaxMin3P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin3[]
2)----->maxMin3[[-759,570,0,-41], -411]
 Covered Branches:[1, 3, 5]
 */
  @Test public void TestCase4() throws Throwable {
    MaxMin3 clsUTMaxMin3=null;
      clsUTMaxMin3=new MaxMin3();
    int[] clsUTMaxMin3P2P1=new int[]{-759,570,0,-41};
    int clsUTMaxMin3P2P2=-411;
    int[] clsUTMaxMin3P2R=null;
      clsUTMaxMin3P2R=MaxMin3.maxMin3(clsUTMaxMin3P2P1,clsUTMaxMin3P2P2);
    assertTrue(Arrays.equals(new int[]{-759,570,0,-41},clsUTMaxMin3P2P1));
    assertTrue(Arrays.equals(new int[]{570,-759},clsUTMaxMin3P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin3[]
2)----->maxMin3[[-484,-2,665], 1]
 Covered Branches:[1, 2, 5]
 */
  @Test public void TestCase5() throws Throwable {
    MaxMin3 clsUTMaxMin3=null;
      clsUTMaxMin3=new MaxMin3();
    int[] clsUTMaxMin3P2P1=new int[]{-484,-2,665};
    int clsUTMaxMin3P2P2=1;
    int[] clsUTMaxMin3P2R=null;
      clsUTMaxMin3P2R=MaxMin3.maxMin3(clsUTMaxMin3P2P1,clsUTMaxMin3P2P2);
    assertTrue(Arrays.equals(new int[]{-484,-484},clsUTMaxMin3P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin3[]
2)----->maxMin3[[3,-64,-657,166], 3]
 Covered Branches:[16, 1, 2, 4, 6, 8, 13]
 */
  @Test public void TestCase6() throws Throwable {
    MaxMin3 clsUTMaxMin3=null;
      clsUTMaxMin3=new MaxMin3();
    int[] clsUTMaxMin3P2P1=new int[]{3,-64,-657,166};
    int clsUTMaxMin3P2P2=3;
    int[] clsUTMaxMin3P2R=null;
      clsUTMaxMin3P2R=MaxMin3.maxMin3(clsUTMaxMin3P2P1,clsUTMaxMin3P2P2);
    assertTrue(Arrays.equals(new int[]{3,-657},clsUTMaxMin3P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin3[]
2)----->maxMin3[[2,937,2,209], 3]
 Covered Branches:[16, 1, 2, 5, 6, 8, 14]
 */
  @Test public void TestCase7() throws Throwable {
    MaxMin3 clsUTMaxMin3=null;
      clsUTMaxMin3=new MaxMin3();
    int[] clsUTMaxMin3P2P1=new int[]{2,937,2,209};
    int clsUTMaxMin3P2P2=3;
    int[] clsUTMaxMin3P2R=null;
      clsUTMaxMin3P2R=MaxMin3.maxMin3(clsUTMaxMin3P2P1,clsUTMaxMin3P2P2);
    assertTrue(Arrays.equals(new int[]{937,2},clsUTMaxMin3P2R));
  }
}
