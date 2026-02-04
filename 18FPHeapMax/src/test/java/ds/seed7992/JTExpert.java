package ds.seed7992;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import java.util.Arrays;
import ds.Item;
import ds.FPHeapMax;
import ds.MeuItem;
/** 
 * This class was automatically generated to test the ds.FPHeapMax class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 5, 8, 10, 11, 12, 14, 15, 16, 18, 19, 20, 21, 23, 24]
Uncovered branches: [17, 4, 6, 22, 7, 9, 13]
Total number of branches: 24
Total number of covered branches: 17
Coverage : 70,83%
Evaluations : 89591
search time (ms): 42501
total runtime (ms): 44208
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[326]
2)----->refaz[1, 246], 
3)----->max[]
 Covered Branches:[1, 2, 3, 10]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTFPHeapMaxP1P1=326;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1=1;
    int clsUTFPHeapMaxP2P2=246;
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
1)----->ds.FPHeapMax[408]
2)----->refaz[0, 0], 
3)----->toString[]
 Covered Branches:[1, 2, 3, 5]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTFPHeapMaxP1P1=408;
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
    int clsUTFPHeapMaxP3RP0R=0;
      clsUTFPHeapMaxP3RP0R=clsUTFPHeapMaxP3R.length();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[995]
2)----->aumentaChave[591, ds.FPHeapMax[-235]], 
3)----->toString[]
 Covered Branches:[1, 14, 15]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTFPHeapMaxP1P1=995;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1=591;
//Exception
    try {
      clsUTFPHeapMax.aumentaChave(clsUTFPHeapMaxP2P1,(Object)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[0]
2)----->insere[ds.MeuItem[-984]], 
3)----->max[], 
4)----->toString[]
 Covered Branches:[1, 18, 19, 10]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTFPHeapMaxP1P1=0;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1P1=-984;
    Item clsUTFPHeapMaxP2P1=null;
      clsUTFPHeapMaxP2P1=new MeuItem(clsUTFPHeapMaxP2P1P1);
//Exception
    try {
      clsUTFPHeapMax.insere(clsUTFPHeapMaxP2P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("-984",clsUTFPHeapMaxP2P1.recuperaChave().toString());
    Item clsUTFPHeapMaxP3R=null;
//Exception
    try {
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.max();
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTFPHeapMaxP3R);
    String clsUTFPHeapMaxP4R=null;
      clsUTFPHeapMaxP4R=clsUTFPHeapMax.toString();
    byte[] clsUTFPHeapMaxP4RP0R=null;
      clsUTFPHeapMaxP4RP0R=clsUTFPHeapMaxP4R.getBytes();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[626]
2)----->refaz[140, -130], 
3)----->toString[]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTFPHeapMaxP1P1=626;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1=140;
    int clsUTFPHeapMaxP2P2=-130;
      clsUTFPHeapMax.refaz(clsUTFPHeapMaxP2P1,clsUTFPHeapMaxP2P2);
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[2]
2)----->insere[ds.MeuItem[720]], 
3)----->toString[]
 Covered Branches:[16, 1, 18, 20, 14]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTFPHeapMaxP1P1=2;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1P1=720;
    Item clsUTFPHeapMaxP2P1=null;
      clsUTFPHeapMaxP2P1=new MeuItem(clsUTFPHeapMaxP2P1P1);
      clsUTFPHeapMax.insere(clsUTFPHeapMaxP2P1);
    assertEquals("720",clsUTFPHeapMaxP2P1.recuperaChave().toString());
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
    int clsUTFPHeapMaxP3RP0R=0;
      clsUTFPHeapMaxP3RP0R=clsUTFPHeapMaxP3R.length();
    int clsUTFPHeapMaxP3RP1P1=443;
    int clsUTFPHeapMaxP3RP1P2=-937;
    CharSequence clsUTFPHeapMaxP3RP1R=null;
//Exception
    try {
      clsUTFPHeapMaxP3RP1R=clsUTFPHeapMaxP3R.subSequence(clsUTFPHeapMaxP3RP1P1,clsUTFPHeapMaxP3RP1P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTFPHeapMaxP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[402]
2)----->imprime[], 
3)----->max[]
 Covered Branches:[1, 21, 10]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTFPHeapMaxP1P1=402;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
      clsUTFPHeapMax.imprime();
    Item clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.max();
    assertNull(clsUTFPHeapMaxP3R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[2]
2)----->constroi[], 
3)----->toString[]
 Covered Branches:[1, 8]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTFPHeapMaxP1P1=2;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
      clsUTFPHeapMax.constroi();
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
    String clsUTFPHeapMaxP3RP0P1=new String("8]=i2~z*");
    int clsUTFPHeapMaxP3RP0R=0;
      clsUTFPHeapMaxP3RP0R=clsUTFPHeapMaxP3R.lastIndexOf(clsUTFPHeapMaxP3RP0P1);
    assertEquals("8]=i2~z*",clsUTFPHeapMaxP3RP0P1.toString());
    assertEquals(-1,clsUTFPHeapMaxP3RP0R);
    byte[] clsUTFPHeapMaxP3RP1R=null;
      clsUTFPHeapMaxP3RP1R=clsUTFPHeapMaxP3R.getBytes();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[742]
2)----->copia[[ds.MeuItem[-807],null,ds.MeuItem[0],ds.MeuItem[686]]], 
3)----->toString[]
 Covered Branches:[1, 23, 24]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTFPHeapMaxP1P1=742;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1P1P1=-807;
    Item clsUTFPHeapMaxP2P1P1=null;
      clsUTFPHeapMaxP2P1P1=new MeuItem(clsUTFPHeapMaxP2P1P1P1);
    Item clsUTFPHeapMaxP2P1P2=null;
    int clsUTFPHeapMaxP2P1P3P1=0;
    Item clsUTFPHeapMaxP2P1P3=null;
      clsUTFPHeapMaxP2P1P3=new MeuItem(clsUTFPHeapMaxP2P1P3P1);
    int clsUTFPHeapMaxP2P1P4P1=686;
    Item clsUTFPHeapMaxP2P1P4=null;
      clsUTFPHeapMaxP2P1P4=new MeuItem(clsUTFPHeapMaxP2P1P4P1);
    Item[] clsUTFPHeapMaxP2P1=new Item[]{clsUTFPHeapMaxP2P1P1,clsUTFPHeapMaxP2P1P2,clsUTFPHeapMaxP2P1P3,clsUTFPHeapMaxP2P1P4};
      clsUTFPHeapMax.copia(clsUTFPHeapMaxP2P1);
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
    char[] clsUTFPHeapMaxP3RP0P1=new char[]{'\u0033','\u0065'};
    String clsUTFPHeapMaxP3RP0R=null;
      clsUTFPHeapMaxP3RP0R=String.valueOf(clsUTFPHeapMaxP3RP0P1);
    assertTrue(Arrays.equals(new char[]{'\u0033','\u0065'},clsUTFPHeapMaxP3RP0P1));
    assertEquals("3e",clsUTFPHeapMaxP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[904]
2)----->insere[ds.MeuItem[-719]], 
3)----->max[]
 Covered Branches:[16, 1, 18, 20, 10, 11, 12, 14]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTFPHeapMaxP1P1=904;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1P1=-719;
    Item clsUTFPHeapMaxP2P1=null;
      clsUTFPHeapMaxP2P1=new MeuItem(clsUTFPHeapMaxP2P1P1);
      clsUTFPHeapMax.insere(clsUTFPHeapMaxP2P1);
    assertEquals("-719",clsUTFPHeapMaxP2P1.recuperaChave().toString());
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
    Object clsUTFPHeapMaxP3RP1R=null;
      clsUTFPHeapMaxP3RP1R=clsUTFPHeapMaxP3R.recuperaChave();
    assertEquals("-719",clsUTFPHeapMaxP3RP1R.toString());
    assertEquals(-719,clsUTFPHeapMaxP3RP1R.hashCode());
    assertEquals("-719",clsUTFPHeapMaxP3R.recuperaChave().toString());
  }
}
