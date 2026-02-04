package ds.seed5311;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Grafo;
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
Evaluations : 36214
search time (ms): 42504
total runtime (ms): 44567
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Grafo[954]
2)----->insereAresta[449, 404, -39], 
3)----->grafoTransposto[]
 Covered Branches:[32, 33, 1, 34, 2, 35, 3, 4, 5, 9, 10, 11, 15, 16, 17, 18, 19, 21, 23, 31]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTGrafoP1P1=954;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=449;
    int clsUTGrafoP2P2=404;
    int clsUTGrafoP2P3=-39;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    Grafo clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.grafoTransposto();
    assertEquals(954,clsUTGrafoP3R.numVertices());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[592, 81, 0]
2)----->v1[], 
3)----->v1[]
 Covered Branches:[1, 3]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTArestaP1P1=592;
    int clsUTArestaP1P2=81;
    int clsUTArestaP1P3=0;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v1();
    assertEquals(592,clsUTArestaP2R);
    int clsUTArestaP3R=0;
      clsUTArestaP3R=clsUTAresta.v1();
    assertEquals(592,clsUTArestaP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[601]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[32, 16, 34, 18, 20, 9, 10, 31, 15]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTGrafoP1P1=601;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=0;
    Grafo.Aresta clsUTGrafoP2RP0R=null;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.primeiroListaAdj(clsUTGrafoP2RP0P1);
    assertNull(clsUTGrafoP2RP0R);
    assertEquals(601,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[411]
2)----->imprime[], 
3)----->insereAresta[22, -833, 1]
 Covered Branches:[5, 9, 10, 27, 11, 28]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTGrafoP1P1=411;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
      clsUTGrafo.imprime();
    int clsUTGrafoP3P1=22;
    int clsUTGrafoP3P2=-833;
    int clsUTGrafoP3P3=1;
      clsUTGrafo.insereAresta(clsUTGrafoP3P1,clsUTGrafoP3P2,clsUTGrafoP3P3);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[270, -401, 1]
2)----->v2[], 
3)----->toString[]
 Covered Branches:[1, 4]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTArestaP1P1=270;
    int clsUTArestaP1P2=-401;
    int clsUTArestaP1P3=1;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v2();
    assertEquals(-401,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[26]
2)----->imprime[], 
3)----->numVertices[], 
4)----->toString[], 
5)----->existeAresta[0, 583]
 Covered Branches:[5, 9, 10, 27, 28, 12, 30, 14]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTGrafoP1P1=26;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
      clsUTGrafo.imprime();
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(26,clsUTGrafoP3R);
    String clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.toString();
    String clsUTGrafoP4RP0P1=new String("u~");
    int clsUTGrafoP4RP0R=0;
      clsUTGrafoP4RP0R=clsUTGrafoP4R.compareTo(clsUTGrafoP4RP0P1);
    assertEquals("u~",clsUTGrafoP4RP0P1.toString());
    assertEquals(-17,clsUTGrafoP4RP0R);
    int clsUTGrafoP5P1=0;
    int clsUTGrafoP5P2=583;
    boolean clsUTGrafoP5R=false;
      clsUTGrafoP5R=clsUTGrafo.existeAresta(clsUTGrafoP5P1,clsUTGrafoP5P2);
    assertEquals(false,clsUTGrafoP5R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[291]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[32, 16, 34, 18, 21, 9, 10, 31, 15]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTGrafoP1P1=291;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=-661;
    Grafo.Aresta clsUTGrafoP2RP0R=null;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.primeiroListaAdj(clsUTGrafoP2RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP0R);
    int clsUTGrafoP2RP1P1=482;
    Grafo.Aresta clsUTGrafoP2RP1R=null;
//Exception
    try {
      clsUTGrafoP2RP1R=clsUTGrafoP2R.proxAdj(clsUTGrafoP2RP1P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP1R);
    assertEquals(291,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[529, 599, 357]
2)----->peso[], 
3)----->toString[]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTArestaP1P1=529;
    int clsUTArestaP1P2=599;
    int clsUTArestaP1P3=357;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.peso();
    assertEquals(357,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[1]
2)----->insereAresta[0, -930, 1], 
3)----->listaAdjVazia[0]
 Covered Branches:[17, 5, 9, 10, 11, 15]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTGrafoP1P1=1;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=0;
    int clsUTGrafoP2P2=-930;
    int clsUTGrafoP2P3=1;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3P1=0;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.listaAdjVazia(clsUTGrafoP3P1);
    assertEquals(false,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[717]
2)----->numVertices[], 
3)----->insereAresta[0, 249, 350], 
4)----->retiraAresta[0, 17]
 Covered Branches:[5, 6, 24, 8, 9, 10, 26, 11, 30]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTGrafoP1P1=717;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2R=0;
      clsUTGrafoP2R=clsUTGrafo.numVertices();
    assertEquals(717,clsUTGrafoP2R);
    int clsUTGrafoP3P1=0;
    int clsUTGrafoP3P2=249;
    int clsUTGrafoP3P3=350;
      clsUTGrafo.insereAresta(clsUTGrafoP3P1,clsUTGrafoP3P2,clsUTGrafoP3P3);
    int clsUTGrafoP4P1=0;
    int clsUTGrafoP4P2=17;
    Grafo.Aresta clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.retiraAresta(clsUTGrafoP4P1,clsUTGrafoP4P2);
    assertNull(clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[513]
2)----->insereAresta[219, 245, 0], 
3)----->imprime[]
 Covered Branches:[5, 9, 10, 11, 27, 28, 29]
 */
  @Test public void TestCase10() throws Throwable {
    int clsUTGrafoP1P1=513;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=219;
    int clsUTGrafoP2P2=245;
    int clsUTGrafoP2P3=0;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
      clsUTGrafo.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[961]
2)----->grafoTransposto[], 
3)----->numVertices[], 
4)----->toString[]
 Covered Branches:[32, 1, 34, 5, 9, 10, 11, 15, 16, 21, 22, 30, 31]
 */
  @Test public void TestCase11() throws Throwable {
    int clsUTGrafoP1P1=961;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=0;
    int clsUTGrafoP2RP0P2=666;
    int clsUTGrafoP2RP0P3=19;
      clsUTGrafoP2R.insereAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2,clsUTGrafoP2RP0P3);
    int clsUTGrafoP2RP1P1=0;
    Grafo.Aresta clsUTGrafoP2RP1R=null;
      clsUTGrafoP2RP1R=clsUTGrafoP2R.proxAdj(clsUTGrafoP2RP1P1);
    assertEquals(961,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(961,clsUTGrafoP3R);
    String clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.toString();
    String clsUTGrafoP4RP0P1P1=new String("");
    CharSequence clsUTGrafoP4RP0P1=null;
      clsUTGrafoP4RP0P1=new String(clsUTGrafoP4RP0P1P1);
    String clsUTGrafoP4RP0R=null;
//Exception
    try {
      clsUTGrafoP4RP0R=String.join(clsUTGrafoP4RP0P1,(Iterable)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("",clsUTGrafoP4RP0P1.toString());
    assertEquals(0,clsUTGrafoP4RP0P1.length());
    assertNull(clsUTGrafoP4RP0R);
    String clsUTGrafoP4RP1P1=new String("_(8pUP5#ISDT]olLcHJ};j2BdqFY~*X<i:");
    String clsUTGrafoP4RP1R=null;
      clsUTGrafoP4RP1R=clsUTGrafoP4R.concat(clsUTGrafoP4RP1P1);
    assertEquals("_(8pUP5#ISDT]olLcHJ};j2BdqFY~*X<i:",clsUTGrafoP4RP1P1.toString());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[605]
2)----->grafoTransposto[], 
3)----->grafoTransposto[], 
4)----->grafoTransposto[]
 Covered Branches:[32, 16, 34, 5, 24, 9, 10, 27, 28, 30, 31, 15]
 */
  @Test public void TestCase12() throws Throwable {
    int clsUTGrafoP1P1=605;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0R=0;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.numVertices();
    assertEquals(605,clsUTGrafoP2RP0R);
      clsUTGrafoP2R.imprime();
    assertEquals(605,clsUTGrafoP2R.numVertices());
    Grafo clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP3RP0P1=0;
    int clsUTGrafoP3RP0P2=-1;
    Grafo.Aresta clsUTGrafoP3RP0R=null;
//Exception
    try {
      clsUTGrafoP3RP0R=clsUTGrafoP3R.retiraAresta(clsUTGrafoP3RP0P1,clsUTGrafoP3RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP3RP0R);
    assertEquals(605,clsUTGrafoP3R.numVertices());
    Grafo clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP4RP0R=0;
      clsUTGrafoP4RP0R=clsUTGrafoP4R.numVertices();
    assertEquals(605,clsUTGrafoP4RP0R);
    assertEquals(605,clsUTGrafoP4R.numVertices());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[741]
2)----->proxAdj[221], 
3)----->toString[]
 Covered Branches:[21, 23, 9, 10]
 */
  @Test public void TestCase13() throws Throwable {
    int clsUTGrafoP1P1=741;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=221;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.proxAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    byte[] clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.getBytes();
  }
}
