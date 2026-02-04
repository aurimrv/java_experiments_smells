package ds.seed9121;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import java.util.Arrays;
import ds.Item;
import ds.MeuItem;
import ds.FPHeapMax;
/** 
 * This class was automatically generated to test the ds.FPHeapMax class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 5, 8, 10, 11, 12, 14, 15, 16, 18, 19, 20, 21, 23, 24]
Uncovered branches: [17, 4, 6, 22, 7, 9, 13]
Total number of branches: 24
Total number of covered branches: 17
Coverage : 70,83%
Evaluations : 72272
search time (ms): 42501
total runtime (ms): 44140
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[902]
2)----->copia[[ds.MeuItem[-789],retiraMax[]]], 
3)----->toString[]
 Covered Branches:[1, 23, 24]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTFPHeapMaxP1P1=902;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1P1P1=-789;
    Item clsUTFPHeapMaxP2P1P1=null;
      clsUTFPHeapMaxP2P1P1=new MeuItem(clsUTFPHeapMaxP2P1P1P1);
    int clsUTFPHeapMaxP2P1P2P0P1=716;
    FPHeapMax clsUTFPHeapMaxP2P1P2P0=null;
      clsUTFPHeapMaxP2P1P2P0=new FPHeapMax(clsUTFPHeapMaxP2P1P2P0P1);
    Item clsUTFPHeapMaxP2P1P2=null;
//Exception
    try {
      clsUTFPHeapMaxP2P1P2=clsUTFPHeapMaxP2P1P2P0.retiraMax();
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    Item[] clsUTFPHeapMaxP2P1=new Item[]{clsUTFPHeapMaxP2P1P1,clsUTFPHeapMaxP2P1P2};
      clsUTFPHeapMax.copia(clsUTFPHeapMaxP2P1);
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[928]
2)----->max[], 
3)----->toString[]
 Covered Branches:[1, 10]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTFPHeapMaxP1P1=928;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    Item clsUTFPHeapMaxP2R=null;
      clsUTFPHeapMaxP2R=clsUTFPHeapMax.max();
    assertNull(clsUTFPHeapMaxP2R);
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
    int clsUTFPHeapMaxP3RP0P1=-556;
    int clsUTFPHeapMaxP3RP0R=0;
      clsUTFPHeapMaxP3RP0R=clsUTFPHeapMaxP3R.indexOf(clsUTFPHeapMaxP3RP0P1);
    assertEquals(-1,clsUTFPHeapMaxP3RP0R);
    char[] clsUTFPHeapMaxP3RP1R=null;
      clsUTFPHeapMaxP3RP1R=clsUTFPHeapMaxP3R.toCharArray();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[344]
2)----->constroi[], 
3)----->toString[]
 Covered Branches:[1, 8]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTFPHeapMaxP1P1=344;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
      clsUTFPHeapMax.constroi();
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
    int clsUTFPHeapMaxP3RP0R=0;
      clsUTFPHeapMaxP3RP0R=clsUTFPHeapMaxP3R.length();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[332]
2)----->insere[ds.MeuItem[2]], 
3)----->toString[], 
4)----->max[]
 Covered Branches:[16, 1, 18, 20, 10, 11, 12, 14]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTFPHeapMaxP1P1=332;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1P1=2;
    Item clsUTFPHeapMaxP2P1=null;
      clsUTFPHeapMaxP2P1=new MeuItem(clsUTFPHeapMaxP2P1P1);
      clsUTFPHeapMax.insere(clsUTFPHeapMaxP2P1);
    assertEquals("2",clsUTFPHeapMaxP2P1.recuperaChave().toString());
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
    Item clsUTFPHeapMaxP4R=null;
      clsUTFPHeapMaxP4R=clsUTFPHeapMax.max();
    int clsUTFPHeapMaxP4RP0R=0;
//Exception
    try {
      clsUTFPHeapMaxP4RP0R=clsUTFPHeapMaxP4R.compara((Item)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("2",clsUTFPHeapMaxP4R.recuperaChave().toString());
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[772]
2)----->refaz[378, -723], 
3)----->toString[], 
4)----->max[]
 Covered Branches:[1, 2, 10]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTFPHeapMaxP1P1=772;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1=378;
    int clsUTFPHeapMaxP2P2=-723;
      clsUTFPHeapMax.refaz(clsUTFPHeapMaxP2P1,clsUTFPHeapMaxP2P2);
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
    Item clsUTFPHeapMaxP4R=null;
      clsUTFPHeapMaxP4R=clsUTFPHeapMax.max();
    assertNull(clsUTFPHeapMaxP4R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[461]
2)----->insere[ds.MeuItem[608]], 
3)----->max[]
 Covered Branches:[16, 1, 18, 20, 10, 14]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTFPHeapMaxP1P1=461;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1P1=608;
    Item clsUTFPHeapMaxP2P1=null;
      clsUTFPHeapMaxP2P1=new MeuItem(clsUTFPHeapMaxP2P1P1);
      clsUTFPHeapMax.insere(clsUTFPHeapMaxP2P1);
    assertEquals("608",clsUTFPHeapMaxP2P1.recuperaChave().toString());
    Item clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.max();
    Object clsUTFPHeapMaxP3RP0R=null;
      clsUTFPHeapMaxP3RP0R=clsUTFPHeapMaxP3R.recuperaChave();
    assertEquals("608",clsUTFPHeapMaxP3RP0R.toString());
    assertEquals(608,clsUTFPHeapMaxP3RP0R.hashCode());
    assertEquals("608",clsUTFPHeapMaxP3R.recuperaChave().toString());
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[0]
2)----->insere[ds.MeuItem[2]], 
3)----->toString[]
 Covered Branches:[1, 18, 19]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTFPHeapMaxP1P1=0;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1P1=2;
    Item clsUTFPHeapMaxP2P1=null;
      clsUTFPHeapMaxP2P1=new MeuItem(clsUTFPHeapMaxP2P1P1);
//Exception
    try {
      clsUTFPHeapMax.insere(clsUTFPHeapMaxP2P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("2",clsUTFPHeapMaxP2P1.recuperaChave().toString());
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
    String clsUTFPHeapMaxP3RP0R=null;
      clsUTFPHeapMaxP3RP0R=clsUTFPHeapMaxP3R.intern();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[2]
2)----->copia[[ds.MeuItem[-485]]], 
3)----->toString[]
 Covered Branches:[1, 23]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTFPHeapMaxP1P1=2;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1P1P1=-485;
    Item clsUTFPHeapMaxP2P1P1=null;
      clsUTFPHeapMaxP2P1P1=new MeuItem(clsUTFPHeapMaxP2P1P1P1);
    Item[] clsUTFPHeapMaxP2P1=new Item[]{clsUTFPHeapMaxP2P1P1};
      clsUTFPHeapMax.copia(clsUTFPHeapMaxP2P1);
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[648]
2)----->refaz[0, 0], 
3)----->toString[], 
4)----->max[]
 Covered Branches:[1, 2, 3, 5, 10]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTFPHeapMaxP1P1=648;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1=0;
    int clsUTFPHeapMaxP2P2=0;
//Exception
    try {
      clsUTFPHeapMax.refaz(clsUTFPHeapMaxP2P1,clsUTFPHeapMaxP2P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
    Item clsUTFPHeapMaxP4R=null;
      clsUTFPHeapMaxP4R=clsUTFPHeapMax.max();
    assertNull(clsUTFPHeapMaxP4R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[875]
2)----->aumentaChave[311, null], 
3)----->toString[]
 Covered Branches:[1, 14, 15]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTFPHeapMaxP1P1=875;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1=311;
//Exception
    try {
      clsUTFPHeapMax.aumentaChave(clsUTFPHeapMaxP2P1,(Object)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
    int clsUTFPHeapMaxP3RP0P2=497;
    String[] clsUTFPHeapMaxP3RP0R=null;
      clsUTFPHeapMaxP3RP0R=clsUTFPHeapMaxP3R.split(clsUTFPHeapMaxP3R,clsUTFPHeapMaxP3RP0P2);
    assertTrue(Arrays.equals(new String[]{"",""},clsUTFPHeapMaxP3RP0R));
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[3]
2)----->imprime[], 
3)----->max[]
 Covered Branches:[1, 21, 10]
 */
  @Test public void TestCase10() throws Throwable {
    int clsUTFPHeapMaxP1P1=3;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
      clsUTFPHeapMax.imprime();
    Item clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.max();
    assertNull(clsUTFPHeapMaxP3R);
  }
}
