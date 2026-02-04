package ds.seed5838;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
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
Evaluations : 58805
search time (ms): 42501
total runtime (ms): 43793
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, -87.024025F], 
3)----->imprime[]
 Covered Branches:[1, 5, 6, 7, 8, 9, 10, 11, 12, 13, 17, 18, 23, 24, 25, 26]
 */
  @Test public void TestCase0() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("905");
    float clsUTTabelaHashP2P2O0=-87.024025F;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("905",clsUTTabelaHashP2P1.toString());
    assertEquals("-87.024025",clsUTTabelaHashP2P2.toString());
    assertEquals(-1028780979,clsUTTabelaHashP2P2.hashCode());
      clsUTTabelaHash.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->imprime[], 
3)----->insere[String, String]
 Covered Branches:[1, 6, 7, 8, 9, 10, 11, 12, 13, 17, 18, 23, 24, 26]
 */
  @Test public void TestCase1() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
      clsUTTabelaHash.imprime();
    String clsUTTabelaHashP3P1=new String("9k!");
    String clsUTTabelaHashP3P2O0=new String("or!_k/PJALf^#Y@e]g$m|'D-yLM5_I<!y+H9TlTsAQV6eg%");
    Object clsUTTabelaHashP3P2=clsUTTabelaHashP3P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP3P1,(Object)clsUTTabelaHashP3P2);
    assertEquals("9k!",clsUTTabelaHashP3P1.toString());
    assertEquals(1059579851,clsUTTabelaHashP3P2.hashCode());
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, ds.TabelaHash[]], 
3)----->toString[], 
4)----->retira[String]
 Covered Branches:[1, 2, 3, 6, 7, 8, 10, 11, 12, 13, 17, 18, 20, 22]
 */
  @Test public void TestCase2() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
    TabelaHash clsUTTabelaHashP2P2O0=null;
      clsUTTabelaHashP2P2O0=new TabelaHash();
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("",clsUTTabelaHashP2P1.toString());
    String clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.toString();
    int clsUTTabelaHashP3RP0P1=0;
    int clsUTTabelaHashP3RP0P2=7;
    int clsUTTabelaHashP3RP0R=0;
      clsUTTabelaHashP3RP0R=clsUTTabelaHashP3R.lastIndexOf(clsUTTabelaHashP3RP0P1,clsUTTabelaHashP3RP0P2);
    assertEquals(-1,clsUTTabelaHashP3RP0R);
    String clsUTTabelaHashP3RP1R=null;
      clsUTTabelaHashP3RP1R=clsUTTabelaHashP3R.toUpperCase();
    String clsUTTabelaHashP4P1=new String("");
      clsUTTabelaHash.retira(clsUTTabelaHashP4P1);
    assertEquals("",clsUTTabelaHashP4P1.toString());
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, 8], 
3)----->toString[], 
4)----->pesquisa[String]
 Covered Branches:[1, 2, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18]
 */
  @Test public void TestCase3() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("[]");
    Integer clsUTTabelaHashP2P2O0=8;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("[]",clsUTTabelaHashP2P1.toString());
    assertEquals("8",clsUTTabelaHashP2P2.toString());
    assertEquals(8,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.toString();
    boolean clsUTTabelaHashP3RP0R=false;
      clsUTTabelaHashP3RP0R=clsUTTabelaHashP3R.startsWith(clsUTTabelaHashP3R);
    assertEquals(true,clsUTTabelaHashP3RP0R);
    boolean clsUTTabelaHashP3RP1R=false;
      clsUTTabelaHashP3RP1R=clsUTTabelaHashP3R.equalsIgnoreCase(clsUTTabelaHashP3R);
    assertEquals(true,clsUTTabelaHashP3RP1R);
    String clsUTTabelaHashP4P1=new String("5le4fj");
    Object clsUTTabelaHashP4R=null;
      clsUTTabelaHashP4R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP4P1);
    assertEquals("5le4fj",clsUTTabelaHashP4P1.toString());
    assertNull(clsUTTabelaHashP4R);
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, \u0041], 
3)----->toString[], 
4)----->retira[String]
 Covered Branches:[1, 2, 4, 6, 7, 8, 9, 10, 11, 12, 13, 17, 18, 20, 21]
 */
  @Test public void TestCase4() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
    Character clsUTTabelaHashP2P2O0='\u0041';
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("",clsUTTabelaHashP2P1.toString());
    assertEquals("A",clsUTTabelaHashP2P2.toString());
    assertEquals(65,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.toString();
    String clsUTTabelaHashP4P1=new String("-55");
//Exception
    try {
      clsUTTabelaHash.retira(clsUTTabelaHashP4P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertEquals("-55",clsUTTabelaHashP4P1.toString());
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, true], 
3)----->toString[], 
4)----->pesquisa[String]
 Covered Branches:[1, 2, 3, 6, 7, 8, 10, 11, 12, 13, 14, 16, 17, 18]
 */
  @Test public void TestCase5() throws Throwable {
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
    String clsUTTabelaHashP3RP0R=null;
      clsUTTabelaHashP3RP0R=clsUTTabelaHashP3R.trim();
    String clsUTTabelaHashP4P1=new String("");
    Object clsUTTabelaHashP4R=null;
      clsUTTabelaHashP4R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP4P1);
    assertEquals("",clsUTTabelaHashP4P1.toString());
    assertEquals("true",clsUTTabelaHashP4R.toString());
    assertEquals(1231,clsUTTabelaHashP4R.hashCode());
  }
}
