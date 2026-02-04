package ds.seed9006;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Grafo;
/** 
 * This class was automatically generated to test the ds.Grafo class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 27, 28, 29, 30, 31, 32, 33, 34, 35]
Uncovered branches: [7, 25, 26, 13]
Total number of branches: 35
Total number of covered branches: 31
Coverage : 88,57%
Evaluations : 85232
search time (ms): 42501
total runtime (ms): 44208
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->numVertices[], 
3)----->insereAresta[0, -719, 1], 
4)----->imprime[]
 Covered Branches:[5, 9, 10, 11, 27, 28, 29, 30]
 */
  @Test public void TestCase0() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2R=0;
      clsUTGrafoP2R=clsUTGrafo.numVertices();
    assertEquals(100,clsUTGrafoP2R);
    int clsUTGrafoP3P1=0;
    int clsUTGrafoP3P2=-719;
    int clsUTGrafoP3P3=1;
      clsUTGrafo.insereAresta(clsUTGrafoP3P1,clsUTGrafoP3P2,clsUTGrafoP3P3);
      clsUTGrafo.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[104, 738, 779]
2)----->v1[], 
3)----->toString[]
 Covered Branches:[1, 3]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTArestaP1P1=104;
    int clsUTArestaP1P2=738;
    int clsUTArestaP1P3=779;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v1();
    assertEquals(104,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    char[] clsUTArestaP3RP0P1P1=new char[]{'\u0078','\u2a05'};
    CharSequence clsUTArestaP3RP0P1=null;
      clsUTArestaP3RP0P1=new String(clsUTArestaP3RP0P1P1);
    boolean clsUTArestaP3RP0R=false;
      clsUTArestaP3RP0R=clsUTArestaP3R.contains(clsUTArestaP3RP0P1);
    assertEquals("x⨅",clsUTArestaP3RP0P1.toString());
    assertEquals(2,clsUTArestaP3RP0P1.length());
    assertEquals(false,clsUTArestaP3RP0R);
    String clsUTArestaP3RP1P1=new String(":");
    int clsUTArestaP3RP1R=0;
      clsUTArestaP3RP1R=clsUTArestaP3R.compareToIgnoreCase(clsUTArestaP3RP1P1);
    assertEquals(":",clsUTArestaP3RP1P1.toString());
    assertEquals(42,clsUTArestaP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[-959, 557, -589]
2)----->peso[], 
3)----->toString[]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTArestaP1P1=-959;
    int clsUTArestaP1P2=557;
    int clsUTArestaP1P3=-589;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.peso();
    assertEquals(-589,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    int clsUTArestaP3RP0P1=553;
    int clsUTArestaP3RP0R=0;
//Exception
    try {
      clsUTArestaP3RP0R=clsUTArestaP3R.codePointBefore(clsUTArestaP3RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->primeiroListaAdj[1], 
3)----->listaAdjVazia[56], 
4)----->toString[]
 Covered Branches:[16, 18, 20, 9, 10, 15]
 */
  @Test public void TestCase3() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2P1=1;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.primeiroListaAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    int clsUTGrafoP3P1=56;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.listaAdjVazia(clsUTGrafoP3P1);
    assertEquals(true,clsUTGrafoP3R);
    String clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.toString();
    int clsUTGrafoP4RP0P1=0;
    int clsUTGrafoP4RP0P2=101;
    String clsUTGrafoP4RP0R=null;
//Exception
    try {
      clsUTGrafoP4RP0R=clsUTGrafoP4R.substring(clsUTGrafoP4RP0P1,clsUTGrafoP4RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP4RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->existeAresta[1, 198], 
3)----->toString[]
 Covered Branches:[5, 9, 10, 12, 14]
 */
  @Test public void TestCase4() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2P1=1;
    int clsUTGrafoP2P2=198;
    boolean clsUTGrafoP2R=false;
      clsUTGrafoP2R=clsUTGrafo.existeAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    assertEquals(false,clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    int clsUTGrafoP3RP0R=0;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.hashCode();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[-501, -1, -778]
2)----->v2[], 
3)----->peso[], 
4)----->peso[]
 Covered Branches:[1, 2, 4]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTArestaP1P1=-501;
    int clsUTArestaP1P2=-1;
    int clsUTArestaP1P3=-778;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v2();
    assertEquals(-1,clsUTArestaP2R);
    int clsUTArestaP3R=0;
      clsUTArestaP3R=clsUTAresta.peso();
    assertEquals(-778,clsUTArestaP3R);
    int clsUTArestaP4R=0;
      clsUTArestaP4R=clsUTAresta.peso();
    assertEquals(-778,clsUTArestaP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->insereAresta[0, 165, 239], 
3)----->existeAresta[0, -101]
 Covered Branches:[5, 6, 8, 9, 10, 11, 12, 14]
 */
  @Test public void TestCase6() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2P1=0;
    int clsUTGrafoP2P2=165;
    int clsUTGrafoP2P3=239;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3P1=0;
    int clsUTGrafoP3P2=-101;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.existeAresta(clsUTGrafoP3P1,clsUTGrafoP3P2);
    assertEquals(false,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->listaAdjVazia[2], 
3)----->numVertices[], 
4)----->numVertices[]
 Covered Branches:[16, 9, 10, 30, 15]
 */
  @Test public void TestCase7() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2P1=2;
    boolean clsUTGrafoP2R=false;
      clsUTGrafoP2R=clsUTGrafo.listaAdjVazia(clsUTGrafoP2P1);
    assertEquals(true,clsUTGrafoP2R);
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(100,clsUTGrafoP3R);
    int clsUTGrafoP4R=0;
      clsUTGrafoP4R=clsUTGrafo.numVertices();
    assertEquals(100,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[], 
3)----->toString[], 
4)----->numVertices[]
 Covered Branches:[32, 16, 34, 5, 24, 9, 10, 30, 31, 15]
 */
  @Test public void TestCase8() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=741;
    int clsUTGrafoP2RP0P2=934;
    Grafo.Aresta clsUTGrafoP2RP0R=null;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.retiraAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP0R);
    assertEquals(100,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    int clsUTGrafoP3RP0P1=0;
    int clsUTGrafoP3RP0R=0;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.codePointAt(clsUTGrafoP3RP0P1);
    assertEquals(100,clsUTGrafoP3RP0R);
    int clsUTGrafoP3RP1P1=899;
    int clsUTGrafoP3RP1P2=7;
    CharSequence clsUTGrafoP3RP1R=null;
//Exception
    try {
      clsUTGrafoP3RP1R=clsUTGrafoP3R.subSequence(clsUTGrafoP3RP1P1,clsUTGrafoP3RP1P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP3RP1R);
    int clsUTGrafoP4R=0;
      clsUTGrafoP4R=clsUTGrafo.numVertices();
    assertEquals(100,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[], 
3)----->toString[], 
4)----->numVertices[]
 Covered Branches:[32, 16, 34, 21, 23, 9, 10, 30, 31, 15]
 */
  @Test public void TestCase9() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=52;
    Grafo.Aresta clsUTGrafoP2RP0R=null;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.proxAdj(clsUTGrafoP2RP0P1);
    assertNull(clsUTGrafoP2RP0R);
    assertEquals(100,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    int clsUTGrafoP4R=0;
      clsUTGrafoP4R=clsUTGrafo.numVertices();
    assertEquals(100,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->imprime[], 
3)----->numVertices[], 
4)----->toString[]
 Covered Branches:[9, 10, 27, 28, 30]
 */
  @Test public void TestCase10() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
      clsUTGrafo.imprime();
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(100,clsUTGrafoP3R);
    String clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->imprime[], 
3)----->grafoTransposto[], 
4)----->numVertices[]
 Covered Branches:[32, 16, 34, 5, 9, 10, 27, 11, 28, 30, 31, 15]
 */
  @Test public void TestCase11() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
      clsUTGrafo.imprime();
    Grafo clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP3RP0P1=-585;
    int clsUTGrafoP3RP0P2=-800;
    int clsUTGrafoP3RP0P3=0;
//Exception
    try {
      clsUTGrafoP3R.insereAresta(clsUTGrafoP3RP0P1,clsUTGrafoP3RP0P2,clsUTGrafoP3RP0P3);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    int clsUTGrafoP3RP1P1=-79;
    boolean clsUTGrafoP3RP1R=false;
//Exception
    try {
      clsUTGrafoP3RP1R=clsUTGrafoP3R.listaAdjVazia(clsUTGrafoP3RP1P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals(100,clsUTGrafoP3R.numVertices());
    int clsUTGrafoP4R=0;
      clsUTGrafoP4R=clsUTGrafo.numVertices();
    assertEquals(100,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[], 
3)----->toString[], 
4)----->numVertices[]
 Covered Branches:[32, 33, 1, 34, 2, 35, 3, 4, 5, 9, 10, 11, 15, 16, 17, 18, 19, 30, 31]
 */
  @Test public void TestCase12() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=1;
    int clsUTGrafoP2RP0P2=615;
    int clsUTGrafoP2RP0P3=0;
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
    assertEquals(100,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    String clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.toUpperCase();
    String clsUTGrafoP3RP1P1=new String("95LUgJaJqgsoXggCXuR1Bf5mB5vx6skVRR0auM9Om93hO3vutb3wOpita8eLShixt9g9edo38O7oxOIEgP1R8zuYWd2I3iy1jeDRllDiNmsz0rDi0miYupUCYt5uoyKJtizpY4JUI7Nio1IEl2OfpjEtUIcDufpmsgqHy5SOC7QHp11Gd5NlsfrjkmXls6MKNtEuDPX15fQNuOcLl71AWLC");
    boolean clsUTGrafoP3RP1R=false;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.matches(clsUTGrafoP3RP1P1);
    assertEquals("95LUgJaJqgsoXggCXuR1Bf5mB5vx6skVRR0auM9Om93hO3vutb3wOpita8eLShixt9g9edo38O7oxOIEgP1R8zuYWd2I3iy1jeDRllDiNmsz0rDi0miYupUCYt5uoyKJtizpY4JUI7Nio1IEl2OfpjEtUIcDufpmsgqHy5SOC7QHp11Gd5NlsfrjkmXls6MKNtEuDPX15fQNuOcLl71AWLC",clsUTGrafoP3RP1P1.toString());
    assertEquals(false,clsUTGrafoP3RP1R);
    int clsUTGrafoP4R=0;
      clsUTGrafoP4R=clsUTGrafo.numVertices();
    assertEquals(100,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->insereAresta[1, -1, -73], 
3)----->proxAdj[1]
 Covered Branches:[1, 5, 21, 22, 9, 10, 11]
 */
  @Test public void TestCase13() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2P1=1;
    int clsUTGrafoP2P2=-1;
    int clsUTGrafoP2P3=-73;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3P1=1;
    Grafo.Aresta clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.proxAdj(clsUTGrafoP3P1);
  }
}
