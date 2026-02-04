package ds.seed5838;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Grafo;
import java.util.Locale;
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
Evaluations : 24881
search time (ms): 42501
total runtime (ms): 44799
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Grafo[734]
2)----->numVertices[], 
3)----->listaAdjVazia[-421], 
4)----->grafoTransposto[], 
5)----->insereAresta[0, 74, 206], 
6)----->grafoTransposto[], 
7)----->retiraAresta[0, 28]
 Covered Branches:[1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 15, 16, 17, 18, 19, 21, 23, 24, 26, 30, 31, 32, 33, 34, 35]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTGrafoP1P1=734;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2R=0;
      clsUTGrafoP2R=clsUTGrafo.numVertices();
    assertEquals(734,clsUTGrafoP2R);
    int clsUTGrafoP3P1=-421;
    boolean clsUTGrafoP3R=false;
//Exception
    try {
      clsUTGrafoP3R=clsUTGrafo.listaAdjVazia(clsUTGrafoP3P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    Grafo clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP4RP0P1=-717;
    boolean clsUTGrafoP4RP0R=false;
//Exception
    try {
      clsUTGrafoP4RP0R=clsUTGrafoP4R.listaAdjVazia(clsUTGrafoP4RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals(734,clsUTGrafoP4R.numVertices());
    int clsUTGrafoP5P1=0;
    int clsUTGrafoP5P2=74;
    int clsUTGrafoP5P3=206;
      clsUTGrafo.insereAresta(clsUTGrafoP5P1,clsUTGrafoP5P2,clsUTGrafoP5P3);
    Grafo clsUTGrafoP6R=null;
      clsUTGrafoP6R=clsUTGrafo.grafoTransposto();
    Grafo clsUTGrafoP6RP0R=null;
      clsUTGrafoP6RP0R=clsUTGrafoP6R.grafoTransposto();
    assertEquals(734,clsUTGrafoP6RP0R.numVertices());
    Grafo clsUTGrafoP6RP1R=null;
      clsUTGrafoP6RP1R=clsUTGrafoP6R.grafoTransposto();
    assertEquals(734,clsUTGrafoP6RP1R.numVertices());
    assertEquals(734,clsUTGrafoP6R.numVertices());
    int clsUTGrafoP7P1=0;
    int clsUTGrafoP7P2=28;
    Grafo.Aresta clsUTGrafoP7R=null;
      clsUTGrafoP7R=clsUTGrafo.retiraAresta(clsUTGrafoP7P1,clsUTGrafoP7P2);
    assertNull(clsUTGrafoP7R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[651]
2)----->proxAdj[496], 
3)----->toString[], 
4)----->existeAresta[1, 680]
 Covered Branches:[21, 5, 23, 9, 10, 12, 14]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTGrafoP1P1=651;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=496;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.proxAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    String clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.intern();
    String clsUTGrafoP3RP1R=null;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.toUpperCase();
    int clsUTGrafoP4P1=1;
    int clsUTGrafoP4P2=680;
    boolean clsUTGrafoP4R=false;
      clsUTGrafoP4R=clsUTGrafo.existeAresta(clsUTGrafoP4P1,clsUTGrafoP4P2);
    assertEquals(false,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[-553, -797, -36]
2)----->v1[], 
3)----->toString[]
 Covered Branches:[1, 3]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTArestaP1P1=-553;
    int clsUTArestaP1P2=-797;
    int clsUTArestaP1P3=-36;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v1();
    assertEquals(-553,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    Locale clsUTArestaP3RP0P1=null;
      clsUTArestaP3RP0P1=(Locale)Locale.TRADITIONAL_CHINESE;
    String clsUTArestaP3RP0R=null;
      clsUTArestaP3RP0R=clsUTArestaP3R.toLowerCase(clsUTArestaP3RP0P1);
    assertEquals("",clsUTArestaP3RP0P1.getDisplayScript());
    assertEquals("zh_TW",clsUTArestaP3RP0P1.toString());
    assertEquals("",clsUTArestaP3RP0P1.getVariant());
    assertEquals(115851247,clsUTArestaP3RP0P1.hashCode());
    byte[] clsUTArestaP3RP1R=null;
      clsUTArestaP3RP1R=clsUTArestaP3R.getBytes();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[791]
2)----->existeAresta[143, 172], 
3)----->toString[]
 Covered Branches:[5, 9, 10, 12, 14]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTGrafoP1P1=791;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=143;
    int clsUTGrafoP2P2=172;
    boolean clsUTGrafoP2R=false;
      clsUTGrafoP2R=clsUTGrafo.existeAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    assertEquals(false,clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    int clsUTGrafoP3RP0P1P1=184;
    CharSequence clsUTGrafoP3RP0P1=null;
      clsUTGrafoP3RP0P1=String.valueOf(clsUTGrafoP3RP0P1P1);
    boolean clsUTGrafoP3RP0R=false;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.contains(clsUTGrafoP3RP0P1);
    assertEquals("184",clsUTGrafoP3RP0P1.toString());
    assertEquals(3,clsUTGrafoP3RP0P1.length());
    assertEquals(false,clsUTGrafoP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[804]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 16, 34, 21, 9, 10, 30, 31, 15]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTGrafoP1P1=804;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=-645;
    Grafo.Aresta clsUTGrafoP2RP0R=null;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.proxAdj(clsUTGrafoP2RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP0R);
    assertEquals(804,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(804,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[738]
2)----->insereAresta[1, -912, 138], 
3)----->listaAdjVazia[1], 
4)----->toString[], 
5)----->existeAresta[201, 338]
 Covered Branches:[17, 5, 9, 10, 11, 12, 14, 15]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTGrafoP1P1=738;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=1;
    int clsUTGrafoP2P2=-912;
    int clsUTGrafoP2P3=138;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3P1=1;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.listaAdjVazia(clsUTGrafoP3P1);
    assertEquals(false,clsUTGrafoP3R);
    String clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.toString();
    int clsUTGrafoP5P1=201;
    int clsUTGrafoP5P2=338;
    boolean clsUTGrafoP5R=false;
      clsUTGrafoP5R=clsUTGrafo.existeAresta(clsUTGrafoP5P1,clsUTGrafoP5P2);
    assertEquals(false,clsUTGrafoP5R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[874]
2)----->insereAresta[218, 714, -1], 
3)----->grafoTransposto[]
 Covered Branches:[32, 33, 1, 34, 2, 35, 3, 4, 5, 9, 10, 11, 15, 16, 17, 18, 19, 21, 23, 27, 28, 29, 31]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTGrafoP1P1=874;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=218;
    int clsUTGrafoP2P2=714;
    int clsUTGrafoP2P3=-1;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    Grafo clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP3RP0P1=237;
    Grafo.Aresta clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.proxAdj(clsUTGrafoP3RP0P1);
    assertNull(clsUTGrafoP3RP0R);
      clsUTGrafoP3R.imprime();
    assertEquals(874,clsUTGrafoP3R.numVertices());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[728]
2)----->primeiroListaAdj[593], 
3)----->listaAdjVazia[650]
 Covered Branches:[16, 18, 20, 9, 10, 15]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTGrafoP1P1=728;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=593;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.primeiroListaAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    int clsUTGrafoP3P1=650;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.listaAdjVazia(clsUTGrafoP3P1);
    assertEquals(true,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[645]
2)----->imprime[]
 Covered Branches:[9, 10, 27, 28]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTGrafoP1P1=645;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
      clsUTGrafo.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[521, -645, 346]
2)----->peso[], 
3)----->toString[]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTArestaP1P1=521;
    int clsUTArestaP1P2=-645;
    int clsUTArestaP1P3=346;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.peso();
    assertEquals(346,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[0]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[9, 27, 30, 31]
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
      clsUTGrafoP2R.imprime();
    assertEquals(0,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(0,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[-1, -526, -93]
2)----->v2[], 
3)----->toString[]
 Covered Branches:[1, 4]
 */
  @Test public void TestCase11() throws Throwable {
    int clsUTArestaP1P1=-1;
    int clsUTArestaP1P2=-526;
    int clsUTArestaP1P3=-93;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v2();
    assertEquals(-526,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[779]
2)----->listaAdjVazia[455]
 Covered Branches:[16, 9, 10, 15]
 */
  @Test public void TestCase12() throws Throwable {
    int clsUTGrafoP1P1=779;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=455;
    boolean clsUTGrafoP2R=false;
      clsUTGrafoP2R=clsUTGrafo.listaAdjVazia(clsUTGrafoP2P1);
    assertEquals(true,clsUTGrafoP2R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[764]
2)----->insereAresta[1, -727, 426], 
3)----->proxAdj[1], 
4)----->numVertices[]
 Covered Branches:[1, 4, 5, 21, 22, 9, 10, 11, 30]
 */
  @Test public void TestCase13() throws Throwable {
    int clsUTGrafoP1P1=764;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=1;
    int clsUTGrafoP2P2=-727;
    int clsUTGrafoP2P3=426;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3P1=1;
    Grafo.Aresta clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.proxAdj(clsUTGrafoP3P1);
    int clsUTGrafoP3RP0R=0;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.v2();
    assertEquals(-727,clsUTGrafoP3RP0R);
    int clsUTGrafoP4R=0;
      clsUTGrafoP4R=clsUTGrafo.numVertices();
    assertEquals(764,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[970]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[32, 16, 34, 9, 10, 30, 31, 15]
 */
  @Test public void TestCase14() throws Throwable {
    int clsUTGrafoP1P1=970;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0R=0;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.numVertices();
    assertEquals(970,clsUTGrafoP2RP0R);
    int clsUTGrafoP2RP1R=0;
      clsUTGrafoP2RP1R=clsUTGrafoP2R.numVertices();
    assertEquals(970,clsUTGrafoP2RP1R);
    assertEquals(970,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    String clsUTGrafoP3RP0P1=new String("3485672019");
    String clsUTGrafoP3RP0P2=new String("*&?cwgt{m^kp)-u57!#qn[f]e$/1.|;9v20= `8<");
    String clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.replaceAll(clsUTGrafoP3RP0P1,clsUTGrafoP3RP0P2);
    assertEquals("3485672019",clsUTGrafoP3RP0P1.toString());
    assertEquals("*&?cwgt{m^kp)-u57!#qn[f]e$/1.|;9v20= `8<",clsUTGrafoP3RP0P2.toString());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[145]
2)----->grafoTransposto[], 
3)----->numVertices[], 
4)----->toString[]
 Covered Branches:[32, 16, 34, 5, 24, 9, 10, 30, 31, 15]
 */
  @Test public void TestCase15() throws Throwable {
    int clsUTGrafoP1P1=145;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=-153;
    int clsUTGrafoP2RP0P2=53;
    Grafo.Aresta clsUTGrafoP2RP0R=null;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.retiraAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP0R);
    assertEquals(145,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(145,clsUTGrafoP3R);
    String clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.toString();
  }
}
