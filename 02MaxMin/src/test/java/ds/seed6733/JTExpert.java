package ds.seed6733;
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
Evaluations : 141
search time (ms): 237
total runtime (ms): 1424
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.MaxMin1[]
2)----->maxMin1[[-780,-180,636], 0]
 Covered Branches:[1]
 */
  @Test public void TestCase0() throws Throwable {
    MaxMin1 clsUTMaxMin1=null;
      clsUTMaxMin1=new MaxMin1();
    int[] clsUTMaxMin1P2P1=new int[]{-780,-180,636};
    int clsUTMaxMin1P2P2=0;
    int[] clsUTMaxMin1P2R=null;
      clsUTMaxMin1P2R=MaxMin1.maxMin1(clsUTMaxMin1P2P1,clsUTMaxMin1P2P2);
    assertTrue(Arrays.equals(new int[]{-780,-180,636},clsUTMaxMin1P2P1));
    assertTrue(Arrays.equals(new int[]{-780,-780},clsUTMaxMin1P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin1[]
2)----->maxMin1[[-809,-421,0], 3]
 Covered Branches:[1, 2, 3, 6]
 */
  @Test public void TestCase1() throws Throwable {
    MaxMin1 clsUTMaxMin1=null;
      clsUTMaxMin1=new MaxMin1();
    int[] clsUTMaxMin1P2P1=new int[]{-809,-421,0};
    int clsUTMaxMin1P2P2=3;
    int[] clsUTMaxMin1P2R=null;
      clsUTMaxMin1P2R=MaxMin1.maxMin1(clsUTMaxMin1P2P1,clsUTMaxMin1P2P2);
    assertTrue(Arrays.equals(new int[]{-809,-421,0},clsUTMaxMin1P2P1));
    assertTrue(Arrays.equals(new int[]{0,-809},clsUTMaxMin1P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin1[]
2)----->maxMin1[[-152,-937,151], 3]
 Covered Branches:[1, 2, 3, 4, 5, 6]
 */
  @Test public void TestCase2() throws Throwable {
    MaxMin1 clsUTMaxMin1=null;
      clsUTMaxMin1=new MaxMin1();
    int[] clsUTMaxMin1P2P1=new int[]{-152,-937,151};
    int clsUTMaxMin1P2P2=3;
    int[] clsUTMaxMin1P2R=null;
      clsUTMaxMin1P2R=MaxMin1.maxMin1(clsUTMaxMin1P2P1,clsUTMaxMin1P2P2);
    assertTrue(Arrays.equals(new int[]{-152,-937,151},clsUTMaxMin1P2P1));
    assertTrue(Arrays.equals(new int[]{151,-937},clsUTMaxMin1P2R));
  }
}
