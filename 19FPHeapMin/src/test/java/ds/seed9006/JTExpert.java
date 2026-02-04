package ds.seed9006;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.MeuItem;
import ds.Item;
import ds.FPHeapMin;
/** 
 * This class was automatically generated to test the ds.FPHeapMin class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25]
Uncovered branches: []
Total number of branches: 25
Total number of covered branches: 25
Coverage : 100%
Evaluations : 47000
search time (ms): 42502
total runtime (ms): 43967
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[2]
2)----->copia[[ds.MeuItem[375],retiraMin[],null]], 
3)----->min[]
 Covered Branches:[1, 24, 25, 11]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTFPHeapMinP1P1=2;
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1P1P1=375;
    Item clsUTFPHeapMinP2P1P1=null;
      clsUTFPHeapMinP2P1P1=new MeuItem(clsUTFPHeapMinP2P1P1P1);
    Item clsUTFPHeapMinP2P1P2P0P1P1=null;
    Item clsUTFPHeapMinP2P1P2P0P1P2=null;
    Item clsUTFPHeapMinP2P1P2P0P1P3=null;
    Item clsUTFPHeapMinP2P1P2P0P1P4=null;
    Item[] clsUTFPHeapMinP2P1P2P0P1=new Item[]{clsUTFPHeapMinP2P1P2P0P1P1,clsUTFPHeapMinP2P1P2P0P1P2,clsUTFPHeapMinP2P1P2P0P1P3,clsUTFPHeapMinP2P1P2P0P1P4};
    FPHeapMin clsUTFPHeapMinP2P1P2P0=null;
      clsUTFPHeapMinP2P1P2P0=new FPHeapMin(clsUTFPHeapMinP2P1P2P0P1);
    Item clsUTFPHeapMinP2P1P2=null;
//Exception
    try {
      clsUTFPHeapMinP2P1P2=clsUTFPHeapMinP2P1P2P0.retiraMin();
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    Item clsUTFPHeapMinP2P1P3=null;
    Item[] clsUTFPHeapMinP2P1=new Item[]{clsUTFPHeapMinP2P1P1,clsUTFPHeapMinP2P1P2,clsUTFPHeapMinP2P1P3};
      clsUTFPHeapMin.copia(clsUTFPHeapMinP2P1);
    Item clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.min();
    assertNull(clsUTFPHeapMinP3R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[817],ds.MeuItem[-409],ds.MeuItem[329],ds.MeuItem[0]]]
2)----->diminuiChave[1, null], 
3)----->min[], 
4)----->toString[]
 Covered Branches:[16, 2, 11, 15]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=817;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=-409;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=329;
    Item clsUTFPHeapMinP1P1P3=null;
      clsUTFPHeapMinP1P1P3=new MeuItem(clsUTFPHeapMinP1P1P3P1);
    int clsUTFPHeapMinP1P1P4P1=0;
    Item clsUTFPHeapMinP1P1P4=null;
      clsUTFPHeapMinP1P1P4=new MeuItem(clsUTFPHeapMinP1P1P4P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3,clsUTFPHeapMinP1P1P4};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1=1;
//Exception
    try {
      clsUTFPHeapMin.diminuiChave(clsUTFPHeapMinP2P1,(Object)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    Item clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.min();
    int clsUTFPHeapMinP3RP0R=0;
//Exception
    try {
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.compara((Item)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    Object clsUTFPHeapMinP3RP1R=null;
      clsUTFPHeapMinP3RP1R=clsUTFPHeapMinP3R.recuperaChave();
    assertEquals("-409",clsUTFPHeapMinP3RP1R.toString());
    assertEquals(-409,clsUTFPHeapMinP3RP1R.hashCode());
    assertEquals("-409",clsUTFPHeapMinP3R.recuperaChave().toString());
    String clsUTFPHeapMinP4R=null;
      clsUTFPHeapMinP4R=clsUTFPHeapMin.toString();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[-649],ds.MeuItem[558],ds.MeuItem[-567],ds.MeuItem[2147483647]]]
2)----->retiraMin[], 
3)----->toString[]
 Covered Branches:[2, 3, 4, 6, 8, 12, 14]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=-649;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=558;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=-567;
    Item clsUTFPHeapMinP1P1P3=null;
      clsUTFPHeapMinP1P1P3=new MeuItem(clsUTFPHeapMinP1P1P3P1);
    int clsUTFPHeapMinP1P1P4P1=2147483647;
    Item clsUTFPHeapMinP1P1P4=null;
      clsUTFPHeapMinP1P1P4=new MeuItem(clsUTFPHeapMinP1P1P4P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3,clsUTFPHeapMinP1P1P4};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    Item clsUTFPHeapMinP2R=null;
      clsUTFPHeapMinP2R=clsUTFPHeapMin.retiraMin();
    Object clsUTFPHeapMinP2RP0R=null;
      clsUTFPHeapMinP2RP0R=clsUTFPHeapMinP2R.recuperaChave();
    assertEquals("558",clsUTFPHeapMinP2RP0R.toString());
    assertEquals(558,clsUTFPHeapMinP2RP0R.hashCode());
    assertEquals("558",clsUTFPHeapMinP2R.recuperaChave().toString());
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[2]
2)----->insere[ds.MeuItem[946]], 
3)----->toString[], 
4)----->min[]
 Covered Branches:[1, 17, 2, 19, 21, 11, 12, 13, 15]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTFPHeapMinP1P1=2;
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1P1=946;
    Item clsUTFPHeapMinP2P1=null;
      clsUTFPHeapMinP2P1=new MeuItem(clsUTFPHeapMinP2P1P1);
      clsUTFPHeapMin.insere(clsUTFPHeapMinP2P1);
    assertEquals("946",clsUTFPHeapMinP2P1.recuperaChave().toString());
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    Item clsUTFPHeapMinP4R=null;
      clsUTFPHeapMinP4R=clsUTFPHeapMin.min();
    int clsUTFPHeapMinP4RP0P1P1=2147483647;
    Item clsUTFPHeapMinP4RP0P1=null;
      clsUTFPHeapMinP4RP0P1=new MeuItem(clsUTFPHeapMinP4RP0P1P1);
    int clsUTFPHeapMinP4RP0R=0;
      clsUTFPHeapMinP4RP0R=clsUTFPHeapMinP4R.compara(clsUTFPHeapMinP4RP0P1);
    assertEquals("2147483647",clsUTFPHeapMinP4RP0P1.recuperaChave().toString());
    assertEquals(-1,clsUTFPHeapMinP4RP0R);
    assertEquals("946",clsUTFPHeapMinP4R.recuperaChave().toString());
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[237]
2)----->insere[ds.MeuItem[-765]], 
3)----->min[]
 Covered Branches:[1, 17, 19, 21, 11, 15]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTFPHeapMinP1P1=237;
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1P1=-765;
    Item clsUTFPHeapMinP2P1=null;
      clsUTFPHeapMinP2P1=new MeuItem(clsUTFPHeapMinP2P1P1);
      clsUTFPHeapMin.insere(clsUTFPHeapMinP2P1);
    assertEquals("-765",clsUTFPHeapMinP2P1.recuperaChave().toString());
    Item clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.min();
    Object clsUTFPHeapMinP3RP0R=null;
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.recuperaChave();
    assertEquals("-765",clsUTFPHeapMinP3RP0R.toString());
    assertEquals(-765,clsUTFPHeapMinP3RP0R.hashCode());
    Object clsUTFPHeapMinP3RP1R=null;
      clsUTFPHeapMinP3RP1R=clsUTFPHeapMinP3R.recuperaChave();
    assertEquals("-765",clsUTFPHeapMinP3RP1R.toString());
    assertEquals(-765,clsUTFPHeapMinP3RP1R.hashCode());
    assertEquals("-765",clsUTFPHeapMinP3R.recuperaChave().toString());
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[-613],ds.MeuItem[-205],ds.MeuItem[1],ds.MeuItem[800]]]
2)----->min[], 
3)----->toString[]
 Covered Branches:[2, 11]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=-613;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=-205;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=1;
    Item clsUTFPHeapMinP1P1P3=null;
      clsUTFPHeapMinP1P1P3=new MeuItem(clsUTFPHeapMinP1P1P3P1);
    int clsUTFPHeapMinP1P1P4P1=800;
    Item clsUTFPHeapMinP1P1P4=null;
      clsUTFPHeapMinP1P1P4=new MeuItem(clsUTFPHeapMinP1P1P4P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3,clsUTFPHeapMinP1P1P4};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    Item clsUTFPHeapMinP2R=null;
      clsUTFPHeapMinP2R=clsUTFPHeapMin.min();
    int clsUTFPHeapMinP2RP0P1P1=-248;
    Item clsUTFPHeapMinP2RP0P1=null;
      clsUTFPHeapMinP2RP0P1=new MeuItem(clsUTFPHeapMinP2RP0P1P1);
    int clsUTFPHeapMinP2RP0R=0;
      clsUTFPHeapMinP2RP0R=clsUTFPHeapMinP2R.compara(clsUTFPHeapMinP2RP0P1);
    assertEquals("-248",clsUTFPHeapMinP2RP0P1.recuperaChave().toString());
    assertEquals(1,clsUTFPHeapMinP2RP0R);
    int clsUTFPHeapMinP2RP1P1P1=-372;
    Item clsUTFPHeapMinP2RP1P1=null;
      clsUTFPHeapMinP2RP1P1=new MeuItem(clsUTFPHeapMinP2RP1P1P1);
    int clsUTFPHeapMinP2RP1R=0;
      clsUTFPHeapMinP2RP1R=clsUTFPHeapMinP2R.compara(clsUTFPHeapMinP2RP1P1);
    assertEquals("-372",clsUTFPHeapMinP2RP1P1.recuperaChave().toString());
    assertEquals(1,clsUTFPHeapMinP2RP1R);
    assertEquals("-205",clsUTFPHeapMinP2R.recuperaChave().toString());
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[262],ds.MeuItem[332],ds.MeuItem[0],ds.MeuItem[87]]]
2)----->diminuiChave[2, -339], 
3)----->toString[], 
4)----->min[]
 Covered Branches:[17, 2, 18, 11, 15]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=262;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=332;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=0;
    Item clsUTFPHeapMinP1P1P3=null;
      clsUTFPHeapMinP1P1P3=new MeuItem(clsUTFPHeapMinP1P1P3P1);
    int clsUTFPHeapMinP1P1P4P1=87;
    Item clsUTFPHeapMinP1P1P4=null;
      clsUTFPHeapMinP1P1P4=new MeuItem(clsUTFPHeapMinP1P1P4P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3,clsUTFPHeapMinP1P1P4};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1=2;
    Integer clsUTFPHeapMinP2P2O0=-339;
    Object clsUTFPHeapMinP2P2=clsUTFPHeapMinP2P2O0;
      clsUTFPHeapMin.diminuiChave(clsUTFPHeapMinP2P1,(Object)clsUTFPHeapMinP2P2);
    assertEquals("-339",clsUTFPHeapMinP2P2.toString());
    assertEquals(-339,clsUTFPHeapMinP2P2.hashCode());
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    String clsUTFPHeapMinP3RP0R=null;
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.toString();
    int clsUTFPHeapMinP3RP1P1=639;
    int clsUTFPHeapMinP3RP1R=0;
      clsUTFPHeapMinP3RP1R=clsUTFPHeapMinP3R.indexOf(clsUTFPHeapMinP3RP1P1);
    assertEquals(-1,clsUTFPHeapMinP3RP1R);
    Item clsUTFPHeapMinP4R=null;
      clsUTFPHeapMinP4R=clsUTFPHeapMin.min();
    assertEquals("-339",clsUTFPHeapMinP4R.recuperaChave().toString());
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[-320],ds.MeuItem[2]]]
2)----->retiraMin[], 
3)----->toString[]
 Covered Branches:[1, 2, 3, 11, 12, 14]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=-320;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=2;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    Item clsUTFPHeapMinP2R=null;
      clsUTFPHeapMinP2R=clsUTFPHeapMin.retiraMin();
    int clsUTFPHeapMinP2RP0R=0;
//Exception
    try {
      clsUTFPHeapMinP2RP0R=clsUTFPHeapMinP2R.compara((Item)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    long clsUTFPHeapMinP3RP0P1=89L;
    String clsUTFPHeapMinP3RP0R=null;
      clsUTFPHeapMinP3RP0R=String.valueOf(clsUTFPHeapMinP3RP0P1);
    assertEquals("89",clsUTFPHeapMinP3RP0R);
    String clsUTFPHeapMinP3RP1P1=new String("_+~n'Z;Y.^kZ]Ti+|HcnH.*yTh>+$-YU!XTN &EHNDMp>wg:iKAN*wOns&pYo>nIxb<v[/hr{QrA%dAH-.B_Xtu?J[Nlm;=vG )-Q=p)bm;{p/{;L=>FqRY`R|V%iyR;Tnf$DEkTKv$Ui# fpGo!ofO@eej& fYPd'})L#WPb*.. WCHt-`$D^US~gb!'^Gl)`(|D 'JSv'");
    boolean clsUTFPHeapMinP3RP1R=false;
      clsUTFPHeapMinP3RP1R=clsUTFPHeapMinP3R.startsWith(clsUTFPHeapMinP3RP1P1);
    assertEquals(false,clsUTFPHeapMinP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[592]
2)----->imprime[], 
3)----->min[], 
4)----->toString[]
 Covered Branches:[1, 22, 11]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTFPHeapMinP1P1=592;
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
      clsUTFPHeapMin.imprime();
    Item clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.min();
    assertNull(clsUTFPHeapMinP3R);
    String clsUTFPHeapMinP4R=null;
      clsUTFPHeapMinP4R=clsUTFPHeapMin.toString();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[459],ds.MeuItem[-317],ds.MeuItem[880],ds.MeuItem[72]]]
2)----->constroi[], 
3)----->toString[]
 Covered Branches:[2, 3, 4, 5, 7, 9, 10]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=459;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=-317;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=880;
    Item clsUTFPHeapMinP1P1P3=null;
      clsUTFPHeapMinP1P1P3=new MeuItem(clsUTFPHeapMinP1P1P3P1);
    int clsUTFPHeapMinP1P1P4P1=72;
    Item clsUTFPHeapMinP1P1P4=null;
      clsUTFPHeapMinP1P1P4=new MeuItem(clsUTFPHeapMinP1P1P4P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3,clsUTFPHeapMinP1P1P4};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
      clsUTFPHeapMin.constroi();
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    boolean clsUTFPHeapMinP3RP0P1=true;
    String clsUTFPHeapMinP3RP0R=null;
      clsUTFPHeapMinP3RP0R=String.valueOf(clsUTFPHeapMinP3RP0P1);
    assertEquals("true",clsUTFPHeapMinP3RP0R);
    long clsUTFPHeapMinP3RP1P1=-5687357142833798148L;
    String clsUTFPHeapMinP3RP1R=null;
      clsUTFPHeapMinP3RP1R=String.valueOf(clsUTFPHeapMinP3RP1P1);
    assertEquals("-5687357142833798148",clsUTFPHeapMinP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[-339],ds.MeuItem[182],ds.MeuItem[-424]]]
2)----->insere[ds.MeuItem[866]], 
3)----->toString[]
 Covered Branches:[2, 19, 20]
 */
  @Test public void TestCase10() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=-339;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=182;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=-424;
    Item clsUTFPHeapMinP1P1P3=null;
      clsUTFPHeapMinP1P1P3=new MeuItem(clsUTFPHeapMinP1P1P3P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1P1=866;
    Item clsUTFPHeapMinP2P1=null;
      clsUTFPHeapMinP2P1=new MeuItem(clsUTFPHeapMinP2P1P1);
//Exception
    try {
      clsUTFPHeapMin.insere(clsUTFPHeapMinP2P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("866",clsUTFPHeapMinP2P1.recuperaChave().toString());
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    int clsUTFPHeapMinP3RP0P2=310;
    int clsUTFPHeapMinP3RP0P3=766;
    String clsUTFPHeapMinP3RP0R=null;
//Exception
    try {
      clsUTFPHeapMinP3RP0R=String.copyValueOf((char[])null,clsUTFPHeapMinP3RP0P2,clsUTFPHeapMinP3RP0P3);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTFPHeapMinP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[-728],ds.MeuItem[-95],ds.MeuItem[361],ds.MeuItem[-294]]]
2)----->retiraMin[], 
3)----->min[], 
4)----->toString[]
 Covered Branches:[2, 3, 4, 6, 7, 11, 12, 14]
 */
  @Test public void TestCase11() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=-728;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=-95;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=361;
    Item clsUTFPHeapMinP1P1P3=null;
      clsUTFPHeapMinP1P1P3=new MeuItem(clsUTFPHeapMinP1P1P3P1);
    int clsUTFPHeapMinP1P1P4P1=-294;
    Item clsUTFPHeapMinP1P1P4=null;
      clsUTFPHeapMinP1P1P4=new MeuItem(clsUTFPHeapMinP1P1P4P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3,clsUTFPHeapMinP1P1P4};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    Item clsUTFPHeapMinP2R=null;
      clsUTFPHeapMinP2R=clsUTFPHeapMin.retiraMin();
    Object clsUTFPHeapMinP2RP0R=null;
      clsUTFPHeapMinP2RP0R=clsUTFPHeapMinP2R.recuperaChave();
    assertEquals("-95",clsUTFPHeapMinP2RP0R.toString());
    assertEquals(-95,clsUTFPHeapMinP2RP0R.hashCode());
    Object clsUTFPHeapMinP2RP1R=null;
      clsUTFPHeapMinP2RP1R=clsUTFPHeapMinP2R.recuperaChave();
    assertEquals("-95",clsUTFPHeapMinP2RP1R.toString());
    assertEquals(-95,clsUTFPHeapMinP2RP1R.hashCode());
    assertEquals("-95",clsUTFPHeapMinP2R.recuperaChave().toString());
    Item clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.min();
    assertEquals("-294",clsUTFPHeapMinP3R.recuperaChave().toString());
    String clsUTFPHeapMinP4R=null;
      clsUTFPHeapMinP4R=clsUTFPHeapMin.toString();
    int clsUTFPHeapMinP4RP0P1=253;
    int clsUTFPHeapMinP4RP0R=0;
      clsUTFPHeapMinP4RP0R=clsUTFPHeapMinP4R.indexOf(clsUTFPHeapMinP4RP0P1);
    assertEquals(-1,clsUTFPHeapMinP4RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[-899],ds.MeuItem[88],ds.MeuItem[-532]]]
2)----->imprime[], 
3)----->toString[]
 Covered Branches:[2, 22, 23]
 */
  @Test public void TestCase12() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=-899;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=88;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=-532;
    Item clsUTFPHeapMinP1P1P3=null;
      clsUTFPHeapMinP1P1P3=new MeuItem(clsUTFPHeapMinP1P1P3P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
      clsUTFPHeapMin.imprime();
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
  }
}
