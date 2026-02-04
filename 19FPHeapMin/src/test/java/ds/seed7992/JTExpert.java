package ds.seed7992;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Item;
import java.util.Locale;
import java.util.Date;
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
Evaluations : 42499
search time (ms): 42501
total runtime (ms): 44198
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[1]]]
2)----->constroi[], 
3)----->toString[]
 Covered Branches:[2, 9]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=1;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
      clsUTFPHeapMin.constroi();
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[880],ds.MeuItem[-552]]]
2)----->retiraMin[], 
3)----->toString[], 
4)----->min[]
 Covered Branches:[1, 2, 3, 11, 12, 13, 14]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=880;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=-552;
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
    Item clsUTFPHeapMinP4R=null;
      clsUTFPHeapMinP4R=clsUTFPHeapMin.min();
    assertEquals("-552",clsUTFPHeapMinP4R.recuperaChave().toString());
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[723],ds.MeuItem[426],ds.MeuItem[70],ds.MeuItem[888]]]
2)----->imprime[], 
3)----->toString[]
 Covered Branches:[2, 22, 23]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=723;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=426;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=70;
    Item clsUTFPHeapMinP1P1P3=null;
      clsUTFPHeapMinP1P1P3=new MeuItem(clsUTFPHeapMinP1P1P3P1);
    int clsUTFPHeapMinP1P1P4P1=888;
    Item clsUTFPHeapMinP1P1P4=null;
      clsUTFPHeapMinP1P1P4=new MeuItem(clsUTFPHeapMinP1P1P4P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3,clsUTFPHeapMinP1P1P4};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
      clsUTFPHeapMin.imprime();
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    String clsUTFPHeapMinP3RP0P1=new String("0rek6dbfbckoqndiddolh");
    boolean clsUTFPHeapMinP3RP0R=false;
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.endsWith(clsUTFPHeapMinP3RP0P1);
    assertEquals("0rek6dbfbckoqndiddolh",clsUTFPHeapMinP3RP0P1.toString());
    assertEquals(false,clsUTFPHeapMinP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[504],ds.MeuItem[-461],ds.MeuItem[200]]]
2)----->insere[ds.MeuItem[902]], 
3)----->toString[], 
4)----->min[]
 Covered Branches:[2, 19, 20, 11]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=504;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=-461;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=200;
    Item clsUTFPHeapMinP1P1P3=null;
      clsUTFPHeapMinP1P1P3=new MeuItem(clsUTFPHeapMinP1P1P3P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1P1=902;
    Item clsUTFPHeapMinP2P1=null;
      clsUTFPHeapMinP2P1=new MeuItem(clsUTFPHeapMinP2P1P1);
//Exception
    try {
      clsUTFPHeapMin.insere(clsUTFPHeapMinP2P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("902",clsUTFPHeapMinP2P1.recuperaChave().toString());
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    Item clsUTFPHeapMinP4R=null;
      clsUTFPHeapMinP4R=clsUTFPHeapMin.min();
    Object clsUTFPHeapMinP4RP0R=null;
      clsUTFPHeapMinP4RP0R=clsUTFPHeapMinP4R.recuperaChave();
    assertEquals("-461",clsUTFPHeapMinP4RP0R.toString());
    assertEquals(-461,clsUTFPHeapMinP4RP0R.hashCode());
    int clsUTFPHeapMinP4RP1P1P1=-264;
    Item clsUTFPHeapMinP4RP1P1=null;
      clsUTFPHeapMinP4RP1P1=new MeuItem(clsUTFPHeapMinP4RP1P1P1);
    int clsUTFPHeapMinP4RP1R=0;
      clsUTFPHeapMinP4RP1R=clsUTFPHeapMinP4R.compara(clsUTFPHeapMinP4RP1P1);
    assertEquals("-264",clsUTFPHeapMinP4RP1P1.recuperaChave().toString());
    assertEquals(-1,clsUTFPHeapMinP4RP1R);
    assertEquals("-461",clsUTFPHeapMinP4R.recuperaChave().toString());
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[-834],ds.MeuItem[-873],ds.MeuItem[-765],ds.MeuItem[-210]]]
2)----->constroi[], 
3)----->toString[]
 Covered Branches:[2, 3, 4, 6, 7, 9, 10]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=-834;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=-873;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=-765;
    Item clsUTFPHeapMinP1P1P3=null;
      clsUTFPHeapMinP1P1P3=new MeuItem(clsUTFPHeapMinP1P1P3P1);
    int clsUTFPHeapMinP1P1P4P1=-210;
    Item clsUTFPHeapMinP1P1P4=null;
      clsUTFPHeapMinP1P1P4=new MeuItem(clsUTFPHeapMinP1P1P4P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3,clsUTFPHeapMinP1P1P4};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
      clsUTFPHeapMin.constroi();
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    int clsUTFPHeapMinP3RP0P2=759;
    String[] clsUTFPHeapMinP3RP0R=null;
//Exception
    try {
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.split((String)null,clsUTFPHeapMinP3RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTFPHeapMinP3RP0R);
    long clsUTFPHeapMinP3RP1P1=-5224121863724892219L;
    String clsUTFPHeapMinP3RP1R=null;
      clsUTFPHeapMinP3RP1R=String.valueOf(clsUTFPHeapMinP3RP1P1);
    assertEquals("-5224121863724892219",clsUTFPHeapMinP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[863]
2)----->diminuiChave[311, null], 
3)----->min[]
 Covered Branches:[16, 1, 11, 15]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTFPHeapMinP1P1=863;
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1=311;
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
1)----->ds.FPHeapMin[[ds.MeuItem[685],ds.MeuItem[1],ds.MeuItem[348]]]
2)----->refaz[0, -33], 
3)----->toString[]
 Covered Branches:[2, 3]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=685;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=1;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=348;
    Item clsUTFPHeapMinP1P1P3=null;
      clsUTFPHeapMinP1P1P3=new MeuItem(clsUTFPHeapMinP1P1P3P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1=0;
    int clsUTFPHeapMinP2P2=-33;
      clsUTFPHeapMin.refaz(clsUTFPHeapMinP2P1,clsUTFPHeapMinP2P2);
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    String clsUTFPHeapMinP3RP0P1=new String("|.]*@&_+/<^?#{`='-};:~ $!%_[(>)\\\\\\\\\\\\\"");
    boolean clsUTFPHeapMinP3RP0R=false;
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.startsWith(clsUTFPHeapMinP3RP0P1);
    assertEquals(false,clsUTFPHeapMinP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[849]
2)----->insere[ds.MeuItem[-800]], 
3)----->toString[], 
4)----->min[]
 Covered Branches:[1, 17, 19, 21, 11, 15]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTFPHeapMinP1P1=849;
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1P1=-800;
    Item clsUTFPHeapMinP2P1=null;
      clsUTFPHeapMinP2P1=new MeuItem(clsUTFPHeapMinP2P1P1);
      clsUTFPHeapMin.insere(clsUTFPHeapMinP2P1);
    assertEquals("-800",clsUTFPHeapMinP2P1.recuperaChave().toString());
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    Item clsUTFPHeapMinP4R=null;
      clsUTFPHeapMinP4R=clsUTFPHeapMin.min();
    assertEquals("-800",clsUTFPHeapMinP4R.recuperaChave().toString());
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[65]
2)----->copia[[ds.MeuItem[237]]], 
3)----->min[], 
4)----->toString[]
 Covered Branches:[1, 24, 11]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTFPHeapMinP1P1=65;
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1P1P1=237;
    Item clsUTFPHeapMinP2P1P1=null;
      clsUTFPHeapMinP2P1P1=new MeuItem(clsUTFPHeapMinP2P1P1P1);
    Item[] clsUTFPHeapMinP2P1=new Item[]{clsUTFPHeapMinP2P1P1};
      clsUTFPHeapMin.copia(clsUTFPHeapMinP2P1);
    Item clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.min();
    assertNull(clsUTFPHeapMinP3R);
    String clsUTFPHeapMinP4R=null;
      clsUTFPHeapMinP4R=clsUTFPHeapMin.toString();
    String clsUTFPHeapMinP4RP0R=null;
      clsUTFPHeapMinP4RP0R=clsUTFPHeapMinP4R.toUpperCase();
    String clsUTFPHeapMinP4RP1P1=new String("");
    boolean clsUTFPHeapMinP4RP1R=false;
      clsUTFPHeapMinP4RP1R=clsUTFPHeapMinP4R.matches(clsUTFPHeapMinP4RP1P1);
    assertEquals("",clsUTFPHeapMinP4RP1P1.toString());
    assertEquals(false,clsUTFPHeapMinP4RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[752],ds.MeuItem[373],ds.MeuItem[-1],ds.MeuItem[798]]]
2)----->refaz[0, 2], 
3)----->toString[]
 Covered Branches:[2, 3, 4, 5, 6, 8]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=752;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=373;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=-1;
    Item clsUTFPHeapMinP1P1P3=null;
      clsUTFPHeapMinP1P1P3=new MeuItem(clsUTFPHeapMinP1P1P3P1);
    int clsUTFPHeapMinP1P1P4P1=798;
    Item clsUTFPHeapMinP1P1P4=null;
      clsUTFPHeapMinP1P1P4=new MeuItem(clsUTFPHeapMinP1P1P4P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3,clsUTFPHeapMinP1P1P4};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1=0;
    int clsUTFPHeapMinP2P2=2;
      clsUTFPHeapMin.refaz(clsUTFPHeapMinP2P1,clsUTFPHeapMinP2P2);
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    String clsUTFPHeapMinP3RP0R=null;
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.toUpperCase();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[null,ds.MeuItem[595],ds.MeuItem[577],ds.MeuItem[-110]]]
2)----->diminuiChave[2, 2], 
3)----->min[], 
4)----->toString[]
 Covered Branches:[17, 2, 18, 11, 15]
 */
  @Test public void TestCase10() throws Throwable {
    Item clsUTFPHeapMinP1P1P1=null;
    int clsUTFPHeapMinP1P1P2P1=595;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=577;
    Item clsUTFPHeapMinP1P1P3=null;
      clsUTFPHeapMinP1P1P3=new MeuItem(clsUTFPHeapMinP1P1P3P1);
    int clsUTFPHeapMinP1P1P4P1=-110;
    Item clsUTFPHeapMinP1P1P4=null;
      clsUTFPHeapMinP1P1P4=new MeuItem(clsUTFPHeapMinP1P1P4P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3,clsUTFPHeapMinP1P1P4};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1=2;
    Integer clsUTFPHeapMinP2P2O0=2;
    Object clsUTFPHeapMinP2P2=clsUTFPHeapMinP2P2O0;
      clsUTFPHeapMin.diminuiChave(clsUTFPHeapMinP2P1,(Object)clsUTFPHeapMinP2P2);
    assertEquals("2",clsUTFPHeapMinP2P2.toString());
    assertEquals(2,clsUTFPHeapMinP2P2.hashCode());
    Item clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.min();
    Object clsUTFPHeapMinP3RP0R=null;
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.recuperaChave();
    assertEquals("2",clsUTFPHeapMinP3RP0R.toString());
    assertEquals(2,clsUTFPHeapMinP3RP0R.hashCode());
    assertEquals("2",clsUTFPHeapMinP3R.recuperaChave().toString());
    String clsUTFPHeapMinP4R=null;
      clsUTFPHeapMinP4R=clsUTFPHeapMin.toString();
    double clsUTFPHeapMinP4RP0P1=-76.94728527051723D;
    String clsUTFPHeapMinP4RP0R=null;
      clsUTFPHeapMinP4RP0R=String.valueOf(clsUTFPHeapMinP4RP0P1);
    assertEquals("-76.94728527051723",clsUTFPHeapMinP4RP0R);
    Locale clsUTFPHeapMinP4RP1P1=null;
      clsUTFPHeapMinP4RP1P1=(Locale)Locale.CHINA;
    String clsUTFPHeapMinP4RP1P2=new String("x");
    short clsUTFPHeapMinP4RP1P3P1O0=820;
    Object clsUTFPHeapMinP4RP1P3P1=clsUTFPHeapMinP4RP1P3P1O0;
    long clsUTFPHeapMinP4RP1P3P2O0=37L;
    Object clsUTFPHeapMinP4RP1P3P2=clsUTFPHeapMinP4RP1P3P2O0;
    Float clsUTFPHeapMinP4RP1P3P3O0=95.61859F;
    Object clsUTFPHeapMinP4RP1P3P3=clsUTFPHeapMinP4RP1P3P3O0;
    Date clsUTFPHeapMinP4RP1P3P4O0=null;
      clsUTFPHeapMinP4RP1P3P4O0=new Date();
    Object clsUTFPHeapMinP4RP1P3P4=clsUTFPHeapMinP4RP1P3P4O0;
    Object[] clsUTFPHeapMinP4RP1P3=new Object[]{clsUTFPHeapMinP4RP1P3P1,clsUTFPHeapMinP4RP1P3P2,clsUTFPHeapMinP4RP1P3P3,clsUTFPHeapMinP4RP1P3P4};
    String clsUTFPHeapMinP4RP1R=null;
      clsUTFPHeapMinP4RP1R=String.format(clsUTFPHeapMinP4RP1P1,clsUTFPHeapMinP4RP1P2,(Object[])clsUTFPHeapMinP4RP1P3);
    assertEquals("",clsUTFPHeapMinP4RP1P1.getDisplayVariant());
    assertEquals("",clsUTFPHeapMinP4RP1P1.getScript());
    assertEquals("China",clsUTFPHeapMinP4RP1P1.getDisplayCountry());
    assertEquals(false,clsUTFPHeapMinP4RP1P1.hasExtensions());
    assertEquals("x",clsUTFPHeapMinP4RP1P2.toString());
    assertEquals("x",clsUTFPHeapMinP4RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[1]
2)----->copia[[ds.MeuItem[-288],null]], 
3)----->toString[]
 Covered Branches:[1, 24, 25]
 */
  @Test public void TestCase11() throws Throwable {
    int clsUTFPHeapMinP1P1=1;
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1P1P1=-288;
    Item clsUTFPHeapMinP2P1P1=null;
      clsUTFPHeapMinP2P1P1=new MeuItem(clsUTFPHeapMinP2P1P1P1);
    Item clsUTFPHeapMinP2P1P2=null;
    Item[] clsUTFPHeapMinP2P1=new Item[]{clsUTFPHeapMinP2P1P1,clsUTFPHeapMinP2P1P2};
      clsUTFPHeapMin.copia(clsUTFPHeapMinP2P1);
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    String clsUTFPHeapMinP3RP0P1=new String("hdb480l5j6se2fnyvcgxmik7wr3q9tapu1oz");
    byte[] clsUTFPHeapMinP3RP0R=null;
//Exception
    try {
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.getBytes(clsUTFPHeapMinP3RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("hdb480l5j6se2fnyvcgxmik7wr3q9tapu1oz",clsUTFPHeapMinP3RP0P1.toString());
    assertNull(clsUTFPHeapMinP3RP0R);
    String clsUTFPHeapMinP3RP1P1=new String("fhEvAT8pMiYGscdhc9aIyhsvB3nYSe67RcCfEJssuFxQ4WwrSbkmFTz3slFwx6OkRN6qDNYeaX5biQsThfSoR1cOmnEvq42BcQ1RaOkFU3h3Bbzhfe46tvIz9LMiISO0niVDd");
    int clsUTFPHeapMinP3RP1P2=223;
    boolean clsUTFPHeapMinP3RP1R=false;
      clsUTFPHeapMinP3RP1R=clsUTFPHeapMinP3R.startsWith(clsUTFPHeapMinP3RP1P1,clsUTFPHeapMinP3RP1P2);
    assertEquals("fhEvAT8pMiYGscdhc9aIyhsvB3nYSe67RcCfEJssuFxQ4WwrSbkmFTz3slFwx6OkRN6qDNYeaX5biQsThfSoR1cOmnEvq42BcQ1RaOkFU3h3Bbzhfe46tvIz9LMiISO0niVDd",clsUTFPHeapMinP3RP1P1.toString());
    assertEquals(false,clsUTFPHeapMinP3RP1R);
  }
}
