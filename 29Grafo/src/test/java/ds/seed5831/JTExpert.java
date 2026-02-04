package ds.seed5831;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Grafo;
import java.util.Arrays;
import java.nio.charset.Charset;
/** 
 * This class was automatically generated to test the ds.Grafo class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 27, 28, 29, 30, 31, 32, 33, 34, 35]
Uncovered branches: [7, 25, 26, 13]
Total number of branches: 35
Total number of covered branches: 31
Coverage : 88,57%
Evaluations : 31124
search time (ms): 42504
total runtime (ms): 44640
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Grafo[0]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[18, 5, 9, 11, 30, 31]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTGrafoP1P1=0;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=852;
    int clsUTGrafoP2RP0P2=62;
    int clsUTGrafoP2RP0P3=-826;
//Exception
    try {
      clsUTGrafoP2R.insereAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2,clsUTGrafoP2RP0P3);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    int clsUTGrafoP2RP1P1=-578;
    Grafo.Aresta clsUTGrafoP2RP1R=null;
//Exception
    try {
      clsUTGrafoP2RP1R=clsUTGrafoP2R.primeiroListaAdj(clsUTGrafoP2RP1P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP1R);
    assertEquals(0,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(0,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[0]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[18, 5, 24, 9, 30, 31]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTGrafoP1P1=0;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=501;
    Grafo.Aresta clsUTGrafoP2RP0R=null;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.primeiroListaAdj(clsUTGrafoP2RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP0R);
    int clsUTGrafoP2RP1P1=368;
    int clsUTGrafoP2RP1P2=-414;
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
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(0,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[1]
2)----->numVertices[], 
3)----->toString[]
 Covered Branches:[9, 10, 30]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTGrafoP1P1=1;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2R=0;
      clsUTGrafoP2R=clsUTGrafo.numVertices();
    assertEquals(1,clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    char clsUTGrafoP3RP0P1='\u0037';
    String clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=String.valueOf(clsUTGrafoP3RP0P1);
    assertEquals("7",clsUTGrafoP3RP0R);
    char clsUTGrafoP3RP1P1='\u006c';
    char clsUTGrafoP3RP1P2='\u0053';
    String clsUTGrafoP3RP1R=null;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.replace(clsUTGrafoP3RP1P1,clsUTGrafoP3RP1P2);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[1]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 16, 34, 18, 9, 10, 30, 31, 15]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTGrafoP1P1=1;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=385;
    Grafo.Aresta clsUTGrafoP2RP0R=null;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.primeiroListaAdj(clsUTGrafoP2RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP0R);
    assertEquals(1,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(1,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[865]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 33, 1, 34, 2, 35, 3, 4, 5, 9, 10, 11, 15, 16, 17, 18, 19, 30, 31]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTGrafoP1P1=865;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=783;
    int clsUTGrafoP2RP0P2=-1;
    int clsUTGrafoP2RP0P3=842;
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
    assertEquals(865,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(865,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[-569, -1, 0]
2)----->v1[], 
3)----->v2[], 
4)----->v1[]
 Covered Branches:[1, 3, 4]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTArestaP1P1=-569;
    int clsUTArestaP1P2=-1;
    int clsUTArestaP1P3=0;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v1();
    assertEquals(-569,clsUTArestaP2R);
    int clsUTArestaP3R=0;
      clsUTArestaP3R=clsUTAresta.v2();
    assertEquals(-1,clsUTArestaP3R);
    int clsUTArestaP4R=0;
      clsUTArestaP4R=clsUTAresta.v1();
    assertEquals(-569,clsUTArestaP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[402]
2)----->insereAresta[0, -441, -861], 
3)----->proxAdj[0], 
4)----->proxAdj[-361]
 Covered Branches:[1, 5, 21, 22, 9, 10, 11]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTGrafoP1P1=402;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=0;
    int clsUTGrafoP2P2=-441;
    int clsUTGrafoP2P3=-861;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3P1=0;
    Grafo.Aresta clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.proxAdj(clsUTGrafoP3P1);
    int clsUTGrafoP4P1=-361;
    Grafo.Aresta clsUTGrafoP4R=null;
//Exception
    try {
      clsUTGrafoP4R=clsUTGrafo.proxAdj(clsUTGrafoP4P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[78]
2)----->existeAresta[1, 731], 
3)----->toString[], 
4)----->listaAdjVazia[1]
 Covered Branches:[16, 5, 9, 10, 12, 14, 15]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTGrafoP1P1=78;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=1;
    int clsUTGrafoP2P2=731;
    boolean clsUTGrafoP2R=false;
      clsUTGrafoP2R=clsUTGrafo.existeAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    assertEquals(false,clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    String clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.trim();
    char[] clsUTGrafoP3RP1P1=new char[]{'\u003e','\u003a','\u0066'};
    int clsUTGrafoP3RP1P2=-1;
    int clsUTGrafoP3RP1P3=-702;
    String clsUTGrafoP3RP1R=null;
//Exception
    try {
      clsUTGrafoP3RP1R=String.valueOf(clsUTGrafoP3RP1P1,clsUTGrafoP3RP1P2,clsUTGrafoP3RP1P3);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertTrue(Arrays.equals(new char[]{'\u003e','\u003a','\u0066'},clsUTGrafoP3RP1P1));
    assertNull(clsUTGrafoP3RP1R);
    int clsUTGrafoP4P1=1;
    boolean clsUTGrafoP4R=false;
      clsUTGrafoP4R=clsUTGrafo.listaAdjVazia(clsUTGrafoP4P1);
    assertEquals(true,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[387]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[32, 16, 34, 9, 10, 31, 15]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTGrafoP1P1=387;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    assertEquals(387,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[27]
2)----->imprime[], 
3)----->toString[]
 Covered Branches:[9, 10, 27, 28]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTGrafoP1P1=27;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
      clsUTGrafo.imprime();
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    byte[] clsUTGrafoP3RP0R=null;
//Exception
    try {
      clsUTGrafoP3RP0R=clsUTGrafoP3R.getBytes((Charset)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[887, -611, 901]
2)----->peso[], 
3)----->peso[], 
4)----->peso[]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase10() throws Throwable {
    int clsUTArestaP1P1=887;
    int clsUTArestaP1P2=-611;
    int clsUTArestaP1P3=901;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.peso();
    assertEquals(901,clsUTArestaP2R);
    int clsUTArestaP3R=0;
      clsUTArestaP3R=clsUTAresta.peso();
    assertEquals(901,clsUTArestaP3R);
    int clsUTArestaP4R=0;
      clsUTArestaP4R=clsUTAresta.peso();
    assertEquals(901,clsUTArestaP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[647]
2)----->numVertices[], 
3)----->proxAdj[422]
 Covered Branches:[21, 23, 9, 10, 30]
 */
  @Test public void TestCase11() throws Throwable {
    int clsUTGrafoP1P1=647;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2R=0;
      clsUTGrafoP2R=clsUTGrafo.numVertices();
    assertEquals(647,clsUTGrafoP2R);
    int clsUTGrafoP3P1=422;
    Grafo.Aresta clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.proxAdj(clsUTGrafoP3P1);
    assertNull(clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[895]
2)----->insereAresta[861, 1, 843], 
3)----->numVertices[], 
4)----->imprime[]
 Covered Branches:[5, 9, 10, 11, 27, 28, 29, 30]
 */
  @Test public void TestCase12() throws Throwable {
    int clsUTGrafoP1P1=895;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=861;
    int clsUTGrafoP2P2=1;
    int clsUTGrafoP2P3=843;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(895,clsUTGrafoP3R);
      clsUTGrafo.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[424]
2)----->insereAresta[1, -716, 0], 
3)----->existeAresta[1, 1]
 Covered Branches:[5, 6, 8, 9, 10, 11, 12, 14]
 */
  @Test public void TestCase13() throws Throwable {
    int clsUTGrafoP1P1=424;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=1;
    int clsUTGrafoP2P2=-716;
    int clsUTGrafoP2P3=0;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3P1=1;
    int clsUTGrafoP3P2=1;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.existeAresta(clsUTGrafoP3P1,clsUTGrafoP3P2);
    assertEquals(false,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[583]
2)----->primeiroListaAdj[455], 
3)----->existeAresta[468, -200]
 Covered Branches:[18, 20, 5, 9, 10, 12, 14]
 */
  @Test public void TestCase14() throws Throwable {
    int clsUTGrafoP1P1=583;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=455;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.primeiroListaAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    int clsUTGrafoP3P1=468;
    int clsUTGrafoP3P2=-200;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.existeAresta(clsUTGrafoP3P1,clsUTGrafoP3P2);
    assertEquals(false,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[-739, 621, -854]
2)----->v1[], 
3)----->toString[]
 Covered Branches:[1, 3]
 */
  @Test public void TestCase15() throws Throwable {
    int clsUTArestaP1P1=-739;
    int clsUTArestaP1P2=621;
    int clsUTArestaP1P3=-854;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v1();
    assertEquals(-739,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    char[] clsUTArestaP3RP0R=null;
      clsUTArestaP3RP0R=clsUTArestaP3R.toCharArray();
  }
}
