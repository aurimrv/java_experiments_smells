package ds.seed5503;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Item;
import java.util.Arrays;
import ds.MeuItem;
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
Evaluations : 42890
search time (ms): 42501
total runtime (ms): 44212
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[591]
2)----->copia[[]], 
3)----->toString[]
 Covered Branches:[1, 24]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTFPHeapMinP1P1=591;
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    Item[] clsUTFPHeapMinP2P1=new Item[]{};
      clsUTFPHeapMin.copia(clsUTFPHeapMinP2P1);
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[744]
2)----->copia[[min[],retiraMin[],ds.MeuItem[551]]], 
3)----->toString[], 
4)----->min[]
 Covered Branches:[1, 24, 25, 11]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTFPHeapMinP1P1=744;
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    Item[] clsUTFPHeapMinP2P1P1P0P1=new Item[]{};
    FPHeapMin clsUTFPHeapMinP2P1P1P0=null;
      clsUTFPHeapMinP2P1P1P0=new FPHeapMin(clsUTFPHeapMinP2P1P1P0P1);
    Item clsUTFPHeapMinP2P1P1=null;
//Exception
    try {
      clsUTFPHeapMinP2P1P1=clsUTFPHeapMinP2P1P1P0.min();
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    Item[] clsUTFPHeapMinP2P1P2P0P1=new Item[]{};
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
    int clsUTFPHeapMinP2P1P3P1=551;
    Item clsUTFPHeapMinP2P1P3=null;
      clsUTFPHeapMinP2P1P3=new MeuItem(clsUTFPHeapMinP2P1P3P1);
    Item[] clsUTFPHeapMinP2P1=new Item[]{clsUTFPHeapMinP2P1P1,clsUTFPHeapMinP2P1P2,clsUTFPHeapMinP2P1P3};
      clsUTFPHeapMin.copia(clsUTFPHeapMinP2P1);
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    boolean clsUTFPHeapMinP3RP0R=false;
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.isEmpty();
    assertEquals(false,clsUTFPHeapMinP3RP0R);
    Item clsUTFPHeapMinP4R=null;
      clsUTFPHeapMinP4R=clsUTFPHeapMin.min();
    assertNull(clsUTFPHeapMinP4R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[]]
2)----->imprime[], 
3)----->toString[]
 Covered Branches:[2, 22]
 */
  @Test public void TestCase2() throws Throwable {
    Item[] clsUTFPHeapMinP1P1=new Item[]{};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
      clsUTFPHeapMin.imprime();
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[-36],ds.MeuItem[-802]]]
2)----->insere[ds.MeuItem[885]], 
3)----->toString[], 
4)----->min[]
 Covered Branches:[1, 2, 19, 20, 11]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=-36;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=-802;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1P1=885;
    Item clsUTFPHeapMinP2P1=null;
      clsUTFPHeapMinP2P1=new MeuItem(clsUTFPHeapMinP2P1P1);
//Exception
    try {
      clsUTFPHeapMin.insere(clsUTFPHeapMinP2P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("885",clsUTFPHeapMinP2P1.recuperaChave().toString());
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    int clsUTFPHeapMinP3RP0P1=-22;
    int clsUTFPHeapMinP3RP0R=0;
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.indexOf(clsUTFPHeapMinP3RP0P1);
    assertEquals(-1,clsUTFPHeapMinP3RP0R);
    char[] clsUTFPHeapMinP3RP1P1=new char[]{'\u0026','\u7d19','\u0060','\u0049'};
    String clsUTFPHeapMinP3RP1R=null;
      clsUTFPHeapMinP3RP1R=String.copyValueOf(clsUTFPHeapMinP3RP1P1);
    assertTrue(Arrays.equals(new char[]{'\u0026','\u7d19','\u0060','\u0049'},clsUTFPHeapMinP3RP1P1));
    assertEquals("&紙`I",clsUTFPHeapMinP3RP1R);
    Item clsUTFPHeapMinP4R=null;
      clsUTFPHeapMinP4R=clsUTFPHeapMin.min();
    int clsUTFPHeapMinP4RP0P1P1=729;
    Item clsUTFPHeapMinP4RP0P1=null;
      clsUTFPHeapMinP4RP0P1=new MeuItem(clsUTFPHeapMinP4RP0P1P1);
    int clsUTFPHeapMinP4RP0R=0;
      clsUTFPHeapMinP4RP0R=clsUTFPHeapMinP4R.compara(clsUTFPHeapMinP4RP0P1);
    assertEquals("729",clsUTFPHeapMinP4RP0P1.recuperaChave().toString());
    assertEquals(-1,clsUTFPHeapMinP4RP0R);
    assertEquals("-802",clsUTFPHeapMinP4R.recuperaChave().toString());
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[314]
2)----->insere[ds.MeuItem[-704]], 
3)----->min[]
 Covered Branches:[1, 17, 2, 19, 21, 11, 12, 13, 15]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTFPHeapMinP1P1=314;
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1P1=-704;
    Item clsUTFPHeapMinP2P1=null;
      clsUTFPHeapMinP2P1=new MeuItem(clsUTFPHeapMinP2P1P1);
      clsUTFPHeapMin.insere(clsUTFPHeapMinP2P1);
    assertEquals("-704",clsUTFPHeapMinP2P1.recuperaChave().toString());
    Item clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.min();
    int clsUTFPHeapMinP3RP0P1P1=-756;
    Item clsUTFPHeapMinP3RP0P1=null;
      clsUTFPHeapMinP3RP0P1=new MeuItem(clsUTFPHeapMinP3RP0P1P1);
    int clsUTFPHeapMinP3RP0R=0;
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.compara(clsUTFPHeapMinP3RP0P1);
    assertEquals("-756",clsUTFPHeapMinP3RP0P1.recuperaChave().toString());
    assertEquals(1,clsUTFPHeapMinP3RP0R);
    assertEquals("-704",clsUTFPHeapMinP3R.recuperaChave().toString());
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[-467],ds.MeuItem[466],ds.MeuItem[-803],ds.MeuItem[649]]]
2)----->imprime[], 
3)----->toString[], 
4)----->min[]
 Covered Branches:[2, 22, 23, 11]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=-467;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=466;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=-803;
    Item clsUTFPHeapMinP1P1P3=null;
      clsUTFPHeapMinP1P1P3=new MeuItem(clsUTFPHeapMinP1P1P3P1);
    int clsUTFPHeapMinP1P1P4P1=649;
    Item clsUTFPHeapMinP1P1P4=null;
      clsUTFPHeapMinP1P1P4=new MeuItem(clsUTFPHeapMinP1P1P4P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3,clsUTFPHeapMinP1P1P4};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
      clsUTFPHeapMin.imprime();
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    int clsUTFPHeapMinP3RP0R=0;
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.length();
    String clsUTFPHeapMinP3RP1R=null;
      clsUTFPHeapMinP3RP1R=clsUTFPHeapMinP3R.toLowerCase();
    Item clsUTFPHeapMinP4R=null;
      clsUTFPHeapMinP4R=clsUTFPHeapMin.min();
    assertEquals("466",clsUTFPHeapMinP4R.recuperaChave().toString());
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[641],ds.MeuItem[800]]]
2)----->retiraMin[], 
3)----->toString[], 
4)----->min[]
 Covered Branches:[2, 3, 11, 12, 14]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=641;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=800;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    Item clsUTFPHeapMinP2R=null;
      clsUTFPHeapMinP2R=clsUTFPHeapMin.retiraMin();
    Object clsUTFPHeapMinP2RP0R=null;
      clsUTFPHeapMinP2RP0R=clsUTFPHeapMinP2R.recuperaChave();
    assertEquals("800",clsUTFPHeapMinP2RP0R.toString());
    assertEquals(800,clsUTFPHeapMinP2RP0R.hashCode());
    int clsUTFPHeapMinP2RP1R=0;
//Exception
    try {
      clsUTFPHeapMinP2RP1R=clsUTFPHeapMinP2R.compara((Item)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    String clsUTFPHeapMinP3RP0P1=new String("']|:>!_)^*<$&(@;={-/`}");
    byte[] clsUTFPHeapMinP3RP0R=null;
//Exception
    try {
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.getBytes(clsUTFPHeapMinP3RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTFPHeapMinP3RP0R);
    Item clsUTFPHeapMinP4R=null;
      clsUTFPHeapMinP4R=clsUTFPHeapMin.min();
    Object clsUTFPHeapMinP4RP0R=null;
      clsUTFPHeapMinP4RP0R=clsUTFPHeapMinP4R.recuperaChave();
    assertEquals("800",clsUTFPHeapMinP4RP0R.toString());
    assertEquals(800,clsUTFPHeapMinP4RP0R.hashCode());
    Object clsUTFPHeapMinP4RP1R=null;
      clsUTFPHeapMinP4RP1R=clsUTFPHeapMinP4R.recuperaChave();
    assertEquals("800",clsUTFPHeapMinP4RP1R.toString());
    assertEquals(800,clsUTFPHeapMinP4RP1R.hashCode());
    assertEquals("800",clsUTFPHeapMinP4R.recuperaChave().toString());
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[-230],ds.MeuItem[1]]]
2)----->refaz[0, 105], 
3)----->min[]
 Covered Branches:[2, 3, 4, 6, 7, 11]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=-230;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=1;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1=0;
    int clsUTFPHeapMinP2P2=105;
      clsUTFPHeapMin.refaz(clsUTFPHeapMinP2P1,clsUTFPHeapMinP2P2);
    Item clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.min();
    assertEquals("1",clsUTFPHeapMinP3R.recuperaChave().toString());
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[2]
2)----->insere[ds.MeuItem[117]], 
3)----->toString[]
 Covered Branches:[1, 17, 19, 21, 15]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTFPHeapMinP1P1=2;
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1P1=117;
    Item clsUTFPHeapMinP2P1=null;
      clsUTFPHeapMinP2P1=new MeuItem(clsUTFPHeapMinP2P1P1);
      clsUTFPHeapMin.insere(clsUTFPHeapMinP2P1);
    assertEquals("117",clsUTFPHeapMinP2P1.recuperaChave().toString());
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[1],ds.MeuItem[908]]]
2)----->diminuiChave[1, null], 
3)----->min[], 
4)----->toString[]
 Covered Branches:[16, 2, 11, 15]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=1;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=908;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2};
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
    assertEquals("908",clsUTFPHeapMinP3R.recuperaChave().toString());
    String clsUTFPHeapMinP4R=null;
      clsUTFPHeapMinP4R=clsUTFPHeapMin.toString();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[883],ds.MeuItem[-663],ds.MeuItem[883],ds.MeuItem[383]]]
2)----->refaz[1, 3], 
3)----->min[]
 Covered Branches:[2, 3, 4, 5, 7, 11]
 */
  @Test public void TestCase10() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=883;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=-663;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=883;
    Item clsUTFPHeapMinP1P1P3=null;
      clsUTFPHeapMinP1P1P3=new MeuItem(clsUTFPHeapMinP1P1P3P1);
    int clsUTFPHeapMinP1P1P4P1=383;
    Item clsUTFPHeapMinP1P1P4=null;
      clsUTFPHeapMinP1P1P4=new MeuItem(clsUTFPHeapMinP1P1P4P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3,clsUTFPHeapMinP1P1P4};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1=1;
    int clsUTFPHeapMinP2P2=3;
      clsUTFPHeapMin.refaz(clsUTFPHeapMinP2P1,clsUTFPHeapMinP2P2);
    Item clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.min();
    Object clsUTFPHeapMinP3RP0R=null;
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.recuperaChave();
    assertEquals("-663",clsUTFPHeapMinP3RP0R.toString());
    assertEquals(-663,clsUTFPHeapMinP3RP0R.hashCode());
    Object clsUTFPHeapMinP3RP1R=null;
      clsUTFPHeapMinP3RP1R=clsUTFPHeapMinP3R.recuperaChave();
    assertEquals("-663",clsUTFPHeapMinP3RP1R.toString());
    assertEquals(-663,clsUTFPHeapMinP3RP1R.hashCode());
    assertEquals("-663",clsUTFPHeapMinP3R.recuperaChave().toString());
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[791]
2)----->constroi[], 
3)----->toString[]
 Covered Branches:[1, 9]
 */
  @Test public void TestCase11() throws Throwable {
    int clsUTFPHeapMinP1P1=791;
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
      clsUTFPHeapMin.constroi();
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[1],ds.MeuItem[481],ds.MeuItem[410],ds.MeuItem[999]]]
2)----->diminuiChave[2, -360], 
3)----->toString[], 
4)----->min[]
 Covered Branches:[17, 2, 18, 11, 15]
 */
  @Test public void TestCase12() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=1;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=481;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=410;
    Item clsUTFPHeapMinP1P1P3=null;
      clsUTFPHeapMinP1P1P3=new MeuItem(clsUTFPHeapMinP1P1P3P1);
    int clsUTFPHeapMinP1P1P4P1=999;
    Item clsUTFPHeapMinP1P1P4=null;
      clsUTFPHeapMinP1P1P4=new MeuItem(clsUTFPHeapMinP1P1P4P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3,clsUTFPHeapMinP1P1P4};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1=2;
    Integer clsUTFPHeapMinP2P2O0=-360;
    Object clsUTFPHeapMinP2P2=clsUTFPHeapMinP2P2O0;
      clsUTFPHeapMin.diminuiChave(clsUTFPHeapMinP2P1,(Object)clsUTFPHeapMinP2P2);
    assertEquals("-360",clsUTFPHeapMinP2P2.toString());
    assertEquals(-360,clsUTFPHeapMinP2P2.hashCode());
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    int clsUTFPHeapMinP3RP0P1=92;
    int clsUTFPHeapMinP3RP0P2=-381;
    int clsUTFPHeapMinP3RP0R=0;
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.indexOf(clsUTFPHeapMinP3RP0P1,clsUTFPHeapMinP3RP0P2);
    assertEquals(-1,clsUTFPHeapMinP3RP0R);
    Item clsUTFPHeapMinP4R=null;
      clsUTFPHeapMinP4R=clsUTFPHeapMin.min();
    Object clsUTFPHeapMinP4RP0R=null;
      clsUTFPHeapMinP4RP0R=clsUTFPHeapMinP4R.recuperaChave();
    assertEquals("-360",clsUTFPHeapMinP4RP0R.toString());
    assertEquals(-360,clsUTFPHeapMinP4RP0R.hashCode());
    Object clsUTFPHeapMinP4RP1R=null;
      clsUTFPHeapMinP4RP1R=clsUTFPHeapMinP4R.recuperaChave();
    assertEquals("-360",clsUTFPHeapMinP4RP1R.toString());
    assertEquals(-360,clsUTFPHeapMinP4RP1R.hashCode());
    assertEquals("-360",clsUTFPHeapMinP4R.recuperaChave().toString());
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[-526],ds.MeuItem[2],ds.MeuItem[-862],ds.MeuItem[-666]]]
2)----->constroi[], 
3)----->toString[]
 Covered Branches:[2, 3, 4, 6, 8, 9, 10]
 */
  @Test public void TestCase13() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=-526;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=2;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=-862;
    Item clsUTFPHeapMinP1P1P3=null;
      clsUTFPHeapMinP1P1P3=new MeuItem(clsUTFPHeapMinP1P1P3P1);
    int clsUTFPHeapMinP1P1P4P1=-666;
    Item clsUTFPHeapMinP1P1P4=null;
      clsUTFPHeapMinP1P1P4=new MeuItem(clsUTFPHeapMinP1P1P4P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3,clsUTFPHeapMinP1P1P4};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
      clsUTFPHeapMin.constroi();
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    boolean clsUTFPHeapMinP3RP0R=false;
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.isEmpty();
    assertEquals(false,clsUTFPHeapMinP3RP0R);
  }
}
