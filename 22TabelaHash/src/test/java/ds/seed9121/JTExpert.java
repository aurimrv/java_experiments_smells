package ds.seed9121;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import java.time.Instant;
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
Evaluations : 56988
search time (ms): 42501
total runtime (ms): 44344
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, true], 
3)----->imprime[], 
4)----->insere[String, java.util.Date[]]
 Covered Branches:[1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18, 23, 24, 25, 26]
 */
  @Test public void TestCase0() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("-38");
    Boolean clsUTTabelaHashP2P2O0=true;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("-38",clsUTTabelaHashP2P1.toString());
    assertEquals("true",clsUTTabelaHashP2P2.toString());
    assertEquals(1231,clsUTTabelaHashP2P2.hashCode());
      clsUTTabelaHash.imprime();
    String clsUTTabelaHashP4P1=new String("227");
    Date clsUTTabelaHashP4P2O0=null;
      clsUTTabelaHashP4P2O0=new Date();
    Object clsUTTabelaHashP4P2=clsUTTabelaHashP4P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP4P1,(Object)clsUTTabelaHashP4P2);
    assertEquals("227",clsUTTabelaHashP4P1.toString());
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, ofEpochMilli[28L]], 
3)----->pesquisa[String], 
4)----->retira[String]
 Covered Branches:[1, 2, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18, 20, 21]
 */
  @Test public void TestCase1() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
    long clsUTTabelaHashP2P2O0P1=28L;
    Instant clsUTTabelaHashP2P2O0=null;
      clsUTTabelaHashP2P2O0=Instant.ofEpochMilli(clsUTTabelaHashP2P2O0P1);
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("",clsUTTabelaHashP2P1.toString());
    assertEquals("1970-01-01T00:00:00.028Z",clsUTTabelaHashP2P2.toString());
    assertEquals(1428000000,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3P1=new String("#");
    Object clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP3P1);
    assertEquals("#",clsUTTabelaHashP3P1.toString());
    assertNull(clsUTTabelaHashP3R);
    String clsUTTabelaHashP4P1=new String("_/>}");
//Exception
    try {
      clsUTTabelaHash.retira(clsUTTabelaHashP4P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("_/>}",clsUTTabelaHashP4P1.toString());
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, 2.9478757771287007D], 
3)----->imprime[], 
4)----->imprime[]
 Covered Branches:[1, 5, 6, 7, 8, 9, 10, 11, 12, 13, 17, 18, 23, 24, 25, 26]
 */
  @Test public void TestCase2() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("RS");
    Double clsUTTabelaHashP2P2O0=2.9478757771287007D;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("RS",clsUTTabelaHashP2P1.toString());
    assertEquals("2.9478757771287007",clsUTTabelaHashP2P2.toString());
    assertEquals(-1522789121,clsUTTabelaHashP2P2.hashCode());
      clsUTTabelaHash.imprime();
      clsUTTabelaHash.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, -666], 
3)----->toString[]
 Covered Branches:[17, 1, 18, 6, 7, 8, 9, 10, 11, 12, 13]
 */
  @Test public void TestCase3() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("'.is@|4");
    Integer clsUTTabelaHashP2P2O0=-666;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("-666",clsUTTabelaHashP2P2.toString());
    assertEquals(-666,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.toString();
    StringBuffer clsUTTabelaHashP3RP0P1=null;
      clsUTTabelaHashP3RP0P1=new StringBuffer();
    boolean clsUTTabelaHashP3RP0R=false;
      clsUTTabelaHashP3RP0R=clsUTTabelaHashP3R.contentEquals(clsUTTabelaHashP3RP0P1);
    assertEquals("",clsUTTabelaHashP3RP0P1.toString());
    assertEquals(16,clsUTTabelaHashP3RP0P1.capacity());
    assertEquals(false,clsUTTabelaHashP3RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->imprime[], 
3)----->toString[]
 Covered Branches:[6, 7, 23, 24, 10, 26, 11]
 */
  @Test public void TestCase4() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
      clsUTTabelaHash.imprime();
    String clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.toString();
    float clsUTTabelaHashP3RP0P1P1=-21.914078F;
    CharSequence clsUTTabelaHashP3RP0P1=null;
      clsUTTabelaHashP3RP0P1=String.valueOf(clsUTTabelaHashP3RP0P1P1);
    String clsUTTabelaHashP3RP0P2P1=new String("uotkbdwh6");
    Object[] clsUTTabelaHashP3RP0P2P2=new Object[]{};
    CharSequence clsUTTabelaHashP3RP0P2=null;
      clsUTTabelaHashP3RP0P2=String.format(clsUTTabelaHashP3RP0P2P1,clsUTTabelaHashP3RP0P2P2);
    String clsUTTabelaHashP3RP0R=null;
      clsUTTabelaHashP3RP0R=clsUTTabelaHashP3R.replace(clsUTTabelaHashP3RP0P1,clsUTTabelaHashP3RP0P2);
    assertEquals("-21.914078",clsUTTabelaHashP3RP0P1.toString());
    assertEquals(10,clsUTTabelaHashP3RP0P1.length());
    assertEquals("uotkbdwh6",clsUTTabelaHashP3RP0P2.toString());
    assertEquals(9,clsUTTabelaHashP3RP0P2.length());
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, \u0063], 
3)----->toString[], 
4)----->retira[String]
 Covered Branches:[1, 2, 3, 6, 7, 8, 10, 11, 12, 13, 17, 18, 20, 22]
 */
  @Test public void TestCase5() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
    Character clsUTTabelaHashP2P2O0='\u0063';
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("",clsUTTabelaHashP2P1.toString());
    assertEquals("c",clsUTTabelaHashP2P2.toString());
    assertEquals(99,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.toString();
    String clsUTTabelaHashP4P1=new String("");
      clsUTTabelaHash.retira(clsUTTabelaHashP4P1);
    assertEquals("",clsUTTabelaHashP4P1.toString());
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, 636], 
3)----->pesquisa[String], 
4)----->toString[]
 Covered Branches:[1, 2, 3, 6, 7, 8, 10, 11, 12, 13, 14, 16, 17, 18]
 */
  @Test public void TestCase6() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
    Integer clsUTTabelaHashP2P2O0=636;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("",clsUTTabelaHashP2P1.toString());
    assertEquals("636",clsUTTabelaHashP2P2.toString());
    assertEquals(636,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3P1=new String("");
    Object clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP3P1);
    assertEquals("",clsUTTabelaHashP3P1.toString());
    assertEquals("636",clsUTTabelaHashP3R.toString());
    assertEquals(636,clsUTTabelaHashP3R.hashCode());
    String clsUTTabelaHashP4R=null;
      clsUTTabelaHashP4R=clsUTTabelaHash.toString();
    int clsUTTabelaHashP4RP0P1=-861;
    String clsUTTabelaHashP4RP0R=null;
      clsUTTabelaHashP4RP0R=String.valueOf(clsUTTabelaHashP4RP0P1);
    assertEquals("-861",clsUTTabelaHashP4RP0R);
    String clsUTTabelaHashP4RP1P1=new String("322370135638511677412741784310377683705001873027271");
    int clsUTTabelaHashP4RP1R=0;
      clsUTTabelaHashP4RP1R=clsUTTabelaHashP4R.indexOf(clsUTTabelaHashP4RP1P1);
    assertEquals("322370135638511677412741784310377683705001873027271",clsUTTabelaHashP4RP1P1.toString());
    assertEquals(-1,clsUTTabelaHashP4RP1R);
  }
}
