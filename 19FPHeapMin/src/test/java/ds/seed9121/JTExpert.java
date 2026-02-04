package ds.seed9121;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.MeuItem;
import ds.Item;
import ds.FPHeapMin;
import java.util.Arrays;
/** 
 * This class was automatically generated to test the ds.FPHeapMin class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25]
Uncovered branches: []
Total number of branches: 25
Total number of covered branches: 25
Coverage : 100%
Evaluations : 42414
search time (ms): 42501
total runtime (ms): 44150
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[null,ds.MeuItem[-381],ds.MeuItem[952]]]
2)----->constroi[], 
3)----->toString[]
 Covered Branches:[2, 3, 4, 6, 7, 9, 10]
 */
  @Test public void TestCase0() throws Throwable {
    Item clsUTFPHeapMinP1P1P1=null;
    int clsUTFPHeapMinP1P1P2P1=-381;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=952;
    Item clsUTFPHeapMinP1P1P3=null;
      clsUTFPHeapMinP1P1P3=new MeuItem(clsUTFPHeapMinP1P1P3P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
      clsUTFPHeapMin.constroi();
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    int clsUTFPHeapMinP3RP0P1=-308;
    int clsUTFPHeapMinP3RP0R=0;
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.indexOf(clsUTFPHeapMinP3RP0P1);
    assertEquals(-1,clsUTFPHeapMinP3RP0R);
    char[] clsUTFPHeapMinP3RP1R=null;
      clsUTFPHeapMinP3RP1R=clsUTFPHeapMinP3R.toCharArray();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[906],ds.MeuItem[-764],ds.MeuItem[0],ds.MeuItem[265]]]
2)----->retiraMin[], 
3)----->toString[], 
4)----->min[]
 Covered Branches:[1, 2, 3, 4, 6, 8, 11, 12, 13, 14]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=906;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=-764;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=0;
    Item clsUTFPHeapMinP1P1P3=null;
      clsUTFPHeapMinP1P1P3=new MeuItem(clsUTFPHeapMinP1P1P3P1);
    int clsUTFPHeapMinP1P1P4P1=265;
    Item clsUTFPHeapMinP1P1P4=null;
      clsUTFPHeapMinP1P1P4=new MeuItem(clsUTFPHeapMinP1P1P4P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3,clsUTFPHeapMinP1P1P4};
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
    int clsUTFPHeapMinP2RP1P1P1=232;
    Item clsUTFPHeapMinP2RP1P1=null;
      clsUTFPHeapMinP2RP1P1=new MeuItem(clsUTFPHeapMinP2RP1P1P1);
    int clsUTFPHeapMinP2RP1R=0;
      clsUTFPHeapMinP2RP1R=clsUTFPHeapMinP2R.compara(clsUTFPHeapMinP2RP1P1);
    assertEquals("232",clsUTFPHeapMinP2RP1P1.recuperaChave().toString());
    assertEquals(-1,clsUTFPHeapMinP2RP1R);
    assertEquals("-764",clsUTFPHeapMinP2R.recuperaChave().toString());
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    String clsUTFPHeapMinP3RP0R=null;
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.toUpperCase();
    Item clsUTFPHeapMinP4R=null;
      clsUTFPHeapMinP4R=clsUTFPHeapMin.min();
    int clsUTFPHeapMinP4RP0R=0;
//Exception
    try {
      clsUTFPHeapMinP4RP0R=clsUTFPHeapMinP4R.compara((Item)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    Object clsUTFPHeapMinP4RP1R=null;
      clsUTFPHeapMinP4RP1R=clsUTFPHeapMinP4R.recuperaChave();
    assertEquals("0",clsUTFPHeapMinP4RP1R.toString());
    assertEquals(0,clsUTFPHeapMinP4RP1R.hashCode());
    assertEquals("0",clsUTFPHeapMinP4R.recuperaChave().toString());
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[-610],ds.MeuItem[-346],ds.MeuItem[-552]]]
2)----->diminuiChave[1, 957], 
3)----->min[]
 Covered Branches:[17, 2, 11, 15]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=-610;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=-346;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=-552;
    Item clsUTFPHeapMinP1P1P3=null;
      clsUTFPHeapMinP1P1P3=new MeuItem(clsUTFPHeapMinP1P1P3P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1=1;
    Integer clsUTFPHeapMinP2P2O0=957;
    Object clsUTFPHeapMinP2P2=clsUTFPHeapMinP2P2O0;
      clsUTFPHeapMin.diminuiChave(clsUTFPHeapMinP2P1,(Object)clsUTFPHeapMinP2P2);
    assertEquals("957",clsUTFPHeapMinP2P2.toString());
    assertEquals(957,clsUTFPHeapMinP2P2.hashCode());
    Item clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.min();
    Object clsUTFPHeapMinP3RP0R=null;
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.recuperaChave();
    assertEquals("957",clsUTFPHeapMinP3RP0R.toString());
    assertEquals(957,clsUTFPHeapMinP3RP0R.hashCode());
    assertEquals("957",clsUTFPHeapMinP3R.recuperaChave().toString());
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[752]
2)----->copia[[null,ds.MeuItem[3]]], 
3)----->toString[]
 Covered Branches:[1, 24, 25]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTFPHeapMinP1P1=752;
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    Item clsUTFPHeapMinP2P1P1=null;
    int clsUTFPHeapMinP2P1P2P1=3;
    Item clsUTFPHeapMinP2P1P2=null;
      clsUTFPHeapMinP2P1P2=new MeuItem(clsUTFPHeapMinP2P1P2P1);
    Item[] clsUTFPHeapMinP2P1=new Item[]{clsUTFPHeapMinP2P1P1,clsUTFPHeapMinP2P1P2};
      clsUTFPHeapMin.copia(clsUTFPHeapMinP2P1);
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    int clsUTFPHeapMinP3RP0R=0;
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.lastIndexOf(clsUTFPHeapMinP3R);
    assertEquals(0,clsUTFPHeapMinP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[740],ds.MeuItem[-225],ds.MeuItem[-787],ds.MeuItem[1]]]
2)----->imprime[], 
3)----->toString[]
 Covered Branches:[2, 22, 23]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=740;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=-225;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=-787;
    Item clsUTFPHeapMinP1P1P3=null;
      clsUTFPHeapMinP1P1P3=new MeuItem(clsUTFPHeapMinP1P1P3P1);
    int clsUTFPHeapMinP1P1P4P1=1;
    Item clsUTFPHeapMinP1P1P4=null;
      clsUTFPHeapMinP1P1P4=new MeuItem(clsUTFPHeapMinP1P1P4P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3,clsUTFPHeapMinP1P1P4};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
      clsUTFPHeapMin.imprime();
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    double clsUTFPHeapMinP3RP0P1=12.504998488178984D;
    String clsUTFPHeapMinP3RP0R=null;
      clsUTFPHeapMinP3RP0R=String.valueOf(clsUTFPHeapMinP3RP0P1);
    assertEquals("12.504998488178984",clsUTFPHeapMinP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[-351],ds.MeuItem[0],ds.MeuItem[1]]]
2)----->diminuiChave[2, -63], 
3)----->toString[]
 Covered Branches:[17, 2, 18, 15]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=-351;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=0;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=1;
    Item clsUTFPHeapMinP1P1P3=null;
      clsUTFPHeapMinP1P1P3=new MeuItem(clsUTFPHeapMinP1P1P3P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1=2;
    Integer clsUTFPHeapMinP2P2O0=-63;
    Object clsUTFPHeapMinP2P2=clsUTFPHeapMinP2P2O0;
      clsUTFPHeapMin.diminuiChave(clsUTFPHeapMinP2P1,(Object)clsUTFPHeapMinP2P2);
    assertEquals("-63",clsUTFPHeapMinP2P2.toString());
    assertEquals(-63,clsUTFPHeapMinP2P2.hashCode());
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    String clsUTFPHeapMinP3RP0P1=new String("c^]n]##)]_v=@]_f]muz}}$m@");
    int clsUTFPHeapMinP3RP0P2=632;
    String[] clsUTFPHeapMinP3RP0R=null;
//Exception
    try {
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.split(clsUTFPHeapMinP3RP0P1,clsUTFPHeapMinP3RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTFPHeapMinP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[]]
2)----->insere[ds.MeuItem[-498]], 
3)----->toString[], 
4)----->min[]
 Covered Branches:[2, 19, 20, 11]
 */
  @Test public void TestCase6() throws Throwable {
    Item[] clsUTFPHeapMinP1P1=new Item[]{};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1P1=-498;
    Item clsUTFPHeapMinP2P1=null;
      clsUTFPHeapMinP2P1=new MeuItem(clsUTFPHeapMinP2P1P1);
//Exception
    try {
      clsUTFPHeapMin.insere(clsUTFPHeapMinP2P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("-498",clsUTFPHeapMinP2P1.recuperaChave().toString());
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    String clsUTFPHeapMinP3RP0R=null;
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.trim();
    int clsUTFPHeapMinP3RP1P1=575;
    int clsUTFPHeapMinP3RP1P2=3;
    int clsUTFPHeapMinP3RP1R=0;
      clsUTFPHeapMinP3RP1R=clsUTFPHeapMinP3R.lastIndexOf(clsUTFPHeapMinP3RP1P1,clsUTFPHeapMinP3RP1P2);
    assertEquals(-1,clsUTFPHeapMinP3RP1R);
    Item clsUTFPHeapMinP4R=null;
//Exception
    try {
      clsUTFPHeapMinP4R=clsUTFPHeapMin.min();
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTFPHeapMinP4R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[1]
2)----->insere[ds.MeuItem[637]], 
3)----->toString[]
 Covered Branches:[1, 17, 19, 21, 15]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTFPHeapMinP1P1=1;
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1P1=637;
    Item clsUTFPHeapMinP2P1=null;
      clsUTFPHeapMinP2P1=new MeuItem(clsUTFPHeapMinP2P1P1);
      clsUTFPHeapMin.insere(clsUTFPHeapMinP2P1);
    assertEquals("637",clsUTFPHeapMinP2P1.recuperaChave().toString());
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    String clsUTFPHeapMinP3RP0R=null;
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.trim();
    int clsUTFPHeapMinP3RP1R=0;
      clsUTFPHeapMinP3RP1R=clsUTFPHeapMinP3R.length();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[982]
2)----->constroi[], 
3)----->toString[]
 Covered Branches:[1, 9]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTFPHeapMinP1P1=982;
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
      clsUTFPHeapMin.constroi();
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[299]
2)----->diminuiChave[45, forName[String]], 
3)----->min[]
 Covered Branches:[16, 1, 11, 15]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTFPHeapMinP1P1=299;
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1=45;
//Exception
    try {
      clsUTFPHeapMin.diminuiChave(clsUTFPHeapMinP2P1,(Object)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    Item clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.min();
    assertNull(clsUTFPHeapMinP3R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[20],ds.MeuItem[2],ds.MeuItem[1],ds.MeuItem[-60]]]
2)----->retiraMin[], 
3)----->toString[]
 Covered Branches:[2, 3, 4, 6, 7, 12, 14]
 */
  @Test public void TestCase10() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=20;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=2;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=1;
    Item clsUTFPHeapMinP1P1P3=null;
      clsUTFPHeapMinP1P1P3=new MeuItem(clsUTFPHeapMinP1P1P3P1);
    int clsUTFPHeapMinP1P1P4P1=-60;
    Item clsUTFPHeapMinP1P1P4=null;
      clsUTFPHeapMinP1P1P4=new MeuItem(clsUTFPHeapMinP1P1P4P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3,clsUTFPHeapMinP1P1P4};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    Item clsUTFPHeapMinP2R=null;
      clsUTFPHeapMinP2R=clsUTFPHeapMin.retiraMin();
    Object clsUTFPHeapMinP2RP0R=null;
      clsUTFPHeapMinP2RP0R=clsUTFPHeapMinP2R.recuperaChave();
    assertEquals("2",clsUTFPHeapMinP2RP0R.toString());
    assertEquals(2,clsUTFPHeapMinP2RP0R.hashCode());
    assertEquals("2",clsUTFPHeapMinP2R.recuperaChave().toString());
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    String clsUTFPHeapMinP3RP0R=null;
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.toLowerCase();
    int clsUTFPHeapMinP3RP1P1=-846;
    int clsUTFPHeapMinP3RP1R=0;
      clsUTFPHeapMinP3RP1R=clsUTFPHeapMinP3R.indexOf(clsUTFPHeapMinP3RP1P1);
    assertEquals(-1,clsUTFPHeapMinP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[747],ds.MeuItem[-52]]]
2)----->refaz[0, 1], 
3)----->min[]
 Covered Branches:[2, 3, 4, 5, 8, 11]
 */
  @Test public void TestCase11() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=747;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=-52;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1=0;
    int clsUTFPHeapMinP2P2=1;
      clsUTFPHeapMin.refaz(clsUTFPHeapMinP2P1,clsUTFPHeapMinP2P2);
    Item clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.min();
    Object clsUTFPHeapMinP3RP0R=null;
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.recuperaChave();
    assertEquals("747",clsUTFPHeapMinP3RP0R.toString());
    assertEquals(747,clsUTFPHeapMinP3RP0R.hashCode());
    assertEquals("747",clsUTFPHeapMinP3R.recuperaChave().toString());
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[]]
2)----->imprime[], 
3)----->toString[]
 Covered Branches:[2, 22]
 */
  @Test public void TestCase12() throws Throwable {
    Item[] clsUTFPHeapMinP1P1=new Item[]{};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
      clsUTFPHeapMin.imprime();
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    int clsUTFPHeapMinP3RP0P1=0;
    int clsUTFPHeapMinP3RP0P2=232;
    String clsUTFPHeapMinP3RP0R=null;
//Exception
    try {
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.substring(clsUTFPHeapMinP3RP0P1,clsUTFPHeapMinP3RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTFPHeapMinP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[0],ds.MeuItem[1],ds.MeuItem[2],ds.MeuItem[0]]]
2)----->copia[[]], 
3)----->min[], 
4)----->toString[]
 Covered Branches:[2, 24, 11]
 */
  @Test public void TestCase13() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=0;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=1;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=2;
    Item clsUTFPHeapMinP1P1P3=null;
      clsUTFPHeapMinP1P1P3=new MeuItem(clsUTFPHeapMinP1P1P3P1);
    int clsUTFPHeapMinP1P1P4P1=0;
    Item clsUTFPHeapMinP1P1P4=null;
      clsUTFPHeapMinP1P1P4=new MeuItem(clsUTFPHeapMinP1P1P4P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3,clsUTFPHeapMinP1P1P4};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    Item[] clsUTFPHeapMinP2P1=new Item[]{};
      clsUTFPHeapMin.copia(clsUTFPHeapMinP2P1);
    Item clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.min();
    Object clsUTFPHeapMinP3RP0R=null;
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.recuperaChave();
    assertEquals("1",clsUTFPHeapMinP3RP0R.toString());
    assertEquals(1,clsUTFPHeapMinP3RP0R.hashCode());
    assertEquals("1",clsUTFPHeapMinP3R.recuperaChave().toString());
    String clsUTFPHeapMinP4R=null;
      clsUTFPHeapMinP4R=clsUTFPHeapMin.toString();
    String clsUTFPHeapMinP4RP0P1=new String("(Ya{w~;`vLpuj`r@w]$NZcQ!{cT|Rns?<asE!v;DyFiN)&)j/(AYA%oT:T%#lHFYI{?{LW");
    boolean clsUTFPHeapMinP4RP0R=false;
//Exception
    try {
      clsUTFPHeapMinP4RP0R=clsUTFPHeapMinP4R.matches(clsUTFPHeapMinP4RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
  }
}
