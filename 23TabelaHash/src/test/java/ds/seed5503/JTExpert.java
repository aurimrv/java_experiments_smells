package ds.seed5503;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import java.util.Date;
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
Evaluations : 70960
search time (ms): 42501
total runtime (ms): 44258
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, -25L], 
3)----->retira[String], 
4)----->toString[]
 Covered Branches:[1, 6, 7, 8, 9, 10, 11, 12, 15, 16, 18, 19, 20, 23, 25, 27]
 */
  @Test public void TestCase0() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("9bMKCkqKf8");
    Long clsUTTabelaHashP2P2O0=-25L;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("9bMKCkqKf8",clsUTTabelaHashP2P1.toString());
    assertEquals("-25",clsUTTabelaHashP2P2.toString());
    assertEquals(24,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3P1=new String("617");
      clsUTTabelaHash.retira(clsUTTabelaHashP3P1);
    assertEquals("617",clsUTTabelaHashP3P1.toString());
    String clsUTTabelaHashP4R=null;
      clsUTTabelaHashP4R=clsUTTabelaHash.toString();
    int clsUTTabelaHashP4RP0R=0;
      clsUTTabelaHashP4RP0R=clsUTTabelaHashP4R.hashCode();
    int clsUTTabelaHashP4RP1P1=-555;
    String clsUTTabelaHashP4RP1R=null;
//Exception
    try {
      clsUTTabelaHashP4RP1R=clsUTTabelaHashP4R.substring(clsUTTabelaHashP4RP1P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTTabelaHashP4RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, -39.81148999734334D], 
3)----->retira[String], 
4)----->toString[]
 Covered Branches:[1, 6, 7, 8, 10, 11, 12, 14, 15, 16, 18, 19, 20, 23, 25, 26]
 */
  @Test public void TestCase1() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
    double clsUTTabelaHashP2P2O0=-39.81148999734334D;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("",clsUTTabelaHashP2P1.toString());
    assertEquals("-39.81148999734334",clsUTTabelaHashP2P2.toString());
    assertEquals(657991851,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3P1=new String("");
      clsUTTabelaHash.retira(clsUTTabelaHashP3P1);
    assertEquals("",clsUTTabelaHashP3P1.toString());
    String clsUTTabelaHashP4R=null;
      clsUTTabelaHashP4R=clsUTTabelaHash.toString();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, String], 
3)----->imprime[], 
4)----->recuperaItens[]
 Covered Branches:[1, 5, 6, 7, 8, 9, 10, 11, 12, 15, 16, 18, 19, 20, 23, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38]
 */
  @Test public void TestCase2() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("-569");
    String clsUTTabelaHashP2P2O0=new String("aq34ldpcui5yrswvgom8h6exf79t1jb2kn0z");
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("-569",clsUTTabelaHashP2P1.toString());
    assertEquals("aq34ldpcui5yrswvgom8h6exf79t1jb2kn0z",clsUTTabelaHashP2P2.toString());
    assertEquals(-1302565910,clsUTTabelaHashP2P2.hashCode());
      clsUTTabelaHash.imprime();
    Object[] clsUTTabelaHashP4R=null;
      clsUTTabelaHashP4R=clsUTTabelaHash.recuperaItens();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, 75], 
3)----->toString[], 
4)----->pesquisa[String]
 Covered Branches:[1, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 18, 19, 20, 23]
 */
  @Test public void TestCase3() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("jx21py");
    Short clsUTTabelaHashP2P2O0=75;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("jx21py",clsUTTabelaHashP2P1.toString());
    assertEquals("75",clsUTTabelaHashP2P2.toString());
    assertEquals(75,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.toString();
    String clsUTTabelaHashP4P1=new String(".");
    Object clsUTTabelaHashP4R=null;
      clsUTTabelaHashP4R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP4P1);
    assertEquals(".",clsUTTabelaHashP4P1.toString());
    assertNull(clsUTTabelaHashP4R);
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->recuperaItens[], 
3)----->pesquisa[String], 
4)----->recuperaItens[]
 Covered Branches:[32, 34, 6, 7, 8, 9, 10, 11, 12, 15, 16, 18, 28, 29, 31]
 */
  @Test public void TestCase4() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    Object[] clsUTTabelaHashP2R=null;
      clsUTTabelaHashP2R=clsUTTabelaHash.recuperaItens();
    String clsUTTabelaHashP3P1=new String("685470321");
    Object clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP3P1);
    assertEquals("685470321",clsUTTabelaHashP3P1.toString());
    assertNull(clsUTTabelaHashP3R);
    Object[] clsUTTabelaHashP4R=null;
      clsUTTabelaHashP4R=clsUTTabelaHash.recuperaItens();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->pesquisa[String], 
3)----->insere[String, String], 
4)----->insere[String, -75L]
 Covered Branches:[1, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 18, 19, 20, 22, 23]
 */
  @Test public void TestCase5() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("792");
    Object clsUTTabelaHashP2R=null;
      clsUTTabelaHashP2R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP2P1);
    assertEquals("792",clsUTTabelaHashP2P1.toString());
    assertNull(clsUTTabelaHashP2R);
    String clsUTTabelaHashP3P1=new String("I7sJoQ");
    String clsUTTabelaHashP3P2O0=new String(")'-%` &=}:*</_.$_!#{(+~[>@;|^]?\\\\\\\\\\\\\"");
    Object clsUTTabelaHashP3P2=clsUTTabelaHashP3P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP3P1,(Object)clsUTTabelaHashP3P2);
    assertEquals("I7sJoQ",clsUTTabelaHashP3P1.toString());
    String clsUTTabelaHashP4P1=new String("-800");
    long clsUTTabelaHashP4P2O0=-75L;
    Object clsUTTabelaHashP4P2=clsUTTabelaHashP4P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP4P1,(Object)clsUTTabelaHashP4P2);
    assertEquals("-800",clsUTTabelaHashP4P1.toString());
    assertEquals("-75",clsUTTabelaHashP4P2.toString());
    assertEquals(74,clsUTTabelaHashP4P2.hashCode());
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, \u0042], 
3)----->pesquisa[String]
 Covered Branches:[1, 6, 7, 8, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20, 23]
 */
  @Test public void TestCase6() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
    Character clsUTTabelaHashP2P2O0='\u0042';
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("",clsUTTabelaHashP2P1.toString());
    assertEquals("B",clsUTTabelaHashP2P2.toString());
    assertEquals(66,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3P1=new String("");
    Object clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP3P1);
    assertEquals("",clsUTTabelaHashP3P1.toString());
    assertEquals("B",clsUTTabelaHashP3R.toString());
    assertEquals(66,clsUTTabelaHashP3R.hashCode());
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, java.util.Date[-5L]], 
3)----->insere[String, false]
 Covered Branches:[1, 6, 7, 8, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20, 21, 23]
 */
  @Test public void TestCase7() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
    long clsUTTabelaHashP2P2O0P1=-5L;
    Date clsUTTabelaHashP2P2O0=null;
      clsUTTabelaHashP2P2O0=new Date(clsUTTabelaHashP2P2O0P1);
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("",clsUTTabelaHashP2P1.toString());
    assertEquals("Wed Dec 31 23:59:59 GMT 1969",clsUTTabelaHashP2P2.toString());
    assertEquals(4,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3P1=new String("");
    boolean clsUTTabelaHashP3P2O0=false;
    Object clsUTTabelaHashP3P2=clsUTTabelaHashP3P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP3P1,(Object)clsUTTabelaHashP3P2);
    assertEquals("",clsUTTabelaHashP3P1.toString());
    assertEquals("false",clsUTTabelaHashP3P2.toString());
    assertEquals(1237,clsUTTabelaHashP3P2.hashCode());
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->imprime[], 
3)----->toString[]
 Covered Branches:[35, 36, 6, 38, 7, 10, 11]
 */
  @Test public void TestCase8() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
      clsUTTabelaHash.imprime();
    String clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.toString();
  }
}
