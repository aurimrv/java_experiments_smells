package ds.seed5831;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import java.util.Locale;
import ds.Aresta;
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
Evaluations : 9908
search time (ms): 42521
total runtime (ms): 44139
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->retiraAresta[0, 0], 
3)----->toString[]
 Covered Branches:[1, 17, 2, 18, 3]
 */
  @Test public void TestCase0() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2P1=0;
    int clsUTGrafoP2P2=0;
    Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.retiraAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    assertNull(clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    int clsUTGrafoP3RP0P1=692;
    char clsUTGrafoP3RP0R='X';
//Exception
    try {
      clsUTGrafoP3RP0R=clsUTGrafoP3R.charAt(clsUTGrafoP3RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->proxAdj[0], 
3)----->proxAdj[0], 
4)----->toString[]
 Covered Branches:[16, 1, 2, 3, 13, 14, 15]
 */
  @Test public void TestCase1() throws Throwable {
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
    String clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->existeAresta[1, 0], 
3)----->toString[]
 Covered Branches:[1, 2, 3, 5, 7]
 */
  @Test public void TestCase2() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2P1=1;
    int clsUTGrafoP2P2=0;
    boolean clsUTGrafoP2R=false;
      clsUTGrafoP2R=clsUTGrafo.existeAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    assertEquals(false,clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    String clsUTGrafoP3RP0P1=new String("jYRcu5MyWemqB8IGS9dAoHNr1vhUXlkzgfFsDCnO26KQTJ4bwtxipaP7V03LEZ");
    int clsUTGrafoP3RP0R=0;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.compareToIgnoreCase(clsUTGrafoP3RP0P1);
    assertEquals("jYRcu5MyWemqB8IGS9dAoHNr1vhUXlkzgfFsDCnO26KQTJ4bwtxipaP7V03LEZ",clsUTGrafoP3RP0P1.toString());
    assertEquals(-6,clsUTGrafoP3RP0R);
    int clsUTGrafoP3RP1P1=100;
    int clsUTGrafoP3RP1R=0;
//Exception
    try {
      clsUTGrafoP3RP1R=clsUTGrafoP3R.codePointBefore(clsUTGrafoP3RP1P1);
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
 Covered Branches:[1, 2, 3, 8, 9, 11, 20, 21, 22, 23, 24, 25, 27]
 */
  @Test public void TestCase3() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
      clsUTGrafoP2R.imprime();
      clsUTGrafoP2R.imprime();
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[1, 2, 3, 24, 8, 25, 9, 11, 27, 13]
 */
  @Test public void TestCase4() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=924;
    Aresta clsUTGrafoP2RP0R=null;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.proxAdj(clsUTGrafoP2RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP0R);
    Grafo clsUTGrafoP2RP1R=null;
      clsUTGrafoP2RP1R=clsUTGrafoP2R.grafoTransposto();
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    StringBuffer clsUTGrafoP3RP0P1P1=null;
      clsUTGrafoP3RP0P1P1=new StringBuffer();
    CharSequence clsUTGrafoP3RP0P1=null;
      clsUTGrafoP3RP0P1=new String(clsUTGrafoP3RP0P1P1);
    boolean clsUTGrafoP3RP0R=false;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.contentEquals(clsUTGrafoP3RP0P1);
    assertEquals("",clsUTGrafoP3RP0P1.toString());
    assertEquals(0,clsUTGrafoP3RP0P1.length());
    assertEquals(false,clsUTGrafoP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[1, 17, 2, 3, 24, 8, 25, 9, 11, 27, 12]
 */
  @Test public void TestCase5() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=-917;
    int clsUTGrafoP2RP0P2=247;
    Aresta clsUTGrafoP2RP0R=null;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.retiraAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP0R);
    int clsUTGrafoP2RP1P1=-384;
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
    double clsUTGrafoP3RP0P1P1=-63.751628566585076D;
    CharSequence clsUTGrafoP3RP0P1=null;
      clsUTGrafoP3RP0P1=String.valueOf(clsUTGrafoP3RP0P1P1);
    StringBuffer clsUTGrafoP3RP0P2P1P1=null;
      clsUTGrafoP3RP0P2P1P1=new StringBuffer();
    CharSequence clsUTGrafoP3RP0P2P1=null;
      clsUTGrafoP3RP0P2P1=new String(clsUTGrafoP3RP0P2P1P1);
    char[] clsUTGrafoP3RP0P2P2P1=new char[]{'\uae02','\u007a'};
    CharSequence clsUTGrafoP3RP0P2P2=null;
      clsUTGrafoP3RP0P2P2=String.valueOf(clsUTGrafoP3RP0P2P2P1);
    boolean clsUTGrafoP3RP0P2P3P1=true;
    CharSequence clsUTGrafoP3RP0P2P3=null;
      clsUTGrafoP3RP0P2P3=String.valueOf(clsUTGrafoP3RP0P2P3P1);
    char[] clsUTGrafoP3RP0P2P4P1=new char[]{};
    CharSequence clsUTGrafoP3RP0P2P4=null;
      clsUTGrafoP3RP0P2P4=new String(clsUTGrafoP3RP0P2P4P1);
    CharSequence[] clsUTGrafoP3RP0P2=new CharSequence[]{clsUTGrafoP3RP0P2P1,clsUTGrafoP3RP0P2P2,clsUTGrafoP3RP0P2P3,clsUTGrafoP3RP0P2P4};
    String clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=String.join(clsUTGrafoP3RP0P1,clsUTGrafoP3RP0P2);
    assertEquals("-63.751628566585076",clsUTGrafoP3RP0P1.toString());
    assertEquals(19,clsUTGrafoP3RP0P1.length());
    assertEquals("-63.751628566585076긂z-63.751628566585076true-63.751628566585076",clsUTGrafoP3RP0R);
    Locale clsUTGrafoP3RP1P1=null;
      clsUTGrafoP3RP1P1=(Locale)Locale.FRANCE;
    String clsUTGrafoP3RP1R=null;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.toLowerCase(clsUTGrafoP3RP1P1);
    assertEquals("",clsUTGrafoP3RP1P1.getDisplayVariant());
    assertEquals("FR",clsUTGrafoP3RP1P1.getCountry());
    assertEquals("",clsUTGrafoP3RP1P1.getScript());
    assertEquals(97665128,clsUTGrafoP3RP1P1.hashCode());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[1, 17, 2, 3, 5, 24, 8, 25, 9, 11, 27]
 */
  @Test public void TestCase6() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=-995;
    int clsUTGrafoP2RP0P2=650;
    Aresta clsUTGrafoP2RP0R=null;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.retiraAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP0R);
    int clsUTGrafoP2RP1P1=-512;
    int clsUTGrafoP2RP1P2=212;
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
    int clsUTGrafoP3RP0P1=-279;
    int clsUTGrafoP3RP0P2=-80;
    int clsUTGrafoP3RP0R=0;
//Exception
    try {
      clsUTGrafoP3RP0R=clsUTGrafoP3R.codePointCount(clsUTGrafoP3RP0P1,clsUTGrafoP3RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->proxAdj[99], 
3)----->toString[]
 Covered Branches:[1, 2, 3, 13, 14, 15]
 */
  @Test public void TestCase7() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    int clsUTGrafoP2P1=99;
    Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.proxAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    String clsUTGrafoP3RP0P1=new String("(<;'- _#)}{<:^*}^}_ +;'#)-.;=>%{]:.':;%<~:-`??*$>#(+ _&&]!)< #(){} {!-#[`@)%-`~<(;__=&&%^>_`-</{`!+]?(=|>{`*.+:{ }`|&!_?{+=.#-~/<:=/[=.}#[-^_%-#?@_*^+`^$>^*;_>#!");
    String clsUTGrafoP3RP0R=null;
//Exception
    try {
      clsUTGrafoP3RP0R=clsUTGrafoP3R.replaceFirst(clsUTGrafoP3RP0P1,(String)null);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[1, 17, 2, 3, 4, 24, 8, 25, 9, 11, 27]
 */
  @Test public void TestCase8() throws Throwable {
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo();
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=0;
    int clsUTGrafoP2RP0P2=231;
    Aresta clsUTGrafoP2RP0R=null;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.retiraAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP0R);
    int clsUTGrafoP2RP1P1=-5;
    int clsUTGrafoP2RP1P2=-733;
    int clsUTGrafoP2RP1P3=-307;
//Exception
    try {
      clsUTGrafoP2R.insereAresta(clsUTGrafoP2RP1P1,clsUTGrafoP2RP1P2,clsUTGrafoP2RP1P3);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    char[] clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.toCharArray();
    boolean clsUTGrafoP3RP1R=false;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.isEmpty();
    assertEquals(false,clsUTGrafoP3RP1R);
  }
}
