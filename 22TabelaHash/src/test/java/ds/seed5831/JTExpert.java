package ds.seed5831;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import java.util.Locale;
import ds.TabelaHash;
import java.util.Date;
/** 
 * This class was automatically generated to test the ds.TabelaHash class according to all branches coverage criterion
ExceptionsOriented: false 
projectPackagesPrefix:ds 
Covered branches: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 20, 21, 22, 23, 24, 25, 26]
Uncovered branches: [19]
Total number of branches: 26
Total number of covered branches: 25
Coverage : 96,15%
Evaluations : 56784
search time (ms): 42501
total runtime (ms): 43810
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, ds.TabelaHash[]], 
3)----->imprime[]
 Covered Branches:[1, 5, 6, 7, 8, 9, 10, 11, 12, 13, 17, 18, 23, 24, 25, 26]
 */
  @Test public void TestCase0() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("vbhiq");
    TabelaHash clsUTTabelaHashP2P2O0=null;
      clsUTTabelaHashP2P2O0=new TabelaHash();
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("vbhiq",clsUTTabelaHashP2P1.toString());
      clsUTTabelaHash.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->imprime[], 
3)----->imprime[], 
4)----->imprime[]
 Covered Branches:[6, 7, 23, 24, 10, 26, 11]
 */
  @Test public void TestCase1() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
      clsUTTabelaHash.imprime();
      clsUTTabelaHash.imprime();
      clsUTTabelaHash.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, -741], 
3)----->pesquisa[String], 
4)----->toString[]
 Covered Branches:[1, 2, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18]
 */
  @Test public void TestCase2() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
    Integer clsUTTabelaHashP2P2O0=-741;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("",clsUTTabelaHashP2P1.toString());
    assertEquals("-741",clsUTTabelaHashP2P2.toString());
    assertEquals(-741,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3P1=new String("2");
    Object clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP3P1);
    assertEquals("2",clsUTTabelaHashP3P1.toString());
    assertNull(clsUTTabelaHashP3R);
    String clsUTTabelaHashP4R=null;
      clsUTTabelaHashP4R=clsUTTabelaHash.toString();
    String clsUTTabelaHashP4RP0P1P1=new String("%-M(i!N+ZWOCf12i+VxgDh>Ny{UM-!");
    StringBuffer clsUTTabelaHashP4RP0P1=null;
      clsUTTabelaHashP4RP0P1=new StringBuffer(clsUTTabelaHashP4RP0P1P1);
    boolean clsUTTabelaHashP4RP0R=false;
      clsUTTabelaHashP4RP0R=clsUTTabelaHashP4R.contentEquals(clsUTTabelaHashP4RP0P1);
    assertEquals("%-M(i!N+ZWOCf12i+VxgDh>Ny{UM-!",clsUTTabelaHashP4RP0P1.toString());
    assertEquals(46,clsUTTabelaHashP4RP0P1.capacity());
    assertEquals(false,clsUTTabelaHashP4RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, java.util.Date[-922, 630, 0]], 
3)----->pesquisa[String], 
4)----->toString[]
 Covered Branches:[1, 2, 3, 6, 7, 8, 10, 11, 12, 13, 14, 16, 17, 18]
 */
  @Test public void TestCase3() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
    int clsUTTabelaHashP2P2O0P1=-922;
    int clsUTTabelaHashP2P2O0P2=630;
    int clsUTTabelaHashP2P2O0P3=0;
    Date clsUTTabelaHashP2P2O0=null;
      clsUTTabelaHashP2P2O0=new Date(clsUTTabelaHashP2P2O0P1,clsUTTabelaHashP2P2O0P2,clsUTTabelaHashP2P2O0P3);
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("",clsUTTabelaHashP2P1.toString());
    assertEquals("Tue Jun 30 00:00:00 GMT 1030",clsUTTabelaHashP2P2.toString());
    assertEquals(-690438903,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3P1=new String("");
    Object clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP3P1);
    assertEquals("",clsUTTabelaHashP3P1.toString());
    assertEquals("Tue Jun 30 00:00:00 GMT 1030",clsUTTabelaHashP3R.toString());
    assertEquals(-690438903,clsUTTabelaHashP3R.hashCode());
    String clsUTTabelaHashP4R=null;
      clsUTTabelaHashP4R=clsUTTabelaHash.toString();
    Locale clsUTTabelaHashP4RP0P1=null;
      clsUTTabelaHashP4RP0P1=(Locale)Locale.ENGLISH;
    String clsUTTabelaHashP4RP0P2=new String("hsld244571rgsms4c0n");
    byte clsUTTabelaHashP4RP0P3P1O0=78;
    Object clsUTTabelaHashP4RP0P3P1=clsUTTabelaHashP4RP0P3P1O0;
    String clsUTTabelaHashP4RP0P3P2O0=new String("YFqNMCEfj5Hhm0kR4z3IlP1w7XJbLDQTo");
    Object clsUTTabelaHashP4RP0P3P2=clsUTTabelaHashP4RP0P3P2O0;
    Object[] clsUTTabelaHashP4RP0P3=new Object[]{clsUTTabelaHashP4RP0P3P1,clsUTTabelaHashP4RP0P3P2};
    String clsUTTabelaHashP4RP0R=null;
      clsUTTabelaHashP4RP0R=String.format(clsUTTabelaHashP4RP0P1,clsUTTabelaHashP4RP0P2,(Object[])clsUTTabelaHashP4RP0P3);
    assertEquals("",clsUTTabelaHashP4RP0P1.getScript());
    assertEquals("en",clsUTTabelaHashP4RP0P1.getLanguage());
    assertEquals("",clsUTTabelaHashP4RP0P1.getDisplayScript());
    assertEquals(false,clsUTTabelaHashP4RP0P1.hasExtensions());
    assertEquals("hsld244571rgsms4c0n",clsUTTabelaHashP4RP0P2.toString());
    assertEquals("hsld244571rgsms4c0n",clsUTTabelaHashP4RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, true], 
3)----->retira[String], 
4)----->toString[]
 Covered Branches:[1, 2, 4, 6, 7, 8, 9, 10, 11, 12, 13, 17, 18, 20, 21]
 */
  @Test public void TestCase4() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("mJQ");
    Boolean clsUTTabelaHashP2P2O0=true;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("mJQ",clsUTTabelaHashP2P1.toString());
    assertEquals("true",clsUTTabelaHashP2P2.toString());
    assertEquals(1231,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3P1=new String("<bsh");
//Exception
    try {
      clsUTTabelaHash.retira(clsUTTabelaHashP3P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("<bsh",clsUTTabelaHashP3P1.toString());
    String clsUTTabelaHashP4R=null;
      clsUTTabelaHashP4R=clsUTTabelaHash.toString();
    int clsUTTabelaHashP4RP0P1=-49;
    int clsUTTabelaHashP4RP0P2=1;
    String clsUTTabelaHashP4RP0R=null;
//Exception
    try {
      clsUTTabelaHashP4RP0R=clsUTTabelaHashP4R.substring(clsUTTabelaHashP4RP0P1,clsUTTabelaHashP4RP0P2);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTTabelaHashP4RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->imprime[], 
3)----->insere[String, \u003c]
 Covered Branches:[1, 6, 7, 8, 9, 10, 11, 12, 13, 17, 18, 23, 24, 26]
 */
  @Test public void TestCase5() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
      clsUTTabelaHash.imprime();
    String clsUTTabelaHashP3P1=new String("false");
    char clsUTTabelaHashP3P2O0='\u003c';
    Object clsUTTabelaHashP3P2=clsUTTabelaHashP3P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP3P1,(Object)clsUTTabelaHashP3P2);
    assertEquals("false",clsUTTabelaHashP3P1.toString());
    assertEquals("<",clsUTTabelaHashP3P2.toString());
    assertEquals(60,clsUTTabelaHashP3P2.hashCode());
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, 607], 
3)----->retira[String]
 Covered Branches:[1, 2, 3, 6, 7, 8, 10, 11, 12, 13, 17, 18, 20, 22]
 */
  @Test public void TestCase6() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
    Integer clsUTTabelaHashP2P2O0=607;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("",clsUTTabelaHashP2P1.toString());
    assertEquals("607",clsUTTabelaHashP2P2.toString());
    assertEquals(607,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3P1=new String("");
      clsUTTabelaHash.retira(clsUTTabelaHashP3P1);
    assertEquals("",clsUTTabelaHashP3P1.toString());
  }
}
