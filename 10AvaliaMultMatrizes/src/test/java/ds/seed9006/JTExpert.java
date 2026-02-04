package ds.seed9006;
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
Evaluations : 59568
search time (ms): 20849
total runtime (ms): 22080
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.AvaliaMultMatrizes[]
2)----->multmatrize[0, []]
 Covered Branches:[1]
 */
  @Test public void TestCase0() throws Throwable {
    AvaliaMultMatrizes clsUTAvaliaMultMatrizes=null;
      clsUTAvaliaMultMatrizes=new AvaliaMultMatrizes();
    int clsUTAvaliaMultMatrizesP2P1=0;
    int[] clsUTAvaliaMultMatrizesP2P2=new int[]{};
      AvaliaMultMatrizes.multmatrize(clsUTAvaliaMultMatrizesP2P1,clsUTAvaliaMultMatrizesP2P2);
    assertTrue(Arrays.equals(new int[]{},clsUTAvaliaMultMatrizesP2P2));
  }
  /** 
 * Chromosome :
1)----->ds.AvaliaMultMatrizes[]
2)----->multmatrize[2, [-794,-890,416]]
 Covered Branches:[1, 2, 3, 4, 5, 6]
 */
  @Test public void TestCase1() throws Throwable {
    AvaliaMultMatrizes clsUTAvaliaMultMatrizes=null;
      clsUTAvaliaMultMatrizes=new AvaliaMultMatrizes();
    int clsUTAvaliaMultMatrizesP2P1=2;
    int[] clsUTAvaliaMultMatrizesP2P2=new int[]{-794,-890,416};
      AvaliaMultMatrizes.multmatrize(clsUTAvaliaMultMatrizesP2P1,clsUTAvaliaMultMatrizesP2P2);
    assertTrue(Arrays.equals(new int[]{-794,-890,416},clsUTAvaliaMultMatrizesP2P2));
  }
  /** 
 * Chromosome :
1)----->ds.AvaliaMultMatrizes[]
2)----->multmatrize[3, [763,4,-199,-309]]
 Covered Branches:[1, 2, 3, 4, 5, 6, 7]
 */
  @Test public void TestCase2() throws Throwable {
    AvaliaMultMatrizes clsUTAvaliaMultMatrizes=null;
      clsUTAvaliaMultMatrizes=new AvaliaMultMatrizes();
    int clsUTAvaliaMultMatrizesP2P1=3;
    int[] clsUTAvaliaMultMatrizesP2P2=new int[]{763,4,-199,-309};
      AvaliaMultMatrizes.multmatrize(clsUTAvaliaMultMatrizesP2P1,clsUTAvaliaMultMatrizesP2P2);
    assertTrue(Arrays.equals(new int[]{763,4,-199,-309},clsUTAvaliaMultMatrizesP2P2));
  }
  /** 
 * Chromosome :
1)----->ds.AvaliaMultMatrizes[]
2)----->multmatrize[1, [305]]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase3() throws Throwable {
    AvaliaMultMatrizes clsUTAvaliaMultMatrizes=null;
      clsUTAvaliaMultMatrizes=new AvaliaMultMatrizes();
    int clsUTAvaliaMultMatrizesP2P1=1;
    int[] clsUTAvaliaMultMatrizesP2P2=new int[]{305};
      AvaliaMultMatrizes.multmatrize(clsUTAvaliaMultMatrizesP2P1,clsUTAvaliaMultMatrizesP2P2);
    assertTrue(Arrays.equals(new int[]{305},clsUTAvaliaMultMatrizesP2P2));
  }
}
