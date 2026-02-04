package ds.seed7992;
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
Evaluations : 182
search time (ms): 254
total runtime (ms): 1402
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->ordena[[388,167,-612,-143], 2]
 Covered Branches:[1, 2, 3, 4]
 */
  @Test public void TestCase0() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int[] clsUTOrdenacaoP2P1=new int[]{388,167,-612,-143};
    int clsUTOrdenacaoP2P2=2;
      Ordenacao.ordena(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->ordena[[0,-757,372], -996]
 Covered Branches:[1]
 */
  @Test public void TestCase1() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int[] clsUTOrdenacaoP2P1=new int[]{0,-757,372};
    int clsUTOrdenacaoP2P2=-996;
      Ordenacao.ordena(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
    assertTrue(Arrays.equals(new int[]{0,-757,372},clsUTOrdenacaoP2P1));
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->ordena[[597,702], 2]
 Covered Branches:[1, 2, 3, 5]
 */
  @Test public void TestCase2() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int[] clsUTOrdenacaoP2P1=new int[]{597,702};
    int clsUTOrdenacaoP2P2=2;
      Ordenacao.ordena(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
    assertTrue(Arrays.equals(new int[]{597,702},clsUTOrdenacaoP2P1));
  }
}
