package ds.seed5311;
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
Evaluations : 39849
search time (ms): 42517
total runtime (ms): 44690
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Grafo[571]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 16, 34, 9, 10, 30, 31, 15]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTGrafoP1P1=571;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    assertEquals(571,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(571,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[778]
2)----->grafoTransposto[]
 Covered Branches:[32, 33, 1, 34, 2, 35, 3, 4, 5, 9, 10, 11, 15, 16, 17, 18, 19, 31]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTGrafoP1P1=778;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=49;
    int clsUTGrafoP2RP0P2=950;
    int clsUTGrafoP2RP0P3=-646;
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
    assertEquals(778,clsUTGrafoP2R.numVertices());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[-705, 1, -535]
2)----->v1[], 
3)----->peso[]
 Covered Branches:[1, 2, 3]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTArestaP1P1=-705;
    int clsUTArestaP1P2=1;
    int clsUTArestaP1P3=-535;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v1();
    assertEquals(-705,clsUTArestaP2R);
    int clsUTArestaP3R=0;
      clsUTArestaP3R=clsUTAresta.peso();
    assertEquals(-535,clsUTArestaP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[1]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 16, 34, 5, 24, 9, 10, 27, 28, 30, 31, 15]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTGrafoP1P1=1;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=646;
    int clsUTGrafoP2RP0P2=-369;
    Grafo.Aresta clsUTGrafoP2RP0R=null;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.retiraAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP0R);
      clsUTGrafoP2R.imprime();
    assertEquals(1,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(1,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[712]
2)----->primeiroListaAdj[1], 
3)----->toString[]
 Covered Branches:[18, 20, 9, 10]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTGrafoP1P1=712;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=1;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.primeiroListaAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[0]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[9, 30, 31]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTGrafoP1P1=0;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    assertEquals(0,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(0,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[568]
2)----->grafoTransposto[], 
3)----->toString[], 
4)----->numVertices[]
 Covered Branches:[32, 16, 34, 5, 9, 10, 11, 30, 31, 15]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTGrafoP1P1=568;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    Grafo clsUTGrafoP2RP0R=null;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.grafoTransposto();
    assertEquals(568,clsUTGrafoP2RP0R.numVertices());
    int clsUTGrafoP2RP1P1=-290;
    int clsUTGrafoP2RP1P2=-1;
    int clsUTGrafoP2RP1P3=860;
//Exception
    try {
      clsUTGrafoP2R.insereAresta(clsUTGrafoP2RP1P1,clsUTGrafoP2RP1P2,clsUTGrafoP2RP1P3);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals(568,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    int clsUTGrafoP4R=0;
      clsUTGrafoP4R=clsUTGrafo.numVertices();
    assertEquals(568,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[729]
2)----->proxAdj[230], 
3)----->existeAresta[325, -537]
 Covered Branches:[21, 5, 23, 9, 10, 12, 14]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTGrafoP1P1=729;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=230;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.proxAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    int clsUTGrafoP3P1=325;
    int clsUTGrafoP3P2=-537;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.existeAresta(clsUTGrafoP3P1,clsUTGrafoP3P2);
    assertEquals(false,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[-201, -756, 126]
2)----->v2[], 
3)----->toString[]
 Covered Branches:[1, 4]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTArestaP1P1=-201;
    int clsUTArestaP1P2=-756;
    int clsUTArestaP1P3=126;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v2();
    assertEquals(-756,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    String clsUTArestaP3RP0P1=new String("xtulephpxiibehmok");
    int clsUTArestaP3RP0R=0;
      clsUTArestaP3RP0R=clsUTArestaP3R.lastIndexOf(clsUTArestaP3RP0P1);
    assertEquals("xtulephpxiibehmok",clsUTArestaP3RP0P1.toString());
    assertEquals(-1,clsUTArestaP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[659]
2)----->imprime[], 
3)----->existeAresta[623, -388]
 Covered Branches:[5, 9, 10, 27, 28, 12, 14]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTGrafoP1P1=659;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
      clsUTGrafo.imprime();
    int clsUTGrafoP3P1=623;
    int clsUTGrafoP3P2=-388;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.existeAresta(clsUTGrafoP3P1,clsUTGrafoP3P2);
    assertEquals(false,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[377]
2)----->insereAresta[1, 1, 1], 
3)----->imprime[]
 Covered Branches:[5, 9, 10, 11, 27, 28, 29]
 */
  @Test public void TestCase10() throws Throwable {
    int clsUTGrafoP1P1=377;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=1;
    int clsUTGrafoP2P2=1;
    int clsUTGrafoP2P3=1;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
      clsUTGrafo.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[1]
2)----->insereAresta[0, 452, 567], 
3)----->retiraAresta[0, -1], 
4)----->numVertices[]
 Covered Branches:[5, 6, 24, 8, 9, 10, 26, 11, 30]
 */
  @Test public void TestCase11() throws Throwable {
    int clsUTGrafoP1P1=1;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=0;
    int clsUTGrafoP2P2=452;
    int clsUTGrafoP2P3=567;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3P1=0;
    int clsUTGrafoP3P2=-1;
    Grafo.Aresta clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.retiraAresta(clsUTGrafoP3P1,clsUTGrafoP3P2);
    assertNull(clsUTGrafoP3R);
    int clsUTGrafoP4R=0;
      clsUTGrafoP4R=clsUTGrafo.numVertices();
    assertEquals(1,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[959]
2)----->insereAresta[0, 0, 587], 
3)----->proxAdj[0]
 Covered Branches:[1, 4, 5, 21, 22, 9, 10, 11]
 */
  @Test public void TestCase12() throws Throwable {
    int clsUTGrafoP1P1=959;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=0;
    int clsUTGrafoP2P2=0;
    int clsUTGrafoP2P3=587;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3P1=0;
    Grafo.Aresta clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.proxAdj(clsUTGrafoP3P1);
    int clsUTGrafoP3RP0R=0;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.v2();
    assertEquals(0,clsUTGrafoP3RP0R);
  }
}
