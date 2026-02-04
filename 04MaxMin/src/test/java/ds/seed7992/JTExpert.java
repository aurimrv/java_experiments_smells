package ds.seed7992;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.MaxMin3;
import java.util.Arrays;
/** 
 * This class was automatically generated to test the ds.MaxMin3 class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
Uncovered branches: []
Total number of branches: 16
Total number of covered branches: 16
Coverage : 100%
Evaluations : 95780
search time (ms): 22789
total runtime (ms): 24308
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.MaxMin3[]
2)----->maxMin3[[363,0,679,146], 4]
 Covered Branches:[1, 3, 4, 6, 7, 9, 12]
 */
  @Test public void TestCase0() throws Throwable {
    MaxMin3 clsUTMaxMin3=null;
      clsUTMaxMin3=new MaxMin3();
    int[] clsUTMaxMin3P2P1=new int[]{363,0,679,146};
    int clsUTMaxMin3P2P2=4;
    int[] clsUTMaxMin3P2R=null;
      clsUTMaxMin3P2R=MaxMin3.maxMin3(clsUTMaxMin3P2P1,clsUTMaxMin3P2P2);
    assertTrue(Arrays.equals(new int[]{363,0,679,146},clsUTMaxMin3P2P1));
    assertTrue(Arrays.equals(new int[]{679,0},clsUTMaxMin3P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin3[]
2)----->maxMin3[[-48,575,1,-731], 4]
 Covered Branches:[1, 3, 5, 6, 7, 10, 11]
 */
  @Test public void TestCase1() throws Throwable {
    MaxMin3 clsUTMaxMin3=null;
      clsUTMaxMin3=new MaxMin3();
    int[] clsUTMaxMin3P2P1=new int[]{-48,575,1,-731};
    int clsUTMaxMin3P2P2=4;
    int[] clsUTMaxMin3P2R=null;
      clsUTMaxMin3P2R=MaxMin3.maxMin3(clsUTMaxMin3P2P1,clsUTMaxMin3P2P2);
    assertTrue(Arrays.equals(new int[]{-48,575,1,-731},clsUTMaxMin3P2P1));
    assertTrue(Arrays.equals(new int[]{575,-731},clsUTMaxMin3P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin3[]
2)----->maxMin3[[272,1,-395,-112], 1]
 Covered Branches:[1, 2, 5]
 */
  @Test public void TestCase2() throws Throwable {
    MaxMin3 clsUTMaxMin3=null;
      clsUTMaxMin3=new MaxMin3();
    int[] clsUTMaxMin3P2P1=new int[]{272,1,-395,-112};
    int clsUTMaxMin3P2P2=1;
    int[] clsUTMaxMin3P2R=null;
      clsUTMaxMin3P2R=MaxMin3.maxMin3(clsUTMaxMin3P2P1,clsUTMaxMin3P2P2);
    assertTrue(Arrays.equals(new int[]{272,272},clsUTMaxMin3P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin3[]
2)----->maxMin3[[-728,0,1,-816], 3]
 Covered Branches:[1, 2, 5, 6, 8, 14, 15]
 */
  @Test public void TestCase3() throws Throwable {
    MaxMin3 clsUTMaxMin3=null;
      clsUTMaxMin3=new MaxMin3();
    int[] clsUTMaxMin3P2P1=new int[]{-728,0,1,-816};
    int clsUTMaxMin3P2P2=3;
    int[] clsUTMaxMin3P2R=null;
      clsUTMaxMin3P2R=MaxMin3.maxMin3(clsUTMaxMin3P2P1,clsUTMaxMin3P2P2);
    assertTrue(Arrays.equals(new int[]{1,-728},clsUTMaxMin3P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin3[]
2)----->maxMin3[[2,83,-764], -918]
 Covered Branches:[1, 3, 5]
 */
  @Test public void TestCase4() throws Throwable {
    MaxMin3 clsUTMaxMin3=null;
      clsUTMaxMin3=new MaxMin3();
    int[] clsUTMaxMin3P2P1=new int[]{2,83,-764};
    int clsUTMaxMin3P2P2=-918;
    int[] clsUTMaxMin3P2R=null;
      clsUTMaxMin3P2R=MaxMin3.maxMin3(clsUTMaxMin3P2P1,clsUTMaxMin3P2P2);
    assertTrue(Arrays.equals(new int[]{2,83,-764},clsUTMaxMin3P2P1));
    assertTrue(Arrays.equals(new int[]{83,2},clsUTMaxMin3P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin3[]
2)----->maxMin3[[449,-225,-918,0], 3]
 Covered Branches:[16, 1, 2, 4, 6, 8, 13]
 */
  @Test public void TestCase5() throws Throwable {
    MaxMin3 clsUTMaxMin3=null;
      clsUTMaxMin3=new MaxMin3();
    int[] clsUTMaxMin3P2P1=new int[]{449,-225,-918,0};
    int clsUTMaxMin3P2P2=3;
    int[] clsUTMaxMin3P2R=null;
      clsUTMaxMin3P2R=MaxMin3.maxMin3(clsUTMaxMin3P2P1,clsUTMaxMin3P2P2);
    assertTrue(Arrays.equals(new int[]{449,-918},clsUTMaxMin3P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin3[]
2)----->maxMin3[[162,1,1,708], 3]
 Covered Branches:[16, 1, 2, 4, 6, 8, 14]
 */
  @Test public void TestCase6() throws Throwable {
    MaxMin3 clsUTMaxMin3=null;
      clsUTMaxMin3=new MaxMin3();
    int[] clsUTMaxMin3P2P1=new int[]{162,1,1,708};
    int clsUTMaxMin3P2P2=3;
    int[] clsUTMaxMin3P2R=null;
      clsUTMaxMin3P2R=MaxMin3.maxMin3(clsUTMaxMin3P2P1,clsUTMaxMin3P2P2);
    assertTrue(Arrays.equals(new int[]{162,1},clsUTMaxMin3P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin3[]
2)----->maxMin3[[2,-690,-355,-659], 4]
 Covered Branches:[1, 3, 4, 6, 7, 10, 12]
 */
  @Test public void TestCase7() throws Throwable {
    MaxMin3 clsUTMaxMin3=null;
      clsUTMaxMin3=new MaxMin3();
    int[] clsUTMaxMin3P2P1=new int[]{2,-690,-355,-659};
    int clsUTMaxMin3P2P2=4;
    int[] clsUTMaxMin3P2R=null;
      clsUTMaxMin3P2R=MaxMin3.maxMin3(clsUTMaxMin3P2P1,clsUTMaxMin3P2P2);
    assertTrue(Arrays.equals(new int[]{2,-690,-355,-659},clsUTMaxMin3P2P1));
    assertTrue(Arrays.equals(new int[]{2,-690},clsUTMaxMin3P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin3[]
2)----->maxMin3[[290,-35,1], 0]
 Covered Branches:[1, 3, 4]
 */
  @Test public void TestCase8() throws Throwable {
    MaxMin3 clsUTMaxMin3=null;
      clsUTMaxMin3=new MaxMin3();
    int[] clsUTMaxMin3P2P1=new int[]{290,-35,1};
    int clsUTMaxMin3P2P2=0;
    int[] clsUTMaxMin3P2R=null;
      clsUTMaxMin3P2R=MaxMin3.maxMin3(clsUTMaxMin3P2P1,clsUTMaxMin3P2P2);
    assertTrue(Arrays.equals(new int[]{290,-35,1},clsUTMaxMin3P2P1));
    assertTrue(Arrays.equals(new int[]{290,-35},clsUTMaxMin3P2R));
  }
}
