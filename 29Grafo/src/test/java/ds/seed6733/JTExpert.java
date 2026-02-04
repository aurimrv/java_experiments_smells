package ds.seed6733;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Grafo;
import java.util.Arrays;
/** 
 * This class was automatically generated to test the ds.Grafo class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20, 21, 23, 24, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35]
Uncovered branches: [22, 7, 25, 13]
Total number of branches: 35
Total number of covered branches: 31
Coverage : 88,57%
Evaluations : 29118
search time (ms): 42507
total runtime (ms): 44573
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[874, 191, 992]
2)----->v1[], 
3)----->toString[]
 Covered Branches:[1, 3]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTArestaP1P1=874;
    int clsUTArestaP1P2=191;
    int clsUTArestaP1P3=992;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v1();
    assertEquals(874,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[442]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 16, 34, 5, 24, 9, 10, 27, 28, 30, 31, 15]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTGrafoP1P1=442;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=-851;
    int clsUTGrafoP2RP0P2=679;
    Grafo.Aresta clsUTGrafoP2RP0R=null;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.retiraAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP0R);
      clsUTGrafoP2R.imprime();
    assertEquals(442,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(442,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[592]
2)----->grafoTransposto[], 
3)----->numVertices[], 
4)----->toString[]
 Covered Branches:[32, 16, 34, 9, 10, 30, 31, 15]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTGrafoP1P1=592;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    Grafo clsUTGrafoP2RP0R=null;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.grafoTransposto();
    assertEquals(592,clsUTGrafoP2RP0R.numVertices());
    assertEquals(592,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(592,clsUTGrafoP3R);
    String clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.toString();
    int clsUTGrafoP4RP0P1=-761;
    int clsUTGrafoP4RP0R=0;
      clsUTGrafoP4RP0R=clsUTGrafoP4R.indexOf(clsUTGrafoP4RP0P1);
    assertEquals(-1,clsUTGrafoP4RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[752]
2)----->imprime[], 
3)----->existeAresta[237, 795], 
4)----->toString[]
 Covered Branches:[5, 9, 10, 27, 28, 12, 14]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTGrafoP1P1=752;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
      clsUTGrafo.imprime();
    int clsUTGrafoP3P1=237;
    int clsUTGrafoP3P2=795;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.existeAresta(clsUTGrafoP3P1,clsUTGrafoP3P2);
    assertEquals(false,clsUTGrafoP3R);
    String clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.toString();
    int clsUTGrafoP4RP0P1=361;
    int clsUTGrafoP4RP0R=0;
      clsUTGrafoP4RP0R=clsUTGrafoP4R.lastIndexOf(clsUTGrafoP4RP0P1);
    assertEquals(-1,clsUTGrafoP4RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[685]
2)----->primeiroListaAdj[293]
 Covered Branches:[18, 20, 9, 10]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTGrafoP1P1=685;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=293;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.primeiroListaAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[-370, -525, 191]
2)----->peso[], 
3)----->toString[]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTArestaP1P1=-370;
    int clsUTArestaP1P2=-525;
    int clsUTArestaP1P3=191;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.peso();
    assertEquals(191,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    String clsUTArestaP3RP0P1=new String("5.3=Qhi;FGdSMK0rD[*#&6Nz-x!%b9]_q2LtR7T1");
    int clsUTArestaP3RP0R=0;
      clsUTArestaP3RP0R=clsUTArestaP3R.indexOf(clsUTArestaP3RP0P1);
    assertEquals("5.3=Qhi;FGdSMK0rD[*#&6Nz-x!%b9]_q2LtR7T1",clsUTArestaP3RP0P1.toString());
    assertEquals(-1,clsUTArestaP3RP0R);
    int clsUTArestaP3RP1R=0;
      clsUTArestaP3RP1R=clsUTArestaP3R.hashCode();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[47]
2)----->insereAresta[0, 796, -831], 
3)----->existeAresta[0, 375], 
4)----->imprime[]
 Covered Branches:[5, 6, 8, 9, 10, 11, 27, 12, 28, 29, 14]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTGrafoP1P1=47;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=0;
    int clsUTGrafoP2P2=796;
    int clsUTGrafoP2P3=-831;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3P1=0;
    int clsUTGrafoP3P2=375;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.existeAresta(clsUTGrafoP3P1,clsUTGrafoP3P2);
    assertEquals(false,clsUTGrafoP3R);
      clsUTGrafo.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[598]
2)----->proxAdj[0], 
3)----->toString[]
 Covered Branches:[21, 23, 9, 10]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTGrafoP1P1=598;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=0;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.proxAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    char[] clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.toCharArray();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[-508, 192, -958]
2)----->v2[], 
3)----->toString[]
 Covered Branches:[1, 4]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTArestaP1P1=-508;
    int clsUTArestaP1P2=192;
    int clsUTArestaP1P3=-958;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v2();
    assertEquals(192,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[803]
2)----->insereAresta[0, 429, -749], 
3)----->retiraAresta[0, -875], 
4)----->imprime[], 
5)----->grafoTransposto[], 
6)----->grafoTransposto[], 
7)----->listaAdjVazia[537]
 Covered Branches:[1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 15, 16, 17, 18, 19, 20, 21, 23, 24, 26, 27, 28, 29, 31, 32, 33, 34, 35]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTGrafoP1P1=803;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=0;
    int clsUTGrafoP2P2=429;
    int clsUTGrafoP2P3=-749;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3P1=0;
    int clsUTGrafoP3P2=-875;
    Grafo.Aresta clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.retiraAresta(clsUTGrafoP3P1,clsUTGrafoP3P2);
    assertNull(clsUTGrafoP3R);
      clsUTGrafo.imprime();
    Grafo clsUTGrafoP5R=null;
      clsUTGrafoP5R=clsUTGrafo.grafoTransposto();
    assertEquals(803,clsUTGrafoP5R.numVertices());
    Grafo clsUTGrafoP6R=null;
      clsUTGrafoP6R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP6RP0P1=669;
    Grafo.Aresta clsUTGrafoP6RP0R=null;
      clsUTGrafoP6RP0R=clsUTGrafoP6R.primeiroListaAdj(clsUTGrafoP6RP0P1);
    assertNull(clsUTGrafoP6RP0R);
    int clsUTGrafoP6RP1P1=1;
    Grafo.Aresta clsUTGrafoP6RP1R=null;
      clsUTGrafoP6RP1R=clsUTGrafoP6R.proxAdj(clsUTGrafoP6RP1P1);
    assertNull(clsUTGrafoP6RP1R);
    assertEquals(803,clsUTGrafoP6R.numVertices());
    int clsUTGrafoP7P1=537;
    boolean clsUTGrafoP7R=false;
      clsUTGrafoP7R=clsUTGrafo.listaAdjVazia(clsUTGrafoP7P1);
    assertEquals(true,clsUTGrafoP7R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[492]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[32, 16, 34, 5, 9, 10, 11, 27, 28, 29, 31, 15]
 */
  @Test public void TestCase10() throws Throwable {
    int clsUTGrafoP1P1=492;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=0;
    int clsUTGrafoP2RP0P2=776;
    int clsUTGrafoP2RP0P3=1;
      clsUTGrafoP2R.insereAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2,clsUTGrafoP2RP0P3);
      clsUTGrafoP2R.imprime();
    assertEquals(492,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    String clsUTGrafoP3RP0P1=new String("28LblffATa");
    String[] clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.split(clsUTGrafoP3RP0P1);
    assertEquals("28LblffATa",clsUTGrafoP3RP0P1.toString());
    int clsUTGrafoP3RP1P1=455;
    int clsUTGrafoP3RP1P2=818;
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
1)----->ds.Grafo[16]
2)----->grafoTransposto[]
 Covered Branches:[32, 16, 34, 5, 9, 10, 27, 11, 28, 31, 15]
 */
  @Test public void TestCase11() throws Throwable {
    int clsUTGrafoP1P1=16;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
      clsUTGrafoP2R.imprime();
    int clsUTGrafoP2RP1P1=-1;
    int clsUTGrafoP2RP1P2=-1;
    int clsUTGrafoP2RP1P3=131;
//Exception
    try {
      clsUTGrafoP2R.insereAresta(clsUTGrafoP2RP1P1,clsUTGrafoP2RP1P2,clsUTGrafoP2RP1P3);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals(16,clsUTGrafoP2R.numVertices());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[810]
2)----->grafoTransposto[], 
3)----->insereAresta[676, 523, 0], 
4)----->grafoTransposto[]
 Covered Branches:[32, 33, 1, 34, 2, 35, 3, 4, 5, 9, 10, 11, 15, 16, 17, 18, 19, 21, 23, 31]
 */
  @Test public void TestCase12() throws Throwable {
    int clsUTGrafoP1P1=810;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    assertEquals(810,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3P1=676;
    int clsUTGrafoP3P2=523;
    int clsUTGrafoP3P3=0;
      clsUTGrafo.insereAresta(clsUTGrafoP3P1,clsUTGrafoP3P2,clsUTGrafoP3P3);
    Grafo clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.grafoTransposto();
    assertEquals(810,clsUTGrafoP4R.numVertices());
  }
}
