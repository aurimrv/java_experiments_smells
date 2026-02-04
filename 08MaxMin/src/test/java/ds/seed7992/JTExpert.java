package ds.seed7992;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import java.util.Arrays;
import ds.MaxMin4;
/** 
 * This class was automatically generated to test the ds.MaxMin4 class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6, 7, 8, 9]
Uncovered branches: []
Total number of branches: 9
Total number of covered branches: 9
Coverage : 100%
Evaluations : 3127
search time (ms): 1569
total runtime (ms): 2729
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.MaxMin4[]
2)----->maxMin4[[-281,-790,-1], 0, 2]
 Covered Branches:[1, 2, 3, 5, 7, 8]
 */
  @Test public void TestCase0() throws Throwable {
    MaxMin4 clsUTMaxMin4=null;
      clsUTMaxMin4=new MaxMin4();
    int[] clsUTMaxMin4P2P1=new int[]{-281,-790,-1};
    int clsUTMaxMin4P2P2=0;
    int clsUTMaxMin4P2P3=2;
    int[] clsUTMaxMin4P2R=null;
      clsUTMaxMin4P2R=MaxMin4.maxMin4(clsUTMaxMin4P2P1,clsUTMaxMin4P2P2,clsUTMaxMin4P2P3);
    assertTrue(Arrays.equals(new int[]{-281,-790,-1},clsUTMaxMin4P2P1));
    assertTrue(Arrays.equals(new int[]{-1,-790},clsUTMaxMin4P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin4[]
2)----->maxMin4[[474,221,-805], 0, 2]
 Covered Branches:[1, 2, 3, 5, 6, 9]
 */
  @Test public void TestCase1() throws Throwable {
    MaxMin4 clsUTMaxMin4=null;
      clsUTMaxMin4=new MaxMin4();
    int[] clsUTMaxMin4P2P1=new int[]{474,221,-805};
    int clsUTMaxMin4P2P2=0;
    int clsUTMaxMin4P2P3=2;
    int[] clsUTMaxMin4P2R=null;
      clsUTMaxMin4P2R=MaxMin4.maxMin4(clsUTMaxMin4P2P1,clsUTMaxMin4P2P2,clsUTMaxMin4P2P3);
    assertTrue(Arrays.equals(new int[]{474,221,-805},clsUTMaxMin4P2P1));
    assertTrue(Arrays.equals(new int[]{474,-805},clsUTMaxMin4P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin4[]
2)----->maxMin4[[-841,680,2,-265], 2, 0]
 Covered Branches:[1, 2, 5]
 */
  @Test public void TestCase2() throws Throwable {
    MaxMin4 clsUTMaxMin4=null;
      clsUTMaxMin4=new MaxMin4();
    int[] clsUTMaxMin4P2P1=new int[]{-841,680,2,-265};
    int clsUTMaxMin4P2P2=2;
    int clsUTMaxMin4P2P3=0;
    int[] clsUTMaxMin4P2R=null;
      clsUTMaxMin4P2R=MaxMin4.maxMin4(clsUTMaxMin4P2P1,clsUTMaxMin4P2P2,clsUTMaxMin4P2P3);
    assertTrue(Arrays.equals(new int[]{-841,680,2,-265},clsUTMaxMin4P2P1));
    assertTrue(Arrays.equals(new int[]{2,-841},clsUTMaxMin4P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin4[]
2)----->maxMin4[[939,446,-1], 2, 0]
 Covered Branches:[1, 2, 4]
 */
  @Test public void TestCase3() throws Throwable {
    MaxMin4 clsUTMaxMin4=null;
      clsUTMaxMin4=new MaxMin4();
    int[] clsUTMaxMin4P2P1=new int[]{939,446,-1};
    int clsUTMaxMin4P2P2=2;
    int clsUTMaxMin4P2P3=0;
    int[] clsUTMaxMin4P2R=null;
      clsUTMaxMin4P2R=MaxMin4.maxMin4(clsUTMaxMin4P2P1,clsUTMaxMin4P2P2,clsUTMaxMin4P2P3);
    assertTrue(Arrays.equals(new int[]{939,446,-1},clsUTMaxMin4P2P1));
    assertTrue(Arrays.equals(new int[]{939,-1},clsUTMaxMin4P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin4[]
2)----->maxMin4[[-466,214,-366,682], 0, 2]
 Covered Branches:[1, 2, 3, 4, 5, 6, 8]
 */
  @Test public void TestCase4() throws Throwable {
    MaxMin4 clsUTMaxMin4=null;
      clsUTMaxMin4=new MaxMin4();
    int[] clsUTMaxMin4P2P1=new int[]{-466,214,-366,682};
    int clsUTMaxMin4P2P2=0;
    int clsUTMaxMin4P2P3=2;
    int[] clsUTMaxMin4P2R=null;
      clsUTMaxMin4P2R=MaxMin4.maxMin4(clsUTMaxMin4P2P1,clsUTMaxMin4P2P2,clsUTMaxMin4P2P3);
    assertTrue(Arrays.equals(new int[]{-466,214,-366,682},clsUTMaxMin4P2P1));
    assertTrue(Arrays.equals(new int[]{214,-466},clsUTMaxMin4P2R));
  }
}
