package ds.seed5838;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import java.nio.charset.Charset;
import java.util.Arrays;
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
Evaluations : 83300
search time (ms): 42501
total runtime (ms): 44224
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 16, 34, 5, 24, 9, 10, 27, 28, 30, 31, 15]
 */
  @Test public void TestCase0() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
      clsUTGrafoP2R.imprime();
    int clsUTGrafoP2RP1P1=-952;
    int clsUTGrafoP2RP1P2=0;
    Grafo.Aresta clsUTGrafoP2RP1R=null;
//Exception
    try {
      clsUTGrafoP2RP1R=clsUTGrafoP2R.retiraAresta(clsUTGrafoP2RP1P1,clsUTGrafoP2RP1P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP1R);
    assertEquals(100,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(100,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->imprime[], 
3)----->listaAdjVazia[0]
 Covered Branches:[16, 9, 10, 27, 28, 15]
 */
  @Test public void TestCase1() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
      clsUTGrafo.imprime();
    int clsUTGrafoP3P1=0;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.listaAdjVazia(clsUTGrafoP3P1);
    assertEquals(true,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->listaAdjVazia[1], 
3)----->insereAresta[0, 321, -702], 
4)----->listaAdjVazia[0]
 Covered Branches:[16, 17, 5, 9, 10, 11, 15]
 */
  @Test public void TestCase2() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2P1=1;
    boolean clsUTGrafoP2R=false;
      clsUTGrafoP2R=clsUTGrafo.listaAdjVazia(clsUTGrafoP2P1);
    assertEquals(true,clsUTGrafoP2R);
    int clsUTGrafoP3P1=0;
    int clsUTGrafoP3P2=321;
    int clsUTGrafoP3P3=-702;
      clsUTGrafo.insereAresta(clsUTGrafoP3P1,clsUTGrafoP3P2,clsUTGrafoP3P3);
    int clsUTGrafoP4P1=0;
    boolean clsUTGrafoP4R=false;
      clsUTGrafoP4R=clsUTGrafo.listaAdjVazia(clsUTGrafoP4P1);
    assertEquals(false,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[550, -99, -1]
2)----->peso[], 
3)----->toString[]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTArestaP1P1=550;
    int clsUTArestaP1P2=-99;
    int clsUTArestaP1P3=-1;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.peso();
    assertEquals(-1,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    int clsUTArestaP3RP0P1=100;
    int clsUTArestaP3RP0P2=99;
    int clsUTArestaP3RP0R=0;
//Exception
    try {
      clsUTArestaP3RP0R=clsUTArestaP3R.codePointCount(clsUTArestaP3RP0P1,clsUTArestaP3RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    char[] clsUTArestaP3RP1P1=new char[]{'\u0063','\u0054','\u0032','\u0077'};
    int clsUTArestaP3RP1P2=-218;
    int clsUTArestaP3RP1P3=902;
    String clsUTArestaP3RP1R=null;
//Exception
    try {
      clsUTArestaP3RP1R=String.valueOf(clsUTArestaP3RP1P1,clsUTArestaP3RP1P2,clsUTArestaP3RP1P3);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertTrue(Arrays.equals(new char[]{'\u0063','\u0054','\u0032','\u0077'},clsUTArestaP3RP1P1));
    assertNull(clsUTArestaP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->insereAresta[0, 0, 464], 
3)----->retiraAresta[0, 279], 
4)----->grafoTransposto[]
 Covered Branches:[1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 15, 16, 17, 18, 19, 21, 23, 24, 26, 30, 31, 32, 33, 34, 35]
 */
  @Test public void TestCase4() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2P1=0;
    int clsUTGrafoP2P2=0;
    int clsUTGrafoP2P3=464;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3P1=0;
    int clsUTGrafoP3P2=279;
    Grafo.Aresta clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.retiraAresta(clsUTGrafoP3P1,clsUTGrafoP3P2);
    assertNull(clsUTGrafoP3R);
    Grafo clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP4RP0R=0;
      clsUTGrafoP4RP0R=clsUTGrafoP4R.numVertices();
    assertEquals(100,clsUTGrafoP4RP0R);
    int clsUTGrafoP4RP1P1=-810;
    Grafo.Aresta clsUTGrafoP4RP1R=null;
//Exception
    try {
      clsUTGrafoP4RP1R=clsUTGrafoP4R.primeiroListaAdj(clsUTGrafoP4RP1P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP4RP1R);
    assertEquals(100,clsUTGrafoP4R.numVertices());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[318, 369, -1]
2)----->v2[], 
3)----->toString[]
 Covered Branches:[1, 4]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTArestaP1P1=318;
    int clsUTArestaP1P2=369;
    int clsUTArestaP1P3=-1;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v2();
    assertEquals(369,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->primeiroListaAdj[1], 
3)----->grafoTransposto[], 
4)----->grafoTransposto[]
 Covered Branches:[32, 16, 18, 34, 20, 9, 10, 31, 15]
 */
  @Test public void TestCase6() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2P1=1;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.primeiroListaAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    Grafo clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.grafoTransposto();
    assertEquals(100,clsUTGrafoP3R.numVertices());
    Grafo clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP4RP0P1=-28;
    Grafo.Aresta clsUTGrafoP4RP0R=null;
//Exception
    try {
      clsUTGrafoP4RP0R=clsUTGrafoP4R.primeiroListaAdj(clsUTGrafoP4RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP4RP0R);
    assertEquals(100,clsUTGrafoP4R.numVertices());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[], 
3)----->toString[], 
4)----->numVertices[]
 Covered Branches:[32, 16, 34, 18, 21, 9, 10, 30, 31, 15]
 */
  @Test public void TestCase7() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=-1;
    Grafo.Aresta clsUTGrafoP2RP0R=null;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.proxAdj(clsUTGrafoP2RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP0R);
    int clsUTGrafoP2RP1P1=805;
    Grafo.Aresta clsUTGrafoP2RP1R=null;
//Exception
    try {
      clsUTGrafoP2RP1R=clsUTGrafoP2R.primeiroListaAdj(clsUTGrafoP2RP1P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP1R);
    assertEquals(100,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    int clsUTGrafoP4R=0;
      clsUTGrafoP4R=clsUTGrafo.numVertices();
    assertEquals(100,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[-759, -1, 99]
2)----->v1[], 
3)----->toString[]
 Covered Branches:[1, 3]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTArestaP1P1=-759;
    int clsUTArestaP1P2=-1;
    int clsUTArestaP1P3=99;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v1();
    assertEquals(-759,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    boolean clsUTArestaP3RP0R=false;
      clsUTArestaP3RP0R=clsUTArestaP3R.isEmpty();
    assertEquals(false,clsUTArestaP3RP0R);
    Charset clsUTArestaP3RP1P1=null;
      clsUTArestaP3RP1P1=Charset.defaultCharset();
    byte[] clsUTArestaP3RP1R=null;
      clsUTArestaP3RP1R=clsUTArestaP3R.getBytes(clsUTArestaP3RP1P1);
    assertEquals("UTF-8",clsUTArestaP3RP1P1.toString());
    assertEquals(true,clsUTArestaP3RP1P1.canEncode());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->proxAdj[30]
 Covered Branches:[21, 23, 9, 10]
 */
  @Test public void TestCase9() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2P1=30;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.proxAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->existeAresta[47, 1], 
3)----->numVertices[]
 Covered Branches:[5, 9, 10, 12, 14, 30]
 */
  @Test public void TestCase10() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2P1=47;
    int clsUTGrafoP2P2=1;
    boolean clsUTGrafoP2R=false;
      clsUTGrafoP2R=clsUTGrafo.existeAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    assertEquals(false,clsUTGrafoP2R);
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(100,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->insereAresta[0, -878, 444], 
3)----->proxAdj[0], 
4)----->imprime[]
 Covered Branches:[1, 5, 21, 22, 9, 10, 11, 27, 28, 29]
 */
  @Test public void TestCase11() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2P1=0;
    int clsUTGrafoP2P2=-878;
    int clsUTGrafoP2P3=444;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3P1=0;
    Grafo.Aresta clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.proxAdj(clsUTGrafoP3P1);
      clsUTGrafo.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->numVertices[], 
3)----->imprime[], 
4)----->insereAresta[10, -251, 724]
 Covered Branches:[5, 9, 10, 27, 11, 28, 30]
 */
  @Test public void TestCase12() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2R=0;
      clsUTGrafoP2R=clsUTGrafo.numVertices();
    assertEquals(100,clsUTGrafoP2R);
      clsUTGrafo.imprime();
    int clsUTGrafoP4P1=10;
    int clsUTGrafoP4P2=-251;
    int clsUTGrafoP4P3=724;
      clsUTGrafo.insereAresta(clsUTGrafoP4P1,clsUTGrafoP4P2,clsUTGrafoP4P3);
  }
}
