package ds.seed5311;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import java.util.Arrays;
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
Evaluations : 77627
search time (ms): 42501
total runtime (ms): 44247
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Grafo[972]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[33, 17, 34, 18, 19, 36, 5, 6, 14, 15]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTGrafoP1P1=972;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=89;
    Grafo.Aresta clsUTGrafoP2RP0R=null;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.primeiroListaAdj(clsUTGrafoP2RP0P1);
    assertNull(clsUTGrafoP2RP0R);
    int clsUTGrafoP2RP1P1=-598;
    boolean clsUTGrafoP2RP1R=false;
//Exception
    try {
      clsUTGrafoP2RP1R=clsUTGrafoP2R.listaAdjVazia(clsUTGrafoP2RP1P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals(972,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    String clsUTGrafoP3RP0P1=new String(":");
    int clsUTGrafoP3RP0R=0;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.indexOf(clsUTGrafoP3RP0P1);
    assertEquals(":",clsUTGrafoP3RP0P1.toString());
    assertEquals(-1,clsUTGrafoP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[908]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 33, 34, 36, 5, 6, 7, 9, 14, 15, 29, 30, 31]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTGrafoP1P1=908;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=0;
    int clsUTGrafoP2RP0P2=0;
    int clsUTGrafoP2RP0P3=4500;
      clsUTGrafoP2R.insereAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2,clsUTGrafoP2RP0P3);
      clsUTGrafoP2R.imprime();
    assertEquals(908,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(908,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[-1, 544, 265]
2)----->v2[], 
3)----->toString[]
 Covered Branches:[1, 4]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTArestaP1P1=-1;
    int clsUTArestaP1P2=544;
    int clsUTArestaP1P3=265;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v2();
    assertEquals(544,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    boolean clsUTArestaP3RP0R=false;
      clsUTArestaP3RP0R=clsUTArestaP3R.isEmpty();
    assertEquals(false,clsUTArestaP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[-977, -1, 1]
2)----->peso[], 
3)----->toString[]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTArestaP1P1=-977;
    int clsUTArestaP1P2=-1;
    int clsUTArestaP1P3=1;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.peso();
    assertEquals(1,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    String clsUTArestaP3RP0R=null;
//Exception
    try {
      clsUTArestaP3RP0R=String.join((CharSequence)null,(Iterable)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTArestaP3RP0R);
    String clsUTArestaP3RP1R=null;
      clsUTArestaP3RP1R=clsUTArestaP3R.toString();
  }
  /** 
 * Chromosome :
1)----->peso[], 
2)----->toString[]
 Covered Branches:[21, 26]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTArestaP1P0P1=264;
    Grafo clsUTArestaP1P0=null;
      clsUTArestaP1P0=new Grafo(clsUTArestaP1P0P1);
    int clsUTArestaP1P1=21;
    int clsUTArestaP1P2=0;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=clsUTArestaP1P0.retiraAresta(clsUTArestaP1P1,clsUTArestaP1P2);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[512]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[33, 34, 36, 5, 6, 14, 15]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTGrafoP1P1=512;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    assertEquals(512,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    int clsUTGrafoP3RP0P1=1;
    int clsUTGrafoP3RP0P2=1;
    CharSequence clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.subSequence(clsUTGrafoP3RP0P1,clsUTGrafoP3RP0P2);
    assertEquals("",clsUTGrafoP3RP0R.toString());
    assertEquals(0,clsUTGrafoP3RP0R.length());
    float clsUTGrafoP3RP1P1=-11.64711F;
    String clsUTGrafoP3RP1R=null;
      clsUTGrafoP3RP1R=String.valueOf(clsUTGrafoP3RP1P1);
    assertEquals("-11.64711",clsUTGrafoP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[937]
2)----->retiraAresta[27, 0], 
3)----->toString[]
 Covered Branches:[1, 2, 5, 21, 6, 25, 27]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTGrafoP1P1=937;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=27;
    int clsUTGrafoP2P2=0;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.retiraAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    int clsUTGrafoP2RP0R=0;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.peso();
    assertEquals(0,clsUTGrafoP2RP0R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[358]
2)----->insereAresta[398, 370, 715], 
3)----->listaAdjVazia[0]
 Covered Branches:[16, 5, 6, 7, 9, 14]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTGrafoP1P1=358;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=398;
    int clsUTGrafoP2P2=370;
    int clsUTGrafoP2P3=715;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3P1=0;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.listaAdjVazia(clsUTGrafoP3P1);
    assertEquals(false,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[1]
2)----->numVertices[], 
3)----->toString[]
 Covered Branches:[32, 5, 6]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTGrafoP1P1=1;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2R=0;
      clsUTGrafoP2R=clsUTGrafo.numVertices();
    assertEquals(1,clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[1]
2)----->insereAresta[146, -632, -1], 
3)----->toString[], 
4)----->proxAdj[0]
 Covered Branches:[1, 18, 20, 4, 5, 6, 7, 9]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTGrafoP1P1=1;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=146;
    int clsUTGrafoP2P2=-632;
    int clsUTGrafoP2P3=-1;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    int clsUTGrafoP4P1=0;
    Grafo.Aresta clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.proxAdj(clsUTGrafoP4P1);
    int clsUTGrafoP4RP0R=0;
      clsUTGrafoP4RP0R=clsUTGrafoP4R.v2();
    assertEquals(-632,clsUTGrafoP4RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[297]
2)----->insereAresta[37, 3, -421], 
3)----->proxAdj[3], 
4)----->toString[]
 Covered Branches:[18, 19, 5, 6, 7, 9]
 */
  @Test public void TestCase10() throws Throwable {
    int clsUTGrafoP1P1=297;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=37;
    int clsUTGrafoP2P2=3;
    int clsUTGrafoP2P3=-421;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3P1=3;
    Grafo.Aresta clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.proxAdj(clsUTGrafoP3P1);
    assertNull(clsUTGrafoP3R);
    String clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.toString();
    Byte clsUTGrafoP4RP0P1P1O0=42;
    Object clsUTGrafoP4RP0P1P1=clsUTGrafoP4RP0P1P1O0;
    CharSequence clsUTGrafoP4RP0P1=null;
      clsUTGrafoP4RP0P1=String.valueOf(clsUTGrafoP4RP0P1P1);
    boolean clsUTGrafoP4RP0R=false;
      clsUTGrafoP4RP0R=clsUTGrafoP4R.contentEquals(clsUTGrafoP4RP0P1);
    assertEquals("42",clsUTGrafoP4RP0P1.toString());
    assertEquals(2,clsUTGrafoP4RP0P1.length());
    assertEquals(false,clsUTGrafoP4RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[0]
2)----->existeAresta[793, 0], 
3)----->toString[]
 Covered Branches:[5, 10]
 */
  @Test public void TestCase11() throws Throwable {
    int clsUTGrafoP1P1=0;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=793;
    int clsUTGrafoP2P2=0;
    boolean clsUTGrafoP2R=false;
      clsUTGrafoP2R=clsUTGrafo.existeAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    assertEquals(false,clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    String clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.toLowerCase();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[555]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 33, 1, 34, 2, 35, 3, 36, 4, 5, 37, 6, 7, 9, 14, 15, 16, 17, 18, 19, 20]
 */
  @Test public void TestCase12() throws Throwable {
    int clsUTGrafoP1P1=555;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=180;
    int clsUTGrafoP2RP0P2=603;
    int clsUTGrafoP2RP0P3=-369;
      clsUTGrafoP2R.insereAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2,clsUTGrafoP2RP0P3);
    Grafo clsUTGrafoP2RP1R=null;
      clsUTGrafoP2RP1R=clsUTGrafoP2R.grafoTransposto();
    assertEquals(555,clsUTGrafoP2RP1R.numVertices());
    assertEquals(555,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(555,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[1, 447, -606]
2)----->v1[], 
3)----->toString[]
 Covered Branches:[1, 3]
 */
  @Test public void TestCase13() throws Throwable {
    int clsUTArestaP1P1=1;
    int clsUTArestaP1P2=447;
    int clsUTArestaP1P3=-606;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v1();
    assertEquals(1,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    byte[] clsUTArestaP3RP0R=null;
      clsUTArestaP3RP0R=clsUTArestaP3R.getBytes();
    int clsUTArestaP3RP1R=0;
      clsUTArestaP3RP1R=clsUTArestaP3R.hashCode();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[83]
2)----->imprime[], 
3)----->numVertices[], 
4)----->toString[]
 Covered Branches:[32, 5, 6, 29, 30]
 */
  @Test public void TestCase14() throws Throwable {
    int clsUTGrafoP1P1=83;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
      clsUTGrafo.imprime();
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(83,clsUTGrafoP3R);
    String clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.toString();
    String clsUTGrafoP4RP0P1=new String("oaJBVu8sP9SGbjvOxFINhEDH2zYytQn01p4gql76Urke5mdiWMXAw3RTCfcKLZ");
    boolean clsUTGrafoP4RP0R=false;
      clsUTGrafoP4RP0R=clsUTGrafoP4R.equalsIgnoreCase(clsUTGrafoP4RP0P1);
    assertEquals("oaJBVu8sP9SGbjvOxFINhEDH2zYytQn01p4gql76Urke5mdiWMXAw3RTCfcKLZ",clsUTGrafoP4RP0P1.toString());
    assertEquals(false,clsUTGrafoP4RP0R);
    String clsUTGrafoP4RP1P1=new String("4trpfb3g1x6lhems9jdywnauokcv5i70q82z");
    int clsUTGrafoP4RP1P2=1;
    int clsUTGrafoP4RP1R=0;
      clsUTGrafoP4RP1R=clsUTGrafoP4R.lastIndexOf(clsUTGrafoP4RP1P1,clsUTGrafoP4RP1P2);
    assertEquals("4trpfb3g1x6lhems9jdywnauokcv5i70q82z",clsUTGrafoP4RP1P1.toString());
    assertEquals(-1,clsUTGrafoP4RP1R);
  }
}
