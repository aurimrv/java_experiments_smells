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
Covered branches: [1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 27, 28, 29, 30, 31, 32, 33, 34, 35]
Uncovered branches: [7, 25, 26, 13]
Total number of branches: 35
Total number of covered branches: 31
Coverage : 88,57%
Evaluations : 29418
search time (ms): 42501
total runtime (ms): 44584
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[595, -1, 683]
2)----->v2[], 
3)----->toString[]
 Covered Branches:[1, 4]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTArestaP1P1=595;
    int clsUTArestaP1P2=-1;
    int clsUTArestaP1P3=683;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v2();
    assertEquals(-1,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[93]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[32, 16, 34, 9, 10, 31, 15]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTGrafoP1P1=93;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    assertEquals(93,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    int clsUTGrafoP3RP0P1=957;
    char clsUTGrafoP3RP0R='X';
//Exception
    try {
      clsUTGrafoP3RP0R=clsUTGrafoP3R.charAt(clsUTGrafoP3RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    int clsUTGrafoP3RP1P1=898;
    int clsUTGrafoP3RP1R=0;
//Exception
    try {
      clsUTGrafoP3RP1R=clsUTGrafoP3R.codePointAt(clsUTGrafoP3RP1P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[924]
2)----->insereAresta[269, 0, 373], 
3)----->grafoTransposto[]
 Covered Branches:[32, 33, 1, 34, 2, 35, 3, 4, 5, 9, 10, 11, 15, 16, 17, 18, 19, 21, 23, 31]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTGrafoP1P1=924;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=269;
    int clsUTGrafoP2P2=0;
    int clsUTGrafoP2P3=373;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    Grafo clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.grafoTransposto();
    assertEquals(924,clsUTGrafoP3R.numVertices());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[374]
2)----->numVertices[], 
3)----->insereAresta[0, 718, 726], 
4)----->proxAdj[-805], 
5)----->insereAresta[1, 122, -604], 
6)----->existeAresta[1, -219], 
7)----->numVertices[], 
8)----->retiraAresta[248, 840]
 Covered Branches:[5, 21, 6, 8, 24, 9, 10, 11, 12, 30, 14]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTGrafoP1P1=374;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2R=0;
      clsUTGrafoP2R=clsUTGrafo.numVertices();
    assertEquals(374,clsUTGrafoP2R);
    int clsUTGrafoP3P1=0;
    int clsUTGrafoP3P2=718;
    int clsUTGrafoP3P3=726;
      clsUTGrafo.insereAresta(clsUTGrafoP3P1,clsUTGrafoP3P2,clsUTGrafoP3P3);
    int clsUTGrafoP4P1=-805;
    Grafo.Aresta clsUTGrafoP4R=null;
//Exception
    try {
      clsUTGrafoP4R=clsUTGrafo.proxAdj(clsUTGrafoP4P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP4R);
    int clsUTGrafoP5P1=1;
    int clsUTGrafoP5P2=122;
    int clsUTGrafoP5P3=-604;
      clsUTGrafo.insereAresta(clsUTGrafoP5P1,clsUTGrafoP5P2,clsUTGrafoP5P3);
    int clsUTGrafoP6P1=1;
    int clsUTGrafoP6P2=-219;
    boolean clsUTGrafoP6R=false;
      clsUTGrafoP6R=clsUTGrafo.existeAresta(clsUTGrafoP6P1,clsUTGrafoP6P2);
    assertEquals(false,clsUTGrafoP6R);
    int clsUTGrafoP7R=0;
      clsUTGrafoP7R=clsUTGrafo.numVertices();
    assertEquals(374,clsUTGrafoP7R);
    int clsUTGrafoP8P1=248;
    int clsUTGrafoP8P2=840;
    Grafo.Aresta clsUTGrafoP8R=null;
//Exception
    try {
      clsUTGrafoP8R=clsUTGrafo.retiraAresta(clsUTGrafoP8P1,clsUTGrafoP8P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP8R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[783]
2)----->proxAdj[1], 
3)----->existeAresta[0, 793], 
4)----->toString[]
 Covered Branches:[21, 5, 23, 9, 10, 12, 14]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTGrafoP1P1=783;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=1;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.proxAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    int clsUTGrafoP3P1=0;
    int clsUTGrafoP3P2=793;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.existeAresta(clsUTGrafoP3P1,clsUTGrafoP3P2);
    assertEquals(false,clsUTGrafoP3R);
    String clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.toString();
    char[] clsUTGrafoP4RP0P1=new char[]{};
    String clsUTGrafoP4RP0R=null;
      clsUTGrafoP4RP0R=String.valueOf(clsUTGrafoP4RP0P1);
    assertTrue(Arrays.equals(new char[]{},clsUTGrafoP4RP0P1));
    assertEquals("",clsUTGrafoP4RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[487]
2)----->primeiroListaAdj[393], 
3)----->toString[]
 Covered Branches:[18, 20, 9, 10]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTGrafoP1P1=487;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=393;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.primeiroListaAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    int clsUTGrafoP3RP0P1=-331;
    int clsUTGrafoP3RP0P2=-582;
    CharSequence clsUTGrafoP3RP0R=null;
//Exception
    try {
      clsUTGrafoP3RP0R=clsUTGrafoP3R.subSequence(clsUTGrafoP3RP0P1,clsUTGrafoP3RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP3RP0R);
    char clsUTGrafoP3RP1P1='\u003c';
    String clsUTGrafoP3RP1R=null;
      clsUTGrafoP3RP1R=String.valueOf(clsUTGrafoP3RP1P1);
    assertEquals("<",clsUTGrafoP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[1, -56, 510]
2)----->peso[], 
3)----->toString[]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTArestaP1P1=1;
    int clsUTArestaP1P2=-56;
    int clsUTArestaP1P3=510;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.peso();
    assertEquals(510,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[-180, 810, -213]
2)----->v1[], 
3)----->toString[]
 Covered Branches:[1, 3]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTArestaP1P1=-180;
    int clsUTArestaP1P2=810;
    int clsUTArestaP1P3=-213;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v1();
    assertEquals(-180,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    char[] clsUTArestaP3RP0P1=new char[]{'\u0033'};
    String clsUTArestaP3RP0R=null;
      clsUTArestaP3RP0R=String.copyValueOf(clsUTArestaP3RP0P1);
    assertTrue(Arrays.equals(new char[]{'\u0033'},clsUTArestaP3RP0P1));
    assertEquals("3",clsUTArestaP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[960]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 16, 34, 21, 5, 23, 24, 9, 10, 30, 31, 15]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTGrafoP1P1=960;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=0;
    Grafo.Aresta clsUTGrafoP2RP0R=null;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.proxAdj(clsUTGrafoP2RP0P1);
    assertNull(clsUTGrafoP2RP0R);
    int clsUTGrafoP2RP1P1=0;
    int clsUTGrafoP2RP1P2=476;
    Grafo.Aresta clsUTGrafoP2RP1R=null;
//Exception
    try {
      clsUTGrafoP2RP1R=clsUTGrafoP2R.retiraAresta(clsUTGrafoP2RP1P1,clsUTGrafoP2RP1P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP1R);
    assertEquals(960,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(960,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[531]
2)----->imprime[]
 Covered Branches:[9, 10, 27, 28]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTGrafoP1P1=531;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
      clsUTGrafo.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[1]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 16, 34, 9, 10, 30, 31, 15]
 */
  @Test public void TestCase10() throws Throwable {
    int clsUTGrafoP1P1=1;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    assertEquals(1,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(1,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[1]
2)----->insereAresta[0, 1, -450], 
3)----->proxAdj[-762], 
4)----->proxAdj[0]
 Covered Branches:[1, 2, 5, 21, 22, 9, 10, 11]
 */
  @Test public void TestCase11() throws Throwable {
    int clsUTGrafoP1P1=1;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=0;
    int clsUTGrafoP2P2=1;
    int clsUTGrafoP2P3=-450;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3P1=-762;
    Grafo.Aresta clsUTGrafoP3R=null;
//Exception
    try {
      clsUTGrafoP3R=clsUTGrafo.proxAdj(clsUTGrafoP3P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP3R);
    int clsUTGrafoP4P1=0;
    Grafo.Aresta clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.proxAdj(clsUTGrafoP4P1);
    int clsUTGrafoP4RP0R=0;
      clsUTGrafoP4RP0R=clsUTGrafoP4R.peso();
    assertEquals(-450,clsUTGrafoP4RP0R);
    int clsUTGrafoP4RP1R=0;
      clsUTGrafoP4RP1R=clsUTGrafoP4R.peso();
    assertEquals(-450,clsUTGrafoP4RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[86]
2)----->insereAresta[0, 50, 175], 
3)----->imprime[]
 Covered Branches:[5, 9, 10, 11, 27, 28, 29]
 */
  @Test public void TestCase12() throws Throwable {
    int clsUTGrafoP1P1=86;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=0;
    int clsUTGrafoP2P2=50;
    int clsUTGrafoP2P3=175;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
      clsUTGrafo.imprime();
  }
}
