package ds.seed6733;
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
Evaluations : 1827
search time (ms): 1700
total runtime (ms): 2968
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->shellsort[[ds.MeuItem[493]], -705]
 Covered Branches:[20, 21, 22]
 */
  @Test public void TestCase0() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=493;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1};
    int clsUTOrdenacaoP2P2=-705;
      Ordenacao.shellsort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->heapsort[[], -513]
 Covered Branches:[28]
 */
  @Test public void TestCase1() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    Item[] clsUTOrdenacaoP2P1=new Item[]{};
    int clsUTOrdenacaoP2P2=-513;
      Ordenacao.heapsort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->insercao[[ds.MeuItem[2],ds.MeuItem[0],ds.MeuItem[899],ds.MeuItem[-847]], 2]
 Covered Branches:[17, 18]
 */
  @Test public void TestCase2() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=2;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=0;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=899;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    int clsUTOrdenacaoP2P1P4P1=-847;
    Item clsUTOrdenacaoP2P1P4=null;
      clsUTOrdenacaoP2P1P4=new MeuItem(clsUTOrdenacaoP2P1P4P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3,clsUTOrdenacaoP2P1P4};
    int clsUTOrdenacaoP2P2=2;
      Ordenacao.insercao(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->selecao[[ds.MeuItem[-294],ds.MeuItem[824],ds.MeuItem[-1],ds.MeuItem[224]], 2]
 Covered Branches:[12, 13, 14, 15]
 */
  @Test public void TestCase3() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=-294;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=824;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=-1;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    int clsUTOrdenacaoP2P1P4P1=224;
    Item clsUTOrdenacaoP2P1P4=null;
      clsUTOrdenacaoP2P1P4=new MeuItem(clsUTOrdenacaoP2P1P4P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3,clsUTOrdenacaoP2P1P4};
    int clsUTOrdenacaoP2P2=2;
      Ordenacao.selecao(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->quicksort[[ds.MeuItem[-739],ds.MeuItem[-958],ds.MeuItem[315],ds.MeuItem[573]], 2]
 Covered Branches:[1, 2, 4, 5, 7, 9, 27, 11]
 */
  @Test public void TestCase4() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=-739;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=-958;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=315;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    int clsUTOrdenacaoP2P1P4P1=573;
    Item clsUTOrdenacaoP2P1P4=null;
      clsUTOrdenacaoP2P1P4=new MeuItem(clsUTOrdenacaoP2P1P4P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3,clsUTOrdenacaoP2P1P4};
    int clsUTOrdenacaoP2P2=2;
      Ordenacao.quicksort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->quicksort[[ds.MeuItem[424],ds.MeuItem[-1],ds.MeuItem[936],ds.MeuItem[319]], 0]
 Covered Branches:[1, 2, 3, 6, 7, 9, 27, 11]
 */
  @Test public void TestCase5() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=424;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=-1;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=936;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    int clsUTOrdenacaoP2P1P4P1=319;
    Item clsUTOrdenacaoP2P1P4=null;
      clsUTOrdenacaoP2P1P4=new MeuItem(clsUTOrdenacaoP2P1P4P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3,clsUTOrdenacaoP2P1P4};
    int clsUTOrdenacaoP2P2=0;
      Ordenacao.quicksort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->quicksort[[ds.MeuItem[-214],ds.MeuItem[114],ds.MeuItem[464],ds.MeuItem[-324]], 3]
 Covered Branches:[1, 2, 3, 5, 7, 8, 9, 27, 11]
 */
  @Test public void TestCase6() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=-214;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=114;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=464;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    int clsUTOrdenacaoP2P1P4P1=-324;
    Item clsUTOrdenacaoP2P1P4=null;
      clsUTOrdenacaoP2P1P4=new MeuItem(clsUTOrdenacaoP2P1P4P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3,clsUTOrdenacaoP2P1P4};
    int clsUTOrdenacaoP2P2=3;
      Ordenacao.quicksort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->selecao[[ds.MeuItem[2],ds.MeuItem[-9],ds.MeuItem[193]], 2]
 Covered Branches:[16, 12, 13, 14]
 */
  @Test public void TestCase7() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=2;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=-9;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=193;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3};
    int clsUTOrdenacaoP2P2=2;
      Ordenacao.selecao(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->quicksort[[ds.MeuItem[1],ds.MeuItem[783],ds.MeuItem[285],ds.MeuItem[572]], 3]
 Covered Branches:[1, 2, 4, 5, 7, 9, 10, 27, 11]
 */
  @Test public void TestCase8() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=1;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=783;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=285;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    int clsUTOrdenacaoP2P1P4P1=572;
    Item clsUTOrdenacaoP2P1P4=null;
      clsUTOrdenacaoP2P1P4=new MeuItem(clsUTOrdenacaoP2P1P4P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3,clsUTOrdenacaoP2P1P4};
    int clsUTOrdenacaoP2P2=3;
      Ordenacao.quicksort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->shellsort[[ds.MeuItem[-836],ds.MeuItem[133],ds.MeuItem[419],ds.MeuItem[186]], 3]
 Covered Branches:[20, 21, 22, 23, 24, 26]
 */
  @Test public void TestCase9() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=-836;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=133;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=419;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    int clsUTOrdenacaoP2P1P4P1=186;
    Item clsUTOrdenacaoP2P1P4=null;
      clsUTOrdenacaoP2P1P4=new MeuItem(clsUTOrdenacaoP2P1P4P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3,clsUTOrdenacaoP2P1P4};
    int clsUTOrdenacaoP2P2=3;
      Ordenacao.shellsort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->heapsort[[ds.MeuItem[0],ds.MeuItem[1],ds.MeuItem[-903],ds.MeuItem[-665]], 2]
 Covered Branches:[28, 29]
 */
  @Test public void TestCase10() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=0;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=1;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=-903;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    int clsUTOrdenacaoP2P1P4P1=-665;
    Item clsUTOrdenacaoP2P1P4=null;
      clsUTOrdenacaoP2P1P4=new MeuItem(clsUTOrdenacaoP2P1P4P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3,clsUTOrdenacaoP2P1P4};
    int clsUTOrdenacaoP2P2=2;
      Ordenacao.heapsort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->insercao[[ds.MeuItem[698],ds.MeuItem[1],ds.MeuItem[-32],ds.MeuItem[77]], 2]
 Covered Branches:[17, 18, 19]
 */
  @Test public void TestCase11() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=698;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=1;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=-32;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    int clsUTOrdenacaoP2P1P4P1=77;
    Item clsUTOrdenacaoP2P1P4=null;
      clsUTOrdenacaoP2P1P4=new MeuItem(clsUTOrdenacaoP2P1P4P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3,clsUTOrdenacaoP2P1P4};
    int clsUTOrdenacaoP2P2=2;
      Ordenacao.insercao(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->selecao[[ds.MeuItem[1]], 0]
 Covered Branches:[12]
 */
  @Test public void TestCase12() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=1;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1};
    int clsUTOrdenacaoP2P2=0;
      Ordenacao.selecao(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->insercao[[], -252]
 Covered Branches:[17]
 */
  @Test public void TestCase13() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    Item[] clsUTOrdenacaoP2P1=new Item[]{};
    int clsUTOrdenacaoP2P2=-252;
      Ordenacao.insercao(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->shellsort[[ds.MeuItem[-695],ds.MeuItem[-331],ds.MeuItem[2]], 2]
 Covered Branches:[20, 21, 22, 23]
 */
  @Test public void TestCase14() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=-695;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=-331;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=2;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3};
    int clsUTOrdenacaoP2P2=2;
      Ordenacao.shellsort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
  /** 
 * Chromosome :
1)----->ds.Ordenacao[]
2)----->shellsort[[ds.MeuItem[2],ds.MeuItem[796],ds.MeuItem[1],ds.MeuItem[-503]], 2]
 Covered Branches:[20, 21, 22, 23, 24, 25]
 */
  @Test public void TestCase15() throws Throwable {
    Ordenacao clsUTOrdenacao=null;
      clsUTOrdenacao=new Ordenacao();
    int clsUTOrdenacaoP2P1P1P1=2;
    Item clsUTOrdenacaoP2P1P1=null;
      clsUTOrdenacaoP2P1P1=new MeuItem(clsUTOrdenacaoP2P1P1P1);
    int clsUTOrdenacaoP2P1P2P1=796;
    Item clsUTOrdenacaoP2P1P2=null;
      clsUTOrdenacaoP2P1P2=new MeuItem(clsUTOrdenacaoP2P1P2P1);
    int clsUTOrdenacaoP2P1P3P1=1;
    Item clsUTOrdenacaoP2P1P3=null;
      clsUTOrdenacaoP2P1P3=new MeuItem(clsUTOrdenacaoP2P1P3P1);
    int clsUTOrdenacaoP2P1P4P1=-503;
    Item clsUTOrdenacaoP2P1P4=null;
      clsUTOrdenacaoP2P1P4=new MeuItem(clsUTOrdenacaoP2P1P4P1);
    Item[] clsUTOrdenacaoP2P1=new Item[]{clsUTOrdenacaoP2P1P1,clsUTOrdenacaoP2P1P2,clsUTOrdenacaoP2P1P3,clsUTOrdenacaoP2P1P4};
    int clsUTOrdenacaoP2P2=2;
      Ordenacao.shellsort(clsUTOrdenacaoP2P1,clsUTOrdenacaoP2P2);
  }
}
