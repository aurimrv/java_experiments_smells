package ds.seed7992;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import java.util.Locale;
import java.util.Arrays;
import java.nio.charset.Charset;
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
Evaluations : 42543
search time (ms): 42501
total runtime (ms): 44190
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
    Grafo clsUTGrafoP2RP0R=null;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.grafoTransposto();
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    int clsUTGrafoP3RP0R=0;
//Exception
    try {
      clsUTGrafoP3RP0R=clsUTGrafoP3R.compareToIgnoreCase((String)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[1, 2, 3, 4, 24, 8, 25, 9, 11, 27]
 */
  @Test public void TestCase1() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=879;
    int clsUTGrafoP2RP0P2=420;
    int clsUTGrafoP2RP0P3=880;
//Exception
    try {
      clsUTGrafoP2R.insereAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2,clsUTGrafoP2RP0P3);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    String clsUTGrafoP3RP0P1=new String("xtt6mj34s2bw3d3rlav7u6tuwe7hcyb23");
    int clsUTGrafoP3RP0P2=-32;
    int clsUTGrafoP3RP0R=0;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.indexOf(clsUTGrafoP3RP0P1,clsUTGrafoP3RP0P2);
    assertEquals("xtt6mj34s2bw3d3rlav7u6tuwe7hcyb23",clsUTGrafoP3RP0P1.toString());
    assertEquals(-1,clsUTGrafoP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[1, 2, 3, 8, 9, 11, 20, 21, 22, 23, 24, 25, 27]
 */
  @Test public void TestCase2() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    Grafo clsUTGrafoP2RP0R=null;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.grafoTransposto();
      clsUTGrafoP2R.imprime();
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[1, 17, 2, 3, 24, 8, 25, 9, 11, 27]
 */
  @Test public void TestCase3() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=1;
    boolean clsUTGrafoP2RP0R=false;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.listaAdjVazia(clsUTGrafoP2RP0P1);
    assertEquals(true,clsUTGrafoP2RP0R);
    int clsUTGrafoP2RP1P1=-81;
    int clsUTGrafoP2RP1P2=-769;
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
    String clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.intern();
    char[] clsUTGrafoP3RP1R=null;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.toCharArray();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[1, 17, 2, 3, 5, 24, 8, 25, 9, 11, 27]
 */
  @Test public void TestCase4() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=-630;
    int clsUTGrafoP2RP0P2=408;
    Aresta clsUTGrafoP2RP0R=null;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.retiraAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP0R);
    int clsUTGrafoP2RP1P1=751;
    int clsUTGrafoP2RP1P2=-1;
    boolean clsUTGrafoP2RP1R=false;
//Exception
    try {
      clsUTGrafoP2RP1R=clsUTGrafoP2R.existeAresta(clsUTGrafoP2RP1P1,clsUTGrafoP2RP1P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    String clsUTGrafoP3RP0P1=new String("tPsGVo8vu");
    int clsUTGrafoP3RP0R=0;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.compareTo(clsUTGrafoP3RP0P1);
    assertEquals("tPsGVo8vu",clsUTGrafoP3RP0P1.toString());
    assertEquals(-16,clsUTGrafoP3RP0R);
    Charset clsUTGrafoP3RP1P1=null;
      clsUTGrafoP3RP1P1=Charset.defaultCharset();
    byte[] clsUTGrafoP3RP1R=null;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.getBytes(clsUTGrafoP3RP1P1);
    assertEquals("UTF-8",clsUTGrafoP3RP1P1.toString());
    assertEquals(81070450,clsUTGrafoP3RP1P1.hashCode());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[1, 2, 3, 24, 8, 25, 9, 11, 27, 13, 14, 15]
 */
  @Test public void TestCase5() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=-984;
    boolean clsUTGrafoP2RP0R=false;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.listaAdjVazia(clsUTGrafoP2RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    int clsUTGrafoP2RP1P1=1;
    Aresta clsUTGrafoP2RP1R=null;
      clsUTGrafoP2RP1R=clsUTGrafoP2R.proxAdj(clsUTGrafoP2RP1P1);
    assertNull(clsUTGrafoP2RP1R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    int clsUTGrafoP3RP0P1=0;
    int clsUTGrafoP3RP0R=0;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.lastIndexOf(clsUTGrafoP3RP0P1);
    assertEquals(-1,clsUTGrafoP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[1, 2, 3, 24, 8, 25, 9, 11, 27, 12]
 */
  @Test public void TestCase6() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    Grafo clsUTGrafoP2RP0R=null;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.grafoTransposto();
    int clsUTGrafoP2RP1P1=-538;
    Aresta clsUTGrafoP2RP1R=null;
//Exception
    try {
      clsUTGrafoP2RP1R=clsUTGrafoP2R.primeiroListaAdj(clsUTGrafoP2RP1P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP1R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    Locale clsUTGrafoP3RP0P1=null;
      clsUTGrafoP3RP0P1=(Locale)Locale.JAPANESE;
    String clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.toLowerCase(clsUTGrafoP3RP0P1);
    assertEquals("",clsUTGrafoP3RP0P1.getDisplayCountry());
    assertEquals("Japanese",clsUTGrafoP3RP0P1.getDisplayLanguage());
    assertEquals("Japanese",clsUTGrafoP3RP0P1.getDisplayName());
    assertEquals(false,clsUTGrafoP3RP0P1.hasExtensions());
    StringBuffer clsUTGrafoP3RP1P1=null;
      clsUTGrafoP3RP1P1=new StringBuffer();
    boolean clsUTGrafoP3RP1R=false;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.contentEquals(clsUTGrafoP3RP1P1);
    assertEquals("",clsUTGrafoP3RP1P1.toString());
    assertEquals(0,clsUTGrafoP3RP1P1.length());
    assertEquals(false,clsUTGrafoP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[1, 17, 2, 18, 3, 24, 8, 25, 9, 11, 27]
 */
  @Test public void TestCase7() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=1;
    int clsUTGrafoP2RP0P2=0;
    Aresta clsUTGrafoP2RP0R=null;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.retiraAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2);
    assertNull(clsUTGrafoP2RP0R);
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
  @Test public void TestCase8() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=0;
    int clsUTGrafoP2RP0P2=1;
    int clsUTGrafoP2RP0P3=772;
      clsUTGrafoP2R.insereAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2,clsUTGrafoP2RP0P3);
    Grafo clsUTGrafoP2RP1R=null;
      clsUTGrafoP2RP1R=clsUTGrafoP2R.grafoTransposto();
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->existeAresta[79, 99], 
3)----->proxAdj[1], 
4)----->toString[]
 Covered Branches:[1, 2, 3, 5, 7, 13, 14, 15]
 */
  @Test public void TestCase9() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2P1=79;
    int clsUTGrafoP2P2=99;
    boolean clsUTGrafoP2R=false;
      clsUTGrafoP2R=clsUTGrafo.existeAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    assertEquals(false,clsUTGrafoP2R);
    int clsUTGrafoP3P1=1;
    Aresta clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.proxAdj(clsUTGrafoP3P1);
    assertNull(clsUTGrafoP3R);
    String clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.toString();
    String clsUTGrafoP4RP0P1=new String("U6lJX1H8SDbVaL3w4I");
    byte[] clsUTGrafoP4RP0R=null;
//Exception
    try {
      clsUTGrafoP4RP0R=clsUTGrafoP4R.getBytes(clsUTGrafoP4RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("U6lJX1H8SDbVaL3w4I",clsUTGrafoP4RP0P1.toString());
    assertNull(clsUTGrafoP4RP0R);
  }
}
