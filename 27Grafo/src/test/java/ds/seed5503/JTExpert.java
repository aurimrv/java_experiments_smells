package ds.seed5503;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Grafo;
import java.util.Arrays;
/** 
 * This class was automatically generated to test the ds.Grafo class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 27, 28, 29, 30, 31, 32, 33, 34, 35]
Uncovered branches: [6, 7, 8, 25, 26, 13]
Total number of branches: 35
Total number of covered branches: 29
Coverage : 82,86%
Evaluations : 23472
search time (ms): 42510
total runtime (ms): 44138
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Grafo[911]
2)----->grafoTransposto[], 
3)----->numVertices[], 
4)----->toString[]
 Covered Branches:[32, 16, 34, 9, 10, 27, 28, 30, 31, 15]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTGrafoP1P1=911;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
      clsUTGrafoP2R.imprime();
      clsUTGrafoP2R.imprime();
    assertEquals(911,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(911,clsUTGrafoP3R);
    String clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.toString();
    float clsUTGrafoP4RP0P1=20.6698F;
    String clsUTGrafoP4RP0R=null;
      clsUTGrafoP4RP0R=String.valueOf(clsUTGrafoP4RP0P1);
    assertEquals("20.6698",clsUTGrafoP4RP0R);
    String clsUTGrafoP4RP1R=null;
      clsUTGrafoP4RP1R=clsUTGrafoP4R.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[105]
2)----->grafoTransposto[], 
3)----->numVertices[], 
4)----->toString[]
 Covered Branches:[32, 34, 5, 9, 10, 11, 15, 16, 27, 28, 29, 30, 31]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTGrafoP1P1=105;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=1;
    int clsUTGrafoP2RP0P2=-342;
    int clsUTGrafoP2RP0P3=-74;
      clsUTGrafoP2R.insereAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2,clsUTGrafoP2RP0P3);
      clsUTGrafoP2R.imprime();
    assertEquals(105,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(105,clsUTGrafoP3R);
    String clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.toString();
    char clsUTGrafoP4RP0P1='\ucbed';
    String clsUTGrafoP4RP0R=null;
      clsUTGrafoP4RP0R=String.valueOf(clsUTGrafoP4RP0P1);
    assertEquals("쯭",clsUTGrafoP4RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[259]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 16, 34, 5, 9, 10, 12, 30, 31, 15]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTGrafoP1P1=259;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=-718;
    int clsUTGrafoP2RP0P2=66;
    boolean clsUTGrafoP2RP0R=false;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.existeAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals(259,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(259,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[867]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[32, 33, 1, 34, 2, 35, 3, 4, 5, 9, 10, 11, 15, 16, 17, 18, 19, 21, 23, 31]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTGrafoP1P1=867;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=248;
    int clsUTGrafoP2RP0P2=0;
    int clsUTGrafoP2RP0P3=-321;
      clsUTGrafoP2R.insereAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2,clsUTGrafoP2RP0P3);
    Grafo clsUTGrafoP2RP1R=null;
      clsUTGrafoP2RP1R=clsUTGrafoP2R.grafoTransposto();
    assertEquals(867,clsUTGrafoP2RP1R.numVertices());
    assertEquals(867,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[808]
2)----->proxAdj[195], 
3)----->toString[], 
4)----->existeAresta[1, -633]
 Covered Branches:[21, 5, 23, 9, 10, 12, 14]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTGrafoP1P1=808;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=195;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.proxAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    int clsUTGrafoP4P1=1;
    int clsUTGrafoP4P2=-633;
    boolean clsUTGrafoP4R=false;
      clsUTGrafoP4R=clsUTGrafo.existeAresta(clsUTGrafoP4P1,clsUTGrafoP4P2);
    assertEquals(false,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[-260, 594, 458]
2)----->v1[], 
3)----->toString[]
 Covered Branches:[1, 3]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTArestaP1P1=-260;
    int clsUTArestaP1P2=594;
    int clsUTArestaP1P3=458;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v1();
    assertEquals(-260,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    char[] clsUTArestaP3RP0R=null;
      clsUTArestaP3RP0R=clsUTArestaP3R.toCharArray();
    String clsUTArestaP3RP1R=null;
      clsUTArestaP3RP1R=clsUTArestaP3R.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[238, 340, -842]
2)----->v2[], 
3)----->toString[]
 Covered Branches:[1, 4]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTArestaP1P1=238;
    int clsUTArestaP1P2=340;
    int clsUTArestaP1P3=-842;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v2();
    assertEquals(340,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    String clsUTArestaP3RP0R=null;
      clsUTArestaP3RP0R=clsUTArestaP3R.trim();
    int clsUTArestaP3RP1P1=-158;
    int clsUTArestaP3RP1P2=363;
    String clsUTArestaP3RP1R=null;
//Exception
    try {
      clsUTArestaP3RP1R=clsUTArestaP3R.substring(clsUTArestaP3RP1P1,clsUTArestaP3RP1P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTArestaP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[433]
2)----->listaAdjVazia[-655], 
3)----->insereAresta[1, 145, -1], 
4)----->retiraAresta[0, -451], 
5)----->proxAdj[1], 
6)----->numVertices[]
 Covered Branches:[1, 4, 5, 21, 22, 24, 9, 10, 11, 30, 15]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTGrafoP1P1=433;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=-655;
    boolean clsUTGrafoP2R=false;
//Exception
    try {
      clsUTGrafoP2R=clsUTGrafo.listaAdjVazia(clsUTGrafoP2P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    int clsUTGrafoP3P1=1;
    int clsUTGrafoP3P2=145;
    int clsUTGrafoP3P3=-1;
      clsUTGrafo.insereAresta(clsUTGrafoP3P1,clsUTGrafoP3P2,clsUTGrafoP3P3);
    int clsUTGrafoP4P1=0;
    int clsUTGrafoP4P2=-451;
    Grafo.Aresta clsUTGrafoP4R=null;
//Exception
    try {
      clsUTGrafoP4R=clsUTGrafo.retiraAresta(clsUTGrafoP4P1,clsUTGrafoP4P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP4R);
    int clsUTGrafoP5P1=1;
    Grafo.Aresta clsUTGrafoP5R=null;
      clsUTGrafoP5R=clsUTGrafo.proxAdj(clsUTGrafoP5P1);
    int clsUTGrafoP5RP0R=0;
      clsUTGrafoP5RP0R=clsUTGrafoP5R.v2();
    assertEquals(145,clsUTGrafoP5RP0R);
    int clsUTGrafoP6R=0;
      clsUTGrafoP6R=clsUTGrafo.numVertices();
    assertEquals(433,clsUTGrafoP6R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[52]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[32, 16, 34, 5, 24, 9, 10, 31, 15]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTGrafoP1P1=52;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    Grafo clsUTGrafoP2RP0R=null;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.grafoTransposto();
    assertEquals(52,clsUTGrafoP2RP0R.numVertices());
    int clsUTGrafoP2RP1P1=0;
    int clsUTGrafoP2RP1P2=-327;
    Grafo.Aresta clsUTGrafoP2RP1R=null;
//Exception
    try {
      clsUTGrafoP2RP1R=clsUTGrafoP2R.retiraAresta(clsUTGrafoP2RP1P1,clsUTGrafoP2RP1P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP1R);
    assertEquals(52,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    String clsUTGrafoP3RP0P1=new String("$_+`{{^:;([` [;_{~&!;| _>%_>`@+<[. _?~_!.@]_]]_&)&?`*<<;/('>*|-[||^#;++");
    int clsUTGrafoP3RP0P2=-290;
    int clsUTGrafoP3RP0R=0;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.indexOf(clsUTGrafoP3RP0P1,clsUTGrafoP3RP0P2);
    assertEquals(-1,clsUTGrafoP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[975]
2)----->primeiroListaAdj[287], 
3)----->listaAdjVazia[334], 
4)----->toString[]
 Covered Branches:[16, 18, 20, 9, 10, 15]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTGrafoP1P1=975;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=287;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.primeiroListaAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    int clsUTGrafoP3P1=334;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.listaAdjVazia(clsUTGrafoP3P1);
    assertEquals(true,clsUTGrafoP3R);
    String clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.toString();
    int clsUTGrafoP4RP0P1=-1;
    int clsUTGrafoP4RP0R=0;
//Exception
    try {
      clsUTGrafoP4RP0R=clsUTGrafoP4R.codePointAt(clsUTGrafoP4RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    String clsUTGrafoP4RP1R=null;
      clsUTGrafoP4RP1R=clsUTGrafoP4R.trim();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[0]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[5, 9, 11, 31]
 */
  @Test public void TestCase10() throws Throwable {
    int clsUTGrafoP1P1=0;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=497;
    int clsUTGrafoP2RP0P2=-1;
    int clsUTGrafoP2RP0P3=-604;
//Exception
    try {
      clsUTGrafoP2R.insereAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2,clsUTGrafoP2RP0P3);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    Grafo clsUTGrafoP2RP1R=null;
      clsUTGrafoP2RP1R=clsUTGrafoP2R.grafoTransposto();
    assertEquals(0,clsUTGrafoP2RP1R.numVertices());
    assertEquals(0,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    int clsUTGrafoP3RP0P1=-322;
    String clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=String.valueOf(clsUTGrafoP3RP0P1);
    assertEquals("-322",clsUTGrafoP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[892, -925, -157]
2)----->peso[], 
3)----->toString[]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase11() throws Throwable {
    int clsUTArestaP1P1=892;
    int clsUTArestaP1P2=-925;
    int clsUTArestaP1P3=-157;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.peso();
    assertEquals(-157,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    int clsUTArestaP3RP0R=0;
      clsUTArestaP3RP0R=clsUTArestaP3R.hashCode();
    int clsUTArestaP3RP1P1=659;
    int clsUTArestaP3RP1P2=-1;
    char[] clsUTArestaP3RP1P3=new char[]{};
    int clsUTArestaP3RP1P4=426;
//Exception
    try {
      clsUTArestaP3R.getChars(clsUTArestaP3RP1P1,clsUTArestaP3RP1P2,clsUTArestaP3RP1P3,clsUTArestaP3RP1P4);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertTrue(Arrays.equals(new char[]{},clsUTArestaP3RP1P3));
  }
}
