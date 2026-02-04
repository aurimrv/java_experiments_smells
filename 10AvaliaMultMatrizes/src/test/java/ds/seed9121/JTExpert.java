package ds.seed9121;
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
Evaluations : 1261
search time (ms): 1460
total runtime (ms): 3062
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.AvaliaMultMatrizes[]
2)----->multmatrize[2, [-226,88,191,-238]]
 Covered Branches:[1, 2, 3, 4, 5, 6]
 */
  @Test public void TestCase0() throws Throwable {
    AvaliaMultMatrizes clsUTAvaliaMultMatrizes=null;
      clsUTAvaliaMultMatrizes=new AvaliaMultMatrizes();
    int clsUTAvaliaMultMatrizesP2P1=2;
    int[] clsUTAvaliaMultMatrizesP2P2=new int[]{-226,88,191,-238};
      AvaliaMultMatrizes.multmatrize(clsUTAvaliaMultMatrizesP2P1,clsUTAvaliaMultMatrizesP2P2);
    assertTrue(Arrays.equals(new int[]{-226,88,191,-238},clsUTAvaliaMultMatrizesP2P2));
  }
  /** 
 * Chromosome :
1)----->ds.AvaliaMultMatrizes[]
2)----->multmatrize[1, [1,755]]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase1() throws Throwable {
    AvaliaMultMatrizes clsUTAvaliaMultMatrizes=null;
      clsUTAvaliaMultMatrizes=new AvaliaMultMatrizes();
    int clsUTAvaliaMultMatrizesP2P1=1;
    int[] clsUTAvaliaMultMatrizesP2P2=new int[]{1,755};
      AvaliaMultMatrizes.multmatrize(clsUTAvaliaMultMatrizesP2P1,clsUTAvaliaMultMatrizesP2P2);
    assertTrue(Arrays.equals(new int[]{1,755},clsUTAvaliaMultMatrizesP2P2));
  }
  /** 
 * Chromosome :
1)----->ds.AvaliaMultMatrizes[]
2)----->multmatrize[3, [-512,591,-590,-158]]
 Covered Branches:[1, 2, 3, 4, 5, 6, 7]
 */
  @Test public void TestCase2() throws Throwable {
    AvaliaMultMatrizes clsUTAvaliaMultMatrizes=null;
      clsUTAvaliaMultMatrizes=new AvaliaMultMatrizes();
    int clsUTAvaliaMultMatrizesP2P1=3;
    int[] clsUTAvaliaMultMatrizesP2P2=new int[]{-512,591,-590,-158};
      AvaliaMultMatrizes.multmatrize(clsUTAvaliaMultMatrizesP2P1,clsUTAvaliaMultMatrizesP2P2);
    assertTrue(Arrays.equals(new int[]{-512,591,-590,-158},clsUTAvaliaMultMatrizesP2P2));
  }
}
