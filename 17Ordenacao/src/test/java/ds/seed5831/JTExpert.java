package ds.seed5831;
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
Evaluations : 7295
search time (ms): 6348
total runtime (ms): 7673
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->selecao[[ds.MeuItem[-975]], 0]
 Covered Branches:[12]
 */
  @Test public void TestCase0() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=-975;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1};
    int clsUTOrdenacaoP2P2=0;
      Ordenacao.selecao(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->shellsort[[ds.MeuItem[1],ds.MeuItem[-317],ds.MeuItem[268],ds.MeuItem[122]], 3]
 Covered Branches:[20, 21, 22, 23, 24, 26]
 */
  @Test public void TestCase1() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=1;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=-317;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=268;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    int clsUTOrdenacaoP2P1P4P1=122;
    Item clsUTOrdenacaoP2P1P4=null;
      clsUTOrdenacaoP2P1P4=new MeuItem(clsUTOrdenacaoP2P1P4P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3,clsUTOrdenacaoP2P1P4};
    int clsUTOrdenacaoP2P2=3;
      Ordenacao.shellsort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->selecao[[ds.MeuItem[1],ds.MeuItem[-166],ds.MeuItem[53],ds.MeuItem[-653]], 2]
 Covered Branches:[16, 12, 13, 14]
 */
  @Test public void TestCase2() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=1;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=-166;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=53;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    int clsUTOrdenacaoP2P1P4P1=-653;
    Item clsUTOrdenacaoP2P1P4=null;
      clsUTOrdenacaoP2P1P4=new MeuItem(clsUTOrdenacaoP2P1P4P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3,clsUTOrdenacaoP2P1P4};
    int clsUTOrdenacaoP2P2=2;
      Ordenacao.selecao(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->quicksort[[ds.MeuItem[0],ds.MeuItem[161],ds.MeuItem[0]], 1]
 Covered Branches:[1, 2, 5, 7, 9, 27, 11]
 */
  @Test public void TestCase3() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=0;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=161;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=0;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3};
    int clsUTOrdenacaoP2P2=1;
      Ordenacao.quicksort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->insercao[[ds.MeuItem[-569],ds.MeuItem[714],ds.MeuItem[-443],ds.MeuItem[0]], -939]
 Covered Branches:[17]
 */
  @Test public void TestCase4() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=-569;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=714;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=-443;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    int clsUTOrdenacaoP2P1P4P1=0;
    Item clsUTOrdenacaoP2P1P4=null;
      clsUTOrdenacaoP2P1P4=new MeuItem(clsUTOrdenacaoP2P1P4P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3,clsUTOrdenacaoP2P1P4};
    int clsUTOrdenacaoP2P2=-939;
      Ordenacao.insercao(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->quicksort[[ds.MeuItem[-39],ds.MeuItem[-925],ds.MeuItem[3]], 0]
 Covered Branches:[1, 2, 3, 6, 7, 9, 27, 11]
 */
  @Test public void TestCase5() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=-39;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=-925;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=3;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3};
    int clsUTOrdenacaoP2P2=0;
      Ordenacao.quicksort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->heapsort[[ds.MeuItem[740],ds.MeuItem[181],ds.MeuItem[-168],ds.MeuItem[2]], 2]
 Covered Branches:[28, 29]
 */
  @Test public void TestCase6() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=740;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=181;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=-168;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    int clsUTOrdenacaoP2P1P4P1=2;
    Item clsUTOrdenacaoP2P1P4=null;
      clsUTOrdenacaoP2P1P4=new MeuItem(clsUTOrdenacaoP2P1P4P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3,clsUTOrdenacaoP2P1P4};
    int clsUTOrdenacaoP2P2=2;
      Ordenacao.heapsort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->quicksort[[ds.MeuItem[-877],ds.MeuItem[313],ds.MeuItem[919],ds.MeuItem[805]], 3]
 Covered Branches:[1, 2, 3, 4, 5, 7, 8, 9, 27, 11]
 */
  @Test public void TestCase7() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=-877;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=313;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=919;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    int clsUTOrdenacaoP2P1P4P1=805;
    Item clsUTOrdenacaoP2P1P4=null;
      clsUTOrdenacaoP2P1P4=new MeuItem(clsUTOrdenacaoP2P1P4P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3,clsUTOrdenacaoP2P1P4};
    int clsUTOrdenacaoP2P2=3;
      Ordenacao.quicksort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->shellsort[[ds.MeuItem[732],ds.MeuItem[2],ds.MeuItem[-219],ds.MeuItem[-52]], 2]
 Covered Branches:[20, 21, 22, 23, 24, 25]
 */
  @Test public void TestCase8() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=732;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=2;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=-219;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    int clsUTOrdenacaoP2P1P4P1=-52;
    Item clsUTOrdenacaoP2P1P4=null;
      clsUTOrdenacaoP2P1P4=new MeuItem(clsUTOrdenacaoP2P1P4P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3,clsUTOrdenacaoP2P1P4};
    int clsUTOrdenacaoP2P2=2;
      Ordenacao.shellsort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->shellsort[[], -304]
 Covered Branches:[20, 21, 22]
 */
  @Test public void TestCase9() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P2=-304;
      Ordenacao.shellsort((Item[])null,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->heapsort[[], -138]
 Covered Branches:[28]
 */
  @Test public void TestCase10() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    Item[] clsUTOrdenacaoP2P1=new Item[]{};
    int clsUTOrdenacaoP2P2=-138;
      Ordenacao.heapsort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->selecao[[ds.MeuItem[451],ds.MeuItem[418],ds.MeuItem[-917],ds.MeuItem[37]], 2]
 Covered Branches:[12, 13, 14, 15]
 */
  @Test public void TestCase11() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=451;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=418;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=-917;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    int clsUTOrdenacaoP2P1P4P1=37;
    Item clsUTOrdenacaoP2P1P4=null;
      clsUTOrdenacaoP2P1P4=new MeuItem(clsUTOrdenacaoP2P1P4P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3,clsUTOrdenacaoP2P1P4};
    int clsUTOrdenacaoP2P2=2;
      Ordenacao.selecao(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->insercao[[ds.MeuItem[0],ds.MeuItem[819],ds.MeuItem[0]], 2]
 Covered Branches:[17, 18, 19]
 */
  @Test public void TestCase12() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=0;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=819;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=0;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3};
    int clsUTOrdenacaoP2P2=2;
      Ordenacao.insercao(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->quicksort[[ds.MeuItem[-929],ds.MeuItem[-893]], 0]
 Covered Branches:[1, 2, 6, 7, 9, 27, 11]
 */
  @Test public void TestCase13() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=-929;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=-893;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2};
    int clsUTOrdenacaoP2P2=0;
      Ordenacao.quicksort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->quicksort[[ds.MeuItem[915],ds.MeuItem[-633],ds.MeuItem[325],ds.MeuItem[0]], 2]
 Covered Branches:[1, 2, 4, 5, 7, 9, 27, 11]
 */
  @Test public void TestCase14() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=915;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=-633;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=325;
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
2)----->quicksort[[ds.MeuItem[621],ds.MeuItem[354],ds.MeuItem[-539],ds.MeuItem[3]], 3]
 Covered Branches:[1, 2, 4, 5, 7, 9, 10, 27, 11]
 */
  @Test public void TestCase15() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=621;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=354;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=-539;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    int clsUTOrdenacaoP2P1P4P1=3;
    Item clsUTOrdenacaoP2P1P4=null;
      clsUTOrdenacaoP2P1P4=new MeuItem(clsUTOrdenacaoP2P1P4P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3,clsUTOrdenacaoP2P1P4};
    int clsUTOrdenacaoP2P2=3;
      Ordenacao.quicksort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
}
