package ds.seed6733;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Grafo;
import java.util.Arrays;
/** 
 * This class was automatically generated to test the ds.Grafo class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20, 21, 23, 24, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35]
Uncovered branches: [22, 7, 25, 13]
Total number of branches: 35
Total number of covered branches: 31
Coverage : 88,57%
Evaluations : 30055
search time (ms): 42501
total runtime (ms): 44708
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Grafo[538]
2)----->imprime[], 
3)----->numVertices[]
 Covered Branches:[9, 10, 27, 28, 30]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTGrafoP1P1=538;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
      clsUTGrafo.imprime();
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(538,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[937]
2)----->proxAdj[1], 
3)----->listaAdjVazia[1]
 Covered Branches:[16, 21, 23, 9, 10, 15]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTGrafoP1P1=937;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=1;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.proxAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    int clsUTGrafoP3P1=1;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.listaAdjVazia(clsUTGrafoP3P1);
    assertEquals(true,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[462]
2)----->insereAresta[423, 747, -1], 
3)----->existeAresta[1, 579], 
4)----->toString[]
 Covered Branches:[5, 9, 10, 11, 12, 14]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTGrafoP1P1=462;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=423;
    int clsUTGrafoP2P2=747;
    int clsUTGrafoP2P3=-1;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3P1=1;
    int clsUTGrafoP3P2=579;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.existeAresta(clsUTGrafoP3P1,clsUTGrafoP3P2);
    assertEquals(false,clsUTGrafoP3R);
    String clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.toString();
    String clsUTGrafoP4RP0P1=new String("4t;]&");
    int clsUTGrafoP4RP0P2=326;
    String[] clsUTGrafoP4RP0R=null;
      clsUTGrafoP4RP0R=clsUTGrafoP4R.split(clsUTGrafoP4RP0P1,clsUTGrafoP4RP0P2);
    assertEquals("4t;]&",clsUTGrafoP4RP0P1.toString());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[323]
2)----->insereAresta[1, -414, 17], 
3)----->imprime[], 
4)----->insereAresta[302, -1, 892]
 Covered Branches:[5, 9, 10, 11, 27, 28, 29]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTGrafoP1P1=323;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=1;
    int clsUTGrafoP2P2=-414;
    int clsUTGrafoP2P3=17;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
      clsUTGrafo.imprime();
    int clsUTGrafoP4P1=302;
    int clsUTGrafoP4P2=-1;
    int clsUTGrafoP4P3=892;
      clsUTGrafo.insereAresta(clsUTGrafoP4P1,clsUTGrafoP4P2,clsUTGrafoP4P3);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[902]
2)----->existeAresta[594, -500], 
3)----->toString[]
 Covered Branches:[5, 9, 10, 12, 14]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTGrafoP1P1=902;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=594;
    int clsUTGrafoP2P2=-500;
    boolean clsUTGrafoP2R=false;
      clsUTGrafoP2R=clsUTGrafo.existeAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    assertEquals(false,clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    String clsUTGrafoP3RP0P1=new String("C|ez{hzpt");
    int clsUTGrafoP3RP0P2=275;
    boolean clsUTGrafoP3RP0R=false;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.startsWith(clsUTGrafoP3RP0P1,clsUTGrafoP3RP0P2);
    assertEquals("C|ez{hzpt",clsUTGrafoP3RP0P1.toString());
    assertEquals(false,clsUTGrafoP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[317, -839, -562]
2)----->v1[], 
3)----->toString[]
 Covered Branches:[1, 3]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTArestaP1P1=317;
    int clsUTArestaP1P2=-839;
    int clsUTArestaP1P3=-562;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v1();
    assertEquals(317,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    int clsUTArestaP3RP0P1=674;
    int clsUTArestaP3RP0R=0;
      clsUTArestaP3RP0R=clsUTArestaP3R.indexOf(clsUTArestaP3RP0P1);
    assertEquals(-1,clsUTArestaP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[776]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 16, 34, 21, 9, 10, 30, 31, 15]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTGrafoP1P1=776;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=-807;
    Grafo.Aresta clsUTGrafoP2RP0R=null;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.proxAdj(clsUTGrafoP2RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP0R);
    assertEquals(776,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(776,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[330]
2)----->grafoTransposto[], 
3)----->numVertices[], 
4)----->toString[]
 Covered Branches:[32, 16, 34, 5, 24, 9, 10, 30, 31, 15]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTGrafoP1P1=330;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=-470;
    int clsUTGrafoP2RP0P2=404;
    Grafo.Aresta clsUTGrafoP2RP0R=null;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.retiraAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP0R);
    assertEquals(330,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(330,clsUTGrafoP3R);
    String clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.toString();
    int clsUTGrafoP4RP0P2=592;
    String[] clsUTGrafoP4RP0R=null;
//Exception
    try {
      clsUTGrafoP4RP0R=clsUTGrafoP4R.split((String)null,clsUTGrafoP4RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP4RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[926]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[32, 16, 34, 9, 10, 31, 15]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTGrafoP1P1=926;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    assertEquals(926,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[942]
2)----->insereAresta[1, 1, 1], 
3)----->numVertices[], 
4)----->listaAdjVazia[1]
 Covered Branches:[17, 5, 9, 10, 11, 30, 15]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTGrafoP1P1=942;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=1;
    int clsUTGrafoP2P2=1;
    int clsUTGrafoP2P3=1;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(942,clsUTGrafoP3R);
    int clsUTGrafoP4P1=1;
    boolean clsUTGrafoP4R=false;
      clsUTGrafoP4R=clsUTGrafo.listaAdjVazia(clsUTGrafoP4P1);
    assertEquals(false,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[91, -343, -170]
2)----->peso[]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase10() throws Throwable {
    int clsUTArestaP1P1=91;
    int clsUTArestaP1P2=-343;
    int clsUTArestaP1P3=-170;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.peso();
    assertEquals(-170,clsUTArestaP2R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[931]
2)----->imprime[], 
3)----->insereAresta[1, 180, -7], 
4)----->retiraAresta[1, -579]
 Covered Branches:[5, 6, 24, 8, 9, 10, 26, 27, 11, 28]
 */
  @Test public void TestCase11() throws Throwable {
    int clsUTGrafoP1P1=931;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
      clsUTGrafo.imprime();
    int clsUTGrafoP3P1=1;
    int clsUTGrafoP3P2=180;
    int clsUTGrafoP3P3=-7;
      clsUTGrafo.insereAresta(clsUTGrafoP3P1,clsUTGrafoP3P2,clsUTGrafoP3P3);
    int clsUTGrafoP4P1=1;
    int clsUTGrafoP4P2=-579;
    Grafo.Aresta clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.retiraAresta(clsUTGrafoP4P1,clsUTGrafoP4P2);
    assertNull(clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[314]
2)----->grafoTransposto[], 
3)----->insereAresta[0, 1, -317], 
4)----->grafoTransposto[]
 Covered Branches:[32, 33, 1, 34, 2, 35, 3, 4, 5, 9, 10, 11, 15, 16, 17, 18, 19, 21, 23, 31]
 */
  @Test public void TestCase12() throws Throwable {
    int clsUTGrafoP1P1=314;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    assertEquals(314,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3P1=0;
    int clsUTGrafoP3P2=1;
    int clsUTGrafoP3P3=-317;
      clsUTGrafo.insereAresta(clsUTGrafoP3P1,clsUTGrafoP3P2,clsUTGrafoP3P3);
    Grafo clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.grafoTransposto();
    assertEquals(314,clsUTGrafoP4R.numVertices());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[320]
2)----->primeiroListaAdj[1]
 Covered Branches:[18, 20, 9, 10]
 */
  @Test public void TestCase13() throws Throwable {
    int clsUTGrafoP1P1=320;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=1;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.primeiroListaAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[-390, -437, 99]
2)----->v2[], 
3)----->toString[]
 Covered Branches:[1, 4]
 */
  @Test public void TestCase14() throws Throwable {
    int clsUTArestaP1P1=-390;
    int clsUTArestaP1P2=-437;
    int clsUTArestaP1P3=99;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v2();
    assertEquals(-437,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    float clsUTArestaP3RP0P1P1=9.275926E37F;
    CharSequence clsUTArestaP3RP0P1=null;
      clsUTArestaP3RP0P1=String.valueOf(clsUTArestaP3RP0P1P1);
    boolean clsUTArestaP3RP0R=false;
      clsUTArestaP3RP0R=clsUTArestaP3R.contentEquals(clsUTArestaP3RP0P1);
    assertEquals("9.275926E37",clsUTArestaP3RP0P1.toString());
    assertEquals(11,clsUTArestaP3RP0P1.length());
    assertEquals(false,clsUTArestaP3RP0R);
    int clsUTArestaP3RP1P1=-341;
    String clsUTArestaP3RP1R=null;
//Exception
    try {
      clsUTArestaP3RP1R=clsUTArestaP3R.substring(clsUTArestaP3RP1P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTArestaP3RP1R);
  }
}
