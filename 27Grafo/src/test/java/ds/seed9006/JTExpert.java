package ds.seed9006;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Grafo;
import java.util.Arrays;
/** 
 * This class was automatically generated to test the ds.Grafo class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20, 21, 23, 24, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35]
Uncovered branches: [22, 7, 25, 13]
Total number of branches: 35
Total number of covered branches: 31
Coverage : 88,57%
Evaluations : 35041
search time (ms): 42503
total runtime (ms): 44605
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[-726, 0, 124]
2)----->peso[], 
3)----->toString[]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTArestaP1P1=-726;
    int clsUTArestaP1P2=0;
    int clsUTArestaP1P3=124;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.peso();
    assertEquals(124,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    char[] clsUTArestaP3RP0R=null;
      clsUTArestaP3RP0R=clsUTArestaP3R.toCharArray();
    String clsUTArestaP3RP1R=null;
      clsUTArestaP3RP1R=clsUTArestaP3R.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[756]
2)----->imprime[], 
3)----->toString[]
 Covered Branches:[9, 10, 27, 28]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTGrafoP1P1=756;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
      clsUTGrafo.imprime();
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[662]
2)----->insereAresta[1, -889, 184], 
3)----->numVertices[], 
4)----->retiraAresta[1, -621]
 Covered Branches:[5, 6, 24, 8, 9, 10, 26, 11, 30]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTGrafoP1P1=662;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=1;
    int clsUTGrafoP2P2=-889;
    int clsUTGrafoP2P3=184;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(662,clsUTGrafoP3R);
    int clsUTGrafoP4P1=1;
    int clsUTGrafoP4P2=-621;
    Grafo.Aresta clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.retiraAresta(clsUTGrafoP4P1,clsUTGrafoP4P2);
    assertNull(clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[651]
2)----->insereAresta[517, 0, -1], 
3)----->listaAdjVazia[62]
 Covered Branches:[16, 5, 9, 10, 11, 15]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTGrafoP1P1=651;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=517;
    int clsUTGrafoP2P2=0;
    int clsUTGrafoP2P3=-1;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3P1=62;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.listaAdjVazia(clsUTGrafoP3P1);
    assertEquals(true,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[475]
2)----->proxAdj[370], 
3)----->numVertices[], 
4)----->imprime[]
 Covered Branches:[21, 23, 9, 10, 27, 28, 30]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTGrafoP1P1=475;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=370;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.proxAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(475,clsUTGrafoP3R);
      clsUTGrafo.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[157]
2)----->existeAresta[0, 1], 
3)----->toString[]
 Covered Branches:[5, 9, 10, 12, 14]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTGrafoP1P1=157;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=0;
    int clsUTGrafoP2P2=1;
    boolean clsUTGrafoP2R=false;
      clsUTGrafoP2R=clsUTGrafo.existeAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    assertEquals(false,clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    char[] clsUTGrafoP3RP0P1=new char[]{'\u0037'};
    String clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=String.copyValueOf(clsUTGrafoP3RP0P1);
    assertTrue(Arrays.equals(new char[]{'\u0037'},clsUTGrafoP3RP0P1));
    assertEquals("7",clsUTGrafoP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[-600, 1, -182]
2)----->v1[], 
3)----->toString[]
 Covered Branches:[1, 3]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTArestaP1P1=-600;
    int clsUTArestaP1P2=1;
    int clsUTArestaP1P3=-182;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v1();
    assertEquals(-600,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    char[] clsUTArestaP3RP0R=null;
      clsUTArestaP3RP0R=clsUTArestaP3R.toCharArray();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[0]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[21, 9, 30, 31]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTGrafoP1P1=0;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=909;
    Grafo.Aresta clsUTGrafoP2RP0R=null;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.proxAdj(clsUTGrafoP2RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP0R);
    assertEquals(0,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(0,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[861]
2)----->insereAresta[573, -163, -512], 
3)----->imprime[]
 Covered Branches:[5, 9, 10, 11, 27, 28, 29]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTGrafoP1P1=861;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=573;
    int clsUTGrafoP2P2=-163;
    int clsUTGrafoP2P3=-512;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
      clsUTGrafo.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[450]
2)----->primeiroListaAdj[277], 
3)----->listaAdjVazia[141], 
4)----->toString[]
 Covered Branches:[16, 18, 20, 9, 10, 15]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTGrafoP1P1=450;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=277;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.primeiroListaAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    int clsUTGrafoP3P1=141;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.listaAdjVazia(clsUTGrafoP3P1);
    assertEquals(true,clsUTGrafoP3R);
    String clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.toString();
    String clsUTGrafoP4RP0P1=new String("8652713409");
    boolean clsUTGrafoP4RP0R=false;
      clsUTGrafoP4RP0R=clsUTGrafoP4R.endsWith(clsUTGrafoP4RP0P1);
    assertEquals("8652713409",clsUTGrafoP4RP0P1.toString());
    assertEquals(false,clsUTGrafoP4RP0R);
    byte[] clsUTGrafoP4RP1R=null;
      clsUTGrafoP4RP1R=clsUTGrafoP4R.getBytes();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[-1, 0, -615]
2)----->v2[], 
3)----->toString[]
 Covered Branches:[1, 4]
 */
  @Test public void TestCase10() throws Throwable {
    int clsUTArestaP1P1=-1;
    int clsUTArestaP1P2=0;
    int clsUTArestaP1P3=-615;
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
1)----->ds.Grafo[620]
2)----->insereAresta[179, 564, -160], 
3)----->grafoTransposto[]
 Covered Branches:[32, 33, 1, 34, 2, 35, 3, 4, 5, 9, 10, 11, 15, 16, 17, 18, 19, 21, 23, 31]
 */
  @Test public void TestCase11() throws Throwable {
    int clsUTGrafoP1P1=620;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=179;
    int clsUTGrafoP2P2=564;
    int clsUTGrafoP2P3=-160;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    Grafo clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.grafoTransposto();
    Grafo clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.grafoTransposto();
    assertEquals(620,clsUTGrafoP3RP0R.numVertices());
    assertEquals(620,clsUTGrafoP3R.numVertices());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[738]
2)----->grafoTransposto[], 
3)----->toString[], 
4)----->numVertices[]
 Covered Branches:[32, 16, 34, 5, 24, 9, 10, 30, 31, 15]
 */
  @Test public void TestCase12() throws Throwable {
    int clsUTGrafoP1P1=738;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=156;
    int clsUTGrafoP2RP0P2=-580;
    Grafo.Aresta clsUTGrafoP2RP0R=null;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.retiraAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP0R);
    int clsUTGrafoP2RP1R=0;
      clsUTGrafoP2RP1R=clsUTGrafoP2R.numVertices();
    assertEquals(738,clsUTGrafoP2RP1R);
    assertEquals(738,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    char[] clsUTGrafoP3RP0P1P1=new char[]{};
    CharSequence clsUTGrafoP3RP0P1=null;
      clsUTGrafoP3RP0P1=String.valueOf(clsUTGrafoP3RP0P1P1);
    String clsUTGrafoP3RP0R=null;
//Exception
    try {
      clsUTGrafoP3RP0R=String.join(clsUTGrafoP3RP0P1,(Iterable)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("",clsUTGrafoP3RP0P1.toString());
    assertEquals(0,clsUTGrafoP3RP0P1.length());
    assertNull(clsUTGrafoP3RP0R);
    String clsUTGrafoP3RP1P1=new String("5d6tl89su");
    int clsUTGrafoP3RP1P2=942;
    boolean clsUTGrafoP3RP1R=false;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.startsWith(clsUTGrafoP3RP1P1,clsUTGrafoP3RP1P2);
    assertEquals("5d6tl89su",clsUTGrafoP3RP1P1.toString());
    assertEquals(false,clsUTGrafoP3RP1R);
    int clsUTGrafoP4R=0;
      clsUTGrafoP4R=clsUTGrafo.numVertices();
    assertEquals(738,clsUTGrafoP4R);
  }
}
