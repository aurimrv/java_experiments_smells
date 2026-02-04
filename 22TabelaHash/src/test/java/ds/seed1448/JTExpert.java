package ds.seed1448;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import java.util.Locale;
import ds.TabelaHash;
/** 
 * This class was automatically generated to test the ds.TabelaHash class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 20, 21, 22, 23, 24, 25, 26]
Uncovered branches: [19]
Total number of branches: 26
Total number of covered branches: 25
Coverage : 96,15%
Evaluations : 60376
search time (ms): 42505
total runtime (ms): 43830
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, true], 
3)----->toString[], 
4)----->retira[String]
 Covered Branches:[1, 2, 3, 6, 7, 8, 10, 11, 12, 13, 17, 18, 20, 22]
 */
  @Test public void TestCase0() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
    Boolean clsUTTabelaHashP2P2O0=true;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("",clsUTTabelaHashP2P1.toString());
    assertEquals("true",clsUTTabelaHashP2P2.toString());
    assertEquals(1231,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.toString();
    String clsUTTabelaHashP4P1=new String("");
      clsUTTabelaHash.retira(clsUTTabelaHashP4P1);
    assertEquals("",clsUTTabelaHashP4P1.toString());
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, -60], 
3)----->toString[], 
4)----->pesquisa[String]
 Covered Branches:[1, 2, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18]
 */
  @Test public void TestCase1() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("38");
    byte clsUTTabelaHashP2P2O0=-60;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("38",clsUTTabelaHashP2P1.toString());
    assertEquals("-60",clsUTTabelaHashP2P2.toString());
    assertEquals(-60,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.toString();
    String clsUTTabelaHashP4P1=new String("8;>3?(");
    Object clsUTTabelaHashP4R=null;
      clsUTTabelaHashP4R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP4P1);
    assertEquals("8;>3?(",clsUTTabelaHashP4P1.toString());
    assertNull(clsUTTabelaHashP4R);
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->imprime[]
 Covered Branches:[6, 7, 23, 24, 10, 26, 11]
 */
  @Test public void TestCase2() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
      clsUTTabelaHash.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, -33], 
3)----->toString[]
 Covered Branches:[17, 1, 18, 6, 7, 8, 9, 10, 11, 12, 13]
 */
  @Test public void TestCase3() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("e");
    Short clsUTTabelaHashP2P2O0=-33;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("e",clsUTTabelaHashP2P1.toString());
    assertEquals("-33",clsUTTabelaHashP2P2.toString());
    assertEquals(-33,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.toString();
    int clsUTTabelaHashP3RP0R=0;
      clsUTTabelaHashP3RP0R=clsUTTabelaHashP3R.length();
    Locale clsUTTabelaHashP3RP1P1=null;
      clsUTTabelaHashP3RP1P1=(Locale)Locale.TAIWAN;
    String clsUTTabelaHashP3RP1R=null;
      clsUTTabelaHashP3RP1R=clsUTTabelaHashP3R.toLowerCase(clsUTTabelaHashP3RP1P1);
    assertEquals("Chinese",clsUTTabelaHashP3RP1P1.getDisplayLanguage());
    assertEquals("Chinese (Taiwan)",clsUTTabelaHashP3RP1P1.getDisplayName());
    assertEquals("zho",clsUTTabelaHashP3RP1P1.getISO3Language());
    assertEquals(false,clsUTTabelaHashP3RP1P1.hasExtensions());
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, -43], 
3)----->imprime[]
 Covered Branches:[1, 5, 6, 7, 8, 9, 10, 11, 12, 13, 17, 18, 23, 24, 25, 26]
 */
  @Test public void TestCase4() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("h");
    Byte clsUTTabelaHashP2P2O0=-43;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("h",clsUTTabelaHashP2P1.toString());
    assertEquals("-43",clsUTTabelaHashP2P2.toString());
    assertEquals(-43,clsUTTabelaHashP2P2.hashCode());
      clsUTTabelaHash.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, 1], 
3)----->pesquisa[String], 
4)----->toString[]
 Covered Branches:[1, 2, 3, 6, 7, 8, 10, 11, 12, 13, 14, 16, 17, 18]
 */
  @Test public void TestCase5() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
    int clsUTTabelaHashP2P2O0=1;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("",clsUTTabelaHashP2P1.toString());
    assertEquals("1",clsUTTabelaHashP2P2.toString());
    assertEquals(1,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3P1=new String("");
    Object clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP3P1);
    assertEquals("",clsUTTabelaHashP3P1.toString());
    assertEquals("1",clsUTTabelaHashP3R.toString());
    assertEquals(1,clsUTTabelaHashP3R.hashCode());
    String clsUTTabelaHashP4R=null;
      clsUTTabelaHashP4R=clsUTTabelaHash.toString();
    String clsUTTabelaHashP4RP0P1=new String("2B");
    int clsUTTabelaHashP4RP0R=0;
      clsUTTabelaHashP4RP0R=clsUTTabelaHashP4R.indexOf(clsUTTabelaHashP4RP0P1);
    assertEquals("2B",clsUTTabelaHashP4RP0P1.toString());
    assertEquals(-1,clsUTTabelaHashP4RP0R);
    int clsUTTabelaHashP4RP1P1=-676;
    int clsUTTabelaHashP4RP1R=0;
      clsUTTabelaHashP4RP1R=clsUTTabelaHashP4R.indexOf(clsUTTabelaHashP4RP1P1);
    assertEquals(-1,clsUTTabelaHashP4RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, java.lang.StringBuilder[valueOf[false]]], 
3)----->retira[String]
 Covered Branches:[1, 2, 4, 6, 7, 8, 9, 10, 11, 12, 13, 17, 18, 20, 21]
 */
  @Test public void TestCase6() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("328");
    boolean clsUTTabelaHashP2P2O0P1P1=false;
    CharSequence clsUTTabelaHashP2P2O0P1=null;
      clsUTTabelaHashP2P2O0P1=String.valueOf(clsUTTabelaHashP2P2O0P1P1);
    StringBuilder clsUTTabelaHashP2P2O0=null;
      clsUTTabelaHashP2P2O0=new StringBuilder(clsUTTabelaHashP2P2O0P1);
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("328",clsUTTabelaHashP2P1.toString());
    assertEquals("false",clsUTTabelaHashP2P2.toString());
    String clsUTTabelaHashP3P1=new String("Asyfr");
//Exception
    try {
      clsUTTabelaHash.retira(clsUTTabelaHashP3P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("Asyfr",clsUTTabelaHashP3P1.toString());
  }
}
