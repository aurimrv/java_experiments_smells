package ds.seed5482;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Grafo;
import java.util.Arrays;
/** 
 * This class was automatically generated to test the ds.Grafo class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35]
Uncovered branches: [7, 25, 13]
Total number of branches: 35
Total number of covered branches: 32
Coverage : 91,43%
Evaluations : 35015
search time (ms): 42501
total runtime (ms): 44558
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[940, -360, -107]
2)----->peso[], 
3)----->toString[]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTArestaP1P1=940;
    int clsUTArestaP1P2=-360;
    int clsUTArestaP1P3=-107;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.peso();
    assertEquals(-107,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    boolean clsUTArestaP3RP0P1=true;
    String clsUTArestaP3RP0R=null;
      clsUTArestaP3RP0R=String.valueOf(clsUTArestaP3RP0P1);
    assertEquals("true",clsUTArestaP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[652]
2)----->primeiroListaAdj[383], 
3)----->toString[]
 Covered Branches:[18, 20, 9, 10]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTGrafoP1P1=652;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=383;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.primeiroListaAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    String clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.trim();
    String clsUTGrafoP3RP1R=null;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.toUpperCase();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[999]
2)----->grafoTransposto[], 
3)----->numVertices[], 
4)----->toString[]
 Covered Branches:[32, 16, 34, 9, 10, 27, 28, 30, 31, 15]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTGrafoP1P1=999;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
      clsUTGrafoP2R.imprime();
    assertEquals(999,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(999,clsUTGrafoP3R);
    String clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.toString();
    boolean clsUTGrafoP4RP0P1=false;
    String clsUTGrafoP4RP0R=null;
      clsUTGrafoP4RP0R=String.valueOf(clsUTGrafoP4RP0P1);
    assertEquals("false",clsUTGrafoP4RP0R);
    char[] clsUTGrafoP4RP1R=null;
      clsUTGrafoP4RP1R=clsUTGrafoP4R.toCharArray();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[804]
2)----->numVertices[], 
3)----->proxAdj[0], 
4)----->grafoTransposto[]
 Covered Branches:[32, 16, 34, 21, 23, 9, 10, 30, 31, 15]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTGrafoP1P1=804;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2R=0;
      clsUTGrafoP2R=clsUTGrafo.numVertices();
    assertEquals(804,clsUTGrafoP2R);
    int clsUTGrafoP3P1=0;
    Grafo.Aresta clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.proxAdj(clsUTGrafoP3P1);
    assertNull(clsUTGrafoP3R);
    Grafo clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.grafoTransposto();
    Grafo clsUTGrafoP4RP0R=null;
      clsUTGrafoP4RP0R=clsUTGrafoP4R.grafoTransposto();
    assertEquals(804,clsUTGrafoP4RP0R.numVertices());
    int clsUTGrafoP4RP1P1=426;
    boolean clsUTGrafoP4RP1R=false;
      clsUTGrafoP4RP1R=clsUTGrafoP4R.listaAdjVazia(clsUTGrafoP4RP1P1);
    assertEquals(true,clsUTGrafoP4RP1R);
    assertEquals(804,clsUTGrafoP4R.numVertices());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[868]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[32, 16, 34, 18, 20, 5, 9, 10, 11, 31, 15]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTGrafoP1P1=868;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=489;
    Grafo.Aresta clsUTGrafoP2RP0R=null;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.primeiroListaAdj(clsUTGrafoP2RP0P1);
    assertNull(clsUTGrafoP2RP0R);
    int clsUTGrafoP2RP1P1=0;
    int clsUTGrafoP2RP1P2=398;
    int clsUTGrafoP2RP1P3=0;
      clsUTGrafoP2R.insereAresta(clsUTGrafoP2RP1P1,clsUTGrafoP2RP1P2,clsUTGrafoP2RP1P3);
    assertEquals(868,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    int clsUTGrafoP3RP0R=0;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.length();
    String clsUTGrafoP3RP1R=null;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.toLowerCase();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[798]
2)----->grafoTransposto[], 
3)----->numVertices[], 
4)----->existeAresta[1, -917]
 Covered Branches:[32, 16, 34, 5, 9, 10, 12, 30, 14, 31, 15]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTGrafoP1P1=798;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    assertEquals(798,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(798,clsUTGrafoP3R);
    int clsUTGrafoP4P1=1;
    int clsUTGrafoP4P2=-917;
    boolean clsUTGrafoP4R=false;
      clsUTGrafoP4R=clsUTGrafo.existeAresta(clsUTGrafoP4P1,clsUTGrafoP4P2);
    assertEquals(false,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[363]
2)----->insereAresta[1, 294, -54], 
3)----->proxAdj[149], 
4)----->proxAdj[1]
 Covered Branches:[1, 4, 5, 21, 22, 23, 9, 10, 11]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTGrafoP1P1=363;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=1;
    int clsUTGrafoP2P2=294;
    int clsUTGrafoP2P3=-54;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3P1=149;
    Grafo.Aresta clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.proxAdj(clsUTGrafoP3P1);
    assertNull(clsUTGrafoP3R);
    int clsUTGrafoP4P1=1;
    Grafo.Aresta clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.proxAdj(clsUTGrafoP4P1);
    int clsUTGrafoP4RP0R=0;
      clsUTGrafoP4RP0R=clsUTGrafoP4R.v2();
    assertEquals(294,clsUTGrafoP4RP0R);
    int clsUTGrafoP4RP1R=0;
      clsUTGrafoP4RP1R=clsUTGrafoP4R.v2();
    assertEquals(294,clsUTGrafoP4RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[279]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 16, 34, 18, 5, 24, 9, 10, 30, 31, 15]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTGrafoP1P1=279;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=835;
    Grafo.Aresta clsUTGrafoP2RP0R=null;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.primeiroListaAdj(clsUTGrafoP2RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP0R);
    int clsUTGrafoP2RP1P1=-723;
    int clsUTGrafoP2RP1P2=52;
    Grafo.Aresta clsUTGrafoP2RP1R=null;
//Exception
    try {
      clsUTGrafoP2RP1R=clsUTGrafoP2R.retiraAresta(clsUTGrafoP2RP1P1,clsUTGrafoP2RP1P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP1R);
    assertEquals(279,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(279,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[700]
2)----->insereAresta[1, -421, -373], 
3)----->numVertices[], 
4)----->retiraAresta[1, 855]
 Covered Branches:[5, 6, 24, 8, 9, 10, 26, 11, 30]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTGrafoP1P1=700;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=1;
    int clsUTGrafoP2P2=-421;
    int clsUTGrafoP2P3=-373;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(700,clsUTGrafoP3R);
    int clsUTGrafoP4P1=1;
    int clsUTGrafoP4P2=855;
    Grafo.Aresta clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.retiraAresta(clsUTGrafoP4P1,clsUTGrafoP4P2);
    assertNull(clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[878]
2)----->primeiroListaAdj[670], 
3)----->insereAresta[48, 312, -804], 
4)----->grafoTransposto[]
 Covered Branches:[32, 33, 1, 34, 2, 35, 3, 4, 5, 9, 10, 11, 15, 16, 17, 18, 19, 20, 21, 23, 31]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTGrafoP1P1=878;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=670;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.primeiroListaAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    int clsUTGrafoP3P1=48;
    int clsUTGrafoP3P2=312;
    int clsUTGrafoP3P3=-804;
      clsUTGrafo.insereAresta(clsUTGrafoP3P1,clsUTGrafoP3P2,clsUTGrafoP3P3);
    Grafo clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP4RP0P1=-829;
    int clsUTGrafoP4RP0P2=730;
    int clsUTGrafoP4RP0P3=-254;
//Exception
    try {
      clsUTGrafoP4R.insereAresta(clsUTGrafoP4RP0P1,clsUTGrafoP4RP0P2,clsUTGrafoP4RP0P3);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals(878,clsUTGrafoP4R.numVertices());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[165, -782, 81]
2)----->v2[], 
3)----->v1[], 
4)----->v1[]
 Covered Branches:[1, 3, 4]
 */
  @Test public void TestCase10() throws Throwable {
    int clsUTArestaP1P1=165;
    int clsUTArestaP1P2=-782;
    int clsUTArestaP1P3=81;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v2();
    assertEquals(-782,clsUTArestaP2R);
    int clsUTArestaP3R=0;
      clsUTArestaP3R=clsUTAresta.v1();
    assertEquals(165,clsUTArestaP3R);
    int clsUTArestaP4R=0;
      clsUTArestaP4R=clsUTAresta.v1();
    assertEquals(165,clsUTArestaP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[606]
2)----->insereAresta[141, 992, -665], 
3)----->imprime[]
 Covered Branches:[5, 9, 10, 11, 27, 28, 29]
 */
  @Test public void TestCase11() throws Throwable {
    int clsUTGrafoP1P1=606;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=141;
    int clsUTGrafoP2P2=992;
    int clsUTGrafoP2P3=-665;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
      clsUTGrafo.imprime();
  }
}
