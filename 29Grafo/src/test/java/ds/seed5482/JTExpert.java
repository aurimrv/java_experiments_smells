package ds.seed5482;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Grafo;
import java.util.Arrays;
import java.util.Locale;
/** 
 * This class was automatically generated to test the ds.Grafo class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35]
Uncovered branches: [7, 25, 13]
Total number of branches: 35
Total number of covered branches: 32
Coverage : 91,43%
Evaluations : 34896
search time (ms): 42501
total runtime (ms): 44641
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Grafo[218]
2)----->imprime[], 
3)----->toString[], 
4)----->listaAdjVazia[74]
 Covered Branches:[16, 9, 10, 27, 28, 15]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTGrafoP1P1=218;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
      clsUTGrafo.imprime();
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    Locale clsUTGrafoP3RP0P1=null;
      clsUTGrafoP3RP0P1=(Locale)Locale.SIMPLIFIED_CHINESE;
    String clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.toLowerCase(clsUTGrafoP3RP0P1);
    assertEquals("",clsUTGrafoP3RP0P1.getDisplayVariant());
    assertEquals("zh",clsUTGrafoP3RP0P1.getLanguage());
    assertEquals("chinês (China)",clsUTGrafoP3RP0P1.getDisplayName());
    assertEquals(115834631,clsUTGrafoP3RP0P1.hashCode());
    String clsUTGrafoP3RP1R=null;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.trim();
    int clsUTGrafoP4P1=74;
    boolean clsUTGrafoP4R=false;
      clsUTGrafoP4R=clsUTGrafo.listaAdjVazia(clsUTGrafoP4P1);
    assertEquals(true,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[915]
2)----->insereAresta[205, 115, -780], 
3)----->imprime[], 
4)----->grafoTransposto[]
 Covered Branches:[32, 33, 1, 34, 2, 35, 3, 4, 5, 9, 10, 11, 15, 16, 17, 18, 19, 21, 23, 27, 28, 29, 31]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTGrafoP1P1=915;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=205;
    int clsUTGrafoP2P2=115;
    int clsUTGrafoP2P3=-780;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
      clsUTGrafo.imprime();
    Grafo clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.grafoTransposto();
    assertEquals(915,clsUTGrafoP4R.numVertices());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[596]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 16, 34, 21, 5, 24, 9, 10, 30, 31, 15]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTGrafoP1P1=596;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=-1;
    Grafo.Aresta clsUTGrafoP2RP0R=null;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.proxAdj(clsUTGrafoP2RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP0R);
    int clsUTGrafoP2RP1P1=708;
    int clsUTGrafoP2RP1P2=-937;
    Grafo.Aresta clsUTGrafoP2RP1R=null;
//Exception
    try {
      clsUTGrafoP2RP1R=clsUTGrafoP2R.retiraAresta(clsUTGrafoP2RP1P1,clsUTGrafoP2RP1P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP1R);
    assertEquals(596,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(596,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[521]
2)----->primeiroListaAdj[1], 
3)----->toString[], 
4)----->listaAdjVazia[170]
 Covered Branches:[16, 18, 20, 9, 10, 15]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTGrafoP1P1=521;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=1;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.primeiroListaAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    int clsUTGrafoP3RP0P1=344;
    int clsUTGrafoP3RP0P2=-1;
    String clsUTGrafoP3RP0R=null;
//Exception
    try {
      clsUTGrafoP3RP0R=clsUTGrafoP3R.substring(clsUTGrafoP3RP0P1,clsUTGrafoP3RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP3RP0R);
    int clsUTGrafoP3RP1P1=421;
    int clsUTGrafoP3RP1R=0;
//Exception
    try {
      clsUTGrafoP3RP1R=clsUTGrafoP3R.codePointBefore(clsUTGrafoP3RP1P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    int clsUTGrafoP4P1=170;
    boolean clsUTGrafoP4R=false;
      clsUTGrafoP4R=clsUTGrafo.listaAdjVazia(clsUTGrafoP4P1);
    assertEquals(true,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[742]
2)----->insereAresta[719, 1, 607], 
3)----->toString[], 
4)----->listaAdjVazia[481]
 Covered Branches:[16, 5, 9, 10, 11, 15]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTGrafoP1P1=742;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=719;
    int clsUTGrafoP2P2=1;
    int clsUTGrafoP2P3=607;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    byte[] clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.getBytes();
    String clsUTGrafoP3RP1P1=new String("A5Npu(jlg");
    boolean clsUTGrafoP3RP1R=false;
//Exception
    try {
      clsUTGrafoP3RP1R=clsUTGrafoP3R.matches(clsUTGrafoP3RP1P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("A5Npu(jlg",clsUTGrafoP3RP1P1.toString());
    int clsUTGrafoP4P1=481;
    boolean clsUTGrafoP4R=false;
      clsUTGrafoP4R=clsUTGrafo.listaAdjVazia(clsUTGrafoP4P1);
    assertEquals(true,clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[788]
2)----->insereAresta[0, -1, 716], 
3)----->proxAdj[-864], 
4)----->proxAdj[0], 
5)----->grafoTransposto[], 
6)----->listaAdjVazia[-749], 
7)----->primeiroListaAdj[-508]
 Covered Branches:[32, 1, 33, 2, 3, 35, 4, 5, 9, 10, 11, 15, 17, 18, 19, 21, 22, 31]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTGrafoP1P1=788;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=0;
    int clsUTGrafoP2P2=-1;
    int clsUTGrafoP2P3=716;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3P1=-864;
    Grafo.Aresta clsUTGrafoP3R=null;
//Exception
    try {
      clsUTGrafoP3R=clsUTGrafo.proxAdj(clsUTGrafoP3P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP3R);
    int clsUTGrafoP4P1=0;
    Grafo.Aresta clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.proxAdj(clsUTGrafoP4P1);
    int clsUTGrafoP4RP0R=0;
      clsUTGrafoP4RP0R=clsUTGrafoP4R.v1();
    assertEquals(0,clsUTGrafoP4RP0R);
    Grafo clsUTGrafoP5R=null;
//Exception
    try {
      clsUTGrafoP5R=clsUTGrafo.grafoTransposto();
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP5R);
    int clsUTGrafoP6P1=-749;
    boolean clsUTGrafoP6R=false;
//Exception
    try {
      clsUTGrafoP6R=clsUTGrafo.listaAdjVazia(clsUTGrafoP6P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    int clsUTGrafoP7P1=-508;
    Grafo.Aresta clsUTGrafoP7R=null;
//Exception
    try {
      clsUTGrafoP7R=clsUTGrafo.primeiroListaAdj(clsUTGrafoP7P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP7R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[251]
2)----->existeAresta[226, 62], 
3)----->listaAdjVazia[1]
 Covered Branches:[16, 5, 9, 10, 12, 14, 15]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTGrafoP1P1=251;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=226;
    int clsUTGrafoP2P2=62;
    boolean clsUTGrafoP2R=false;
      clsUTGrafoP2R=clsUTGrafo.existeAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    assertEquals(false,clsUTGrafoP2R);
    int clsUTGrafoP3P1=1;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.listaAdjVazia(clsUTGrafoP3P1);
    assertEquals(true,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[-437, 722, -445]
2)----->peso[], 
3)----->toString[]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTArestaP1P1=-437;
    int clsUTArestaP1P2=722;
    int clsUTArestaP1P3=-445;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.peso();
    assertEquals(-445,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    String clsUTArestaP3RP0R=null;
      clsUTArestaP3RP0R=clsUTArestaP3R.toLowerCase();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[716, -963, -1]
2)----->v1[], 
3)----->toString[]
 Covered Branches:[1, 3]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTArestaP1P1=716;
    int clsUTArestaP1P2=-963;
    int clsUTArestaP1P3=-1;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v1();
    assertEquals(716,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    String clsUTArestaP3RP0P1=new String("L_.N]PFsUN=]*}l5niq0ek_Fs_;DZ]]K#dSiIt>Em/CG)");
    boolean clsUTArestaP3RP0R=false;
//Exception
    try {
      clsUTArestaP3RP0R=clsUTArestaP3R.matches(clsUTArestaP3RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("L_.N]PFsUN=]*}l5niq0ek_Fs_;DZ]]K#dSiIt>Em/CG)",clsUTArestaP3RP0P1.toString());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[70, -135, -794]
2)----->v2[], 
3)----->toString[]
 Covered Branches:[1, 4]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTArestaP1P1=70;
    int clsUTArestaP1P2=-135;
    int clsUTArestaP1P3=-794;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v2();
    assertEquals(-135,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[618]
2)----->insereAresta[0, 839, -814], 
3)----->retiraAresta[0, 217]
 Covered Branches:[5, 6, 24, 8, 9, 10, 26, 11]
 */
  @Test public void TestCase10() throws Throwable {
    int clsUTGrafoP1P1=618;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=0;
    int clsUTGrafoP2P2=839;
    int clsUTGrafoP2P3=-814;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    int clsUTGrafoP3P1=0;
    int clsUTGrafoP3P2=217;
    Grafo.Aresta clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.retiraAresta(clsUTGrafoP3P1,clsUTGrafoP3P2);
    assertNull(clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[831]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 16, 34, 18, 21, 23, 9, 10, 30, 31, 15]
 */
  @Test public void TestCase11() throws Throwable {
    int clsUTGrafoP1P1=831;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=-1;
    Grafo.Aresta clsUTGrafoP2RP0R=null;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.primeiroListaAdj(clsUTGrafoP2RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP0R);
    int clsUTGrafoP2RP1P1=322;
    Grafo.Aresta clsUTGrafoP2RP1R=null;
      clsUTGrafoP2RP1R=clsUTGrafoP2R.proxAdj(clsUTGrafoP2RP1P1);
    assertNull(clsUTGrafoP2RP1R);
    assertEquals(831,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(831,clsUTGrafoP3R);
  }
}
