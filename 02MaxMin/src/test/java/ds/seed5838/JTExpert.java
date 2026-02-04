package ds.seed5838;
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
Evaluations : 157
search time (ms): 224
total runtime (ms): 1411
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.MaxMin1[]
2)----->maxMin1[[-256,-165,-239,976], 3]
 Covered Branches:[1, 2, 3, 4, 6]
 */
  @Test public void TestCase0() throws Throwable {
    MaxMin1 clsUTMaxMin1=null;
      clsUTMaxMin1=new MaxMin1();
    int[] clsUTMaxMin1P2P1=new int[]{-256,-165,-239,976};
    int clsUTMaxMin1P2P2=3;
    int[] clsUTMaxMin1P2R=null;
      clsUTMaxMin1P2R=MaxMin1.maxMin1(clsUTMaxMin1P2P1,clsUTMaxMin1P2P2);
    assertTrue(Arrays.equals(new int[]{-256,-165,-239,976},clsUTMaxMin1P2P1));
    assertTrue(Arrays.equals(new int[]{-165,-256},clsUTMaxMin1P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin1[]
2)----->maxMin1[[661,149,884,2], 3]
 Covered Branches:[1, 2, 3, 4, 5, 6]
 */
  @Test public void TestCase1() throws Throwable {
    MaxMin1 clsUTMaxMin1=null;
      clsUTMaxMin1=new MaxMin1();
    int[] clsUTMaxMin1P2P1=new int[]{661,149,884,2};
    int clsUTMaxMin1P2P2=3;
    int[] clsUTMaxMin1P2R=null;
      clsUTMaxMin1P2R=MaxMin1.maxMin1(clsUTMaxMin1P2P1,clsUTMaxMin1P2P2);
    assertTrue(Arrays.equals(new int[]{661,149,884,2},clsUTMaxMin1P2P1));
    assertTrue(Arrays.equals(new int[]{884,149},clsUTMaxMin1P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin1[]
2)----->maxMin1[[-365], 1]
 Covered Branches:[1]
 */
  @Test public void TestCase2() throws Throwable {
    MaxMin1 clsUTMaxMin1=null;
      clsUTMaxMin1=new MaxMin1();
    int[] clsUTMaxMin1P2P1=new int[]{-365};
    int clsUTMaxMin1P2P2=1;
    int[] clsUTMaxMin1P2R=null;
      clsUTMaxMin1P2R=MaxMin1.maxMin1(clsUTMaxMin1P2P1,clsUTMaxMin1P2P2);
    assertTrue(Arrays.equals(new int[]{-365},clsUTMaxMin1P2P1));
    assertTrue(Arrays.equals(new int[]{-365,-365},clsUTMaxMin1P2R));
  }
}
