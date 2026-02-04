package ds.seed9121;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import java.util.Arrays;
import ds.Ordenacao;
/** 
 * This class was automatically generated to test the ds.Ordenacao class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6, 7, 8, 9]
Uncovered branches: []
Total number of branches: 9
Total number of covered branches: 9
Coverage : 100%
Evaluations : 22
search time (ms): 182
total runtime (ms): 1710
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->mergeSort[[], 2, -744]
 Covered Branches:[7, 9]
 */
  @Test public void TestCase0() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P2=2;
    int clsUTOrdenacaoP2P3=-744;
      Ordenacao.mergeSort((int[])null,clsUTOrdenacaoP2P2,clsUTOrdenacaoP2P3);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->mergeSort[[143,-964,683,950], 0, 2]
 Covered Branches:[1, 2, 3, 4, 5, 6, 7, 8, 9]
 */
  @Test public void TestCase1() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int[] clsUTOrdenacaoP2P1=new int[]{143,-964,683,950};
    int clsUTOrdenacaoP2P2=0;
    int clsUTOrdenacaoP2P3=2;
      Ordenacao.mergeSort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2,clsUTOrdenacaoP2P3);
  }
}
