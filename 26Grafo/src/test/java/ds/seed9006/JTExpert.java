package ds.seed9006;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import java.util.Arrays;
import java.util.Locale;
import ds.Grafo;
/** 
 * This class was automatically generated to test the ds.Grafo class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6, 7, 9, 10, 14, 15, 16, 17, 18, 19, 20, 21, 25, 26, 27, 29, 30, 31, 32, 33, 34, 35, 36, 37]
Uncovered branches: [22, 23, 8, 24, 11, 12, 28, 13]
Total number of branches: 37
Total number of covered branches: 29
Coverage : 78,38%
Evaluations : 53608
search time (ms): 42503
total runtime (ms): 44627
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Grafo[1]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 33, 34, 36, 5, 6, 14, 15]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTGrafoP1P1=1;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    Grafo clsUTGrafoP2RP0R=null;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.grafoTransposto();
    assertEquals(1,clsUTGrafoP2RP0R.numVertices());
    int clsUTGrafoP2RP1R=0;
      clsUTGrafoP2RP1R=clsUTGrafoP2R.numVertices();
    assertEquals(1,clsUTGrafoP2RP1R);
    assertEquals(1,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(1,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[278]
2)----->retiraAresta[492, 1], 
3)----->toString[]
 Covered Branches:[5, 21, 6, 26]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTGrafoP1P1=278;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=492;
    int clsUTGrafoP2P2=1;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.retiraAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    assertNull(clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    boolean clsUTGrafoP3RP0R=false;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.isEmpty();
    assertEquals(false,clsUTGrafoP3RP0R);
    boolean clsUTGrafoP3RP1R=false;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.isEmpty();
    assertEquals(false,clsUTGrafoP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[498]
2)----->grafoTransposto[], 
3)----->toString[], 
4)----->numVertices[]
 Covered Branches:[32, 33, 34, 36, 5, 6, 7, 9, 14, 15, 29, 30, 31]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTGrafoP1P1=498;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=0;
    int clsUTGrafoP2RP0P2=-1;
    int clsUTGrafoP2RP0P3=111;
      clsUTGrafoP2R.insereAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2,clsUTGrafoP2RP0P3);
      clsUTGrafoP2R.imprime();
    assertEquals(498,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    boolean clsUTGrafoP3RP0R=false;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.isEmpty();
    assertEquals(false,clsUTGrafoP3RP0R);
    int clsUTGrafoP4R=0;
      clsUTGrafoP4R=clsUTGrafo.numVertices();
    assertEquals(498,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[246]
2)----->grafoTransposto[], 
3)----->toString[], 
4)----->numVertices[]
 Covered Branches:[32, 33, 1, 34, 36, 5, 21, 6, 25, 27, 14, 15]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTGrafoP1P1=246;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    Grafo clsUTGrafoP2RP0R=null;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.grafoTransposto();
    assertEquals(246,clsUTGrafoP2RP0R.numVertices());
    int clsUTGrafoP2RP1P1=355;
    int clsUTGrafoP2RP1P2=0;
    Grafo.Aresta clsUTGrafoP2RP1R=null;
      clsUTGrafoP2RP1R=clsUTGrafoP2R.retiraAresta(clsUTGrafoP2RP1P1,clsUTGrafoP2RP1P2);
    assertEquals(246,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    String clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.trim();
    String clsUTGrafoP3RP1P2=new String("lbuc05e6mjisp27r41dqnkg8wavfy9ot3xhz");
    String clsUTGrafoP3RP1R=null;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.replaceAll(clsUTGrafoP3R,clsUTGrafoP3RP1P2);
    assertEquals("lbuc05e6mjisp27r41dqnkg8wavfy9ot3xhz",clsUTGrafoP3RP1P2.toString());
    assertEquals("lbuc05e6mjisp27r41dqnkg8wavfy9ot3xhz",clsUTGrafoP3RP1R);
    int clsUTGrafoP4R=0;
      clsUTGrafoP4R=clsUTGrafo.numVertices();
    assertEquals(246,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[922]
2)----->listaAdjVazia[1], 
3)----->toString[]
 Covered Branches:[5, 6, 14, 15]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTGrafoP1P1=922;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=1;
    boolean clsUTGrafoP2R=false;
      clsUTGrafoP2R=clsUTGrafo.listaAdjVazia(clsUTGrafoP2P1);
    assertEquals(true,clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    String clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.intern();
    String clsUTGrafoP3RP1R=null;
//Exception
    try {
      clsUTGrafoP3RP1R=clsUTGrafoP3R.concat((String)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[20]
2)----->insereAresta[0, 8, 649], 
3)----->toString[], 
4)----->proxAdj[0]
 Covered Branches:[1, 18, 2, 3, 20, 5, 6, 7, 9]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTGrafoP1P1=20;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=0;
    int clsUTGrafoP2P2=8;
    int clsUTGrafoP2P3=649;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    int clsUTGrafoP4P1=0;
    Grafo.Aresta clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.proxAdj(clsUTGrafoP4P1);
    int clsUTGrafoP4RP0R=0;
      clsUTGrafoP4RP0R=clsUTGrafoP4R.peso();
    assertEquals(649,clsUTGrafoP4RP0R);
    int clsUTGrafoP4RP1R=0;
      clsUTGrafoP4RP1R=clsUTGrafoP4R.v1();
    assertEquals(0,clsUTGrafoP4RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[978]
2)----->imprime[], 
3)----->numVertices[]
 Covered Branches:[32, 5, 6, 29, 30]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTGrafoP1P1=978;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
      clsUTGrafo.imprime();
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(978,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[626]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[33, 1, 34, 2, 35, 3, 36, 4, 5, 37, 6, 7, 9, 14, 15, 16, 17, 18, 20]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTGrafoP1P1=626;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=328;
    int clsUTGrafoP2RP0P2=-585;
    int clsUTGrafoP2RP0P3=-273;
      clsUTGrafoP2R.insereAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2,clsUTGrafoP2RP0P3);
    Grafo clsUTGrafoP2RP1R=null;
//Exception
    try {
      clsUTGrafoP2RP1R=clsUTGrafoP2R.grafoTransposto();
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP1R);
    assertEquals(626,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    StringBuffer clsUTGrafoP3RP0P1=null;
      clsUTGrafoP3RP0P1=new StringBuffer();
    boolean clsUTGrafoP3RP0R=false;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.contentEquals(clsUTGrafoP3RP0P1);
    assertEquals("",clsUTGrafoP3RP0P1.toString());
    assertEquals(0,clsUTGrafoP3RP0P1.length());
    assertEquals(false,clsUTGrafoP3RP0R);
    char[] clsUTGrafoP3RP1R=null;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.toCharArray();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[920]
2)----->existeAresta[4501, -245], 
3)----->toString[]
 Covered Branches:[5, 6, 10]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTGrafoP1P1=920;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=4501;
    int clsUTGrafoP2P2=-245;
    boolean clsUTGrafoP2R=false;
      clsUTGrafoP2R=clsUTGrafo.existeAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    assertEquals(false,clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    Locale clsUTGrafoP3RP0P1=null;
      clsUTGrafoP3RP0P1=(Locale)Locale.TRADITIONAL_CHINESE;
    String clsUTGrafoP3RP0P2=new String("I?+bGUT%M^&_5]YB{;waQ (4>nPs~)r2A`C=tEKc$[D3N7Zh@");
    Object[] clsUTGrafoP3RP0P3=new Object[]{};
    String clsUTGrafoP3RP0R=null;
//Exception
    try {
      clsUTGrafoP3RP0R=String.format(clsUTGrafoP3RP0P1,clsUTGrafoP3RP0P2,(Object[])clsUTGrafoP3RP0P3);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("zh_TW",clsUTGrafoP3RP0P1.toString());
    assertEquals("zho",clsUTGrafoP3RP0P1.getISO3Language());
    assertEquals("",clsUTGrafoP3RP0P1.getScript());
    assertEquals(115851247,clsUTGrafoP3RP0P1.hashCode());
    assertNull(clsUTGrafoP3RP0R);
    String clsUTGrafoP3RP1R=null;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.toUpperCase();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[-1, 611, -872]
2)----->peso[], 
3)----->toString[]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTArestaP1P1=-1;
    int clsUTArestaP1P2=611;
    int clsUTArestaP1P3=-872;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.peso();
    assertEquals(-872,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[522]
2)----->proxAdj[434], 
3)----->toString[], 
4)----->listaAdjVazia[0]
 Covered Branches:[18, 19, 5, 6, 14, 15]
 */
  @Test public void TestCase10() throws Throwable {
    int clsUTGrafoP1P1=522;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=434;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.proxAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    int clsUTGrafoP3RP0R=0;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.hashCode();
    int clsUTGrafoP4P1=0;
    boolean clsUTGrafoP4R=false;
      clsUTGrafoP4R=clsUTGrafo.listaAdjVazia(clsUTGrafoP4P1);
    assertEquals(true,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[587, 0, 884]
2)----->v2[], 
3)----->toString[]
 Covered Branches:[1, 4]
 */
  @Test public void TestCase11() throws Throwable {
    int clsUTArestaP1P1=587;
    int clsUTArestaP1P2=0;
    int clsUTArestaP1P3=884;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v2();
    assertEquals(0,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[697]
2)----->insereAresta[0, -102, -493], 
3)----->toString[]
 Covered Branches:[5, 6, 7, 9]
 */
  @Test public void TestCase12() throws Throwable {
    int clsUTGrafoP1P1=697;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=0;
    int clsUTGrafoP2P2=-102;
    int clsUTGrafoP2P3=-493;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    boolean clsUTGrafoP3RP0R=false;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.matches(clsUTGrafoP3R);
    assertEquals(true,clsUTGrafoP3RP0R);
    Locale clsUTGrafoP3RP1P1=null;
      clsUTGrafoP3RP1P1=(Locale)Locale.CANADA_FRENCH;
    String clsUTGrafoP3RP1R=null;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.toLowerCase(clsUTGrafoP3RP1P1);
    assertEquals("CAN",clsUTGrafoP3RP1P1.getISO3Country());
    assertEquals("fr",clsUTGrafoP3RP1P1.getLanguage());
    assertEquals("",clsUTGrafoP3RP1P1.getVariant());
    assertEquals(97661718,clsUTGrafoP3RP1P1.hashCode());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[-127, 34, -592]
2)----->v1[], 
3)----->toString[]
 Covered Branches:[1, 3]
 */
  @Test public void TestCase13() throws Throwable {
    int clsUTArestaP1P1=-127;
    int clsUTArestaP1P2=34;
    int clsUTArestaP1P3=-592;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v1();
    assertEquals(-127,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    String clsUTArestaP3RP0R=null;
      clsUTArestaP3RP0R=clsUTArestaP3R.trim();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[175]
2)----->primeiroListaAdj[1], 
3)----->toString[]
 Covered Branches:[17, 18, 19, 5, 6]
 */
  @Test public void TestCase14() throws Throwable {
    int clsUTGrafoP1P1=175;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=1;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.primeiroListaAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    String clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.toUpperCase();
    int clsUTGrafoP3RP1P1=-238;
    int clsUTGrafoP3RP1P2=-66;
    byte[] clsUTGrafoP3RP1P3=new byte[]{84,34};
    int clsUTGrafoP3RP1P4=1;
//Exception
    try {
      clsUTGrafoP3R.getBytes(clsUTGrafoP3RP1P1,clsUTGrafoP3RP1P2,clsUTGrafoP3RP1P3,clsUTGrafoP3RP1P4);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertTrue(Arrays.equals(new byte[]{84,34},clsUTGrafoP3RP1P3));
  }
}
