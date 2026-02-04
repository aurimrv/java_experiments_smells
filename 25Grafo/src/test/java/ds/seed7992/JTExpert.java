package ds.seed7992;
import static org.junit.Assert.*;
import org.junit.Ignore;
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
Evaluations : 78481
search time (ms): 42501
total runtime (ms): 44231
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->primeiroListaAdj[0], 
3)----->toString[]
 Covered Branches:[18, 20, 9, 10]
 */
  @Test public void TestCase0() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2P1=0;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.primeiroListaAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    String clsUTGrafoP3RP0P1=new String("1867435029");
    boolean clsUTGrafoP3RP0R=false;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.endsWith(clsUTGrafoP3RP0P1);
    assertEquals("1867435029",clsUTGrafoP3RP0P1.toString());
    assertEquals(false,clsUTGrafoP3RP0R);
    String clsUTGrafoP3RP1R=null;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.intern();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->insereAresta[1, 107, 0], 
3)----->existeAresta[1, -141], 
4)----->primeiroListaAdj[0], 
5)----->numVertices[], 
6)----->numVertices[]
 Covered Branches:[18, 20, 5, 6, 8, 9, 10, 11, 12, 14, 30]
 */
  @Test public void TestCase1() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2P1=1;
    int clsUTGrafoP2P2=107;
    int clsUTGrafoP2P3=0;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3P1=1;
    int clsUTGrafoP3P2=-141;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.existeAresta(clsUTGrafoP3P1,clsUTGrafoP3P2);
    assertEquals(false,clsUTGrafoP3R);
    int clsUTGrafoP4P1=0;
    Grafo.Aresta clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.primeiroListaAdj(clsUTGrafoP4P1);
    assertNull(clsUTGrafoP4R);
    int clsUTGrafoP5R=0;
      clsUTGrafoP5R=clsUTGrafo.numVertices();
    assertEquals(100,clsUTGrafoP5R);
    int clsUTGrafoP6R=0;
      clsUTGrafoP6R=clsUTGrafo.numVertices();
    assertEquals(100,clsUTGrafoP6R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->imprime[], 
3)----->numVertices[], 
4)----->insereAresta[1, 548, -995], 
5)----->retiraAresta[1, 813], 
6)----->listaAdjVazia[1]
 Covered Branches:[5, 6, 8, 9, 10, 11, 15, 17, 24, 26, 27, 28, 30]
 */
  @Test public void TestCase2() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
      clsUTGrafo.imprime();
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(100,clsUTGrafoP3R);
    int clsUTGrafoP4P1=1;
    int clsUTGrafoP4P2=548;
    int clsUTGrafoP4P3=-995;
      clsUTGrafo.insereAresta(clsUTGrafoP4P1,clsUTGrafoP4P2,clsUTGrafoP4P3);
    int clsUTGrafoP5P1=1;
    int clsUTGrafoP5P2=813;
    Grafo.Aresta clsUTGrafoP5R=null;
      clsUTGrafoP5R=clsUTGrafo.retiraAresta(clsUTGrafoP5P1,clsUTGrafoP5P2);
    assertNull(clsUTGrafoP5R);
    int clsUTGrafoP6P1=1;
    boolean clsUTGrafoP6R=false;
      clsUTGrafoP6R=clsUTGrafo.listaAdjVazia(clsUTGrafoP6P1);
    assertEquals(false,clsUTGrafoP6R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[-558, 12, 236]
2)----->v2[], 
3)----->toString[]
 Covered Branches:[1, 4]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTArestaP1P1=-558;
    int clsUTArestaP1P2=12;
    int clsUTArestaP1P3=236;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v2();
    assertEquals(12,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->insereAresta[0, 647, 5], 
3)----->proxAdj[0]
 Covered Branches:[1, 5, 21, 22, 9, 10, 11]
 */
  @Test public void TestCase4() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2P1=0;
    int clsUTGrafoP2P2=647;
    int clsUTGrafoP2P3=5;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3P1=0;
    Grafo.Aresta clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.proxAdj(clsUTGrafoP3P1);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->imprime[], 
3)----->numVertices[]
 Covered Branches:[9, 10, 27, 28, 30]
 */
  @Test public void TestCase5() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
      clsUTGrafo.imprime();
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(100,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[]
 Covered Branches:[32, 16, 34, 5, 24, 9, 10, 12, 31, 15]
 */
  @Test public void TestCase6() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=-348;
    int clsUTGrafoP2RP0P2=-443;
    boolean clsUTGrafoP2RP0R=false;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.existeAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    int clsUTGrafoP2RP1P1=283;
    int clsUTGrafoP2RP1P2=1;
    Grafo.Aresta clsUTGrafoP2RP1R=null;
//Exception
    try {
      clsUTGrafoP2RP1R=clsUTGrafoP2R.retiraAresta(clsUTGrafoP2RP1P1,clsUTGrafoP2RP1P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP1R);
    assertEquals(100,clsUTGrafoP2R.numVertices());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 16, 34, 5, 9, 10, 11, 30, 31, 15]
 */
  @Test public void TestCase7() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=256;
    int clsUTGrafoP2RP0P2=-669;
    int clsUTGrafoP2RP0P3=692;
//Exception
    try {
      clsUTGrafoP2R.insereAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2,clsUTGrafoP2RP0P3);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals(100,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(100,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[32, 16, 34, 18, 9, 10, 27, 28, 31, 15]
 */
  @Test public void TestCase8() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=327;
    Grafo.Aresta clsUTGrafoP2RP0R=null;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.primeiroListaAdj(clsUTGrafoP2RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP0R);
      clsUTGrafoP2R.imprime();
    assertEquals(100,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    String clsUTGrafoP3RP0P1=new String("G78Uoly3wILYK0TjszPCdahRJHNAi6MnrWm1BSkXpVbvqc4E59uQftFxOe2DgZ");
    boolean clsUTGrafoP3RP0R=false;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.startsWith(clsUTGrafoP3RP0P1);
    assertEquals("G78Uoly3wILYK0TjszPCdahRJHNAi6MnrWm1BSkXpVbvqc4E59uQftFxOe2DgZ",clsUTGrafoP3RP0P1.toString());
    assertEquals(false,clsUTGrafoP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->insereAresta[1, 159, -234], 
3)----->imprime[], 
4)----->numVertices[]
 Covered Branches:[5, 9, 10, 11, 27, 28, 29, 30]
 */
  @Test public void TestCase9() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2P1=1;
    int clsUTGrafoP2P2=159;
    int clsUTGrafoP2P3=-234;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
      clsUTGrafo.imprime();
    int clsUTGrafoP4R=0;
      clsUTGrafoP4R=clsUTGrafo.numVertices();
    assertEquals(100,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[32, 33, 1, 34, 2, 35, 3, 4, 5, 9, 10, 11, 15, 16, 17, 18, 19, 21, 23, 31]
 */
 @Ignore
  @Test public void TestCase10() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=1;
    int clsUTGrafoP2RP0P2=0;
    int clsUTGrafoP2RP0P3=101;
      clsUTGrafoP2R.insereAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2,clsUTGrafoP2RP0P3);
    Grafo clsUTGrafoP2RP1R=null;
      clsUTGrafoP2RP1R=clsUTGrafoP2R.grafoTransposto();
    assertEquals(100,clsUTGrafoP2RP1R.numVertices());
    assertEquals(100,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    int clsUTGrafoP3RP0R=0;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.length();
    assertEquals(17,clsUTGrafoP3RP0R);
    String clsUTGrafoP3RP1R=null;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.intern();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[], 
3)----->toString[], 
4)----->numVertices[]
 Covered Branches:[32, 16, 34, 9, 10, 30, 31, 15]
 */
  @Test public void TestCase11() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    assertEquals(100,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    int clsUTGrafoP4R=0;
      clsUTGrafoP4R=clsUTGrafo.numVertices();
    assertEquals(100,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[1, 404, 733]
2)----->peso[], 
3)----->toString[]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase12() throws Throwable {
    int clsUTArestaP1P1=1;
    int clsUTArestaP1P2=404;
    int clsUTArestaP1P3=733;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.peso();
    assertEquals(733,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    String clsUTArestaP3RP0R=null;
      clsUTArestaP3RP0R=clsUTArestaP3R.toUpperCase();
    String clsUTArestaP3RP1R=null;
      clsUTArestaP3RP1R=clsUTArestaP3R.toUpperCase();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[], 
3)----->numVertices[], 
4)----->toString[]
 Covered Branches:[32, 16, 34, 21, 9, 10, 30, 31, 15]
 */
  @Test public void TestCase13() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=602;
    Grafo.Aresta clsUTGrafoP2RP0R=null;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.proxAdj(clsUTGrafoP2RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP0R);
    assertEquals(100,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(100,clsUTGrafoP3R);
    String clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[351, 18, -631]
2)----->v1[], 
3)----->toString[]
 Covered Branches:[1, 3]
 */
  @Test public void TestCase14() throws Throwable {
    int clsUTArestaP1P1=351;
    int clsUTArestaP1P2=18;
    int clsUTArestaP1P3=-631;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v1();
    assertEquals(351,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    String clsUTArestaP3RP0R=null;
      clsUTArestaP3RP0R=clsUTArestaP3R.trim();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->imprime[], 
3)----->numVertices[], 
4)----->existeAresta[77, -421], 
5)----->listaAdjVazia[1]
 Covered Branches:[16, 5, 9, 10, 27, 28, 12, 30, 14, 15]
 */
  @Test public void TestCase15() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
      clsUTGrafo.imprime();
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(100,clsUTGrafoP3R);
    int clsUTGrafoP4P1=77;
    int clsUTGrafoP4P2=-421;
    boolean clsUTGrafoP4R=false;
      clsUTGrafoP4R=clsUTGrafo.existeAresta(clsUTGrafoP4P1,clsUTGrafoP4P2);
    assertEquals(false,clsUTGrafoP4R);
    int clsUTGrafoP5P1=1;
    boolean clsUTGrafoP5R=false;
      clsUTGrafoP5R=clsUTGrafo.listaAdjVazia(clsUTGrafoP5P1);
    assertEquals(true,clsUTGrafoP5R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->proxAdj[1], 
3)----->toString[], 
4)----->existeAresta[99, 445]
 Covered Branches:[21, 5, 23, 9, 10, 12, 14]
 */
  @Test public void TestCase16() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2P1=1;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.proxAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    float clsUTGrafoP3RP0P1=7.623064E37F;
    String clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=String.valueOf(clsUTGrafoP3RP0P1);
    assertEquals("7.623064E37",clsUTGrafoP3RP0R);
    int clsUTGrafoP4P1=99;
    int clsUTGrafoP4P2=445;
    boolean clsUTGrafoP4R=false;
      clsUTGrafoP4R=clsUTGrafo.existeAresta(clsUTGrafoP4P1,clsUTGrafoP4P2);
    assertEquals(false,clsUTGrafoP4R);
  }
}
