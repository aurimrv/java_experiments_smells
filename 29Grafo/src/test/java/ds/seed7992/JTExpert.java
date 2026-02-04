package ds.seed7992;
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
Evaluations : 31512
search time (ms): 42501
total runtime (ms): 44506
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[0, -998, -69]
2)----->peso[], 
3)----->toString[]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTArestaP1P1=0;
    int clsUTArestaP1P2=-998;
    int clsUTArestaP1P3=-69;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.peso();
    assertEquals(-69,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    char[] clsUTArestaP3RP0P1=new char[]{'\u0038','\u0044','\uafe8'};
    int clsUTArestaP3RP0P2=-403;
    int clsUTArestaP3RP0P3=38;
    String clsUTArestaP3RP0R=null;
//Exception
    try {
      clsUTArestaP3RP0R=String.valueOf(clsUTArestaP3RP0P1,clsUTArestaP3RP0P2,clsUTArestaP3RP0P3);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertTrue(Arrays.equals(new char[]{'\u0038','\u0044','\uafe8'},clsUTArestaP3RP0P1));
    assertNull(clsUTArestaP3RP0R);
    int clsUTArestaP3RP1P1=930;
    char clsUTArestaP3RP1R='X';
//Exception
    try {
      clsUTArestaP3RP1R=clsUTArestaP3R.charAt(clsUTArestaP3RP1P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[900]
2)----->grafoTransposto[], 
3)----->insereAresta[1, -1, 0], 
4)----->numVertices[]
 Covered Branches:[32, 16, 34, 5, 9, 10, 11, 30, 31, 15]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTGrafoP1P1=900;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP3P1=1;
    int clsUTGrafoP3P2=-1;
    int clsUTGrafoP3P3=0;
      clsUTGrafo.insereAresta(clsUTGrafoP3P1,clsUTGrafoP3P2,clsUTGrafoP3P3);
    int clsUTGrafoP4R=0;
      clsUTGrafoP4R=clsUTGrafo.numVertices();
    assertEquals(900,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[492]
2)----->listaAdjVazia[0], 
3)----->insereAresta[98, 695, 471], 
4)----->imprime[]
 Covered Branches:[16, 5, 9, 10, 11, 27, 28, 29, 15]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTGrafoP1P1=492;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=0;
    boolean clsUTGrafoP2R=false;
      clsUTGrafoP2R=clsUTGrafo.listaAdjVazia(clsUTGrafoP2P1);
    assertEquals(true,clsUTGrafoP2R);
    int clsUTGrafoP3P1=98;
    int clsUTGrafoP3P2=695;
    int clsUTGrafoP3P3=471;
      clsUTGrafo.insereAresta(clsUTGrafoP3P1,clsUTGrafoP3P2,clsUTGrafoP3P3);
      clsUTGrafo.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[578]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[32, 16, 34, 9, 10, 27, 28, 31, 15]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTGrafoP1P1=578;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
      clsUTGrafoP2R.imprime();
    assertEquals(578,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    String clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[262]
2)----->insereAresta[97, 1, 106], 
3)----->grafoTransposto[], 
4)----->imprime[]
 Covered Branches:[32, 33, 1, 34, 2, 35, 3, 4, 5, 9, 10, 11, 15, 16, 17, 18, 19, 21, 22, 23, 27, 28, 29, 31]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTGrafoP1P1=262;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=97;
    int clsUTGrafoP2P2=1;
    int clsUTGrafoP2P3=106;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    Grafo clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP3RP0P1=1;
    Grafo.Aresta clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.proxAdj(clsUTGrafoP3RP0P1);
    Grafo clsUTGrafoP3RP1R=null;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.grafoTransposto();
    assertEquals(262,clsUTGrafoP3RP1R.numVertices());
    assertEquals(262,clsUTGrafoP3R.numVertices());
      clsUTGrafo.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[521]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 16, 34, 5, 24, 9, 10, 30, 31, 15]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTGrafoP1P1=521;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    Grafo clsUTGrafoP2RP0R=null;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.grafoTransposto();
    assertEquals(521,clsUTGrafoP2RP0R.numVertices());
    int clsUTGrafoP2RP1P1=-672;
    int clsUTGrafoP2RP1P2=-1;
    Grafo.Aresta clsUTGrafoP2RP1R=null;
//Exception
    try {
      clsUTGrafoP2RP1R=clsUTGrafoP2R.retiraAresta(clsUTGrafoP2RP1P1,clsUTGrafoP2RP1P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP1R);
    assertEquals(521,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(521,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[487]
2)----->insereAresta[0, 470, 956], 
3)----->retiraAresta[0, 909], 
4)----->imprime[]
 Covered Branches:[5, 6, 24, 8, 9, 10, 26, 11, 27, 28, 29]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTGrafoP1P1=487;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=0;
    int clsUTGrafoP2P2=470;
    int clsUTGrafoP2P3=956;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3P1=0;
    int clsUTGrafoP3P2=909;
    Grafo.Aresta clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.retiraAresta(clsUTGrafoP3P1,clsUTGrafoP3P2);
    assertNull(clsUTGrafoP3R);
      clsUTGrafo.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[859]
2)----->existeAresta[1, -1], 
3)----->toString[]
 Covered Branches:[5, 9, 10, 12, 14]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTGrafoP1P1=859;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=1;
    int clsUTGrafoP2P2=-1;
    boolean clsUTGrafoP2R=false;
      clsUTGrafoP2R=clsUTGrafo.existeAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    assertEquals(false,clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[236]
2)----->grafoTransposto[], 
3)----->numVertices[], 
4)----->toString[]
 Covered Branches:[32, 16, 34, 9, 10, 30, 31, 15]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTGrafoP1P1=236;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    assertEquals(236,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(236,clsUTGrafoP3R);
    String clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[939]
2)----->proxAdj[474], 
3)----->existeAresta[1, -1]
 Covered Branches:[21, 5, 23, 9, 10, 12, 14]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTGrafoP1P1=939;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=474;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.proxAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    int clsUTGrafoP3P1=1;
    int clsUTGrafoP3P2=-1;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.existeAresta(clsUTGrafoP3P1,clsUTGrafoP3P2);
    assertEquals(false,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[886]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 33, 1, 34, 2, 35, 3, 4, 5, 9, 10, 11, 15, 16, 17, 18, 19, 30, 31]
 */
  @Test public void TestCase10() throws Throwable {
    int clsUTGrafoP1P1=886;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=0;
    int clsUTGrafoP2RP0P2=-333;
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
    assertEquals(886,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(886,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[719, 793, -311]
2)----->v2[], 
3)----->toString[]
 Covered Branches:[1, 4]
 */
  @Test public void TestCase11() throws Throwable {
    int clsUTArestaP1P1=719;
    int clsUTArestaP1P2=793;
    int clsUTArestaP1P3=-311;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v2();
    assertEquals(793,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[0, 972, 840]
2)----->v1[], 
3)----->toString[]
 Covered Branches:[1, 3]
 */
  @Test public void TestCase12() throws Throwable {
    int clsUTArestaP1P1=0;
    int clsUTArestaP1P2=972;
    int clsUTArestaP1P3=840;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v1();
    assertEquals(0,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[60]
2)----->primeiroListaAdj[1], 
3)----->toString[]
 Covered Branches:[18, 20, 9, 10]
 */
  @Test public void TestCase13() throws Throwable {
    int clsUTGrafoP1P1=60;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=1;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.primeiroListaAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    String clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.trim();
    int clsUTGrafoP3RP1P1=669;
    int clsUTGrafoP3RP1R=0;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.indexOf(clsUTGrafoP3RP1P1);
    assertEquals(-1,clsUTGrafoP3RP1R);
  }
}
