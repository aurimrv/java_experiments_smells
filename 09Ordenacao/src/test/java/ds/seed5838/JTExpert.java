package ds.seed5838;
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
Evaluations : 679
search time (ms): 1121
total runtime (ms): 2297
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->mergeSort[[374,2,-550,-809], 1, 2]
 Covered Branches:[1, 2, 3, 5, 6, 7, 8, 9]
 */
  @Test public void TestCase0() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int[] clsUTOrdenacaoP2P1=new int[]{374,2,-550,-809};
    int clsUTOrdenacaoP2P2=1;
    int clsUTOrdenacaoP2P3=2;
      Ordenacao.mergeSort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2,clsUTOrdenacaoP2P3);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->mergeSort[[299], -104, -638]
 Covered Branches:[7, 9]
 */
  @Test public void TestCase1() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int[] clsUTOrdenacaoP2P1=new int[]{299};
    int clsUTOrdenacaoP2P2=-104;
    int clsUTOrdenacaoP2P3=-638;
      Ordenacao.mergeSort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2,clsUTOrdenacaoP2P3);
    assertTrue(Arrays.equals(new int[]{299},clsUTOrdenacaoP2P1));
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->mergeSort[[373,209,898,-322], 0, 2]
 Covered Branches:[1, 2, 3, 4, 5, 6, 7, 8, 9]
 */
  @Test public void TestCase2() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int[] clsUTOrdenacaoP2P1=new int[]{373,209,898,-322};
    int clsUTOrdenacaoP2P2=0;
    int clsUTOrdenacaoP2P3=2;
      Ordenacao.mergeSort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2,clsUTOrdenacaoP2P3);
  }
}
