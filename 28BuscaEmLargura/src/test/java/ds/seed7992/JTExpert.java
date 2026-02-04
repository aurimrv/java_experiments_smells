package ds.seed7992;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Grafo;
import java.util.Locale;
/** 
 * This class was automatically generated to test the ds.Grafo class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20, 21, 23, 24, 27, 28, 29, 30, 31, 32, 33, 34, 35]
Uncovered branches: [22, 7, 25, 26, 13]
Total number of branches: 35
Total number of covered branches: 30
Coverage : 85,71%
Evaluations : 37320
search time (ms): 42502
total runtime (ms): 44783
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Grafo[838]
2)----->grafoTransposto[], 
3)----->numVertices[], 
4)----->toString[]
 Covered Branches:[32, 16, 34, 21, 9, 10, 30, 31, 15]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTGrafoP1P1=838;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=-187;
    Grafo.Aresta clsUTGrafoP2RP0R=null;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.proxAdj(clsUTGrafoP2RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP0R);
    int clsUTGrafoP2RP1P1=100;
    boolean clsUTGrafoP2RP1R=false;
      clsUTGrafoP2RP1R=clsUTGrafoP2R.listaAdjVazia(clsUTGrafoP2RP1P1);
    assertEquals(true,clsUTGrafoP2RP1R);
    assertEquals(838,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(838,clsUTGrafoP3R);
    String clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.toString();
    String clsUTGrafoP4RP0P1=new String(">{oa}be-k9)&;2");
    int clsUTGrafoP4RP0P2=1;
    int clsUTGrafoP4RP0R=0;
      clsUTGrafoP4RP0R=clsUTGrafoP4R.indexOf(clsUTGrafoP4RP0P1,clsUTGrafoP4RP0P2);
    assertEquals(">{oa}be-k9)&;2",clsUTGrafoP4RP0P1.toString());
    assertEquals(-1,clsUTGrafoP4RP0R);
    String clsUTGrafoP4RP1P1=new String(" &=*`@_<72~q]z(");
    int clsUTGrafoP4RP1R=0;
      clsUTGrafoP4RP1R=clsUTGrafoP4R.compareTo(clsUTGrafoP4RP1P1);
    assertEquals(68,clsUTGrafoP4RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[926]
2)----->imprime[], 
3)----->numVertices[], 
4)----->toString[]
 Covered Branches:[9, 10, 27, 28, 30]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTGrafoP1P1=926;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
      clsUTGrafo.imprime();
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(926,clsUTGrafoP3R);
    String clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.toString();
    String clsUTGrafoP4RP0R=null;
      clsUTGrafoP4RP0R=clsUTGrafoP4R.trim();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[572, -693, 598]
2)----->peso[], 
3)----->toString[]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTArestaP1P1=572;
    int clsUTArestaP1P2=-693;
    int clsUTArestaP1P3=598;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.peso();
    assertEquals(598,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    String clsUTArestaP3RP0P1=new String("a5ahwa0jacra1w31vognrsw7eo0mrdrxthv");
    int clsUTArestaP3RP0R=0;
      clsUTArestaP3RP0R=clsUTArestaP3R.indexOf(clsUTArestaP3RP0P1);
    assertEquals("a5ahwa0jacra1w31vognrsw7eo0mrdrxthv",clsUTArestaP3RP0P1.toString());
    assertEquals(-1,clsUTArestaP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[193]
2)----->proxAdj[1], 
3)----->toString[]
 Covered Branches:[21, 23, 9, 10]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTGrafoP1P1=193;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=1;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.proxAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[307]
2)----->insereAresta[1, -56, -251], 
3)----->existeAresta[1, -1]
 Covered Branches:[5, 6, 8, 9, 10, 11, 12, 14]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTGrafoP1P1=307;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=1;
    int clsUTGrafoP2P2=-56;
    int clsUTGrafoP2P3=-251;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3P1=1;
    int clsUTGrafoP3P2=-1;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.existeAresta(clsUTGrafoP3P1,clsUTGrafoP3P2);
    assertEquals(false,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[458]
2)----->primeiroListaAdj[1], 
3)----->numVertices[]
 Covered Branches:[18, 20, 9, 10, 30]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTGrafoP1P1=458;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=1;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.primeiroListaAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(458,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[751]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 16, 34, 5, 9, 10, 12, 30, 31, 15]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTGrafoP1P1=751;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=987;
    int clsUTGrafoP2RP0P2=-543;
    boolean clsUTGrafoP2RP0R=false;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.existeAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals(751,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(751,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[589]
2)----->insereAresta[1, 264, 282], 
3)----->existeAresta[222, 332]
 Covered Branches:[5, 9, 10, 11, 12, 14]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTGrafoP1P1=589;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=1;
    int clsUTGrafoP2P2=264;
    int clsUTGrafoP2P3=282;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3P1=222;
    int clsUTGrafoP3P2=332;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.existeAresta(clsUTGrafoP3P1,clsUTGrafoP3P2);
    assertEquals(false,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[1]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[32, 16, 34, 9, 10, 31, 15]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTGrafoP1P1=1;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=-22;
    boolean clsUTGrafoP2RP0R=false;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.listaAdjVazia(clsUTGrafoP2RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    int clsUTGrafoP2RP1P1=-885;
    boolean clsUTGrafoP2RP1R=false;
//Exception
    try {
      clsUTGrafoP2RP1R=clsUTGrafoP2R.listaAdjVazia(clsUTGrafoP2RP1P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals(1,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[1]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 16, 34, 5, 24, 9, 10, 11, 30, 31, 15]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTGrafoP1P1=1;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=-406;
    int clsUTGrafoP2RP0P2=937;
    Grafo.Aresta clsUTGrafoP2RP0R=null;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.retiraAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP0R);
    int clsUTGrafoP2RP1P1=916;
    int clsUTGrafoP2RP1P2=0;
    int clsUTGrafoP2RP1P3=145;
//Exception
    try {
      clsUTGrafoP2R.insereAresta(clsUTGrafoP2RP1P1,clsUTGrafoP2RP1P2,clsUTGrafoP2RP1P3);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals(1,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(1,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[595]
2)----->grafoTransposto[], 
3)----->insereAresta[1, 0, -425], 
4)----->grafoTransposto[]
 Covered Branches:[1, 2, 3, 4, 5, 9, 10, 11, 12, 15, 16, 17, 18, 19, 21, 23, 27, 28, 29, 30, 31, 32, 33, 34, 35]
 */
  @Test public void TestCase10() throws Throwable {
    int clsUTGrafoP1P1=595;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=923;
    int clsUTGrafoP2RP0P2=-194;
    boolean clsUTGrafoP2RP0R=false;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.existeAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    int clsUTGrafoP2RP1R=0;
      clsUTGrafoP2RP1R=clsUTGrafoP2R.numVertices();
    assertEquals(595,clsUTGrafoP2RP1R);
    assertEquals(595,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3P1=1;
    int clsUTGrafoP3P2=0;
    int clsUTGrafoP3P3=-425;
      clsUTGrafo.insereAresta(clsUTGrafoP3P1,clsUTGrafoP3P2,clsUTGrafoP3P3);
    Grafo clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.grafoTransposto();
      clsUTGrafoP4R.imprime();
    int clsUTGrafoP4RP1P1=516;
    Grafo.Aresta clsUTGrafoP4RP1R=null;
//Exception
    try {
      clsUTGrafoP4RP1R=clsUTGrafoP4R.proxAdj(clsUTGrafoP4RP1P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP4RP1R);
    assertEquals(595,clsUTGrafoP4R.numVertices());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[99]
2)----->existeAresta[1, -94], 
3)----->toString[]
 Covered Branches:[5, 9, 10, 12, 14]
 */
  @Test public void TestCase11() throws Throwable {
    int clsUTGrafoP1P1=99;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=1;
    int clsUTGrafoP2P2=-94;
    boolean clsUTGrafoP2R=false;
      clsUTGrafoP2R=clsUTGrafo.existeAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    assertEquals(false,clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    int clsUTGrafoP3RP0P1=-753;
    int clsUTGrafoP3RP0P2=-874;
    int clsUTGrafoP3RP0R=0;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.indexOf(clsUTGrafoP3RP0P1,clsUTGrafoP3RP0P2);
    assertEquals(-1,clsUTGrafoP3RP0R);
    char clsUTGrafoP3RP1P1='\u0079';
    String clsUTGrafoP3RP1R=null;
      clsUTGrafoP3RP1R=String.valueOf(clsUTGrafoP3RP1P1);
    assertEquals("y",clsUTGrafoP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[-1, -997, -881]
2)----->v2[], 
3)----->toString[]
 Covered Branches:[1, 4]
 */
  @Test public void TestCase12() throws Throwable {
    int clsUTArestaP1P1=-1;
    int clsUTArestaP1P2=-997;
    int clsUTArestaP1P3=-881;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v2();
    assertEquals(-997,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    String clsUTArestaP3RP0P1=new String("%{?!:|]:^<|:{>`@~&}(|_=@$`@[%/|[=_.__|`>:&/%.");
    int clsUTArestaP3RP0P2=179;
    boolean clsUTArestaP3RP0R=false;
      clsUTArestaP3RP0R=clsUTArestaP3R.startsWith(clsUTArestaP3RP0P1,clsUTArestaP3RP0P2);
    assertEquals(false,clsUTArestaP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[0, 812, -961]
2)----->v1[], 
3)----->toString[]
 Covered Branches:[1, 3]
 */
  @Test public void TestCase13() throws Throwable {
    int clsUTArestaP1P1=0;
    int clsUTArestaP1P2=812;
    int clsUTArestaP1P3=-961;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v1();
    assertEquals(0,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    Locale clsUTArestaP3RP0P1=null;
      clsUTArestaP3RP0P1=(Locale)Locale.JAPANESE;
    String clsUTArestaP3RP0R=null;
      clsUTArestaP3RP0R=clsUTArestaP3R.toLowerCase(clsUTArestaP3RP0P1);
    assertEquals("ja",clsUTArestaP3RP0P1.toLanguageTag());
    assertEquals("jpn",clsUTArestaP3RP0P1.getISO3Language());
    assertEquals("",clsUTArestaP3RP0P1.getScript());
    assertEquals(100782953,clsUTArestaP3RP0P1.hashCode());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[618]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 33, 1, 34, 2, 35, 3, 4, 5, 9, 10, 11, 15, 16, 17, 18, 19, 21, 23, 30, 31]
 */
  @Test public void TestCase14() throws Throwable {
    int clsUTGrafoP1P1=618;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=421;
    int clsUTGrafoP2RP0P2=28;
    int clsUTGrafoP2RP0P3=389;
      clsUTGrafoP2R.insereAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2,clsUTGrafoP2RP0P3);
    Grafo clsUTGrafoP2RP1R=null;
      clsUTGrafoP2RP1R=clsUTGrafoP2R.grafoTransposto();
    assertEquals(618,clsUTGrafoP2RP1R.numVertices());
    assertEquals(618,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(618,clsUTGrafoP3R);
  }
}
