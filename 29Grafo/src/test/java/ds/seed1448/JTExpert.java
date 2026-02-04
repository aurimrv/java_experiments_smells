package ds.seed1448;
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
Evaluations : 28246
search time (ms): 42501
total runtime (ms): 44661
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Grafo[324]
2)----->insereAresta[1, 251, -321], 
3)----->grafoTransposto[]
 Covered Branches:[32, 33, 1, 34, 2, 35, 3, 4, 5, 9, 10, 11, 15, 16, 17, 18, 19, 21, 23, 31]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTGrafoP1P1=324;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=1;
    int clsUTGrafoP2P2=251;
    int clsUTGrafoP2P3=-321;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    Grafo clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP3RP0P1=647;
    Grafo.Aresta clsUTGrafoP3RP0R=null;
//Exception
    try {
      clsUTGrafoP3RP0R=clsUTGrafoP3R.proxAdj(clsUTGrafoP3RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP3RP0R);
    assertEquals(324,clsUTGrafoP3R.numVertices());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[363]
2)----->grafoTransposto[], 
3)----->toString[], 
4)----->numVertices[]
 Covered Branches:[32, 16, 34, 9, 10, 27, 28, 30, 31, 15]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTGrafoP1P1=363;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0R=0;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.numVertices();
    assertEquals(363,clsUTGrafoP2RP0R);
      clsUTGrafoP2R.imprime();
    assertEquals(363,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    int clsUTGrafoP3RP0R=0;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.length();
    int clsUTGrafoP4R=0;
      clsUTGrafoP4R=clsUTGrafo.numVertices();
    assertEquals(363,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[404]
2)----->proxAdj[172], 
3)----->grafoTransposto[], 
4)----->numVertices[]
 Covered Branches:[32, 16, 34, 21, 23, 9, 10, 30, 31, 15]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTGrafoP1P1=404;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=172;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.proxAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    Grafo clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.grafoTransposto();
    assertEquals(404,clsUTGrafoP3R.numVertices());
    int clsUTGrafoP4R=0;
      clsUTGrafoP4R=clsUTGrafo.numVertices();
    assertEquals(404,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[512]
2)----->insereAresta[34, -834, 712], 
3)----->imprime[]
 Covered Branches:[5, 9, 10, 11, 27, 28, 29]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTGrafoP1P1=512;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=34;
    int clsUTGrafoP2P2=-834;
    int clsUTGrafoP2P3=712;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
      clsUTGrafo.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[651, 567, 940]
2)----->v1[], 
3)----->v1[], 
4)----->peso[]
 Covered Branches:[1, 2, 3]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTArestaP1P1=651;
    int clsUTArestaP1P2=567;
    int clsUTArestaP1P3=940;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v1();
    assertEquals(651,clsUTArestaP2R);
    int clsUTArestaP3R=0;
      clsUTArestaP3R=clsUTAresta.v1();
    assertEquals(651,clsUTArestaP3R);
    int clsUTArestaP4R=0;
      clsUTArestaP4R=clsUTAresta.peso();
    assertEquals(940,clsUTArestaP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[752]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[32, 16, 34, 18, 20, 9, 10, 31, 15]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTGrafoP1P1=752;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=14;
    Grafo.Aresta clsUTGrafoP2RP0R=null;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.primeiroListaAdj(clsUTGrafoP2RP0P1);
    assertNull(clsUTGrafoP2RP0R);
    assertEquals(752,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    String clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.toUpperCase();
    boolean clsUTGrafoP3RP1P1=true;
    String clsUTGrafoP3RP1R=null;
      clsUTGrafoP3RP1R=String.valueOf(clsUTGrafoP3RP1P1);
    assertEquals("true",clsUTGrafoP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[1]
2)----->numVertices[], 
3)----->toString[]
 Covered Branches:[9, 10, 30]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTGrafoP1P1=1;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2R=0;
      clsUTGrafoP2R=clsUTGrafo.numVertices();
    assertEquals(1,clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    int clsUTGrafoP3RP0P1=-838;
    int clsUTGrafoP3RP0R=0;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.lastIndexOf(clsUTGrafoP3RP0P1);
    assertEquals(-1,clsUTGrafoP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[-909, -621, 0]
2)----->v2[], 
3)----->toString[]
 Covered Branches:[1, 4]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTArestaP1P1=-909;
    int clsUTArestaP1P2=-621;
    int clsUTArestaP1P3=0;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v2();
    assertEquals(-621,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[388]
2)----->grafoTransposto[]
 Covered Branches:[32, 16, 34, 5, 9, 10, 11, 31, 15]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTGrafoP1P1=388;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=-817;
    int clsUTGrafoP2RP0P2=-832;
    int clsUTGrafoP2RP0P3=0;
//Exception
    try {
      clsUTGrafoP2R.insereAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2,clsUTGrafoP2RP0P3);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals(388,clsUTGrafoP2R.numVertices());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[453]
2)----->insereAresta[0, -286, -9], 
3)----->grafoTransposto[], 
4)----->retiraAresta[0, -795]
 Covered Branches:[32, 33, 1, 2, 35, 3, 4, 5, 6, 8, 9, 10, 11, 15, 17, 18, 19, 24, 26, 31]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTGrafoP1P1=453;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=0;
    int clsUTGrafoP2P2=-286;
    int clsUTGrafoP2P3=-9;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    Grafo clsUTGrafoP3R=null;
//Exception
    try {
      clsUTGrafoP3R=clsUTGrafo.grafoTransposto();
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP3R);
    int clsUTGrafoP4P1=0;
    int clsUTGrafoP4P2=-795;
    Grafo.Aresta clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.retiraAresta(clsUTGrafoP4P1,clsUTGrafoP4P2);
    assertNull(clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[789]
2)----->existeAresta[1, -68], 
3)----->toString[]
 Covered Branches:[5, 9, 10, 12, 14]
 */
  @Test public void TestCase10() throws Throwable {
    int clsUTGrafoP1P1=789;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=1;
    int clsUTGrafoP2P2=-68;
    boolean clsUTGrafoP2R=false;
      clsUTGrafoP2R=clsUTGrafo.existeAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    assertEquals(false,clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[587]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[32, 16, 34, 9, 10, 31, 15]
 */
  @Test public void TestCase11() throws Throwable {
    int clsUTGrafoP1P1=587;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    assertEquals(587,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    int clsUTGrafoP3RP0P1=1;
    char clsUTGrafoP3RP0R='X';
      clsUTGrafoP3RP0R=clsUTGrafoP3R.charAt(clsUTGrafoP3RP0P1);
    assertEquals('\u0073',clsUTGrafoP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[611]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[32, 16, 34, 18, 20, 5, 24, 9, 10, 31, 15]
 */
  @Test public void TestCase12() throws Throwable {
    int clsUTGrafoP1P1=611;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=1;
    Grafo.Aresta clsUTGrafoP2RP0R=null;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.primeiroListaAdj(clsUTGrafoP2RP0P1);
    assertNull(clsUTGrafoP2RP0R);
    int clsUTGrafoP2RP1P1=-54;
    int clsUTGrafoP2RP1P2=0;
    Grafo.Aresta clsUTGrafoP2RP1R=null;
//Exception
    try {
      clsUTGrafoP2RP1R=clsUTGrafoP2R.retiraAresta(clsUTGrafoP2RP1P1,clsUTGrafoP2RP1P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP1R);
    assertEquals(611,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
  }
}
