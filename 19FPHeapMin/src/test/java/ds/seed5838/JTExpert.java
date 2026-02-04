package ds.seed5838;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Item;
import ds.MeuItem;
import java.util.Arrays;
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
Evaluations : 45955
search time (ms): 42501
total runtime (ms): 43771
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[null,ds.MeuItem[-432]]]
2)----->min[], 
3)----->toString[]
 Covered Branches:[2, 11]
 */
  @Test public void TestCase0() throws Throwable {
    Item clsUTFPHeapMinP1P1P1=null;
    int clsUTFPHeapMinP1P1P2P1=-432;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    Item clsUTFPHeapMinP2R=null;
      clsUTFPHeapMinP2R=clsUTFPHeapMin.min();
    assertEquals("-432",clsUTFPHeapMinP2R.recuperaChave().toString());
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[829],ds.MeuItem[596],ds.MeuItem[0],ds.MeuItem[847]]]
2)----->copia[[]], 
3)----->toString[]
 Covered Branches:[2, 24]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=829;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=596;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=0;
    Item clsUTFPHeapMinP1P1P3=null;
      clsUTFPHeapMinP1P1P3=new MeuItem(clsUTFPHeapMinP1P1P3P1);
    int clsUTFPHeapMinP1P1P4P1=847;
    Item clsUTFPHeapMinP1P1P4=null;
      clsUTFPHeapMinP1P1P4=new MeuItem(clsUTFPHeapMinP1P1P4P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3,clsUTFPHeapMinP1P1P4};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    Item[] clsUTFPHeapMinP2P1=new Item[]{};
      clsUTFPHeapMin.copia(clsUTFPHeapMinP2P1);
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[-1],ds.MeuItem[2147483646],ds.MeuItem[-862]]]
2)----->refaz[1, 2], 
3)----->toString[], 
4)----->min[]
 Covered Branches:[2, 3, 4, 6, 8, 11]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=-1;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=2147483646;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=-862;
    Item clsUTFPHeapMinP1P1P3=null;
      clsUTFPHeapMinP1P1P3=new MeuItem(clsUTFPHeapMinP1P1P3P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1=1;
    int clsUTFPHeapMinP2P2=2;
      clsUTFPHeapMin.refaz(clsUTFPHeapMinP2P1,clsUTFPHeapMinP2P2);
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    Item clsUTFPHeapMinP4R=null;
      clsUTFPHeapMinP4R=clsUTFPHeapMin.min();
    Object clsUTFPHeapMinP4RP0R=null;
      clsUTFPHeapMinP4RP0R=clsUTFPHeapMinP4R.recuperaChave();
    assertEquals("-862",clsUTFPHeapMinP4RP0R.toString());
    assertEquals(-862,clsUTFPHeapMinP4RP0R.hashCode());
    assertEquals("-862",clsUTFPHeapMinP4R.recuperaChave().toString());
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[]]
2)----->insere[ds.MeuItem[810]], 
3)----->toString[]
 Covered Branches:[2, 19, 20]
 */
  @Test public void TestCase3() throws Throwable {
    Item[] clsUTFPHeapMinP1P1=new Item[]{};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1P1=810;
    Item clsUTFPHeapMinP2P1=null;
      clsUTFPHeapMinP2P1=new MeuItem(clsUTFPHeapMinP2P1P1);
//Exception
    try {
      clsUTFPHeapMin.insere(clsUTFPHeapMinP2P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("810",clsUTFPHeapMinP2P1.recuperaChave().toString());
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[1],ds.MeuItem[0]]]
2)----->imprime[], 
3)----->toString[]
 Covered Branches:[2, 22, 23]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=1;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=0;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
      clsUTFPHeapMin.imprime();
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    boolean clsUTFPHeapMinP3RP0P1=false;
    String clsUTFPHeapMinP3RP0R=null;
      clsUTFPHeapMinP3RP0R=String.valueOf(clsUTFPHeapMinP3RP0P1);
    assertEquals("false",clsUTFPHeapMinP3RP0R);
    byte[] clsUTFPHeapMinP3RP1R=null;
      clsUTFPHeapMinP3RP1R=clsUTFPHeapMinP3R.getBytes();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[221]
2)----->insere[ds.MeuItem[269]], 
3)----->min[], 
4)----->toString[]
 Covered Branches:[1, 17, 19, 21, 11, 15]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTFPHeapMinP1P1=221;
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1P1=269;
    Item clsUTFPHeapMinP2P1=null;
      clsUTFPHeapMinP2P1=new MeuItem(clsUTFPHeapMinP2P1P1);
      clsUTFPHeapMin.insere(clsUTFPHeapMinP2P1);
    assertEquals("269",clsUTFPHeapMinP2P1.recuperaChave().toString());
    Item clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.min();
    assertEquals("269",clsUTFPHeapMinP3R.recuperaChave().toString());
    String clsUTFPHeapMinP4R=null;
      clsUTFPHeapMinP4R=clsUTFPHeapMin.toString();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[672],ds.MeuItem[2],ds.MeuItem[-415]]]
2)----->refaz[0, 2], 
3)----->min[]
 Covered Branches:[2, 3, 4, 5, 6, 8, 11]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=672;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=2;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=-415;
    Item clsUTFPHeapMinP1P1P3=null;
      clsUTFPHeapMinP1P1P3=new MeuItem(clsUTFPHeapMinP1P1P3P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1=0;
    int clsUTFPHeapMinP2P2=2;
      clsUTFPHeapMin.refaz(clsUTFPHeapMinP2P1,clsUTFPHeapMinP2P2);
    Item clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.min();
    assertEquals("-415",clsUTFPHeapMinP3R.recuperaChave().toString());
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[2]
2)----->copia[[min[],retiraMin[]]], 
3)----->min[]
 Covered Branches:[1, 24, 25, 11]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTFPHeapMinP1P1=2;
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    Item clsUTFPHeapMinP2P1P1P0P1P1=null;
    Item clsUTFPHeapMinP2P1P1P0P1P2=null;
    Item clsUTFPHeapMinP2P1P1P0P1P3=null;
    Item clsUTFPHeapMinP2P1P1P0P1P4=null;
    Item[] clsUTFPHeapMinP2P1P1P0P1=new Item[]{clsUTFPHeapMinP2P1P1P0P1P1,clsUTFPHeapMinP2P1P1P0P1P2,clsUTFPHeapMinP2P1P1P0P1P3,clsUTFPHeapMinP2P1P1P0P1P4};
    FPHeapMin clsUTFPHeapMinP2P1P1P0=null;
      clsUTFPHeapMinP2P1P1P0=new FPHeapMin(clsUTFPHeapMinP2P1P1P0P1);
    Item clsUTFPHeapMinP2P1P1=null;
      clsUTFPHeapMinP2P1P1=clsUTFPHeapMinP2P1P1P0.min();
    Item clsUTFPHeapMinP2P1P2P0P1P1=null;
    Item clsUTFPHeapMinP2P1P2P0P1P2=null;
    Item clsUTFPHeapMinP2P1P2P0P1P3=null;
    Item[] clsUTFPHeapMinP2P1P2P0P1=new Item[]{clsUTFPHeapMinP2P1P2P0P1P1,clsUTFPHeapMinP2P1P2P0P1P2,clsUTFPHeapMinP2P1P2P0P1P3};
    FPHeapMin clsUTFPHeapMinP2P1P2P0=null;
      clsUTFPHeapMinP2P1P2P0=new FPHeapMin(clsUTFPHeapMinP2P1P2P0P1);
    Item clsUTFPHeapMinP2P1P2=null;
      clsUTFPHeapMinP2P1P2=clsUTFPHeapMinP2P1P2P0.retiraMin();
    Item[] clsUTFPHeapMinP2P1=new Item[]{clsUTFPHeapMinP2P1P1,clsUTFPHeapMinP2P1P2};
      clsUTFPHeapMin.copia(clsUTFPHeapMinP2P1);
    Item clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.min();
    assertNull(clsUTFPHeapMinP3R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[1],ds.MeuItem[282],ds.MeuItem[498]]]
2)----->constroi[], 
3)----->toString[]
 Covered Branches:[2, 3, 4, 6, 7, 9, 10]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=1;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=282;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=498;
    Item clsUTFPHeapMinP1P1P3=null;
      clsUTFPHeapMinP1P1P3=new MeuItem(clsUTFPHeapMinP1P1P3P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
      clsUTFPHeapMin.constroi();
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[664],ds.MeuItem[650],ds.MeuItem[1]]]
2)----->retiraMin[], 
3)----->toString[]
 Covered Branches:[2, 3, 12, 14]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=664;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=650;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=1;
    Item clsUTFPHeapMinP1P1P3=null;
      clsUTFPHeapMinP1P1P3=new MeuItem(clsUTFPHeapMinP1P1P3P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    Item clsUTFPHeapMinP2R=null;
      clsUTFPHeapMinP2R=clsUTFPHeapMin.retiraMin();
    Object clsUTFPHeapMinP2RP0R=null;
      clsUTFPHeapMinP2RP0R=clsUTFPHeapMinP2R.recuperaChave();
    assertEquals("650",clsUTFPHeapMinP2RP0R.toString());
    assertEquals(650,clsUTFPHeapMinP2RP0R.hashCode());
    assertEquals("650",clsUTFPHeapMinP2R.recuperaChave().toString());
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    String clsUTFPHeapMinP3RP0P1=new String("8.0");
    boolean clsUTFPHeapMinP3RP0R=false;
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.matches(clsUTFPHeapMinP3RP0P1);
    assertEquals("8.0",clsUTFPHeapMinP3RP0P1.toString());
    assertEquals(false,clsUTFPHeapMinP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[-197],ds.MeuItem[443]]]
2)----->refaz[0, -700], 
3)----->toString[], 
4)----->min[]
 Covered Branches:[2, 3, 11, 12, 13]
 */
  @Test public void TestCase10() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=-197;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=443;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1=0;
    int clsUTFPHeapMinP2P2=-700;
      clsUTFPHeapMin.refaz(clsUTFPHeapMinP2P1,clsUTFPHeapMinP2P2);
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    String clsUTFPHeapMinP3RP0R=null;
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.toString();
    String clsUTFPHeapMinP3RP1P1=new String("tph3c6ivqdujakxye8l1wo9sb475m");
    int clsUTFPHeapMinP3RP1P2=95;
    int clsUTFPHeapMinP3RP1R=0;
      clsUTFPHeapMinP3RP1R=clsUTFPHeapMinP3R.lastIndexOf(clsUTFPHeapMinP3RP1P1,clsUTFPHeapMinP3RP1P2);
    assertEquals("tph3c6ivqdujakxye8l1wo9sb475m",clsUTFPHeapMinP3RP1P1.toString());
    assertEquals(-1,clsUTFPHeapMinP3RP1R);
    Item clsUTFPHeapMinP4R=null;
      clsUTFPHeapMinP4R=clsUTFPHeapMin.min();
    int clsUTFPHeapMinP4RP0P1P1=3;
    Item clsUTFPHeapMinP4RP0P1=null;
      clsUTFPHeapMinP4RP0P1=new MeuItem(clsUTFPHeapMinP4RP0P1P1);
    int clsUTFPHeapMinP4RP0R=0;
      clsUTFPHeapMinP4RP0R=clsUTFPHeapMinP4R.compara(clsUTFPHeapMinP4RP0P1);
    assertEquals("3",clsUTFPHeapMinP4RP0P1.recuperaChave().toString());
    assertEquals(1,clsUTFPHeapMinP4RP0R);
    Object clsUTFPHeapMinP4RP1R=null;
      clsUTFPHeapMinP4RP1R=clsUTFPHeapMinP4R.recuperaChave();
    assertEquals("443",clsUTFPHeapMinP4RP1R.toString());
    assertEquals(443,clsUTFPHeapMinP4RP1R.hashCode());
    assertEquals("443",clsUTFPHeapMinP4R.recuperaChave().toString());
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[min[],ds.MeuItem[417],ds.MeuItem[2]]]
2)----->diminuiChave[2, 2], 
3)----->toString[]
 Covered Branches:[17, 2, 18, 15]
 */
  @Test public void TestCase11() throws Throwable {
    Item clsUTFPHeapMinP1P1P1=null;
    int clsUTFPHeapMinP1P1P2P1=417;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=2;
    Item clsUTFPHeapMinP1P1P3=null;
      clsUTFPHeapMinP1P1P3=new MeuItem(clsUTFPHeapMinP1P1P3P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1=2;
    int clsUTFPHeapMinP2P2O0=2;
    Object clsUTFPHeapMinP2P2=clsUTFPHeapMinP2P2O0;
      clsUTFPHeapMin.diminuiChave(clsUTFPHeapMinP2P1,(Object)clsUTFPHeapMinP2P2);
    assertEquals("2",clsUTFPHeapMinP2P2.toString());
    assertEquals(2,clsUTFPHeapMinP2P2.hashCode());
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[-149]]]
2)----->diminuiChave[0, null], 
3)----->min[]
 Covered Branches:[16, 2, 11, 15]
 */
  @Test public void TestCase12() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=-149;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1=0;
//Exception
    try {
      clsUTFPHeapMin.diminuiChave(clsUTFPHeapMinP2P1,(Object)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    Item clsUTFPHeapMinP3R=null;
//Exception
    try {
      clsUTFPHeapMinP3R=clsUTFPHeapMin.min();
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTFPHeapMinP3R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[-2147483648]]]
2)----->constroi[], 
3)----->toString[]
 Covered Branches:[2, 9]
 */
  @Test public void TestCase13() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=-2147483648;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
      clsUTFPHeapMin.constroi();
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    char[] clsUTFPHeapMinP3RP0P1=new char[]{};
    String clsUTFPHeapMinP3RP0R=null;
      clsUTFPHeapMinP3RP0R=String.valueOf(clsUTFPHeapMinP3RP0P1);
    assertTrue(Arrays.equals(new char[]{},clsUTFPHeapMinP3RP0P1));
    assertEquals("",clsUTFPHeapMinP3RP0R);
  }
}
