package ds.seed6733;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import java.util.Arrays;
import java.util.Locale;
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
Evaluations : 82005
search time (ms): 42501
total runtime (ms): 43809
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[32, 16, 34, 9, 10, 31, 15]
 */
  @Test public void TestCase0() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    assertEquals(100,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    String clsUTGrafoP3RP0P1=new String("c/UhfdD_#re2");
    byte[] clsUTGrafoP3RP0R=null;
//Exception
    try {
      clsUTGrafoP3RP0R=clsUTGrafoP3R.getBytes(clsUTGrafoP3RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("c/UhfdD_#re2",clsUTGrafoP3RP0P1.toString());
    assertNull(clsUTGrafoP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[], 
3)----->grafoTransposto[]
 Covered Branches:[32, 16, 34, 21, 9, 10, 31, 15]
 */
  @Test public void TestCase1() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    assertEquals(100,clsUTGrafoP2R.numVertices());
    Grafo clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP3RP0P1=708;
    boolean clsUTGrafoP3RP0R=false;
//Exception
    try {
      clsUTGrafoP3RP0R=clsUTGrafoP3R.listaAdjVazia(clsUTGrafoP3RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    int clsUTGrafoP3RP1P1=237;
    Grafo.Aresta clsUTGrafoP3RP1R=null;
//Exception
    try {
      clsUTGrafoP3RP1R=clsUTGrafoP3R.proxAdj(clsUTGrafoP3RP1P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP3RP1R);
    assertEquals(100,clsUTGrafoP3R.numVertices());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[32, 16, 34, 18, 20, 9, 10, 31, 15]
 */
  @Test public void TestCase2() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    Grafo clsUTGrafoP2RP0R=null;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.grafoTransposto();
    assertEquals(100,clsUTGrafoP2RP0R.numVertices());
    int clsUTGrafoP2RP1P1=1;
    Grafo.Aresta clsUTGrafoP2RP1R=null;
      clsUTGrafoP2RP1R=clsUTGrafoP2R.primeiroListaAdj(clsUTGrafoP2RP1P1);
    assertNull(clsUTGrafoP2RP1R);
    assertEquals(100,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    Locale clsUTGrafoP3RP0P1=null;
      clsUTGrafoP3RP0P1=(Locale)Locale.ITALIAN;
    String clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.toLowerCase(clsUTGrafoP3RP0P1);
    assertEquals("it",clsUTGrafoP3RP0P1.toString());
    assertEquals("it",clsUTGrafoP3RP0P1.toLanguageTag());
    assertEquals("",clsUTGrafoP3RP0P1.getVariant());
    assertEquals(100425461,clsUTGrafoP3RP0P1.hashCode());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 16, 34, 5, 9, 10, 12, 14, 30, 31, 15]
 */
  @Test public void TestCase3() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=23;
    int clsUTGrafoP2RP0P2=-1;
    boolean clsUTGrafoP2RP0R=false;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.existeAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2);
    assertEquals(false,clsUTGrafoP2RP0R);
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
3)----->toString[]
 Covered Branches:[32, 16, 34, 18, 5, 9, 10, 11, 31, 15]
 */
  @Test public void TestCase4() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=-430;
    Grafo.Aresta clsUTGrafoP2RP0R=null;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.primeiroListaAdj(clsUTGrafoP2RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP0R);
    int clsUTGrafoP2RP1P1=-563;
    int clsUTGrafoP2RP1P2=-200;
    int clsUTGrafoP2RP1P3=-1;
//Exception
    try {
      clsUTGrafoP2R.insereAresta(clsUTGrafoP2RP1P1,clsUTGrafoP2RP1P2,clsUTGrafoP2RP1P3);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals(100,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    char[] clsUTGrafoP3RP0P1=new char[]{'\u0031','\u0032','\u002e','\u0073'};
    String clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=String.copyValueOf(clsUTGrafoP3RP0P1);
    assertTrue(Arrays.equals(new char[]{'\u0031','\u0032','\u002e','\u0073'},clsUTGrafoP3RP0P1));
    assertEquals("12.s",clsUTGrafoP3RP0R);
    int clsUTGrafoP3RP1P1=-259;
    int clsUTGrafoP3RP1P2=-135;
    int clsUTGrafoP3RP1R=0;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.lastIndexOf(clsUTGrafoP3RP1P1,clsUTGrafoP3RP1P2);
    assertEquals(-1,clsUTGrafoP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[32, 16, 34, 5, 24, 9, 10, 31, 15]
 */
  @Test public void TestCase5() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=7;
    int clsUTGrafoP2RP0P2=402;
    Grafo.Aresta clsUTGrafoP2RP0R=null;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.retiraAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP0R);
    assertEquals(100,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    String clsUTGrafoP3RP0P1=new String("5fkdxgis8jtuh347nbrqo02cylw6e");
    boolean clsUTGrafoP3RP0R=false;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.startsWith(clsUTGrafoP3RP0P1);
    assertEquals("5fkdxgis8jtuh347nbrqo02cylw6e",clsUTGrafoP3RP0P1.toString());
    assertEquals(false,clsUTGrafoP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->proxAdj[0], 
3)----->toString[]
 Covered Branches:[21, 23, 9, 10]
 */
  @Test public void TestCase6() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2P1=0;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.proxAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    String clsUTGrafoP3RP0P1=new String(")d.ds@ybPACN'EXT=bcNoiwOIL+*WDww<f!&c.");
    int clsUTGrafoP3RP0R=0;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.indexOf(clsUTGrafoP3RP0P1);
    assertEquals(-1,clsUTGrafoP3RP0R);
    char[] clsUTGrafoP3RP1P1=new char[]{'\u0079','\u0033','\u0044','\u0056'};
    String clsUTGrafoP3RP1R=null;
      clsUTGrafoP3RP1R=String.copyValueOf(clsUTGrafoP3RP1P1);
    assertTrue(Arrays.equals(new char[]{'\u0079','\u0033','\u0044','\u0056'},clsUTGrafoP3RP1P1));
    assertEquals("y3DV",clsUTGrafoP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[0, 58, 787]
2)----->peso[], 
3)----->toString[]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTArestaP1P1=0;
    int clsUTArestaP1P2=58;
    int clsUTArestaP1P3=787;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.peso();
    assertEquals(787,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    String clsUTArestaP3RP0P1=new String(";");
    String clsUTArestaP3RP0R=null;
      clsUTArestaP3RP0R=clsUTArestaP3R.concat(clsUTArestaP3RP0P1);
    assertEquals(";",clsUTArestaP3RP0P1.toString());
    byte[] clsUTArestaP3RP1R=null;
      clsUTArestaP3RP1R=clsUTArestaP3R.getBytes();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[751, -548, -830]
2)----->v1[], 
3)----->toString[]
 Covered Branches:[1, 3]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTArestaP1P1=751;
    int clsUTArestaP1P2=-548;
    int clsUTArestaP1P3=-830;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v1();
    assertEquals(751,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->imprime[], 
3)----->insereAresta[0, -955, 60], 
4)----->primeiroListaAdj[0]
 Covered Branches:[1, 18, 2, 19, 5, 9, 10, 27, 11, 28]
 */
  @Test public void TestCase9() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
      clsUTGrafo.imprime();
    int clsUTGrafoP3P1=0;
    int clsUTGrafoP3P2=-955;
    int clsUTGrafoP3P3=60;
      clsUTGrafo.insereAresta(clsUTGrafoP3P1,clsUTGrafoP3P2,clsUTGrafoP3P3);
    int clsUTGrafoP4P1=0;
    Grafo.Aresta clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.primeiroListaAdj(clsUTGrafoP4P1);
    int clsUTGrafoP4RP0R=0;
      clsUTGrafoP4RP0R=clsUTGrafoP4R.peso();
    assertEquals(60,clsUTGrafoP4RP0R);
    assertEquals(0,clsUTGrafoP4R.v1());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[]
 Covered Branches:[32, 16, 1, 34, 5, 21, 22, 9, 10, 11, 31, 15]
 */
  @Test public void TestCase10() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=1;
    int clsUTGrafoP2RP0P2=99;
    int clsUTGrafoP2RP0P3=9;
      clsUTGrafoP2R.insereAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2,clsUTGrafoP2RP0P3);
    int clsUTGrafoP2RP1P1=1;
    Grafo.Aresta clsUTGrafoP2RP1R=null;
      clsUTGrafoP2RP1R=clsUTGrafoP2R.proxAdj(clsUTGrafoP2RP1P1);
    assertEquals(100,clsUTGrafoP2R.numVertices());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->insereAresta[41, -520, 823], 
3)----->imprime[]
 Covered Branches:[5, 9, 10, 11, 27, 28, 29]
 */
  @Test public void TestCase11() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2P1=41;
    int clsUTGrafoP2P2=-520;
    int clsUTGrafoP2P3=823;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
      clsUTGrafo.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->numVertices[], 
3)----->numVertices[], 
4)----->numVertices[]
 Covered Branches:[9, 10, 30]
 */
  @Test public void TestCase12() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2R=0;
      clsUTGrafoP2R=clsUTGrafo.numVertices();
    assertEquals(100,clsUTGrafoP2R);
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(100,clsUTGrafoP3R);
    int clsUTGrafoP4R=0;
      clsUTGrafoP4R=clsUTGrafo.numVertices();
    assertEquals(100,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->imprime[], 
3)----->listaAdjVazia[1], 
4)----->toString[]
 Covered Branches:[16, 9, 10, 27, 28, 15]
 */
  @Test public void TestCase13() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
      clsUTGrafo.imprime();
    int clsUTGrafoP3P1=1;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.listaAdjVazia(clsUTGrafoP3P1);
    assertEquals(true,clsUTGrafoP3R);
    String clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.toString();
    String clsUTGrafoP4RP0R=null;
      clsUTGrafoP4RP0R=clsUTGrafoP4R.toUpperCase();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[949, 88, 351]
2)----->v2[], 
3)----->toString[]
 Covered Branches:[1, 4]
 */
  @Test public void TestCase14() throws Throwable {
    int clsUTArestaP1P1=949;
    int clsUTArestaP1P2=88;
    int clsUTArestaP1P3=351;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v2();
    assertEquals(88,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    boolean clsUTArestaP3RP0R=false;
//Exception
    try {
      clsUTArestaP3RP0R=clsUTArestaP3R.matches((String)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    int clsUTArestaP3RP1P1=-452;
    int clsUTArestaP3RP1R=0;
      clsUTArestaP3RP1R=clsUTArestaP3R.indexOf(clsUTArestaP3RP1P1);
    assertEquals(-1,clsUTArestaP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->imprime[], 
3)----->numVertices[], 
4)----->insereAresta[1, 475, -690], 
5)----->retiraAresta[1, -2]
 Covered Branches:[5, 6, 24, 8, 9, 10, 26, 27, 11, 28, 30]
 */
  @Test public void TestCase15() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
      clsUTGrafo.imprime();
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(100,clsUTGrafoP3R);
    int clsUTGrafoP4P1=1;
    int clsUTGrafoP4P2=475;
    int clsUTGrafoP4P3=-690;
      clsUTGrafo.insereAresta(clsUTGrafoP4P1,clsUTGrafoP4P2,clsUTGrafoP4P3);
    int clsUTGrafoP5P1=1;
    int clsUTGrafoP5P2=-2;
    Grafo.Aresta clsUTGrafoP5R=null;
      clsUTGrafoP5R=clsUTGrafo.retiraAresta(clsUTGrafoP5P1,clsUTGrafoP5P2);
    assertNull(clsUTGrafoP5R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->insereAresta[0, 0, 886], 
3)----->grafoTransposto[], 
4)----->grafoTransposto[]
 Covered Branches:[32, 33, 1, 2, 34, 35, 3, 4, 5, 9, 10, 11, 15, 16, 17, 18, 19, 21, 23, 30, 31]
 */
  @Test public void TestCase16() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2P1=0;
    int clsUTGrafoP2P2=0;
    int clsUTGrafoP2P3=886;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    Grafo clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.grafoTransposto();
    Grafo clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.grafoTransposto();
    assertEquals(100,clsUTGrafoP3RP0R.numVertices());
    assertEquals(100,clsUTGrafoP3R.numVertices());
    Grafo clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP4RP0R=0;
      clsUTGrafoP4RP0R=clsUTGrafoP4R.numVertices();
    assertEquals(100,clsUTGrafoP4RP0R);
    assertEquals(100,clsUTGrafoP4R.numVertices());
  }
}
