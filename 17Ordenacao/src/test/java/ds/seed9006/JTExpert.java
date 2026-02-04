package ds.seed9006;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.MeuItem;
import ds.Item;
import ds.Ordenacao;
/** 
 * This class was automatically generated to test the ds.Ordenacao class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29]
Uncovered branches: []
Total number of branches: 29
Total number of covered branches: 29
Coverage : 100%
Evaluations : 2952
search time (ms): 2818
total runtime (ms): 4428
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->quicksort[[ds.MeuItem[966],ds.MeuItem[-440],ds.MeuItem[941],ds.MeuItem[909]], 3]
 Covered Branches:[1, 2, 3, 4, 5, 7, 8, 9, 27, 11]
 */
  @Test public void TestCase0() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=966;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=-440;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=941;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    int clsUTOrdenacaoP2P1P4P1=909;
    Item clsUTOrdenacaoP2P1P4=null;
      clsUTOrdenacaoP2P1P4=new MeuItem(clsUTOrdenacaoP2P1P4P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3,clsUTOrdenacaoP2P1P4};
    int clsUTOrdenacaoP2P2=3;
      Ordenacao.quicksort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->quicksort[[ds.MeuItem[-840],ds.MeuItem[-154]], 0]
 Covered Branches:[1, 2, 6, 7, 9, 27, 11]
 */
  @Test public void TestCase1() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=-840;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=-154;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2};
    int clsUTOrdenacaoP2P2=0;
      Ordenacao.quicksort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->quicksort[[null,ds.MeuItem[148]], 1]
 Covered Branches:[1, 2, 5, 7, 9, 27, 11]
 */
  @Test public void TestCase2() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    Item clsUTOrdenacaoP2P1P1=null;
    int clsUTOrdenacaoP2P1P2P1=148;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2};
    int clsUTOrdenacaoP2P2=1;
      Ordenacao.quicksort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->selecao[[ds.MeuItem[2],ds.MeuItem[34],ds.MeuItem[-938]], 2]
 Covered Branches:[12, 13, 14, 15]
 */
  @Test public void TestCase3() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=2;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=34;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=-938;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3};
    int clsUTOrdenacaoP2P2=2;
      Ordenacao.selecao(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->heapsort[[ds.MeuItem[-675],ds.MeuItem[780],ds.MeuItem[559],ds.MeuItem[1]], 2]
 Covered Branches:[28, 29]
 */
  @Test public void TestCase4() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=-675;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=780;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=559;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    int clsUTOrdenacaoP2P1P4P1=1;
    Item clsUTOrdenacaoP2P1P4=null;
      clsUTOrdenacaoP2P1P4=new MeuItem(clsUTOrdenacaoP2P1P4P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3,clsUTOrdenacaoP2P1P4};
    int clsUTOrdenacaoP2P2=2;
      Ordenacao.heapsort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->shellsort[[ds.MeuItem[-662],ds.MeuItem[50],ds.MeuItem[39]], 2]
 Covered Branches:[20, 21, 22, 23, 24, 25]
 */
  @Test public void TestCase5() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=-662;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=50;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=39;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3};
    int clsUTOrdenacaoP2P2=2;
      Ordenacao.shellsort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->selecao[[ds.MeuItem[-190],ds.MeuItem[-934]], -443]
 Covered Branches:[12]
 */
  @Test public void TestCase6() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=-190;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=-934;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2};
    int clsUTOrdenacaoP2P2=-443;
      Ordenacao.selecao(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->insercao[[ds.MeuItem[-434],ds.MeuItem[888],ds.MeuItem[-62]], 2]
 Covered Branches:[17, 18, 19]
 */
  @Test public void TestCase7() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=-434;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=888;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=-62;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3};
    int clsUTOrdenacaoP2P2=2;
      Ordenacao.insercao(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->quicksort[[ds.MeuItem[324],ds.MeuItem[-405],ds.MeuItem[-470],ds.MeuItem[-9]], 3]
 Covered Branches:[1, 2, 4, 5, 7, 9, 10, 27, 11]
 */
  @Test public void TestCase8() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=324;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=-405;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=-470;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    int clsUTOrdenacaoP2P1P4P1=-9;
    Item clsUTOrdenacaoP2P1P4=null;
      clsUTOrdenacaoP2P1P4=new MeuItem(clsUTOrdenacaoP2P1P4P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3,clsUTOrdenacaoP2P1P4};
    int clsUTOrdenacaoP2P2=3;
      Ordenacao.quicksort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->insercao[[null,ds.MeuItem[-358],ds.MeuItem[133]], 2]
 Covered Branches:[17, 18]
 */
  @Test public void TestCase9() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    Item clsUTOrdenacaoP2P1P1=null;
    int clsUTOrdenacaoP2P1P2P1=-358;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=133;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3};
    int clsUTOrdenacaoP2P2=2;
      Ordenacao.insercao(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->quicksort[[ds.MeuItem[-427],ds.MeuItem[-618],ds.MeuItem[960]], 0]
 Covered Branches:[1, 2, 3, 6, 7, 9, 27, 11]
 */
  @Test public void TestCase10() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=-427;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=-618;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=960;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3};
    int clsUTOrdenacaoP2P2=0;
      Ordenacao.quicksort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->insercao[[], -574]
 Covered Branches:[17]
 */
  @Test public void TestCase11() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    Item[] clsUTOrdenacaoP2P1=new Item[]{};
    int clsUTOrdenacaoP2P2=-574;
      Ordenacao.insercao(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->shellsort[[ds.MeuItem[779],ds.MeuItem[-370],ds.MeuItem[3],ds.MeuItem[-192]], 3]
 Covered Branches:[20, 21, 22, 23, 24, 26]
 */
  @Test public void TestCase12() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=779;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=-370;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=3;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    int clsUTOrdenacaoP2P1P4P1=-192;
    Item clsUTOrdenacaoP2P1P4=null;
      clsUTOrdenacaoP2P1P4=new MeuItem(clsUTOrdenacaoP2P1P4P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3,clsUTOrdenacaoP2P1P4};
    int clsUTOrdenacaoP2P2=3;
      Ordenacao.shellsort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->selecao[[ds.MeuItem[-237],ds.MeuItem[-793],ds.MeuItem[69],ds.MeuItem[79]], 2]
 Covered Branches:[16, 12, 13, 14]
 */
  @Test public void TestCase13() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=-237;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=-793;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=69;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    int clsUTOrdenacaoP2P1P4P1=79;
    Item clsUTOrdenacaoP2P1P4=null;
      clsUTOrdenacaoP2P1P4=new MeuItem(clsUTOrdenacaoP2P1P4P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3,clsUTOrdenacaoP2P1P4};
    int clsUTOrdenacaoP2P2=2;
      Ordenacao.selecao(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->heapsort[[ds.MeuItem[395],ds.MeuItem[2],ds.MeuItem[910],ds.MeuItem[293]], -762]
 Covered Branches:[28]
 */
  @Test public void TestCase14() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=395;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=2;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=910;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    int clsUTOrdenacaoP2P1P4P1=293;
    Item clsUTOrdenacaoP2P1P4=null;
      clsUTOrdenacaoP2P1P4=new MeuItem(clsUTOrdenacaoP2P1P4P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3,clsUTOrdenacaoP2P1P4};
    int clsUTOrdenacaoP2P2=-762;
      Ordenacao.heapsort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->shellsort[[ds.MeuItem[0],ds.MeuItem[-315],ds.MeuItem[22],ds.MeuItem[2]], -519]
 Covered Branches:[20, 21, 22]
 */
  @Test public void TestCase15() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=0;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=-315;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=22;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    int clsUTOrdenacaoP2P1P4P1=2;
    Item clsUTOrdenacaoP2P1P4=null;
      clsUTOrdenacaoP2P1P4=new MeuItem(clsUTOrdenacaoP2P1P4P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3,clsUTOrdenacaoP2P1P4};
    int clsUTOrdenacaoP2P2=-519;
      Ordenacao.shellsort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
}
