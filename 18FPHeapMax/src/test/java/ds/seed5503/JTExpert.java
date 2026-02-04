package ds.seed5503;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import java.util.Arrays;
import ds.MeuItem;
import ds.Item;
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
Evaluations : 75908
search time (ms): 42501
total runtime (ms): 43783
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[165]
2)----->copia[[ds.MeuItem[-978],ds.MeuItem[236],ds.MeuItem[904],ds.MeuItem[588]]], 
3)----->max[], 
4)----->toString[]
 Covered Branches:[1, 23, 24, 10]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTFPHeapMaxP1P1=165;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1P1P1=-978;
    Item clsUTFPHeapMaxP2P1P1=null;
      clsUTFPHeapMaxP2P1P1=new MeuItem(clsUTFPHeapMaxP2P1P1P1);
    int clsUTFPHeapMaxP2P1P2P1=236;
    Item clsUTFPHeapMaxP2P1P2=null;
      clsUTFPHeapMaxP2P1P2=new MeuItem(clsUTFPHeapMaxP2P1P2P1);
    int clsUTFPHeapMaxP2P1P3P1=904;
    Item clsUTFPHeapMaxP2P1P3=null;
      clsUTFPHeapMaxP2P1P3=new MeuItem(clsUTFPHeapMaxP2P1P3P1);
    int clsUTFPHeapMaxP2P1P4P1=588;
    Item clsUTFPHeapMaxP2P1P4=null;
      clsUTFPHeapMaxP2P1P4=new MeuItem(clsUTFPHeapMaxP2P1P4P1);
    Item[] clsUTFPHeapMaxP2P1=new Item[]{clsUTFPHeapMaxP2P1P1,clsUTFPHeapMaxP2P1P2,clsUTFPHeapMaxP2P1P3,clsUTFPHeapMaxP2P1P4};
      clsUTFPHeapMax.copia(clsUTFPHeapMaxP2P1);
    Item clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.max();
    assertEquals("236",clsUTFPHeapMaxP3R.recuperaChave().toString());
    String clsUTFPHeapMaxP4R=null;
      clsUTFPHeapMaxP4R=clsUTFPHeapMax.toString();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[945]
2)----->insere[ds.MeuItem[873]], 
3)----->max[], 
4)----->toString[]
 Covered Branches:[16, 1, 18, 20, 10, 14]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTFPHeapMaxP1P1=945;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1P1=873;
    Item clsUTFPHeapMaxP2P1=null;
      clsUTFPHeapMaxP2P1=new MeuItem(clsUTFPHeapMaxP2P1P1);
      clsUTFPHeapMax.insere(clsUTFPHeapMaxP2P1);
    assertEquals("873",clsUTFPHeapMaxP2P1.recuperaChave().toString());
    Item clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.max();
    assertEquals("873",clsUTFPHeapMaxP3R.recuperaChave().toString());
    String clsUTFPHeapMaxP4R=null;
      clsUTFPHeapMaxP4R=clsUTFPHeapMax.toString();
    int clsUTFPHeapMaxP4RP0P1=0;
    int clsUTFPHeapMaxP4RP0R=0;
      clsUTFPHeapMaxP4RP0R=clsUTFPHeapMaxP4R.lastIndexOf(clsUTFPHeapMaxP4RP0P1);
    assertEquals(-1,clsUTFPHeapMaxP4RP0R);
    float clsUTFPHeapMaxP4RP1P1=34.166946F;
    String clsUTFPHeapMaxP4RP1R=null;
      clsUTFPHeapMaxP4RP1R=String.valueOf(clsUTFPHeapMaxP4RP1P1);
    assertEquals("34.166946",clsUTFPHeapMaxP4RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[788]
2)----->max[], 
3)----->toString[]
 Covered Branches:[1, 10]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTFPHeapMaxP1P1=788;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    Item clsUTFPHeapMaxP2R=null;
      clsUTFPHeapMaxP2R=clsUTFPHeapMax.max();
    assertNull(clsUTFPHeapMaxP2R);
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
    float clsUTFPHeapMaxP3RP0P1=90.396545F;
    String clsUTFPHeapMaxP3RP0R=null;
      clsUTFPHeapMaxP3RP0R=String.valueOf(clsUTFPHeapMaxP3RP0P1);
    assertEquals("90.396545",clsUTFPHeapMaxP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[885]
2)----->aumentaChave[22, null], 
3)----->max[]
 Covered Branches:[1, 10, 14, 15]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTFPHeapMaxP1P1=885;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1=22;
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
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[0]
2)----->insere[ds.MeuItem[747]], 
3)----->toString[]
 Covered Branches:[1, 18, 19]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTFPHeapMaxP1P1=0;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1P1=747;
    Item clsUTFPHeapMaxP2P1=null;
      clsUTFPHeapMaxP2P1=new MeuItem(clsUTFPHeapMaxP2P1P1);
//Exception
    try {
      clsUTFPHeapMax.insere(clsUTFPHeapMaxP2P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("747",clsUTFPHeapMaxP2P1.recuperaChave().toString());
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
    CharSequence clsUTFPHeapMaxP3RP0P1=null;
      clsUTFPHeapMaxP3RP0P1=new StringBuffer();
    int clsUTFPHeapMaxP3RP0P2P1P1=2;
    StringBuffer clsUTFPHeapMaxP3RP0P2P1=null;
      clsUTFPHeapMaxP3RP0P2P1=new StringBuffer(clsUTFPHeapMaxP3RP0P2P1P1);
    CharSequence clsUTFPHeapMaxP3RP0P2=null;
      clsUTFPHeapMaxP3RP0P2=new String(clsUTFPHeapMaxP3RP0P2P1);
    String clsUTFPHeapMaxP3RP0R=null;
      clsUTFPHeapMaxP3RP0R=clsUTFPHeapMaxP3R.replace(clsUTFPHeapMaxP3RP0P1,clsUTFPHeapMaxP3RP0P2);
    assertEquals("",clsUTFPHeapMaxP3RP0P1.toString());
    assertEquals(0,clsUTFPHeapMaxP3RP0P1.length());
    assertEquals("",clsUTFPHeapMaxP3RP0P2.toString());
    assertEquals(0,clsUTFPHeapMaxP3RP0P2.length());
    String clsUTFPHeapMaxP3RP1P1P1=new String("ib4kk5w46jemsj8adk5flagw0");
    CharSequence clsUTFPHeapMaxP3RP1P1=null;
      clsUTFPHeapMaxP3RP1P1=new StringBuffer(clsUTFPHeapMaxP3RP1P1P1);
    boolean clsUTFPHeapMaxP3RP1R=false;
      clsUTFPHeapMaxP3RP1R=clsUTFPHeapMaxP3R.contentEquals(clsUTFPHeapMaxP3RP1P1);
    assertEquals("ib4kk5w46jemsj8adk5flagw0",clsUTFPHeapMaxP3RP1P1.toString());
    assertEquals(25,clsUTFPHeapMaxP3RP1P1.length());
    assertEquals(false,clsUTFPHeapMaxP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[260]
2)----->refaz[4, -472], 
3)----->max[], 
4)----->toString[]
 Covered Branches:[1, 2, 10]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTFPHeapMaxP1P1=260;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1=4;
    int clsUTFPHeapMaxP2P2=-472;
      clsUTFPHeapMax.refaz(clsUTFPHeapMaxP2P1,clsUTFPHeapMaxP2P2);
    Item clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.max();
    assertNull(clsUTFPHeapMaxP3R);
    String clsUTFPHeapMaxP4R=null;
      clsUTFPHeapMaxP4R=clsUTFPHeapMax.toString();
    String clsUTFPHeapMaxP4RP0P1=new String("EwhJH1vQ9bBi7zsTXK2IcyjW3Odpga0NF6ACSkLV4fer5xqnPGtDRmoUlYM8uZ");
    String clsUTFPHeapMaxP4RP0R=null;
      clsUTFPHeapMaxP4RP0R=clsUTFPHeapMaxP4R.concat(clsUTFPHeapMaxP4RP0P1);
    assertEquals("EwhJH1vQ9bBi7zsTXK2IcyjW3Odpga0NF6ACSkLV4fer5xqnPGtDRmoUlYM8uZ",clsUTFPHeapMaxP4RP0P1.toString());
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[322]
2)----->insere[ds.MeuItem[-1]], 
3)----->max[]
 Covered Branches:[16, 1, 18, 20, 10, 11, 12, 14]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTFPHeapMaxP1P1=322;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1P1=-1;
    Item clsUTFPHeapMaxP2P1=null;
      clsUTFPHeapMaxP2P1=new MeuItem(clsUTFPHeapMaxP2P1P1);
      clsUTFPHeapMax.insere(clsUTFPHeapMaxP2P1);
    assertEquals("-1",clsUTFPHeapMaxP2P1.recuperaChave().toString());
    Item clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.max();
    int clsUTFPHeapMaxP3RP0R=0;
//Exception
    try {
      clsUTFPHeapMaxP3RP0R=clsUTFPHeapMaxP3R.compara((Item)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    int clsUTFPHeapMaxP3RP1P1P1=-652;
    Item clsUTFPHeapMaxP3RP1P1=null;
      clsUTFPHeapMaxP3RP1P1=new MeuItem(clsUTFPHeapMaxP3RP1P1P1);
    int clsUTFPHeapMaxP3RP1R=0;
      clsUTFPHeapMaxP3RP1R=clsUTFPHeapMaxP3R.compara(clsUTFPHeapMaxP3RP1P1);
    assertEquals("-652",clsUTFPHeapMaxP3RP1P1.recuperaChave().toString());
    assertEquals(1,clsUTFPHeapMaxP3RP1R);
    assertEquals("-1",clsUTFPHeapMaxP3R.recuperaChave().toString());
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[123]
2)----->constroi[], 
3)----->toString[]
 Covered Branches:[1, 8]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTFPHeapMaxP1P1=123;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
      clsUTFPHeapMax.constroi();
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[655]
2)----->imprime[], 
3)----->toString[]
 Covered Branches:[1, 21]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTFPHeapMaxP1P1=655;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
      clsUTFPHeapMax.imprime();
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[299]
2)----->copia[[]], 
3)----->toString[]
 Covered Branches:[1, 23]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTFPHeapMaxP1P1=299;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    Item[] clsUTFPHeapMaxP2P1=new Item[]{};
      clsUTFPHeapMax.copia(clsUTFPHeapMaxP2P1);
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
    int clsUTFPHeapMaxP3RP0P1=137;
    int clsUTFPHeapMaxP3RP0P2=-865;
    int clsUTFPHeapMaxP3RP0R=0;
//Exception
    try {
      clsUTFPHeapMaxP3RP0R=clsUTFPHeapMaxP3R.offsetByCodePoints(clsUTFPHeapMaxP3RP0P1,clsUTFPHeapMaxP3RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    char[] clsUTFPHeapMaxP3RP1P1=new char[]{};
    String clsUTFPHeapMaxP3RP1R=null;
      clsUTFPHeapMaxP3RP1R=String.copyValueOf(clsUTFPHeapMaxP3RP1P1);
    assertTrue(Arrays.equals(new char[]{},clsUTFPHeapMaxP3RP1P1));
    assertEquals("",clsUTFPHeapMaxP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[779]
2)----->refaz[3, 306], 
3)----->toString[]
 Covered Branches:[1, 2, 3]
 */
  @Test public void TestCase10() throws Throwable {
    int clsUTFPHeapMaxP1P1=779;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1=3;
    int clsUTFPHeapMaxP2P2=306;
//Exception
    try {
      clsUTFPHeapMax.refaz(clsUTFPHeapMaxP2P1,clsUTFPHeapMaxP2P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
    char[] clsUTFPHeapMaxP3RP0R=null;
      clsUTFPHeapMaxP3RP0R=clsUTFPHeapMaxP3R.toCharArray();
    byte[] clsUTFPHeapMaxP3RP1R=null;
      clsUTFPHeapMaxP3RP1R=clsUTFPHeapMaxP3R.getBytes();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[1]
2)----->refaz[0, 0], 
3)----->max[]
 Covered Branches:[1, 2, 3, 5, 10]
 */
  @Test public void TestCase11() throws Throwable {
    int clsUTFPHeapMaxP1P1=1;
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
}
