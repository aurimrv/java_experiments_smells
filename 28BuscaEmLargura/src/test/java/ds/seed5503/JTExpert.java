package ds.seed5503;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Grafo;
/** 
 * This class was automatically generated to test the ds.Grafo class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20, 21, 23, 24, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35]
Uncovered branches: [22, 7, 25, 13]
Total number of branches: 35
Total number of covered branches: 31
Coverage : 88,57%
Evaluations : 35847
search time (ms): 42501
total runtime (ms): 44624
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Grafo[601]
2)----->proxAdj[159], 
3)----->toString[], 
4)----->existeAresta[397, -235]
 Covered Branches:[21, 5, 23, 9, 10, 12, 14]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTGrafoP1P1=601;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=159;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.proxAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    String clsUTGrafoP3RP0P1=new String("P");
    int clsUTGrafoP3RP0R=0;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.lastIndexOf(clsUTGrafoP3RP0P1);
    assertEquals("P",clsUTGrafoP3RP0P1.toString());
    assertEquals(-1,clsUTGrafoP3RP0R);
    String clsUTGrafoP3RP1P1=new String("9@]{t&js>8g(b:1dv< n_w^/3|~y$?)`}=[");
    boolean clsUTGrafoP3RP1R=false;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.startsWith(clsUTGrafoP3RP1P1);
    assertEquals(false,clsUTGrafoP3RP1R);
    int clsUTGrafoP4P1=397;
    int clsUTGrafoP4P2=-235;
    boolean clsUTGrafoP4R=false;
      clsUTGrafoP4R=clsUTGrafo.existeAresta(clsUTGrafoP4P1,clsUTGrafoP4P2);
    assertEquals(false,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[297]
2)----->primeiroListaAdj[278], 
3)----->listaAdjVazia[0]
 Covered Branches:[16, 18, 20, 9, 10, 15]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTGrafoP1P1=297;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=278;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.primeiroListaAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    int clsUTGrafoP3P1=0;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.listaAdjVazia(clsUTGrafoP3P1);
    assertEquals(true,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[21]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[32, 16, 34, 9, 10, 31, 15]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTGrafoP1P1=21;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    assertEquals(21,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    String clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.toUpperCase();
    String clsUTGrafoP3RP1P1=new String("3rhQ");
    int clsUTGrafoP3RP1R=0;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.compareToIgnoreCase(clsUTGrafoP3RP1P1);
    assertEquals("3rhQ",clsUTGrafoP3RP1P1.toString());
    assertEquals(49,clsUTGrafoP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[907]
2)----->proxAdj[636], 
3)----->insereAresta[1, -618, -664], 
4)----->retiraAresta[1, 549]
 Covered Branches:[21, 5, 6, 23, 24, 8, 9, 10, 26, 11]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTGrafoP1P1=907;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=636;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.proxAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    int clsUTGrafoP3P1=1;
    int clsUTGrafoP3P2=-618;
    int clsUTGrafoP3P3=-664;
      clsUTGrafo.insereAresta(clsUTGrafoP3P1,clsUTGrafoP3P2,clsUTGrafoP3P3);
    int clsUTGrafoP4P1=1;
    int clsUTGrafoP4P2=549;
    Grafo.Aresta clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.retiraAresta(clsUTGrafoP4P1,clsUTGrafoP4P2);
    assertNull(clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[900]
2)----->insereAresta[104, 529, 718], 
3)----->grafoTransposto[], 
4)----->numVertices[]
 Covered Branches:[32, 33, 1, 34, 2, 35, 3, 4, 5, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19, 21, 23, 30, 31]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTGrafoP1P1=900;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=104;
    int clsUTGrafoP2P2=529;
    int clsUTGrafoP2P3=718;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    Grafo clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP3RP0P1=406;
    int clsUTGrafoP3RP0P2=-544;
    boolean clsUTGrafoP3RP0R=false;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.existeAresta(clsUTGrafoP3RP0P1,clsUTGrafoP3RP0P2);
    assertEquals(false,clsUTGrafoP3RP0R);
    int clsUTGrafoP3RP1P1=-448;
    int clsUTGrafoP3RP1P2=1;
    boolean clsUTGrafoP3RP1R=false;
//Exception
    try {
      clsUTGrafoP3RP1R=clsUTGrafoP3R.existeAresta(clsUTGrafoP3RP1P1,clsUTGrafoP3RP1P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals(900,clsUTGrafoP3R.numVertices());
    int clsUTGrafoP4R=0;
      clsUTGrafoP4R=clsUTGrafo.numVertices();
    assertEquals(900,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[-765, -112, -548]
2)----->peso[], 
3)----->toString[]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTArestaP1P1=-765;
    int clsUTArestaP1P2=-112;
    int clsUTArestaP1P3=-548;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.peso();
    assertEquals(-548,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[-214, 492, 801]
2)----->v2[], 
3)----->toString[]
 Covered Branches:[1, 4]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTArestaP1P1=-214;
    int clsUTArestaP1P2=492;
    int clsUTArestaP1P3=801;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v2();
    assertEquals(492,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    String clsUTArestaP3RP0P1=new String("~5b$1iF^:K7U21<.6R:9NT[E7q9:vlAm]U%");
    boolean clsUTArestaP3RP0R=false;
      clsUTArestaP3RP0R=clsUTArestaP3R.startsWith(clsUTArestaP3RP0P1);
    assertEquals("~5b$1iF^:K7U21<.6R:9NT[E7q9:vlAm]U%",clsUTArestaP3RP0P1.toString());
    assertEquals(false,clsUTArestaP3RP0R);
    boolean clsUTArestaP3RP1R=false;
      clsUTArestaP3RP1R=clsUTArestaP3R.isEmpty();
    assertEquals(false,clsUTArestaP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[296]
2)----->grafoTransposto[], 
3)----->numVertices[], 
4)----->grafoTransposto[]
 Covered Branches:[32, 16, 34, 21, 5, 24, 9, 10, 30, 31, 15]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTGrafoP1P1=296;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=548;
    Grafo.Aresta clsUTGrafoP2RP0R=null;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.proxAdj(clsUTGrafoP2RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP0R);
    int clsUTGrafoP2RP1P1=250;
    int clsUTGrafoP2RP1P2=-855;
    Grafo.Aresta clsUTGrafoP2RP1R=null;
//Exception
    try {
      clsUTGrafoP2RP1R=clsUTGrafoP2R.retiraAresta(clsUTGrafoP2RP1P1,clsUTGrafoP2RP1P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP1R);
    assertEquals(296,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(296,clsUTGrafoP3R);
    Grafo clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.grafoTransposto();
    Grafo clsUTGrafoP4RP0R=null;
      clsUTGrafoP4RP0R=clsUTGrafoP4R.grafoTransposto();
    assertEquals(296,clsUTGrafoP4RP0R.numVertices());
    assertEquals(296,clsUTGrafoP4R.numVertices());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[505]
2)----->insereAresta[174, -627, -750], 
3)----->numVertices[], 
4)----->imprime[]
 Covered Branches:[5, 9, 10, 11, 27, 28, 29, 30]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTGrafoP1P1=505;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=174;
    int clsUTGrafoP2P2=-627;
    int clsUTGrafoP2P3=-750;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(505,clsUTGrafoP3R);
      clsUTGrafo.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[687]
2)----->imprime[], 
3)----->toString[], 
4)----->existeAresta[127, 831]
 Covered Branches:[5, 9, 10, 27, 28, 12, 14]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTGrafoP1P1=687;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
      clsUTGrafo.imprime();
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    char clsUTGrafoP3RP0P1='\u0036';
    String clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=String.valueOf(clsUTGrafoP3RP0P1);
    assertEquals("6",clsUTGrafoP3RP0R);
    String clsUTGrafoP3RP1P1=new String("");
    String clsUTGrafoP3RP1R=null;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.concat(clsUTGrafoP3RP1P1);
    assertEquals("",clsUTGrafoP3RP1P1.toString());
    int clsUTGrafoP4P1=127;
    int clsUTGrafoP4P2=831;
    boolean clsUTGrafoP4R=false;
      clsUTGrafoP4R=clsUTGrafo.existeAresta(clsUTGrafoP4P1,clsUTGrafoP4P2);
    assertEquals(false,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[193]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 16, 34, 18, 21, 9, 10, 30, 31, 15]
 */
  @Test public void TestCase10() throws Throwable {
    int clsUTGrafoP1P1=193;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=-523;
    Grafo.Aresta clsUTGrafoP2RP0R=null;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.proxAdj(clsUTGrafoP2RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP0R);
    int clsUTGrafoP2RP1P1=403;
    Grafo.Aresta clsUTGrafoP2RP1R=null;
//Exception
    try {
      clsUTGrafoP2RP1R=clsUTGrafoP2R.primeiroListaAdj(clsUTGrafoP2RP1P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP1R);
    assertEquals(193,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(193,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[879]
2)----->insereAresta[467, 281, -951]
 Covered Branches:[5, 9, 10, 11]
 */
  @Test public void TestCase11() throws Throwable {
    int clsUTGrafoP1P1=879;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=467;
    int clsUTGrafoP2P2=281;
    int clsUTGrafoP2P3=-951;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[354, -202, -651]
2)----->v1[], 
3)----->toString[]
 Covered Branches:[1, 3]
 */
  @Test public void TestCase12() throws Throwable {
    int clsUTArestaP1P1=354;
    int clsUTArestaP1P2=-202;
    int clsUTArestaP1P3=-651;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v1();
    assertEquals(354,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
  }
}
