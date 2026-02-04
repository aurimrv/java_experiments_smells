package ds.seed1448;
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
Evaluations : 196353
search time (ms): 42501
total runtime (ms): 43944
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.MaxMin3[]
2)----->maxMin3[[-640,894,-162,-485], 82]
 Covered Branches:[1, 3, 5, 6, 7, 10, 12]
 */
  @Test public void TestCase0() throws Throwable {
    MaxMin3 clsUTMaxMin3=null;
      clsUTMaxMin3=new MaxMin3();
    int[] clsUTMaxMin3P2P1=new int[]{-640,894,-162,-485};
    int clsUTMaxMin3P2P2=82;
    int[] clsUTMaxMin3P2R=null;
//Exception
    try {
      clsUTMaxMin3P2R=MaxMin3.maxMin3(clsUTMaxMin3P2P1,clsUTMaxMin3P2P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertTrue(Arrays.equals(new int[]{-640,894,-162,-485},clsUTMaxMin3P2P1));
    assertNull(clsUTMaxMin3P2R);
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin3[]
2)----->maxMin3[[1,-197,3,-345], 4]
 Covered Branches:[1, 3, 4, 6, 7, 9, 11]
 */
  @Test public void TestCase1() throws Throwable {
    MaxMin3 clsUTMaxMin3=null;
      clsUTMaxMin3=new MaxMin3();
    int[] clsUTMaxMin3P2P1=new int[]{1,-197,3,-345};
    int clsUTMaxMin3P2P2=4;
    int[] clsUTMaxMin3P2R=null;
      clsUTMaxMin3P2R=MaxMin3.maxMin3(clsUTMaxMin3P2P1,clsUTMaxMin3P2P2);
    assertTrue(Arrays.equals(new int[]{1,-197,3,-345},clsUTMaxMin3P2P1));
    assertTrue(Arrays.equals(new int[]{3,-345},clsUTMaxMin3P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin3[]
2)----->maxMin3[[-512,638,-579,1], 3]
 Covered Branches:[16, 1, 2, 5, 6, 8, 13]
 */
  @Test public void TestCase2() throws Throwable {
    MaxMin3 clsUTMaxMin3=null;
      clsUTMaxMin3=new MaxMin3();
    int[] clsUTMaxMin3P2P1=new int[]{-512,638,-579,1};
    int clsUTMaxMin3P2P2=3;
    int[] clsUTMaxMin3P2R=null;
      clsUTMaxMin3P2R=MaxMin3.maxMin3(clsUTMaxMin3P2P1,clsUTMaxMin3P2P2);
    assertTrue(Arrays.equals(new int[]{638,-579},clsUTMaxMin3P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin3[]
2)----->maxMin3[[-308,93,452,1], 1]
 Covered Branches:[1, 2, 5]
 */
  @Test public void TestCase3() throws Throwable {
    MaxMin3 clsUTMaxMin3=null;
      clsUTMaxMin3=new MaxMin3();
    int[] clsUTMaxMin3P2P1=new int[]{-308,93,452,1};
    int clsUTMaxMin3P2P2=1;
    int[] clsUTMaxMin3P2R=null;
      clsUTMaxMin3P2R=MaxMin3.maxMin3(clsUTMaxMin3P2P1,clsUTMaxMin3P2P2);
    assertTrue(Arrays.equals(new int[]{-308,-308},clsUTMaxMin3P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin3[]
2)----->maxMin3[[93,-47,647,2], 3]
 Covered Branches:[1, 2, 4, 6, 8, 14, 15]
 */
  @Test public void TestCase4() throws Throwable {
    MaxMin3 clsUTMaxMin3=null;
      clsUTMaxMin3=new MaxMin3();
    int[] clsUTMaxMin3P2P1=new int[]{93,-47,647,2};
    int clsUTMaxMin3P2P2=3;
    int[] clsUTMaxMin3P2R=null;
      clsUTMaxMin3P2R=MaxMin3.maxMin3(clsUTMaxMin3P2P1,clsUTMaxMin3P2P2);
    assertTrue(Arrays.equals(new int[]{647,-47},clsUTMaxMin3P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin3[]
2)----->maxMin3[[453,-138,0,-757], 4]
 Covered Branches:[1, 3, 4, 6, 7, 10, 11]
 */
  @Test public void TestCase5() throws Throwable {
    MaxMin3 clsUTMaxMin3=null;
      clsUTMaxMin3=new MaxMin3();
    int[] clsUTMaxMin3P2P1=new int[]{453,-138,0,-757};
    int clsUTMaxMin3P2P2=4;
    int[] clsUTMaxMin3P2R=null;
      clsUTMaxMin3P2R=MaxMin3.maxMin3(clsUTMaxMin3P2P1,clsUTMaxMin3P2P2);
    assertTrue(Arrays.equals(new int[]{453,-138,0,-757},clsUTMaxMin3P2P1));
    assertTrue(Arrays.equals(new int[]{453,-757},clsUTMaxMin3P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin3[]
2)----->maxMin3[[-828,518], 2]
 Covered Branches:[1, 3, 5]
 */
  @Test public void TestCase6() throws Throwable {
    MaxMin3 clsUTMaxMin3=null;
      clsUTMaxMin3=new MaxMin3();
    int[] clsUTMaxMin3P2P1=new int[]{-828,518};
    int clsUTMaxMin3P2P2=2;
    int[] clsUTMaxMin3P2R=null;
      clsUTMaxMin3P2R=MaxMin3.maxMin3(clsUTMaxMin3P2P1,clsUTMaxMin3P2P2);
    assertTrue(Arrays.equals(new int[]{-828,518},clsUTMaxMin3P2P1));
    assertTrue(Arrays.equals(new int[]{518,-828},clsUTMaxMin3P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin3[]
2)----->maxMin3[[297,-194,793], -582]
 Covered Branches:[1, 3, 4]
 */
  @Test public void TestCase7() throws Throwable {
    MaxMin3 clsUTMaxMin3=null;
      clsUTMaxMin3=new MaxMin3();
    int[] clsUTMaxMin3P2P1=new int[]{297,-194,793};
    int clsUTMaxMin3P2P2=-582;
    int[] clsUTMaxMin3P2R=null;
      clsUTMaxMin3P2R=MaxMin3.maxMin3(clsUTMaxMin3P2P1,clsUTMaxMin3P2P2);
    assertTrue(Arrays.equals(new int[]{297,-194,793},clsUTMaxMin3P2P1));
    assertTrue(Arrays.equals(new int[]{297,-194},clsUTMaxMin3P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin3[]
2)----->maxMin3[[2,-501,0,0], 3]
 Covered Branches:[16, 1, 2, 4, 6, 8, 14]
 */
  @Test public void TestCase8() throws Throwable {
    MaxMin3 clsUTMaxMin3=null;
      clsUTMaxMin3=new MaxMin3();
    int[] clsUTMaxMin3P2P1=new int[]{2,-501,0,0};
    int clsUTMaxMin3P2P2=3;
    int[] clsUTMaxMin3P2R=null;
      clsUTMaxMin3P2R=MaxMin3.maxMin3(clsUTMaxMin3P2P1,clsUTMaxMin3P2P2);
    assertTrue(Arrays.equals(new int[]{2,-501,0,0},clsUTMaxMin3P2P1));
    assertTrue(Arrays.equals(new int[]{2,-501},clsUTMaxMin3P2R));
  }
}
