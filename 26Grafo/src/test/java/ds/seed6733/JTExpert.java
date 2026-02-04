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
Covered branches: [1, 2, 3, 4, 5, 6, 7, 9, 10, 14, 15, 16, 17, 18, 19, 20, 21, 25, 26, 27, 29, 30, 31, 32, 33, 34, 35, 36, 37]
Uncovered branches: [22, 23, 8, 24, 11, 12, 28, 13]
Total number of branches: 37
Total number of covered branches: 29
Coverage : 78,38%
Evaluations : 41914
search time (ms): 42501
total runtime (ms): 44448
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Grafo[114]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 33, 34, 18, 36, 5, 6, 14, 15]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTGrafoP1P1=114;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=469;
    Grafo.Aresta clsUTGrafoP2RP0R=null;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.proxAdj(clsUTGrafoP2RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP0R);
    assertEquals(114,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(114,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[2]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 33, 34, 36, 5, 6, 29, 14, 30, 15]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTGrafoP1P1=2;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
      clsUTGrafoP2R.imprime();
    assertEquals(2,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(2,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[551]
2)----->primeiroListaAdj[201], 
3)----->toString[]
 Covered Branches:[17, 18, 19, 5, 6]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTGrafoP1P1=551;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=201;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.primeiroListaAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    boolean clsUTGrafoP3RP0P1=false;
    int clsUTGrafoP3RP0P2=-82;
    String clsUTGrafoP3RP0P3=new String(":");
    int clsUTGrafoP3RP0P4=763;
    int clsUTGrafoP3RP0P5=719;
    boolean clsUTGrafoP3RP0R=false;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.regionMatches(clsUTGrafoP3RP0P1,clsUTGrafoP3RP0P2,clsUTGrafoP3RP0P3,clsUTGrafoP3RP0P4,clsUTGrafoP3RP0P5);
    assertEquals(":",clsUTGrafoP3RP0P3.toString());
    assertEquals(false,clsUTGrafoP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[1]
2)----->insereAresta[980, 233, -340], 
3)----->proxAdj[0], 
4)----->listaAdjVazia[0]
 Covered Branches:[16, 1, 18, 2, 20, 5, 6, 7, 9, 14]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTGrafoP1P1=1;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=980;
    int clsUTGrafoP2P2=233;
    int clsUTGrafoP2P3=-340;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3P1=0;
    Grafo.Aresta clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.proxAdj(clsUTGrafoP3P1);
    int clsUTGrafoP3RP0R=0;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.peso();
    assertEquals(-340,clsUTGrafoP3RP0R);
    int clsUTGrafoP4P1=0;
    boolean clsUTGrafoP4R=false;
      clsUTGrafoP4R=clsUTGrafo.listaAdjVazia(clsUTGrafoP4P1);
    assertEquals(false,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[451]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 33, 34, 36, 5, 6, 7, 9, 14, 15, 29, 30, 31]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTGrafoP1P1=451;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=750;
    int clsUTGrafoP2RP0P2=-843;
    int clsUTGrafoP2RP0P3=782;
      clsUTGrafoP2R.insereAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2,clsUTGrafoP2RP0P3);
      clsUTGrafoP2R.imprime();
    assertEquals(451,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(451,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[864]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 33, 1, 34, 2, 35, 3, 36, 4, 5, 37, 6, 7, 9, 14, 15, 16, 17, 18, 20]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTGrafoP1P1=864;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=0;
    int clsUTGrafoP2RP0P2=-230;
    int clsUTGrafoP2RP0P3=175;
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
    assertEquals(864,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(864,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[710, -280, -65]
2)----->v1[], 
3)----->toString[]
 Covered Branches:[1, 3]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTArestaP1P1=710;
    int clsUTArestaP1P2=-280;
    int clsUTArestaP1P3=-65;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v1();
    assertEquals(710,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    String clsUTArestaP3RP0P1=new String("n|{LRK->B_7oz@j }S<kOU:m9t(8lD.MIysf%P]");
    int clsUTArestaP3RP0P2=0;
    int clsUTArestaP3RP0R=0;
      clsUTArestaP3RP0R=clsUTArestaP3R.indexOf(clsUTArestaP3RP0P1,clsUTArestaP3RP0P2);
    assertEquals(-1,clsUTArestaP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[133]
2)----->retiraAresta[1, 0], 
3)----->toString[], 
4)----->proxAdj[0]
 Covered Branches:[1, 2, 18, 19, 5, 21, 6, 25, 27]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTGrafoP1P1=133;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=1;
    int clsUTGrafoP2P2=0;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.retiraAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    int clsUTGrafoP2RP0R=0;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.peso();
    assertEquals(0,clsUTGrafoP2RP0R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    int clsUTGrafoP4P1=0;
    Grafo.Aresta clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.proxAdj(clsUTGrafoP4P1);
    assertNull(clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[-547, -836, 97]
2)----->peso[], 
3)----->toString[]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTArestaP1P1=-547;
    int clsUTArestaP1P2=-836;
    int clsUTArestaP1P3=97;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.peso();
    assertEquals(97,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    byte[] clsUTArestaP3RP0R=null;
      clsUTArestaP3RP0R=clsUTArestaP3R.getBytes();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[606, -230, 733]
2)----->v2[], 
3)----->toString[]
 Covered Branches:[1, 4]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTArestaP1P1=606;
    int clsUTArestaP1P2=-230;
    int clsUTArestaP1P3=733;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v2();
    assertEquals(-230,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    String clsUTArestaP3RP0P1=new String("dk3vtfg4nxcpohy28j1lbm6q0ewsu7ai5r9z");
    int clsUTArestaP3RP0R=0;
      clsUTArestaP3RP0R=clsUTArestaP3R.lastIndexOf(clsUTArestaP3RP0P1);
    assertEquals("dk3vtfg4nxcpohy28j1lbm6q0ewsu7ai5r9z",clsUTArestaP3RP0P1.toString());
    assertEquals(-1,clsUTArestaP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[534]
2)----->numVertices[], 
3)----->toString[]
 Covered Branches:[32, 5, 6]
 */
  @Test public void TestCase10() throws Throwable {
    int clsUTGrafoP1P1=534;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2R=0;
      clsUTGrafoP2R=clsUTGrafo.numVertices();
    assertEquals(534,clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    int clsUTGrafoP3RP0P1=-817;
    int clsUTGrafoP3RP0P2=3;
    int clsUTGrafoP3RP0R=0;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.lastIndexOf(clsUTGrafoP3RP0P1,clsUTGrafoP3RP0P2);
    assertEquals(-1,clsUTGrafoP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[1]
2)----->existeAresta[909, -433], 
3)----->toString[]
 Covered Branches:[5, 6, 10]
 */
  @Test public void TestCase11() throws Throwable {
    int clsUTGrafoP1P1=1;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=909;
    int clsUTGrafoP2P2=-433;
    boolean clsUTGrafoP2R=false;
      clsUTGrafoP2R=clsUTGrafo.existeAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    assertEquals(false,clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[51]
2)----->retiraAresta[904, 830], 
3)----->toString[]
 Covered Branches:[5, 21, 6, 26]
 */
  @Test public void TestCase12() throws Throwable {
    int clsUTGrafoP1P1=51;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=904;
    int clsUTGrafoP2P2=830;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.retiraAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    assertNull(clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    char[] clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.toCharArray();
    double clsUTGrafoP3RP1P1=32.162144283082654D;
    String clsUTGrafoP3RP1R=null;
      clsUTGrafoP3RP1R=String.valueOf(clsUTGrafoP3RP1P1);
    assertEquals("32.162144283082654",clsUTGrafoP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[80]
2)----->listaAdjVazia[444], 
3)----->toString[]
 Covered Branches:[5, 6, 14, 15]
 */
  @Test public void TestCase13() throws Throwable {
    int clsUTGrafoP1P1=80;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=444;
    boolean clsUTGrafoP2R=false;
      clsUTGrafoP2R=clsUTGrafo.listaAdjVazia(clsUTGrafoP2P1);
    assertEquals(true,clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[980]
2)----->proxAdj[824], 
3)----->toString[], 
4)----->proxAdj[1]
 Covered Branches:[18, 19, 5, 6]
 */
  @Test public void TestCase14() throws Throwable {
    int clsUTGrafoP1P1=980;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=824;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.proxAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    int clsUTGrafoP3RP0P2=-202;
    int clsUTGrafoP3RP0R=0;
//Exception
    try {
      clsUTGrafoP3RP0R=clsUTGrafoP3R.indexOf((String)null,clsUTGrafoP3RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    int clsUTGrafoP4P1=1;
    Grafo.Aresta clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.proxAdj(clsUTGrafoP4P1);
    assertNull(clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[795]
2)----->insereAresta[709, -440, -348], 
3)----->toString[]
 Covered Branches:[5, 6, 7, 9]
 */
  @Test public void TestCase15() throws Throwable {
    int clsUTGrafoP1P1=795;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=709;
    int clsUTGrafoP2P2=-440;
    int clsUTGrafoP2P3=-348;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
  }
}
