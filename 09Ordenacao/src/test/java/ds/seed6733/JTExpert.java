package ds.seed6733;
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
Evaluations : 39
search time (ms): 190
total runtime (ms): 1334
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->mergeSort[[], 413, -16]
 Covered Branches:[7, 9]
 */
  @Test public void TestCase0() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int[] clsUTOrdenacaoP2P1=new int[]{};
    int clsUTOrdenacaoP2P2=413;
    int clsUTOrdenacaoP2P3=-16;
      Ordenacao.mergeSort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2,clsUTOrdenacaoP2P3);
    assertTrue(Arrays.equals(new int[]{},clsUTOrdenacaoP2P1));
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->mergeSort[[425,-475,736,714], 0, 1]
 Covered Branches:[1, 2, 3, 5, 6, 7, 8, 9]
 */
  @Test public void TestCase1() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int[] clsUTOrdenacaoP2P1=new int[]{425,-475,736,714};
    int clsUTOrdenacaoP2P2=0;
    int clsUTOrdenacaoP2P3=1;
      Ordenacao.mergeSort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2,clsUTOrdenacaoP2P3);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->mergeSort[[350,-358,692], 1, 2]
 Covered Branches:[1, 2, 3, 4, 7, 8, 9]
 */
  @Test public void TestCase2() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int[] clsUTOrdenacaoP2P1=new int[]{350,-358,692};
    int clsUTOrdenacaoP2P2=1;
    int clsUTOrdenacaoP2P3=2;
      Ordenacao.mergeSort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2,clsUTOrdenacaoP2P3);
    assertTrue(Arrays.equals(new int[]{350,-358,692},clsUTOrdenacaoP2P1));
  }
}
