package ds.seed5831;
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
Evaluations : 83038
search time (ms): 20602
total runtime (ms): 22092
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.MaxMin3[]
2)----->maxMin3[[-905,1,-465,572], -766]
 Covered Branches:[1, 3, 5]
 */
  @Test public void TestCase0() throws Throwable {
    MaxMin3 clsUTMaxMin3=null;
      clsUTMaxMin3=new MaxMin3();
    int[] clsUTMaxMin3P2P1=new int[]{-905,1,-465,572};
    int clsUTMaxMin3P2P2=-766;
    int[] clsUTMaxMin3P2R=null;
      clsUTMaxMin3P2R=MaxMin3.maxMin3(clsUTMaxMin3P2P1,clsUTMaxMin3P2P2);
    assertTrue(Arrays.equals(new int[]{-905,1,-465,572},clsUTMaxMin3P2P1));
    assertTrue(Arrays.equals(new int[]{1,-905},clsUTMaxMin3P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin3[]
2)----->maxMin3[[-61,0,201,804], 3]
 Covered Branches:[1, 2, 5, 6, 8, 14, 15]
 */
  @Test public void TestCase1() throws Throwable {
    MaxMin3 clsUTMaxMin3=null;
      clsUTMaxMin3=new MaxMin3();
    int[] clsUTMaxMin3P2P1=new int[]{-61,0,201,804};
    int clsUTMaxMin3P2P2=3;
    int[] clsUTMaxMin3P2R=null;
      clsUTMaxMin3P2R=MaxMin3.maxMin3(clsUTMaxMin3P2P1,clsUTMaxMin3P2P2);
    assertTrue(Arrays.equals(new int[]{201,-61},clsUTMaxMin3P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin3[]
2)----->maxMin3[[341,328,500,-95], 4]
 Covered Branches:[1, 3, 4, 6, 7, 9, 11]
 */
  @Test public void TestCase2() throws Throwable {
    MaxMin3 clsUTMaxMin3=null;
      clsUTMaxMin3=new MaxMin3();
    int[] clsUTMaxMin3P2P1=new int[]{341,328,500,-95};
    int clsUTMaxMin3P2P2=4;
    int[] clsUTMaxMin3P2R=null;
      clsUTMaxMin3P2R=MaxMin3.maxMin3(clsUTMaxMin3P2P1,clsUTMaxMin3P2P2);
    assertTrue(Arrays.equals(new int[]{341,328,500,-95},clsUTMaxMin3P2P1));
    assertTrue(Arrays.equals(new int[]{500,-95},clsUTMaxMin3P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin3[]
2)----->maxMin3[[269,-438,-48], -804]
 Covered Branches:[1, 3, 4]
 */
  @Test public void TestCase3() throws Throwable {
    MaxMin3 clsUTMaxMin3=null;
      clsUTMaxMin3=new MaxMin3();
    int[] clsUTMaxMin3P2P1=new int[]{269,-438,-48};
    int clsUTMaxMin3P2P2=-804;
    int[] clsUTMaxMin3P2R=null;
      clsUTMaxMin3P2R=MaxMin3.maxMin3(clsUTMaxMin3P2P1,clsUTMaxMin3P2P2);
    assertTrue(Arrays.equals(new int[]{269,-438,-48},clsUTMaxMin3P2P1));
    assertTrue(Arrays.equals(new int[]{269,-438},clsUTMaxMin3P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin3[]
2)----->maxMin3[[167,-316,-318,2], 3]
 Covered Branches:[16, 1, 2, 4, 6, 8, 13]
 */
  @Test public void TestCase4() throws Throwable {
    MaxMin3 clsUTMaxMin3=null;
      clsUTMaxMin3=new MaxMin3();
    int[] clsUTMaxMin3P2P1=new int[]{167,-316,-318,2};
    int clsUTMaxMin3P2P2=3;
    int[] clsUTMaxMin3P2R=null;
      clsUTMaxMin3P2R=MaxMin3.maxMin3(clsUTMaxMin3P2P1,clsUTMaxMin3P2P2);
    assertTrue(Arrays.equals(new int[]{167,-318},clsUTMaxMin3P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin3[]
2)----->maxMin3[[1,596,930,357], 4]
 Covered Branches:[1, 3, 5, 6, 7, 9, 12]
 */
  @Test public void TestCase5() throws Throwable {
    MaxMin3 clsUTMaxMin3=null;
      clsUTMaxMin3=new MaxMin3();
    int[] clsUTMaxMin3P2P1=new int[]{1,596,930,357};
    int clsUTMaxMin3P2P2=4;
    int[] clsUTMaxMin3P2R=null;
      clsUTMaxMin3P2R=MaxMin3.maxMin3(clsUTMaxMin3P2P1,clsUTMaxMin3P2P2);
    assertTrue(Arrays.equals(new int[]{1,596,930,357},clsUTMaxMin3P2P1));
    assertTrue(Arrays.equals(new int[]{930,1},clsUTMaxMin3P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin3[]
2)----->maxMin3[[1,231,1,143], 3]
 Covered Branches:[16, 1, 2, 5, 6, 8, 14]
 */
  @Test public void TestCase6() throws Throwable {
    MaxMin3 clsUTMaxMin3=null;
      clsUTMaxMin3=new MaxMin3();
    int[] clsUTMaxMin3P2P1=new int[]{1,231,1,143};
    int clsUTMaxMin3P2P2=3;
    int[] clsUTMaxMin3P2R=null;
      clsUTMaxMin3P2R=MaxMin3.maxMin3(clsUTMaxMin3P2P1,clsUTMaxMin3P2P2);
    assertTrue(Arrays.equals(new int[]{231,1},clsUTMaxMin3P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin3[]
2)----->maxMin3[[796,-198,747,1], 4]
 Covered Branches:[1, 3, 4, 6, 7, 10, 12]
 */
  @Test public void TestCase7() throws Throwable {
    MaxMin3 clsUTMaxMin3=null;
      clsUTMaxMin3=new MaxMin3();
    int[] clsUTMaxMin3P2P1=new int[]{796,-198,747,1};
    int clsUTMaxMin3P2P2=4;
    int[] clsUTMaxMin3P2R=null;
      clsUTMaxMin3P2R=MaxMin3.maxMin3(clsUTMaxMin3P2P1,clsUTMaxMin3P2P2);
    assertTrue(Arrays.equals(new int[]{796,-198,747,1},clsUTMaxMin3P2P1));
    assertTrue(Arrays.equals(new int[]{796,-198},clsUTMaxMin3P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin3[]
2)----->maxMin3[[0,552,64,1], 1]
 Covered Branches:[1, 2, 5]
 */
  @Test public void TestCase8() throws Throwable {
    MaxMin3 clsUTMaxMin3=null;
      clsUTMaxMin3=new MaxMin3();
    int[] clsUTMaxMin3P2P1=new int[]{0,552,64,1};
    int clsUTMaxMin3P2P2=1;
    int[] clsUTMaxMin3P2R=null;
      clsUTMaxMin3P2R=MaxMin3.maxMin3(clsUTMaxMin3P2P1,clsUTMaxMin3P2P2);
    assertTrue(Arrays.equals(new int[]{0,0},clsUTMaxMin3P2R));
  }
}
