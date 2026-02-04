package ds.seed5838;
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
Evaluations : 35565
search time (ms): 42501
total runtime (ms): 44726
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Grafo[665]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 16, 34, 5, 24, 9, 10, 30, 31, 15]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTGrafoP1P1=665;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=-672;
    int clsUTGrafoP2RP0P2=414;
    Grafo.Aresta clsUTGrafoP2RP0R=null;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.retiraAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP0R);
    assertEquals(665,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(665,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[0]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[9, 30, 31]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTGrafoP1P1=0;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0R=0;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.numVertices();
    assertEquals(0,clsUTGrafoP2RP0R);
    assertEquals(0,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[451]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 16, 34, 21, 9, 10, 27, 28, 30, 31, 15]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTGrafoP1P1=451;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
      clsUTGrafoP2R.imprime();
    int clsUTGrafoP2RP1P1=-758;
    Grafo.Aresta clsUTGrafoP2RP1R=null;
//Exception
    try {
      clsUTGrafoP2RP1R=clsUTGrafoP2R.proxAdj(clsUTGrafoP2RP1P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP1R);
    assertEquals(451,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(451,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[311, 898, -48]
2)----->v1[], 
3)----->toString[]
 Covered Branches:[1, 3]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTArestaP1P1=311;
    int clsUTArestaP1P2=898;
    int clsUTArestaP1P3=-48;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v1();
    assertEquals(311,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    String clsUTArestaP3RP0P1=new String("_-%<*%{;");
    int clsUTArestaP3RP0P2=1;
    boolean clsUTArestaP3RP0R=false;
      clsUTArestaP3RP0R=clsUTArestaP3R.startsWith(clsUTArestaP3RP0P1,clsUTArestaP3RP0P2);
    assertEquals("_-%<*%{;",clsUTArestaP3RP0P1.toString());
    assertEquals(false,clsUTArestaP3RP0R);
    String clsUTArestaP3RP1P1=new String("QujsJDWYghwIHdaAnFlPzeUCxEtiScLT");
    String clsUTArestaP3RP1R=null;
      clsUTArestaP3RP1R=clsUTArestaP3R.concat(clsUTArestaP3RP1P1);
    assertEquals("QujsJDWYghwIHdaAnFlPzeUCxEtiScLT",clsUTArestaP3RP1P1.toString());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[-712, -208, -638]
2)----->v2[], 
3)----->toString[]
 Covered Branches:[1, 4]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTArestaP1P1=-712;
    int clsUTArestaP1P2=-208;
    int clsUTArestaP1P3=-638;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v2();
    assertEquals(-208,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    String clsUTArestaP3RP0P1=new String("j._MCUk!jPK");
    Object[] clsUTArestaP3RP0P2=new Object[]{};
    String clsUTArestaP3RP0R=null;
      clsUTArestaP3RP0R=String.format(clsUTArestaP3RP0P1,(Object[])clsUTArestaP3RP0P2);
    assertEquals("j._MCUk!jPK",clsUTArestaP3RP0P1.toString());
    assertEquals("j._MCUk!jPK",clsUTArestaP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[796]
2)----->insereAresta[0, 0, 116], 
3)----->listaAdjVazia[67], 
4)----->existeAresta[1, -520]
 Covered Branches:[16, 5, 9, 10, 11, 12, 14, 15]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTGrafoP1P1=796;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=0;
    int clsUTGrafoP2P2=0;
    int clsUTGrafoP2P3=116;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3P1=67;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.listaAdjVazia(clsUTGrafoP3P1);
    assertEquals(true,clsUTGrafoP3R);
    int clsUTGrafoP4P1=1;
    int clsUTGrafoP4P2=-520;
    boolean clsUTGrafoP4R=false;
      clsUTGrafoP4R=clsUTGrafo.existeAresta(clsUTGrafoP4P1,clsUTGrafoP4P2);
    assertEquals(false,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[649]
2)----->proxAdj[0], 
3)----->toString[]
 Covered Branches:[21, 23, 9, 10]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTGrafoP1P1=649;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=0;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.proxAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    String clsUTGrafoP3RP0P1P1=new String("yw8x3g5yat18pijfjap");
    StringBuffer clsUTGrafoP3RP0P1=null;
      clsUTGrafoP3RP0P1=new StringBuffer(clsUTGrafoP3RP0P1P1);
    boolean clsUTGrafoP3RP0R=false;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.contentEquals(clsUTGrafoP3RP0P1);
    assertEquals("yw8x3g5yat18pijfjap",clsUTGrafoP3RP0P1.toString());
    assertEquals(35,clsUTGrafoP3RP0P1.capacity());
    assertEquals(false,clsUTGrafoP3RP0R);
    String clsUTGrafoP3RP1R=null;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.toUpperCase();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[728]
2)----->imprime[], 
3)----->toString[], 
4)----->numVertices[]
 Covered Branches:[9, 10, 27, 28, 30]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTGrafoP1P1=728;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
      clsUTGrafo.imprime();
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    long clsUTGrafoP3RP0P1=79L;
    String clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=String.valueOf(clsUTGrafoP3RP0P1);
    assertEquals("79",clsUTGrafoP3RP0R);
    char clsUTGrafoP3RP1P1='\u0063';
    String clsUTGrafoP3RP1R=null;
      clsUTGrafoP3RP1R=String.valueOf(clsUTGrafoP3RP1P1);
    assertEquals("c",clsUTGrafoP3RP1R);
    int clsUTGrafoP4R=0;
      clsUTGrafoP4R=clsUTGrafo.numVertices();
    assertEquals(728,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[690]
2)----->insereAresta[0, 939, -816], 
3)----->retiraAresta[0, 957]
 Covered Branches:[5, 6, 24, 8, 9, 10, 26, 11]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTGrafoP1P1=690;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=0;
    int clsUTGrafoP2P2=939;
    int clsUTGrafoP2P3=-816;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3P1=0;
    int clsUTGrafoP3P2=957;
    Grafo.Aresta clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.retiraAresta(clsUTGrafoP3P1,clsUTGrafoP3P2);
    assertNull(clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[-1, -449, -1]
2)----->peso[], 
3)----->toString[]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTArestaP1P1=-1;
    int clsUTArestaP1P2=-449;
    int clsUTArestaP1P3=-1;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.peso();
    assertEquals(-1,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    boolean clsUTArestaP3RP0R=false;
      clsUTArestaP3RP0R=clsUTArestaP3R.isEmpty();
    assertEquals(false,clsUTArestaP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[931]
2)----->insereAresta[844, 3, -677], 
3)----->imprime[], 
4)----->grafoTransposto[]
 Covered Branches:[32, 33, 1, 34, 2, 35, 3, 4, 5, 9, 10, 11, 15, 16, 17, 18, 19, 21, 23, 27, 28, 29, 31]
 */
  @Test public void TestCase10() throws Throwable {
    int clsUTGrafoP1P1=931;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=844;
    int clsUTGrafoP2P2=3;
    int clsUTGrafoP2P3=-677;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
      clsUTGrafo.imprime();
    Grafo clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.grafoTransposto();
    assertEquals(931,clsUTGrafoP4R.numVertices());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[377]
2)----->grafoTransposto[], 
3)----->numVertices[], 
4)----->grafoTransposto[]
 Covered Branches:[32, 16, 34, 9, 10, 30, 31, 15]
 */
  @Test public void TestCase11() throws Throwable {
    int clsUTGrafoP1P1=377;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0R=0;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.numVertices();
    assertEquals(377,clsUTGrafoP2RP0R);
    int clsUTGrafoP2RP1R=0;
      clsUTGrafoP2RP1R=clsUTGrafoP2R.numVertices();
    assertEquals(377,clsUTGrafoP2RP1R);
    assertEquals(377,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(377,clsUTGrafoP3R);
    Grafo clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.grafoTransposto();
    assertEquals(377,clsUTGrafoP4R.numVertices());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[857]
2)----->primeiroListaAdj[54], 
3)----->listaAdjVazia[715], 
4)----->existeAresta[147, -611]
 Covered Branches:[16, 18, 20, 5, 9, 10, 12, 14, 15]
 */
  @Test public void TestCase12() throws Throwable {
    int clsUTGrafoP1P1=857;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=54;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.primeiroListaAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    int clsUTGrafoP3P1=715;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.listaAdjVazia(clsUTGrafoP3P1);
    assertEquals(true,clsUTGrafoP3R);
    int clsUTGrafoP4P1=147;
    int clsUTGrafoP4P2=-611;
    boolean clsUTGrafoP4R=false;
      clsUTGrafoP4R=clsUTGrafo.existeAresta(clsUTGrafoP4P1,clsUTGrafoP4P2);
    assertEquals(false,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[793]
2)----->insereAresta[272, 1, -454], 
3)----->numVertices[], 
4)----->imprime[]
 Covered Branches:[5, 9, 10, 11, 27, 28, 29, 30]
 */
  @Test public void TestCase13() throws Throwable {
    int clsUTGrafoP1P1=793;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=272;
    int clsUTGrafoP2P2=1;
    int clsUTGrafoP2P3=-454;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(793,clsUTGrafoP3R);
      clsUTGrafo.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[484]
2)----->insereAresta[1, -677, 546], 
3)----->proxAdj[1], 
4)----->imprime[]
 Covered Branches:[1, 2, 5, 21, 22, 9, 10, 11, 27, 28, 29]
 */
  @Test public void TestCase14() throws Throwable {
    int clsUTGrafoP1P1=484;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=1;
    int clsUTGrafoP2P2=-677;
    int clsUTGrafoP2P3=546;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3P1=1;
    Grafo.Aresta clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.proxAdj(clsUTGrafoP3P1);
    int clsUTGrafoP3RP0R=0;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.peso();
    assertEquals(546,clsUTGrafoP3RP0R);
      clsUTGrafo.imprime();
  }
}
