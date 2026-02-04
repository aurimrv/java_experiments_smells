package ds.seed1448;
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
Evaluations : 6935
search time (ms): 3323
total runtime (ms): 4464
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.MaxMin4[]
2)----->maxMin4[[1,27,-193,203], 0, 2]
 Covered Branches:[1, 2, 3, 4, 5, 6, 9]
 */
  @Test public void TestCase0() throws Throwable {
    MaxMin4 clsUTMaxMin4=null;
      clsUTMaxMin4=new MaxMin4();
    int[] clsUTMaxMin4P2P1=new int[]{1,27,-193,203};
    int clsUTMaxMin4P2P2=0;
    int clsUTMaxMin4P2P3=2;
    int[] clsUTMaxMin4P2R=null;
      clsUTMaxMin4P2R=MaxMin4.maxMin4(clsUTMaxMin4P2P1,clsUTMaxMin4P2P2,clsUTMaxMin4P2P3);
    assertTrue(Arrays.equals(new int[]{1,27,-193,203},clsUTMaxMin4P2P1));
    assertTrue(Arrays.equals(new int[]{27,-193},clsUTMaxMin4P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin4[]
2)----->maxMin4[[1,235,-700,1], 1, 1]
 Covered Branches:[1, 2, 5]
 */
  @Test public void TestCase1() throws Throwable {
    MaxMin4 clsUTMaxMin4=null;
      clsUTMaxMin4=new MaxMin4();
    int[] clsUTMaxMin4P2P1=new int[]{1,235,-700,1};
    int clsUTMaxMin4P2P2=1;
    int clsUTMaxMin4P2P3=1;
    int[] clsUTMaxMin4P2R=null;
      clsUTMaxMin4P2R=MaxMin4.maxMin4(clsUTMaxMin4P2P1,clsUTMaxMin4P2P2,clsUTMaxMin4P2P3);
    assertTrue(Arrays.equals(new int[]{1,235,-700,1},clsUTMaxMin4P2P1));
    assertTrue(Arrays.equals(new int[]{235,235},clsUTMaxMin4P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin4[]
2)----->maxMin4[[154,-893,947], 0, 2]
 Covered Branches:[1, 2, 3, 5, 7, 8]
 */
  @Test public void TestCase2() throws Throwable {
    MaxMin4 clsUTMaxMin4=null;
      clsUTMaxMin4=new MaxMin4();
    int[] clsUTMaxMin4P2P1=new int[]{154,-893,947};
    int clsUTMaxMin4P2P2=0;
    int clsUTMaxMin4P2P3=2;
    int[] clsUTMaxMin4P2R=null;
      clsUTMaxMin4P2R=MaxMin4.maxMin4(clsUTMaxMin4P2P1,clsUTMaxMin4P2P2,clsUTMaxMin4P2P3);
    assertTrue(Arrays.equals(new int[]{154,-893,947},clsUTMaxMin4P2P1));
    assertTrue(Arrays.equals(new int[]{947,-893},clsUTMaxMin4P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin4[]
2)----->maxMin4[[975,-424,166,1], 0, 2]
 Covered Branches:[1, 2, 3, 5, 6, 8]
 */
  @Test public void TestCase3() throws Throwable {
    MaxMin4 clsUTMaxMin4=null;
      clsUTMaxMin4=new MaxMin4();
    int[] clsUTMaxMin4P2P1=new int[]{975,-424,166,1};
    int clsUTMaxMin4P2P2=0;
    int clsUTMaxMin4P2P3=2;
    int[] clsUTMaxMin4P2R=null;
      clsUTMaxMin4P2R=MaxMin4.maxMin4(clsUTMaxMin4P2P1,clsUTMaxMin4P2P2,clsUTMaxMin4P2P3);
    assertTrue(Arrays.equals(new int[]{975,-424,166,1},clsUTMaxMin4P2P1));
    assertTrue(Arrays.equals(new int[]{975,-424},clsUTMaxMin4P2R));
  }
  /** 
 * Chromosome :
1)----->ds.MaxMin4[]
2)----->maxMin4[[113,-466], 1, 0]
 Covered Branches:[1, 2, 4]
 */
  @Test public void TestCase4() throws Throwable {
    MaxMin4 clsUTMaxMin4=null;
      clsUTMaxMin4=new MaxMin4();
    int[] clsUTMaxMin4P2P1=new int[]{113,-466};
    int clsUTMaxMin4P2P2=1;
    int clsUTMaxMin4P2P3=0;
    int[] clsUTMaxMin4P2R=null;
      clsUTMaxMin4P2R=MaxMin4.maxMin4(clsUTMaxMin4P2P1,clsUTMaxMin4P2P2,clsUTMaxMin4P2P3);
    assertTrue(Arrays.equals(new int[]{113,-466},clsUTMaxMin4P2P1));
    assertTrue(Arrays.equals(new int[]{113,-466},clsUTMaxMin4P2R));
  }
}
