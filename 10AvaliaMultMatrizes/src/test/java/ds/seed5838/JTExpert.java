package ds.seed5838;
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
Evaluations : 2570
search time (ms): 2081
total runtime (ms): 3556
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.AvaliaMultMatrizes[]
2)----->multmatrize[1, [837,-781]]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase0() throws Throwable {
    AvaliaMultMatrizes clsUTAvaliaMultMatrizes=null;
      clsUTAvaliaMultMatrizes=new AvaliaMultMatrizes();
    int clsUTAvaliaMultMatrizesP2P1=1;
    int[] clsUTAvaliaMultMatrizesP2P2=new int[]{837,-781};
      AvaliaMultMatrizes.multmatrize(clsUTAvaliaMultMatrizesP2P1,clsUTAvaliaMultMatrizesP2P2);
    assertTrue(Arrays.equals(new int[]{837,-781},clsUTAvaliaMultMatrizesP2P2));
  }
  /** 
 * Chromosome :
1)----->ds.AvaliaMultMatrizes[]
2)----->multmatrize[2, [-629,-689,-19,984]]
 Covered Branches:[1, 2, 3, 4, 5, 6]
 */
  @Test public void TestCase1() throws Throwable {
    AvaliaMultMatrizes clsUTAvaliaMultMatrizes=null;
      clsUTAvaliaMultMatrizes=new AvaliaMultMatrizes();
    int clsUTAvaliaMultMatrizesP2P1=2;
    int[] clsUTAvaliaMultMatrizesP2P2=new int[]{-629,-689,-19,984};
      AvaliaMultMatrizes.multmatrize(clsUTAvaliaMultMatrizesP2P1,clsUTAvaliaMultMatrizesP2P2);
    assertTrue(Arrays.equals(new int[]{-629,-689,-19,984},clsUTAvaliaMultMatrizesP2P2));
  }
  /** 
 * Chromosome :
1)----->ds.AvaliaMultMatrizes[]
2)----->multmatrize[3, [760,700,727,522]]
 Covered Branches:[1, 2, 3, 4, 5, 6, 7]
 */
  @Test public void TestCase2() throws Throwable {
    AvaliaMultMatrizes clsUTAvaliaMultMatrizes=null;
      clsUTAvaliaMultMatrizes=new AvaliaMultMatrizes();
    int clsUTAvaliaMultMatrizesP2P1=3;
    int[] clsUTAvaliaMultMatrizesP2P2=new int[]{760,700,727,522};
      AvaliaMultMatrizes.multmatrize(clsUTAvaliaMultMatrizesP2P1,clsUTAvaliaMultMatrizesP2P2);
    assertTrue(Arrays.equals(new int[]{760,700,727,522},clsUTAvaliaMultMatrizesP2P2));
  }
}
