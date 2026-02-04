package ds.seed5482;
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
Evaluations : 4003
search time (ms): 2913
total runtime (ms): 4371
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->quicksort[[ds.MeuItem[0],ds.MeuItem[782],ds.MeuItem[1],ds.MeuItem[66]], 3]
 Covered Branches:[1, 2, 4, 5, 7, 9, 10, 27, 11]
 */
  @Test public void TestCase0() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=0;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=782;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=1;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    int clsUTOrdenacaoP2P1P4P1=66;
    Item clsUTOrdenacaoP2P1P4=null;
      clsUTOrdenacaoP2P1P4=new MeuItem(clsUTOrdenacaoP2P1P4P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3,clsUTOrdenacaoP2P1P4};
    int clsUTOrdenacaoP2P2=3;
      Ordenacao.quicksort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->heapsort[[ds.MeuItem[2],ds.MeuItem[0],ds.MeuItem[749]], 2]
 Covered Branches:[28, 29]
 */
  @Test public void TestCase1() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=2;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=0;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=749;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3};
    int clsUTOrdenacaoP2P2=2;
      Ordenacao.heapsort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->selecao[[ds.MeuItem[-624],ds.MeuItem[-479],ds.MeuItem[-582]], 2]
 Covered Branches:[12, 13, 14, 15]
 */
  @Test public void TestCase2() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=-624;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=-479;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=-582;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3};
    int clsUTOrdenacaoP2P2=2;
      Ordenacao.selecao(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->selecao[[ds.MeuItem[-118],ds.MeuItem[740],ds.MeuItem[83],ds.MeuItem[-686]], -314]
 Covered Branches:[12]
 */
  @Test public void TestCase3() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=-118;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=740;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=83;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    int clsUTOrdenacaoP2P1P4P1=-686;
    Item clsUTOrdenacaoP2P1P4=null;
      clsUTOrdenacaoP2P1P4=new MeuItem(clsUTOrdenacaoP2P1P4P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3,clsUTOrdenacaoP2P1P4};
    int clsUTOrdenacaoP2P2=-314;
      Ordenacao.selecao(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->insercao[[ds.MeuItem[294],ds.MeuItem[747],ds.MeuItem[2],ds.MeuItem[-533]], 3]
 Covered Branches:[17, 18, 19]
 */
  @Test public void TestCase4() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=294;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=747;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=2;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    int clsUTOrdenacaoP2P1P4P1=-533;
    Item clsUTOrdenacaoP2P1P4=null;
      clsUTOrdenacaoP2P1P4=new MeuItem(clsUTOrdenacaoP2P1P4P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3,clsUTOrdenacaoP2P1P4};
    int clsUTOrdenacaoP2P2=3;
      Ordenacao.insercao(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->quicksort[[ds.MeuItem[0],ds.MeuItem[-628],ds.MeuItem[886],ds.MeuItem[-990]], 0]
 Covered Branches:[1, 2, 3, 6, 7, 9, 27, 11]
 */
  @Test public void TestCase5() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=0;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=-628;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=886;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    int clsUTOrdenacaoP2P1P4P1=-990;
    Item clsUTOrdenacaoP2P1P4=null;
      clsUTOrdenacaoP2P1P4=new MeuItem(clsUTOrdenacaoP2P1P4P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3,clsUTOrdenacaoP2P1P4};
    int clsUTOrdenacaoP2P2=0;
      Ordenacao.quicksort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->shellsort[[], -146]
 Covered Branches:[20, 21, 22]
 */
  @Test public void TestCase6() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    Item[] clsUTOrdenacaoP2P1=new Item[]{};
    int clsUTOrdenacaoP2P2=-146;
      Ordenacao.shellsort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->heapsort[[ds.MeuItem[2],ds.MeuItem[-190],ds.MeuItem[-857]], 0]
 Covered Branches:[28]
 */
  @Test public void TestCase7() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=2;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=-190;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=-857;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3};
    int clsUTOrdenacaoP2P2=0;
      Ordenacao.heapsort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->shellsort[[ds.MeuItem[901],ds.MeuItem[-280],ds.MeuItem[-254],ds.MeuItem[-767]], 3]
 Covered Branches:[20, 21, 22, 23, 24, 25, 26]
 */
  @Test public void TestCase8() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=901;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=-280;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=-254;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    int clsUTOrdenacaoP2P1P4P1=-767;
    Item clsUTOrdenacaoP2P1P4=null;
      clsUTOrdenacaoP2P1P4=new MeuItem(clsUTOrdenacaoP2P1P4P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3,clsUTOrdenacaoP2P1P4};
    int clsUTOrdenacaoP2P2=3;
      Ordenacao.shellsort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->quicksort[[ds.MeuItem[222],ds.MeuItem[-185],ds.MeuItem[2],ds.MeuItem[324]], 2]
 Covered Branches:[1, 2, 4, 5, 7, 9, 27, 11]
 */
  @Test public void TestCase9() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=222;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=-185;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=2;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    int clsUTOrdenacaoP2P1P4P1=324;
    Item clsUTOrdenacaoP2P1P4=null;
      clsUTOrdenacaoP2P1P4=new MeuItem(clsUTOrdenacaoP2P1P4P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3,clsUTOrdenacaoP2P1P4};
    int clsUTOrdenacaoP2P2=2;
      Ordenacao.quicksort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->quicksort[[ds.MeuItem[337],ds.MeuItem[321],ds.MeuItem[461],ds.MeuItem[1]], 3]
 Covered Branches:[1, 2, 3, 5, 7, 8, 9, 27, 11]
 */
  @Test public void TestCase10() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=337;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=321;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=461;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    int clsUTOrdenacaoP2P1P4P1=1;
    Item clsUTOrdenacaoP2P1P4=null;
      clsUTOrdenacaoP2P1P4=new MeuItem(clsUTOrdenacaoP2P1P4P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3,clsUTOrdenacaoP2P1P4};
    int clsUTOrdenacaoP2P2=3;
      Ordenacao.quicksort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->selecao[[ds.MeuItem[114],ds.MeuItem[89],ds.MeuItem[532],ds.MeuItem[-267]], 2]
 Covered Branches:[16, 12, 13, 14]
 */
  @Test public void TestCase11() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=114;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=89;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=532;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    int clsUTOrdenacaoP2P1P4P1=-267;
    Item clsUTOrdenacaoP2P1P4=null;
      clsUTOrdenacaoP2P1P4=new MeuItem(clsUTOrdenacaoP2P1P4P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3,clsUTOrdenacaoP2P1P4};
    int clsUTOrdenacaoP2P2=2;
      Ordenacao.selecao(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->insercao[[], -860]
 Covered Branches:[17]
 */
  @Test public void TestCase12() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    Item[] clsUTOrdenacaoP2P1=new Item[]{};
    int clsUTOrdenacaoP2P2=-860;
      Ordenacao.insercao(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
}
