package ds.seed9121;
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
Evaluations : 29585
search time (ms): 42501
total runtime (ms): 44710
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[994, 388, 0]
2)----->peso[], 
3)----->toString[]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTArestaP1P1=994;
    int clsUTArestaP1P2=388;
    int clsUTArestaP1P3=0;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.peso();
    assertEquals(0,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    String clsUTArestaP3RP0R=null;
      clsUTArestaP3RP0R=clsUTArestaP3R.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[924]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[32, 16, 34, 18, 20, 9, 10, 31, 15]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTGrafoP1P1=924;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=380;
    Grafo.Aresta clsUTGrafoP2RP0R=null;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.primeiroListaAdj(clsUTGrafoP2RP0P1);
    assertNull(clsUTGrafoP2RP0R);
    assertEquals(924,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[1]
2)----->listaAdjVazia[-540], 
3)----->insereAresta[0, -1, 1], 
4)----->insereAresta[-1, -692, -177], 
5)----->primeiroListaAdj[-676], 
6)----->retiraAresta[0, -514]
 Covered Branches:[18, 5, 6, 24, 8, 9, 10, 26, 11, 15]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTGrafoP1P1=1;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=-540;
    boolean clsUTGrafoP2R=false;
//Exception
    try {
      clsUTGrafoP2R=clsUTGrafo.listaAdjVazia(clsUTGrafoP2P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    int clsUTGrafoP3P1=0;
    int clsUTGrafoP3P2=-1;
    int clsUTGrafoP3P3=1;
      clsUTGrafo.insereAresta(clsUTGrafoP3P1,clsUTGrafoP3P2,clsUTGrafoP3P3);
    int clsUTGrafoP4P1=-1;
    int clsUTGrafoP4P2=-692;
    int clsUTGrafoP4P3=-177;
//Exception
    try {
      clsUTGrafo.insereAresta(clsUTGrafoP4P1,clsUTGrafoP4P2,clsUTGrafoP4P3);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    int clsUTGrafoP5P1=-676;
    Grafo.Aresta clsUTGrafoP5R=null;
//Exception
    try {
      clsUTGrafoP5R=clsUTGrafo.primeiroListaAdj(clsUTGrafoP5P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP5R);
    int clsUTGrafoP6P1=0;
    int clsUTGrafoP6P2=-514;
    Grafo.Aresta clsUTGrafoP6R=null;
      clsUTGrafoP6R=clsUTGrafo.retiraAresta(clsUTGrafoP6P1,clsUTGrafoP6P2);
    assertNull(clsUTGrafoP6R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[-860, 46, 257]
2)----->v1[], 
3)----->toString[]
 Covered Branches:[1, 3]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTArestaP1P1=-860;
    int clsUTArestaP1P2=46;
    int clsUTArestaP1P3=257;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v1();
    assertEquals(-860,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    String clsUTArestaP3RP0R=null;
      clsUTArestaP3RP0R=clsUTArestaP3R.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[758]
2)----->numVertices[], 
3)----->imprime[]
 Covered Branches:[9, 10, 27, 28, 30]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTGrafoP1P1=758;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2R=0;
      clsUTGrafoP2R=clsUTGrafo.numVertices();
    assertEquals(758,clsUTGrafoP2R);
      clsUTGrafo.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[574]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 16, 34, 9, 10, 27, 28, 30, 31, 15]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTGrafoP1P1=574;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
      clsUTGrafoP2R.imprime();
    assertEquals(574,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(574,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[958]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[32, 16, 34, 5, 24, 9, 10, 30, 31, 15]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTGrafoP1P1=958;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=0;
    int clsUTGrafoP2RP0P2=-1;
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
    assertEquals(958,clsUTGrafoP2RP1R);
    assertEquals(958,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    int clsUTGrafoP3RP0P1=168;
    int clsUTGrafoP3RP0R=0;
//Exception
    try {
      clsUTGrafoP3RP0R=clsUTGrafoP3R.codePointAt(clsUTGrafoP3RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    int clsUTGrafoP3RP1P1=-46;
    int clsUTGrafoP3RP1P2=0;
    CharSequence clsUTGrafoP3RP1R=null;
//Exception
    try {
      clsUTGrafoP3RP1R=clsUTGrafoP3R.subSequence(clsUTGrafoP3RP1P1,clsUTGrafoP3RP1P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[975]
2)----->insereAresta[295, 508, 1], 
3)----->imprime[]
 Covered Branches:[5, 9, 10, 11, 27, 28, 29]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTGrafoP1P1=975;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=295;
    int clsUTGrafoP2P2=508;
    int clsUTGrafoP2P3=1;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
      clsUTGrafo.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[1]
2)----->proxAdj[0], 
3)----->grafoTransposto[]
 Covered Branches:[32, 16, 34, 18, 21, 5, 23, 9, 10, 11, 31, 15]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTGrafoP1P1=1;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=0;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.proxAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    Grafo clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP3RP0P1=-127;
    int clsUTGrafoP3RP0P2=283;
    int clsUTGrafoP3RP0P3=-121;
//Exception
    try {
      clsUTGrafoP3R.insereAresta(clsUTGrafoP3RP0P1,clsUTGrafoP3RP0P2,clsUTGrafoP3RP0P3);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    int clsUTGrafoP3RP1P1=-862;
    Grafo.Aresta clsUTGrafoP3RP1R=null;
//Exception
    try {
      clsUTGrafoP3RP1R=clsUTGrafoP3R.primeiroListaAdj(clsUTGrafoP3RP1P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP3RP1R);
    assertEquals(1,clsUTGrafoP3R.numVertices());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[0, 953, 201]
2)----->v2[], 
3)----->toString[]
 Covered Branches:[1, 4]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTArestaP1P1=0;
    int clsUTArestaP1P2=953;
    int clsUTArestaP1P3=201;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v2();
    assertEquals(953,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    int clsUTArestaP3RP0R=0;
      clsUTArestaP3RP0R=clsUTArestaP3R.hashCode();
    String clsUTArestaP3RP1P1=new String("vm1c|;t:8>wso'4&05qe+}y`(@k$#dapx/r{h_<?f^[~b6u3.i_ n2=)g]!97%z-l*j\\\\\\\\\\\\\"");
    String[] clsUTArestaP3RP1R=null;
//Exception
    try {
      clsUTArestaP3RP1R=clsUTArestaP3R.split(clsUTArestaP3RP1P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTArestaP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[0]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[18, 9, 30, 31]
 */
  @Test public void TestCase10() throws Throwable {
    int clsUTGrafoP1P1=0;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0R=0;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.numVertices();
    assertEquals(0,clsUTGrafoP2RP0R);
    int clsUTGrafoP2RP1P1=287;
    Grafo.Aresta clsUTGrafoP2RP1R=null;
//Exception
    try {
      clsUTGrafoP2RP1R=clsUTGrafoP2R.primeiroListaAdj(clsUTGrafoP2RP1P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP1R);
    assertEquals(0,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[825]
2)----->existeAresta[524, 218], 
3)----->listaAdjVazia[1]
 Covered Branches:[16, 5, 9, 10, 12, 14, 15]
 */
  @Test public void TestCase11() throws Throwable {
    int clsUTGrafoP1P1=825;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=524;
    int clsUTGrafoP2P2=218;
    boolean clsUTGrafoP2R=false;
      clsUTGrafoP2R=clsUTGrafo.existeAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    assertEquals(false,clsUTGrafoP2R);
    int clsUTGrafoP3P1=1;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.listaAdjVazia(clsUTGrafoP3P1);
    assertEquals(true,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[1]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 16, 34, 21, 9, 10, 30, 31, 15]
 */
  @Test public void TestCase12() throws Throwable {
    int clsUTGrafoP1P1=1;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=376;
    Grafo.Aresta clsUTGrafoP2RP0R=null;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.proxAdj(clsUTGrafoP2RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP0R);
    assertEquals(1,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(1,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[572]
2)----->existeAresta[13, 1], 
3)----->retiraAresta[-521, 1], 
4)----->insereAresta[1, -61, 659], 
5)----->proxAdj[1], 
6)----->numVertices[]
 Covered Branches:[1, 2, 5, 21, 22, 24, 9, 10, 11, 12, 14, 30]
 */
  @Test public void TestCase13() throws Throwable {
    int clsUTGrafoP1P1=572;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=13;
    int clsUTGrafoP2P2=1;
    boolean clsUTGrafoP2R=false;
      clsUTGrafoP2R=clsUTGrafo.existeAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    assertEquals(false,clsUTGrafoP2R);
    int clsUTGrafoP3P1=-521;
    int clsUTGrafoP3P2=1;
    Grafo.Aresta clsUTGrafoP3R=null;
//Exception
    try {
      clsUTGrafoP3R=clsUTGrafo.retiraAresta(clsUTGrafoP3P1,clsUTGrafoP3P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP3R);
    int clsUTGrafoP4P1=1;
    int clsUTGrafoP4P2=-61;
    int clsUTGrafoP4P3=659;
      clsUTGrafo.insereAresta(clsUTGrafoP4P1,clsUTGrafoP4P2,clsUTGrafoP4P3);
    int clsUTGrafoP5P1=1;
    Grafo.Aresta clsUTGrafoP5R=null;
      clsUTGrafoP5R=clsUTGrafo.proxAdj(clsUTGrafoP5P1);
    int clsUTGrafoP5RP0R=0;
      clsUTGrafoP5RP0R=clsUTGrafoP5R.peso();
    assertEquals(659,clsUTGrafoP5RP0R);
    int clsUTGrafoP5RP1R=0;
      clsUTGrafoP5RP1R=clsUTGrafoP5R.peso();
    assertEquals(659,clsUTGrafoP5RP1R);
    int clsUTGrafoP6R=0;
      clsUTGrafoP6R=clsUTGrafo.numVertices();
    assertEquals(572,clsUTGrafoP6R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[897]
2)----->insereAresta[674, 240, 832], 
3)----->numVertices[], 
4)----->grafoTransposto[]
 Covered Branches:[32, 33, 1, 34, 2, 35, 3, 4, 5, 9, 10, 11, 15, 16, 17, 18, 19, 21, 23, 30, 31]
 */
  @Test public void TestCase14() throws Throwable {
    int clsUTGrafoP1P1=897;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=674;
    int clsUTGrafoP2P2=240;
    int clsUTGrafoP2P3=832;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(897,clsUTGrafoP3R);
    Grafo clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP4RP0R=0;
      clsUTGrafoP4RP0R=clsUTGrafoP4R.numVertices();
    assertEquals(897,clsUTGrafoP4RP0R);
    int clsUTGrafoP4RP1P1=-626;
    Grafo.Aresta clsUTGrafoP4RP1R=null;
//Exception
    try {
      clsUTGrafoP4RP1R=clsUTGrafoP4R.proxAdj(clsUTGrafoP4RP1P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP4RP1R);
    assertEquals(897,clsUTGrafoP4R.numVertices());
  }
}
