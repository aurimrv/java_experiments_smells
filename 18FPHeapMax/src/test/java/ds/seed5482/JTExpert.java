package ds.seed5482;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
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
Evaluations : 75737
search time (ms): 42501
total runtime (ms): 44145
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[785]
2)----->refaz[635, -116], 
3)----->max[]
 Covered Branches:[1, 2, 10]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTFPHeapMaxP1P1=785;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1=635;
    int clsUTFPHeapMaxP2P2=-116;
      clsUTFPHeapMax.refaz(clsUTFPHeapMaxP2P1,clsUTFPHeapMaxP2P2);
    Item clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.max();
    assertNull(clsUTFPHeapMaxP3R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[575]
2)----->imprime[], 
3)----->toString[], 
4)----->max[]
 Covered Branches:[1, 21, 10]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTFPHeapMaxP1P1=575;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
      clsUTFPHeapMax.imprime();
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
    char clsUTFPHeapMaxP3RP0P1='\u0066';
    String clsUTFPHeapMaxP3RP0R=null;
      clsUTFPHeapMaxP3RP0R=String.valueOf(clsUTFPHeapMaxP3RP0P1);
    assertEquals("f",clsUTFPHeapMaxP3RP0R);
    Item clsUTFPHeapMaxP4R=null;
      clsUTFPHeapMaxP4R=clsUTFPHeapMax.max();
    assertNull(clsUTFPHeapMaxP4R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[31]
2)----->aumentaChave[0, null], 
3)----->max[]
 Covered Branches:[1, 10, 14, 15]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTFPHeapMaxP1P1=31;
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
    Item clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.max();
    assertNull(clsUTFPHeapMaxP3R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[514]
2)----->refaz[0, 689], 
3)----->max[]
 Covered Branches:[1, 2, 3, 10]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTFPHeapMaxP1P1=514;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1=0;
    int clsUTFPHeapMaxP2P2=689;
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
1)----->ds.FPHeapMax[2]
2)----->refaz[1, 2], 
3)----->max[], 
4)----->toString[]
 Covered Branches:[1, 2, 3, 5, 10]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTFPHeapMaxP1P1=2;
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
    String clsUTFPHeapMaxP4R=null;
      clsUTFPHeapMaxP4R=clsUTFPHeapMax.toString();
    String clsUTFPHeapMaxP4RP0P1=new String("CGVacNXGQIchIyIPKhl1howUAqXWMi");
    int clsUTFPHeapMaxP4RP0R=0;
      clsUTFPHeapMaxP4RP0R=clsUTFPHeapMaxP4R.lastIndexOf(clsUTFPHeapMaxP4RP0P1);
    assertEquals("CGVacNXGQIchIyIPKhl1howUAqXWMi",clsUTFPHeapMaxP4RP0P1.toString());
    assertEquals(-1,clsUTFPHeapMaxP4RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[285]
2)----->copia[[max[],ds.MeuItem[192],ds.MeuItem[1],null]], 
3)----->toString[]
 Covered Branches:[1, 23, 24]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTFPHeapMaxP1P1=285;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1P1P0P1=915;
    FPHeapMax clsUTFPHeapMaxP2P1P1P0=null;
      clsUTFPHeapMaxP2P1P1P0=new FPHeapMax(clsUTFPHeapMaxP2P1P1P0P1);
    Item clsUTFPHeapMaxP2P1P1=null;
      clsUTFPHeapMaxP2P1P1=clsUTFPHeapMaxP2P1P1P0.max();
    int clsUTFPHeapMaxP2P1P2P1=192;
    Item clsUTFPHeapMaxP2P1P2=null;
      clsUTFPHeapMaxP2P1P2=new MeuItem(clsUTFPHeapMaxP2P1P2P1);
    int clsUTFPHeapMaxP2P1P3P1=1;
    Item clsUTFPHeapMaxP2P1P3=null;
      clsUTFPHeapMaxP2P1P3=new MeuItem(clsUTFPHeapMaxP2P1P3P1);
    Item clsUTFPHeapMaxP2P1P4=null;
    Item[] clsUTFPHeapMaxP2P1=new Item[]{clsUTFPHeapMaxP2P1P1,clsUTFPHeapMaxP2P1P2,clsUTFPHeapMaxP2P1P3,clsUTFPHeapMaxP2P1P4};
      clsUTFPHeapMax.copia(clsUTFPHeapMaxP2P1);
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
    String clsUTFPHeapMaxP3RP0P1=new String("e}v?//4<rb!);{39iqogvj#");
    boolean clsUTFPHeapMaxP3RP0R=false;
      clsUTFPHeapMaxP3RP0R=clsUTFPHeapMaxP3R.equalsIgnoreCase(clsUTFPHeapMaxP3RP0P1);
    assertEquals("e}v?//4<rb!);{39iqogvj#",clsUTFPHeapMaxP3RP0P1.toString());
    assertEquals(false,clsUTFPHeapMaxP3RP0R);
    double clsUTFPHeapMaxP3RP1P1=58.392544409686764D;
    String clsUTFPHeapMaxP3RP1R=null;
      clsUTFPHeapMaxP3RP1R=String.valueOf(clsUTFPHeapMaxP3RP1P1);
    assertEquals("58.392544409686764",clsUTFPHeapMaxP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[0]
2)----->insere[ds.MeuItem[-550]], 
3)----->toString[], 
4)----->max[]
 Covered Branches:[1, 18, 19, 10]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTFPHeapMaxP1P1=0;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1P1=-550;
    Item clsUTFPHeapMaxP2P1=null;
      clsUTFPHeapMaxP2P1=new MeuItem(clsUTFPHeapMaxP2P1P1);
//Exception
    try {
      clsUTFPHeapMax.insere(clsUTFPHeapMaxP2P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("-550",clsUTFPHeapMaxP2P1.recuperaChave().toString());
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
    String clsUTFPHeapMaxP3RP0R=null;
      clsUTFPHeapMaxP3RP0R=clsUTFPHeapMaxP3R.toLowerCase();
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
1)----->ds.FPHeapMax[544]
2)----->insere[ds.MeuItem[874]], 
3)----->max[], 
4)----->toString[]
 Covered Branches:[16, 1, 18, 20, 10, 14]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTFPHeapMaxP1P1=544;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1P1=874;
    Item clsUTFPHeapMaxP2P1=null;
      clsUTFPHeapMaxP2P1=new MeuItem(clsUTFPHeapMaxP2P1P1);
      clsUTFPHeapMax.insere(clsUTFPHeapMaxP2P1);
    assertEquals("874",clsUTFPHeapMaxP2P1.recuperaChave().toString());
    Item clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.max();
    Object clsUTFPHeapMaxP3RP0R=null;
      clsUTFPHeapMaxP3RP0R=clsUTFPHeapMaxP3R.recuperaChave();
    assertEquals("874",clsUTFPHeapMaxP3RP0R.toString());
    assertEquals(874,clsUTFPHeapMaxP3RP0R.hashCode());
    assertEquals("874",clsUTFPHeapMaxP3R.recuperaChave().toString());
    String clsUTFPHeapMaxP4R=null;
      clsUTFPHeapMaxP4R=clsUTFPHeapMax.toString();
    int clsUTFPHeapMaxP4RP0P1=-848;
    int clsUTFPHeapMaxP4RP0P2=446;
    int clsUTFPHeapMaxP4RP0R=0;
//Exception
    try {
      clsUTFPHeapMaxP4RP0R=clsUTFPHeapMaxP4R.offsetByCodePoints(clsUTFPHeapMaxP4RP0P1,clsUTFPHeapMaxP4RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[1]
2)----->insere[ds.MeuItem[301]], 
3)----->max[]
 Covered Branches:[16, 1, 18, 20, 10, 11, 12, 14]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTFPHeapMaxP1P1=1;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1P1=301;
    Item clsUTFPHeapMaxP2P1=null;
      clsUTFPHeapMaxP2P1=new MeuItem(clsUTFPHeapMaxP2P1P1);
      clsUTFPHeapMax.insere(clsUTFPHeapMaxP2P1);
    assertEquals("301",clsUTFPHeapMaxP2P1.recuperaChave().toString());
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
    int clsUTFPHeapMaxP3RP1R=0;
//Exception
    try {
      clsUTFPHeapMaxP3RP1R=clsUTFPHeapMaxP3R.compara((Item)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("301",clsUTFPHeapMaxP3R.recuperaChave().toString());
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[483]
2)----->constroi[], 
3)----->toString[]
 Covered Branches:[1, 8]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTFPHeapMaxP1P1=483;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
      clsUTFPHeapMax.constroi();
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
  }
}
