package ds.seed9006;
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
Evaluations : 77091
search time (ms): 18542
total runtime (ms): 20166
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.MaxMin3[]
2)----->maxMin3[[-232,1,-83,-168], 4]
 Covered Branches:[1, 3, 5, 6, 7, 10, 12]
 */
  @Test public void TestCase0() throws Throwable {
    MaxMin3 clsUTMaxMin3=null;
      clsUTMaxMin3=new MaxMin3();
    int[] clsUTMaxMin3P2P1=new int[]{-232,1,-83,-168};
    int clsUTMaxMin3P2P2=4;
    int[] clsUTMaxMin3P2R=null;
      clsUTMaxMin3P2R=MaxMin3.maxMin3(clsUTMaxMin3P2P1,clsUTMaxMin3P2P2);
    assertTrue(Arrays.equals(new int[]{-232,1,-83,-168},clsUTMaxMin3P2P1));
    assertTrue(Arrays.equals(new int[]{1,-232},clsUTMaxMin3P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin3[]
2)----->maxMin3[[710,132,153], 1]
 Covered Branches:[1, 2, 5]
 */
  @Test public void TestCase1() throws Throwable {
    MaxMin3 clsUTMaxMin3=null;
      clsUTMaxMin3=new MaxMin3();
    int[] clsUTMaxMin3P2P1=new int[]{710,132,153};
    int clsUTMaxMin3P2P2=1;
    int[] clsUTMaxMin3P2R=null;
      clsUTMaxMin3P2R=MaxMin3.maxMin3(clsUTMaxMin3P2P1,clsUTMaxMin3P2P2);
    assertTrue(Arrays.equals(new int[]{710,710},clsUTMaxMin3P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin3[]
2)----->maxMin3[[171,236,-308,-82], 3]
 Covered Branches:[16, 1, 2, 5, 6, 8, 13]
 */
  @Test public void TestCase2() throws Throwable {
    MaxMin3 clsUTMaxMin3=null;
      clsUTMaxMin3=new MaxMin3();
    int[] clsUTMaxMin3P2P1=new int[]{171,236,-308,-82};
    int clsUTMaxMin3P2P2=3;
    int[] clsUTMaxMin3P2R=null;
      clsUTMaxMin3P2R=MaxMin3.maxMin3(clsUTMaxMin3P2P1,clsUTMaxMin3P2P2);
    assertTrue(Arrays.equals(new int[]{236,-308},clsUTMaxMin3P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin3[]
2)----->maxMin3[[-395,-531,241,84], 3]
 Covered Branches:[1, 2, 4, 6, 8, 14, 15]
 */
  @Test public void TestCase3() throws Throwable {
    MaxMin3 clsUTMaxMin3=null;
      clsUTMaxMin3=new MaxMin3();
    int[] clsUTMaxMin3P2P1=new int[]{-395,-531,241,84};
    int clsUTMaxMin3P2P2=3;
    int[] clsUTMaxMin3P2R=null;
      clsUTMaxMin3P2R=MaxMin3.maxMin3(clsUTMaxMin3P2P1,clsUTMaxMin3P2P2);
    assertTrue(Arrays.equals(new int[]{241,-531},clsUTMaxMin3P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin3[]
2)----->maxMin3[[433,-861,663], -889]
 Covered Branches:[1, 3, 4]
 */
  @Test public void TestCase4() throws Throwable {
    MaxMin3 clsUTMaxMin3=null;
      clsUTMaxMin3=new MaxMin3();
    int[] clsUTMaxMin3P2P1=new int[]{433,-861,663};
    int clsUTMaxMin3P2P2=-889;
    int[] clsUTMaxMin3P2R=null;
      clsUTMaxMin3P2R=MaxMin3.maxMin3(clsUTMaxMin3P2P1,clsUTMaxMin3P2P2);
    assertTrue(Arrays.equals(new int[]{433,-861,663},clsUTMaxMin3P2P1));
    assertTrue(Arrays.equals(new int[]{433,-861},clsUTMaxMin3P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin3[]
2)----->maxMin3[[-327,0,-44,-685], 4]
 Covered Branches:[1, 3, 5, 6, 7, 10, 11]
 */
  @Test public void TestCase5() throws Throwable {
    MaxMin3 clsUTMaxMin3=null;
      clsUTMaxMin3=new MaxMin3();
    int[] clsUTMaxMin3P2P1=new int[]{-327,0,-44,-685};
    int clsUTMaxMin3P2P2=4;
    int[] clsUTMaxMin3P2R=null;
      clsUTMaxMin3P2R=MaxMin3.maxMin3(clsUTMaxMin3P2P1,clsUTMaxMin3P2P2);
    assertTrue(Arrays.equals(new int[]{-327,0,-44,-685},clsUTMaxMin3P2P1));
    assertTrue(Arrays.equals(new int[]{0,-685},clsUTMaxMin3P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin3[]
2)----->maxMin3[[-582,-267,566,495], 4]
 Covered Branches:[1, 3, 5, 6, 7, 9, 12]
 */
  @Test public void TestCase6() throws Throwable {
    MaxMin3 clsUTMaxMin3=null;
      clsUTMaxMin3=new MaxMin3();
    int[] clsUTMaxMin3P2P1=new int[]{-582,-267,566,495};
    int clsUTMaxMin3P2P2=4;
    int[] clsUTMaxMin3P2R=null;
      clsUTMaxMin3P2R=MaxMin3.maxMin3(clsUTMaxMin3P2P1,clsUTMaxMin3P2P2);
    assertTrue(Arrays.equals(new int[]{-582,-267,566,495},clsUTMaxMin3P2P1));
    assertTrue(Arrays.equals(new int[]{566,-582},clsUTMaxMin3P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin3[]
2)----->maxMin3[[488,-993,1,-275], 3]
 Covered Branches:[16, 1, 2, 4, 6, 8, 14]
 */
  @Test public void TestCase7() throws Throwable {
    MaxMin3 clsUTMaxMin3=null;
      clsUTMaxMin3=new MaxMin3();
    int[] clsUTMaxMin3P2P1=new int[]{488,-993,1,-275};
    int clsUTMaxMin3P2P2=3;
    int[] clsUTMaxMin3P2R=null;
      clsUTMaxMin3P2R=MaxMin3.maxMin3(clsUTMaxMin3P2P1,clsUTMaxMin3P2P2);
    assertTrue(Arrays.equals(new int[]{488,-993},clsUTMaxMin3P2R));
  }
}
