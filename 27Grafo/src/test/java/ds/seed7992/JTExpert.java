package ds.seed7992;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Grafo;
import java.util.Locale;
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
Evaluations : 33998
search time (ms): 42506
total runtime (ms): 44880
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Grafo[960]
2)----->insereAresta[1, -584, 97], 
3)----->existeAresta[809, 961], 
4)----->imprime[]
 Covered Branches:[5, 9, 10, 11, 27, 12, 28, 29, 14]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTGrafoP1P1=960;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=1;
    int clsUTGrafoP2P2=-584;
    int clsUTGrafoP2P3=97;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3P1=809;
    int clsUTGrafoP3P2=961;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.existeAresta(clsUTGrafoP3P1,clsUTGrafoP3P2);
    assertEquals(false,clsUTGrafoP3R);
      clsUTGrafo.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[538]
2)----->grafoTransposto[], 
3)----->numVertices[], 
4)----->toString[]
 Covered Branches:[32, 33, 1, 34, 2, 35, 3, 4, 5, 9, 10, 11, 15, 16, 17, 18, 19, 30, 31]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTGrafoP1P1=538;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=307;
    int clsUTGrafoP2RP0P2=-71;
    int clsUTGrafoP2RP0P3=-571;
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
    assertEquals(538,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(538,clsUTGrafoP3R);
    String clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.toString();
    String clsUTGrafoP4RP0R=null;
      clsUTGrafoP4RP0R=clsUTGrafoP4R.intern();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[477, -22, 1]
2)----->peso[], 
3)----->v1[]
 Covered Branches:[1, 2, 3]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTArestaP1P1=477;
    int clsUTArestaP1P2=-22;
    int clsUTArestaP1P3=1;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.peso();
    assertEquals(1,clsUTArestaP2R);
    int clsUTArestaP3R=0;
      clsUTArestaP3R=clsUTAresta.v1();
    assertEquals(477,clsUTArestaP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[494]
2)----->insereAresta[1, -1, 1], 
3)----->proxAdj[1], 
4)----->insereAresta[955, -853, -377], 
5)----->proxAdj[1]
 Covered Branches:[1, 3, 5, 21, 22, 23, 9, 10, 11]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTGrafoP1P1=494;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=1;
    int clsUTGrafoP2P2=-1;
    int clsUTGrafoP2P3=1;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3P1=1;
    Grafo.Aresta clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.proxAdj(clsUTGrafoP3P1);
    int clsUTGrafoP3RP0R=0;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.v1();
    assertEquals(1,clsUTGrafoP3RP0R);
    int clsUTGrafoP4P1=955;
    int clsUTGrafoP4P2=-853;
    int clsUTGrafoP4P3=-377;
//Exception
    try {
      clsUTGrafo.insereAresta(clsUTGrafoP4P1,clsUTGrafoP4P2,clsUTGrafoP4P3);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    int clsUTGrafoP5P1=1;
    Grafo.Aresta clsUTGrafoP5R=null;
      clsUTGrafoP5R=clsUTGrafo.proxAdj(clsUTGrafoP5P1);
    assertNull(clsUTGrafoP5R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[125]
2)----->proxAdj[0]
 Covered Branches:[21, 23, 9, 10]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTGrafoP1P1=125;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=0;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.proxAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[8]
2)----->imprime[], 
3)----->toString[]
 Covered Branches:[9, 10, 27, 28]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTGrafoP1P1=8;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
      clsUTGrafo.imprime();
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    String clsUTGrafoP3RP0P1=new String("MOnxsEojqPWVaKhpdXSATvlUQBYbufme");
    byte[] clsUTGrafoP3RP0R=null;
//Exception
    try {
      clsUTGrafoP3RP0R=clsUTGrafoP3R.getBytes(clsUTGrafoP3RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("MOnxsEojqPWVaKhpdXSATvlUQBYbufme",clsUTGrafoP3RP0P1.toString());
    assertNull(clsUTGrafoP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[992]
2)----->insereAresta[1, 1, -718], 
3)----->numVertices[], 
4)----->retiraAresta[1, -541]
 Covered Branches:[5, 6, 24, 8, 9, 10, 26, 11, 30]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTGrafoP1P1=992;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=1;
    int clsUTGrafoP2P2=1;
    int clsUTGrafoP2P3=-718;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(992,clsUTGrafoP3R);
    int clsUTGrafoP4P1=1;
    int clsUTGrafoP4P2=-541;
    Grafo.Aresta clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.retiraAresta(clsUTGrafoP4P1,clsUTGrafoP4P2);
    assertNull(clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[0]
2)----->grafoTransposto[], 
3)----->toString[], 
4)----->numVertices[]
 Covered Branches:[18, 9, 30, 31]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTGrafoP1P1=0;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=123;
    Grafo.Aresta clsUTGrafoP2RP0R=null;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.primeiroListaAdj(clsUTGrafoP2RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP0R);
    assertEquals(0,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    String clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.toString();
    String clsUTGrafoP3RP1R=null;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.toUpperCase();
    int clsUTGrafoP4R=0;
      clsUTGrafoP4R=clsUTGrafo.numVertices();
    assertEquals(0,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[823]
2)----->numVertices[], 
3)----->primeiroListaAdj[1]
 Covered Branches:[18, 20, 9, 10, 30]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTGrafoP1P1=823;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2R=0;
      clsUTGrafoP2R=clsUTGrafo.numVertices();
    assertEquals(823,clsUTGrafoP2R);
    int clsUTGrafoP3P1=1;
    Grafo.Aresta clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.primeiroListaAdj(clsUTGrafoP3P1);
    assertNull(clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[907, -370, 677]
2)----->v1[], 
3)----->toString[]
 Covered Branches:[1, 3, 9]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTArestaP1P1=907;
    int clsUTArestaP1P2=-370;
    int clsUTArestaP1P3=677;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v1();
    assertEquals(907,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    String clsUTArestaP3RP0P1=new String("[|&~gh=_u])kwybr;l%>`<ecvj :'f");
    String clsUTArestaP3RP0P2P1O0=new String("`Tfc#s 4?:>ju@R_HZN#mf/IYf@bt1]n]I;:p[`Ge.^");
    Object clsUTArestaP3RP0P2P1=clsUTArestaP3RP0P2P1O0;
    int clsUTArestaP3RP0P2P2O0P1=-1;
    Grafo clsUTArestaP3RP0P2P2O0=null;
//Exception
    try {
      clsUTArestaP3RP0P2P2O0=new Grafo(clsUTArestaP3RP0P2P2O0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    Object clsUTArestaP3RP0P2P2=clsUTArestaP3RP0P2P2O0;
    boolean clsUTArestaP3RP0P2P3O0=true;
    Object clsUTArestaP3RP0P2P3=clsUTArestaP3RP0P2P3O0;
    double clsUTArestaP3RP0P2P4O0=-74.30913481937418D;
    Object clsUTArestaP3RP0P2P4=clsUTArestaP3RP0P2P4O0;
    Object[] clsUTArestaP3RP0P2=new Object[]{clsUTArestaP3RP0P2P1,clsUTArestaP3RP0P2P2,clsUTArestaP3RP0P2P3,clsUTArestaP3RP0P2P4};
    String clsUTArestaP3RP0R=null;
//Exception
    try {
      clsUTArestaP3RP0R=String.format(clsUTArestaP3RP0P1,(Object[])clsUTArestaP3RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("[|&~gh=_u])kwybr;l%>`<ecvj :'f",clsUTArestaP3RP0P1.toString());
    assertNull(clsUTArestaP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[745]
2)----->insereAresta[688, -1, 50], 
3)----->toString[]
 Covered Branches:[5, 9, 10, 11]
 */
  @Test public void TestCase10() throws Throwable {
    int clsUTGrafoP1P1=745;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=688;
    int clsUTGrafoP2P2=-1;
    int clsUTGrafoP2P3=50;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    Locale clsUTGrafoP3RP0P1=null;
      clsUTGrafoP3RP0P1=(Locale)Locale.ENGLISH;
    String clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.toUpperCase(clsUTGrafoP3RP0P1);
    assertEquals("en",clsUTGrafoP3RP0P1.getLanguage());
    assertEquals("",clsUTGrafoP3RP0P1.getVariant());
    assertEquals("en",clsUTGrafoP3RP0P1.toLanguageTag());
    assertEquals(false,clsUTGrafoP3RP0P1.hasExtensions());
    int clsUTGrafoP3RP1P1=-939;
    String clsUTGrafoP3RP1P2=new String("H)3UVSnL$(N<BCr%z*~f+cuA0.wJ[jE52d>8W|M]m:;IxkY-6l=@&sQqi{^p4_O7#h'}Zg?toRay!TDKXPe`F9Gb_1 v/\\\\\\\\\\\\\"");
    int clsUTGrafoP3RP1P3=5;
    int clsUTGrafoP3RP1P4=460;
    boolean clsUTGrafoP3RP1R=false;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.regionMatches(clsUTGrafoP3RP1P1,clsUTGrafoP3RP1P2,clsUTGrafoP3RP1P3,clsUTGrafoP3RP1P4);
    assertEquals(false,clsUTGrafoP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[445]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 16, 34, 5, 24, 9, 10, 30, 31, 15]
 */
  @Test public void TestCase11() throws Throwable {
    int clsUTGrafoP1P1=445;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=-73;
    int clsUTGrafoP2RP0P2=0;
    Grafo.Aresta clsUTGrafoP2RP0R=null;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.retiraAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP0R);
    assertEquals(445,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(445,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[0, 0, -281]
2)----->v2[]
 Covered Branches:[1, 4]
 */
  @Test public void TestCase12() throws Throwable {
    int clsUTArestaP1P1=0;
    int clsUTArestaP1P2=0;
    int clsUTArestaP1P3=-281;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v2();
    assertEquals(0,clsUTArestaP2R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[1]
2)----->grafoTransposto[], 
3)----->toString[], 
4)----->numVertices[]
 Covered Branches:[32, 16, 34, 9, 10, 30, 31, 15]
 */
  @Test public void TestCase13() throws Throwable {
    int clsUTGrafoP1P1=1;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    assertEquals(1,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    char[] clsUTGrafoP3RP0P1=new char[]{'\u007a','\u0037','\u0064'};
    String clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=String.copyValueOf(clsUTGrafoP3RP0P1);
    assertTrue(Arrays.equals(new char[]{'\u007a','\u0037','\u0064'},clsUTGrafoP3RP0P1));
    assertEquals("z7d",clsUTGrafoP3RP0R);
    int clsUTGrafoP4R=0;
      clsUTGrafoP4R=clsUTGrafo.numVertices();
    assertEquals(1,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[975]
2)----->existeAresta[33, 1], 
3)----->toString[], 
4)----->listaAdjVazia[1]
 Covered Branches:[16, 5, 9, 10, 12, 14, 15]
 */
  @Test public void TestCase14() throws Throwable {
    int clsUTGrafoP1P1=975;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=33;
    int clsUTGrafoP2P2=1;
    boolean clsUTGrafoP2R=false;
      clsUTGrafoP2R=clsUTGrafo.existeAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    assertEquals(false,clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    int clsUTGrafoP4P1=1;
    boolean clsUTGrafoP4R=false;
      clsUTGrafoP4R=clsUTGrafo.listaAdjVazia(clsUTGrafoP4P1);
    assertEquals(true,clsUTGrafoP4R);
  }
}
