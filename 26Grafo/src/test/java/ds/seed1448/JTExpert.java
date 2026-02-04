package ds.seed1448;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import java.util.Arrays;
import ds.Grafo;
/** 
 * This class was automatically generated to test the ds.Grafo class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6, 7, 9, 10, 14, 15, 16, 17, 18, 19, 20, 21, 25, 26, 27, 29, 30, 31, 32, 33, 34, 35, 36, 37]
Uncovered branches: [22, 23, 8, 24, 11, 12, 28, 13]
Total number of branches: 37
Total number of covered branches: 29
Coverage : 78,38%
Evaluations : 81936
search time (ms): 42501
total runtime (ms): 44126
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Grafo[875]
2)----->retiraAresta[152, -594], 
3)----->listaAdjVazia[57]
 Covered Branches:[5, 21, 6, 26, 14, 15]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTGrafoP1P1=875;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=152;
    int clsUTGrafoP2P2=-594;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.retiraAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    assertNull(clsUTGrafoP2R);
    int clsUTGrafoP3P1=57;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.listaAdjVazia(clsUTGrafoP3P1);
    assertEquals(true,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[292]
2)----->insereAresta[951, 471, -674], 
3)----->toString[], 
4)----->listaAdjVazia[0]
 Covered Branches:[16, 5, 6, 7, 9, 14]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTGrafoP1P1=292;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=951;
    int clsUTGrafoP2P2=471;
    int clsUTGrafoP2P3=-674;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    int clsUTGrafoP4P1=0;
    boolean clsUTGrafoP4R=false;
      clsUTGrafoP4R=clsUTGrafo.listaAdjVazia(clsUTGrafoP4P1);
    assertEquals(false,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[648]
2)----->imprime[], 
3)----->proxAdj[1], 
4)----->toString[]
 Covered Branches:[18, 19, 5, 6, 29, 30]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTGrafoP1P1=648;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
      clsUTGrafo.imprime();
    int clsUTGrafoP3P1=1;
    Grafo.Aresta clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.proxAdj(clsUTGrafoP3P1);
    assertNull(clsUTGrafoP3R);
    String clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.toString();
    String clsUTGrafoP4RP0P1=new String("Eb#x``'DLCJ`)jSo--w)'J^vJ+p_iM:1^G0#&<U:gpS2:#o04toNBlc_[Tifg(Ma(r@*;]%DQ)v~V@mu0y5*d14C@:vlSfzETeKAQv(i");
    boolean clsUTGrafoP4RP0R=false;
      clsUTGrafoP4RP0R=clsUTGrafoP4R.equalsIgnoreCase(clsUTGrafoP4RP0P1);
    assertEquals(false,clsUTGrafoP4RP0R);
    String clsUTGrafoP4RP1R=null;
      clsUTGrafoP4RP1R=clsUTGrafoP4R.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[703]
2)----->insereAresta[1, 141, 655], 
3)----->proxAdj[1], 
4)----->toString[]
 Covered Branches:[1, 18, 20, 5, 6, 7, 9]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTGrafoP1P1=703;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=1;
    int clsUTGrafoP2P2=141;
    int clsUTGrafoP2P3=655;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3P1=1;
    Grafo.Aresta clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.proxAdj(clsUTGrafoP3P1);
    String clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[394]
2)----->insereAresta[0, 310, 0], 
3)----->toString[]
 Covered Branches:[5, 6, 7, 9]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTGrafoP1P1=394;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=0;
    int clsUTGrafoP2P2=310;
    int clsUTGrafoP2P3=0;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    String clsUTGrafoP3RP0P1=new String("83.42101757264342");
    int clsUTGrafoP3RP0R=0;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.indexOf(clsUTGrafoP3RP0P1);
    assertEquals("83.42101757264342",clsUTGrafoP3RP0P1.toString());
    assertEquals(-1,clsUTGrafoP3RP0R);
    int clsUTGrafoP3RP1R=0;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.hashCode();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[1]
2)----->existeAresta[598, 57], 
3)----->toString[]
 Covered Branches:[5, 6, 10]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTGrafoP1P1=1;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=598;
    int clsUTGrafoP2P2=57;
    boolean clsUTGrafoP2R=false;
      clsUTGrafoP2R=clsUTGrafo.existeAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    assertEquals(false,clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    int clsUTGrafoP3RP0P1=158;
    int clsUTGrafoP3RP0R=0;
//Exception
    try {
      clsUTGrafoP3RP0R=clsUTGrafoP3R.codePointBefore(clsUTGrafoP3RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[1]
2)----->grafoTransposto[], 
3)----->toString[], 
4)----->numVertices[]
 Covered Branches:[32, 33, 1, 34, 2, 35, 3, 36, 4, 5, 37, 6, 7, 9, 14, 15, 16, 17, 18, 20]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTGrafoP1P1=1;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=172;
    int clsUTGrafoP2RP0P2=-463;
    int clsUTGrafoP2RP0P3=-230;
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
    assertEquals(1,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    String clsUTGrafoP3RP0R=null;
//Exception
    try {
      clsUTGrafoP3RP0R=clsUTGrafoP3R.concat((String)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP3RP0R);
    byte[] clsUTGrafoP3RP1R=null;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.getBytes();
    int clsUTGrafoP4R=0;
      clsUTGrafoP4R=clsUTGrafo.numVertices();
    assertEquals(1,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[1]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 33, 17, 34, 18, 36, 5, 6, 14, 15]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTGrafoP1P1=1;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=-760;
    Grafo.Aresta clsUTGrafoP2RP0R=null;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.proxAdj(clsUTGrafoP2RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP0R);
    int clsUTGrafoP2RP1P1=-140;
    Grafo.Aresta clsUTGrafoP2RP1R=null;
//Exception
    try {
      clsUTGrafoP2RP1R=clsUTGrafoP2R.primeiroListaAdj(clsUTGrafoP2RP1P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP1R);
    assertEquals(1,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(1,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[0]
2)----->listaAdjVazia[510], 
3)----->toString[]
 Covered Branches:[5, 14, 15]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTGrafoP1P1=0;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=510;
    boolean clsUTGrafoP2R=false;
      clsUTGrafoP2R=clsUTGrafo.listaAdjVazia(clsUTGrafoP2P1);
    assertEquals(true,clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    int clsUTGrafoP3RP0P1=4501;
    int clsUTGrafoP3RP0P2=720;
    int clsUTGrafoP3RP0R=0;
//Exception
    try {
      clsUTGrafoP3RP0R=clsUTGrafoP3R.offsetByCodePoints(clsUTGrafoP3RP0P1,clsUTGrafoP3RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[142]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 33, 34, 36, 5, 6, 7, 9, 14, 15, 29, 30, 31]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTGrafoP1P1=142;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=1;
    int clsUTGrafoP2RP0P2=-238;
    int clsUTGrafoP2RP0P3=615;
      clsUTGrafoP2R.insereAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2,clsUTGrafoP2RP0P3);
      clsUTGrafoP2R.imprime();
    assertEquals(142,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(142,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[232, -32, -695]
2)----->v1[], 
3)----->toString[]
 Covered Branches:[1, 3]
 */
  @Test public void TestCase10() throws Throwable {
    int clsUTArestaP1P1=232;
    int clsUTArestaP1P2=-32;
    int clsUTArestaP1P3=-695;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v1();
    assertEquals(232,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    StringBuffer clsUTArestaP3RP0P1P1=null;
      clsUTArestaP3RP0P1P1=new StringBuffer();
    CharSequence clsUTArestaP3RP0P1=null;
      clsUTArestaP3RP0P1=new String(clsUTArestaP3RP0P1P1);
    boolean clsUTArestaP3RP0R=false;
      clsUTArestaP3RP0R=clsUTArestaP3R.contentEquals(clsUTArestaP3RP0P1);
    assertEquals("",clsUTArestaP3RP0P1.toString());
    assertEquals(0,clsUTArestaP3RP0P1.length());
    assertEquals(false,clsUTArestaP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[529, 112, 366]
2)----->v2[]
 Covered Branches:[1, 4]
 */
  @Test public void TestCase11() throws Throwable {
    int clsUTArestaP1P1=529;
    int clsUTArestaP1P2=112;
    int clsUTArestaP1P3=366;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v2();
    assertEquals(112,clsUTArestaP2R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[-78, 306, 1]
2)----->peso[], 
3)----->toString[]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase12() throws Throwable {
    int clsUTArestaP1P1=-78;
    int clsUTArestaP1P2=306;
    int clsUTArestaP1P3=1;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.peso();
    assertEquals(1,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    int clsUTArestaP3RP0P1=-394;
    int clsUTArestaP3RP0P2=725;
    int clsUTArestaP3RP0R=0;
//Exception
    try {
      clsUTArestaP3RP0R=clsUTArestaP3R.offsetByCodePoints(clsUTArestaP3RP0P1,clsUTArestaP3RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    int clsUTArestaP3RP1P1=0;
    int clsUTArestaP3RP1R=0;
      clsUTArestaP3RP1R=clsUTArestaP3R.indexOf(clsUTArestaP3RP1P1);
    assertEquals(-1,clsUTArestaP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[1]
2)----->retiraAresta[918, 0], 
3)----->toString[]
 Covered Branches:[1, 5, 21, 6, 25, 27]
 */
  @Test public void TestCase13() throws Throwable {
    int clsUTGrafoP1P1=1;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=918;
    int clsUTGrafoP2P2=0;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.retiraAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    int clsUTGrafoP3RP0R=0;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.length();
    String clsUTGrafoP3RP1R=null;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.toString();
  }
}
