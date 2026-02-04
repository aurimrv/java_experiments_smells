package ds.seed5831;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import java.util.Arrays;
import ds.MeuItem;
import ds.Item;
import ds.FPHeapMin;
import java.nio.charset.Charset;
/** 
 * This class was automatically generated to test the ds.FPHeapMin class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25]
Uncovered branches: []
Total number of branches: 25
Total number of covered branches: 25
Coverage : 100%
Evaluations : 41181
search time (ms): 42503
total runtime (ms): 44228
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[861]
2)----->refaz[489, 939], 
3)----->min[]
 Covered Branches:[1, 3, 11]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTFPHeapMinP1P1=861;
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1=489;
    int clsUTFPHeapMinP2P2=939;
      clsUTFPHeapMin.refaz(clsUTFPHeapMinP2P1,clsUTFPHeapMinP2P2);
    Item clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.min();
    assertNull(clsUTFPHeapMinP3R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[-286],ds.MeuItem[-648],ds.MeuItem[1],ds.MeuItem[-972]]]
2)----->constroi[], 
3)----->toString[]
 Covered Branches:[2, 3, 4, 5, 8, 9, 10]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=-286;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=-648;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=1;
    Item clsUTFPHeapMinP1P1P3=null;
      clsUTFPHeapMinP1P1P3=new MeuItem(clsUTFPHeapMinP1P1P3P1);
    int clsUTFPHeapMinP1P1P4P1=-972;
    Item clsUTFPHeapMinP1P1P4=null;
      clsUTFPHeapMinP1P1P4=new MeuItem(clsUTFPHeapMinP1P1P4P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3,clsUTFPHeapMinP1P1P4};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
      clsUTFPHeapMin.constroi();
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    byte[] clsUTFPHeapMinP3RP0R=null;
//Exception
    try {
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.getBytes(clsUTFPHeapMinP3R);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTFPHeapMinP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[-768],ds.MeuItem[-995],ds.MeuItem[3],ds.MeuItem[-493]]]
2)----->diminuiChave[3, null], 
3)----->min[]
 Covered Branches:[16, 2, 11, 15]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=-768;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=-995;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=3;
    Item clsUTFPHeapMinP1P1P3=null;
      clsUTFPHeapMinP1P1P3=new MeuItem(clsUTFPHeapMinP1P1P3P1);
    int clsUTFPHeapMinP1P1P4P1=-493;
    Item clsUTFPHeapMinP1P1P4=null;
      clsUTFPHeapMinP1P1P4=new MeuItem(clsUTFPHeapMinP1P1P4P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3,clsUTFPHeapMinP1P1P4};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1=3;
//Exception
    try {
      clsUTFPHeapMin.diminuiChave(clsUTFPHeapMinP2P1,(Object)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    Item clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.min();
    Object clsUTFPHeapMinP3RP0R=null;
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.recuperaChave();
    assertEquals("-995",clsUTFPHeapMinP3RP0R.toString());
    assertEquals(-995,clsUTFPHeapMinP3RP0R.hashCode());
    Object clsUTFPHeapMinP3RP1R=null;
      clsUTFPHeapMinP3RP1R=clsUTFPHeapMinP3R.recuperaChave();
    assertEquals("-995",clsUTFPHeapMinP3RP1R.toString());
    assertEquals(-995,clsUTFPHeapMinP3RP1R.hashCode());
    assertEquals("-995",clsUTFPHeapMinP3R.recuperaChave().toString());
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[-851],ds.MeuItem[2],ds.MeuItem[1]]]
2)----->imprime[], 
3)----->toString[], 
4)----->min[]
 Covered Branches:[2, 22, 23, 11]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=-851;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=2;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=1;
    Item clsUTFPHeapMinP1P1P3=null;
      clsUTFPHeapMinP1P1P3=new MeuItem(clsUTFPHeapMinP1P1P3P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
      clsUTFPHeapMin.imprime();
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    String clsUTFPHeapMinP3RP0P1=new String("/i)fc2c&#h|#)<nj5zofw1)wo&n=7ol!iv*3 1m0wmv )42?");
    int clsUTFPHeapMinP3RP0R=0;
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.compareToIgnoreCase(clsUTFPHeapMinP3RP0P1);
    assertEquals("/i)fc2c&#h|#)<nj5zofw1)wo&n=7ol!iv*3 1m0wmv )42?",clsUTFPHeapMinP3RP0P1.toString());
    assertEquals(53,clsUTFPHeapMinP3RP0R);
    String clsUTFPHeapMinP3RP1P1=new String("8rutfsoj63vyp41kdmn5iq2");
    byte[] clsUTFPHeapMinP3RP1R=null;
//Exception
    try {
      clsUTFPHeapMinP3RP1R=clsUTFPHeapMinP3R.getBytes(clsUTFPHeapMinP3RP1P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("8rutfsoj63vyp41kdmn5iq2",clsUTFPHeapMinP3RP1P1.toString());
    assertNull(clsUTFPHeapMinP3RP1R);
    Item clsUTFPHeapMinP4R=null;
      clsUTFPHeapMinP4R=clsUTFPHeapMin.min();
    assertEquals("2",clsUTFPHeapMinP4R.recuperaChave().toString());
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[1]
2)----->copia[[min[],ds.MeuItem[988]]], 
3)----->toString[]
 Covered Branches:[1, 24, 25]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTFPHeapMinP1P1=1;
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    Item clsUTFPHeapMinP2P1P1P0P1P1=null;
    Item[] clsUTFPHeapMinP2P1P1P0P1=new Item[]{clsUTFPHeapMinP2P1P1P0P1P1};
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
    int clsUTFPHeapMinP2P1P2P1=988;
    Item clsUTFPHeapMinP2P1P2=null;
      clsUTFPHeapMinP2P1P2=new MeuItem(clsUTFPHeapMinP2P1P2P1);
    Item[] clsUTFPHeapMinP2P1=new Item[]{clsUTFPHeapMinP2P1P1,clsUTFPHeapMinP2P1P2};
      clsUTFPHeapMin.copia(clsUTFPHeapMinP2P1);
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    char[] clsUTFPHeapMinP3RP0P1=new char[]{};
    String clsUTFPHeapMinP3RP0R=null;
      clsUTFPHeapMinP3RP0R=String.valueOf(clsUTFPHeapMinP3RP0P1);
    assertTrue(Arrays.equals(new char[]{},clsUTFPHeapMinP3RP0P1));
    assertEquals("",clsUTFPHeapMinP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[508],ds.MeuItem[793],ds.MeuItem[361],ds.MeuItem[0]]]
2)----->insere[ds.MeuItem[630]], 
3)----->min[], 
4)----->toString[]
 Covered Branches:[1, 2, 19, 3, 20, 11, 12, 13, 14]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=508;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=793;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=361;
    Item clsUTFPHeapMinP1P1P3=null;
      clsUTFPHeapMinP1P1P3=new MeuItem(clsUTFPHeapMinP1P1P3P1);
    int clsUTFPHeapMinP1P1P4P1=0;
    Item clsUTFPHeapMinP1P1P4=null;
      clsUTFPHeapMinP1P1P4=new MeuItem(clsUTFPHeapMinP1P1P4P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3,clsUTFPHeapMinP1P1P4};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1P1=630;
    Item clsUTFPHeapMinP2P1=null;
      clsUTFPHeapMinP2P1=new MeuItem(clsUTFPHeapMinP2P1P1);
//Exception
    try {
      clsUTFPHeapMin.insere(clsUTFPHeapMinP2P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("630",clsUTFPHeapMinP2P1.recuperaChave().toString());
    Item clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.min();
    Object clsUTFPHeapMinP3RP0R=null;
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.recuperaChave();
    assertEquals("793",clsUTFPHeapMinP3RP0R.toString());
    assertEquals(793,clsUTFPHeapMinP3RP0R.hashCode());
    int clsUTFPHeapMinP3RP1R=0;
//Exception
    try {
      clsUTFPHeapMinP3RP1R=clsUTFPHeapMinP3R.compara((Item)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("793",clsUTFPHeapMinP3R.recuperaChave().toString());
    String clsUTFPHeapMinP4R=null;
      clsUTFPHeapMinP4R=clsUTFPHeapMin.toString();
    String clsUTFPHeapMinP4RP0R=null;
      clsUTFPHeapMinP4RP0R=clsUTFPHeapMinP4R.toLowerCase();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[-131],ds.MeuItem[604]]]
2)----->refaz[1, 1], 
3)----->min[]
 Covered Branches:[1, 2, 3, 4, 6, 11, 12, 13, 14]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=-131;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=604;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1=1;
    int clsUTFPHeapMinP2P2=1;
      clsUTFPHeapMin.refaz(clsUTFPHeapMinP2P1,clsUTFPHeapMinP2P2);
    Item clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.min();
    Object clsUTFPHeapMinP3RP0R=null;
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.recuperaChave();
    assertEquals("604",clsUTFPHeapMinP3RP0R.toString());
    assertEquals(604,clsUTFPHeapMinP3RP0R.hashCode());
    int clsUTFPHeapMinP3RP1R=0;
//Exception
    try {
      clsUTFPHeapMinP3RP1R=clsUTFPHeapMinP3R.compara((Item)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("604",clsUTFPHeapMinP3R.recuperaChave().toString());
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[654]
2)----->insere[ds.MeuItem[665]], 
3)----->toString[], 
4)----->min[]
 Covered Branches:[1, 17, 19, 21, 11, 15]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTFPHeapMinP1P1=654;
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1P1=665;
    Item clsUTFPHeapMinP2P1=null;
      clsUTFPHeapMinP2P1=new MeuItem(clsUTFPHeapMinP2P1P1);
      clsUTFPHeapMin.insere(clsUTFPHeapMinP2P1);
    assertEquals("665",clsUTFPHeapMinP2P1.recuperaChave().toString());
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    Charset clsUTFPHeapMinP3RP0P1=null;
      clsUTFPHeapMinP3RP0P1=Charset.defaultCharset();
    byte[] clsUTFPHeapMinP3RP0R=null;
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.getBytes(clsUTFPHeapMinP3RP0P1);
    assertEquals("UTF-8",clsUTFPHeapMinP3RP0P1.toString());
    assertEquals("UTF-8",clsUTFPHeapMinP3RP0P1.displayName());
    assertEquals(81070450,clsUTFPHeapMinP3RP0P1.hashCode());
    Item clsUTFPHeapMinP4R=null;
      clsUTFPHeapMinP4R=clsUTFPHeapMin.min();
    assertEquals("665",clsUTFPHeapMinP4R.recuperaChave().toString());
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[2147483647],ds.MeuItem[-470]]]
2)----->retiraMin[], 
3)----->toString[]
 Covered Branches:[2, 3, 12, 14]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=2147483647;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=-470;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    Item clsUTFPHeapMinP2R=null;
      clsUTFPHeapMinP2R=clsUTFPHeapMin.retiraMin();
    int clsUTFPHeapMinP2RP0P1P1=245;
    Item clsUTFPHeapMinP2RP0P1=null;
      clsUTFPHeapMinP2RP0P1=new MeuItem(clsUTFPHeapMinP2RP0P1P1);
    int clsUTFPHeapMinP2RP0R=0;
      clsUTFPHeapMinP2RP0R=clsUTFPHeapMinP2R.compara(clsUTFPHeapMinP2RP0P1);
    assertEquals("245",clsUTFPHeapMinP2RP0P1.recuperaChave().toString());
    assertEquals(-1,clsUTFPHeapMinP2RP0R);
    Object clsUTFPHeapMinP2RP1R=null;
      clsUTFPHeapMinP2RP1R=clsUTFPHeapMinP2R.recuperaChave();
    assertEquals("-470",clsUTFPHeapMinP2RP1R.toString());
    assertEquals(-470,clsUTFPHeapMinP2RP1R.hashCode());
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[2],ds.MeuItem[434]]]
2)----->refaz[0, 0], 
3)----->min[]
 Covered Branches:[2, 3, 4, 6, 7, 11]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=2;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=434;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1=0;
    int clsUTFPHeapMinP2P2=0;
      clsUTFPHeapMin.refaz(clsUTFPHeapMinP2P1,clsUTFPHeapMinP2P2);
    Item clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.min();
    Object clsUTFPHeapMinP3RP0R=null;
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.recuperaChave();
    assertEquals("434",clsUTFPHeapMinP3RP0R.toString());
    assertEquals(434,clsUTFPHeapMinP3RP0R.hashCode());
    assertEquals("434",clsUTFPHeapMinP3R.recuperaChave().toString());
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[1]
2)----->copia[[retiraMin[]]], 
3)----->min[], 
4)----->toString[]
 Covered Branches:[1, 24, 11]
 */
  @Test public void TestCase10() throws Throwable {
    int clsUTFPHeapMinP1P1=1;
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    Item clsUTFPHeapMinP2P1P1P0P1P1=null;
    Item clsUTFPHeapMinP2P1P1P0P1P2=null;
    Item[] clsUTFPHeapMinP2P1P1P0P1=new Item[]{clsUTFPHeapMinP2P1P1P0P1P1,clsUTFPHeapMinP2P1P1P0P1P2};
    FPHeapMin clsUTFPHeapMinP2P1P1P0=null;
      clsUTFPHeapMinP2P1P1P0=new FPHeapMin(clsUTFPHeapMinP2P1P1P0P1);
    Item clsUTFPHeapMinP2P1P1=null;
      clsUTFPHeapMinP2P1P1=clsUTFPHeapMinP2P1P1P0.retiraMin();
    Item[] clsUTFPHeapMinP2P1=new Item[]{clsUTFPHeapMinP2P1P1};
      clsUTFPHeapMin.copia(clsUTFPHeapMinP2P1);
    Item clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.min();
    assertNull(clsUTFPHeapMinP3R);
    String clsUTFPHeapMinP4R=null;
      clsUTFPHeapMinP4R=clsUTFPHeapMin.toString();
    String clsUTFPHeapMinP4RP0R=null;
      clsUTFPHeapMinP4RP0R=clsUTFPHeapMinP4R.intern();
    int clsUTFPHeapMinP4RP1P1=-60;
    String clsUTFPHeapMinP4RP1R=null;
//Exception
    try {
      clsUTFPHeapMinP4RP1R=clsUTFPHeapMinP4R.substring(clsUTFPHeapMinP4RP1P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTFPHeapMinP4RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[1],ds.MeuItem[287]]]
2)----->retiraMin[], 
3)----->toString[]
 Covered Branches:[1, 2, 3, 11, 12, 13, 14]
 */
  @Test public void TestCase11() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=1;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=287;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    Item clsUTFPHeapMinP2R=null;
      clsUTFPHeapMinP2R=clsUTFPHeapMin.retiraMin();
    int clsUTFPHeapMinP2RP0P1P1=-977;
    Item clsUTFPHeapMinP2RP0P1=null;
      clsUTFPHeapMinP2RP0P1=new MeuItem(clsUTFPHeapMinP2RP0P1P1);
    int clsUTFPHeapMinP2RP0R=0;
      clsUTFPHeapMinP2RP0R=clsUTFPHeapMinP2R.compara(clsUTFPHeapMinP2RP0P1);
    assertEquals("-977",clsUTFPHeapMinP2RP0P1.recuperaChave().toString());
    assertEquals(1,clsUTFPHeapMinP2RP0R);
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
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[null,ds.MeuItem[813],ds.MeuItem[668]]]
2)----->diminuiChave[2, 111], 
3)----->toString[]
 Covered Branches:[17, 2, 18, 15]
 */
  @Test public void TestCase12() throws Throwable {
    Item clsUTFPHeapMinP1P1P1=null;
    int clsUTFPHeapMinP1P1P2P1=813;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=668;
    Item clsUTFPHeapMinP1P1P3=null;
      clsUTFPHeapMinP1P1P3=new MeuItem(clsUTFPHeapMinP1P1P3P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1=2;
    int clsUTFPHeapMinP2P2O0=111;
    Object clsUTFPHeapMinP2P2=clsUTFPHeapMinP2P2O0;
      clsUTFPHeapMin.diminuiChave(clsUTFPHeapMinP2P1,(Object)clsUTFPHeapMinP2P2);
    assertEquals("111",clsUTFPHeapMinP2P2.toString());
    assertEquals(111,clsUTFPHeapMinP2P2.hashCode());
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
  }
}
