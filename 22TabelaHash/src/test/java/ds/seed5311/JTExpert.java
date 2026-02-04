package ds.seed5311;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Rule;
import java.util.Arrays;
import ds.TabelaHash;
import java.time.Duration;
/** 
 * This class was automatically generated to test the ds.TabelaHash class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 20, 21, 22, 23, 24, 25, 26]
Uncovered branches: [19]
Total number of branches: 26
Total number of covered branches: 25
Coverage : 96,15%
Evaluations : 61843
search time (ms): 42501
total runtime (ms): 43790
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->pesquisa[String]
 Covered Branches:[6, 7, 8, 9, 10, 11, 12, 13]
 */
  @Test public void TestCase0() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("14");
    Object clsUTTabelaHashP2R=null;
      clsUTTabelaHashP2R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP2P1);
    assertEquals("14",clsUTTabelaHashP2P1.toString());
    assertNull(clsUTTabelaHashP2R);
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->imprime[], 
3)----->pesquisa[String], 
4)----->imprime[]
 Covered Branches:[6, 7, 23, 24, 8, 9, 10, 26, 11, 12, 13]
 */
  @Test public void TestCase1() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
      clsUTTabelaHash.imprime();
    String clsUTTabelaHashP3P1=new String("_");
    Object clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP3P1);
    assertEquals("_",clsUTTabelaHashP3P1.toString());
    assertNull(clsUTTabelaHashP3R);
      clsUTTabelaHash.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, -781], 
3)----->pesquisa[String]
 Covered Branches:[1, 2, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18]
 */
  @Test public void TestCase2() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
    Integer clsUTTabelaHashP2P2O0=-781;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("",clsUTTabelaHashP2P1.toString());
    assertEquals("-781",clsUTTabelaHashP2P2.toString());
    assertEquals(-781,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3P1=new String("]y{BA");
    Object clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP3P1);
    assertEquals("]y{BA",clsUTTabelaHashP3P1.toString());
    assertNull(clsUTTabelaHashP3R);
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, ofNanos[-65L]], 
3)----->pesquisa[String]
 Covered Branches:[1, 2, 3, 6, 7, 8, 10, 11, 12, 13, 14, 16, 17, 18]
 */
  @Test public void TestCase3() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
    long clsUTTabelaHashP2P2O0P1=-65L;
    Duration clsUTTabelaHashP2P2O0=null;
      clsUTTabelaHashP2P2O0=Duration.ofNanos(clsUTTabelaHashP2P2O0P1);
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("",clsUTTabelaHashP2P1.toString());
    assertEquals("PT-0.000000065S",clsUTTabelaHashP2P2.toString());
    assertEquals(-539610867,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3P1=new String("");
    Object clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP3P1);
    assertEquals("",clsUTTabelaHashP3P1.toString());
    assertEquals("PT-0.000000065S",clsUTTabelaHashP3R.toString());
    assertEquals(-539610867,clsUTTabelaHashP3R.hashCode());
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, -960], 
3)----->imprime[], 
4)----->imprime[]
 Covered Branches:[1, 5, 6, 7, 8, 10, 11, 12, 13, 17, 18, 23, 24, 25, 26]
 */
  @Test public void TestCase4() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
    Integer clsUTTabelaHashP2P2O0=-960;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("",clsUTTabelaHashP2P1.toString());
    assertEquals("-960",clsUTTabelaHashP2P2.toString());
    assertEquals(-960,clsUTTabelaHashP2P2.hashCode());
      clsUTTabelaHash.imprime();
      clsUTTabelaHash.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->imprime[], 
3)----->toString[], 
4)----->insere[String, 74L], 
5)----->retira[String]
 Covered Branches:[1, 2, 4, 6, 7, 8, 9, 10, 11, 12, 13, 17, 18, 20, 21, 23, 24, 26]
 */
  @Test public void TestCase5() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
      clsUTTabelaHash.imprime();
    String clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.toString();
    String clsUTTabelaHashP4P1=new String("0LB4aV");
    Long clsUTTabelaHashP4P2O0=74L;
    Object clsUTTabelaHashP4P2=clsUTTabelaHashP4P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP4P1,(Object)clsUTTabelaHashP4P2);
    assertEquals("0LB4aV",clsUTTabelaHashP4P1.toString());
    assertEquals("74",clsUTTabelaHashP4P2.toString());
    assertEquals(74,clsUTTabelaHashP4P2.hashCode());
    String clsUTTabelaHashP5P1=new String("2`9");
//Exception
    try {
      clsUTTabelaHash.retira(clsUTTabelaHashP5P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("2`9",clsUTTabelaHashP5P1.toString());
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, false], 
3)----->toString[], 
4)----->retira[String]
 Covered Branches:[1, 2, 3, 6, 7, 8, 10, 11, 12, 13, 17, 18, 20, 22]
 */
 @Ignore
  @Test public void TestCase6() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
    Boolean clsUTTabelaHashP2P2O0=false;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("",clsUTTabelaHashP2P1.toString());
    assertEquals("false",clsUTTabelaHashP2P2.toString());
    assertEquals(1237,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.toString();
    int clsUTTabelaHashP3RP0P1=-145;
    int clsUTTabelaHashP3RP0P2=-266;
    char[] clsUTTabelaHashP3RP0P3=new char[]{'\u007e','\u0034','\u0036'};
    int clsUTTabelaHashP3RP0P4=7;
//Exception
    try {
      clsUTTabelaHashP3R.getChars(clsUTTabelaHashP3RP0P1,clsUTTabelaHashP3RP0P2,clsUTTabelaHashP3RP0P3,clsUTTabelaHashP3RP0P4);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertTrue(Arrays.equals(new char[]{'\u007e','\u0034','\u0036'},clsUTTabelaHashP3RP0P3));
    int clsUTTabelaHashP3RP1R=0;
      clsUTTabelaHashP3RP1R=clsUTTabelaHashP3R.length();
    assertEquals(22,clsUTTabelaHashP3RP1R);
    String clsUTTabelaHashP4P1=new String("");
      clsUTTabelaHash.retira(clsUTTabelaHashP4P1);
    assertEquals("",clsUTTabelaHashP4P1.toString());
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, String], 
3)----->toString[]
 Covered Branches:[17, 1, 18, 6, 7, 8, 9, 10, 11, 12, 13]
 */
  @Test public void TestCase7() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String(":'");
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)null);
    assertEquals(":'",clsUTTabelaHashP2P1.toString());
    String clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.toString();
    int clsUTTabelaHashP3RP0P1=399;
    int clsUTTabelaHashP3RP0P2=-813;
    int clsUTTabelaHashP3RP0R=0;
//Exception
    try {
      clsUTTabelaHashP3RP0R=clsUTTabelaHashP3R.codePointCount(clsUTTabelaHashP3RP0P1,clsUTTabelaHashP3RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    String clsUTTabelaHashP3RP1R=null;
      clsUTTabelaHashP3RP1R=clsUTTabelaHashP3R.toUpperCase();
  }
}
