package ds.seed5838;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Ordenacao;
import java.util.Arrays;
/** 
 * This class was automatically generated to test the ds.Ordenacao class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5]
Uncovered branches: []
Total number of branches: 5
Total number of covered branches: 5
Coverage : 100%
Evaluations : 358
search time (ms): 383
total runtime (ms): 1516
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->ordena[[320,-874,-323], 2]
 Covered Branches:[1, 2, 3, 4]
 */
  @Test public void TestCase0() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int[] clsUTOrdenacaoP2P1=new int[]{320,-874,-323};
    int clsUTOrdenacaoP2P2=2;
      Ordenacao.ordena(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->ordena[[-511,836,-291], 2]
 Covered Branches:[1, 2, 3, 5]
 */
  @Test public void TestCase1() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int[] clsUTOrdenacaoP2P1=new int[]{-511,836,-291};
    int clsUTOrdenacaoP2P2=2;
      Ordenacao.ordena(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
    assertTrue(Arrays.equals(new int[]{-511,836,-291},clsUTOrdenacaoP2P1));
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->ordena[[-467,546], 0]
 Covered Branches:[1]
 */
  @Test public void TestCase2() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int[] clsUTOrdenacaoP2P1=new int[]{-467,546};
    int clsUTOrdenacaoP2P2=0;
      Ordenacao.ordena(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
    assertTrue(Arrays.equals(new int[]{-467,546},clsUTOrdenacaoP2P1));
  }
}
