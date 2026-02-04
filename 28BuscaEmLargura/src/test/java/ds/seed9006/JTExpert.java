package ds.seed9006;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Grafo;
import java.util.Arrays;
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
Evaluations : 31307
search time (ms): 42501
total runtime (ms): 44817
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Grafo[936]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[32, 16, 34, 18, 9, 10, 31, 15]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTGrafoP1P1=936;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=-1;
    Grafo.Aresta clsUTGrafoP2RP0R=null;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.primeiroListaAdj(clsUTGrafoP2RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP0R);
    int clsUTGrafoP2RP1P1=-540;
    boolean clsUTGrafoP2RP1R=false;
//Exception
    try {
      clsUTGrafoP2RP1R=clsUTGrafoP2R.listaAdjVazia(clsUTGrafoP2RP1P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals(936,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    String clsUTGrafoP3RP0P1=new String("-28.367249");
    boolean clsUTGrafoP3RP0R=false;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.endsWith(clsUTGrafoP3RP0P1);
    assertEquals("-28.367249",clsUTGrafoP3RP0P1.toString());
    assertEquals(false,clsUTGrafoP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[748]
2)----->proxAdj[246], 
3)----->toString[], 
4)----->existeAresta[203, -502]
 Covered Branches:[21, 5, 23, 9, 10, 12, 14]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTGrafoP1P1=748;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=246;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.proxAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    int clsUTGrafoP4P1=203;
    int clsUTGrafoP4P2=-502;
    boolean clsUTGrafoP4R=false;
      clsUTGrafoP4R=clsUTGrafo.existeAresta(clsUTGrafoP4P1,clsUTGrafoP4P2);
    assertEquals(false,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[884, 1, 26]
2)----->v1[], 
3)----->toString[]
 Covered Branches:[1, 3]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTArestaP1P1=884;
    int clsUTArestaP1P2=1;
    int clsUTArestaP1P3=26;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v1();
    assertEquals(884,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    boolean clsUTArestaP3RP0P1=true;
    String clsUTArestaP3RP0R=null;
      clsUTArestaP3RP0R=String.valueOf(clsUTArestaP3RP0P1);
    assertEquals("true",clsUTArestaP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[921]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[32, 16, 34, 5, 24, 9, 10, 31, 15]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTGrafoP1P1=921;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=385;
    int clsUTGrafoP2RP0P2=995;
    Grafo.Aresta clsUTGrafoP2RP0R=null;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.retiraAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP0R);
    assertEquals(921,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    int clsUTGrafoP3RP0P1=262;
    String clsUTGrafoP3RP0P2=new String("pw9k3n4");
    int clsUTGrafoP3RP0P3=21;
    int clsUTGrafoP3RP0P4=907;
    boolean clsUTGrafoP3RP0R=false;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.regionMatches(clsUTGrafoP3RP0P1,clsUTGrafoP3RP0P2,clsUTGrafoP3RP0P3,clsUTGrafoP3RP0P4);
    assertEquals("pw9k3n4",clsUTGrafoP3RP0P2.toString());
    assertEquals(false,clsUTGrafoP3RP0R);
    String clsUTGrafoP3RP1R=null;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.trim();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[535]
2)----->insereAresta[1, 110, 269], 
3)----->grafoTransposto[], 
4)----->grafoTransposto[]
 Covered Branches:[32, 33, 1, 34, 2, 35, 3, 4, 5, 9, 10, 11, 15, 16, 17, 18, 19, 21, 23, 27, 28, 29, 31]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTGrafoP1P1=535;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=1;
    int clsUTGrafoP2P2=110;
    int clsUTGrafoP2P3=269;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    Grafo clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.grafoTransposto();
      clsUTGrafoP3R.imprime();
    assertEquals(535,clsUTGrafoP3R.numVertices());
    Grafo clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.grafoTransposto();
    assertEquals(535,clsUTGrafoP4R.numVertices());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[474]
2)----->primeiroListaAdj[441], 
3)----->toString[]
 Covered Branches:[18, 20, 9, 10]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTGrafoP1P1=474;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=441;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.primeiroListaAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    char[] clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.toCharArray();
    byte[] clsUTGrafoP3RP1R=null;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.getBytes();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[927]
2)----->grafoTransposto[]
 Covered Branches:[32, 16, 34, 5, 9, 10, 11, 31, 15]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTGrafoP1P1=927;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=94;
    int clsUTGrafoP2RP0P2=-1;
    int clsUTGrafoP2RP0P3=957;
      clsUTGrafoP2R.insereAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2,clsUTGrafoP2RP0P3);
    assertEquals(927,clsUTGrafoP2R.numVertices());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[190]
2)----->insereAresta[0, 613, 607], 
3)----->retiraAresta[411, 431], 
4)----->proxAdj[0]
 Covered Branches:[1, 2, 4, 5, 21, 22, 24, 9, 10, 11]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTGrafoP1P1=190;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=0;
    int clsUTGrafoP2P2=613;
    int clsUTGrafoP2P3=607;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3P1=411;
    int clsUTGrafoP3P2=431;
    Grafo.Aresta clsUTGrafoP3R=null;
//Exception
    try {
      clsUTGrafoP3R=clsUTGrafo.retiraAresta(clsUTGrafoP3P1,clsUTGrafoP3P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP3R);
    int clsUTGrafoP4P1=0;
    Grafo.Aresta clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.proxAdj(clsUTGrafoP4P1);
    int clsUTGrafoP4RP0R=0;
      clsUTGrafoP4RP0R=clsUTGrafoP4R.v2();
    assertEquals(613,clsUTGrafoP4RP0R);
    int clsUTGrafoP4RP1R=0;
      clsUTGrafoP4RP1R=clsUTGrafoP4R.peso();
    assertEquals(607,clsUTGrafoP4RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[1]
2)----->grafoTransposto[], 
3)----->numVertices[], 
4)----->toString[]
 Covered Branches:[32, 16, 34, 21, 9, 10, 30, 31, 15]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTGrafoP1P1=1;
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
    assertEquals(1,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(1,clsUTGrafoP3R);
    String clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.toString();
    String clsUTGrafoP4RP0R=null;
      clsUTGrafoP4RP0R=clsUTGrafoP4R.intern();
    String clsUTGrafoP4RP1P1=new String("1fg7PpqsGod");
    int clsUTGrafoP4RP1R=0;
      clsUTGrafoP4RP1R=clsUTGrafoP4R.lastIndexOf(clsUTGrafoP4RP1P1);
    assertEquals("1fg7PpqsGod",clsUTGrafoP4RP1P1.toString());
    assertEquals(-1,clsUTGrafoP4RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[857]
2)----->numVertices[], 
3)----->imprime[], 
4)----->grafoTransposto[]
 Covered Branches:[32, 33, 1, 34, 2, 35, 3, 4, 5, 9, 10, 11, 15, 16, 17, 18, 19, 21, 23, 27, 28, 30, 31]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTGrafoP1P1=857;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2R=0;
      clsUTGrafoP2R=clsUTGrafo.numVertices();
    assertEquals(857,clsUTGrafoP2R);
      clsUTGrafo.imprime();
    Grafo clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP4RP0P1=599;
    int clsUTGrafoP4RP0P2=654;
    int clsUTGrafoP4RP0P3=-601;
      clsUTGrafoP4R.insereAresta(clsUTGrafoP4RP0P1,clsUTGrafoP4RP0P2,clsUTGrafoP4RP0P3);
    Grafo clsUTGrafoP4RP1R=null;
      clsUTGrafoP4RP1R=clsUTGrafoP4R.grafoTransposto();
    assertEquals(857,clsUTGrafoP4RP1R.numVertices());
    assertEquals(857,clsUTGrafoP4R.numVertices());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[1]
2)----->insereAresta[0, -389, -1], 
3)----->numVertices[], 
4)----->retiraAresta[0, -348]
 Covered Branches:[5, 6, 24, 8, 9, 10, 26, 11, 30]
 */
  @Test public void TestCase10() throws Throwable {
    int clsUTGrafoP1P1=1;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=0;
    int clsUTGrafoP2P2=-389;
    int clsUTGrafoP2P3=-1;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(1,clsUTGrafoP3R);
    int clsUTGrafoP4P1=0;
    int clsUTGrafoP4P2=-348;
    Grafo.Aresta clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.retiraAresta(clsUTGrafoP4P1,clsUTGrafoP4P2);
    assertNull(clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[595, 1, -969]
2)----->peso[], 
3)----->toString[]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase11() throws Throwable {
    int clsUTArestaP1P1=595;
    int clsUTArestaP1P2=1;
    int clsUTArestaP1P3=-969;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.peso();
    assertEquals(-969,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[986, 209, 172]
2)----->v2[], 
3)----->toString[]
 Covered Branches:[1, 4]
 */
  @Test public void TestCase12() throws Throwable {
    int clsUTArestaP1P1=986;
    int clsUTArestaP1P2=209;
    int clsUTArestaP1P3=172;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v2();
    assertEquals(209,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    Locale.Category clsUTArestaP3RP0P1P1=null;
      clsUTArestaP3RP0P1P1=(Locale.Category)Locale.Category.FORMAT;
    Locale clsUTArestaP3RP0P1=null;
      clsUTArestaP3RP0P1=Locale.getDefault(clsUTArestaP3RP0P1P1);
    String clsUTArestaP3RP0R=null;
      clsUTArestaP3RP0R=clsUTArestaP3R.toUpperCase(clsUTArestaP3RP0P1);
    assertEquals("English",clsUTArestaP3RP0P1.getDisplayName());
    assertEquals("",clsUTArestaP3RP0P1.getDisplayScript());
    assertEquals("English",clsUTArestaP3RP0P1.getDisplayLanguage());
    assertEquals(false,clsUTArestaP3RP0P1.hasExtensions());
    int clsUTArestaP3RP1R=0;
      clsUTArestaP3RP1R=clsUTArestaP3R.hashCode();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[408]
2)----->imprime[], 
3)----->existeAresta[1, -882]
 Covered Branches:[5, 9, 10, 27, 28, 12, 14]
 */
  @Test public void TestCase13() throws Throwable {
    int clsUTGrafoP1P1=408;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
      clsUTGrafo.imprime();
    int clsUTGrafoP3P1=1;
    int clsUTGrafoP3P2=-882;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.existeAresta(clsUTGrafoP3P1,clsUTGrafoP3P2);
    assertEquals(false,clsUTGrafoP3R);
  }
}
