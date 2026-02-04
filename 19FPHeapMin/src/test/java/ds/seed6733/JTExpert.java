package ds.seed6733;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import java.util.Arrays;
import ds.Item;
import ds.MeuItem;
import java.nio.charset.Charset;
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
Evaluations : 43786
search time (ms): 42501
total runtime (ms): 44221
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[-163],ds.MeuItem[-681],ds.MeuItem[0]]]
2)----->insere[retiraMin[]], 
3)----->min[], 
4)----->toString[]
 Covered Branches:[2, 19, 3, 20, 4, 6, 11, 12, 13, 14]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=-163;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=-681;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=0;
    Item clsUTFPHeapMinP1P1P3=null;
      clsUTFPHeapMinP1P1P3=new MeuItem(clsUTFPHeapMinP1P1P3P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
//Exception
    try {
      clsUTFPHeapMin.insere((Item)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    Item clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.min();
    Object clsUTFPHeapMinP3RP0R=null;
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.recuperaChave();
    assertEquals("-681",clsUTFPHeapMinP3RP0R.toString());
    assertEquals(-681,clsUTFPHeapMinP3RP0R.hashCode());
    int clsUTFPHeapMinP3RP1P1P1=2147483647;
    Item clsUTFPHeapMinP3RP1P1=null;
      clsUTFPHeapMinP3RP1P1=new MeuItem(clsUTFPHeapMinP3RP1P1P1);
    int clsUTFPHeapMinP3RP1R=0;
      clsUTFPHeapMinP3RP1R=clsUTFPHeapMinP3R.compara(clsUTFPHeapMinP3RP1P1);
    assertEquals("2147483647",clsUTFPHeapMinP3RP1P1.recuperaChave().toString());
    assertEquals(-1,clsUTFPHeapMinP3RP1R);
    assertEquals("-681",clsUTFPHeapMinP3R.recuperaChave().toString());
    String clsUTFPHeapMinP4R=null;
      clsUTFPHeapMinP4R=clsUTFPHeapMin.toString();
    Charset clsUTFPHeapMinP4RP0P1=null;
      clsUTFPHeapMinP4RP0P1=Charset.defaultCharset();
    byte[] clsUTFPHeapMinP4RP0R=null;
      clsUTFPHeapMinP4RP0R=clsUTFPHeapMinP4R.getBytes(clsUTFPHeapMinP4RP0P1);
    assertEquals("UTF-8",clsUTFPHeapMinP4RP0P1.displayName());
    assertEquals(true,clsUTFPHeapMinP4RP0P1.canEncode());
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[-60],ds.MeuItem[355],null]]
2)----->retiraMin[], 
3)----->toString[]
 Covered Branches:[2, 3, 12, 14]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=-60;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=355;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    Item clsUTFPHeapMinP1P1P3=null;
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    Item clsUTFPHeapMinP2R=null;
      clsUTFPHeapMinP2R=clsUTFPHeapMin.retiraMin();
    int clsUTFPHeapMinP2RP0P1P1=27;
    Item clsUTFPHeapMinP2RP0P1=null;
      clsUTFPHeapMinP2RP0P1=new MeuItem(clsUTFPHeapMinP2RP0P1P1);
    int clsUTFPHeapMinP2RP0R=0;
      clsUTFPHeapMinP2RP0R=clsUTFPHeapMinP2R.compara(clsUTFPHeapMinP2RP0P1);
    assertEquals("27",clsUTFPHeapMinP2RP0P1.recuperaChave().toString());
    assertEquals(1,clsUTFPHeapMinP2RP0R);
    Object clsUTFPHeapMinP2RP1R=null;
      clsUTFPHeapMinP2RP1R=clsUTFPHeapMinP2R.recuperaChave();
    assertEquals("355",clsUTFPHeapMinP2RP1R.toString());
    assertEquals(355,clsUTFPHeapMinP2RP1R.hashCode());
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    int clsUTFPHeapMinP3RP0P1P1=191;
    StringBuffer clsUTFPHeapMinP3RP0P1=null;
      clsUTFPHeapMinP3RP0P1=new StringBuffer(clsUTFPHeapMinP3RP0P1P1);
    boolean clsUTFPHeapMinP3RP0R=false;
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.contentEquals(clsUTFPHeapMinP3RP0P1);
    assertEquals("",clsUTFPHeapMinP3RP0P1.toString());
    assertEquals(0,clsUTFPHeapMinP3RP0P1.length());
    assertEquals(false,clsUTFPHeapMinP3RP0R);
    boolean clsUTFPHeapMinP3RP1R=false;
      clsUTFPHeapMinP3RP1R=clsUTFPHeapMinP3R.isEmpty();
    assertEquals(false,clsUTFPHeapMinP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[833]
2)----->imprime[], 
3)----->toString[]
 Covered Branches:[1, 2, 22]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTFPHeapMinP1P1=833;
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
      clsUTFPHeapMin.imprime();
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    char clsUTFPHeapMinP3RP0P1P1O0='\u0069';
    Object clsUTFPHeapMinP3RP0P1P1=clsUTFPHeapMinP3RP0P1P1O0;
    CharSequence clsUTFPHeapMinP3RP0P1=null;
      clsUTFPHeapMinP3RP0P1=String.valueOf(clsUTFPHeapMinP3RP0P1P1);
    String clsUTFPHeapMinP3RP0R=null;
//Exception
    try {
      clsUTFPHeapMinP3RP0R=String.join(clsUTFPHeapMinP3RP0P1,(Iterable)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("i",clsUTFPHeapMinP3RP0P1.toString());
    assertEquals(1,clsUTFPHeapMinP3RP0P1.length());
    assertNull(clsUTFPHeapMinP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[1]
2)----->copia[[ds.MeuItem[-744],retiraMin[]]], 
3)----->toString[], 
4)----->min[]
 Covered Branches:[1, 24, 25, 11]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTFPHeapMinP1P1=1;
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1P1P1=-744;
    Item clsUTFPHeapMinP2P1P1=null;
      clsUTFPHeapMinP2P1P1=new MeuItem(clsUTFPHeapMinP2P1P1P1);
    Item clsUTFPHeapMinP2P1P2P0P1P1=null;
    Item[] clsUTFPHeapMinP2P1P2P0P1=new Item[]{clsUTFPHeapMinP2P1P2P0P1P1};
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
    Item[] clsUTFPHeapMinP2P1=new Item[]{clsUTFPHeapMinP2P1P1,clsUTFPHeapMinP2P1P2};
      clsUTFPHeapMin.copia(clsUTFPHeapMinP2P1);
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    Item clsUTFPHeapMinP4R=null;
      clsUTFPHeapMinP4R=clsUTFPHeapMin.min();
    assertNull(clsUTFPHeapMinP4R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[222]
2)----->diminuiChave[185, null], 
3)----->toString[]
 Covered Branches:[16, 1, 15]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTFPHeapMinP1P1=222;
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1=185;
//Exception
    try {
      clsUTFPHeapMin.diminuiChave(clsUTFPHeapMinP2P1,(Object)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    String clsUTFPHeapMinP3RP0P1=new String("gthq");
    int clsUTFPHeapMinP3RP0P2=-524;
    int clsUTFPHeapMinP3RP0R=0;
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.lastIndexOf(clsUTFPHeapMinP3RP0P1,clsUTFPHeapMinP3RP0P2);
    assertEquals("gthq",clsUTFPHeapMinP3RP0P1.toString());
    assertEquals(-1,clsUTFPHeapMinP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[731]
2)----->insere[ds.MeuItem[2147483646]], 
3)----->toString[]
 Covered Branches:[1, 17, 19, 21, 15]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTFPHeapMinP1P1=731;
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1P1=2147483646;
    Item clsUTFPHeapMinP2P1=null;
      clsUTFPHeapMinP2P1=new MeuItem(clsUTFPHeapMinP2P1P1);
      clsUTFPHeapMin.insere(clsUTFPHeapMinP2P1);
    assertEquals("2147483646",clsUTFPHeapMinP2P1.recuperaChave().toString());
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    String clsUTFPHeapMinP3RP0R=null;
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.trim();
    int clsUTFPHeapMinP3RP1P1=-734;
    char clsUTFPHeapMinP3RP1R='X';
//Exception
    try {
      clsUTFPHeapMinP3RP1R=clsUTFPHeapMinP3R.charAt(clsUTFPHeapMinP3RP1P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[324]
2)----->insere[ds.MeuItem[2]], 
3)----->toString[], 
4)----->min[]
 Covered Branches:[1, 17, 2, 19, 21, 11, 12, 13, 15]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTFPHeapMinP1P1=324;
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1P1=2;
    Item clsUTFPHeapMinP2P1=null;
      clsUTFPHeapMinP2P1=new MeuItem(clsUTFPHeapMinP2P1P1);
      clsUTFPHeapMin.insere(clsUTFPHeapMinP2P1);
    assertEquals("2",clsUTFPHeapMinP2P1.recuperaChave().toString());
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    int clsUTFPHeapMinP3RP0P1=-596;
    int clsUTFPHeapMinP3RP0P2=0;
    int clsUTFPHeapMinP3RP0R=0;
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.indexOf(clsUTFPHeapMinP3RP0P1,clsUTFPHeapMinP3RP0P2);
    assertEquals(-1,clsUTFPHeapMinP3RP0R);
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
    assertEquals("2",clsUTFPHeapMinP4RP1R.toString());
    assertEquals(2,clsUTFPHeapMinP4RP1R.hashCode());
    assertEquals("2",clsUTFPHeapMinP4R.recuperaChave().toString());
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[1],ds.MeuItem[27],ds.MeuItem[-969]]]
2)----->constroi[], 
3)----->toString[]
 Covered Branches:[2, 3, 4, 6, 8, 9, 10]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=1;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=27;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=-969;
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
1)----->ds.FPHeapMin[[ds.MeuItem[1],ds.MeuItem[384]]]
2)----->copia[[]], 
3)----->toString[]
 Covered Branches:[2, 24]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=1;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=384;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    Item[] clsUTFPHeapMinP2P1=new Item[]{};
      clsUTFPHeapMin.copia(clsUTFPHeapMinP2P1);
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[356],ds.MeuItem[-751],ds.MeuItem[686],ds.MeuItem[-381]]]
2)----->refaz[1, 106], 
3)----->toString[], 
4)----->min[]
 Covered Branches:[2, 3, 4, 5, 7, 11]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=356;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=-751;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=686;
    Item clsUTFPHeapMinP1P1P3=null;
      clsUTFPHeapMinP1P1P3=new MeuItem(clsUTFPHeapMinP1P1P3P1);
    int clsUTFPHeapMinP1P1P4P1=-381;
    Item clsUTFPHeapMinP1P1P4=null;
      clsUTFPHeapMinP1P1P4=new MeuItem(clsUTFPHeapMinP1P1P4P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3,clsUTFPHeapMinP1P1P4};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1=1;
    int clsUTFPHeapMinP2P2=106;
      clsUTFPHeapMin.refaz(clsUTFPHeapMinP2P1,clsUTFPHeapMinP2P2);
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    Item clsUTFPHeapMinP4R=null;
      clsUTFPHeapMinP4R=clsUTFPHeapMin.min();
    Object clsUTFPHeapMinP4RP0R=null;
      clsUTFPHeapMinP4RP0R=clsUTFPHeapMinP4R.recuperaChave();
    assertEquals("-751",clsUTFPHeapMinP4RP0R.toString());
    assertEquals(-751,clsUTFPHeapMinP4RP0R.hashCode());
    assertEquals("-751",clsUTFPHeapMinP4R.recuperaChave().toString());
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[568],ds.MeuItem[823],ds.MeuItem[265]]]
2)----->imprime[], 
3)----->min[], 
4)----->toString[]
 Covered Branches:[2, 22, 23, 11]
 */
  @Test public void TestCase10() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=568;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=823;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=265;
    Item clsUTFPHeapMinP1P1P3=null;
      clsUTFPHeapMinP1P1P3=new MeuItem(clsUTFPHeapMinP1P1P3P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
      clsUTFPHeapMin.imprime();
    Item clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.min();
    Object clsUTFPHeapMinP3RP0R=null;
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.recuperaChave();
    assertEquals("823",clsUTFPHeapMinP3RP0R.toString());
    assertEquals(823,clsUTFPHeapMinP3RP0R.hashCode());
    assertEquals("823",clsUTFPHeapMinP3R.recuperaChave().toString());
    String clsUTFPHeapMinP4R=null;
      clsUTFPHeapMinP4R=clsUTFPHeapMin.toString();
    int clsUTFPHeapMinP4RP0P1P1P1=1;
    CharSequence clsUTFPHeapMinP4RP0P1P1=null;
      clsUTFPHeapMinP4RP0P1P1=String.valueOf(clsUTFPHeapMinP4RP0P1P1P1);
    StringBuffer clsUTFPHeapMinP4RP0P1=null;
      clsUTFPHeapMinP4RP0P1=new StringBuffer(clsUTFPHeapMinP4RP0P1P1);
    boolean clsUTFPHeapMinP4RP0R=false;
      clsUTFPHeapMinP4RP0R=clsUTFPHeapMinP4R.contentEquals(clsUTFPHeapMinP4RP0P1);
    assertEquals("1",clsUTFPHeapMinP4RP0P1.toString());
    assertEquals(1,clsUTFPHeapMinP4RP0P1.length());
    assertEquals(false,clsUTFPHeapMinP4RP0R);
    float clsUTFPHeapMinP4RP1P1P1=-97.11833F;
    CharSequence clsUTFPHeapMinP4RP1P1=null;
      clsUTFPHeapMinP4RP1P1=String.valueOf(clsUTFPHeapMinP4RP1P1P1);
    boolean clsUTFPHeapMinP4RP1R=false;
      clsUTFPHeapMinP4RP1R=clsUTFPHeapMinP4R.contains(clsUTFPHeapMinP4RP1P1);
    assertEquals("-97.11833",clsUTFPHeapMinP4RP1P1.toString());
    assertEquals(9,clsUTFPHeapMinP4RP1P1.length());
    assertEquals(false,clsUTFPHeapMinP4RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[null,ds.MeuItem[-351],ds.MeuItem[-135],ds.MeuItem[-733]]]
2)----->retiraMin[], 
3)----->min[]
 Covered Branches:[2, 3, 4, 6, 7, 11, 12, 14]
 */
  @Test public void TestCase11() throws Throwable {
    Item clsUTFPHeapMinP1P1P1=null;
    int clsUTFPHeapMinP1P1P2P1=-351;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=-135;
    Item clsUTFPHeapMinP1P1P3=null;
      clsUTFPHeapMinP1P1P3=new MeuItem(clsUTFPHeapMinP1P1P3P1);
    int clsUTFPHeapMinP1P1P4P1=-733;
    Item clsUTFPHeapMinP1P1P4=null;
      clsUTFPHeapMinP1P1P4=new MeuItem(clsUTFPHeapMinP1P1P4P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3,clsUTFPHeapMinP1P1P4};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    Item clsUTFPHeapMinP2R=null;
      clsUTFPHeapMinP2R=clsUTFPHeapMin.retiraMin();
    int clsUTFPHeapMinP2RP0P1P1=294;
    Item clsUTFPHeapMinP2RP0P1=null;
      clsUTFPHeapMinP2RP0P1=new MeuItem(clsUTFPHeapMinP2RP0P1P1);
    int clsUTFPHeapMinP2RP0R=0;
      clsUTFPHeapMinP2RP0R=clsUTFPHeapMinP2R.compara(clsUTFPHeapMinP2RP0P1);
    assertEquals("294",clsUTFPHeapMinP2RP0P1.recuperaChave().toString());
    assertEquals(-1,clsUTFPHeapMinP2RP0R);
    assertEquals("-351",clsUTFPHeapMinP2R.recuperaChave().toString());
    Item clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.min();
    assertEquals("-733",clsUTFPHeapMinP3R.recuperaChave().toString());
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[null,ds.MeuItem[717],ds.MeuItem[-966]]]
2)----->diminuiChave[2, 1], 
3)----->min[]
 Covered Branches:[17, 1, 2, 18, 11, 12, 13, 15]
 */
  @Test public void TestCase12() throws Throwable {
    Item clsUTFPHeapMinP1P1P1=null;
    int clsUTFPHeapMinP1P1P2P1=717;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=-966;
    Item clsUTFPHeapMinP1P1P3=null;
      clsUTFPHeapMinP1P1P3=new MeuItem(clsUTFPHeapMinP1P1P3P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1=2;
    Integer clsUTFPHeapMinP2P2O0=1;
    Object clsUTFPHeapMinP2P2=clsUTFPHeapMinP2P2O0;
      clsUTFPHeapMin.diminuiChave(clsUTFPHeapMinP2P1,(Object)clsUTFPHeapMinP2P2);
    assertEquals("1",clsUTFPHeapMinP2P2.toString());
    assertEquals(1,clsUTFPHeapMinP2P2.hashCode());
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
    assertEquals("1",clsUTFPHeapMinP3R.recuperaChave().toString());
  }
}
