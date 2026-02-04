package ds.seed9006;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import java.util.Arrays;
import ds.MaxMin1;
/** 
 * This class was automatically generated to test the ds.MaxMin1 class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6]
Uncovered branches: []
Total number of branches: 6
Total number of covered branches: 6
Coverage : 100%
Evaluations : 253
search time (ms): 318
total runtime (ms): 1455
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.MaxMin1[]
2)----->maxMin1[[0,-974], 2]
 Covered Branches:[1, 2, 4, 5]
 */
  @Test public void TestCase0() throws Throwable {
    MaxMin1 clsUTMaxMin1=null;
      clsUTMaxMin1=new MaxMin1();
    int[] clsUTMaxMin1P2P1=new int[]{0,-974};
    int clsUTMaxMin1P2P2=2;
    int[] clsUTMaxMin1P2R=null;
      clsUTMaxMin1P2R=MaxMin1.maxMin1(clsUTMaxMin1P2P1,clsUTMaxMin1P2P2);
    assertTrue(Arrays.equals(new int[]{0,-974},clsUTMaxMin1P2P1));
    assertTrue(Arrays.equals(new int[]{0,-974},clsUTMaxMin1P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin1[]
2)----->maxMin1[[676,932], 1]
 Covered Branches:[1]
 */
  @Test public void TestCase1() throws Throwable {
    MaxMin1 clsUTMaxMin1=null;
      clsUTMaxMin1=new MaxMin1();
    int[] clsUTMaxMin1P2P1=new int[]{676,932};
    int clsUTMaxMin1P2P2=1;
    int[] clsUTMaxMin1P2R=null;
      clsUTMaxMin1P2R=MaxMin1.maxMin1(clsUTMaxMin1P2P1,clsUTMaxMin1P2P2);
    assertTrue(Arrays.equals(new int[]{676,932},clsUTMaxMin1P2P1));
    assertTrue(Arrays.equals(new int[]{676,676},clsUTMaxMin1P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin1[]
2)----->maxMin1[[-96,537,-288], 3]
 Covered Branches:[1, 2, 3, 4, 5, 6]
 */
  @Test public void TestCase2() throws Throwable {
    MaxMin1 clsUTMaxMin1=null;
      clsUTMaxMin1=new MaxMin1();
    int[] clsUTMaxMin1P2P1=new int[]{-96,537,-288};
    int clsUTMaxMin1P2P2=3;
    int[] clsUTMaxMin1P2R=null;
      clsUTMaxMin1P2R=MaxMin1.maxMin1(clsUTMaxMin1P2P1,clsUTMaxMin1P2P2);
    assertTrue(Arrays.equals(new int[]{-96,537,-288},clsUTMaxMin1P2P1));
    assertTrue(Arrays.equals(new int[]{537,-288},clsUTMaxMin1P2R));
  }
}
