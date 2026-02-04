package ds.seed5311;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.Rule;
import ds.Grafo;
import java.nio.charset.Charset;
import ds.Aresta;
import java.util.Arrays;
/** 
 * This class was automatically generated to test the ds.Grafo class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 20, 21, 22, 23, 24, 25, 26, 27, 28]
Uncovered branches: [19, 6]
Total number of branches: 28
Total number of covered branches: 26
Coverage : 92,86%
Evaluations : 31206
search time (ms): 42501
total runtime (ms): 43764
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[1, 2, 3, 24, 8, 25, 9, 11, 27]
 */
 @Ignore
  @Test public void TestCase0() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    int clsUTGrafoP3RP0P1=900;
    int clsUTGrafoP3RP0P2=963;
    byte[] clsUTGrafoP3RP0P3=new byte[]{17,109,72,65};
    int clsUTGrafoP3RP0P4=99;
//Exception
    try {
      clsUTGrafoP3R.getBytes(clsUTGrafoP3RP0P1,clsUTGrafoP3RP0P2,clsUTGrafoP3RP0P3,clsUTGrafoP3RP0P4);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertTrue(Arrays.equals(new byte[]{17,109,72,65},clsUTGrafoP3RP0P3));
    int clsUTGrafoP3RP1R=0;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.length();
    assertEquals(17,clsUTGrafoP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->imprime[], 
3)----->toString[]
 Covered Branches:[1, 2, 3, 20, 21, 22, 23]
 */
  @Test public void TestCase1() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
      clsUTGrafo.imprime();
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    Charset clsUTGrafoP3RP0P1=null;
      clsUTGrafoP3RP0P1=Charset.defaultCharset();
    byte[] clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.getBytes(clsUTGrafoP3RP0P1);
    assertEquals("UTF-8",clsUTGrafoP3RP0P1.toString());
    assertEquals("UTF-8",clsUTGrafoP3RP0P1.displayName());
    assertEquals(true,clsUTGrafoP3RP0P1.canEncode());
    String clsUTGrafoP3RP1P1=new String("dGInRtmlOMpCsBHVoNhzUwbqFSiAYxarkvjPyuXfWKL");
    boolean clsUTGrafoP3RP1R=false;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.startsWith(clsUTGrafoP3RP1P1);
    assertEquals("dGInRtmlOMpCsBHVoNhzUwbqFSiAYxarkvjPyuXfWKL",clsUTGrafoP3RP1P1.toString());
    assertEquals(false,clsUTGrafoP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[1, 17, 2, 3, 24, 8, 25, 9, 11, 27]
 */
  @Test public void TestCase2() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=-418;
    int clsUTGrafoP2RP0P2=944;
    Aresta clsUTGrafoP2RP0R=null;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.retiraAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP0R);
    int clsUTGrafoP2RP1P1=-194;
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
    boolean clsUTGrafoP3RP0R=false;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.isEmpty();
    assertEquals(false,clsUTGrafoP3RP0R);
    int clsUTGrafoP3RP1P1=-720;
    int clsUTGrafoP3RP1P2=-700;
    int clsUTGrafoP3RP1R=0;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.indexOf(clsUTGrafoP3RP1P1,clsUTGrafoP3RP1P2);
    assertEquals(-1,clsUTGrafoP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[1, 2, 3, 5, 24, 8, 25, 9, 11, 27]
 */
  @Test public void TestCase3() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=903;
    int clsUTGrafoP2RP0P2=-1;
    boolean clsUTGrafoP2RP0R=false;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.existeAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2);
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
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[1, 2, 3, 4, 24, 8, 25, 9, 11, 27]
 */
  @Test public void TestCase4() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=-186;
    int clsUTGrafoP2RP0P2=325;
    int clsUTGrafoP2RP0P3=781;
//Exception
    try {
      clsUTGrafoP2R.insereAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2,clsUTGrafoP2RP0P3);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    Grafo clsUTGrafoP2RP1R=null;
      clsUTGrafoP2RP1R=clsUTGrafoP2R.grafoTransposto();
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    String clsUTGrafoP3RP0P1=new String(";' |`#`^]!+_![_.-@ [+{/<]|*})$+#/^*>~;[:#`;&=_%$-(%^~~+<^);{]!_&/[_);^-]!/%#{;_%.=}^%(_*[.}$!;?#$^_%+'!!{=_`]?./)|{$};@}{:&$<;]_&?]:._'~!%`|/~:-!)|;'{#}_}{%{&>$.`-|_$)^*'|;_{.%-.''.@ &*/`('?*;(/<-#+!(<$.}_;.^-](){^`:/[=%{*.>{)_]_[ ` ^/_%]/`_>");
    boolean clsUTGrafoP3RP0R=false;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.startsWith(clsUTGrafoP3RP0P1);
    assertEquals(false,clsUTGrafoP3RP0R);
    char[] clsUTGrafoP3RP1R=null;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.toCharArray();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[1, 17, 2, 3, 5, 7, 24, 8, 25, 9, 11, 27]
 */
  @Test public void TestCase5() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=-367;
    int clsUTGrafoP2RP0P2=972;
    Aresta clsUTGrafoP2RP0R=null;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.retiraAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP0R);
    int clsUTGrafoP2RP1P1=96;
    int clsUTGrafoP2RP1P2=0;
    boolean clsUTGrafoP2RP1R=false;
      clsUTGrafoP2RP1R=clsUTGrafoP2R.existeAresta(clsUTGrafoP2RP1P1,clsUTGrafoP2RP1P2);
    assertEquals(false,clsUTGrafoP2RP1R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    String clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.trim();
    int clsUTGrafoP3RP1P1=-29;
    int clsUTGrafoP3RP1R=0;
//Exception
    try {
      clsUTGrafoP3RP1R=clsUTGrafoP3R.codePointAt(clsUTGrafoP3RP1P1);
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
 Covered Branches:[1, 2, 3, 4, 8, 9, 10, 11, 12, 13, 14, 15, 16, 24, 25, 26, 27, 28]
 */
  @Test public void TestCase6() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=0;
    int clsUTGrafoP2RP0P2=0;
    int clsUTGrafoP2RP0P3=931;
      clsUTGrafoP2R.insereAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2,clsUTGrafoP2RP0P3);
    Grafo clsUTGrafoP2RP1R=null;
      clsUTGrafoP2RP1R=clsUTGrafoP2R.grafoTransposto();
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->retiraAresta[0, 63], 
3)----->toString[]
 Covered Branches:[1, 17, 2, 18, 3]
 */
  @Test public void TestCase7() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2P1=0;
    int clsUTGrafoP2P2=63;
    Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.retiraAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    assertNull(clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    int clsUTGrafoP3RP0P1=477;
    int clsUTGrafoP3RP0P2=-429;
    char[] clsUTGrafoP3RP0P3=new char[]{'\u005b','\u747f','\u0025','\u0076'};
    int clsUTGrafoP3RP0P4=0;
//Exception
    try {
      clsUTGrafoP3R.getChars(clsUTGrafoP3RP0P1,clsUTGrafoP3RP0P2,clsUTGrafoP3RP0P3,clsUTGrafoP3RP0P4);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertTrue(Arrays.equals(new char[]{'\u005b','\u747f','\u0025','\u0076'},clsUTGrafoP3RP0P3));
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->primeiroListaAdj[0], 
3)----->toString[]
 Covered Branches:[1, 2, 3, 12, 13, 14, 15]
 */
  @Test public void TestCase8() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2P1=0;
    Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.primeiroListaAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    double clsUTGrafoP3RP0P1P1=-61.07760589861608D;
    CharSequence clsUTGrafoP3RP0P1=null;
      clsUTGrafoP3RP0P1=String.valueOf(clsUTGrafoP3RP0P1P1);
    boolean clsUTGrafoP3RP0R=false;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.contains(clsUTGrafoP3RP0P1);
    assertEquals("-61.07760589861608",clsUTGrafoP3RP0P1.toString());
    assertEquals(18,clsUTGrafoP3RP0P1.length());
    assertEquals(false,clsUTGrafoP3RP0R);
    String clsUTGrafoP3RP1P1=new String("o9CkO^xZg4nbK_LJ]_H!ym/+25& 8{t7qiSl?vR#uW13fUTFQzEV:Y[D-Ah}GX)c*@I`=M$P0e'BpdNws;|6a(%rj~.<>\\\\\\\\\\\\\"");
    boolean clsUTGrafoP3RP1R=false;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.equalsIgnoreCase(clsUTGrafoP3RP1P1);
    assertEquals(false,clsUTGrafoP3RP1R);
  }
}
