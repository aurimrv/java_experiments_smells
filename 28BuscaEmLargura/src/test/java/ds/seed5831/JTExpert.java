package ds.seed5831;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Grafo;
/** 
 * This class was automatically generated to test the ds.Grafo class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35]
Uncovered branches: [7, 25, 13]
Total number of branches: 35
Total number of covered branches: 32
Coverage : 91,43%
Evaluations : 30618
search time (ms): 42501
total runtime (ms): 44630
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Grafo[954]
2)----->primeiroListaAdj[758], 
3)----->listaAdjVazia[66]
 Covered Branches:[16, 18, 20, 9, 10, 15]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTGrafoP1P1=954;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=758;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.primeiroListaAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    int clsUTGrafoP3P1=66;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.listaAdjVazia(clsUTGrafoP3P1);
    assertEquals(true,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[994]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[32, 16, 34, 9, 10, 27, 28, 31, 15]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTGrafoP1P1=994;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
      clsUTGrafoP2R.imprime();
      clsUTGrafoP2R.imprime();
    assertEquals(994,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[437]
2)----->imprime[], 
3)----->insereAresta[0, -635, 543], 
4)----->retiraAresta[0, -742]
 Covered Branches:[5, 6, 24, 8, 9, 10, 26, 27, 11, 28]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTGrafoP1P1=437;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
      clsUTGrafo.imprime();
    int clsUTGrafoP3P1=0;
    int clsUTGrafoP3P2=-635;
    int clsUTGrafoP3P3=543;
      clsUTGrafo.insereAresta(clsUTGrafoP3P1,clsUTGrafoP3P2,clsUTGrafoP3P3);
    int clsUTGrafoP4P1=0;
    int clsUTGrafoP4P2=-742;
    Grafo.Aresta clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.retiraAresta(clsUTGrafoP4P1,clsUTGrafoP4P2);
    assertNull(clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[832]
2)----->existeAresta[0, -14], 
3)----->listaAdjVazia[212], 
4)----->toString[]
 Covered Branches:[16, 5, 9, 10, 12, 14, 15]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTGrafoP1P1=832;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=0;
    int clsUTGrafoP2P2=-14;
    boolean clsUTGrafoP2R=false;
      clsUTGrafoP2R=clsUTGrafo.existeAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    assertEquals(false,clsUTGrafoP2R);
    int clsUTGrafoP3P1=212;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.listaAdjVazia(clsUTGrafoP3P1);
    assertEquals(true,clsUTGrafoP3R);
    String clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[860]
2)----->insereAresta[0, 749, 1], 
3)----->numVertices[], 
4)----->grafoTransposto[]
 Covered Branches:[32, 33, 1, 2, 34, 35, 3, 4, 5, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19, 21, 23, 30, 31]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTGrafoP1P1=860;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=0;
    int clsUTGrafoP2P2=749;
    int clsUTGrafoP2P3=1;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(860,clsUTGrafoP3R);
    Grafo clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP4RP0P1=604;
    int clsUTGrafoP4RP0P2=-1;
    boolean clsUTGrafoP4RP0R=false;
      clsUTGrafoP4RP0R=clsUTGrafoP4R.existeAresta(clsUTGrafoP4RP0P1,clsUTGrafoP4RP0P2);
    assertEquals(false,clsUTGrafoP4RP0R);
    int clsUTGrafoP4RP1P1=-689;
    Grafo.Aresta clsUTGrafoP4RP1R=null;
//Exception
    try {
      clsUTGrafoP4RP1R=clsUTGrafoP4R.primeiroListaAdj(clsUTGrafoP4RP1P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP4RP1R);
    assertEquals(860,clsUTGrafoP4R.numVertices());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[296]
2)----->insereAresta[0, -330, 1], 
3)----->numVertices[], 
4)----->listaAdjVazia[-642], 
5)----->existeAresta[926, -941], 
6)----->proxAdj[0], 
7)----->grafoTransposto[], 
8)----->primeiroListaAdj[172]
 Covered Branches:[32, 1, 33, 2, 3, 35, 4, 5, 9, 10, 11, 12, 15, 17, 18, 19, 20, 21, 22, 30, 31]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTGrafoP1P1=296;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=0;
    int clsUTGrafoP2P2=-330;
    int clsUTGrafoP2P3=1;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(296,clsUTGrafoP3R);
    int clsUTGrafoP4P1=-642;
    boolean clsUTGrafoP4R=false;
//Exception
    try {
      clsUTGrafoP4R=clsUTGrafo.listaAdjVazia(clsUTGrafoP4P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    int clsUTGrafoP5P1=926;
    int clsUTGrafoP5P2=-941;
    boolean clsUTGrafoP5R=false;
//Exception
    try {
      clsUTGrafoP5R=clsUTGrafo.existeAresta(clsUTGrafoP5P1,clsUTGrafoP5P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    int clsUTGrafoP6P1=0;
    Grafo.Aresta clsUTGrafoP6R=null;
      clsUTGrafoP6R=clsUTGrafo.proxAdj(clsUTGrafoP6P1);
    int clsUTGrafoP6RP0R=0;
      clsUTGrafoP6RP0R=clsUTGrafoP6R.peso();
    assertEquals(1,clsUTGrafoP6RP0R);
    int clsUTGrafoP6RP1R=0;
      clsUTGrafoP6RP1R=clsUTGrafoP6R.v1();
    assertEquals(0,clsUTGrafoP6RP1R);
    Grafo clsUTGrafoP7R=null;
//Exception
    try {
      clsUTGrafoP7R=clsUTGrafo.grafoTransposto();
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP7R);
    int clsUTGrafoP8P1=172;
    Grafo.Aresta clsUTGrafoP8R=null;
      clsUTGrafoP8R=clsUTGrafo.primeiroListaAdj(clsUTGrafoP8P1);
    assertNull(clsUTGrafoP8R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[859]
2)----->insereAresta[165, 874, 446], 
3)----->listaAdjVazia[0]
 Covered Branches:[16, 5, 9, 10, 11, 15]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTGrafoP1P1=859;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=165;
    int clsUTGrafoP2P2=874;
    int clsUTGrafoP2P3=446;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3P1=0;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.listaAdjVazia(clsUTGrafoP3P1);
    assertEquals(true,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[-398, -614, -501]
2)----->peso[], 
3)----->toString[]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTArestaP1P1=-398;
    int clsUTArestaP1P2=-614;
    int clsUTArestaP1P3=-501;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.peso();
    assertEquals(-501,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    int clsUTArestaP3RP0R=0;
      clsUTArestaP3RP0R=clsUTArestaP3R.hashCode();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[811]
2)----->insereAresta[794, 29, -1], 
3)----->imprime[]
 Covered Branches:[5, 9, 10, 11, 27, 28, 29]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTGrafoP1P1=811;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=794;
    int clsUTGrafoP2P2=29;
    int clsUTGrafoP2P3=-1;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
      clsUTGrafo.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[354]
2)----->proxAdj[1], 
3)----->toString[]
 Covered Branches:[21, 23, 9, 10]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTGrafoP1P1=354;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=1;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.proxAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    String clsUTGrafoP3RP0P1=new String("po4|l");
    byte[] clsUTGrafoP3RP0R=null;
//Exception
    try {
      clsUTGrafoP3RP0R=clsUTGrafoP3R.getBytes(clsUTGrafoP3RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("po4|l",clsUTGrafoP3RP0P1.toString());
    assertNull(clsUTGrafoP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[690]
2)----->numVertices[], 
3)----->grafoTransposto[], 
4)----->primeiroListaAdj[427]
 Covered Branches:[32, 16, 34, 18, 20, 5, 24, 9, 10, 30, 31, 15]
 */
  @Test public void TestCase10() throws Throwable {
    int clsUTGrafoP1P1=690;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2R=0;
      clsUTGrafoP2R=clsUTGrafo.numVertices();
    assertEquals(690,clsUTGrafoP2R);
    Grafo clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP3RP0P1=-820;
    int clsUTGrafoP3RP0P2=-198;
    Grafo.Aresta clsUTGrafoP3RP0R=null;
//Exception
    try {
      clsUTGrafoP3RP0R=clsUTGrafoP3R.retiraAresta(clsUTGrafoP3RP0P1,clsUTGrafoP3RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP3RP0R);
    assertEquals(690,clsUTGrafoP3R.numVertices());
    int clsUTGrafoP4P1=427;
    Grafo.Aresta clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.primeiroListaAdj(clsUTGrafoP4P1);
    assertNull(clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[916, 933, -878]
2)----->v1[], 
3)----->toString[]
 Covered Branches:[1, 3]
 */
  @Test public void TestCase11() throws Throwable {
    int clsUTArestaP1P1=916;
    int clsUTArestaP1P2=933;
    int clsUTArestaP1P3=-878;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v1();
    assertEquals(916,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[37]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[32, 16, 34, 9, 10, 30, 31, 15]
 */
  @Test public void TestCase12() throws Throwable {
    int clsUTGrafoP1P1=37;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0R=0;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.numVertices();
    assertEquals(37,clsUTGrafoP2RP0R);
    assertEquals(37,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    char[] clsUTGrafoP3RP0P1P1=new char[]{'\u0029','\u0074','\uf1a2','\u002b'};
    CharSequence clsUTGrafoP3RP0P1=null;
      clsUTGrafoP3RP0P1=new String(clsUTGrafoP3RP0P1P1);
    byte[] clsUTGrafoP3RP0P2P1=new byte[]{114,5};
    int clsUTGrafoP3RP0P2P2=983;
    CharSequence clsUTGrafoP3RP0P2=null;
      clsUTGrafoP3RP0P2=new String(clsUTGrafoP3RP0P2P1,clsUTGrafoP3RP0P2P2);
    String clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.replace(clsUTGrafoP3RP0P1,clsUTGrafoP3RP0P2);
    assertEquals(")t+",clsUTGrafoP3RP0P1.toString());
    assertEquals(4,clsUTGrafoP3RP0P1.length());
    assertEquals("흲휅",clsUTGrafoP3RP0P2.toString());
    assertEquals(2,clsUTGrafoP3RP0P2.length());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[0, 711, 0]
2)----->v2[], 
3)----->toString[]
 Covered Branches:[1, 4]
 */
  @Test public void TestCase13() throws Throwable {
    int clsUTArestaP1P1=0;
    int clsUTArestaP1P2=711;
    int clsUTArestaP1P3=0;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v2();
    assertEquals(711,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    String clsUTArestaP3RP0R=null;
      clsUTArestaP3RP0R=clsUTArestaP3R.toLowerCase();
  }
}
