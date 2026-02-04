package ds.seed5311;
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
Evaluations : 43965
search time (ms): 42501
total runtime (ms): 44163
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[-17],ds.MeuItem[175]]]
2)----->refaz[0, 860], 
3)----->toString[]
 Covered Branches:[2, 3, 4, 6, 7]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=-17;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=175;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1=0;
    int clsUTFPHeapMinP2P2=860;
      clsUTFPHeapMin.refaz(clsUTFPHeapMinP2P1,clsUTFPHeapMinP2P2);
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    String clsUTFPHeapMinP3RP0P1=new String("nctdqg2xujba61rivkph4fo3w");
    String[] clsUTFPHeapMinP3RP0R=null;
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.split(clsUTFPHeapMinP3RP0P1);
    assertEquals("nctdqg2xujba61rivkph4fo3w",clsUTFPHeapMinP3RP0P1.toString());
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[-682],ds.MeuItem[911],ds.MeuItem[437]]]
2)----->insere[min[]], 
3)----->toString[], 
4)----->min[]
 Covered Branches:[1, 2, 19, 3, 20, 4, 6, 11, 12, 13, 14]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=-682;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=911;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=437;
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
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    String clsUTFPHeapMinP3RP0P1=new String("vcdtelbgrskpahoynmquijxfwz");
    byte[] clsUTFPHeapMinP3RP0R=null;
//Exception
    try {
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.getBytes(clsUTFPHeapMinP3RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("vcdtelbgrskpahoynmquijxfwz",clsUTFPHeapMinP3RP0P1.toString());
    assertNull(clsUTFPHeapMinP3RP0R);
    boolean clsUTFPHeapMinP3RP1P1=false;
    String clsUTFPHeapMinP3RP1R=null;
      clsUTFPHeapMinP3RP1R=String.valueOf(clsUTFPHeapMinP3RP1P1);
    assertEquals("false",clsUTFPHeapMinP3RP1R);
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
    int clsUTFPHeapMinP4RP1R=0;
//Exception
    try {
      clsUTFPHeapMinP4RP1R=clsUTFPHeapMinP4R.compara((Item)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("911",clsUTFPHeapMinP4R.recuperaChave().toString());
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[850]
2)----->diminuiChave[692, null], 
3)----->toString[]
 Covered Branches:[16, 1, 15]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTFPHeapMinP1P1=850;
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1=692;
//Exception
    try {
      clsUTFPHeapMin.diminuiChave(clsUTFPHeapMinP2P1,(Object)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[3]
2)----->imprime[], 
3)----->toString[], 
4)----->min[]
 Covered Branches:[1, 22, 11]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTFPHeapMinP1P1=3;
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
      clsUTFPHeapMin.imprime();
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    String clsUTFPHeapMinP3RP0P1=new String("$.7!^&#9>_%3'-+~8]@(1*={)`|2/ ;?540:<6}_[\\\\\\\\\\\\\"");
    int clsUTFPHeapMinP3RP0R=0;
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.lastIndexOf(clsUTFPHeapMinP3RP0P1);
    assertEquals(-1,clsUTFPHeapMinP3RP0R);
    Item clsUTFPHeapMinP4R=null;
      clsUTFPHeapMinP4R=clsUTFPHeapMin.min();
    assertNull(clsUTFPHeapMinP4R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[769],ds.MeuItem[291],ds.MeuItem[1]]]
2)----->imprime[], 
3)----->toString[]
 Covered Branches:[2, 22, 23]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=769;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=291;
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
    String clsUTFPHeapMinP3RP0R=null;
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.trim();
    String clsUTFPHeapMinP3RP1P1=new String("j4kkLAYYAApB9pHd37af9djI1wWMaX1XyP4E8zal");
    String clsUTFPHeapMinP3RP1P2=new String("'HU gWm/_dhQr:K-waoS}u(fYseAb*qCRNt$ji%E@XV#l>xI.L=&ZBDvnyc[M|PFTz`_<+!~J^k){]pGO?;\\\\\\\\\\\\\"");
    String clsUTFPHeapMinP3RP1R=null;
      clsUTFPHeapMinP3RP1R=clsUTFPHeapMinP3R.replaceAll(clsUTFPHeapMinP3RP1P1,clsUTFPHeapMinP3RP1P2);
    assertEquals("j4kkLAYYAApB9pHd37af9djI1wWMaX1XyP4E8zal",clsUTFPHeapMinP3RP1P1.toString());
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[357]
2)----->copia[[min[],null]], 
3)----->toString[]
 Covered Branches:[1, 24, 25]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTFPHeapMinP1P1=357;
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
    Item clsUTFPHeapMinP2P1P2=null;
    Item[] clsUTFPHeapMinP2P1=new Item[]{clsUTFPHeapMinP2P1P1,clsUTFPHeapMinP2P1P2};
      clsUTFPHeapMin.copia(clsUTFPHeapMinP2P1);
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    int clsUTFPHeapMinP3RP0R=0;
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.hashCode();
    String clsUTFPHeapMinP3RP1P1=new String("44.72186179462821");
    String[] clsUTFPHeapMinP3RP1R=null;
      clsUTFPHeapMinP3RP1R=clsUTFPHeapMinP3R.split(clsUTFPHeapMinP3RP1P1);
    assertEquals("44.72186179462821",clsUTFPHeapMinP3RP1P1.toString());
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[812],ds.MeuItem[-896]]]
2)----->retiraMin[], 
3)----->toString[], 
4)----->min[]
 Covered Branches:[1, 2, 3, 11, 12, 13, 14]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=812;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=-896;
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
    Object clsUTFPHeapMinP4RP0R=null;
      clsUTFPHeapMinP4RP0R=clsUTFPHeapMinP4R.recuperaChave();
    assertEquals("-896",clsUTFPHeapMinP4RP0R.toString());
    assertEquals(-896,clsUTFPHeapMinP4RP0R.hashCode());
    assertEquals("-896",clsUTFPHeapMinP4R.recuperaChave().toString());
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[1]
2)----->constroi[], 
3)----->toString[]
 Covered Branches:[1, 9]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTFPHeapMinP1P1=1;
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
      clsUTFPHeapMin.constroi();
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[-109],ds.MeuItem[-670]]]
2)----->refaz[0, 1], 
3)----->toString[]
 Covered Branches:[2, 3, 4, 5, 8]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=-109;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=-670;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1=0;
    int clsUTFPHeapMinP2P2=1;
      clsUTFPHeapMin.refaz(clsUTFPHeapMinP2P1,clsUTFPHeapMinP2P2);
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    boolean clsUTFPHeapMinP3RP0P1=false;
    int clsUTFPHeapMinP3RP0P2=170;
    String clsUTFPHeapMinP3RP0P3=new String("");
    int clsUTFPHeapMinP3RP0P4=572;
    int clsUTFPHeapMinP3RP0P5=247;
    boolean clsUTFPHeapMinP3RP0R=false;
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.regionMatches(clsUTFPHeapMinP3RP0P1,clsUTFPHeapMinP3RP0P2,clsUTFPHeapMinP3RP0P3,clsUTFPHeapMinP3RP0P4,clsUTFPHeapMinP3RP0P5);
    assertEquals("",clsUTFPHeapMinP3RP0P3.toString());
    assertEquals(false,clsUTFPHeapMinP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[-150],ds.MeuItem[709],ds.MeuItem[298]]]
2)----->constroi[], 
3)----->toString[]
 Covered Branches:[2, 3, 4, 6, 8, 9, 10]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=-150;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=709;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=298;
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
1)----->ds.FPHeapMin[[ds.MeuItem[328]]]
2)----->constroi[], 
3)----->toString[]
 Covered Branches:[2, 9]
 */
  @Test public void TestCase10() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=328;
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
1)----->ds.FPHeapMin[176]
2)----->insere[ds.MeuItem[195]], 
3)----->toString[]
 Covered Branches:[1, 17, 19, 21, 15]
 */
  @Test public void TestCase11() throws Throwable {
    int clsUTFPHeapMinP1P1=176;
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1P1=195;
    Item clsUTFPHeapMinP2P1=null;
      clsUTFPHeapMinP2P1=new MeuItem(clsUTFPHeapMinP2P1P1);
      clsUTFPHeapMin.insere(clsUTFPHeapMinP2P1);
    assertEquals("195",clsUTFPHeapMinP2P1.recuperaChave().toString());
    String clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.toString();
    boolean clsUTFPHeapMinP3RP0R=false;
      clsUTFPHeapMinP3RP0R=clsUTFPHeapMinP3R.isEmpty();
    assertEquals(false,clsUTFPHeapMinP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMin[[ds.MeuItem[-949],ds.MeuItem[858],ds.MeuItem[-5],ds.MeuItem[-533]]]
2)----->diminuiChave[3, -24], 
3)----->min[]
 Covered Branches:[17, 2, 18, 11, 15]
 */
  @Test public void TestCase12() throws Throwable {
    int clsUTFPHeapMinP1P1P1P1=-949;
    Item clsUTFPHeapMinP1P1P1=null;
      clsUTFPHeapMinP1P1P1=new MeuItem(clsUTFPHeapMinP1P1P1P1);
    int clsUTFPHeapMinP1P1P2P1=858;
    Item clsUTFPHeapMinP1P1P2=null;
      clsUTFPHeapMinP1P1P2=new MeuItem(clsUTFPHeapMinP1P1P2P1);
    int clsUTFPHeapMinP1P1P3P1=-5;
    Item clsUTFPHeapMinP1P1P3=null;
      clsUTFPHeapMinP1P1P3=new MeuItem(clsUTFPHeapMinP1P1P3P1);
    int clsUTFPHeapMinP1P1P4P1=-533;
    Item clsUTFPHeapMinP1P1P4=null;
      clsUTFPHeapMinP1P1P4=new MeuItem(clsUTFPHeapMinP1P1P4P1);
    Item[] clsUTFPHeapMinP1P1=new Item[]{clsUTFPHeapMinP1P1P1,clsUTFPHeapMinP1P1P2,clsUTFPHeapMinP1P1P3,clsUTFPHeapMinP1P1P4};
    FPHeapMin clsUTFPHeapMin=null;
      clsUTFPHeapMin=new FPHeapMin(clsUTFPHeapMinP1P1);
    int clsUTFPHeapMinP2P1=3;
    Integer clsUTFPHeapMinP2P2O0=-24;
    Object clsUTFPHeapMinP2P2=clsUTFPHeapMinP2P2O0;
      clsUTFPHeapMin.diminuiChave(clsUTFPHeapMinP2P1,(Object)clsUTFPHeapMinP2P2);
    assertEquals("-24",clsUTFPHeapMinP2P2.toString());
    assertEquals(-24,clsUTFPHeapMinP2P2.hashCode());
    Item clsUTFPHeapMinP3R=null;
      clsUTFPHeapMinP3R=clsUTFPHeapMin.min();
    assertEquals("-24",clsUTFPHeapMinP3R.recuperaChave().toString());
  }
}
