package ds.seed5831;
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
Evaluations : 738
search time (ms): 777
total runtime (ms): 2196
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->ordena[[], -707]
 Covered Branches:[1]
 */
  @Test public void TestCase0() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int[] clsUTOrdenacaoP2P1=new int[]{};
    int clsUTOrdenacaoP2P2=-707;
      Ordenacao.ordena(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
    assertTrue(Arrays.equals(new int[]{},clsUTOrdenacaoP2P1));
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->ordena[[710,-510,-418], 3]
 Covered Branches:[1, 2, 3, 4, 5]
 */
  @Test public void TestCase1() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int[] clsUTOrdenacaoP2P1=new int[]{710,-510,-418};
    int clsUTOrdenacaoP2P2=3;
      Ordenacao.ordena(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->ordena[[-732,-710], 2]
 Covered Branches:[1, 2, 3, 5]
 */
  @Test public void TestCase2() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int[] clsUTOrdenacaoP2P1=new int[]{-732,-710};
    int clsUTOrdenacaoP2P2=2;
      Ordenacao.ordena(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
    assertTrue(Arrays.equals(new int[]{-732,-710},clsUTOrdenacaoP2P1));
  }
}
