package ds.seed9121;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Grafo;
import java.util.Arrays;
/** 
 * This class was automatically generated to test the ds.Grafo class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 27, 28, 29, 30, 31, 32, 33, 34, 35]
Uncovered branches: [7, 25, 26, 13]
Total number of branches: 35
Total number of covered branches: 31
Coverage : 88,57%
Evaluations : 37930
search time (ms): 42516
total runtime (ms): 44435
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Grafo[0]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[21, 9, 30, 31]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTGrafoP1P1=0;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0R=0;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.numVertices();
    assertEquals(0,clsUTGrafoP2RP0R);
    int clsUTGrafoP2RP1P1=-840;
    Grafo.Aresta clsUTGrafoP2RP1R=null;
//Exception
    try {
      clsUTGrafoP2RP1R=clsUTGrafoP2R.proxAdj(clsUTGrafoP2RP1P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP1R);
    assertEquals(0,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[-250, -884, 939]
2)----->peso[], 
3)----->toString[]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTArestaP1P1=-250;
    int clsUTArestaP1P2=-884;
    int clsUTArestaP1P3=939;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.peso();
    assertEquals(939,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    StringBuffer clsUTArestaP3RP0P1=null;
      clsUTArestaP3RP0P1=new StringBuffer();
    boolean clsUTArestaP3RP0R=false;
      clsUTArestaP3RP0R=clsUTArestaP3R.contentEquals(clsUTArestaP3RP0P1);
    assertEquals("",clsUTArestaP3RP0P1.toString());
    assertEquals(0,clsUTArestaP3RP0P1.length());
    assertEquals(false,clsUTArestaP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[856]
2)----->imprime[], 
3)----->numVertices[], 
4)----->toString[]
 Covered Branches:[9, 10, 27, 28, 30]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTGrafoP1P1=856;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
      clsUTGrafo.imprime();
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(856,clsUTGrafoP3R);
    String clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.toString();
    int clsUTGrafoP4RP0R=0;
      clsUTGrafoP4RP0R=clsUTGrafoP4R.hashCode();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[0]
2)----->grafoTransposto[], 
3)----->numVertices[], 
4)----->toString[]
 Covered Branches:[5, 24, 9, 27, 30, 31]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTGrafoP1P1=0;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
      clsUTGrafoP2R.imprime();
    int clsUTGrafoP2RP1P1=0;
    int clsUTGrafoP2RP1P2=963;
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
    String clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.toString();
    String clsUTGrafoP4RP0R=null;
      clsUTGrafoP4RP0R=clsUTGrafoP4R.toLowerCase();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[947]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[32, 16, 34, 9, 10, 31, 15]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTGrafoP1P1=947;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    assertEquals(947,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    String clsUTGrafoP3RP0P1=new String("ah1;s3*=e$4uf2t8|n~6y5}?__bx'v0dl`&>q@!^-/k7jmw ");
    int clsUTGrafoP3RP0P2=-854;
    String[] clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.split(clsUTGrafoP3RP0P1,clsUTGrafoP3RP0P2);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[156]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[32, 16, 34, 5, 9, 10, 11, 27, 28, 29, 31, 15]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTGrafoP1P1=156;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=0;
    int clsUTGrafoP2RP0P2=1;
    int clsUTGrafoP2RP0P3=-960;
      clsUTGrafoP2R.insereAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2,clsUTGrafoP2RP0P3);
      clsUTGrafoP2R.imprime();
    assertEquals(156,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[855]
2)----->primeiroListaAdj[650], 
3)----->grafoTransposto[], 
4)----->retiraAresta[174, 627], 
5)----->insereAresta[0, 79, 603], 
6)----->numVertices[], 
7)----->proxAdj[0]
 Covered Branches:[32, 1, 34, 5, 9, 10, 11, 15, 16, 18, 20, 21, 22, 24, 30, 31]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTGrafoP1P1=855;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=650;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.primeiroListaAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    Grafo clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.grafoTransposto();
    assertEquals(855,clsUTGrafoP3R.numVertices());
    int clsUTGrafoP4P1=174;
    int clsUTGrafoP4P2=627;
    Grafo.Aresta clsUTGrafoP4R=null;
//Exception
    try {
      clsUTGrafoP4R=clsUTGrafo.retiraAresta(clsUTGrafoP4P1,clsUTGrafoP4P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP4R);
    int clsUTGrafoP5P1=0;
    int clsUTGrafoP5P2=79;
    int clsUTGrafoP5P3=603;
      clsUTGrafo.insereAresta(clsUTGrafoP5P1,clsUTGrafoP5P2,clsUTGrafoP5P3);
    int clsUTGrafoP6R=0;
      clsUTGrafoP6R=clsUTGrafo.numVertices();
    assertEquals(855,clsUTGrafoP6R);
    int clsUTGrafoP7P1=0;
    Grafo.Aresta clsUTGrafoP7R=null;
      clsUTGrafoP7R=clsUTGrafo.proxAdj(clsUTGrafoP7P1);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[-814, 1, 787]
2)----->v1[], 
3)----->toString[]
 Covered Branches:[1, 3]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTArestaP1P1=-814;
    int clsUTArestaP1P2=1;
    int clsUTArestaP1P3=787;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v1();
    assertEquals(-814,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[557]
2)----->numVertices[], 
3)----->toString[]
 Covered Branches:[9, 10, 30]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTGrafoP1P1=557;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2R=0;
      clsUTGrafoP2R=clsUTGrafo.numVertices();
    assertEquals(557,clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    String clsUTGrafoP3RP0P1P1=new String(":=!}^_|{/;#')?");
    CharSequence clsUTGrafoP3RP0P1=null;
      clsUTGrafoP3RP0P1=new String(clsUTGrafoP3RP0P1P1);
    StringBuffer clsUTGrafoP3RP0P2P1P1=null;
      clsUTGrafoP3RP0P2P1P1=new StringBuffer();
    CharSequence clsUTGrafoP3RP0P2P1=null;
      clsUTGrafoP3RP0P2P1=new String(clsUTGrafoP3RP0P2P1P1);
    CharSequence clsUTGrafoP3RP0P2P2=null;
    int clsUTGrafoP3RP0P2P3P1=-1;
    CharSequence clsUTGrafoP3RP0P2P3=null;
      clsUTGrafoP3RP0P2P3=String.valueOf(clsUTGrafoP3RP0P2P3P1);
    char clsUTGrafoP3RP0P2P4P1='\u0030';
    CharSequence clsUTGrafoP3RP0P2P4=null;
      clsUTGrafoP3RP0P2P4=String.valueOf(clsUTGrafoP3RP0P2P4P1);
    CharSequence[] clsUTGrafoP3RP0P2=new CharSequence[]{clsUTGrafoP3RP0P2P1,clsUTGrafoP3RP0P2P2,clsUTGrafoP3RP0P2P3,clsUTGrafoP3RP0P2P4};
    String clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=String.join(clsUTGrafoP3RP0P1,clsUTGrafoP3RP0P2);
    assertEquals(":=!}^_|{/;#')?",clsUTGrafoP3RP0P1.toString());
    assertEquals(14,clsUTGrafoP3RP0P1.length());
    assertEquals(":=!}^_|{/;#')?null:=!}^_|{/;#')?-1:=!}^_|{/;#')?0",clsUTGrafoP3RP0R);
    int clsUTGrafoP3RP1P1=-1;
    String clsUTGrafoP3RP1R=null;
      clsUTGrafoP3RP1R=String.valueOf(clsUTGrafoP3RP1P1);
    assertEquals("-1",clsUTGrafoP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[854]
2)----->primeiroListaAdj[125], 
3)----->existeAresta[1, 253]
 Covered Branches:[18, 20, 5, 9, 10, 12, 14]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTGrafoP1P1=854;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=125;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.primeiroListaAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    int clsUTGrafoP3P1=1;
    int clsUTGrafoP3P2=253;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.existeAresta(clsUTGrafoP3P1,clsUTGrafoP3P2);
    assertEquals(false,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[942]
2)----->imprime[], 
3)----->grafoTransposto[], 
4)----->insereAresta[133, -103, 1]
 Covered Branches:[32, 34, 5, 9, 10, 11, 15, 16, 21, 23, 27, 28, 31]
 */
  @Test public void TestCase10() throws Throwable {
    int clsUTGrafoP1P1=942;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
      clsUTGrafo.imprime();
    Grafo clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP3RP0P1=1;
    Grafo.Aresta clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.proxAdj(clsUTGrafoP3RP0P1);
    assertNull(clsUTGrafoP3RP0R);
    int clsUTGrafoP4P1=133;
    int clsUTGrafoP4P2=-103;
    int clsUTGrafoP4P3=1;
      clsUTGrafo.insereAresta(clsUTGrafoP4P1,clsUTGrafoP4P2,clsUTGrafoP4P3);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[949]
2)----->grafoTransposto[], 
3)----->insereAresta[1, 41, 937], 
4)----->existeAresta[1, 787]
 Covered Branches:[32, 34, 5, 6, 8, 9, 10, 11, 12, 14, 15, 16, 31]
 */
  @Test public void TestCase11() throws Throwable {
    int clsUTGrafoP1P1=949;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=-313;
    boolean clsUTGrafoP2RP0R=false;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.listaAdjVazia(clsUTGrafoP2RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    int clsUTGrafoP2RP1P1=-529;
    int clsUTGrafoP2RP1P2=626;
    int clsUTGrafoP2RP1P3=234;
//Exception
    try {
      clsUTGrafoP2R.insereAresta(clsUTGrafoP2RP1P1,clsUTGrafoP2RP1P2,clsUTGrafoP2RP1P3);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals(949,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3P1=1;
    int clsUTGrafoP3P2=41;
    int clsUTGrafoP3P3=937;
      clsUTGrafo.insereAresta(clsUTGrafoP3P1,clsUTGrafoP3P2,clsUTGrafoP3P3);
    int clsUTGrafoP4P1=1;
    int clsUTGrafoP4P2=787;
    boolean clsUTGrafoP4R=false;
      clsUTGrafoP4R=clsUTGrafo.existeAresta(clsUTGrafoP4P1,clsUTGrafoP4P2);
    assertEquals(false,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[871]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 33, 1, 34, 2, 35, 3, 4, 5, 9, 10, 11, 15, 16, 17, 18, 19, 21, 23, 30, 31]
 */
  @Test public void TestCase12() throws Throwable {
    int clsUTGrafoP1P1=871;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=0;
    int clsUTGrafoP2RP0P2=172;
    int clsUTGrafoP2RP0P3=-718;
      clsUTGrafoP2R.insereAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2,clsUTGrafoP2RP0P3);
    Grafo clsUTGrafoP2RP1R=null;
      clsUTGrafoP2RP1R=clsUTGrafoP2R.grafoTransposto();
    assertEquals(871,clsUTGrafoP2RP1R.numVertices());
    assertEquals(871,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(871,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[-1, 175, 0]
2)----->v2[], 
3)----->toString[]
 Covered Branches:[1, 4]
 */
  @Test public void TestCase13() throws Throwable {
    int clsUTArestaP1P1=-1;
    int clsUTArestaP1P2=175;
    int clsUTArestaP1P3=0;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v2();
    assertEquals(175,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
  }
}
