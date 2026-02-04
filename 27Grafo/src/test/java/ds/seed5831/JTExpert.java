package ds.seed5831;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Grafo;
import java.util.Locale;
/** 
 * This class was automatically generated to test the ds.Grafo class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20, 21, 23, 24, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35]
Uncovered branches: [22, 7, 25, 13]
Total number of branches: 35
Total number of covered branches: 31
Coverage : 88,57%
Evaluations : 27311
search time (ms): 42503
total runtime (ms): 44765
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Grafo[953]
2)----->numVertices[], 
3)----->primeiroListaAdj[613], 
4)----->numVertices[]
 Covered Branches:[18, 20, 9, 10, 30]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTGrafoP1P1=953;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2R=0;
      clsUTGrafoP2R=clsUTGrafo.numVertices();
    assertEquals(953,clsUTGrafoP2R);
    int clsUTGrafoP3P1=613;
    Grafo.Aresta clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.primeiroListaAdj(clsUTGrafoP3P1);
    assertNull(clsUTGrafoP3R);
    int clsUTGrafoP4R=0;
      clsUTGrafoP4R=clsUTGrafo.numVertices();
    assertEquals(953,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[356]
2)----->existeAresta[-56, 286], 
3)----->insereAresta[1, -729, -683], 
4)----->retiraAresta[1, -1]
 Covered Branches:[5, 6, 24, 8, 9, 10, 26, 11, 12]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTGrafoP1P1=356;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=-56;
    int clsUTGrafoP2P2=286;
    boolean clsUTGrafoP2R=false;
//Exception
    try {
      clsUTGrafoP2R=clsUTGrafo.existeAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    int clsUTGrafoP3P1=1;
    int clsUTGrafoP3P2=-729;
    int clsUTGrafoP3P3=-683;
      clsUTGrafo.insereAresta(clsUTGrafoP3P1,clsUTGrafoP3P2,clsUTGrafoP3P3);
    int clsUTGrafoP4P1=1;
    int clsUTGrafoP4P2=-1;
    Grafo.Aresta clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.retiraAresta(clsUTGrafoP4P1,clsUTGrafoP4P2);
    assertNull(clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[719]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 16, 17, 34, 5, 9, 10, 11, 30, 31, 15]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTGrafoP1P1=719;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=0;
    int clsUTGrafoP2RP0P2=-444;
    int clsUTGrafoP2RP0P3=0;
      clsUTGrafoP2R.insereAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2,clsUTGrafoP2RP0P3);
    int clsUTGrafoP2RP1P1=0;
    boolean clsUTGrafoP2RP1R=false;
      clsUTGrafoP2RP1R=clsUTGrafoP2R.listaAdjVazia(clsUTGrafoP2RP1P1);
    assertEquals(false,clsUTGrafoP2RP1R);
    assertEquals(719,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(719,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[898]
2)----->insereAresta[52, 234, -591], 
3)----->proxAdj[321], 
4)----->grafoTransposto[]
 Covered Branches:[32, 33, 1, 34, 2, 35, 3, 4, 5, 9, 10, 11, 15, 16, 17, 18, 19, 21, 23, 27, 28, 29, 31]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTGrafoP1P1=898;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=52;
    int clsUTGrafoP2P2=234;
    int clsUTGrafoP2P3=-591;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3P1=321;
    Grafo.Aresta clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.proxAdj(clsUTGrafoP3P1);
    assertNull(clsUTGrafoP3R);
    Grafo clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.grafoTransposto();
      clsUTGrafoP4R.imprime();
      clsUTGrafoP4R.imprime();
    assertEquals(898,clsUTGrafoP4R.numVertices());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[732]
2)----->numVertices[], 
3)----->grafoTransposto[], 
4)----->imprime[]
 Covered Branches:[32, 16, 34, 5, 24, 9, 10, 27, 28, 30, 31, 15]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTGrafoP1P1=732;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2R=0;
      clsUTGrafoP2R=clsUTGrafo.numVertices();
    assertEquals(732,clsUTGrafoP2R);
    Grafo clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP3RP0P1=-118;
    int clsUTGrafoP3RP0P2=313;
    Grafo.Aresta clsUTGrafoP3RP0R=null;
//Exception
    try {
      clsUTGrafoP3RP0R=clsUTGrafoP3R.retiraAresta(clsUTGrafoP3RP0P1,clsUTGrafoP3RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP3RP0R);
    int clsUTGrafoP3RP1R=0;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.numVertices();
    assertEquals(732,clsUTGrafoP3RP1R);
    assertEquals(732,clsUTGrafoP3R.numVertices());
      clsUTGrafo.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[896]
2)----->imprime[]
 Covered Branches:[9, 10, 27, 28]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTGrafoP1P1=896;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
      clsUTGrafo.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[944, 853, -417]
2)----->v1[], 
3)----->toString[]
 Covered Branches:[1, 3]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTArestaP1P1=944;
    int clsUTArestaP1P2=853;
    int clsUTArestaP1P3=-417;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v1();
    assertEquals(944,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    String clsUTArestaP3RP0R=null;
      clsUTArestaP3RP0R=clsUTArestaP3R.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[816]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[32, 16, 34, 5, 9, 10, 12, 14, 31, 15]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTGrafoP1P1=816;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=227;
    int clsUTGrafoP2RP0P2=-999;
    boolean clsUTGrafoP2RP0R=false;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.existeAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2);
    assertEquals(false,clsUTGrafoP2RP0R);
    assertEquals(816,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[-404, 0, -464]
2)----->v2[], 
3)----->peso[]
 Covered Branches:[1, 2, 4]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTArestaP1P1=-404;
    int clsUTArestaP1P2=0;
    int clsUTArestaP1P3=-464;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v2();
    assertEquals(0,clsUTArestaP2R);
    int clsUTArestaP3R=0;
      clsUTArestaP3R=clsUTAresta.peso();
    assertEquals(-464,clsUTArestaP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[165]
2)----->insereAresta[137, -26, 909], 
3)----->imprime[]
 Covered Branches:[5, 9, 10, 11, 27, 28, 29]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTGrafoP1P1=165;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=137;
    int clsUTGrafoP2P2=-26;
    int clsUTGrafoP2P3=909;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
      clsUTGrafo.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[202]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 16, 34, 9, 10, 30, 31, 15]
 */
  @Test public void TestCase10() throws Throwable {
    int clsUTGrafoP1P1=202;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    assertEquals(202,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(202,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[306]
2)----->proxAdj[19], 
3)----->existeAresta[0, -318], 
4)----->listaAdjVazia[119]
 Covered Branches:[16, 21, 5, 23, 9, 10, 12, 14, 15]
 */
  @Test public void TestCase11() throws Throwable {
    int clsUTGrafoP1P1=306;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=19;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.proxAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    int clsUTGrafoP3P1=0;
    int clsUTGrafoP3P2=-318;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.existeAresta(clsUTGrafoP3P1,clsUTGrafoP3P2);
    assertEquals(false,clsUTGrafoP3R);
    int clsUTGrafoP4P1=119;
    boolean clsUTGrafoP4R=false;
      clsUTGrafoP4R=clsUTGrafo.listaAdjVazia(clsUTGrafoP4P1);
    assertEquals(true,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[536]
2)----->insereAresta[309, -524, 182], 
3)----->toString[]
 Covered Branches:[5, 9, 10, 11]
 */
  @Test public void TestCase12() throws Throwable {
    int clsUTGrafoP1P1=536;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=309;
    int clsUTGrafoP2P2=-524;
    int clsUTGrafoP2P3=182;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    String clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.trim();
    Locale clsUTGrafoP3RP1P1=null;
      clsUTGrafoP3RP1P1=(Locale)Locale.KOREAN;
    String clsUTGrafoP3RP1R=null;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.toUpperCase(clsUTGrafoP3RP1P1);
    assertEquals("ko",clsUTGrafoP3RP1P1.getLanguage());
    assertEquals("",clsUTGrafoP3RP1P1.getVariant());
    assertEquals("",clsUTGrafoP3RP1P1.getCountry());
    assertEquals(102123548,clsUTGrafoP3RP1P1.hashCode());
  }
}
