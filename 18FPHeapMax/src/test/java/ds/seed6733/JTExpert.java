package ds.seed6733;
import static org.junit.Assert.*;
import org.junit.Test;
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
Evaluations : 88235
search time (ms): 42532
total runtime (ms): 44169
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[0]
2)----->insere[ds.MeuItem[-730]], 
3)----->toString[]
 Covered Branches:[1, 18, 19]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTFPHeapMaxP1P1=0;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1P1=-730;
    Item clsUTFPHeapMaxP2P1=null;
      clsUTFPHeapMaxP2P1=new MeuItem(clsUTFPHeapMaxP2P1P1);
//Exception
    try {
      clsUTFPHeapMax.insere(clsUTFPHeapMaxP2P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("-730",clsUTFPHeapMaxP2P1.recuperaChave().toString());
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[2]
2)----->constroi[], 
3)----->toString[]
 Covered Branches:[1, 8]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTFPHeapMaxP1P1=2;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
      clsUTFPHeapMax.constroi();
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
    Object[] clsUTFPHeapMaxP3RP0P2=new Object[]{};
    String clsUTFPHeapMaxP3RP0R=null;
//Exception
    try {
      clsUTFPHeapMaxP3RP0R=String.format((String)null,(Object[])clsUTFPHeapMaxP3RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTFPHeapMaxP3RP0R);
    boolean clsUTFPHeapMaxP3RP1P1=true;
    String clsUTFPHeapMaxP3RP1R=null;
      clsUTFPHeapMaxP3RP1R=String.valueOf(clsUTFPHeapMaxP3RP1P1);
    assertEquals("true",clsUTFPHeapMaxP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[2]
2)----->refaz[1, 611], 
3)----->max[]
 Covered Branches:[1, 2, 3, 10]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTFPHeapMaxP1P1=2;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1=1;
    int clsUTFPHeapMaxP2P2=611;
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
1)----->ds.FPHeapMax[1]
2)----->insere[ds.MeuItem[813]], 
3)----->toString[], 
4)----->max[]
 Covered Branches:[16, 1, 18, 20, 10, 11, 12, 14]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTFPHeapMaxP1P1=1;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1P1=813;
    Item clsUTFPHeapMaxP2P1=null;
      clsUTFPHeapMaxP2P1=new MeuItem(clsUTFPHeapMaxP2P1P1);
      clsUTFPHeapMax.insere(clsUTFPHeapMaxP2P1);
    assertEquals("813",clsUTFPHeapMaxP2P1.recuperaChave().toString());
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
    char[] clsUTFPHeapMaxP3RP0P1=new char[]{'\u0032'};
    String clsUTFPHeapMaxP3RP0R=null;
      clsUTFPHeapMaxP3RP0R=String.valueOf(clsUTFPHeapMaxP3RP0P1);
    assertTrue(Arrays.equals(new char[]{'\u0032'},clsUTFPHeapMaxP3RP0P1));
    assertEquals("2",clsUTFPHeapMaxP3RP0R);
    int clsUTFPHeapMaxP3RP1P1=-921;
    int clsUTFPHeapMaxP3RP1R=0;
//Exception
    try {
      clsUTFPHeapMaxP3RP1R=clsUTFPHeapMaxP3R.codePointBefore(clsUTFPHeapMaxP3RP1P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
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
    assertEquals("813",clsUTFPHeapMaxP4R.recuperaChave().toString());
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[1]
2)----->insere[ds.MeuItem[-658]], 
3)----->toString[]
 Covered Branches:[16, 1, 18, 20, 14]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTFPHeapMaxP1P1=1;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1P1=-658;
    Item clsUTFPHeapMaxP2P1=null;
      clsUTFPHeapMaxP2P1=new MeuItem(clsUTFPHeapMaxP2P1P1);
      clsUTFPHeapMax.insere(clsUTFPHeapMaxP2P1);
    assertEquals("-658",clsUTFPHeapMaxP2P1.recuperaChave().toString());
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
    String clsUTFPHeapMaxP3RP0P1=new String("'(:` ]}?~_)|$./!&_");
    Object[] clsUTFPHeapMaxP3RP0P2=new Object[]{};
    String clsUTFPHeapMaxP3RP0R=null;
      clsUTFPHeapMaxP3RP0R=String.format(clsUTFPHeapMaxP3RP0P1,(Object[])clsUTFPHeapMaxP3RP0P2);
    assertEquals("'(:` ]}?~_)|$./!&_",clsUTFPHeapMaxP3RP0P1.toString());
    assertEquals("'(:` ]}?~_)|$./!&_",clsUTFPHeapMaxP3RP0R);
    String clsUTFPHeapMaxP3RP1P1=new String("Ceo1BxOyqsguTRgXYfayMVPgIqspEycOlDHr2E");
    boolean clsUTFPHeapMaxP3RP1R=false;
      clsUTFPHeapMaxP3RP1R=clsUTFPHeapMaxP3R.equalsIgnoreCase(clsUTFPHeapMaxP3RP1P1);
    assertEquals("Ceo1BxOyqsguTRgXYfayMVPgIqspEycOlDHr2E",clsUTFPHeapMaxP3RP1P1.toString());
    assertEquals(false,clsUTFPHeapMaxP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[72]
2)----->refaz[1, 2], 
3)----->toString[]
 Covered Branches:[1, 2, 3, 5]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTFPHeapMaxP1P1=72;
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
1)----->ds.FPHeapMax[499]
2)----->aumentaChave[2, ds.FPHeapMax[-227]], 
3)----->toString[]
 Covered Branches:[1, 14, 15]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTFPHeapMaxP1P1=499;
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
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
    String clsUTFPHeapMaxP3RP0R=null;
      clsUTFPHeapMaxP3RP0R=clsUTFPHeapMaxP3R.trim();
    int clsUTFPHeapMaxP3RP1P1=420;
    int clsUTFPHeapMaxP3RP1P2=-798;
    int clsUTFPHeapMaxP3RP1R=0;
//Exception
    try {
      clsUTFPHeapMaxP3RP1R=clsUTFPHeapMaxP3R.offsetByCodePoints(clsUTFPHeapMaxP3RP1P1,clsUTFPHeapMaxP3RP1P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[437]
2)----->copia[[ds.MeuItem[199],ds.MeuItem[340],ds.MeuItem[-860]]], 
3)----->toString[]
 Covered Branches:[1, 23, 24]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTFPHeapMaxP1P1=437;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1P1P1=199;
    Item clsUTFPHeapMaxP2P1P1=null;
      clsUTFPHeapMaxP2P1P1=new MeuItem(clsUTFPHeapMaxP2P1P1P1);
    int clsUTFPHeapMaxP2P1P2P1=340;
    Item clsUTFPHeapMaxP2P1P2=null;
      clsUTFPHeapMaxP2P1P2=new MeuItem(clsUTFPHeapMaxP2P1P2P1);
    int clsUTFPHeapMaxP2P1P3P1=-860;
    Item clsUTFPHeapMaxP2P1P3=null;
      clsUTFPHeapMaxP2P1P3=new MeuItem(clsUTFPHeapMaxP2P1P3P1);
    Item[] clsUTFPHeapMaxP2P1=new Item[]{clsUTFPHeapMaxP2P1P1,clsUTFPHeapMaxP2P1P2,clsUTFPHeapMaxP2P1P3};
      clsUTFPHeapMax.copia(clsUTFPHeapMaxP2P1);
    String clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.toString();
    String clsUTFPHeapMaxP3RP0R=null;
      clsUTFPHeapMaxP3RP0R=clsUTFPHeapMaxP3R.trim();
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[377]
2)----->refaz[1, -99], 
3)----->max[]
 Covered Branches:[1, 2, 10]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTFPHeapMaxP1P1=377;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
    int clsUTFPHeapMaxP2P1=1;
    int clsUTFPHeapMaxP2P2=-99;
      clsUTFPHeapMax.refaz(clsUTFPHeapMaxP2P1,clsUTFPHeapMaxP2P2);
    Item clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.max();
    assertNull(clsUTFPHeapMaxP3R);
  }
  /** 
 * Chromosome :
1)----->ds.FPHeapMax[2]
2)----->imprime[], 
3)----->max[], 
4)----->toString[]
 Covered Branches:[1, 21, 10]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTFPHeapMaxP1P1=2;
    FPHeapMax clsUTFPHeapMax=null;
      clsUTFPHeapMax=new FPHeapMax(clsUTFPHeapMaxP1P1);
      clsUTFPHeapMax.imprime();
    Item clsUTFPHeapMaxP3R=null;
      clsUTFPHeapMaxP3R=clsUTFPHeapMax.max();
    assertNull(clsUTFPHeapMaxP3R);
    String clsUTFPHeapMaxP4R=null;
      clsUTFPHeapMaxP4R=clsUTFPHeapMax.toString();
  }
}
