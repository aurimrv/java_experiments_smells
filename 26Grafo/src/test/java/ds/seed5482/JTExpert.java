package ds.seed5482;
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
Evaluations : 81917
search time (ms): 42501
total runtime (ms): 44207
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Grafo[656]
2)----->grafoTransposto[], 
3)----->toString[], 
4)----->numVertices[]
 Covered Branches:[32, 33, 1, 34, 2, 35, 3, 36, 4, 5, 37, 6, 7, 9, 14, 15, 16, 17, 18, 20]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTGrafoP1P1=656;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=384;
    int clsUTGrafoP2RP0P2=-51;
    int clsUTGrafoP2RP0P3=-21;
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
    assertEquals(656,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    int clsUTGrafoP3RP0P1P1=43;
    StringBuffer clsUTGrafoP3RP0P1=null;
      clsUTGrafoP3RP0P1=new StringBuffer(clsUTGrafoP3RP0P1P1);
    boolean clsUTGrafoP3RP0R=false;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.contentEquals(clsUTGrafoP3RP0P1);
    assertEquals("",clsUTGrafoP3RP0P1.toString());
    assertEquals(0,clsUTGrafoP3RP0P1.length());
    assertEquals(false,clsUTGrafoP3RP0R);
    char[] clsUTGrafoP3RP1P1=new char[]{'\u0064'};
    int clsUTGrafoP3RP1P2=165;
    int clsUTGrafoP3RP1P3=-487;
    String clsUTGrafoP3RP1R=null;
//Exception
    try {
      clsUTGrafoP3RP1R=String.copyValueOf(clsUTGrafoP3RP1P1,clsUTGrafoP3RP1P2,clsUTGrafoP3RP1P3);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertTrue(Arrays.equals(new char[]{'\u0064'},clsUTGrafoP3RP1P1));
    assertNull(clsUTGrafoP3RP1R);
    int clsUTGrafoP4R=0;
      clsUTGrafoP4R=clsUTGrafo.numVertices();
    assertEquals(656,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[465]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 33, 34, 36, 5, 6, 14, 15]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTGrafoP1P1=465;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    Grafo clsUTGrafoP2RP0R=null;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.grafoTransposto();
    assertEquals(465,clsUTGrafoP2RP0R.numVertices());
    assertEquals(465,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(465,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[1]
2)----->imprime[], 
3)----->toString[]
 Covered Branches:[5, 6, 29, 30]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTGrafoP1P1=1;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
      clsUTGrafo.imprime();
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[199]
2)----->grafoTransposto[], 
3)----->numVertices[], 
4)----->toString[]
 Covered Branches:[32, 33, 17, 34, 36, 5, 6, 14, 15]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTGrafoP1P1=199;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=-320;
    Grafo.Aresta clsUTGrafoP2RP0R=null;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.primeiroListaAdj(clsUTGrafoP2RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP0R);
    assertEquals(199,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(199,clsUTGrafoP3R);
    String clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.toString();
    long clsUTGrafoP4RP0P1=-70L;
    String clsUTGrafoP4RP0R=null;
      clsUTGrafoP4RP0R=String.valueOf(clsUTGrafoP4RP0P1);
    assertEquals("-70",clsUTGrafoP4RP0R);
    String clsUTGrafoP4RP1P1=new String("4rhy1c!qztmk.39p$jd08xfs#ou^)-n{e2");
    boolean clsUTGrafoP4RP1R=false;
      clsUTGrafoP4RP1R=clsUTGrafoP4R.equalsIgnoreCase(clsUTGrafoP4RP1P1);
    assertEquals("4rhy1c!qztmk.39p$jd08xfs#ou^)-n{e2",clsUTGrafoP4RP1P1.toString());
    assertEquals(false,clsUTGrafoP4RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[989]
2)----->proxAdj[1], 
3)----->toString[]
 Covered Branches:[18, 19, 5, 6]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTGrafoP1P1=989;
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
1)----->ds.Grafo[41]
2)----->retiraAresta[1, 450], 
3)----->toString[]
 Covered Branches:[5, 21, 6, 26]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTGrafoP1P1=41;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=1;
    int clsUTGrafoP2P2=450;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.retiraAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    assertNull(clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    boolean clsUTGrafoP3RP0R=false;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.isEmpty();
    assertEquals(false,clsUTGrafoP3RP0R);
    String clsUTGrafoP3RP1P1=new String("854365444721474545866701280");
    boolean clsUTGrafoP3RP1R=false;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.endsWith(clsUTGrafoP3RP1P1);
    assertEquals("854365444721474545866701280",clsUTGrafoP3RP1P1.toString());
    assertEquals(false,clsUTGrafoP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[1]
2)----->existeAresta[341, 330], 
3)----->toString[]
 Covered Branches:[5, 6, 10]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTGrafoP1P1=1;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=341;
    int clsUTGrafoP2P2=330;
    boolean clsUTGrafoP2R=false;
      clsUTGrafoP2R=clsUTGrafo.existeAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    assertEquals(false,clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    String clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.toLowerCase();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[365]
2)----->retiraAresta[564, 0], 
3)----->toString[]
 Covered Branches:[1, 5, 21, 6, 25, 27]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTGrafoP1P1=365;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=564;
    int clsUTGrafoP2P2=0;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.retiraAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    int clsUTGrafoP3RP0P1=399;
    int clsUTGrafoP3RP0R=0;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.indexOf(clsUTGrafoP3RP0P1);
    assertEquals(-1,clsUTGrafoP3RP0R);
    int clsUTGrafoP3RP1P1=-147;
    char clsUTGrafoP3RP1R='X';
//Exception
    try {
      clsUTGrafoP3RP1R=clsUTGrafoP3R.charAt(clsUTGrafoP3RP1P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[224, 1, -436]
2)----->v1[], 
3)----->toString[]
 Covered Branches:[1, 3]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTArestaP1P1=224;
    int clsUTArestaP1P2=1;
    int clsUTArestaP1P3=-436;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v1();
    assertEquals(224,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[106]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[33, 34, 36, 5, 6, 7, 9, 29, 14, 30, 15, 31]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTGrafoP1P1=106;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=191;
    int clsUTGrafoP2RP0P2=0;
    int clsUTGrafoP2RP0P3=-475;
      clsUTGrafoP2R.insereAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2,clsUTGrafoP2RP0P3);
      clsUTGrafoP2R.imprime();
    assertEquals(106,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    boolean clsUTGrafoP3RP0P1=true;
    int clsUTGrafoP3RP0P2=-489;
    String clsUTGrafoP3RP0P3=new String("46 :McRvw 0r&~r:y|'aR^WLcB4}=]jO0");
    int clsUTGrafoP3RP0P4=772;
    int clsUTGrafoP3RP0P5=-81;
    boolean clsUTGrafoP3RP0R=false;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.regionMatches(clsUTGrafoP3RP0P1,clsUTGrafoP3RP0P2,clsUTGrafoP3RP0P3,clsUTGrafoP3RP0P4,clsUTGrafoP3RP0P5);
    assertEquals("46 :McRvw 0r&~r:y|'aR^WLcB4}=]jO0",clsUTGrafoP3RP0P3.toString());
    assertEquals(false,clsUTGrafoP3RP0R);
    int clsUTGrafoP3RP1R=0;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.length();
    assertEquals(11,clsUTGrafoP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[-1, -561, -671]
2)----->peso[], 
3)----->v2[], 
4)----->v2[]
 Covered Branches:[1, 2, 4]
 */
  @Test public void TestCase10() throws Throwable {
    int clsUTArestaP1P1=-1;
    int clsUTArestaP1P2=-561;
    int clsUTArestaP1P3=-671;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.peso();
    assertEquals(-671,clsUTArestaP2R);
    int clsUTArestaP3R=0;
      clsUTArestaP3R=clsUTAresta.v2();
    assertEquals(-561,clsUTArestaP3R);
    int clsUTArestaP4R=0;
      clsUTArestaP4R=clsUTAresta.v2();
    assertEquals(-561,clsUTArestaP4R);
  }
}
