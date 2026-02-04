package ds.seed5482;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Ordenacao;
import java.util.Arrays;
/** 
 * This class was automatically generated to test the ds.Ordenacao class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6, 7, 8, 9]
Uncovered branches: []
Total number of branches: 9
Total number of covered branches: 9
Coverage : 100%
Evaluations : 55
search time (ms): 259
total runtime (ms): 1768
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->mergeSort[[885,809], -220, -966]
 Covered Branches:[7, 9]
 */
  @Test public void TestCase0() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int[] clsUTOrdenacaoP2P1=new int[]{885,809};
    int clsUTOrdenacaoP2P2=-220;
    int clsUTOrdenacaoP2P3=-966;
      Ordenacao.mergeSort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2,clsUTOrdenacaoP2P3);
    assertTrue(Arrays.equals(new int[]{885,809},clsUTOrdenacaoP2P1));
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->mergeSort[[862,184,-125,812], 0, 1]
 Covered Branches:[1, 2, 3, 5, 6, 7, 8, 9]
 */
  @Test public void TestCase1() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int[] clsUTOrdenacaoP2P1=new int[]{862,184,-125,812};
    int clsUTOrdenacaoP2P2=0;
    int clsUTOrdenacaoP2P3=1;
      Ordenacao.mergeSort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2,clsUTOrdenacaoP2P3);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->mergeSort[[-169,2,-640,-160], 0, 1]
 Covered Branches:[1, 2, 3, 4, 7, 8, 9]
 */
  @Test public void TestCase2() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int[] clsUTOrdenacaoP2P1=new int[]{-169,2,-640,-160};
    int clsUTOrdenacaoP2P2=0;
    int clsUTOrdenacaoP2P3=1;
      Ordenacao.mergeSort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2,clsUTOrdenacaoP2P3);
    assertTrue(Arrays.equals(new int[]{-169,2,-640,-160},clsUTOrdenacaoP2P1));
  }
}
