package ds.seed1448;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.MeuItem;
import ds.Item;
import ds.FPHeapMax;
import java.util.Arrays;
/** 
 * This class was automatically generated to test the ds.FPHeapMax class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 5, 8, 10, 11, 12, 14, 15, 16, 18, 19, 20, 21, 23, 24]
Uncovered branches: [17, 4, 6, 22, 7, 9, 13]
Total number of branches: 24
Total number of covered branches: 17
Coverage : 70,83%
Evaluations : 79865
search time (ms): 42503
total runtime (ms): 44186
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[552]
2)----->constroi[], 
3)----->toString[]
 Covered Branches:[1, 8]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTFPHeapMaxP1P1=552;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
      clsUTFPHeapMax.constroi();
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
    int clsUTFPHeapMaxP3RP0P1=-286;
    int clsUTFPHeapMaxP3RP0P2=-14;
    String clsUTFPHeapMaxP3RP0R=null;
//Exception
    try {
      clsUTFPHeapMaxP3RP0R=clsUTFPHeapMaxP3R.substring(clsUTFPHeapMaxP3RP0P1,clsUTFPHeapMaxP3RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTFPHeapMaxP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[198]
2)----->copia[[ds.MeuItem[378],null,retiraMax[]]], 
3)----->toString[]
 Covered Branches:[1, 23, 24]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTFPHeapMaxP1P1=198;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1P1P1=378;
    Item clsUTFPHeapMaxP2P1P1=null;
      clsUTFPHeapMaxP2P1P1=new MeuItem(clsUTFPHeapMaxP2P1P1P1);
    Item clsUTFPHeapMaxP2P1P2=null;
    int clsUTFPHeapMaxP2P1P3P0P1=189;
    FPHeapMax clsUTFPHeapMaxP2P1P3P0=null;
      clsUTFPHeapMaxP2P1P3P0=new FPHeapMax(clsUTFPHeapMaxP2P1P3P0P1);
    Item clsUTFPHeapMaxP2P1P3=null;
//Exception
    try {
      clsUTFPHeapMaxP2P1P3=clsUTFPHeapMaxP2P1P3P0.retiraMax();
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    Item[] clsUTFPHeapMaxP2P1=new Item[]{clsUTFPHeapMaxP2P1P1,clsUTFPHeapMaxP2P1P2,clsUTFPHeapMaxP2P1P3};
      clsUTFPHeapMax.copia(clsUTFPHeapMaxP2P1);
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[757]
2)----->aumentaChave[2, null], 
3)----->max[], 
4)----->toString[]
 Covered Branches:[1, 10, 14, 15]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTFPHeapMaxP1P1=757;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1=2;
//Exception
    try {
      clsUTFPHeapMax.aumentaChave(clsUTFPHeapMaxP2P1,(Object)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    Item clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.max();
    assertNull(clsUTFPHeapMaxP3R);
    String clsUTFPHeapMaxP4R=null;
      clsUTFPHeapMaxP4R=clsUTFPHeapMax.toString();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[1]
2)----->max[], 
3)----->toString[]
 Covered Branches:[1, 10]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTFPHeapMaxP1P1=1;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    Item clsUTFPHeapMaxP2R=null;
      clsUTFPHeapMaxP2R=clsUTFPHeapMax.max();
    assertNull(clsUTFPHeapMaxP2R);
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
    String clsUTFPHeapMaxP3RP0R=null;
      clsUTFPHeapMaxP3RP0R=clsUTFPHeapMaxP3R.trim();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[293]
2)----->insere[ds.MeuItem[-318]], 
3)----->max[], 
4)----->toString[]
 Covered Branches:[16, 1, 18, 20, 10, 14]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTFPHeapMaxP1P1=293;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1P1=-318;
    Item clsUTFPHeapMaxP2P1=null;
      clsUTFPHeapMaxP2P1=new MeuItem(clsUTFPHeapMaxP2P1P1);
      clsUTFPHeapMax.insere(clsUTFPHeapMaxP2P1);
    assertEquals("-318",clsUTFPHeapMaxP2P1.recuperaChave().toString());
    Item clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.max();
    assertEquals("-318",clsUTFPHeapMaxP3R.recuperaChave().toString());
    String clsUTFPHeapMaxP4R=null;
      clsUTFPHeapMaxP4R=clsUTFPHeapMax.toString();
    float clsUTFPHeapMaxP4RP0P1=-19.78621F;
    String clsUTFPHeapMaxP4RP0R=null;
      clsUTFPHeapMaxP4RP0R=String.valueOf(clsUTFPHeapMaxP4RP0P1);
    assertEquals("-19.78621",clsUTFPHeapMaxP4RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[456]
2)----->refaz[0, 578], 
3)----->max[]
 Covered Branches:[1, 2, 3, 10]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTFPHeapMaxP1P1=456;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1=0;
    int clsUTFPHeapMaxP2P2=578;
//Exception
    try {
      clsUTFPHeapMax.refaz(clsUTFPHeapMaxP2P1,clsUTFPHeapMaxP2P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    Item clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.max();
    assertNull(clsUTFPHeapMaxP3R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[640]
2)----->refaz[461, 449], 
3)----->max[]
 Covered Branches:[1, 2, 10]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTFPHeapMaxP1P1=640;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1=461;
    int clsUTFPHeapMaxP2P2=449;
      clsUTFPHeapMax.refaz(clsUTFPHeapMaxP2P1,clsUTFPHeapMaxP2P2);
    Item clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.max();
    assertNull(clsUTFPHeapMaxP3R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[2]
2)----->imprime[], 
3)----->toString[]
 Covered Branches:[1, 21]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTFPHeapMaxP1P1=2;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
      clsUTFPHeapMax.imprime();
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[2]
2)----->insere[ds.MeuItem[648]], 
3)----->toString[], 
4)----->max[]
 Covered Branches:[16, 1, 18, 20, 10, 11, 12, 14]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTFPHeapMaxP1P1=2;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1P1=648;
    Item clsUTFPHeapMaxP2P1=null;
      clsUTFPHeapMaxP2P1=new MeuItem(clsUTFPHeapMaxP2P1P1);
      clsUTFPHeapMax.insere(clsUTFPHeapMaxP2P1);
    assertEquals("648",clsUTFPHeapMaxP2P1.recuperaChave().toString());
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
    int clsUTFPHeapMaxP3RP0P1=0;
    int clsUTFPHeapMaxP3RP0P2=176;
    int clsUTFPHeapMaxP3RP0R=0;
//Exception
    try {
      clsUTFPHeapMaxP3RP0R=clsUTFPHeapMaxP3R.codePointCount(clsUTFPHeapMaxP3RP0P1,clsUTFPHeapMaxP3RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    char[] clsUTFPHeapMaxP3RP1R=null;
      clsUTFPHeapMaxP3RP1R=clsUTFPHeapMaxP3R.toCharArray();
    Item clsUTFPHeapMaxP4R=null;
      clsUTFPHeapMaxP4R=clsUTFPHeapMax.max();
    int clsUTFPHeapMaxP4RP0P1P1=-260;
    Item clsUTFPHeapMaxP4RP0P1=null;
      clsUTFPHeapMaxP4RP0P1=new MeuItem(clsUTFPHeapMaxP4RP0P1P1);
    int clsUTFPHeapMaxP4RP0R=0;
      clsUTFPHeapMaxP4RP0R=clsUTFPHeapMaxP4R.compara(clsUTFPHeapMaxP4RP0P1);
    assertEquals("-260",clsUTFPHeapMaxP4RP0P1.recuperaChave().toString());
    assertEquals(1,clsUTFPHeapMaxP4RP0R);
    Object clsUTFPHeapMaxP4RP1R=null;
      clsUTFPHeapMaxP4RP1R=clsUTFPHeapMaxP4R.recuperaChave();
    assertEquals("648",clsUTFPHeapMaxP4RP1R.toString());
    assertEquals(648,clsUTFPHeapMaxP4RP1R.hashCode());
    assertEquals("648",clsUTFPHeapMaxP4R.recuperaChave().toString());
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[2]
2)----->refaz[0, 0], 
3)----->max[]
 Covered Branches:[1, 2, 3, 5, 10]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTFPHeapMaxP1P1=2;
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
    Item clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.max();
    assertNull(clsUTFPHeapMaxP3R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[877]
2)----->copia[[ds.MeuItem[334]]], 
3)----->toString[]
 Covered Branches:[1, 23]
 */
  @Test public void TestCase10() throws Throwable {
    int clsUTFPHeapMaxP1P1=877;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1P1P1=334;
    Item clsUTFPHeapMaxP2P1P1=null;
      clsUTFPHeapMaxP2P1P1=new MeuItem(clsUTFPHeapMaxP2P1P1P1);
    Item[] clsUTFPHeapMaxP2P1=new Item[]{clsUTFPHeapMaxP2P1P1};
      clsUTFPHeapMax.copia(clsUTFPHeapMaxP2P1);
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[0]
2)----->insere[ds.MeuItem[3]], 
3)----->toString[]
 Covered Branches:[1, 18, 19]
 */
  @Test public void TestCase11() throws Throwable {
    int clsUTFPHeapMaxP1P1=0;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1P1=3;
    Item clsUTFPHeapMaxP2P1=null;
      clsUTFPHeapMaxP2P1=new MeuItem(clsUTFPHeapMaxP2P1P1);
//Exception
    try {
      clsUTFPHeapMax.insere(clsUTFPHeapMaxP2P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("3",clsUTFPHeapMaxP2P1.recuperaChave().toString());
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
    char[] clsUTFPHeapMaxP3RP0P1=new char[]{};
    int clsUTFPHeapMaxP3RP0P2=-1;
    int clsUTFPHeapMaxP3RP0P3=-792;
    String clsUTFPHeapMaxP3RP0R=null;
//Exception
    try {
      clsUTFPHeapMaxP3RP0R=String.valueOf(clsUTFPHeapMaxP3RP0P1,clsUTFPHeapMaxP3RP0P2,clsUTFPHeapMaxP3RP0P3);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertTrue(Arrays.equals(new char[]{},clsUTFPHeapMaxP3RP0P1));
    assertNull(clsUTFPHeapMaxP3RP0R);
  }
}
