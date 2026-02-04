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
Covered branches: [1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20, 21, 23, 24, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35]
Uncovered branches: [22, 7, 25, 13]
Total number of branches: 35
Total number of covered branches: 31
Coverage : 88,57%
Evaluations : 35818
search time (ms): 42504
total runtime (ms): 44660
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Grafo[972]
2)----->proxAdj[328], 
3)----->existeAresta[465, -730], 
4)----->toString[]
 Covered Branches:[21, 5, 23, 9, 10, 12, 14]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTGrafoP1P1=972;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=328;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.proxAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    int clsUTGrafoP3P1=465;
    int clsUTGrafoP3P2=-730;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.existeAresta(clsUTGrafoP3P1,clsUTGrafoP3P2);
    assertEquals(false,clsUTGrafoP3R);
    String clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[126]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 16, 34, 9, 10, 27, 28, 30, 31, 15]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTGrafoP1P1=126;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0R=0;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.numVertices();
    assertEquals(126,clsUTGrafoP2RP0R);
      clsUTGrafoP2R.imprime();
    assertEquals(126,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(126,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[667]
2)----->grafoTransposto[]
 Covered Branches:[32, 16, 34, 5, 24, 9, 10, 31, 15]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTGrafoP1P1=667;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=-561;
    int clsUTGrafoP2RP0P2=-52;
    Grafo.Aresta clsUTGrafoP2RP0R=null;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.retiraAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP0R);
    assertEquals(667,clsUTGrafoP2R.numVertices());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[780]
2)----->grafoTransposto[], 
3)----->toString[], 
4)----->numVertices[]
 Covered Branches:[32, 34, 5, 9, 10, 11, 15, 16, 27, 28, 29, 30, 31]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTGrafoP1P1=780;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=689;
    int clsUTGrafoP2RP0P2=764;
    int clsUTGrafoP2RP0P3=280;
      clsUTGrafoP2R.insereAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2,clsUTGrafoP2RP0P3);
      clsUTGrafoP2R.imprime();
    assertEquals(780,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    int clsUTGrafoP4R=0;
      clsUTGrafoP4R=clsUTGrafo.numVertices();
    assertEquals(780,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[927]
2)----->primeiroListaAdj[248], 
3)----->existeAresta[680, 990], 
4)----->toString[]
 Covered Branches:[18, 20, 5, 9, 10, 12, 14]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTGrafoP1P1=927;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=248;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.primeiroListaAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    int clsUTGrafoP3P1=680;
    int clsUTGrafoP3P2=990;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.existeAresta(clsUTGrafoP3P1,clsUTGrafoP3P2);
    assertEquals(false,clsUTGrafoP3R);
    String clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.toString();
    CharSequence clsUTGrafoP4RP0P1=null;
      clsUTGrafoP4RP0P1=new StringBuffer();
    CharSequence clsUTGrafoP4RP0P2=null;
      clsUTGrafoP4RP0P2=new String();
    String clsUTGrafoP4RP0R=null;
      clsUTGrafoP4RP0R=clsUTGrafoP4R.replace(clsUTGrafoP4RP0P1,clsUTGrafoP4RP0P2);
    assertEquals("",clsUTGrafoP4RP0P1.toString());
    assertEquals(0,clsUTGrafoP4RP0P1.length());
    assertEquals("",clsUTGrafoP4RP0P2.toString());
    assertEquals(0,clsUTGrafoP4RP0P2.length());
    int clsUTGrafoP4RP1P1=362;
    int clsUTGrafoP4RP1R=0;
//Exception
    try {
      clsUTGrafoP4RP1R=clsUTGrafoP4R.codePointBefore(clsUTGrafoP4RP1P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[-395, 535, -134]
2)----->v2[]
 Covered Branches:[1, 4]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTArestaP1P1=-395;
    int clsUTArestaP1P2=535;
    int clsUTArestaP1P3=-134;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v2();
    assertEquals(535,clsUTArestaP2R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[-275, 608, -133]
2)----->peso[], 
3)----->toString[]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTArestaP1P1=-275;
    int clsUTArestaP1P2=608;
    int clsUTArestaP1P3=-133;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.peso();
    assertEquals(-133,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    char clsUTArestaP3RP0P1='\u0033';
    char clsUTArestaP3RP0P2='\u0068';
    String clsUTArestaP3RP0R=null;
      clsUTArestaP3RP0R=clsUTArestaP3R.replace(clsUTArestaP3RP0P1,clsUTArestaP3RP0P2);
    char[] clsUTArestaP3RP1R=null;
      clsUTArestaP3RP1R=clsUTArestaP3R.toCharArray();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[865]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[32, 16, 34, 9, 10, 31, 15]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTGrafoP1P1=865;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    assertEquals(865,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[455]
2)----->grafoTransposto[], 
3)----->toString[], 
4)----->numVertices[]
 Covered Branches:[32, 33, 1, 34, 2, 35, 3, 4, 5, 9, 10, 11, 15, 16, 17, 18, 19, 30, 31]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTGrafoP1P1=455;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=165;
    int clsUTGrafoP2RP0P2=601;
    int clsUTGrafoP2RP0P3=-62;
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
    assertEquals(455,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    char[] clsUTGrafoP3RP0P1=new char[]{'\u0063'};
    int clsUTGrafoP3RP0P2=29;
    int clsUTGrafoP3RP0P3=479;
    String clsUTGrafoP3RP0R=null;
//Exception
    try {
      clsUTGrafoP3RP0R=String.valueOf(clsUTGrafoP3RP0P1,clsUTGrafoP3RP0P2,clsUTGrafoP3RP0P3);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertTrue(Arrays.equals(new char[]{'\u0063'},clsUTGrafoP3RP0P1));
    assertNull(clsUTGrafoP3RP0R);
    int clsUTGrafoP4R=0;
      clsUTGrafoP4R=clsUTGrafo.numVertices();
    assertEquals(455,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[479]
2)----->imprime[], 
3)----->existeAresta[1, 706]
 Covered Branches:[5, 9, 10, 27, 28, 12, 14]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTGrafoP1P1=479;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
      clsUTGrafo.imprime();
    int clsUTGrafoP3P1=1;
    int clsUTGrafoP3P2=706;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.existeAresta(clsUTGrafoP3P1,clsUTGrafoP3P2);
    assertEquals(false,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[15]
2)----->grafoTransposto[], 
3)----->insereAresta[0, -682, 938], 
4)----->retiraAresta[0, -231]
 Covered Branches:[32, 34, 5, 6, 8, 9, 10, 11, 15, 16, 21, 24, 26, 27, 28, 31]
 */
  @Test public void TestCase10() throws Throwable {
    int clsUTGrafoP1P1=15;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
      clsUTGrafoP2R.imprime();
    int clsUTGrafoP2RP1P1=929;
    Grafo.Aresta clsUTGrafoP2RP1R=null;
//Exception
    try {
      clsUTGrafoP2RP1R=clsUTGrafoP2R.proxAdj(clsUTGrafoP2RP1P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP1R);
    int clsUTGrafoP3P1=0;
    int clsUTGrafoP3P2=-682;
    int clsUTGrafoP3P3=938;
      clsUTGrafo.insereAresta(clsUTGrafoP3P1,clsUTGrafoP3P2,clsUTGrafoP3P3);
    int clsUTGrafoP4P1=0;
    int clsUTGrafoP4P2=-231;
    Grafo.Aresta clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.retiraAresta(clsUTGrafoP4P1,clsUTGrafoP4P2);
    assertNull(clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[-412, 64, -563]
2)----->v1[], 
3)----->toString[]
 Covered Branches:[1, 3]
 */
  @Test public void TestCase11() throws Throwable {
    int clsUTArestaP1P1=-412;
    int clsUTArestaP1P2=64;
    int clsUTArestaP1P3=-563;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v1();
    assertEquals(-412,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    String clsUTArestaP3RP0P1=new String("0dyoYhJPOEtwV8G");
    String clsUTArestaP3RP0P2=new String("403qb0demgly3qtstfkjfne4qucpsd83itu8ugkujo1w");
    String clsUTArestaP3RP0R=null;
      clsUTArestaP3RP0R=clsUTArestaP3R.replaceAll(clsUTArestaP3RP0P1,clsUTArestaP3RP0P2);
    assertEquals("0dyoYhJPOEtwV8G",clsUTArestaP3RP0P1.toString());
    assertEquals("403qb0demgly3qtstfkjfne4qucpsd83itu8ugkujo1w",clsUTArestaP3RP0P2.toString());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[154]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 16, 34, 5, 9, 10, 11, 30, 31, 15]
 */
  @Test public void TestCase12() throws Throwable {
    int clsUTGrafoP1P1=154;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=-208;
    int clsUTGrafoP2RP0P2=0;
    int clsUTGrafoP2RP0P3=569;
//Exception
    try {
      clsUTGrafoP2R.insereAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2,clsUTGrafoP2RP0P3);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals(154,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(154,clsUTGrafoP3R);
  }
}
