package ds.seed5831;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
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
Evaluations : 85830
search time (ms): 42501
total runtime (ms): 44154
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[652]
2)----->insere[ds.MeuItem[267]], 
3)----->max[], 
4)----->toString[]
 Covered Branches:[16, 1, 18, 20, 10, 11, 12, 14]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTFPHeapMaxP1P1=652;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1P1=267;
    Item clsUTFPHeapMaxP2P1=null;
      clsUTFPHeapMaxP2P1=new MeuItem(clsUTFPHeapMaxP2P1P1);
      clsUTFPHeapMax.insere(clsUTFPHeapMaxP2P1);
    assertEquals("267",clsUTFPHeapMaxP2P1.recuperaChave().toString());
    Item clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.max();
    Object clsUTFPHeapMaxP3RP0R=null;
      clsUTFPHeapMaxP3RP0R=clsUTFPHeapMaxP3R.recuperaChave();
    assertEquals("267",clsUTFPHeapMaxP3RP0R.toString());
    assertEquals(267,clsUTFPHeapMaxP3RP0R.hashCode());
    int clsUTFPHeapMaxP3RP1R=0;
//Exception
    try {
      clsUTFPHeapMaxP3RP1R=clsUTFPHeapMaxP3R.compara((Item)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("267",clsUTFPHeapMaxP3R.recuperaChave().toString());
    String clsUTFPHeapMaxP4R=null;
      clsUTFPHeapMaxP4R=clsUTFPHeapMax.toString();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[2]
2)----->copia[[ds.MeuItem[-599],ds.MeuItem[264]]], 
3)----->max[], 
4)----->toString[]
 Covered Branches:[1, 23, 24, 10]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTFPHeapMaxP1P1=2;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1P1P1=-599;
    Item clsUTFPHeapMaxP2P1P1=null;
      clsUTFPHeapMaxP2P1P1=new MeuItem(clsUTFPHeapMaxP2P1P1P1);
    int clsUTFPHeapMaxP2P1P2P1=264;
    Item clsUTFPHeapMaxP2P1P2=null;
      clsUTFPHeapMaxP2P1P2=new MeuItem(clsUTFPHeapMaxP2P1P2P1);
    Item[] clsUTFPHeapMaxP2P1=new Item[]{clsUTFPHeapMaxP2P1P1,clsUTFPHeapMaxP2P1P2};
      clsUTFPHeapMax.copia(clsUTFPHeapMaxP2P1);
    Item clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.max();
    Object clsUTFPHeapMaxP3RP0R=null;
      clsUTFPHeapMaxP3RP0R=clsUTFPHeapMaxP3R.recuperaChave();
    assertEquals("264",clsUTFPHeapMaxP3RP0R.toString());
    assertEquals(264,clsUTFPHeapMaxP3RP0R.hashCode());
    int clsUTFPHeapMaxP3RP1P1P1=-406;
    Item clsUTFPHeapMaxP3RP1P1=null;
      clsUTFPHeapMaxP3RP1P1=new MeuItem(clsUTFPHeapMaxP3RP1P1P1);
    int clsUTFPHeapMaxP3RP1R=0;
      clsUTFPHeapMaxP3RP1R=clsUTFPHeapMaxP3R.compara(clsUTFPHeapMaxP3RP1P1);
    assertEquals("-406",clsUTFPHeapMaxP3RP1P1.recuperaChave().toString());
    assertEquals(1,clsUTFPHeapMaxP3RP1R);
    assertEquals("264",clsUTFPHeapMaxP3R.recuperaChave().toString());
    String clsUTFPHeapMaxP4R=null;
      clsUTFPHeapMaxP4R=clsUTFPHeapMax.toString();
    int clsUTFPHeapMaxP4RP0P1=78;
    String clsUTFPHeapMaxP4RP0R=null;
      clsUTFPHeapMaxP4RP0R=String.valueOf(clsUTFPHeapMaxP4RP0P1);
    assertEquals("78",clsUTFPHeapMaxP4RP0R);
    String clsUTFPHeapMaxP4RP1R=null;
      clsUTFPHeapMaxP4RP1R=clsUTFPHeapMaxP4R.toLowerCase();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[1]
2)----->imprime[], 
3)----->toString[]
 Covered Branches:[1, 21]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTFPHeapMaxP1P1=1;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
      clsUTFPHeapMax.imprime();
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
    String clsUTFPHeapMaxP3RP0P1=new String(" ");
    boolean clsUTFPHeapMaxP3RP0R=false;
      clsUTFPHeapMaxP3RP0R=clsUTFPHeapMaxP3R.matches(clsUTFPHeapMaxP3RP0P1);
    assertEquals(" ",clsUTFPHeapMaxP3RP0P1.toString());
    assertEquals(false,clsUTFPHeapMaxP3RP0R);
    int clsUTFPHeapMaxP3RP1R=0;
      clsUTFPHeapMaxP3RP1R=clsUTFPHeapMaxP3R.hashCode();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[170]
2)----->aumentaChave[0, String], 
3)----->toString[]
 Covered Branches:[1, 14, 15]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTFPHeapMaxP1P1=170;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1=0;
//Exception
    try {
      clsUTFPHeapMax.aumentaChave(clsUTFPHeapMaxP2P1,(Object)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
    int clsUTFPHeapMaxP3RP0P1=-35;
    String clsUTFPHeapMaxP3RP0P2=new String("`3y_x!1t[h~5rdu>9&le7g:8) fvm{s<z/2bk'qca}]%#o@0?+;-^(=*4nj6|$.i_pw\\\\\\\\\\\\\"");
    int clsUTFPHeapMaxP3RP0P3=1;
    int clsUTFPHeapMaxP3RP0P4=-385;
    boolean clsUTFPHeapMaxP3RP0R=false;
      clsUTFPHeapMaxP3RP0R=clsUTFPHeapMaxP3R.regionMatches(clsUTFPHeapMaxP3RP0P1,clsUTFPHeapMaxP3RP0P2,clsUTFPHeapMaxP3RP0P3,clsUTFPHeapMaxP3RP0P4);
    assertEquals(false,clsUTFPHeapMaxP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[71]
2)----->refaz[1, 2], 
3)----->max[]
 Covered Branches:[1, 2, 3, 5, 10]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTFPHeapMaxP1P1=71;
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
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[0]
2)----->insere[ds.MeuItem[0]], 
3)----->toString[], 
4)----->max[]
 Covered Branches:[1, 18, 19, 10]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTFPHeapMaxP1P1=0;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1P1=0;
    Item clsUTFPHeapMaxP2P1=null;
      clsUTFPHeapMaxP2P1=new MeuItem(clsUTFPHeapMaxP2P1P1);
//Exception
    try {
      clsUTFPHeapMax.insere(clsUTFPHeapMaxP2P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("0",clsUTFPHeapMaxP2P1.recuperaChave().toString());
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
    Item clsUTFPHeapMaxP4R=null;
//Exception
    try {
      clsUTFPHeapMaxP4R=clsUTFPHeapMax.max();
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTFPHeapMaxP4R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[354]
2)----->insere[ds.MeuItem[-368]], 
3)----->max[]
 Covered Branches:[16, 1, 18, 20, 10, 14]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTFPHeapMaxP1P1=354;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1P1=-368;
    Item clsUTFPHeapMaxP2P1=null;
      clsUTFPHeapMaxP2P1=new MeuItem(clsUTFPHeapMaxP2P1P1);
      clsUTFPHeapMax.insere(clsUTFPHeapMaxP2P1);
    assertEquals("-368",clsUTFPHeapMaxP2P1.recuperaChave().toString());
    Item clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.max();
    Object clsUTFPHeapMaxP3RP0R=null;
      clsUTFPHeapMaxP3RP0R=clsUTFPHeapMaxP3R.recuperaChave();
    assertEquals("-368",clsUTFPHeapMaxP3RP0R.toString());
    assertEquals(-368,clsUTFPHeapMaxP3RP0R.hashCode());
    assertEquals("-368",clsUTFPHeapMaxP3R.recuperaChave().toString());
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[495]
2)----->constroi[], 
3)----->toString[]
 Covered Branches:[1, 8]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTFPHeapMaxP1P1=495;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
      clsUTFPHeapMax.constroi();
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[512]
2)----->refaz[0, -331], 
3)----->toString[]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTFPHeapMaxP1P1=512;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1=0;
    int clsUTFPHeapMaxP2P2=-331;
      clsUTFPHeapMax.refaz(clsUTFPHeapMaxP2P1,clsUTFPHeapMaxP2P2);
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
  }
}
