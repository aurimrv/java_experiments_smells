package ds.seed7992;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.AvaliaMultMatrizes;
import java.util.Arrays;
/** 
 * This class was automatically generated to test the ds.AvaliaMultMatrizes class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6, 7]
Uncovered branches: []
Total number of branches: 7
Total number of covered branches: 7
Coverage : 100%
Evaluations : 1109
search time (ms): 1113
total runtime (ms): 2725
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.AvaliaMultMatrizes[]
2)----->multmatrize[2, [350,-30,350,22]]
 Covered Branches:[1, 2, 3, 4, 5, 6]
 */
  @Test public void TestCase0() throws Throwable {
    AvaliaMultMatrizes clsUTAvaliaMultMatrizes=null;
      clsUTAvaliaMultMatrizes=new AvaliaMultMatrizes();
    int clsUTAvaliaMultMatrizesP2P1=2;
    int[] clsUTAvaliaMultMatrizesP2P2=new int[]{350,-30,350,22};
      AvaliaMultMatrizes.multmatrize(clsUTAvaliaMultMatrizesP2P1,clsUTAvaliaMultMatrizesP2P2);
    assertTrue(Arrays.equals(new int[]{350,-30,350,22},clsUTAvaliaMultMatrizesP2P2));
  }
  /** 
 * Chromosome :
1)----->ds.AvaliaMultMatrizes[]
2)----->multmatrize[1, [-337,1,806]]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase1() throws Throwable {
    AvaliaMultMatrizes clsUTAvaliaMultMatrizes=null;
      clsUTAvaliaMultMatrizes=new AvaliaMultMatrizes();
    int clsUTAvaliaMultMatrizesP2P1=1;
    int[] clsUTAvaliaMultMatrizesP2P2=new int[]{-337,1,806};
      AvaliaMultMatrizes.multmatrize(clsUTAvaliaMultMatrizesP2P1,clsUTAvaliaMultMatrizesP2P2);
    assertTrue(Arrays.equals(new int[]{-337,1,806},clsUTAvaliaMultMatrizesP2P2));
  }
  /** 
 * Chromosome :
1)----->ds.AvaliaMultMatrizes[]
2)----->multmatrize[3, [529,170,0,-901]]
 Covered Branches:[1, 2, 3, 4, 5, 6, 7]
 */
  @Test public void TestCase2() throws Throwable {
    AvaliaMultMatrizes clsUTAvaliaMultMatrizes=null;
      clsUTAvaliaMultMatrizes=new AvaliaMultMatrizes();
    int clsUTAvaliaMultMatrizesP2P1=3;
    int[] clsUTAvaliaMultMatrizesP2P2=new int[]{529,170,0,-901};
      AvaliaMultMatrizes.multmatrize(clsUTAvaliaMultMatrizesP2P1,clsUTAvaliaMultMatrizesP2P2);
    assertTrue(Arrays.equals(new int[]{529,170,0,-901},clsUTAvaliaMultMatrizesP2P2));
  }
}
