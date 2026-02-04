package ds.seed5311;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import java.util.Date;
import java.util.Arrays;
import ds.TabelaHash;
/** 
 * This class was automatically generated to test the ds.TabelaHash class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38]
Uncovered branches: [2, 3, 4, 24]
Total number of branches: 38
Total number of covered branches: 34
Coverage : 89,47%
Evaluations : 70707
search time (ms): 42502
total runtime (ms): 44232
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, java.util.Date[-2165965818219751282L]], 
3)----->toString[], 
4)----->retira[String]
 Covered Branches:[1, 6, 7, 8, 9, 10, 11, 12, 15, 16, 18, 19, 20, 23, 25, 27]
 */
  @Test public void TestCase0() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("7826430159");
    long clsUTTabelaHashP2P2O0P1=-2165965818219751282L;
    Date clsUTTabelaHashP2P2O0=null;
      clsUTTabelaHashP2P2O0=new Date(clsUTTabelaHashP2P2O0P1);
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("7826430159",clsUTTabelaHashP2P1.toString());
    assertEquals("Fri Dec 01 00:17:28 GMT 68633347",clsUTTabelaHashP2P2.toString());
    assertEquals(-2001770210,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.toString();
    String clsUTTabelaHashP3RP0P1=new String("IV!|B7jPL=(5fC6i*n2;1D");
    int clsUTTabelaHashP3RP0R=0;
      clsUTTabelaHashP3RP0R=clsUTTabelaHashP3R.lastIndexOf(clsUTTabelaHashP3RP0P1);
    assertEquals("IV!|B7jPL=(5fC6i*n2;1D",clsUTTabelaHashP3RP0P1.toString());
    assertEquals(-1,clsUTTabelaHashP3RP0R);
    String clsUTTabelaHashP3RP1R=null;
      clsUTTabelaHashP3RP1R=clsUTTabelaHashP3R.trim();
    String clsUTTabelaHashP4P1=new String("5013872469");
      clsUTTabelaHash.retira(clsUTTabelaHashP4P1);
    assertEquals("5013872469",clsUTTabelaHashP4P1.toString());
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, 11], 
3)----->toString[], 
4)----->pesquisa[String]
 Covered Branches:[1, 6, 7, 8, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20, 23]
 */
  @Test public void TestCase1() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
    int clsUTTabelaHashP2P2O0=11;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("",clsUTTabelaHashP2P1.toString());
    assertEquals("11",clsUTTabelaHashP2P2.toString());
    assertEquals(11,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.toString();
    String clsUTTabelaHashP3RP0P1=new String("");
    byte[] clsUTTabelaHashP3RP0R=null;
//Exception
    try {
      clsUTTabelaHashP3RP0R=clsUTTabelaHashP3R.getBytes(clsUTTabelaHashP3RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("",clsUTTabelaHashP3RP0P1.toString());
    assertNull(clsUTTabelaHashP3RP0R);
    String clsUTTabelaHashP3RP1R=null;
      clsUTTabelaHashP3RP1R=clsUTTabelaHashP3R.intern();
    String clsUTTabelaHashP4P1=new String("");
    Object clsUTTabelaHashP4R=null;
      clsUTTabelaHashP4R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP4P1);
    assertEquals("",clsUTTabelaHashP4P1.toString());
    assertEquals("11",clsUTTabelaHashP4R.toString());
    assertEquals(11,clsUTTabelaHashP4R.hashCode());
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, 11.683311F], 
3)----->pesquisa[String], 
4)----->toString[]
 Covered Branches:[1, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 18, 19, 20, 23]
 */
  @Test public void TestCase2() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("_@{([");
    Float clsUTTabelaHashP2P2O0=11.683311F;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("11.683311",clsUTTabelaHashP2P2.toString());
    assertEquals(1094381272,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3P1=new String("cHvuGUB");
    Object clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP3P1);
    assertEquals("cHvuGUB",clsUTTabelaHashP3P1.toString());
    assertNull(clsUTTabelaHashP3R);
    String clsUTTabelaHashP4R=null;
      clsUTTabelaHashP4R=clsUTTabelaHash.toString();
    long clsUTTabelaHashP4RP0P1=36L;
    String clsUTTabelaHashP4RP0R=null;
      clsUTTabelaHashP4RP0R=String.valueOf(clsUTTabelaHashP4RP0P1);
    assertEquals("36",clsUTTabelaHashP4RP0R);
    char[] clsUTTabelaHashP4RP1P1=new char[]{'\u0032','\u0074','\u006d'};
    String clsUTTabelaHashP4RP1R=null;
      clsUTTabelaHashP4RP1R=String.copyValueOf(clsUTTabelaHashP4RP1P1);
    assertTrue(Arrays.equals(new char[]{'\u0032','\u0074','\u006d'},clsUTTabelaHashP4RP1P1));
    assertEquals("2tm",clsUTTabelaHashP4RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, 8], 
3)----->pesquisa[String], 
4)----->retira[String]
 Covered Branches:[1, 6, 7, 8, 9, 10, 11, 12, 14, 15, 16, 18, 19, 20, 23, 25, 26]
 */
  @Test public void TestCase3() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
    byte clsUTTabelaHashP2P2O0=8;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("",clsUTTabelaHashP2P1.toString());
    assertEquals("8",clsUTTabelaHashP2P2.toString());
    assertEquals(8,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3P1=new String("Entrada[");
    Object clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP3P1);
    assertEquals("Entrada[",clsUTTabelaHashP3P1.toString());
    assertNull(clsUTTabelaHashP3R);
    String clsUTTabelaHashP4P1=new String("");
      clsUTTabelaHash.retira(clsUTTabelaHashP4P1);
    assertEquals("",clsUTTabelaHashP4P1.toString());
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, \u003e], 
3)----->recuperaItens[], 
4)----->insere[String, ds.TabelaHash[]]
 Covered Branches:[32, 1, 33, 34, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 18, 19, 20, 22, 23, 28, 29, 30, 31]
 */
  @Test public void TestCase4() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("0718526439");
    char clsUTTabelaHashP2P2O0='\u003e';
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("0718526439",clsUTTabelaHashP2P1.toString());
    assertEquals(">",clsUTTabelaHashP2P2.toString());
    assertEquals(62,clsUTTabelaHashP2P2.hashCode());
    Object[] clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.recuperaItens();
    String clsUTTabelaHashP4P1=new String("Tw");
    TabelaHash clsUTTabelaHashP4P2O0=null;
      clsUTTabelaHashP4P2O0=new TabelaHash();
    Object clsUTTabelaHashP4P2=clsUTTabelaHashP4P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP4P1,(Object)clsUTTabelaHashP4P2);
    assertEquals("Tw",clsUTTabelaHashP4P1.toString());
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->recuperaItens[], 
3)----->insere[String, 49.842748326367655D], 
4)----->recuperaItens[]
 Covered Branches:[32, 1, 33, 34, 6, 7, 8, 9, 10, 11, 12, 15, 16, 18, 19, 20, 23, 28, 29, 30, 31]
 */
  @Test public void TestCase5() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    Object[] clsUTTabelaHashP2R=null;
      clsUTTabelaHashP2R=clsUTTabelaHash.recuperaItens();
    String clsUTTabelaHashP3P1=new String("5<W");
    double clsUTTabelaHashP3P2O0=49.842748326367655D;
    Object clsUTTabelaHashP3P2=clsUTTabelaHashP3P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP3P1,(Object)clsUTTabelaHashP3P2);
    assertEquals("5<W",clsUTTabelaHashP3P1.toString());
    assertEquals("49.842748326367655",clsUTTabelaHashP3P2.toString());
    assertEquals(1829939935,clsUTTabelaHashP3P2.hashCode());
    Object[] clsUTTabelaHashP4R=null;
      clsUTTabelaHashP4R=clsUTTabelaHash.recuperaItens();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, -441], 
3)----->imprime[]
 Covered Branches:[1, 35, 36, 37, 5, 6, 38, 7, 8, 10, 11, 12, 15, 16, 18, 19, 20, 23]
 */
  @Test public void TestCase6() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
    Integer clsUTTabelaHashP2P2O0=-441;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("",clsUTTabelaHashP2P1.toString());
    assertEquals("-441",clsUTTabelaHashP2P2.toString());
    assertEquals(-441,clsUTTabelaHashP2P2.hashCode());
      clsUTTabelaHash.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, \u006f], 
3)----->insere[String, false]
 Covered Branches:[1, 6, 7, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20, 21, 23]
 */
  @Test public void TestCase7() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("Entrada[");
    char clsUTTabelaHashP2P2O0='\u006f';
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("Entrada[",clsUTTabelaHashP2P1.toString());
    assertEquals("o",clsUTTabelaHashP2P2.toString());
    assertEquals(111,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3P1=new String("Entrada[");
    Boolean clsUTTabelaHashP3P2O0=false;
    Object clsUTTabelaHashP3P2=clsUTTabelaHashP3P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP3P1,(Object)clsUTTabelaHashP3P2);
    assertEquals("Entrada[",clsUTTabelaHashP3P1.toString());
    assertEquals("false",clsUTTabelaHashP3P2.toString());
    assertEquals(1237,clsUTTabelaHashP3P2.hashCode());
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->imprime[], 
3)----->pesquisa[String]
 Covered Branches:[35, 36, 6, 38, 7, 8, 9, 10, 11, 12, 15, 16, 18]
 */
  @Test public void TestCase8() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
      clsUTTabelaHash.imprime();
    String clsUTTabelaHashP3P1=new String("OG|>0!&");
    Object clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP3P1);
    assertEquals("OG|>0!&",clsUTTabelaHashP3P1.toString());
    assertNull(clsUTTabelaHashP3R);
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->recuperaItens[], 
3)----->toString[]
 Covered Branches:[32, 34, 6, 7, 10, 11, 28, 29, 31]
 */
  @Test public void TestCase9() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    Object[] clsUTTabelaHashP2R=null;
      clsUTTabelaHashP2R=clsUTTabelaHash.recuperaItens();
    String clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.toString();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->pesquisa[String], 
3)----->retira[String]
 Covered Branches:[16, 18, 6, 7, 8, 9, 25, 10, 11, 27, 12, 15]
 */
  @Test public void TestCase10() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("lj;p[k");
    Object clsUTTabelaHashP2R=null;
      clsUTTabelaHashP2R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP2P1);
    assertEquals("lj;p[k",clsUTTabelaHashP2P1.toString());
    assertNull(clsUTTabelaHashP2R);
    String clsUTTabelaHashP3P1=new String("8203571469");
      clsUTTabelaHash.retira(clsUTTabelaHashP3P1);
    assertEquals("8203571469",clsUTTabelaHashP3P1.toString());
  }
}
