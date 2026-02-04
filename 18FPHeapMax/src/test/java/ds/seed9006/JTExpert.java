package ds.seed9006;
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
Evaluations : 78760
search time (ms): 42531
total runtime (ms): 44354
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[1]
2)----->insere[ds.MeuItem[0]], 
3)----->max[], 
4)----->toString[]
 Covered Branches:[16, 1, 18, 20, 10, 11, 12, 14]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTFPHeapMaxP1P1=1;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1P1=0;
    Item clsUTFPHeapMaxP2P1=null;
      clsUTFPHeapMaxP2P1=new MeuItem(clsUTFPHeapMaxP2P1P1);
      clsUTFPHeapMax.insere(clsUTFPHeapMaxP2P1);
    assertEquals("0",clsUTFPHeapMaxP2P1.recuperaChave().toString());
    Item clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.max();
    Object clsUTFPHeapMaxP3RP0R=null;
      clsUTFPHeapMaxP3RP0R=clsUTFPHeapMaxP3R.recuperaChave();
    assertEquals("0",clsUTFPHeapMaxP3RP0R.toString());
    assertEquals(0,clsUTFPHeapMaxP3RP0R.hashCode());
    int clsUTFPHeapMaxP3RP1R=0;
//Exception
    try {
      clsUTFPHeapMaxP3RP1R=clsUTFPHeapMaxP3R.compara((Item)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("0",clsUTFPHeapMaxP3R.recuperaChave().toString());
    String clsUTFPHeapMaxP4R=null;
      clsUTFPHeapMaxP4R=clsUTFPHeapMax.toString();
    char clsUTFPHeapMaxP4RP0P1='\u0038';
    char clsUTFPHeapMaxP4RP0P2='\u0076';
    String clsUTFPHeapMaxP4RP0R=null;
      clsUTFPHeapMaxP4RP0R=clsUTFPHeapMaxP4R.replace(clsUTFPHeapMaxP4RP0P1,clsUTFPHeapMaxP4RP0P2);
    String clsUTFPHeapMaxP4RP1P1=new String("X:I&.X@O`%Xg7#pW<JT&");
    boolean clsUTFPHeapMaxP4RP1R=false;
      clsUTFPHeapMaxP4RP1R=clsUTFPHeapMaxP4R.endsWith(clsUTFPHeapMaxP4RP1P1);
    assertEquals(false,clsUTFPHeapMaxP4RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[900]
2)----->refaz[1, 0], 
3)----->max[]
 Covered Branches:[1, 2, 10]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTFPHeapMaxP1P1=900;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1=1;
    int clsUTFPHeapMaxP2P2=0;
      clsUTFPHeapMax.refaz(clsUTFPHeapMaxP2P1,clsUTFPHeapMaxP2P2);
    Item clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.max();
    assertNull(clsUTFPHeapMaxP3R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[585]
2)----->refaz[1, 2], 
3)----->toString[]
 Covered Branches:[1, 2, 3, 5]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTFPHeapMaxP1P1=585;
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
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[925]
2)----->copia[[retiraMax[],ds.MeuItem[500],ds.MeuItem[-208]]], 
3)----->toString[]
 Covered Branches:[1, 23, 24]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTFPHeapMaxP1P1=925;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1P1P0P1=606;
    FPHeapMax clsUTFPHeapMaxP2P1P1P0=null;
      clsUTFPHeapMaxP2P1P1P0=new FPHeapMax(clsUTFPHeapMaxP2P1P1P0P1);
    Item clsUTFPHeapMaxP2P1P1=null;
//Exception
    try {
      clsUTFPHeapMaxP2P1P1=clsUTFPHeapMaxP2P1P1P0.retiraMax();
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    int clsUTFPHeapMaxP2P1P2P1=500;
    Item clsUTFPHeapMaxP2P1P2=null;
      clsUTFPHeapMaxP2P1P2=new MeuItem(clsUTFPHeapMaxP2P1P2P1);
    int clsUTFPHeapMaxP2P1P3P1=-208;
    Item clsUTFPHeapMaxP2P1P3=null;
      clsUTFPHeapMaxP2P1P3=new MeuItem(clsUTFPHeapMaxP2P1P3P1);
    Item[] clsUTFPHeapMaxP2P1=new Item[]{clsUTFPHeapMaxP2P1P1,clsUTFPHeapMaxP2P1P2,clsUTFPHeapMaxP2P1P3};
      clsUTFPHeapMax.copia(clsUTFPHeapMaxP2P1);
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[345]
2)----->aumentaChave[188, null], 
3)----->max[]
 Covered Branches:[1, 10, 14, 15]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTFPHeapMaxP1P1=345;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1=188;
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
1)----->ds.FPHeapMax[785]
2)----->imprime[], 
3)----->toString[]
 Covered Branches:[1, 21]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTFPHeapMaxP1P1=785;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
      clsUTFPHeapMax.imprime();
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
    int clsUTFPHeapMaxP3RP0P1=20;
    int clsUTFPHeapMaxP3RP0P2=-659;
    int clsUTFPHeapMaxP3RP0R=0;
      clsUTFPHeapMaxP3RP0R=clsUTFPHeapMaxP3R.lastIndexOf(clsUTFPHeapMaxP3RP0P1,clsUTFPHeapMaxP3RP0P2);
    assertEquals(-1,clsUTFPHeapMaxP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[233]
2)----->constroi[], 
3)----->toString[]
 Covered Branches:[1, 8]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTFPHeapMaxP1P1=233;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
      clsUTFPHeapMax.constroi();
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
    String clsUTFPHeapMaxP3RP0P1=new String("");
    String[] clsUTFPHeapMaxP3RP0R=null;
      clsUTFPHeapMaxP3RP0R=clsUTFPHeapMaxP3R.split(clsUTFPHeapMaxP3RP0P1);
    assertEquals("",clsUTFPHeapMaxP3RP0P1.toString());
    String clsUTFPHeapMaxP3RP1P1P1=new String("[]=:({!+^/~ -?;}`'<$&_.)_#@|>*");
    CharSequence clsUTFPHeapMaxP3RP1P1=null;
      clsUTFPHeapMaxP3RP1P1=new StringBuilder(clsUTFPHeapMaxP3RP1P1P1);
    String clsUTFPHeapMaxP3RP1R=null;
//Exception
    try {
      clsUTFPHeapMaxP3RP1R=String.join(clsUTFPHeapMaxP3RP1P1,(Iterable)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals(30,clsUTFPHeapMaxP3RP1P1.length());
    assertNull(clsUTFPHeapMaxP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[273]
2)----->max[], 
3)----->toString[]
 Covered Branches:[1, 10]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTFPHeapMaxP1P1=273;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    Item clsUTFPHeapMaxP2R=null;
      clsUTFPHeapMaxP2R=clsUTFPHeapMax.max();
    assertNull(clsUTFPHeapMaxP2R);
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
    int clsUTFPHeapMaxP3RP0P1=-865;
    int clsUTFPHeapMaxP3RP0R=0;
      clsUTFPHeapMaxP3RP0R=clsUTFPHeapMaxP3R.indexOf(clsUTFPHeapMaxP3RP0P1);
    assertEquals(-1,clsUTFPHeapMaxP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[557]
2)----->insere[ds.MeuItem[3]], 
3)----->toString[]
 Covered Branches:[16, 1, 18, 20, 14]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTFPHeapMaxP1P1=557;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1P1=3;
    Item clsUTFPHeapMaxP2P1=null;
      clsUTFPHeapMaxP2P1=new MeuItem(clsUTFPHeapMaxP2P1P1);
      clsUTFPHeapMax.insere(clsUTFPHeapMaxP2P1);
    assertEquals("3",clsUTFPHeapMaxP2P1.recuperaChave().toString());
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
    int clsUTFPHeapMaxP3RP0P1=-316;
    String clsUTFPHeapMaxP3RP0R=null;
//Exception
    try {
      clsUTFPHeapMaxP3RP0R=clsUTFPHeapMaxP3R.substring(clsUTFPHeapMaxP3RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTFPHeapMaxP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[2]
2)----->copia[[]], 
3)----->toString[]
 Covered Branches:[1, 23]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTFPHeapMaxP1P1=2;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    Item[] clsUTFPHeapMaxP2P1=new Item[]{};
      clsUTFPHeapMax.copia(clsUTFPHeapMaxP2P1);
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
    String clsUTFPHeapMaxP3RP0R=null;
      clsUTFPHeapMaxP3RP0R=clsUTFPHeapMaxP3R.toUpperCase();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[0]
2)----->insere[ds.MeuItem[817]], 
3)----->max[], 
4)----->toString[]
 Covered Branches:[1, 18, 19, 10]
 */
  @Test public void TestCase10() throws Throwable {
    int clsUTFPHeapMaxP1P1=0;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1P1=817;
    Item clsUTFPHeapMaxP2P1=null;
      clsUTFPHeapMaxP2P1=new MeuItem(clsUTFPHeapMaxP2P1P1);
//Exception
    try {
      clsUTFPHeapMax.insere(clsUTFPHeapMaxP2P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("817",clsUTFPHeapMaxP2P1.recuperaChave().toString());
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
    int clsUTFPHeapMaxP4RP1P1=-922;
    int clsUTFPHeapMaxP4RP1R=0;
      clsUTFPHeapMaxP4RP1R=clsUTFPHeapMaxP4R.lastIndexOf(clsUTFPHeapMaxP4RP1P1);
    assertEquals(-1,clsUTFPHeapMaxP4RP1R);
  }
}
