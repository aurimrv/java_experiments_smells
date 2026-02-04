package ds.seed5838;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import java.util.Arrays;
import ds.Grafo;
/** 
 * This class was automatically generated to test the ds.Grafo class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6, 7, 9, 10, 14, 15, 16, 17, 18, 19, 20, 21, 25, 26, 27, 29, 30, 31, 32, 33, 34, 35, 36, 37]
Uncovered branches: [22, 23, 8, 24, 11, 12, 28, 13]
Total number of branches: 37
Total number of covered branches: 29
Coverage : 78,38%
Evaluations : 80795
search time (ms): 42501
total runtime (ms): 44152
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Grafo[426]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[32, 33, 34, 36, 5, 6, 10, 14, 15]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTGrafoP1P1=426;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0R=0;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.numVertices();
    assertEquals(426,clsUTGrafoP2RP0R);
    int clsUTGrafoP2RP1P1=0;
    int clsUTGrafoP2RP1P2=537;
    boolean clsUTGrafoP2RP1R=false;
      clsUTGrafoP2RP1R=clsUTGrafoP2R.existeAresta(clsUTGrafoP2RP1P1,clsUTGrafoP2RP1P2);
    assertEquals(false,clsUTGrafoP2RP1R);
    assertEquals(426,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    int clsUTGrafoP3RP0P2=543;
    boolean clsUTGrafoP3RP0R=false;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.startsWith(clsUTGrafoP3R,clsUTGrafoP3RP0P2);
    assertEquals(false,clsUTGrafoP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[330]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[33, 34, 36, 5, 6, 7, 9, 29, 14, 30, 15, 31]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTGrafoP1P1=330;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=395;
    int clsUTGrafoP2RP0P2=567;
    int clsUTGrafoP2RP0P3=418;
      clsUTGrafoP2R.insereAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2,clsUTGrafoP2RP0P3);
      clsUTGrafoP2R.imprime();
    assertEquals(330,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[472]
2)----->retiraAresta[1, -923], 
3)----->listaAdjVazia[959], 
4)----->toString[]
 Covered Branches:[5, 21, 6, 26, 14, 15]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTGrafoP1P1=472;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=1;
    int clsUTGrafoP2P2=-923;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.retiraAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    assertNull(clsUTGrafoP2R);
    int clsUTGrafoP3P1=959;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.listaAdjVazia(clsUTGrafoP3P1);
    assertEquals(true,clsUTGrafoP3R);
    String clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[821]
2)----->numVertices[]
 Covered Branches:[32, 5, 6]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTGrafoP1P1=821;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2R=0;
      clsUTGrafoP2R=clsUTGrafo.numVertices();
    assertEquals(821,clsUTGrafoP2R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[3]
2)----->imprime[], 
3)----->listaAdjVazia[92], 
4)----->toString[]
 Covered Branches:[5, 6, 29, 30, 14, 15]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTGrafoP1P1=3;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
      clsUTGrafo.imprime();
    int clsUTGrafoP3P1=92;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.listaAdjVazia(clsUTGrafoP3P1);
    assertEquals(true,clsUTGrafoP3R);
    String clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.toString();
    boolean clsUTGrafoP4RP0R=false;
      clsUTGrafoP4RP0R=clsUTGrafoP4R.matches(clsUTGrafoP4R);
    assertEquals(true,clsUTGrafoP4RP0R);
    String clsUTGrafoP4RP1P1=new String("rudqmjfcglxntpwivk");
    String[] clsUTGrafoP4RP1R=null;
      clsUTGrafoP4RP1R=clsUTGrafoP4R.split(clsUTGrafoP4RP1P1);
    assertEquals("rudqmjfcglxntpwivk",clsUTGrafoP4RP1P1.toString());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[423]
2)----->retiraAresta[556, 0], 
3)----->toString[]
 Covered Branches:[1, 3, 4, 5, 21, 6, 25, 27]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTGrafoP1P1=423;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=556;
    int clsUTGrafoP2P2=0;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.retiraAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    int clsUTGrafoP2RP0R=0;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.v2();
    assertEquals(0,clsUTGrafoP2RP0R);
    int clsUTGrafoP2RP1R=0;
      clsUTGrafoP2RP1R=clsUTGrafoP2R.v1();
    assertEquals(556,clsUTGrafoP2RP1R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    int clsUTGrafoP3RP0R=0;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.length();
    int clsUTGrafoP3RP1P1=1;
    String clsUTGrafoP3RP1R=null;
      clsUTGrafoP3RP1R=String.valueOf(clsUTGrafoP3RP1P1);
    assertEquals("1",clsUTGrafoP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[4501]
2)----->insereAresta[3, -989, 0], 
3)----->toString[]
 Covered Branches:[5, 6, 7, 9]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTGrafoP1P1=4501;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=3;
    int clsUTGrafoP2P2=-989;
    int clsUTGrafoP2P3=0;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    char[] clsUTGrafoP3RP0P1=new char[]{'\u002f','\u0035'};
    String clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=String.valueOf(clsUTGrafoP3RP0P1);
    assertTrue(Arrays.equals(new char[]{'\u002f','\u0035'},clsUTGrafoP3RP0P1));
    assertEquals("/5",clsUTGrafoP3RP0R);
    int clsUTGrafoP3RP1P1=249;
    int clsUTGrafoP3RP1P2=67;
    int clsUTGrafoP3RP1R=0;
//Exception
    try {
      clsUTGrafoP3RP1R=clsUTGrafoP3R.offsetByCodePoints(clsUTGrafoP3RP1P1,clsUTGrafoP3RP1P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[628]
2)----->insereAresta[1, 35, -600], 
3)----->proxAdj[1], 
4)----->toString[]
 Covered Branches:[1, 18, 2, 20, 5, 6, 7, 9]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTGrafoP1P1=628;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=1;
    int clsUTGrafoP2P2=35;
    int clsUTGrafoP2P3=-600;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3P1=1;
    Grafo.Aresta clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.proxAdj(clsUTGrafoP3P1);
    int clsUTGrafoP3RP0R=0;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.peso();
    assertEquals(-600,clsUTGrafoP3RP0R);
    String clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.toString();
    String clsUTGrafoP4RP0R=null;
      clsUTGrafoP4RP0R=clsUTGrafoP4R.intern();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[982]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 33, 1, 34, 2, 35, 3, 36, 4, 5, 37, 6, 7, 9, 14, 15, 16, 17, 18, 20]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTGrafoP1P1=982;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=0;
    int clsUTGrafoP2RP0P2=-905;
    int clsUTGrafoP2RP0P3=1;
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
    assertEquals(982,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(982,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[-1, 0, 64]
2)----->peso[], 
3)----->toString[]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTArestaP1P1=-1;
    int clsUTArestaP1P2=0;
    int clsUTArestaP1P3=64;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.peso();
    assertEquals(64,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[3]
2)----->insereAresta[0, 868, 0], 
3)----->toString[], 
4)----->listaAdjVazia[0]
 Covered Branches:[16, 5, 6, 7, 9, 14]
 */
  @Test public void TestCase10() throws Throwable {
    int clsUTGrafoP1P1=3;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=0;
    int clsUTGrafoP2P2=868;
    int clsUTGrafoP2P3=0;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    String clsUTGrafoP3RP0P1=new String(")");
    int clsUTGrafoP3RP0R=0;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.compareToIgnoreCase(clsUTGrafoP3RP0P1);
    assertEquals(")",clsUTGrafoP3RP0P1.toString());
    assertEquals(59,clsUTGrafoP3RP0R);
    int clsUTGrafoP4P1=0;
    boolean clsUTGrafoP4R=false;
      clsUTGrafoP4R=clsUTGrafo.listaAdjVazia(clsUTGrafoP4P1);
    assertEquals(false,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[876]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 33, 17, 34, 18, 19, 36, 5, 6, 14, 15]
 */
  @Test public void TestCase11() throws Throwable {
    int clsUTGrafoP1P1=876;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0R=0;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.numVertices();
    assertEquals(876,clsUTGrafoP2RP0R);
    int clsUTGrafoP2RP1P1=864;
    Grafo.Aresta clsUTGrafoP2RP1R=null;
      clsUTGrafoP2RP1R=clsUTGrafoP2R.primeiroListaAdj(clsUTGrafoP2RP1P1);
    assertNull(clsUTGrafoP2RP1R);
    assertEquals(876,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(876,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[-122, 4499, 600]
2)----->v2[], 
3)----->toString[]
 Covered Branches:[1, 4]
 */
  @Test public void TestCase12() throws Throwable {
    int clsUTArestaP1P1=-122;
    int clsUTArestaP1P2=4499;
    int clsUTArestaP1P3=600;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v2();
    assertEquals(4499,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[0, 127, -990]
2)----->v1[], 
3)----->toString[]
 Covered Branches:[1, 3]
 */
  @Test public void TestCase13() throws Throwable {
    int clsUTArestaP1P1=0;
    int clsUTArestaP1P2=127;
    int clsUTArestaP1P3=-990;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v1();
    assertEquals(0,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    float clsUTArestaP3RP0P1=-66.78122F;
    String clsUTArestaP3RP0R=null;
      clsUTArestaP3RP0R=String.valueOf(clsUTArestaP3RP0P1);
    assertEquals("-66.78122",clsUTArestaP3RP0R);
  }
}
