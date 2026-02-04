package ds.seed6733;
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
Evaluations : 12078
search time (ms): 5399
total runtime (ms): 6616
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.AvaliaMultMatrizes[]
2)----->multmatrize[2, [132,-944,900]]
 Covered Branches:[1, 2, 3, 4, 5, 6]
 */
  @Test public void TestCase0() throws Throwable {
    AvaliaMultMatrizes clsUTAvaliaMultMatrizes=null;
      clsUTAvaliaMultMatrizes=new AvaliaMultMatrizes();
    int clsUTAvaliaMultMatrizesP2P1=2;
    int[] clsUTAvaliaMultMatrizesP2P2=new int[]{132,-944,900};
      AvaliaMultMatrizes.multmatrize(clsUTAvaliaMultMatrizesP2P1,clsUTAvaliaMultMatrizesP2P2);
    assertTrue(Arrays.equals(new int[]{132,-944,900},clsUTAvaliaMultMatrizesP2P2));
  }
  /** 
 * Chromosome :
1)----->ds.AvaliaMultMatrizes[]
2)----->multmatrize[3, [-880,-139,723,-38]]
 Covered Branches:[1, 2, 3, 4, 5, 6, 7]
 */
  @Test public void TestCase1() throws Throwable {
    AvaliaMultMatrizes clsUTAvaliaMultMatrizes=null;
      clsUTAvaliaMultMatrizes=new AvaliaMultMatrizes();
    int clsUTAvaliaMultMatrizesP2P1=3;
    int[] clsUTAvaliaMultMatrizesP2P2=new int[]{-880,-139,723,-38};
      AvaliaMultMatrizes.multmatrize(clsUTAvaliaMultMatrizesP2P1,clsUTAvaliaMultMatrizesP2P2);
    assertTrue(Arrays.equals(new int[]{-880,-139,723,-38},clsUTAvaliaMultMatrizesP2P2));
  }
}
