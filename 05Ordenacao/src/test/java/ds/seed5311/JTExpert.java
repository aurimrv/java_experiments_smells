package ds.seed5311;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import java.util.Arrays;
import ds.Ordenacao;
/** 
 * This class was automatically generated to test the ds.Ordenacao class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5]
Uncovered branches: []
Total number of branches: 5
Total number of covered branches: 5
Coverage : 100%
Evaluations : 151
search time (ms): 231
total runtime (ms): 1383
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->ordena[[-1,52,2], 2]
 Covered Branches:[1, 2, 3, 5]
 */
  @Test public void TestCase0() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int[] clsUTOrdenacaoP2P1=new int[]{-1,52,2};
    int clsUTOrdenacaoP2P2=2;
      Ordenacao.ordena(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
    assertTrue(Arrays.equals(new int[]{-1,52,2},clsUTOrdenacaoP2P1));
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->ordena[[-528,-755,-455,197], 2]
 Covered Branches:[1, 2, 3, 4]
 */
  @Test public void TestCase1() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int[] clsUTOrdenacaoP2P1=new int[]{-528,-755,-455,197};
    int clsUTOrdenacaoP2P2=2;
      Ordenacao.ordena(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->ordena[[-661,353,-386], -171]
 Covered Branches:[1]
 */
  @Test public void TestCase2() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int[] clsUTOrdenacaoP2P1=new int[]{-661,353,-386};
    int clsUTOrdenacaoP2P2=-171;
      Ordenacao.ordena(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
    assertTrue(Arrays.equals(new int[]{-661,353,-386},clsUTOrdenacaoP2P1));
  }
}
