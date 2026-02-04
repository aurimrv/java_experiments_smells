package ds.seed5831;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import java.util.Locale;
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
Evaluations : 85830
search time (ms): 42501
total runtime (ms): 44144
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[414, -732, 358]
2)----->peso[], 
3)----->toString[]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTArestaP1P1=414;
    int clsUTArestaP1P2=-732;
    int clsUTArestaP1P3=358;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.peso();
    assertEquals(358,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[782]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 33, 1, 34, 2, 35, 3, 36, 4, 5, 37, 6, 7, 9, 14, 15, 16, 17, 18, 19, 20]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTGrafoP1P1=782;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=0;
    int clsUTGrafoP2RP0P2=856;
    int clsUTGrafoP2RP0P3=313;
      clsUTGrafoP2R.insereAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2,clsUTGrafoP2RP0P3);
    Grafo clsUTGrafoP2RP1R=null;
      clsUTGrafoP2RP1R=clsUTGrafoP2R.grafoTransposto();
    assertEquals(782,clsUTGrafoP2RP1R.numVertices());
    assertEquals(782,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(782,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[0]
2)----->retiraAresta[909, 0], 
3)----->toString[], 
4)----->listaAdjVazia[210]
 Covered Branches:[1, 5, 21, 25, 27, 14, 15]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTGrafoP1P1=0;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=909;
    int clsUTGrafoP2P2=0;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.retiraAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    int clsUTGrafoP4P1=210;
    boolean clsUTGrafoP4R=false;
      clsUTGrafoP4R=clsUTGrafo.listaAdjVazia(clsUTGrafoP4P1);
    assertEquals(true,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[1]
2)----->existeAresta[0, -632], 
3)----->listaAdjVazia[335], 
4)----->toString[]
 Covered Branches:[5, 6, 10, 14, 15]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTGrafoP1P1=1;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=0;
    int clsUTGrafoP2P2=-632;
    boolean clsUTGrafoP2R=false;
      clsUTGrafoP2R=clsUTGrafo.existeAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    assertEquals(false,clsUTGrafoP2R);
    int clsUTGrafoP3P1=335;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.listaAdjVazia(clsUTGrafoP3P1);
    assertEquals(true,clsUTGrafoP3R);
    String clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.toString();
    char clsUTGrafoP4RP0P1P1='\u45a9';
    CharSequence clsUTGrafoP4RP0P1=null;
      clsUTGrafoP4RP0P1=String.valueOf(clsUTGrafoP4RP0P1P1);
    boolean clsUTGrafoP4RP0R=false;
      clsUTGrafoP4RP0R=clsUTGrafoP4R.contains(clsUTGrafoP4RP0P1);
    assertEquals("䖩",clsUTGrafoP4RP0P1.toString());
    assertEquals(1,clsUTGrafoP4RP0P1.length());
    assertEquals(false,clsUTGrafoP4RP0R);
    String clsUTGrafoP4RP1P1=new String("{;. %'_$|}!(+&~?:=*-]@_[/)><#^`\\\\\\\\\\\\\"");
    int clsUTGrafoP4RP1P2=-621;
    String[] clsUTGrafoP4RP1R=null;
//Exception
    try {
      clsUTGrafoP4RP1R=clsUTGrafoP4R.split(clsUTGrafoP4RP1P1,clsUTGrafoP4RP1P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP4RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[2, -1, -227]
2)----->v1[], 
3)----->toString[]
 Covered Branches:[1, 3]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTArestaP1P1=2;
    int clsUTArestaP1P2=-1;
    int clsUTArestaP1P3=-227;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v1();
    assertEquals(2,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    String clsUTArestaP3RP0P1=new String(" (");
    int clsUTArestaP3RP0P2=-639;
    int clsUTArestaP3RP0R=0;
      clsUTArestaP3RP0R=clsUTArestaP3R.lastIndexOf(clsUTArestaP3RP0P1,clsUTArestaP3RP0P2);
    assertEquals(" (",clsUTArestaP3RP0P1.toString());
    assertEquals(-1,clsUTArestaP3RP0R);
    int clsUTArestaP3RP1P1=192;
    int clsUTArestaP3RP1P2=-304;
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
1)----->ds.Grafo[784]
2)----->retiraAresta[4501, -736], 
3)----->toString[], 
4)----->proxAdj[1]
 Covered Branches:[18, 19, 5, 21, 6, 26]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTGrafoP1P1=784;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=4501;
    int clsUTGrafoP2P2=-736;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.retiraAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    assertNull(clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    int clsUTGrafoP4P1=1;
    Grafo.Aresta clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.proxAdj(clsUTGrafoP4P1);
    assertNull(clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[667]
2)----->retiraAresta[624, 39], 
3)----->toString[], 
4)----->listaAdjVazia[784]
 Covered Branches:[5, 21, 6, 26, 14, 15]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTGrafoP1P1=667;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=624;
    int clsUTGrafoP2P2=39;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.retiraAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    assertNull(clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    boolean clsUTGrafoP3RP0R=false;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.isEmpty();
    assertEquals(false,clsUTGrafoP3RP0R);
    int clsUTGrafoP4P1=784;
    boolean clsUTGrafoP4R=false;
      clsUTGrafoP4R=clsUTGrafo.listaAdjVazia(clsUTGrafoP4P1);
    assertEquals(true,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[90, 529, 438]
2)----->v2[], 
3)----->toString[]
 Covered Branches:[1, 4]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTArestaP1P1=90;
    int clsUTArestaP1P2=529;
    int clsUTArestaP1P3=438;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v2();
    assertEquals(529,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    boolean clsUTArestaP3RP0P1=false;
    String clsUTArestaP3RP0R=null;
      clsUTArestaP3RP0R=String.valueOf(clsUTArestaP3RP0P1);
    assertEquals("false",clsUTArestaP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[707]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[33, 17, 34, 36, 5, 6, 29, 14, 30, 15]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTGrafoP1P1=707;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
      clsUTGrafoP2R.imprime();
    int clsUTGrafoP2RP1P1=-332;
    Grafo.Aresta clsUTGrafoP2RP1R=null;
//Exception
    try {
      clsUTGrafoP2RP1R=clsUTGrafoP2R.primeiroListaAdj(clsUTGrafoP2RP1P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP1R);
    assertEquals(707,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[0]
2)----->grafoTransposto[], 
3)----->toString[], 
4)----->numVertices[]
 Covered Branches:[32, 33, 5]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTGrafoP1P1=0;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    assertEquals(0,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    String clsUTGrafoP3RP0R=null;
//Exception
    try {
      clsUTGrafoP3RP0R=String.valueOf((char[])null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP3RP0R);
    Locale clsUTGrafoP3RP1P1=null;
      clsUTGrafoP3RP1P1=(Locale)Locale.JAPAN;
    String clsUTGrafoP3RP1R=null;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.toLowerCase(clsUTGrafoP3RP1P1);
    assertEquals("ja_JP",clsUTGrafoP3RP1P1.toString());
    assertEquals("jpn",clsUTGrafoP3RP1P1.getISO3Language());
    assertEquals("Japanese",clsUTGrafoP3RP1P1.getDisplayLanguage());
    assertEquals(false,clsUTGrafoP3RP1P1.hasExtensions());
    int clsUTGrafoP4R=0;
      clsUTGrafoP4R=clsUTGrafo.numVertices();
    assertEquals(0,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[1]
2)----->listaAdjVazia[918], 
3)----->toString[]
 Covered Branches:[5, 6, 14, 15]
 */
  @Test public void TestCase10() throws Throwable {
    int clsUTGrafoP1P1=1;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=918;
    boolean clsUTGrafoP2R=false;
      clsUTGrafoP2R=clsUTGrafo.listaAdjVazia(clsUTGrafoP2P1);
    assertEquals(true,clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[135]
2)----->insereAresta[1, 71, -187], 
3)----->listaAdjVazia[957], 
4)----->proxAdj[122], 
5)----->toString[]
 Covered Branches:[18, 19, 5, 6, 7, 9, 14, 15]
 */
  @Test public void TestCase11() throws Throwable {
    int clsUTGrafoP1P1=135;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=1;
    int clsUTGrafoP2P2=71;
    int clsUTGrafoP2P3=-187;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3P1=957;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.listaAdjVazia(clsUTGrafoP3P1);
    assertEquals(true,clsUTGrafoP3R);
    int clsUTGrafoP4P1=122;
    Grafo.Aresta clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.proxAdj(clsUTGrafoP4P1);
    assertNull(clsUTGrafoP4R);
    String clsUTGrafoP5R=null;
      clsUTGrafoP5R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[873]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[33, 34, 36, 5, 6, 29, 14, 30, 15]
 */
  @Test public void TestCase12() throws Throwable {
    int clsUTGrafoP1P1=873;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
      clsUTGrafoP2R.imprime();
    assertEquals(873,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[1]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 33, 34, 36, 5, 6, 7, 9, 14, 15, 29, 30, 31]
 */
  @Test public void TestCase13() throws Throwable {
    int clsUTGrafoP1P1=1;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=0;
    int clsUTGrafoP2RP0P2=-906;
    int clsUTGrafoP2RP0P3=249;
      clsUTGrafoP2R.insereAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2,clsUTGrafoP2RP0P3);
      clsUTGrafoP2R.imprime();
    assertEquals(1,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(1,clsUTGrafoP3R);
  }
}
