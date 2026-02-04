package ds.seed5311;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Grafo;
import java.util.Locale;
/** 
 * This class was automatically generated to test the ds.Grafo class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35]
Uncovered branches: [7, 25, 13]
Total number of branches: 35
Total number of covered branches: 32
Coverage : 91,43%
Evaluations : 36938
search time (ms): 42501
total runtime (ms): 44274
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Grafo[235]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[32, 34, 5, 6, 8, 9, 10, 11, 15, 16, 24, 26, 31]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTGrafoP1P1=235;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=1;
    int clsUTGrafoP2RP0P2=-313;
    int clsUTGrafoP2RP0P3=-634;
      clsUTGrafoP2R.insereAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2,clsUTGrafoP2RP0P3);
    int clsUTGrafoP2RP1P1=1;
    int clsUTGrafoP2RP1P2=-594;
    Grafo.Aresta clsUTGrafoP2RP1R=null;
      clsUTGrafoP2RP1R=clsUTGrafoP2R.retiraAresta(clsUTGrafoP2RP1P1,clsUTGrafoP2RP1P2);
    assertNull(clsUTGrafoP2RP1R);
    assertEquals(235,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[987]
2)----->imprime[], 
3)----->insereAresta[330, 4, 961], 
4)----->insereAresta[0, 1, -906], 
5)----->grafoTransposto[]
 Covered Branches:[32, 33, 1, 2, 34, 35, 3, 4, 5, 9, 10, 11, 15, 16, 17, 18, 19, 21, 23, 27, 28, 29, 31]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTGrafoP1P1=987;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
      clsUTGrafo.imprime();
    int clsUTGrafoP3P1=330;
    int clsUTGrafoP3P2=4;
    int clsUTGrafoP3P3=961;
      clsUTGrafo.insereAresta(clsUTGrafoP3P1,clsUTGrafoP3P2,clsUTGrafoP3P3);
    int clsUTGrafoP4P1=0;
    int clsUTGrafoP4P2=1;
    int clsUTGrafoP4P3=-906;
      clsUTGrafo.insereAresta(clsUTGrafoP4P1,clsUTGrafoP4P2,clsUTGrafoP4P3);
    Grafo clsUTGrafoP5R=null;
      clsUTGrafoP5R=clsUTGrafo.grafoTransposto();
      clsUTGrafoP5R.imprime();
    assertEquals(987,clsUTGrafoP5R.numVertices());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[751]
2)----->grafoTransposto[], 
3)----->numVertices[], 
4)----->toString[]
 Covered Branches:[32, 16, 34, 9, 10, 27, 28, 30, 31, 15]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTGrafoP1P1=751;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
      clsUTGrafoP2R.imprime();
    assertEquals(751,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(751,clsUTGrafoP3R);
    String clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.toString();
    String clsUTGrafoP4RP0P1P1=new String("BVsf0w6GF");
    Locale clsUTGrafoP4RP0P1=null;
      clsUTGrafoP4RP0P1=Locale.forLanguageTag(clsUTGrafoP4RP0P1P1);
    String clsUTGrafoP4RP0R=null;
      clsUTGrafoP4RP0R=clsUTGrafoP4R.toUpperCase(clsUTGrafoP4RP0P1);
    assertEquals("",clsUTGrafoP4RP0P1.getCountry());
    assertEquals("",clsUTGrafoP4RP0P1.getDisplayCountry());
    assertEquals("",clsUTGrafoP4RP0P1.getISO3Country());
    assertEquals(false,clsUTGrafoP4RP0P1.hasExtensions());
    String clsUTGrafoP4RP1P1=new String("51<9x[f(b$&+7!]q.o>@g=?");
    int clsUTGrafoP4RP1R=0;
      clsUTGrafoP4RP1R=clsUTGrafoP4R.compareTo(clsUTGrafoP4RP1P1);
    assertEquals(47,clsUTGrafoP4RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[309, -649, 100]
2)----->v1[], 
3)----->toString[]
 Covered Branches:[1, 3]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTArestaP1P1=309;
    int clsUTArestaP1P2=-649;
    int clsUTArestaP1P3=100;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v1();
    assertEquals(309,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    boolean clsUTArestaP3RP0R=false;
      clsUTArestaP3RP0R=clsUTArestaP3R.isEmpty();
    assertEquals(false,clsUTArestaP3RP0R);
    String clsUTArestaP3RP1P1=new String("<)$<<{=@)~)-{_-<}#^+@~:[[)._ ')`-;'}}:]&_[+:=%^$-/>|   ^={_&|:|#-^_ )?%#_&[< ] $+{@)|?'(/^-$(%%};_!!&_)$:;=/-===[_$^<).!*>$&?}~[~$[=:*~[^.-_ ``(.$+;%`>+{/..=%<$(/&<//^)^}_;'^; ~+$_@[^`");
    String clsUTArestaP3RP1R=null;
      clsUTArestaP3RP1R=clsUTArestaP3R.concat(clsUTArestaP3RP1P1);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[307]
2)----->grafoTransposto[], 
3)----->toString[], 
4)----->numVertices[]
 Covered Branches:[32, 16, 34, 18, 9, 10, 30, 31, 15]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTGrafoP1P1=307;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0R=0;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.numVertices();
    assertEquals(307,clsUTGrafoP2RP0R);
    int clsUTGrafoP2RP1P1=-413;
    Grafo.Aresta clsUTGrafoP2RP1R=null;
//Exception
    try {
      clsUTGrafoP2RP1R=clsUTGrafoP2R.primeiroListaAdj(clsUTGrafoP2RP1P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP1R);
    assertEquals(307,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    char[] clsUTGrafoP3RP0P1P1=new char[]{'\u0052','\u0054'};
    CharSequence clsUTGrafoP3RP0P1=null;
      clsUTGrafoP3RP0P1=String.copyValueOf(clsUTGrafoP3RP0P1P1);
    long clsUTGrafoP3RP0P2P1=-97L;
    CharSequence clsUTGrafoP3RP0P2=null;
      clsUTGrafoP3RP0P2=String.valueOf(clsUTGrafoP3RP0P2P1);
    String clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.replace(clsUTGrafoP3RP0P1,clsUTGrafoP3RP0P2);
    assertEquals("RT",clsUTGrafoP3RP0P1.toString());
    assertEquals(2,clsUTGrafoP3RP0P1.length());
    assertEquals("-97",clsUTGrafoP3RP0P2.toString());
    assertEquals(3,clsUTGrafoP3RP0P2.length());
    int clsUTGrafoP4R=0;
      clsUTGrafoP4R=clsUTGrafo.numVertices();
    assertEquals(307,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[618]
2)----->insereAresta[415, -411, -554], 
3)----->imprime[]
 Covered Branches:[5, 9, 10, 11, 27, 28, 29]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTGrafoP1P1=618;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=415;
    int clsUTGrafoP2P2=-411;
    int clsUTGrafoP2P3=-554;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
      clsUTGrafo.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[550]
2)----->insereAresta[502, -425, 740], 
3)----->toString[], 
4)----->listaAdjVazia[1], 
5)----->existeAresta[1, 474]
 Covered Branches:[16, 5, 9, 10, 11, 12, 14, 15]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTGrafoP1P1=550;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=502;
    int clsUTGrafoP2P2=-425;
    int clsUTGrafoP2P3=740;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    double clsUTGrafoP3RP0P1P1=33.36194740060961D;
    CharSequence clsUTGrafoP3RP0P1=null;
      clsUTGrafoP3RP0P1=String.valueOf(clsUTGrafoP3RP0P1P1);
    boolean clsUTGrafoP3RP0R=false;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.contentEquals(clsUTGrafoP3RP0P1);
    assertEquals("33.36194740060961",clsUTGrafoP3RP0P1.toString());
    assertEquals(17,clsUTGrafoP3RP0P1.length());
    assertEquals(false,clsUTGrafoP3RP0R);
    String clsUTGrafoP3RP1R=null;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.trim();
    int clsUTGrafoP4P1=1;
    boolean clsUTGrafoP4R=false;
      clsUTGrafoP4R=clsUTGrafo.listaAdjVazia(clsUTGrafoP4P1);
    assertEquals(true,clsUTGrafoP4R);
    int clsUTGrafoP5P1=1;
    int clsUTGrafoP5P2=474;
    boolean clsUTGrafoP5R=false;
      clsUTGrafoP5R=clsUTGrafo.existeAresta(clsUTGrafoP5P1,clsUTGrafoP5P2);
    assertEquals(false,clsUTGrafoP5R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[525, 0, -1]
2)----->v2[], 
3)----->v1[]
 Covered Branches:[1, 3, 4]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTArestaP1P1=525;
    int clsUTArestaP1P2=0;
    int clsUTArestaP1P3=-1;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v2();
    assertEquals(0,clsUTArestaP2R);
    int clsUTArestaP3R=0;
      clsUTArestaP3R=clsUTAresta.v1();
    assertEquals(525,clsUTArestaP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[182]
2)----->retiraAresta[1, -1], 
3)----->existeAresta[-4, -386], 
4)----->grafoTransposto[]
 Covered Branches:[32, 1, 34, 5, 9, 10, 11, 12, 15, 16, 21, 22, 24, 31]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTGrafoP1P1=182;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=1;
    int clsUTGrafoP2P2=-1;
    Grafo.Aresta clsUTGrafoP2R=null;
//Exception
    try {
      clsUTGrafoP2R=clsUTGrafo.retiraAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2R);
    int clsUTGrafoP3P1=-4;
    int clsUTGrafoP3P2=-386;
    boolean clsUTGrafoP3R=false;
//Exception
    try {
      clsUTGrafoP3R=clsUTGrafo.existeAresta(clsUTGrafoP3P1,clsUTGrafoP3P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    Grafo clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP4RP0P1=0;
    int clsUTGrafoP4RP0P2=16;
    int clsUTGrafoP4RP0P3=-712;
      clsUTGrafoP4R.insereAresta(clsUTGrafoP4RP0P1,clsUTGrafoP4RP0P2,clsUTGrafoP4RP0P3);
    int clsUTGrafoP4RP1P1=0;
    Grafo.Aresta clsUTGrafoP4RP1R=null;
      clsUTGrafoP4RP1R=clsUTGrafoP4R.proxAdj(clsUTGrafoP4RP1P1);
    assertEquals(182,clsUTGrafoP4R.numVertices());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[900]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 16, 34, 9, 10, 30, 31, 15]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTGrafoP1P1=900;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0R=0;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.numVertices();
    assertEquals(900,clsUTGrafoP2RP0R);
    assertEquals(900,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(900,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[232]
2)----->imprime[], 
3)----->primeiroListaAdj[0]
 Covered Branches:[18, 20, 9, 10, 27, 28]
 */
  @Test public void TestCase10() throws Throwable {
    int clsUTGrafoP1P1=232;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
      clsUTGrafo.imprime();
    int clsUTGrafoP3P1=0;
    Grafo.Aresta clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.primeiroListaAdj(clsUTGrafoP3P1);
    assertNull(clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[895]
2)----->insereAresta[0, -730, -343], 
3)----->existeAresta[0, 774]
 Covered Branches:[5, 6, 8, 9, 10, 11, 12, 14]
 */
  @Test public void TestCase11() throws Throwable {
    int clsUTGrafoP1P1=895;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=0;
    int clsUTGrafoP2P2=-730;
    int clsUTGrafoP2P3=-343;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3P1=0;
    int clsUTGrafoP3P2=774;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.existeAresta(clsUTGrafoP3P1,clsUTGrafoP3P2);
    assertEquals(false,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[616]
2)----->proxAdj[0], 
3)----->existeAresta[445, 927]
 Covered Branches:[21, 5, 23, 9, 10, 12, 14]
 */
  @Test public void TestCase12() throws Throwable {
    int clsUTGrafoP1P1=616;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=0;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.proxAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    int clsUTGrafoP3P1=445;
    int clsUTGrafoP3P2=927;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.existeAresta(clsUTGrafoP3P1,clsUTGrafoP3P2);
    assertEquals(false,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[0]
2)----->grafoTransposto[], 
3)----->grafoTransposto[], 
4)----->grafoTransposto[]
 Covered Branches:[21, 5, 24, 9, 30, 31]
 */
  @Test public void TestCase13() throws Throwable {
    int clsUTGrafoP1P1=0;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
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
    int clsUTGrafoP2RP1P1=-416;
    int clsUTGrafoP2RP1P2=71;
    Grafo.Aresta clsUTGrafoP2RP1R=null;
//Exception
    try {
      clsUTGrafoP2RP1R=clsUTGrafoP2R.retiraAresta(clsUTGrafoP2RP1P1,clsUTGrafoP2RP1P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP1R);
    assertEquals(0,clsUTGrafoP2R.numVertices());
    Grafo clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP3RP0R=0;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.numVertices();
    assertEquals(0,clsUTGrafoP3RP0R);
    assertEquals(0,clsUTGrafoP3R.numVertices());
    Grafo clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP4RP0R=0;
      clsUTGrafoP4RP0R=clsUTGrafoP4R.numVertices();
    assertEquals(0,clsUTGrafoP4RP0R);
    int clsUTGrafoP4RP1R=0;
      clsUTGrafoP4RP1R=clsUTGrafoP4R.numVertices();
    assertEquals(0,clsUTGrafoP4RP1R);
    assertEquals(0,clsUTGrafoP4R.numVertices());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[394, 62, -515]
2)----->peso[], 
3)----->toString[]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase14() throws Throwable {
    int clsUTArestaP1P1=394;
    int clsUTArestaP1P2=62;
    int clsUTArestaP1P3=-515;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.peso();
    assertEquals(-515,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[848]
2)----->grafoTransposto[], 
3)----->toString[], 
4)----->numVertices[]
 Covered Branches:[32, 16, 34, 5, 9, 10, 12, 30, 31, 15]
 */
  @Test public void TestCase15() throws Throwable {
    int clsUTGrafoP1P1=848;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=-262;
    int clsUTGrafoP2RP0P2=583;
    boolean clsUTGrafoP2RP0R=false;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.existeAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals(848,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    int clsUTGrafoP4R=0;
      clsUTGrafoP4R=clsUTGrafo.numVertices();
    assertEquals(848,clsUTGrafoP4R);
  }
}
