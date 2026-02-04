package ds.seed6733;
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
Evaluations : 344
search time (ms): 452
total runtime (ms): 1863
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->ordena[[2,-661], 2]
 Covered Branches:[1, 2, 3, 4]
 */
  @Test public void TestCase0() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int[] clsUTOrdenacaoP2P1=new int[]{2,-661};
    int clsUTOrdenacaoP2P2=2;
      Ordenacao.ordena(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->ordena[[-267,-425,489], -192]
 Covered Branches:[1]
 */
  @Test public void TestCase1() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int[] clsUTOrdenacaoP2P1=new int[]{-267,-425,489};
    int clsUTOrdenacaoP2P2=-192;
      Ordenacao.ordena(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
    assertTrue(Arrays.equals(new int[]{-267,-425,489},clsUTOrdenacaoP2P1));
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->ordena[[-492,2], 2]
 Covered Branches:[1, 2, 3, 5]
 */
  @Test public void TestCase2() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int[] clsUTOrdenacaoP2P1=new int[]{-492,2};
    int clsUTOrdenacaoP2P2=2;
      Ordenacao.ordena(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
    assertTrue(Arrays.equals(new int[]{-492,2},clsUTOrdenacaoP2P1));
  }
}
