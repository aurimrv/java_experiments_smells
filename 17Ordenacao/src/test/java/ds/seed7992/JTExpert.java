package ds.seed7992;
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
Evaluations : 3135
search time (ms): 3007
total runtime (ms): 4686
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->quicksort[[ds.MeuItem[-471],ds.MeuItem[-157],ds.MeuItem[1]], 1]
 Covered Branches:[1, 2, 5, 7, 9, 27, 11]
 */
  @Test public void TestCase0() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=-471;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=-157;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=1;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3};
    int clsUTOrdenacaoP2P2=1;
      Ordenacao.quicksort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->quicksort[[ds.MeuItem[2],ds.MeuItem[623],ds.MeuItem[1],ds.MeuItem[52]], 3]
 Covered Branches:[1, 2, 4, 5, 7, 9, 10, 27, 11]
 */
  @Test public void TestCase1() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=2;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=623;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=1;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    int clsUTOrdenacaoP2P1P4P1=52;
    Item clsUTOrdenacaoP2P1P4=null;
      clsUTOrdenacaoP2P1P4=new MeuItem(clsUTOrdenacaoP2P1P4P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3,clsUTOrdenacaoP2P1P4};
    int clsUTOrdenacaoP2P2=3;
      Ordenacao.quicksort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->heapsort[[null,ds.MeuItem[-136],ds.MeuItem[-452]], -759]
 Covered Branches:[28]
 */
  @Test public void TestCase2() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    Item clsUTOrdenacaoP2P1P1=null;
    int clsUTOrdenacaoP2P1P2P1=-136;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=-452;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3};
    int clsUTOrdenacaoP2P2=-759;
      Ordenacao.heapsort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->selecao[[ds.MeuItem[-279],ds.MeuItem[-299],ds.MeuItem[-541]], 2]
 Covered Branches:[12, 13, 14, 15]
 */
  @Test public void TestCase3() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=-279;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=-299;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=-541;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3};
    int clsUTOrdenacaoP2P2=2;
      Ordenacao.selecao(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->selecao[[], -1]
 Covered Branches:[12]
 */
  @Test public void TestCase4() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    Item[] clsUTOrdenacaoP2P1=new Item[]{};
    int clsUTOrdenacaoP2P2=-1;
      Ordenacao.selecao(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->shellsort[[ds.MeuItem[-803],ds.MeuItem[749],ds.MeuItem[-802]], -1]
 Covered Branches:[20, 21, 22]
 */
  @Test public void TestCase5() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=-803;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=749;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=-802;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3};
    int clsUTOrdenacaoP2P2=-1;
      Ordenacao.shellsort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->heapsort[[ds.MeuItem[-930],ds.MeuItem[-677],ds.MeuItem[270]], 2]
 Covered Branches:[28, 29]
 */
  @Test public void TestCase6() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=-930;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=-677;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=270;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3};
    int clsUTOrdenacaoP2P2=2;
      Ordenacao.heapsort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->quicksort[[ds.MeuItem[-192],ds.MeuItem[-471],ds.MeuItem[4]], 0]
 Covered Branches:[1, 2, 3, 6, 7, 9, 27, 11]
 */
  @Test public void TestCase7() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=-192;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=-471;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=4;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3};
    int clsUTOrdenacaoP2P2=0;
      Ordenacao.quicksort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->selecao[[ds.MeuItem[3],ds.MeuItem[-119],ds.MeuItem[807]], 2]
 Covered Branches:[16, 12, 13, 14]
 */
  @Test public void TestCase8() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=3;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=-119;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=807;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3};
    int clsUTOrdenacaoP2P2=2;
      Ordenacao.selecao(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->insercao[[ds.MeuItem[-322]], -244]
 Covered Branches:[17]
 */
  @Test public void TestCase9() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=-322;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1};
    int clsUTOrdenacaoP2P2=-244;
      Ordenacao.insercao(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->insercao[[ds.MeuItem[2],ds.MeuItem[-75],ds.MeuItem[773]], 2]
 Covered Branches:[17, 18]
 */
  @Test public void TestCase10() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=2;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=-75;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=773;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3};
    int clsUTOrdenacaoP2P2=2;
      Ordenacao.insercao(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->shellsort[[ds.MeuItem[-790],ds.MeuItem[936],ds.MeuItem[904],ds.MeuItem[-825]], 2]
 Covered Branches:[20, 21, 22, 23, 24, 25]
 */
  @Test public void TestCase11() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=-790;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=936;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=904;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    int clsUTOrdenacaoP2P1P4P1=-825;
    Item clsUTOrdenacaoP2P1P4=null;
      clsUTOrdenacaoP2P1P4=new MeuItem(clsUTOrdenacaoP2P1P4P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3,clsUTOrdenacaoP2P1P4};
    int clsUTOrdenacaoP2P2=2;
      Ordenacao.shellsort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->quicksort[[ds.MeuItem[1],ds.MeuItem[117],ds.MeuItem[-803]], 0]
 Covered Branches:[1, 2, 6, 7, 9, 27, 11]
 */
  @Test public void TestCase12() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=1;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=117;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=-803;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3};
    int clsUTOrdenacaoP2P2=0;
      Ordenacao.quicksort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->insercao[[ds.MeuItem[661],ds.MeuItem[328],ds.MeuItem[631],ds.MeuItem[80]], 3]
 Covered Branches:[17, 18, 19]
 */
  @Test public void TestCase13() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=661;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=328;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=631;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    int clsUTOrdenacaoP2P1P4P1=80;
    Item clsUTOrdenacaoP2P1P4=null;
      clsUTOrdenacaoP2P1P4=new MeuItem(clsUTOrdenacaoP2P1P4P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3,clsUTOrdenacaoP2P1P4};
    int clsUTOrdenacaoP2P2=3;
      Ordenacao.insercao(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->quicksort[[ds.MeuItem[-506],ds.MeuItem[-72],ds.MeuItem[391],ds.MeuItem[-173]], 3]
 Covered Branches:[1, 2, 3, 5, 7, 8, 9, 27, 11]
 */
  @Test public void TestCase14() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=-506;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=-72;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=391;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    int clsUTOrdenacaoP2P1P4P1=-173;
    Item clsUTOrdenacaoP2P1P4=null;
      clsUTOrdenacaoP2P1P4=new MeuItem(clsUTOrdenacaoP2P1P4P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3,clsUTOrdenacaoP2P1P4};
    int clsUTOrdenacaoP2P2=3;
      Ordenacao.quicksort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->shellsort[[ds.MeuItem[-882],ds.MeuItem[-634],ds.MeuItem[283],ds.MeuItem[-157]], 2]
 Covered Branches:[20, 21, 22, 23]
 */
  @Test public void TestCase15() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=-882;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=-634;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=283;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    int clsUTOrdenacaoP2P1P4P1=-157;
    Item clsUTOrdenacaoP2P1P4=null;
      clsUTOrdenacaoP2P1P4=new MeuItem(clsUTOrdenacaoP2P1P4P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3,clsUTOrdenacaoP2P1P4};
    int clsUTOrdenacaoP2P2=2;
      Ordenacao.shellsort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->quicksort[[ds.MeuItem[-794],ds.MeuItem[-655],ds.MeuItem[3],ds.MeuItem[0]], 2]
 Covered Branches:[1, 2, 4, 5, 7, 9, 27, 11]
 */
  @Test public void TestCase16() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=-794;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=-655;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=3;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    int clsUTOrdenacaoP2P1P4P1=0;
    Item clsUTOrdenacaoP2P1P4=null;
      clsUTOrdenacaoP2P1P4=new MeuItem(clsUTOrdenacaoP2P1P4P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3,clsUTOrdenacaoP2P1P4};
    int clsUTOrdenacaoP2P2=2;
      Ordenacao.quicksort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->shellsort[[ds.MeuItem[389],ds.MeuItem[-542],ds.MeuItem[907],ds.MeuItem[79]], 3]
 Covered Branches:[20, 21, 22, 23, 24, 26]
 */
  @Test public void TestCase17() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=389;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=-542;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=907;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    int clsUTOrdenacaoP2P1P4P1=79;
    Item clsUTOrdenacaoP2P1P4=null;
      clsUTOrdenacaoP2P1P4=new MeuItem(clsUTOrdenacaoP2P1P4P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3,clsUTOrdenacaoP2P1P4};
    int clsUTOrdenacaoP2P2=3;
      Ordenacao.shellsort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
}
