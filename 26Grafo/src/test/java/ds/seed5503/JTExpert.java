package ds.seed5503;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Grafo;
/** 
 * This class was automatically generated to test the ds.Grafo class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6, 7, 9, 10, 14, 15, 16, 17, 18, 19, 20, 21, 25, 26, 27, 29, 30, 32, 33, 34, 35, 36, 37]
Uncovered branches: [22, 23, 8, 24, 11, 12, 28, 13, 31]
Total number of branches: 37
Total number of covered branches: 28
Coverage : 75,68%
Evaluations : 46242
search time (ms): 42502
total runtime (ms): 44182
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Grafo[922]
2)----->proxAdj[82], 
3)----->toString[], 
4)----->proxAdj[721], 
5)----->listaAdjVazia[168]
 Covered Branches:[18, 19, 5, 6, 14, 15]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTGrafoP1P1=922;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=82;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.proxAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    int clsUTGrafoP3RP0R=0;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.hashCode();
    String clsUTGrafoP3RP1P1=new String("fygju71kp26eimwovn905rxqhls4tcbad38z");
    int clsUTGrafoP3RP1P2=-939;
    int clsUTGrafoP3RP1R=0;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.lastIndexOf(clsUTGrafoP3RP1P1,clsUTGrafoP3RP1P2);
    assertEquals("fygju71kp26eimwovn905rxqhls4tcbad38z",clsUTGrafoP3RP1P1.toString());
    assertEquals(-1,clsUTGrafoP3RP1R);
    int clsUTGrafoP4P1=721;
    Grafo.Aresta clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.proxAdj(clsUTGrafoP4P1);
    assertNull(clsUTGrafoP4R);
    int clsUTGrafoP5P1=168;
    boolean clsUTGrafoP5R=false;
      clsUTGrafoP5R=clsUTGrafo.listaAdjVazia(clsUTGrafoP5P1);
    assertEquals(true,clsUTGrafoP5R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[985]
2)----->existeAresta[1, 686], 
3)----->listaAdjVazia[0], 
4)----->toString[]
 Covered Branches:[5, 6, 10, 14, 15]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTGrafoP1P1=985;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=1;
    int clsUTGrafoP2P2=686;
    boolean clsUTGrafoP2R=false;
      clsUTGrafoP2R=clsUTGrafo.existeAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    assertEquals(false,clsUTGrafoP2R);
    int clsUTGrafoP3P1=0;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.listaAdjVazia(clsUTGrafoP3P1);
    assertEquals(true,clsUTGrafoP3R);
    String clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.toString();
    String clsUTGrafoP4RP0P1=new String("TCJ]dbFQpl");
    boolean clsUTGrafoP4RP0R=false;
      clsUTGrafoP4RP0R=clsUTGrafoP4R.endsWith(clsUTGrafoP4RP0P1);
    assertEquals("TCJ]dbFQpl",clsUTGrafoP4RP0P1.toString());
    assertEquals(false,clsUTGrafoP4RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[-613, 1, -1]
2)----->v2[], 
3)----->toString[]
 Covered Branches:[1, 4]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTArestaP1P1=-613;
    int clsUTArestaP1P2=1;
    int clsUTArestaP1P3=-1;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v2();
    assertEquals(1,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    String clsUTArestaP3RP0R=null;
      clsUTArestaP3RP0R=clsUTArestaP3R.intern();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[86]
2)----->insereAresta[743, -219, -829], 
3)----->proxAdj[0], 
4)----->toString[]
 Covered Branches:[1, 18, 20, 4, 5, 6, 7, 9]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTGrafoP1P1=86;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=743;
    int clsUTGrafoP2P2=-219;
    int clsUTGrafoP2P3=-829;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3P1=0;
    Grafo.Aresta clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.proxAdj(clsUTGrafoP3P1);
    int clsUTGrafoP3RP0R=0;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.v2();
    assertEquals(-219,clsUTGrafoP3RP0R);
    String clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[435]
2)----->imprime[], 
3)----->proxAdj[204]
 Covered Branches:[18, 19, 5, 6, 29, 30]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTGrafoP1P1=435;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
      clsUTGrafo.imprime();
    int clsUTGrafoP3P1=204;
    Grafo.Aresta clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.proxAdj(clsUTGrafoP3P1);
    assertNull(clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[1]
2)----->retiraAresta[503, 0], 
3)----->toString[]
 Covered Branches:[1, 5, 21, 6, 25, 27]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTGrafoP1P1=1;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=503;
    int clsUTGrafoP2P2=0;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.retiraAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[878]
2)----->primeiroListaAdj[500], 
3)----->toString[]
 Covered Branches:[17, 18, 19, 5, 6]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTGrafoP1P1=878;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=500;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.primeiroListaAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    char clsUTGrafoP3RP0P1='\u005b';
    char clsUTGrafoP3RP0P2='\u38f0';
    String clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.replace(clsUTGrafoP3RP0P1,clsUTGrafoP3RP0P2);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[918]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 33, 34, 36, 5, 6, 14, 15]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTGrafoP1P1=918;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    assertEquals(918,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(918,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[67]
2)----->insereAresta[889, 576, 148], 
3)----->toString[]
 Covered Branches:[5, 6, 7, 9]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTGrafoP1P1=67;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=889;
    int clsUTGrafoP2P2=576;
    int clsUTGrafoP2P3=148;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    char clsUTGrafoP3RP0P1='\u0078';
    char clsUTGrafoP3RP0P2='\u006e';
    String clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.replace(clsUTGrafoP3RP0P1,clsUTGrafoP3RP0P2);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[-238, -924, 590]
2)----->peso[], 
3)----->v1[], 
4)----->peso[]
 Covered Branches:[1, 2, 3]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTArestaP1P1=-238;
    int clsUTArestaP1P2=-924;
    int clsUTArestaP1P3=590;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.peso();
    assertEquals(590,clsUTArestaP2R);
    int clsUTArestaP3R=0;
      clsUTArestaP3R=clsUTAresta.v1();
    assertEquals(-238,clsUTArestaP3R);
    int clsUTArestaP4R=0;
      clsUTArestaP4R=clsUTAresta.peso();
    assertEquals(590,clsUTArestaP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[815]
2)----->retiraAresta[34, -733], 
3)----->toString[]
 Covered Branches:[5, 21, 6, 26]
 */
  @Test public void TestCase10() throws Throwable {
    int clsUTGrafoP1P1=815;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=34;
    int clsUTGrafoP2P2=-733;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.retiraAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    assertNull(clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    String clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.intern();
    String clsUTGrafoP3RP1R=null;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.intern();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[4501]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[33, 34, 36, 5, 6, 14, 15]
 */
  @Test public void TestCase11() throws Throwable {
    int clsUTGrafoP1P1=4501;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    assertEquals(4501,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[309]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 33, 1, 34, 2, 35, 3, 36, 4, 5, 37, 6, 7, 9, 14, 15, 16, 17, 18, 20]
 */
  @Test public void TestCase12() throws Throwable {
    int clsUTGrafoP1P1=309;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=754;
    int clsUTGrafoP2RP0P2=-934;
    int clsUTGrafoP2RP0P3=238;
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
    assertEquals(309,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(309,clsUTGrafoP3R);
  }
}
