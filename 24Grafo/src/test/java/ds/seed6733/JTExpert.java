package ds.seed6733;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Grafo;
import ds.Aresta;
/** 
 * This class was automatically generated to test the ds.Grafo class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 20, 21, 22, 23, 24, 25, 26, 27, 28]
Uncovered branches: [19, 6]
Total number of branches: 28
Total number of covered branches: 26
Coverage : 92,86%
Evaluations : 30184
search time (ms): 42501
total runtime (ms): 44224
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->proxAdj[1], 
3)----->proxAdj[57], 
4)----->toString[]
 Covered Branches:[1, 2, 3, 13, 14, 15]
 */
  @Test public void TestCase0() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2P1=1;
    Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.proxAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    int clsUTGrafoP3P1=57;
    Aresta clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.proxAdj(clsUTGrafoP3P1);
    assertNull(clsUTGrafoP3R);
    String clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.toString();
    int clsUTGrafoP4RP0P1=-1;
    int clsUTGrafoP4RP0P2=465;
    int clsUTGrafoP4RP0R=0;
//Exception
    try {
      clsUTGrafoP4RP0R=clsUTGrafoP4R.codePointCount(clsUTGrafoP4RP0P1,clsUTGrafoP4RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    int clsUTGrafoP4RP1P1=51;
    int clsUTGrafoP4RP1R=0;
      clsUTGrafoP4RP1R=clsUTGrafoP4R.lastIndexOf(clsUTGrafoP4RP1P1);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->primeiroListaAdj[99], 
3)----->toString[]
 Covered Branches:[1, 2, 3, 12, 13, 14, 15]
 */
  @Test public void TestCase1() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2P1=99;
    Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.primeiroListaAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    String clsUTGrafoP3RP0P1=new String("0`(O*o]/<G`3@WW+[nXqY'C;aoxBUq@~9#Ta4w+d1_");
    int clsUTGrafoP3RP0R=0;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.lastIndexOf(clsUTGrafoP3RP0P1);
    assertEquals(-1,clsUTGrafoP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->imprime[], 
3)----->toString[]
 Covered Branches:[1, 2, 3, 20, 21, 22, 23]
 */
  @Test public void TestCase2() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
      clsUTGrafo.imprime();
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    boolean clsUTGrafoP3RP0R=false;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.isEmpty();
    assertEquals(false,clsUTGrafoP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[1, 2, 3, 4, 24, 8, 25, 9, 11, 27]
 */
  @Test public void TestCase3() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=-770;
    int clsUTGrafoP2RP0P2=1;
    int clsUTGrafoP2RP0P3=-339;
//Exception
    try {
      clsUTGrafoP2R.insereAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2,clsUTGrafoP2RP0P3);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    boolean clsUTGrafoP3RP0R=false;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.isEmpty();
    assertEquals(false,clsUTGrafoP3RP0R);
    int clsUTGrafoP3RP1P1P1=0;
    CharSequence clsUTGrafoP3RP1P1=null;
      clsUTGrafoP3RP1P1=new StringBuilder(clsUTGrafoP3RP1P1P1);
    CharSequence clsUTGrafoP3RP1P2=null;
      clsUTGrafoP3RP1P2=new StringBuffer();
    String clsUTGrafoP3RP1R=null;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.replace(clsUTGrafoP3RP1P1,clsUTGrafoP3RP1P2);
    assertEquals("",clsUTGrafoP3RP1P1.toString());
    assertEquals(0,clsUTGrafoP3RP1P1.length());
    assertEquals("",clsUTGrafoP3RP1P2.toString());
    assertEquals(0,clsUTGrafoP3RP1P2.length());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[1, 17, 2, 3, 24, 8, 25, 9, 11, 27]
 */
  @Test public void TestCase4() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=567;
    int clsUTGrafoP2RP0P2=-1;
    Aresta clsUTGrafoP2RP0R=null;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.retiraAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP0R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    boolean clsUTGrafoP3RP0P1=true;
    String clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=String.valueOf(clsUTGrafoP3RP0P1);
    assertEquals("true",clsUTGrafoP3RP0R);
    String clsUTGrafoP3RP1R=null;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[1, 17, 2, 18, 3, 24, 8, 25, 9, 11, 27]
 */
  @Test public void TestCase5() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=99;
    int clsUTGrafoP2RP0P2=0;
    Aresta clsUTGrafoP2RP0R=null;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.retiraAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2);
    assertNull(clsUTGrafoP2RP0R);
    int clsUTGrafoP2RP1P1=-1;
    int clsUTGrafoP2RP1P2=565;
    Aresta clsUTGrafoP2RP1R=null;
//Exception
    try {
      clsUTGrafoP2RP1R=clsUTGrafoP2R.retiraAresta(clsUTGrafoP2RP1P1,clsUTGrafoP2RP1P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP1R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[1, 2, 3, 4, 8, 9, 10, 11, 12, 13, 14, 15, 16, 24, 25, 26, 27, 28]
 */
  @Test public void TestCase6() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=1;
    int clsUTGrafoP2RP0P2=48;
    int clsUTGrafoP2RP0P3=100;
      clsUTGrafoP2R.insereAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2,clsUTGrafoP2RP0P3);
    Grafo clsUTGrafoP2RP1R=null;
      clsUTGrafoP2RP1R=clsUTGrafoP2R.grafoTransposto();
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    int clsUTGrafoP3RP0P1=-775;
    String clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=String.valueOf(clsUTGrafoP3RP0P1);
    assertEquals("-775",clsUTGrafoP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->existeAresta[0, 0], 
3)----->proxAdj[0]
 Covered Branches:[1, 2, 3, 5, 7, 13, 14, 15]
 */
  @Test public void TestCase7() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2P1=0;
    int clsUTGrafoP2P2=0;
    boolean clsUTGrafoP2R=false;
      clsUTGrafoP2R=clsUTGrafo.existeAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    assertEquals(false,clsUTGrafoP2R);
    int clsUTGrafoP3P1=0;
    Aresta clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.proxAdj(clsUTGrafoP3P1);
    assertNull(clsUTGrafoP3R);
  }
}
