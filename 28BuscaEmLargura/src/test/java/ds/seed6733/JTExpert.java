package ds.seed6733;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import ds.Grafo;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Arrays;
/** 
 * This class was automatically generated to test the ds.Grafo class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35]
Uncovered branches: [7, 25, 13]
Total number of branches: 35
Total number of covered branches: 32
Coverage : 91,43%
Evaluations : 31403
search time (ms): 42501
total runtime (ms): 44770
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.Grafo[902]
2)----->proxAdj[328], 
3)----->existeAresta[284, 806], 
4)----->toString[]
 Covered Branches:[21, 5, 23, 9, 10, 12, 14]
 */
  @Test public void TestCase0() throws Throwable {
    int clsUTGrafoP1P1=902;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=328;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.proxAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    int clsUTGrafoP3P1=284;
    int clsUTGrafoP3P2=806;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.existeAresta(clsUTGrafoP3P1,clsUTGrafoP3P2);
    assertEquals(false,clsUTGrafoP3R);
    String clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.toString();
    String clsUTGrafoP4RP0R=null;
      clsUTGrafoP4RP0R=clsUTGrafoP4R.toLowerCase();
    String clsUTGrafoP4RP1P1=new String("49.450244825823944");
    int clsUTGrafoP4RP1R=0;
      clsUTGrafoP4RP1R=clsUTGrafoP4R.compareToIgnoreCase(clsUTGrafoP4RP1P1);
    assertEquals("49.450244825823944",clsUTGrafoP4RP1P1.toString());
    assertEquals(48,clsUTGrafoP4RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[760]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[32, 16, 34, 18, 9, 10, 31, 15]
 */
  @Test public void TestCase1() throws Throwable {
    int clsUTGrafoP1P1=760;
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
    assertEquals(760,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    String clsUTGrafoP3RP0P1=new String("DW5YkXSHwTqiCGj1mgFVRxAr2Ly0");
    int clsUTGrafoP3RP0R=0;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.lastIndexOf(clsUTGrafoP3RP0P1);
    assertEquals("DW5YkXSHwTqiCGj1mgFVRxAr2Ly0",clsUTGrafoP3RP0P1.toString());
    assertEquals(-1,clsUTGrafoP3RP0R);
    long clsUTGrafoP3RP1P1=39L;
    String clsUTGrafoP3RP1R=null;
      clsUTGrafoP3RP1R=String.valueOf(clsUTGrafoP3RP1P1);
    assertEquals("39",clsUTGrafoP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[0]
2)----->numVertices[], 
3)----->toString[]
 Covered Branches:[9, 30]
 */
  @Test public void TestCase2() throws Throwable {
    int clsUTGrafoP1P1=0;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2R=0;
      clsUTGrafoP2R=clsUTGrafo.numVertices();
    assertEquals(0,clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[632]
2)----->imprime[], 
3)----->toString[]
 Covered Branches:[9, 10, 27, 28]
 */
  @Test public void TestCase3() throws Throwable {
    int clsUTGrafoP1P1=632;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
      clsUTGrafo.imprime();
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    long clsUTGrafoP3RP0P1=11L;
    String clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=String.valueOf(clsUTGrafoP3RP0P1);
    assertEquals("11",clsUTGrafoP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[454]
2)----->primeiroListaAdj[42], 
3)----->listaAdjVazia[138], 
4)----->toString[]
 Covered Branches:[16, 18, 20, 9, 10, 15]
 */
  @Test public void TestCase4() throws Throwable {
    int clsUTGrafoP1P1=454;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=42;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.primeiroListaAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    int clsUTGrafoP3P1=138;
    boolean clsUTGrafoP3R=false;
      clsUTGrafoP3R=clsUTGrafo.listaAdjVazia(clsUTGrafoP3P1);
    assertEquals(true,clsUTGrafoP3R);
    String clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.toString();
    String clsUTGrafoP4RP0P1=new String(")");
    int clsUTGrafoP4RP0R=0;
      clsUTGrafoP4RP0R=clsUTGrafoP4R.lastIndexOf(clsUTGrafoP4RP0P1);
    assertEquals(")",clsUTGrafoP4RP0P1.toString());
    assertEquals(-1,clsUTGrafoP4RP0R);
    Charset clsUTGrafoP4RP1P1=null;
      clsUTGrafoP4RP1P1=Charset.defaultCharset();
    byte[] clsUTGrafoP4RP1R=null;
      clsUTGrafoP4RP1R=clsUTGrafoP4R.getBytes(clsUTGrafoP4RP1P1);
    assertEquals("UTF-8",clsUTGrafoP4RP1P1.name());
    assertEquals(81070450,clsUTGrafoP4RP1P1.hashCode());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[840]
2)----->insereAresta[776, 691, 0], 
3)----->grafoTransposto[]
 Covered Branches:[32, 33, 1, 34, 2, 35, 3, 4, 5, 9, 10, 11, 15, 16, 17, 18, 19, 21, 23, 31]
 */
  @Test public void TestCase5() throws Throwable {
    int clsUTGrafoP1P1=840;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=776;
    int clsUTGrafoP2P2=691;
    int clsUTGrafoP2P3=0;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
    Grafo clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.grafoTransposto();
    assertEquals(840,clsUTGrafoP3R.numVertices());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[740]
2)----->existeAresta[1, -600], 
3)----->toString[]
 Covered Branches:[5, 9, 10, 12, 14]
 */
  @Test public void TestCase6() throws Throwable {
    int clsUTGrafoP1P1=740;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=1;
    int clsUTGrafoP2P2=-600;
    boolean clsUTGrafoP2R=false;
      clsUTGrafoP2R=clsUTGrafo.existeAresta(clsUTGrafoP2P1,clsUTGrafoP2P2);
    assertEquals(false,clsUTGrafoP2R);
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    char[] clsUTGrafoP3RP0R=null;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.toCharArray();
    int clsUTGrafoP3RP1P1=587;
    int clsUTGrafoP3RP1P2=-623;
    int clsUTGrafoP3RP1R=0;
      clsUTGrafoP3RP1R=clsUTGrafoP3R.indexOf(clsUTGrafoP3RP1P1,clsUTGrafoP3RP1P2);
    assertEquals(-1,clsUTGrafoP3RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[687]
2)----->insereAresta[1, -504, 0], 
3)----->imprime[]
 Covered Branches:[5, 9, 10, 11, 27, 28, 29]
 */
  @Test public void TestCase7() throws Throwable {
    int clsUTGrafoP1P1=687;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=1;
    int clsUTGrafoP2P2=-504;
    int clsUTGrafoP2P3=0;
      clsUTGrafo.insereAresta(clsUTGrafoP2P1,clsUTGrafoP2P2,clsUTGrafoP2P3);
      clsUTGrafo.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[278]
2)----->proxAdj[702], 
3)----->insereAresta[0, 291, 558], 
4)----->proxAdj[0], 
5)----->imprime[], 
6)----->proxAdj[887]
 Covered Branches:[1, 2, 21, 5, 22, 9, 10, 11, 27, 28, 29]
 */
  @Test public void TestCase8() throws Throwable {
    int clsUTGrafoP1P1=278;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=702;
    Grafo.Aresta clsUTGrafoP2R=null;
//Exception
    try {
      clsUTGrafoP2R=clsUTGrafo.proxAdj(clsUTGrafoP2P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2R);
    int clsUTGrafoP3P1=0;
    int clsUTGrafoP3P2=291;
    int clsUTGrafoP3P3=558;
      clsUTGrafo.insereAresta(clsUTGrafoP3P1,clsUTGrafoP3P2,clsUTGrafoP3P3);
    int clsUTGrafoP4P1=0;
    Grafo.Aresta clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.proxAdj(clsUTGrafoP4P1);
    int clsUTGrafoP4RP0R=0;
      clsUTGrafoP4RP0R=clsUTGrafoP4R.peso();
    assertEquals(558,clsUTGrafoP4RP0R);
      clsUTGrafo.imprime();
    int clsUTGrafoP6P1=887;
    Grafo.Aresta clsUTGrafoP6R=null;
//Exception
    try {
      clsUTGrafoP6R=clsUTGrafo.proxAdj(clsUTGrafoP6P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP6R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[294]
2)----->grafoTransposto[], 
3)----->numVertices[]
 Covered Branches:[32, 16, 34, 5, 9, 10, 11, 30, 31, 15]
 */
  @Test public void TestCase9() throws Throwable {
    int clsUTGrafoP1P1=294;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    Grafo clsUTGrafoP2RP0R=null;
      clsUTGrafoP2RP0R=clsUTGrafoP2R.grafoTransposto();
    assertEquals(294,clsUTGrafoP2RP0R.numVertices());
    int clsUTGrafoP2RP1P1=1;
    int clsUTGrafoP2RP1P2=0;
    int clsUTGrafoP2RP1P3=50;
      clsUTGrafoP2R.insereAresta(clsUTGrafoP2RP1P1,clsUTGrafoP2RP1P2,clsUTGrafoP2RP1P3);
    assertEquals(294,clsUTGrafoP2R.numVertices());
    int clsUTGrafoP3R=0;
      clsUTGrafoP3R=clsUTGrafo.numVertices();
    assertEquals(294,clsUTGrafoP3R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[830]
2)----->grafoTransposto[], 
3)----->toString[]
 Covered Branches:[32, 16, 34, 5, 24, 9, 10, 27, 28, 31, 15]
 */
  @Test public void TestCase10() throws Throwable {
    int clsUTGrafoP1P1=830;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    Grafo clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.grafoTransposto();
    int clsUTGrafoP2RP0P1=-1;
    int clsUTGrafoP2RP0P2=-417;
    Grafo.Aresta clsUTGrafoP2RP0R=null;
//Exception
    try {
      clsUTGrafoP2RP0R=clsUTGrafoP2R.retiraAresta(clsUTGrafoP2RP0P1,clsUTGrafoP2RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP2RP0R);
      clsUTGrafoP2R.imprime();
    assertEquals(830,clsUTGrafoP2R.numVertices());
    String clsUTGrafoP3R=null;
      clsUTGrafoP3R=clsUTGrafo.toString();
    String clsUTGrafoP3RP0P1=new String("?:yk-#8%}3fbgw>r;~i[4x&=n|059)");
    int clsUTGrafoP3RP0R=0;
      clsUTGrafoP3RP0R=clsUTGrafoP3R.lastIndexOf(clsUTGrafoP3RP0P1);
    assertEquals("?:yk-#8%}3fbgw>r;~i[4x&=n|059)",clsUTGrafoP3RP0P1.toString());
    assertEquals(-1,clsUTGrafoP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[168]
2)----->primeiroListaAdj[6], 
3)----->insereAresta[0, 569, -989], 
4)----->retiraAresta[306, -716], 
5)----->existeAresta[0, -293]
 Covered Branches:[18, 20, 5, 6, 24, 8, 9, 10, 11, 12, 14]
 */
  @Test public void TestCase11() throws Throwable {
    int clsUTGrafoP1P1=168;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=6;
    Grafo.Aresta clsUTGrafoP2R=null;
      clsUTGrafoP2R=clsUTGrafo.primeiroListaAdj(clsUTGrafoP2P1);
    assertNull(clsUTGrafoP2R);
    int clsUTGrafoP3P1=0;
    int clsUTGrafoP3P2=569;
    int clsUTGrafoP3P3=-989;
      clsUTGrafo.insereAresta(clsUTGrafoP3P1,clsUTGrafoP3P2,clsUTGrafoP3P3);
    int clsUTGrafoP4P1=306;
    int clsUTGrafoP4P2=-716;
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
    int clsUTGrafoP5P2=-293;
    boolean clsUTGrafoP5R=false;
      clsUTGrafoP5R=clsUTGrafo.existeAresta(clsUTGrafoP5P1,clsUTGrafoP5P2);
    assertEquals(false,clsUTGrafoP5R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[579, 1, -588]
2)----->v1[], 
3)----->toString[]
 Covered Branches:[1, 3]
 */
  @Test public void TestCase12() throws Throwable {
    int clsUTArestaP1P1=579;
    int clsUTArestaP1P2=1;
    int clsUTArestaP1P3=-588;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v1();
    assertEquals(579,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    char[] clsUTArestaP3RP0R=null;
      clsUTArestaP3RP0R=clsUTArestaP3R.toCharArray();
    Charset clsUTArestaP3RP1P1=null;
      clsUTArestaP3RP1P1=Charset.defaultCharset();
    byte[] clsUTArestaP3RP1R=null;
      clsUTArestaP3RP1R=clsUTArestaP3R.getBytes(clsUTArestaP3RP1P1);
    assertEquals("UTF-8",clsUTArestaP3RP1P1.toString());
    assertEquals("UTF-8",clsUTArestaP3RP1P1.displayName());
    assertEquals(true,clsUTArestaP3RP1P1.isRegistered());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[457, -425, 217]
2)----->v2[], 
3)----->toString[]
 Covered Branches:[1, 4]
 */
  @Test public void TestCase13() throws Throwable {
    int clsUTArestaP1P1=457;
    int clsUTArestaP1P2=-425;
    int clsUTArestaP1P3=217;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.v2();
    assertEquals(-425,clsUTArestaP2R);
    String clsUTArestaP3R=null;
      clsUTArestaP3R=clsUTAresta.toString();
    Locale clsUTArestaP3RP0P1=null;
      clsUTArestaP3RP0P1=(Locale)Locale.KOREA;
    String clsUTArestaP3RP0R=null;
      clsUTArestaP3RP0R=clsUTArestaP3R.toUpperCase(clsUTArestaP3RP0P1);
    assertEquals("KR",clsUTArestaP3RP0P1.getCountry());
    assertEquals("South Korea",clsUTArestaP3RP0P1.getDisplayCountry());
    assertEquals("",clsUTArestaP3RP0P1.getDisplayScript());
    assertEquals(102198165,clsUTArestaP3RP0P1.hashCode());
  }
  /** 
 * Chromosome :
1)----->ds.Grafo[672]
2)----->listaAdjVazia[994], 
3)----->insereAresta[1, -701, -213], 
4)----->retiraAresta[1, 135], 
5)----->primeiroListaAdj[944]
 Covered Branches:[18, 5, 6, 24, 8, 9, 10, 26, 11, 15]
 */
  @Test public void TestCase14() throws Throwable {
    int clsUTGrafoP1P1=672;
    Grafo clsUTGrafo=null;
      clsUTGrafo=new Grafo(clsUTGrafoP1P1);
    int clsUTGrafoP2P1=994;
    boolean clsUTGrafoP2R=false;
//Exception
    try {
      clsUTGrafoP2R=clsUTGrafo.listaAdjVazia(clsUTGrafoP2P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    int clsUTGrafoP3P1=1;
    int clsUTGrafoP3P2=-701;
    int clsUTGrafoP3P3=-213;
      clsUTGrafo.insereAresta(clsUTGrafoP3P1,clsUTGrafoP3P2,clsUTGrafoP3P3);
    int clsUTGrafoP4P1=1;
    int clsUTGrafoP4P2=135;
    Grafo.Aresta clsUTGrafoP4R=null;
      clsUTGrafoP4R=clsUTGrafo.retiraAresta(clsUTGrafoP4P1,clsUTGrafoP4P2);
    assertNull(clsUTGrafoP4R);
    int clsUTGrafoP5P1=944;
    Grafo.Aresta clsUTGrafoP5R=null;
//Exception
    try {
      clsUTGrafoP5R=clsUTGrafo.primeiroListaAdj(clsUTGrafoP5P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTGrafoP5R);
  }
  /** 
 * Chromosome :
1)----->ds.Grafo$Aresta[-904, -813, -419]
2)----->peso[], 
3)----->peso[]
 Covered Branches:[1, 2]
 */
  @Test public void TestCase15() throws Throwable {
    int clsUTArestaP1P1=-904;
    int clsUTArestaP1P2=-813;
    int clsUTArestaP1P3=-419;
    Grafo.Aresta clsUTAresta=null;
      clsUTAresta=new Grafo.Aresta(clsUTArestaP1P1,clsUTArestaP1P2,clsUTArestaP1P3);
    int clsUTArestaP2R=0;
      clsUTArestaP2R=clsUTAresta.peso();
    assertEquals(-419,clsUTArestaP2R);
    int clsUTArestaP3R=0;
      clsUTArestaP3R=clsUTAresta.peso();
    assertEquals(-419,clsUTArestaP3R);
  }
}
