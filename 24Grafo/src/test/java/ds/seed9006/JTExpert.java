package ds.seed9006;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Aresta;
import java.util.Locale;
import ds.Grafo;
import java.util.Arrays;
/** 
 * This class was automatically generated to test the ds.Grafo class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 20, 21, 22, 23, 24, 25, 27]
Uncovered branches: [19, 6, 10, 26]
Total number of branches: 28
Total number of covered branches: 23
Coverage : 82,14%
Evaluations : 10155
search time (ms): 42521
total runtime (ms): 44206
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->retiraAresta[1, 28], 
3)----->toString[]
 Covered Branches:[1, 17, 2, 18, 3]
 */
  @Test public void TestCase0() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2P1=1;
    int clsUTGrafoP2P2=28;
    Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.retiraAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    assertNull(clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    byte[] clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.getBytes();
    String clsUTGrafoP3RP1R=null;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.toUpperCase();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->primeiroListaAdj[20], 
3)----->toString[]
 Covered Branches:[1, 2, 3, 12, 13, 14, 15]
 */
  @Test public void TestCase1() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2P1=20;
    Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.primeiroListaAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    long clsUTGrafoP3RP0P1P1=41L;
    CharSequence clsUTGrafoP3RP0P1=null;
      clsUTGrafoP3RP0P1=String.valueOf(clsUTGrafoP3RP0P1P1);
    long clsUTGrafoP3RP0P2P1P1=47L;
    CharSequence clsUTGrafoP3RP0P2P1=null;
      clsUTGrafoP3RP0P2P1=String.valueOf(clsUTGrafoP3RP0P2P1P1);
    byte[] clsUTGrafoP3RP0P2P2P1=new byte[]{};
    CharSequence clsUTGrafoP3RP0P2P2=null;
      clsUTGrafoP3RP0P2P2=new String(clsUTGrafoP3RP0P2P2P1);
    char[] clsUTGrafoP3RP0P2P3P1=new char[]{'\u0023'};
    CharSequence clsUTGrafoP3RP0P2P3=null;
      clsUTGrafoP3RP0P2P3=String.valueOf(clsUTGrafoP3RP0P2P3P1);
    String clsUTGrafoP3RP0P2P4P1=new String("yn_E}/VxPwh]?fM+!:Nb-)v'<A*g");
    CharSequence clsUTGrafoP3RP0P2P4=null;
      clsUTGrafoP3RP0P2P4=new StringBuilder(clsUTGrafoP3RP0P2P4P1);
    CharSequence[] clsUTGrafoP3RP0P2=new CharSequence[]{clsUTGrafoP3RP0P2P1,clsUTGrafoP3RP0P2P2,clsUTGrafoP3RP0P2P3,clsUTGrafoP3RP0P2P4};
    String clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=String.join(clsUTGrafoP3RP0P1,clsUTGrafoP3RP0P2);
    assertEquals("41",clsUTGrafoP3RP0P1.toString());
    assertEquals(2,clsUTGrafoP3RP0P1.length());
    assertEquals("474141#41yn_E}/VxPwh]?fM+!:Nb-)v'<A*g",clsUTGrafoP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->proxAdj[1], 
3)----->toString[], 
4)----->proxAdj[1]
 Covered Branches:[16, 1, 2, 3, 13, 14, 15]
 */
  @Test public void TestCase2() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2P1=1;
    Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.proxAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    int clsUTGrafoP3RP0P1=99;
    int clsUTGrafoP3RP0P2=1;
    int clsUTGrafoP3RP0R=0;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.indexOf(clsUTGrafoP3RP0P1,clsUTGrafoP3RP0P2);
    String clsUTGrafoP3RP1P1=new String("4_[z;t8c");
    int clsUTGrafoP3RP1R=0;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.compareTo(clsUTGrafoP3RP1P1);
    assertEquals("4_[z;t8c",clsUTGrafoP3RP1P1.toString());
    assertEquals(48,clsUTGrafoP3RP1R);
    int clsUTGrafoP4P1=1;
    Aresta clsUTGrafoP4R=null;
//Exception
    try {
      clsUTGrafoP4R=clsUTGrafo.proxAdj(clsUTGrafoP4P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->existeAresta[11, 99], 
3)----->toString[], 
4)----->proxAdj[0]
 Covered Branches:[1, 2, 3, 5, 7, 13, 14, 15]
 */
  @Test public void TestCase3() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2P1=11;
    int clsUTGrafoP2P2=99;
    boolean clsUTGrafoP2R=false;
      clsUTGrafoP2R=clsUTGrafo.existeAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    assertEquals(false,clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    Locale clsUTGrafoP3RP0P1=null;
      clsUTGrafoP3RP0P1=(Locale)Locale.CHINA;
    String clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.toUpperCase(clsUTGrafoP3RP0P1);
    assertEquals("CHN",clsUTGrafoP3RP0P1.getISO3Country());
    assertEquals("zho",clsUTGrafoP3RP0P1.getISO3Language());
    assertEquals("",clsUTGrafoP3RP0P1.getVariant());
    assertEquals(115834631,clsUTGrafoP3RP0P1.hashCode());
    int clsUTGrafoP3RP1P1P1P1=372;
    CharSequence clsUTGrafoP3RP1P1P1=null;
      clsUTGrafoP3RP1P1P1=new StringBuilder(clsUTGrafoP3RP1P1P1P1);
    StringBuffer clsUTGrafoP3RP1P1=null;
      clsUTGrafoP3RP1P1=new StringBuffer(clsUTGrafoP3RP1P1P1);
    boolean clsUTGrafoP3RP1R=false;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.contentEquals(clsUTGrafoP3RP1P1);
    assertEquals("",clsUTGrafoP3RP1P1.toString());
    assertEquals(16,clsUTGrafoP3RP1P1.capacity());
    assertEquals(false,clsUTGrafoP3RP1R);
    int clsUTGrafoP4P1=0;
    Aresta clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.proxAdj(clsUTGrafoP4P1);
    assertNull(clsUTGrafoP4R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[1, 2, 3, 24, 8, 25, 9, 11, 27]
 */
  @Test public void TestCase4() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[1, 2, 3, 5, 8, 9, 11, 20, 21, 22, 23, 24, 25, 27]
 */
  @Test public void TestCase5() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=-1;
    int clsUTGrafoP2RP0P2=19;
    boolean clsUTGrafoP2RP0R=false;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.existeAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
      clsUTGrafoP2R.imprime();
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    String clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.trim();
    String clsUTGrafoP3RP1P1=new String("_p:en=b =%!1%xw:h(k;@hfj0uq");
    boolean clsUTGrafoP3RP1R=false;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.endsWith(clsUTGrafoP3RP1P1);
    assertEquals(false,clsUTGrafoP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[1, 2, 3, 4, 24, 8, 25, 9, 11, 27]
 */
  @Test public void TestCase6() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    Grafo clsUTGrafoP2RP0R=null;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.grafoTransposto();
    int clsUTGrafoP2RP1P1=506;
    int clsUTGrafoP2RP1P2=-465;
    int clsUTGrafoP2RP1P3=-96;
//Exception
    try {
      clsUTGrafoP2R.insereAresta(clsUTGrafoP2RP1P1,clsUTGrafoP2RP1P2,clsUTGrafoP2RP1P3);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    String clsUTGrafoP3RP0P1=new String("$_9l=0)_%xd5c/e(f^q");
    String[] clsUTGrafoP3RP0R=null;
//Exception
    try {
      clsUTGrafoP3RP0R=clsUTGrafoP3R.split(clsUTGrafoP3RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("$_9l=0)_%xd5c/e(f^q",clsUTGrafoP3RP0P1.toString());
    assertNull(clsUTGrafoP3RP0R);
    int clsUTGrafoP3RP1P1=315;
    int clsUTGrafoP3RP1P2=659;
    String clsUTGrafoP3RP1R=null;
//Exception
    try {
      clsUTGrafoP3RP1R=clsUTGrafoP3R.substring(clsUTGrafoP3RP1P1,clsUTGrafoP3RP1P2);
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
 Covered Branches:[1, 17, 2, 3, 4, 24, 8, 25, 9, 11, 27]
 */
  @Test public void TestCase7() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=101;
    int clsUTGrafoP2RP0P2=100;
    Aresta clsUTGrafoP2RP0R=null;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.retiraAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP0R);
    int clsUTGrafoP2RP1P1=68;
    int clsUTGrafoP2RP1P2=-324;
    int clsUTGrafoP2RP1P3=101;
//Exception
    try {
      clsUTGrafoP2R.insereAresta(clsUTGrafoP2RP1P1,clsUTGrafoP2RP1P2,clsUTGrafoP2RP1P3);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    String clsUTGrafoP3RP0P1=new String("8adv7i5cjlehsf3ur60qokgxt1");
    String clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.concat(clsUTGrafoP3RP0P1);
    assertEquals("8adv7i5cjlehsf3ur60qokgxt1",clsUTGrafoP3RP0P1.toString());
    String clsUTGrafoP3RP1P1=new String("dmdkxyhp");
    int clsUTGrafoP3RP1P2=-159;
    String[] clsUTGrafoP3RP1R=null;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.split(clsUTGrafoP3RP1P1,clsUTGrafoP3RP1P2);
    assertEquals("dmdkxyhp",clsUTGrafoP3RP1P1.toString());
  }
}
