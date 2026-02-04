package ds.seed5482;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
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
Evaluations : 78197
search time (ms): 42501
total runtime (ms): 44225
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->existeAresta[0, 630], 
3)----->toString[]
 Covered Branches:[5, 9, 10, 12, 14]
 */
  @Test public void TestCase0() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2P1=0;
    int clsUTGrafoP2P2=630;
    boolean clsUTGrafoP2R=false;
      clsUTGrafoP2R=clsUTGrafo.existeAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    assertEquals(false,clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    String clsUTGrafoP3RP0P1=new String("yyTFK2PKqcncg5MyeMUDAVMfNBVRBdFbehhIqHoe2JTjQL90");
    int clsUTGrafoP3RP0R=0;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.compareTo(clsUTGrafoP3RP0P1);
    assertEquals("yyTFK2PKqcncg5MyeMUDAVMfNBVRBdFbehhIqHoe2JTjQL90",clsUTGrafoP3RP0P1.toString());
    assertEquals(-21,clsUTGrafoP3RP0R);
    int clsUTGrafoP3RP1P1=1;
    int clsUTGrafoP3RP1P2=248;
    int clsUTGrafoP3RP1R=0;
//Exception
    try {
      clsUTGrafoP3RP1R=clsUTGrafoP3R.offsetByCodePoints(clsUTGrafoP3RP1P1,clsUTGrafoP3RP1P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->existeAresta[1, 252], 
3)----->primeiroListaAdj[0]
 Covered Branches:[18, 20, 5, 9, 10, 12, 14]
 */
  @Test public void TestCase1() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2P1=1;
    int clsUTGrafoP2P2=252;
    boolean clsUTGrafoP2R=false;
      clsUTGrafoP2R=clsUTGrafo.existeAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    assertEquals(false,clsUTGrafoP2R);
    int clsUTGrafoP3P1=0;
    Grafo.Aresta clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.primeiroListaAdj(clsUTGrafoP3P1);
    assertNull(clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[], 
3)----->numVertices[], 
4)----->grafoTransposto[]
 Covered Branches:[32, 16, 34, 9, 10, 30, 31, 15]
 */
  @Test public void TestCase2() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    Grafo clsUTGrafoP2RP0R=null;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.grafoTransposto();
    assertEquals(100,clsUTGrafoP2RP0R.numVertices());
    assertEquals(100,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(100,clsUTGrafoP3R);
    Grafo clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.grafoTransposto();
    assertEquals(100,clsUTGrafoP4R.numVertices());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[], 
3)----->toString[], 
4)----->numVertices[]
 Covered Branches:[32, 16, 34, 5, 24, 9, 10, 30, 31, 15]
 */
  @Test public void TestCase3() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=-177;
    int clsUTGrafoP2RP0P2=-346;
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
    int clsUTGrafoP4R=0;
      clsUTGrafoP4R=clsUTGrafo.numVertices();
    assertEquals(100,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[], 
3)----->numVertices[], 
4)----->toString[]
 Covered Branches:[32, 16, 34, 21, 23, 9, 10, 30, 31, 15]
 */
  @Test public void TestCase4() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    Grafo clsUTGrafoP2RP0R=null;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.grafoTransposto();
    assertEquals(100,clsUTGrafoP2RP0R.numVertices());
    int clsUTGrafoP2RP1P1=1;
    Grafo.Aresta clsUTGrafoP2RP1R=null;
      clsUTGrafoP2RP1R=clsUTGrafoP2R.proxAdj(clsUTGrafoP2RP1P1);
    assertNull(clsUTGrafoP2RP1R);
    assertEquals(100,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(100,clsUTGrafoP3R);
    String clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->insereAresta[1, 100, 0], 
3)----->retiraAresta[804, -825], 
4)----->proxAdj[1], 
5)----->existeAresta[-902, -842]
 Covered Branches:[1, 3, 4, 5, 21, 22, 24, 9, 10, 11, 12]
 */
  @Test public void TestCase5() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2P1=1;
    int clsUTGrafoP2P2=100;
    int clsUTGrafoP2P3=0;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3P1=804;
    int clsUTGrafoP3P2=-825;
    Grafo.Aresta clsUTGrafoP3R=null;
//Exception
    try {
      clsUTGrafoP3R=clsUTGrafo.retiraAresta(clsUTGrafoP3P1,clsUTGrafoP3P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP3R);
    int clsUTGrafoP4P1=1;
    Grafo.Aresta clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.proxAdj(clsUTGrafoP4P1);
    int clsUTGrafoP4RP0R=0;
      clsUTGrafoP4RP0R=clsUTGrafoP4R.v2();
    assertEquals(100,clsUTGrafoP4RP0R);
    int clsUTGrafoP4RP1R=0;
      clsUTGrafoP4RP1R=clsUTGrafoP4R.v1();
    assertEquals(1,clsUTGrafoP4RP1R);
    int clsUTGrafoP5P1=-902;
    int clsUTGrafoP5P2=-842;
    boolean clsUTGrafoP5R=false;
//Exception
    try {
      clsUTGrafoP5R=clsUTGrafo.existeAresta(clsUTGrafoP5P1,clsUTGrafoP5P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->numVertices[], 
3)----->imprime[]
 Covered Branches:[9, 10, 27, 28, 30]
 */
  @Test public void TestCase6() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2R=0;
      clsUTGrafoP2R=clsUTGrafo.numVertices();
    assertEquals(100,clsUTGrafoP2R);
      clsUTGrafo.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[32, 16, 34, 5, 9, 10, 11, 31, 15]
 */
  @Test public void TestCase7() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=0;
    int clsUTGrafoP2RP0P2=-942;
    int clsUTGrafoP2RP0P3=-1;
      clsUTGrafoP2R.insereAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2,clsUTGrafoP2RP0P3);
    assertEquals(100,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    int clsUTGrafoP3RP0P1=-229;
    int clsUTGrafoP3RP0R=0;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.indexOf(clsUTGrafoP3RP0P1);
    assertEquals(-1,clsUTGrafoP3RP0R);
    String clsUTGrafoP3RP1P1=new String("");
    boolean clsUTGrafoP3RP1R=false;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.equalsIgnoreCase(clsUTGrafoP3RP1P1);
    assertEquals("",clsUTGrafoP3RP1P1.toString());
    assertEquals(false,clsUTGrafoP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[], 
3)----->proxAdj[-794], 
4)----->insereAresta[1, -508, 382], 
5)----->retiraAresta[1, 0]
 Covered Branches:[32, 34, 5, 6, 8, 9, 10, 11, 15, 16, 18, 20, 21, 24, 26, 31]
 */
  @Test public void TestCase8() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=99;
    Grafo.Aresta clsUTGrafoP2RP0R=null;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.primeiroListaAdj(clsUTGrafoP2RP0P1);
    assertNull(clsUTGrafoP2RP0R);
    Grafo clsUTGrafoP2RP1R=null;
      clsUTGrafoP2RP1R=clsUTGrafoP2R.grafoTransposto();
    assertEquals(100,clsUTGrafoP2RP1R.numVertices());
    int clsUTGrafoP3P1=-794;
    Grafo.Aresta clsUTGrafoP3R=null;
//Exception
    try {
      clsUTGrafoP3R=clsUTGrafo.proxAdj(clsUTGrafoP3P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP3R);
    int clsUTGrafoP4P1=1;
    int clsUTGrafoP4P2=-508;
    int clsUTGrafoP4P3=382;
      clsUTGrafo.insereAresta(clsUTGrafoP4P1,clsUTGrafoP4P2,clsUTGrafoP4P3);
    int clsUTGrafoP5P1=1;
    int clsUTGrafoP5P2=0;
    Grafo.Aresta clsUTGrafoP5R=null;
      clsUTGrafoP5R=clsUTGrafo.retiraAresta(clsUTGrafoP5P1,clsUTGrafoP5P2);
    assertNull(clsUTGrafoP5R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[105, 960, 538]
2)----->peso[], 
3)----->toString[]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTArestaP1P1=105;
    int clsUTArestaP1P2=960;
    int clsUTArestaP1P3=538;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.peso();
    assertEquals(538,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->insereAresta[99, 935, -256], 
3)----->imprime[]
 Covered Branches:[5, 9, 10, 11, 27, 28, 29]
 */
  @Test public void TestCase10() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2P1=99;
    int clsUTGrafoP2P2=935;
    int clsUTGrafoP2P3=-256;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
      clsUTGrafo.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[-194, -263, 1]
2)----->v1[], 
3)----->toString[]
 Covered Branches:[1, 3]
 */
  @Test public void TestCase11() throws Throwable {
    int clsUTArestaP1P1=-194;
    int clsUTArestaP1P2=-263;
    int clsUTArestaP1P3=1;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v1();
    assertEquals(-194,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    int clsUTArestaP3RP0P1=342;
    int clsUTArestaP3RP0P2=1;
    int clsUTArestaP3RP0R=0;
//Exception
    try {
      clsUTArestaP3RP0R=clsUTArestaP3R.codePointCount(clsUTArestaP3RP0P1,clsUTArestaP3RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    String clsUTArestaP3RP1P1=new String("3428067159");
    int clsUTArestaP3RP1R=0;
      clsUTArestaP3RP1R=clsUTArestaP3R.lastIndexOf(clsUTArestaP3RP1P1);
    assertEquals("3428067159",clsUTArestaP3RP1P1.toString());
    assertEquals(-1,clsUTArestaP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->insereAresta[1, 1, -672], 
3)----->grafoTransposto[]
 Covered Branches:[32, 33, 1, 34, 2, 35, 3, 4, 5, 9, 10, 11, 15, 16, 17, 18, 19, 21, 23, 31]
 */
  @Test public void TestCase12() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2P1=1;
    int clsUTGrafoP2P2=1;
    int clsUTGrafoP2P3=-672;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    Grafo clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.grafoTransposto();
    Grafo clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.grafoTransposto();
    assertEquals(100,clsUTGrafoP3RP0R.numVertices());
    Grafo clsUTGrafoP3RP1R=null;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.grafoTransposto();
    assertEquals(100,clsUTGrafoP3RP1R.numVertices());
    assertEquals(100,clsUTGrafoP3R.numVertices());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[818, 356, 899]
2)----->v2[], 
3)----->toString[]
 Covered Branches:[1, 4]
 */
  @Test public void TestCase13() throws Throwable {
    int clsUTArestaP1P1=818;
    int clsUTArestaP1P2=356;
    int clsUTArestaP1P3=899;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v2();
    assertEquals(356,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
  }
}
