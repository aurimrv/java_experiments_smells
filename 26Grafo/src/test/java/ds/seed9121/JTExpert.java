package ds.seed9121;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Arrays;
import ds.Grafo;
/** 
 * This class was automatically generated to test the ds.Grafo class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6, 7, 9, 10, 14, 15, 16, 17, 18, 19, 20, 21, 25, 26, 27, 29, 30, 32, 33, 34, 35, 36, 37]
Uncovered branches: [22, 23, 8, 24, 11, 12, 28, 13, 31]
Total number of branches: 37
Total number of covered branches: 28
Coverage : 75,68%
Evaluations : 37768
search time (ms): 42501
total runtime (ms): 44625
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Grafo[727]
2)----->insereAresta[923, 933, 51], 
3)----->toString[], 
4)----->proxAdj[64]
 Covered Branches:[18, 19, 5, 6, 7, 9]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTGrafoP1P1=727;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=923;
    int clsUTGrafoP2P2=933;
    int clsUTGrafoP2P3=51;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    byte[] clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.getBytes();
    boolean clsUTGrafoP3RP1P1=false;
    int clsUTGrafoP3RP1P2=0;
    String clsUTGrafoP3RP1P3=new String("bdtfkjs");
    int clsUTGrafoP3RP1P4=0;
    int clsUTGrafoP3RP1P5=-115;
    boolean clsUTGrafoP3RP1R=false;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.regionMatches(clsUTGrafoP3RP1P1,clsUTGrafoP3RP1P2,clsUTGrafoP3RP1P3,clsUTGrafoP3RP1P4,clsUTGrafoP3RP1P5);
    assertEquals("bdtfkjs",clsUTGrafoP3RP1P3.toString());
    assertEquals(true,clsUTGrafoP3RP1R);
    int clsUTGrafoP4P1=64;
    Grafo.Aresta clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.proxAdj(clsUTGrafoP4P1);
    assertNull(clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[758]
2)----->grafoTransposto[], 
3)----->toString[], 
4)----->numVertices[]
 Covered Branches:[32, 33, 34, 18, 19, 36, 5, 6, 14, 15]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTGrafoP1P1=758;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=456;
    Grafo.Aresta clsUTGrafoP2RP0R=null;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.proxAdj(clsUTGrafoP2RP0P1);
    assertNull(clsUTGrafoP2RP0R);
    assertEquals(758,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    String clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.toString();
    int clsUTGrafoP4R=0;
      clsUTGrafoP4R=clsUTGrafo.numVertices();
    assertEquals(758,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[-907, 584, -146]
2)----->v2[], 
3)----->toString[]
 Covered Branches:[1, 4]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTArestaP1P1=-907;
    int clsUTArestaP1P2=584;
    int clsUTArestaP1P3=-146;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v2();
    assertEquals(584,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    Locale clsUTArestaP3RP0P1=null;
      clsUTArestaP3RP0P1=(Locale)Locale.TAIWAN;
    Short clsUTArestaP3RP0P3P1O0=28321;
    Object clsUTArestaP3RP0P3P1=clsUTArestaP3RP0P3P1O0;
    Object[] clsUTArestaP3RP0P3=new Object[]{clsUTArestaP3RP0P3P1};
    String clsUTArestaP3RP0R=null;
//Exception
    try {
      clsUTArestaP3RP0R=String.format(clsUTArestaP3RP0P1,(String)null,(Object[])clsUTArestaP3RP0P3);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("zh_TW",clsUTArestaP3RP0P1.toString());
    assertEquals("TWN",clsUTArestaP3RP0P1.getISO3Country());
    assertEquals("zho",clsUTArestaP3RP0P1.getISO3Language());
    assertEquals(false,clsUTArestaP3RP0P1.hasExtensions());
    assertNull(clsUTArestaP3RP0R);
    String clsUTArestaP3RP1R=null;
      clsUTArestaP3RP1R=clsUTArestaP3R.intern();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[913, 108, 1]
2)----->peso[], 
3)----->toString[]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTArestaP1P1=913;
    int clsUTArestaP1P2=108;
    int clsUTArestaP1P3=1;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.peso();
    assertEquals(1,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[875]
2)----->retiraAresta[3, 0], 
3)----->proxAdj[853], 
4)----->toString[]
 Covered Branches:[1, 18, 3, 19, 4, 5, 21, 6, 25, 27]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTGrafoP1P1=875;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=3;
    int clsUTGrafoP2P2=0;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.retiraAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    int clsUTGrafoP2RP0R=0;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.v1();
    assertEquals(3,clsUTGrafoP2RP0R);
    int clsUTGrafoP2RP1R=0;
      clsUTGrafoP2RP1R=clsUTGrafoP2R.v2();
    assertEquals(0,clsUTGrafoP2RP1R);
    int clsUTGrafoP3P1=853;
    Grafo.Aresta clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.proxAdj(clsUTGrafoP3P1);
    assertNull(clsUTGrafoP3R);
    String clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.toString();
    String clsUTGrafoP4RP0P1=new String("Jth819HvXBBfARz0iVBHmvcb4PfrOJrE0YX7");
    boolean clsUTGrafoP4RP0R=false;
      clsUTGrafoP4RP0R=clsUTGrafoP4R.equalsIgnoreCase(clsUTGrafoP4RP0P1);
    assertEquals("Jth819HvXBBfARz0iVBHmvcb4PfrOJrE0YX7",clsUTGrafoP4RP0P1.toString());
    assertEquals(false,clsUTGrafoP4RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[946]
2)----->existeAresta[200, 227], 
3)----->toString[]
 Covered Branches:[5, 6, 10]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTGrafoP1P1=946;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=200;
    int clsUTGrafoP2P2=227;
    boolean clsUTGrafoP2R=false;
      clsUTGrafoP2R=clsUTGrafo.existeAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    assertEquals(false,clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[991]
2)----->imprime[], 
3)----->toString[], 
4)----->numVertices[]
 Covered Branches:[32, 5, 6, 29, 30]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTGrafoP1P1=991;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
      clsUTGrafo.imprime();
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    Charset clsUTGrafoP3RP0P1=null;
      clsUTGrafoP3RP0P1=Charset.defaultCharset();
    byte[] clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.getBytes(clsUTGrafoP3RP0P1);
    assertEquals("UTF-8",clsUTGrafoP3RP0P1.toString());
    assertEquals("UTF-8",clsUTGrafoP3RP0P1.displayName());
    assertEquals(true,clsUTGrafoP3RP0P1.canEncode());
    String clsUTGrafoP3RP1R=null;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.toString();
    int clsUTGrafoP4R=0;
      clsUTGrafoP4R=clsUTGrafo.numVertices();
    assertEquals(991,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[1]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 33, 1, 34, 2, 35, 3, 36, 4, 5, 37, 6, 7, 9, 14, 15, 16, 17, 18, 20]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTGrafoP1P1=1;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=820;
    int clsUTGrafoP2RP0P2=-391;
    int clsUTGrafoP2RP0P3=1;
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
    assertEquals(1,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(1,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->v2[], 
2)----->toString[]
 Covered Branches:[21, 26]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTArestaP1P0P1=1;
    Grafo clsUTArestaP1P0=null;
      clsUTArestaP1P0=new Grafo(clsUTArestaP1P0P1);
    int clsUTArestaP1P1=1;
    int clsUTArestaP1P2=-735;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=clsUTArestaP1P0.retiraAresta(clsUTArestaP1P1,clsUTArestaP1P2);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[126, 549, 517]
2)----->v1[], 
3)----->toString[]
 Covered Branches:[1, 3]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTArestaP1P1=126;
    int clsUTArestaP1P2=549;
    int clsUTArestaP1P3=517;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v1();
    assertEquals(126,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    String clsUTArestaP3RP0P1=new String("wnmppypth");
    boolean clsUTArestaP3RP0R=false;
      clsUTArestaP3RP0R=clsUTArestaP3R.equalsIgnoreCase(clsUTArestaP3RP0P1);
    assertEquals("wnmppypth",clsUTArestaP3RP0P1.toString());
    assertEquals(false,clsUTArestaP3RP0R);
    int clsUTArestaP3RP1P1=-88;
    int clsUTArestaP3RP1P2=-898;
    byte[] clsUTArestaP3RP1P3=new byte[]{-97,-126,-99};
    int clsUTArestaP3RP1P4=-732;
//Exception
    try {
      clsUTArestaP3R.getBytes(clsUTArestaP3RP1P1,clsUTArestaP3RP1P2,clsUTArestaP3RP1P3,clsUTArestaP3RP1P4);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertTrue(Arrays.equals(new byte[]{-97,-126,-99},clsUTArestaP3RP1P3));
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[4499]
2)----->primeiroListaAdj[31], 
3)----->toString[]
 Covered Branches:[17, 18, 19, 5, 6]
 */
  @Test public void TestCase10() throws Throwable {
    int clsUTGrafoP1P1=4499;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=31;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.primeiroListaAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
  }
}
