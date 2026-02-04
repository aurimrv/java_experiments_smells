package ds.seed9121;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import java.util.Arrays;
import ds.Grafo;
/** 
 * This class was automatically generated to test the ds.Grafo class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35]
Uncovered branches: [13]
Total number of branches: 35
Total number of covered branches: 34
Coverage : 97,14%
Evaluations : 80697
search time (ms): 42501
total runtime (ms): 44261
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->insereAresta[1, 1, 5], 
3)----->grafoTransposto[]
 Covered Branches:[32, 33, 1, 34, 2, 35, 3, 4, 5, 9, 10, 11, 15, 16, 17, 18, 19, 21, 23, 27, 28, 29, 31]
 */
  @Test public void TestCase0() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2P1=1;
    int clsUTGrafoP2P2=1;
    int clsUTGrafoP2P3=5;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    Grafo clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.grafoTransposto();
      clsUTGrafoP3R.imprime();
    assertEquals(100,clsUTGrafoP3R.numVertices());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->insereAresta[1, -885, -1], 
3)----->retiraAresta[1, 1]
 Covered Branches:[5, 6, 24, 8, 9, 10, 26, 11]
 */
  @Test public void TestCase1() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2P1=1;
    int clsUTGrafoP2P2=-885;
    int clsUTGrafoP2P3=-1;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3P1=1;
    int clsUTGrafoP3P2=1;
    Grafo.Aresta clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.retiraAresta(clsUTGrafoP3P1,clsUTGrafoP3P2);
    assertNull(clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 16, 34, 5, 9, 10, 12, 30, 31, 15]
 */
  @Test public void TestCase2() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=-579;
    int clsUTGrafoP2RP0P2=74;
    boolean clsUTGrafoP2RP0R=false;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.existeAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    Grafo clsUTGrafoP2RP1R=null;
      clsUTGrafoP2RP1R=clsUTGrafoP2R.grafoTransposto();
    assertEquals(100,clsUTGrafoP2RP1R.numVertices());
    assertEquals(100,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(100,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 16, 34, 18, 9, 10, 30, 31, 15]
 */
  @Test public void TestCase3() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0R=0;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.numVertices();
    assertEquals(100,clsUTGrafoP2RP0R);
    int clsUTGrafoP2RP1P1=-112;
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
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(100,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[32, 16, 34, 5, 9, 10, 11, 31, 15]
 */
  @Test public void TestCase4() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=317;
    int clsUTGrafoP2RP0P2=-431;
    int clsUTGrafoP2RP0P3=101;
//Exception
    try {
      clsUTGrafoP2R.insereAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2,clsUTGrafoP2RP0P3);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals(100,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    boolean clsUTGrafoP3RP0P1=true;
    int clsUTGrafoP3RP0P2=-1;
    String clsUTGrafoP3RP0P3=new String("-");
    int clsUTGrafoP3RP0P4=616;
    int clsUTGrafoP3RP0P5=118;
    boolean clsUTGrafoP3RP0R=false;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.regionMatches(clsUTGrafoP3RP0P1,clsUTGrafoP3RP0P2,clsUTGrafoP3RP0P3,clsUTGrafoP3RP0P4,clsUTGrafoP3RP0P5);
    assertEquals("-",clsUTGrafoP3RP0P3.toString());
    assertEquals(false,clsUTGrafoP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[1, -60, -761]
2)----->v1[], 
3)----->v2[], 
4)----->v1[]
 Covered Branches:[1, 3, 4]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTArestaP1P1=1;
    int clsUTArestaP1P2=-60;
    int clsUTArestaP1P3=-761;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v1();
    assertEquals(1,clsUTArestaP2R);
    int clsUTArestaP3R=0;
      clsUTArestaP3R=clsUTAresta.v2();
    assertEquals(-60,clsUTArestaP3R);
    int clsUTArestaP4R=0;
      clsUTArestaP4R=clsUTAresta.v1();
    assertEquals(1,clsUTArestaP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[-613, 180, -722]
2)----->peso[], 
3)----->toString[]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTArestaP1P1=-613;
    int clsUTArestaP1P2=180;
    int clsUTArestaP1P3=-722;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.peso();
    assertEquals(-722,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[], 
3)----->toString[], 
4)----->numVertices[]
 Covered Branches:[32, 16, 34, 5, 24, 9, 10, 30, 31, 15]
 */
  @Test public void TestCase7() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    Grafo clsUTGrafoP2RP0R=null;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.grafoTransposto();
    assertEquals(100,clsUTGrafoP2RP0R.numVertices());
    int clsUTGrafoP2RP1P1=-304;
    int clsUTGrafoP2RP1P2=760;
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
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    char[] clsUTGrafoP3RP0P1=new char[]{};
    int clsUTGrafoP3RP0P2=675;
    int clsUTGrafoP3RP0P3=9;
    String clsUTGrafoP3RP0R=null;
//Exception
    try {
      clsUTGrafoP3RP0R=String.valueOf(clsUTGrafoP3RP0P1,clsUTGrafoP3RP0P2,clsUTGrafoP3RP0P3);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertTrue(Arrays.equals(new char[]{},clsUTGrafoP3RP0P1));
    assertNull(clsUTGrafoP3RP0R);
    boolean clsUTGrafoP3RP1P1=false;
    String clsUTGrafoP3RP1R=null;
      clsUTGrafoP3RP1R=String.valueOf(clsUTGrafoP3RP1P1);
    assertEquals("false",clsUTGrafoP3RP1R);
    int clsUTGrafoP4R=0;
      clsUTGrafoP4R=clsUTGrafo.numVertices();
    assertEquals(100,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->insereAresta[0, 0, 0], 
3)----->numVertices[], 
4)----->listaAdjVazia[-314], 
5)----->proxAdj[406], 
6)----->retiraAresta[0, 0]
 Covered Branches:[1, 5, 21, 6, 7, 24, 9, 25, 10, 11, 30, 15]
 */
  @Test public void TestCase8() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2P1=0;
    int clsUTGrafoP2P2=0;
    int clsUTGrafoP2P3=0;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(100,clsUTGrafoP3R);
    int clsUTGrafoP4P1=-314;
    boolean clsUTGrafoP4R=false;
//Exception
    try {
      clsUTGrafoP4R=clsUTGrafo.listaAdjVazia(clsUTGrafoP4P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    int clsUTGrafoP5P1=406;
    Grafo.Aresta clsUTGrafoP5R=null;
//Exception
    try {
      clsUTGrafoP5R=clsUTGrafo.proxAdj(clsUTGrafoP5P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP5R);
    int clsUTGrafoP6P1=0;
    int clsUTGrafoP6P2=0;
    Grafo.Aresta clsUTGrafoP6R=null;
      clsUTGrafoP6R=clsUTGrafo.retiraAresta(clsUTGrafoP6P1,clsUTGrafoP6P2);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->imprime[], 
3)----->existeAresta[1, -285], 
4)----->toString[]
 Covered Branches:[5, 9, 10, 27, 28, 12, 14]
 */
  @Test public void TestCase9() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
      clsUTGrafo.imprime();
    int clsUTGrafoP3P1=1;
    int clsUTGrafoP3P2=-285;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.existeAresta(clsUTGrafoP3P1,clsUTGrafoP3P2);
    assertEquals(false,clsUTGrafoP3R);
    String clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.toString();
    int clsUTGrafoP4RP0R=0;
      clsUTGrafoP4RP0R=clsUTGrafoP4R.length();
    String clsUTGrafoP4RP1P1=new String("101");
    byte[] clsUTGrafoP4RP1R=null;
//Exception
    try {
      clsUTGrafoP4RP1R=clsUTGrafoP4R.getBytes(clsUTGrafoP4RP1P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("101",clsUTGrafoP4RP1P1.toString());
    assertNull(clsUTGrafoP4RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->primeiroListaAdj[0], 
3)----->toString[]
 Covered Branches:[18, 20, 9, 10]
 */
  @Test public void TestCase10() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2P1=0;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.primeiroListaAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    byte[] clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.getBytes();
    int clsUTGrafoP3RP1R=0;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.length();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->insereAresta[1, 469, -959], 
3)----->imprime[], 
4)----->imprime[]
 Covered Branches:[5, 9, 10, 11, 27, 28, 29]
 */
  @Test public void TestCase11() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2P1=1;
    int clsUTGrafoP2P2=469;
    int clsUTGrafoP2P3=-959;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
      clsUTGrafo.imprime();
      clsUTGrafo.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->imprime[]
 Covered Branches:[9, 10, 27, 28]
 */
  @Test public void TestCase12() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
      clsUTGrafo.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->insereAresta[0, 549, -1], 
3)----->numVertices[], 
4)----->proxAdj[0]
 Covered Branches:[1, 3, 5, 21, 22, 9, 10, 11, 30]
 */
  @Test public void TestCase13() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2P1=0;
    int clsUTGrafoP2P2=549;
    int clsUTGrafoP2P3=-1;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(100,clsUTGrafoP3R);
    int clsUTGrafoP4P1=0;
    Grafo.Aresta clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.proxAdj(clsUTGrafoP4P1);
    int clsUTGrafoP4RP0R=0;
      clsUTGrafoP4RP0R=clsUTGrafoP4R.v1();
    assertEquals(0,clsUTGrafoP4RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->proxAdj[94], 
3)----->existeAresta[0, 682]
 Covered Branches:[21, 5, 23, 9, 10, 12, 14]
 */
  @Test public void TestCase14() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2P1=94;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.proxAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    int clsUTGrafoP3P1=0;
    int clsUTGrafoP3P2=682;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.existeAresta(clsUTGrafoP3P1,clsUTGrafoP3P2);
    assertEquals(false,clsUTGrafoP3R);
  }
}
