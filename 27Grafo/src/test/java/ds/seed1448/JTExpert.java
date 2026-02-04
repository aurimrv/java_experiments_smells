package ds.seed1448;
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
Evaluations : 47377
search time (ms): 42506
total runtime (ms): 44221
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[202, 1, 1]
2)----->v2[], 
3)----->toString[]
 Covered Branches:[1, 4]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTArestaP1P1=202;
    int clsUTArestaP1P2=1;
    int clsUTArestaP1P3=1;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v2();
    assertEquals(1,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[529]
2)----->insereAresta[485, 1, 500], 
3)----->grafoTransposto[], 
4)----->grafoTransposto[]
 Covered Branches:[32, 33, 1, 34, 2, 35, 3, 4, 5, 6, 8, 9, 10, 11, 15, 16, 17, 18, 19, 21, 23, 24, 26, 31]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTGrafoP1P1=529;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=485;
    int clsUTGrafoP2P2=1;
    int clsUTGrafoP2P3=500;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    Grafo clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP3RP0P1=1;
    int clsUTGrafoP3RP0P2=941;
    Grafo.Aresta clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.retiraAresta(clsUTGrafoP3RP0P1,clsUTGrafoP3RP0P2);
    assertNull(clsUTGrafoP3RP0R);
    Grafo clsUTGrafoP3RP1R=null;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.grafoTransposto();
    assertEquals(529,clsUTGrafoP3RP1R.numVertices());
    assertEquals(529,clsUTGrafoP3R.numVertices());
    Grafo clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP4RP0P1=-1;
    boolean clsUTGrafoP4RP0R=false;
//Exception
    try {
      clsUTGrafoP4RP0R=clsUTGrafoP4R.listaAdjVazia(clsUTGrafoP4RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals(529,clsUTGrafoP4R.numVertices());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[1]
2)----->imprime[], 
3)----->primeiroListaAdj[0]
 Covered Branches:[18, 20, 9, 10, 27, 28]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTGrafoP1P1=1;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
      clsUTGrafo.imprime();
    int clsUTGrafoP3P1=0;
    Grafo.Aresta clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.primeiroListaAdj(clsUTGrafoP3P1);
    assertNull(clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[102]
2)----->imprime[], 
3)----->toString[]
 Covered Branches:[9, 10, 27, 28]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTGrafoP1P1=102;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
      clsUTGrafo.imprime();
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    String clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.toUpperCase();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[540]
2)----->grafoTransposto[], 
3)----->existeAresta[68, 7], 
4)----->proxAdj[165], 
5)----->insereAresta[0, 96, 684], 
6)----->proxAdj[0]
 Covered Branches:[32, 1, 34, 3, 4, 5, 9, 10, 11, 12, 14, 15, 16, 21, 22, 23, 31]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTGrafoP1P1=540;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    assertEquals(540,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3P1=68;
    int clsUTGrafoP3P2=7;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.existeAresta(clsUTGrafoP3P1,clsUTGrafoP3P2);
    assertEquals(false,clsUTGrafoP3R);
    int clsUTGrafoP4P1=165;
    Grafo.Aresta clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.proxAdj(clsUTGrafoP4P1);
    assertNull(clsUTGrafoP4R);
    int clsUTGrafoP5P1=0;
    int clsUTGrafoP5P2=96;
    int clsUTGrafoP5P3=684;
      clsUTGrafo.insereAresta(clsUTGrafoP5P1,clsUTGrafoP5P2,clsUTGrafoP5P3);
    int clsUTGrafoP6P1=0;
    Grafo.Aresta clsUTGrafoP6R=null;
      clsUTGrafoP6R=clsUTGrafo.proxAdj(clsUTGrafoP6P1);
    int clsUTGrafoP6RP0R=0;
      clsUTGrafoP6RP0R=clsUTGrafoP6R.v2();
    assertEquals(96,clsUTGrafoP6RP0R);
    int clsUTGrafoP6RP1R=0;
      clsUTGrafoP6RP1R=clsUTGrafoP6R.v1();
    assertEquals(0,clsUTGrafoP6RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[-326, 953, -440]
2)----->peso[], 
3)----->toString[]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTArestaP1P1=-326;
    int clsUTArestaP1P2=953;
    int clsUTArestaP1P3=-440;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.peso();
    assertEquals(-440,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    StringBuffer clsUTArestaP3RP0P1=null;
      clsUTArestaP3RP0P1=new StringBuffer();
    boolean clsUTArestaP3RP0R=false;
      clsUTArestaP3RP0R=clsUTArestaP3R.contentEquals(clsUTArestaP3RP0P1);
    assertEquals("",clsUTArestaP3RP0P1.toString());
    assertEquals(16,clsUTArestaP3RP0P1.capacity());
    assertEquals(false,clsUTArestaP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[206]
2)----->insereAresta[1, 0, 738], 
3)----->numVertices[], 
4)----->grafoTransposto[]
 Covered Branches:[32, 33, 1, 34, 2, 35, 3, 4, 5, 9, 10, 11, 15, 16, 17, 18, 19, 21, 23, 30, 31]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTGrafoP1P1=206;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=1;
    int clsUTGrafoP2P2=0;
    int clsUTGrafoP2P3=738;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(206,clsUTGrafoP3R);
    Grafo clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.grafoTransposto();
    assertEquals(206,clsUTGrafoP4R.numVertices());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[392]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 16, 34, 5, 9, 10, 11, 27, 28, 30, 31, 15]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTGrafoP1P1=392;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=-859;
    int clsUTGrafoP2RP0P2=171;
    int clsUTGrafoP2RP0P3=766;
//Exception
    try {
      clsUTGrafoP2R.insereAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2,clsUTGrafoP2RP0P3);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
      clsUTGrafoP2R.imprime();
    assertEquals(392,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(392,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[488]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 16, 34, 5, 24, 9, 10, 30, 31, 15]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTGrafoP1P1=488;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0R=0;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.numVertices();
    assertEquals(488,clsUTGrafoP2RP0R);
    int clsUTGrafoP2RP1P1=869;
    int clsUTGrafoP2RP1P2=-1;
    Grafo.Aresta clsUTGrafoP2RP1R=null;
//Exception
    try {
      clsUTGrafoP2RP1R=clsUTGrafoP2R.retiraAresta(clsUTGrafoP2RP1P1,clsUTGrafoP2RP1P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP1R);
    assertEquals(488,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(488,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[1]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[32, 16, 34, 5, 21, 9, 10, 12, 31, 15]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTGrafoP1P1=1;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=258;
    int clsUTGrafoP2RP0P2=103;
    boolean clsUTGrafoP2RP0R=false;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.existeAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    int clsUTGrafoP2RP1P1=370;
    Grafo.Aresta clsUTGrafoP2RP1R=null;
//Exception
    try {
      clsUTGrafoP2RP1R=clsUTGrafoP2R.proxAdj(clsUTGrafoP2RP1P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP1R);
    assertEquals(1,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[1]
2)----->grafoTransposto[]
 Covered Branches:[32, 16, 34, 9, 10, 31, 15]
 */
  @Test public void TestCase10() throws Throwable {
    int clsUTGrafoP1P1=1;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    Grafo clsUTGrafoP2RP0R=null;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.grafoTransposto();
    assertEquals(1,clsUTGrafoP2RP0R.numVertices());
    assertEquals(1,clsUTGrafoP2R.numVertices());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[695, -751, 820]
2)----->v1[], 
3)----->toString[]
 Covered Branches:[1, 3]
 */
  @Test public void TestCase11() throws Throwable {
    int clsUTArestaP1P1=695;
    int clsUTArestaP1P2=-751;
    int clsUTArestaP1P3=820;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v1();
    assertEquals(695,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[176]
2)----->numVertices[]
 Covered Branches:[9, 10, 30]
 */
  @Test public void TestCase12() throws Throwable {
    int clsUTGrafoP1P1=176;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2R=0;
      clsUTGrafoP2R=clsUTGrafo.numVertices();
    assertEquals(176,clsUTGrafoP2R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[614]
2)----->proxAdj[0], 
3)----->existeAresta[516, 41]
 Covered Branches:[21, 5, 23, 9, 10, 12, 14]
 */
  @Test public void TestCase13() throws Throwable {
    int clsUTGrafoP1P1=614;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=0;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.proxAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    int clsUTGrafoP3P1=516;
    int clsUTGrafoP3P2=41;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.existeAresta(clsUTGrafoP3P1,clsUTGrafoP3P2);
    assertEquals(false,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[843]
2)----->imprime[], 
3)----->insereAresta[132, 1, -993], 
4)----->imprime[]
 Covered Branches:[5, 9, 10, 27, 11, 28, 29]
 */
  @Test public void TestCase14() throws Throwable {
    int clsUTGrafoP1P1=843;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
      clsUTGrafo.imprime();
    int clsUTGrafoP3P1=132;
    int clsUTGrafoP3P2=1;
    int clsUTGrafoP3P3=-993;
      clsUTGrafo.insereAresta(clsUTGrafoP3P1,clsUTGrafoP3P2,clsUTGrafoP3P3);
      clsUTGrafo.imprime();
  }
}
