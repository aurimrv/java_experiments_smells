package ds.seed5311;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Rule;
import ds.MeuItem;
import ds.Item;
import java.util.Arrays;
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
Evaluations : 78744
search time (ms): 42501
total runtime (ms): 44221
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[161]
2)----->imprime[], 
3)----->toString[]
 Covered Branches:[1, 21]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTFPHeapMaxP1P1=161;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
      clsUTFPHeapMax.imprime();
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
    int clsUTFPHeapMaxP3RP0P1=0;
    int clsUTFPHeapMaxP3RP0R=0;
      clsUTFPHeapMaxP3RP0R=clsUTFPHeapMaxP3R.lastIndexOf(clsUTFPHeapMaxP3RP0P1);
    assertEquals(-1,clsUTFPHeapMaxP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[0]
2)----->insere[ds.MeuItem[-342]], 
3)----->toString[]
 Covered Branches:[1, 18, 19]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTFPHeapMaxP1P1=0;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1P1=-342;
    Item clsUTFPHeapMaxP2P1=null;
      clsUTFPHeapMaxP2P1=new MeuItem(clsUTFPHeapMaxP2P1P1);
//Exception
    try {
      clsUTFPHeapMax.insere(clsUTFPHeapMaxP2P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("-342",clsUTFPHeapMaxP2P1.recuperaChave().toString());
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
    byte[] clsUTFPHeapMaxP3RP0R=null;
      clsUTFPHeapMaxP3RP0R=clsUTFPHeapMaxP3R.getBytes();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[391]
2)----->insere[ds.MeuItem[-603]], 
3)----->toString[]
 Covered Branches:[16, 1, 18, 20, 14]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTFPHeapMaxP1P1=391;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1P1=-603;
    Item clsUTFPHeapMaxP2P1=null;
      clsUTFPHeapMaxP2P1=new MeuItem(clsUTFPHeapMaxP2P1P1);
      clsUTFPHeapMax.insere(clsUTFPHeapMaxP2P1);
    assertEquals("-603",clsUTFPHeapMaxP2P1.recuperaChave().toString());
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
    char clsUTFPHeapMaxP3RP0P1P1O0='\u002e';
    Object clsUTFPHeapMaxP3RP0P1P1=clsUTFPHeapMaxP3RP0P1P1O0;
    CharSequence clsUTFPHeapMaxP3RP0P1=null;
      clsUTFPHeapMaxP3RP0P1=String.valueOf(clsUTFPHeapMaxP3RP0P1P1);
    String clsUTFPHeapMaxP3RP0R=null;
//Exception
    try {
      clsUTFPHeapMaxP3RP0R=clsUTFPHeapMaxP3R.replace(clsUTFPHeapMaxP3RP0P1,(CharSequence)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals(".",clsUTFPHeapMaxP3RP0P1.toString());
    assertEquals(1,clsUTFPHeapMaxP3RP0P1.length());
    assertNull(clsUTFPHeapMaxP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[264]
2)----->copia[[]], 
3)----->toString[], 
4)----->max[]
 Covered Branches:[1, 23, 10]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTFPHeapMaxP1P1=264;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    Item[] clsUTFPHeapMaxP2P1=new Item[]{};
      clsUTFPHeapMax.copia(clsUTFPHeapMaxP2P1);
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
    String clsUTFPHeapMaxP3RP0R=null;
      clsUTFPHeapMaxP3RP0R=clsUTFPHeapMaxP3R.toUpperCase();
    Item clsUTFPHeapMaxP4R=null;
      clsUTFPHeapMaxP4R=clsUTFPHeapMax.max();
    assertNull(clsUTFPHeapMaxP4R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[862]
2)----->copia[[ds.MeuItem[513],ds.MeuItem[1],max[]]], 
3)----->toString[]
 Covered Branches:[1, 23, 24]
 */
 @Ignore
  @Test public void TestCase4() throws Throwable {
    int clsUTFPHeapMaxP1P1=862;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1P1P1=513;
    Item clsUTFPHeapMaxP2P1P1=null;
      clsUTFPHeapMaxP2P1P1=new MeuItem(clsUTFPHeapMaxP2P1P1P1);
    int clsUTFPHeapMaxP2P1P2P1=1;
    Item clsUTFPHeapMaxP2P1P2=null;
      clsUTFPHeapMaxP2P1P2=new MeuItem(clsUTFPHeapMaxP2P1P2P1);
    int clsUTFPHeapMaxP2P1P3P0P1=875;
    FPHeapMax clsUTFPHeapMaxP2P1P3P0=null;
      clsUTFPHeapMaxP2P1P3P0=new FPHeapMax(clsUTFPHeapMaxP2P1P3P0P1);
    Item clsUTFPHeapMaxP2P1P3=null;
      clsUTFPHeapMaxP2P1P3=clsUTFPHeapMaxP2P1P3P0.max();
    Item[] clsUTFPHeapMaxP2P1=new Item[]{clsUTFPHeapMaxP2P1P1,clsUTFPHeapMaxP2P1P2,clsUTFPHeapMaxP2P1P3};
      clsUTFPHeapMax.copia(clsUTFPHeapMaxP2P1);
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
    int clsUTFPHeapMaxP3RP0R=0;
      clsUTFPHeapMaxP3RP0R=clsUTFPHeapMaxP3R.length();
    assertEquals(21,clsUTFPHeapMaxP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[817]
2)----->refaz[22, 299], 
3)----->max[]
 Covered Branches:[1, 2, 3, 10]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTFPHeapMaxP1P1=817;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1=22;
    int clsUTFPHeapMaxP2P2=299;
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
1)----->ds.FPHeapMax[634]
2)----->refaz[411, -164], 
3)----->max[], 
4)----->toString[]
 Covered Branches:[1, 2, 10]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTFPHeapMaxP1P1=634;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1=411;
    int clsUTFPHeapMaxP2P2=-164;
      clsUTFPHeapMax.refaz(clsUTFPHeapMaxP2P1,clsUTFPHeapMaxP2P2);
    Item clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.max();
    assertNull(clsUTFPHeapMaxP3R);
    String clsUTFPHeapMaxP4R=null;
      clsUTFPHeapMaxP4R=clsUTFPHeapMax.toString();
    double clsUTFPHeapMaxP4RP0P1=37.1242133374752D;
    String clsUTFPHeapMaxP4RP0R=null;
      clsUTFPHeapMaxP4RP0R=String.valueOf(clsUTFPHeapMaxP4RP0P1);
    assertEquals("37.1242133374752",clsUTFPHeapMaxP4RP0R);
    boolean clsUTFPHeapMaxP4RP1R=false;
//Exception
    try {
      clsUTFPHeapMaxP4RP1R=clsUTFPHeapMaxP4R.contentEquals((StringBuffer)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[13]
2)----->insere[ds.MeuItem[-738]], 
3)----->max[], 
4)----->toString[]
 Covered Branches:[16, 1, 18, 20, 10, 11, 12, 14]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTFPHeapMaxP1P1=13;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1P1=-738;
    Item clsUTFPHeapMaxP2P1=null;
      clsUTFPHeapMaxP2P1=new MeuItem(clsUTFPHeapMaxP2P1P1);
      clsUTFPHeapMax.insere(clsUTFPHeapMaxP2P1);
    assertEquals("-738",clsUTFPHeapMaxP2P1.recuperaChave().toString());
    Item clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.max();
    int clsUTFPHeapMaxP3RP0P1P1=680;
    Item clsUTFPHeapMaxP3RP0P1=null;
      clsUTFPHeapMaxP3RP0P1=new MeuItem(clsUTFPHeapMaxP3RP0P1P1);
    int clsUTFPHeapMaxP3RP0R=0;
      clsUTFPHeapMaxP3RP0R=clsUTFPHeapMaxP3R.compara(clsUTFPHeapMaxP3RP0P1);
    assertEquals("680",clsUTFPHeapMaxP3RP0P1.recuperaChave().toString());
    assertEquals(-1,clsUTFPHeapMaxP3RP0R);
    int clsUTFPHeapMaxP3RP1P1P1=-568;
    Item clsUTFPHeapMaxP3RP1P1=null;
      clsUTFPHeapMaxP3RP1P1=new MeuItem(clsUTFPHeapMaxP3RP1P1P1);
    int clsUTFPHeapMaxP3RP1R=0;
      clsUTFPHeapMaxP3RP1R=clsUTFPHeapMaxP3R.compara(clsUTFPHeapMaxP3RP1P1);
    assertEquals("-568",clsUTFPHeapMaxP3RP1P1.recuperaChave().toString());
    assertEquals(-1,clsUTFPHeapMaxP3RP1R);
    assertEquals("-738",clsUTFPHeapMaxP3R.recuperaChave().toString());
    String clsUTFPHeapMaxP4R=null;
      clsUTFPHeapMaxP4R=clsUTFPHeapMax.toString();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[703]
2)----->constroi[], 
3)----->toString[]
 Covered Branches:[1, 8]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTFPHeapMaxP1P1=703;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
      clsUTFPHeapMax.constroi();
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
    char clsUTFPHeapMaxP3RP0P1='\u0034';
    char clsUTFPHeapMaxP3RP0P2='\u0071';
    String clsUTFPHeapMaxP3RP0R=null;
      clsUTFPHeapMaxP3RP0R=clsUTFPHeapMaxP3R.replace(clsUTFPHeapMaxP3RP0P1,clsUTFPHeapMaxP3RP0P2);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[424]
2)----->aumentaChave[79, ds.FPHeapMax[-718]], 
3)----->max[]
 Covered Branches:[1, 10, 14, 15]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTFPHeapMaxP1P1=424;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1=79;
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
1)----->ds.FPHeapMax[253]
2)----->refaz[1, 2], 
3)----->max[]
 Covered Branches:[1, 2, 3, 5, 10]
 */
  @Test public void TestCase10() throws Throwable {
    int clsUTFPHeapMaxP1P1=253;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1=1;
    int clsUTFPHeapMaxP2P2=2;
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
