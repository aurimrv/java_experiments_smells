package ds.seed7992;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import java.util.Arrays;
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
Evaluations : 30818
search time (ms): 42501
total runtime (ms): 44592
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Grafo[939]
2)----->insereAresta[245, -482, -371], 
3)----->proxAdj[574]
 Covered Branches:[18, 19, 5, 6, 7, 9]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTGrafoP1P1=939;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=245;
    int clsUTGrafoP2P2=-482;
    int clsUTGrafoP2P3=-371;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3P1=574;
    Grafo.Aresta clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.proxAdj(clsUTGrafoP3P1);
    assertNull(clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[-1, 7, -663]
2)----->v2[], 
3)----->toString[]
 Covered Branches:[1, 4]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTArestaP1P1=-1;
    int clsUTArestaP1P2=7;
    int clsUTArestaP1P3=-663;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v2();
    assertEquals(7,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    int clsUTArestaP3RP0P1=142;
    int clsUTArestaP3RP0P2=-30;
    String clsUTArestaP3RP0R=null;
//Exception
    try {
      clsUTArestaP3RP0R=clsUTArestaP3R.substring(clsUTArestaP3RP0P1,clsUTArestaP3RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTArestaP3RP0R);
    int clsUTArestaP3RP1P1=311;
    int clsUTArestaP3RP1P2=-559;
    CharSequence clsUTArestaP3RP1R=null;
//Exception
    try {
      clsUTArestaP3RP1R=clsUTArestaP3R.subSequence(clsUTArestaP3RP1P1,clsUTArestaP3RP1P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTArestaP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[4501]
2)----->existeAresta[780, -321], 
3)----->listaAdjVazia[115]
 Covered Branches:[5, 6, 10, 14, 15]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTGrafoP1P1=4501;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=780;
    int clsUTGrafoP2P2=-321;
    boolean clsUTGrafoP2R=false;
      clsUTGrafoP2R=clsUTGrafo.existeAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    assertEquals(false,clsUTGrafoP2R);
    int clsUTGrafoP3P1=115;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.listaAdjVazia(clsUTGrafoP3P1);
    assertEquals(true,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[1, 924, 0]
2)----->peso[], 
3)----->toString[]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTArestaP1P1=1;
    int clsUTArestaP1P2=924;
    int clsUTArestaP1P3=0;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.peso();
    assertEquals(0,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[4499]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[33, 17, 34, 18, 19, 36, 5, 6, 14, 15]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTGrafoP1P1=4499;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    Grafo clsUTGrafoP2RP0R=null;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.grafoTransposto();
    assertEquals(4499,clsUTGrafoP2RP0R.numVertices());
    int clsUTGrafoP2RP1P1=968;
    Grafo.Aresta clsUTGrafoP2RP1R=null;
      clsUTGrafoP2RP1R=clsUTGrafoP2R.primeiroListaAdj(clsUTGrafoP2RP1P1);
    assertNull(clsUTGrafoP2RP1R);
    assertEquals(4499,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    boolean clsUTGrafoP3RP0R=false;
//Exception
    try {
      clsUTGrafoP3RP0R=clsUTGrafoP3R.endsWith((String)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    byte[] clsUTGrafoP3RP1R=null;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.getBytes();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[86]
2)----->imprime[], 
3)----->listaAdjVazia[0]
 Covered Branches:[5, 6, 29, 30, 14, 15]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTGrafoP1P1=86;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
      clsUTGrafo.imprime();
    int clsUTGrafoP3P1=0;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.listaAdjVazia(clsUTGrafoP3P1);
    assertEquals(true,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[-116, 1, 1]
2)----->v1[], 
3)----->toString[]
 Covered Branches:[1, 3]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTArestaP1P1=-116;
    int clsUTArestaP1P2=1;
    int clsUTArestaP1P3=1;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v1();
    assertEquals(-116,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    double clsUTArestaP3RP0P1=75.47162389348227D;
    String clsUTArestaP3RP0R=null;
      clsUTArestaP3RP0R=String.valueOf(clsUTArestaP3RP0P1);
    assertEquals("75.47162389348227",clsUTArestaP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[0]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 33, 5]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTGrafoP1P1=0;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    assertEquals(0,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(0,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[304]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[33, 1, 34, 2, 35, 3, 36, 4, 5, 37, 6, 7, 9, 14, 15, 16, 17, 18, 20]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTGrafoP1P1=304;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=829;
    int clsUTGrafoP2RP0P2=-448;
    int clsUTGrafoP2RP0P3=626;
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
    assertEquals(304,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    String clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.toUpperCase();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[245]
2)----->retiraAresta[617, 0], 
3)----->proxAdj[20], 
4)----->toString[]
 Covered Branches:[1, 18, 19, 5, 21, 6, 25, 27]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTGrafoP1P1=245;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=617;
    int clsUTGrafoP2P2=0;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.retiraAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    int clsUTGrafoP3P1=20;
    Grafo.Aresta clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.proxAdj(clsUTGrafoP3P1);
    assertNull(clsUTGrafoP3R);
    String clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.toString();
    int clsUTGrafoP4RP0P1=269;
    int clsUTGrafoP4RP0P2=-562;
    int clsUTGrafoP4RP0R=0;
      clsUTGrafoP4RP0R=clsUTGrafoP4R.lastIndexOf(clsUTGrafoP4RP0P1,clsUTGrafoP4RP0P2);
    assertEquals(-1,clsUTGrafoP4RP0R);
    String clsUTGrafoP4RP1P1=new String("dGgQXhb9KCrzSrpc2OBKi40AUOikQ6z5tQnmVr4dBgS5Iqw6B3Pf8pwRYub4onlVB7CA0m8b7lrjhdJsKUSUDQ5CsY8y9RrKvDUyLjIzp8De5P759ypHemqXqVVIAMKfYfgoQHT4hlNcz5i5rey2qgH0jPXBcRfPzKS3BNtS2HX0bdcJm7J2Yqz8yeoXzCWM");
    int clsUTGrafoP4RP1P2=-428;
    boolean clsUTGrafoP4RP1R=false;
      clsUTGrafoP4RP1R=clsUTGrafoP4R.startsWith(clsUTGrafoP4RP1P1,clsUTGrafoP4RP1P2);
    assertEquals("dGgQXhb9KCrzSrpc2OBKi40AUOikQ6z5tQnmVr4dBgS5Iqw6B3Pf8pwRYub4onlVB7CA0m8b7lrjhdJsKUSUDQ5CsY8y9RrKvDUyLjIzp8De5P759ypHemqXqVVIAMKfYfgoQHT4hlNcz5i5rey2qgH0jPXBcRfPzKS3BNtS2HX0bdcJm7J2Yqz8yeoXzCWM",clsUTGrafoP4RP1P1.toString());
    assertEquals(false,clsUTGrafoP4RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[264]
2)----->retiraAresta[282, -1], 
3)----->toString[]
 Covered Branches:[5, 21, 6, 26]
 */
  @Test public void TestCase10() throws Throwable {
    int clsUTGrafoP1P1=264;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=282;
    int clsUTGrafoP2P2=-1;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.retiraAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    assertNull(clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
  }
}
