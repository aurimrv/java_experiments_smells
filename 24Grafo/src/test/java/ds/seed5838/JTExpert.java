package ds.seed5838;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import java.util.Locale;
import ds.Grafo;
import java.util.Arrays;
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
Evaluations : 9799
search time (ms): 42507
total runtime (ms): 44247
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[1, 2, 3, 8, 9, 11, 12, 13, 14, 15, 24, 25, 27]
 */
  @Test public void TestCase0() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=1;
    Aresta clsUTGrafoP2RP0R=null;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.primeiroListaAdj(clsUTGrafoP2RP0P1);
    assertNull(clsUTGrafoP2RP0R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->imprime[], 
3)----->proxAdj[99]
 Covered Branches:[1, 2, 3, 20, 21, 22, 23, 13, 14, 15]
 */
  @Test public void TestCase1() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
      clsUTGrafo.imprime();
    int clsUTGrafoP3P1=99;
    Aresta clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.proxAdj(clsUTGrafoP3P1);
    assertNull(clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[1, 2, 3, 5, 24, 8, 25, 9, 11, 27]
 */
  @Test public void TestCase2() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=173;
    int clsUTGrafoP2RP0P2=678;
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
    String clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.toLowerCase();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[1, 2, 3, 4, 5, 24, 8, 25, 9, 11, 27]
 */
  @Test public void TestCase3() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=-442;
    int clsUTGrafoP2RP0P2=101;
    int clsUTGrafoP2RP0P3=99;
//Exception
    try {
      clsUTGrafoP2R.insereAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2,clsUTGrafoP2RP0P3);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    int clsUTGrafoP2RP1P1=794;
    int clsUTGrafoP2RP1P2=0;
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
    String clsUTGrafoP3RP0P1=new String("41{5:~8;!':5<<(>9^1^~-2 ~{$~_ ? 252568( *$<)4+;3{#]^({&&`45#=.9`_/6 ?49|*?'~;/]_{^'&}%;364$-99|`~/^6_;&~.132;.3^___%*3[$8>.+(*{?@}{8#^.:})-=1+@-");
    int clsUTGrafoP3RP0R=0;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.indexOf(clsUTGrafoP3RP0P1);
    assertEquals(-1,clsUTGrafoP3RP0R);
    String clsUTGrafoP3RP1P1=new String("9bg 1.i`+;p$(s>n?[hc{mlo&e@<t'*8r2~xjkv=63|_%7:q!0a5z]#}u-f/wy)_^d4\\\\\\\\\\\\\"");
    Object[] clsUTGrafoP3RP1P2=new Object[]{};
    String clsUTGrafoP3RP1R=null;
//Exception
    try {
      clsUTGrafoP3RP1R=String.format(clsUTGrafoP3RP1P1,(Object[])clsUTGrafoP3RP1P2);
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
 Covered Branches:[1, 17, 2, 3, 24, 8, 25, 9, 11, 27, 12]
 */
  @Test public void TestCase4() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=284;
    Aresta clsUTGrafoP2RP0R=null;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.primeiroListaAdj(clsUTGrafoP2RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP0R);
    int clsUTGrafoP2RP1P1=0;
    int clsUTGrafoP2RP1P2=806;
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
    char[] clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.toCharArray();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->retiraAresta[1, 15], 
3)----->toString[]
 Covered Branches:[1, 17, 2, 18, 3]
 */
  @Test public void TestCase5() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2P1=1;
    int clsUTGrafoP2P2=15;
    Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.retiraAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    assertNull(clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
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
2)----->existeAresta[96, 10], 
3)----->toString[]
 Covered Branches:[1, 2, 3, 5, 7]
 */
  @Test public void TestCase7() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2P1=96;
    int clsUTGrafoP2P2=10;
    boolean clsUTGrafoP2R=false;
      clsUTGrafoP2R=clsUTGrafo.existeAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    assertEquals(false,clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    boolean clsUTGrafoP3RP0P1P1=false;
    CharSequence clsUTGrafoP3RP0P1=null;
      clsUTGrafoP3RP0P1=String.valueOf(clsUTGrafoP3RP0P1P1);
    String clsUTGrafoP3RP0P2P2=new String("  ");
    double clsUTGrafoP3RP0P2P3P1O0=75.81157003133049D;
    Object clsUTGrafoP3RP0P2P3P1=clsUTGrafoP3RP0P2P3P1O0;
    Integer clsUTGrafoP3RP0P2P3P2O0=null;
    Object clsUTGrafoP3RP0P2P3P2=clsUTGrafoP3RP0P2P3P2O0;
    Integer clsUTGrafoP3RP0P2P3P3O0=-104;
    Object clsUTGrafoP3RP0P2P3P3=clsUTGrafoP3RP0P2P3P3O0;
    Object[] clsUTGrafoP3RP0P2P3=new Object[]{clsUTGrafoP3RP0P2P3P1,clsUTGrafoP3RP0P2P3P2,clsUTGrafoP3RP0P2P3P3};
    CharSequence clsUTGrafoP3RP0P2=null;
      clsUTGrafoP3RP0P2=String.format((Locale)null,clsUTGrafoP3RP0P2P2,clsUTGrafoP3RP0P2P3);
    String clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.replace(clsUTGrafoP3RP0P1,clsUTGrafoP3RP0P2);
    assertEquals("false",clsUTGrafoP3RP0P1.toString());
    assertEquals(5,clsUTGrafoP3RP0P1.length());
    assertEquals("  ",clsUTGrafoP3RP0P2.toString());
    assertEquals(2,clsUTGrafoP3RP0P2.length());
  }
}
