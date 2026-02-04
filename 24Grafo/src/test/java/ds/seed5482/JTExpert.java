package ds.seed5482;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Grafo;
import ds.Aresta;
/** 
 * This class was automatically generated to test the ds.Grafo class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 20, 21, 22, 23, 24, 25, 27]
Uncovered branches: [19, 6, 10, 26]
Total number of branches: 28
Total number of covered branches: 23
Coverage : 82,14%
Evaluations : 9897
search time (ms): 42542
total runtime (ms): 44213
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[1, 2, 3, 24, 8, 25, 9, 11, 27]
 */
  @Test public void TestCase0() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
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
 Covered Branches:[1, 2, 3, 8, 9, 11, 20, 21, 22, 23, 24, 25, 27]
 */
  @Test public void TestCase1() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
      clsUTGrafoP2R.imprime();
    int clsUTGrafoP2RP1P1=240;
    boolean clsUTGrafoP2RP1R=false;
//Exception
    try {
      clsUTGrafoP2RP1R=clsUTGrafoP2R.listaAdjVazia(clsUTGrafoP2RP1P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->primeiroListaAdj[66], 
3)----->toString[]
 Covered Branches:[1, 2, 3, 12, 13, 14, 15]
 */
  @Test public void TestCase2() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2P1=66;
    Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.primeiroListaAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    int clsUTGrafoP3RP0R=0;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.hashCode();
    int clsUTGrafoP3RP1P1=-776;
    String clsUTGrafoP3RP1R=null;
//Exception
    try {
      clsUTGrafoP3RP1R=clsUTGrafoP3R.substring(clsUTGrafoP3RP1P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[1, 2, 3, 4, 24, 8, 25, 9, 11, 27, 13]
 */
  @Test public void TestCase3() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=474;
    Aresta clsUTGrafoP2RP0R=null;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.proxAdj(clsUTGrafoP2RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP0R);
    int clsUTGrafoP2RP1P1=-868;
    int clsUTGrafoP2RP1P2=630;
    int clsUTGrafoP2RP1P3=-297;
//Exception
    try {
      clsUTGrafoP2R.insereAresta(clsUTGrafoP2RP1P1,clsUTGrafoP2RP1P2,clsUTGrafoP2RP1P3);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    boolean clsUTGrafoP3RP0R=false;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.isEmpty();
    assertEquals(false,clsUTGrafoP3RP0R);
    String clsUTGrafoP3RP1R=null;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[1, 2, 3, 8, 9, 11, 17, 20, 21, 22, 23, 24, 25, 27]
 */
  @Test public void TestCase4() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=100;
    int clsUTGrafoP2RP0P2=101;
    Aresta clsUTGrafoP2RP0R=null;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.retiraAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP0R);
      clsUTGrafoP2R.imprime();
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[1, 17, 2, 18, 3, 24, 8, 25, 9, 11, 27, 13]
 */
  @Test public void TestCase5() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=62;
    int clsUTGrafoP2RP0P2=0;
    Aresta clsUTGrafoP2RP0R=null;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.retiraAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2);
    assertNull(clsUTGrafoP2RP0R);
    int clsUTGrafoP2RP1P1=594;
    Aresta clsUTGrafoP2RP1R=null;
//Exception
    try {
      clsUTGrafoP2RP1R=clsUTGrafoP2R.proxAdj(clsUTGrafoP2RP1P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP1R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    char clsUTGrafoP3RP0P1='\u0073';
    String clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=String.valueOf(clsUTGrafoP3RP0P1);
    assertEquals("s",clsUTGrafoP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->proxAdj[0], 
3)----->proxAdj[0]
 Covered Branches:[16, 1, 2, 3, 13, 14, 15]
 */
  @Test public void TestCase6() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2P1=0;
    Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.proxAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    int clsUTGrafoP3P1=0;
    Aresta clsUTGrafoP3R=null;
//Exception
    try {
      clsUTGrafoP3R=clsUTGrafo.proxAdj(clsUTGrafoP3P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->existeAresta[0, 2], 
3)----->proxAdj[1]
 Covered Branches:[1, 2, 3, 5, 7, 13, 14, 15]
 */
  @Test public void TestCase7() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2P1=0;
    int clsUTGrafoP2P2=2;
    boolean clsUTGrafoP2R=false;
      clsUTGrafoP2R=clsUTGrafo.existeAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    assertEquals(false,clsUTGrafoP2R);
    int clsUTGrafoP3P1=1;
    Aresta clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.proxAdj(clsUTGrafoP3P1);
    assertNull(clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->proxAdj[59], 
3)----->toString[], 
4)----->proxAdj[1]
 Covered Branches:[1, 2, 3, 13, 14, 15]
 */
  @Test public void TestCase8() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2P1=59;
    Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.proxAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    long clsUTGrafoP3RP0P1=23L;
    String clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=String.valueOf(clsUTGrafoP3RP0P1);
    assertEquals("23",clsUTGrafoP3RP0R);
    int clsUTGrafoP4P1=1;
    Aresta clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.proxAdj(clsUTGrafoP4P1);
    assertNull(clsUTGrafoP4R);
  }
}
