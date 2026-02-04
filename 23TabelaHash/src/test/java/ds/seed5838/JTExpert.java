package ds.seed5838;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
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
Evaluations : 61537
search time (ms): 42501
total runtime (ms): 44269
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->imprime[], 
3)----->insere[String, 20], 
4)----->imprime[]
 Covered Branches:[1, 35, 36, 37, 5, 6, 38, 7, 8, 9, 10, 11, 12, 15, 16, 18, 19, 20, 23]
 */
  @Test public void TestCase0() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
      clsUTTabelaHash.imprime();
    String clsUTTabelaHashP3P1=new String("0sqjx8");
    Byte clsUTTabelaHashP3P2O0=20;
    Object clsUTTabelaHashP3P2=clsUTTabelaHashP3P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP3P1,(Object)clsUTTabelaHashP3P2);
    assertEquals("0sqjx8",clsUTTabelaHashP3P1.toString());
    assertEquals("20",clsUTTabelaHashP3P2.toString());
    assertEquals(20,clsUTTabelaHashP3P2.hashCode());
      clsUTTabelaHash.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->retira[String], 
3)----->imprime[], 
4)----->recuperaItens[]
 Covered Branches:[32, 34, 35, 36, 6, 38, 7, 8, 9, 10, 11, 12, 15, 25, 27, 28, 29, 31]
 */
  @Test public void TestCase1() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("!<ua*)7!=");
      clsUTTabelaHash.retira(clsUTTabelaHashP2P1);
    assertEquals("!<ua*)7!=",clsUTTabelaHashP2P1.toString());
      clsUTTabelaHash.imprime();
    Object[] clsUTTabelaHashP4R=null;
      clsUTTabelaHashP4R=clsUTTabelaHash.recuperaItens();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->imprime[], 
3)----->pesquisa[String]
 Covered Branches:[35, 36, 6, 38, 7, 8, 9, 10, 11, 12, 15, 16, 18]
 */
  @Test public void TestCase2() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
      clsUTTabelaHash.imprime();
    String clsUTTabelaHashP3P1=new String("K");
    Object clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP3P1);
    assertEquals("K",clsUTTabelaHashP3P1.toString());
    assertNull(clsUTTabelaHashP3R);
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->imprime[], 
3)----->retira[String]
 Covered Branches:[35, 36, 6, 38, 7, 8, 9, 10, 11, 12, 15, 25, 27]
 */
  @Test public void TestCase3() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
      clsUTTabelaHash.imprime();
    String clsUTTabelaHashP3P1=new String("  ");
      clsUTTabelaHash.retira(clsUTTabelaHashP3P1);
    assertEquals("  ",clsUTTabelaHashP3P1.toString());
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, 33.87732F], 
3)----->insere[String, 33L], 
4)----->recuperaItens[]
 Covered Branches:[32, 1, 33, 34, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 18, 19, 20, 22, 23, 28, 29, 30, 31]
 */
  @Test public void TestCase4() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("0_4CVEqvl");
    Float clsUTTabelaHashP2P2O0=33.87732F;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("0_4CVEqvl",clsUTTabelaHashP2P1.toString());
    assertEquals("33.87732",clsUTTabelaHashP2P2.toString());
    assertEquals(1107788384,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3P1=new String("qdT");
    long clsUTTabelaHashP3P2O0=33L;
    Object clsUTTabelaHashP3P2=clsUTTabelaHashP3P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP3P1,(Object)clsUTTabelaHashP3P2);
    assertEquals("qdT",clsUTTabelaHashP3P1.toString());
    assertEquals("33",clsUTTabelaHashP3P2.toString());
    assertEquals(33,clsUTTabelaHashP3P2.hashCode());
    Object[] clsUTTabelaHashP4R=null;
      clsUTTabelaHashP4R=clsUTTabelaHash.recuperaItens();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, \u0030], 
3)----->recuperaItens[]
 Covered Branches:[32, 1, 33, 34, 6, 7, 8, 9, 10, 11, 12, 15, 16, 18, 19, 20, 23, 28, 29, 30, 31]
 */
  @Test public void TestCase5() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("  ");
    char clsUTTabelaHashP2P2O0='\u0030';
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("  ",clsUTTabelaHashP2P1.toString());
    assertEquals("0",clsUTTabelaHashP2P2.toString());
    assertEquals(48,clsUTTabelaHashP2P2.hashCode());
    Object[] clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.recuperaItens();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, -58.57323F], 
3)----->toString[], 
4)----->pesquisa[String]
 Covered Branches:[1, 6, 7, 8, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20, 23]
 */
  @Test public void TestCase6() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
    float clsUTTabelaHashP2P2O0=-58.57323F;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("",clsUTTabelaHashP2P1.toString());
    assertEquals("-58.57323",clsUTTabelaHashP2P2.toString());
    assertEquals(-1033221379,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.toString();
    int clsUTTabelaHashP3RP0P1=315;
    int clsUTTabelaHashP3RP0P2=518;
    char[] clsUTTabelaHashP3RP0P3=new char[]{'\u7a3d','\u0037'};
    int clsUTTabelaHashP3RP0P4=-575;
//Exception
    try {
      clsUTTabelaHashP3R.getChars(clsUTTabelaHashP3RP0P1,clsUTTabelaHashP3RP0P2,clsUTTabelaHashP3RP0P3,clsUTTabelaHashP3RP0P4);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertTrue(Arrays.equals(new char[]{'\u7a3d','\u0037'},clsUTTabelaHashP3RP0P3));
    String clsUTTabelaHashP4P1=new String("");
    Object clsUTTabelaHashP4R=null;
      clsUTTabelaHashP4R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP4P1);
    assertEquals("",clsUTTabelaHashP4P1.toString());
    assertEquals("-58.57323",clsUTTabelaHashP4R.toString());
    assertEquals(-1033221379,clsUTTabelaHashP4R.hashCode());
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, false], 
3)----->toString[], 
4)----->retira[String]
 Covered Branches:[1, 6, 7, 8, 10, 11, 12, 14, 15, 16, 18, 19, 20, 23, 25, 26]
 */
  @Test public void TestCase7() throws Throwable {
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
    String clsUTTabelaHashP3RP0P1=new String("$' 5wag|*4d__r;=ei7)-?p{<s!+^m:9}ht&2z3[1~%xb@clku`j6(f]8.v/>0q#yon\\\\\\\\\\\\\"");
    int clsUTTabelaHashP3RP0P2=-226;
    int clsUTTabelaHashP3RP0R=0;
      clsUTTabelaHashP3RP0R=clsUTTabelaHashP3R.lastIndexOf(clsUTTabelaHashP3RP0P1,clsUTTabelaHashP3RP0P2);
    assertEquals(-1,clsUTTabelaHashP3RP0R);
    String clsUTTabelaHashP3RP1R=null;
      clsUTTabelaHashP3RP1R=clsUTTabelaHashP3R.intern();
    String clsUTTabelaHashP4P1=new String("");
      clsUTTabelaHash.retira(clsUTTabelaHashP4P1);
    assertEquals("",clsUTTabelaHashP4P1.toString());
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->recuperaItens[], 
3)----->insere[String, -89L], 
4)----->pesquisa[String], 
5)----->toString[]
 Covered Branches:[32, 1, 34, 6, 7, 8, 9, 10, 11, 12, 15, 16, 18, 19, 20, 23, 28, 29, 31]
 */
  @Test public void TestCase8() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    Object[] clsUTTabelaHashP2R=null;
      clsUTTabelaHashP2R=clsUTTabelaHash.recuperaItens();
    String clsUTTabelaHashP3P1=new String("CFsSd5shz");
    long clsUTTabelaHashP3P2O0=-89L;
    Object clsUTTabelaHashP3P2=clsUTTabelaHashP3P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP3P1,(Object)clsUTTabelaHashP3P2);
    assertEquals("CFsSd5shz",clsUTTabelaHashP3P1.toString());
    assertEquals("-89",clsUTTabelaHashP3P2.toString());
    assertEquals(88,clsUTTabelaHashP3P2.hashCode());
    String clsUTTabelaHashP4P1=new String("wdfnox");
    Object clsUTTabelaHashP4R=null;
      clsUTTabelaHashP4R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP4P1);
    assertEquals("wdfnox",clsUTTabelaHashP4P1.toString());
    assertNull(clsUTTabelaHashP4R);
    String clsUTTabelaHashP5R=null;
      clsUTTabelaHashP5R=clsUTTabelaHash.toString();
    int clsUTTabelaHashP5RP0R=0;
      clsUTTabelaHashP5RP0R=clsUTTabelaHashP5R.hashCode();
    int clsUTTabelaHashP5RP1P1=-201;
    String clsUTTabelaHashP5RP1R=null;
//Exception
    try {
      clsUTTabelaHashP5RP1R=clsUTTabelaHashP5R.substring(clsUTTabelaHashP5RP1P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTTabelaHashP5RP1R);
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->recuperaItens[], 
3)----->insere[String, 260], 
4)----->insere[String, String]
 Covered Branches:[32, 1, 34, 6, 7, 8, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20, 21, 23, 28, 29, 31]
 */
  @Test public void TestCase9() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    Object[] clsUTTabelaHashP2R=null;
      clsUTTabelaHashP2R=clsUTTabelaHash.recuperaItens();
    String clsUTTabelaHashP3P1=new String("");
    Integer clsUTTabelaHashP3P2O0=260;
    Object clsUTTabelaHashP3P2=clsUTTabelaHashP3P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP3P1,(Object)clsUTTabelaHashP3P2);
    assertEquals("",clsUTTabelaHashP3P1.toString());
    assertEquals("260",clsUTTabelaHashP3P2.toString());
    assertEquals(260,clsUTTabelaHashP3P2.hashCode());
    String clsUTTabelaHashP4P1=new String("");
    String clsUTTabelaHashP4P2O0=new String("d9j907xp15d8pxt3q");
    Object clsUTTabelaHashP4P2=clsUTTabelaHashP4P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP4P1,(Object)clsUTTabelaHashP4P2);
    assertEquals("",clsUTTabelaHashP4P1.toString());
    assertEquals("d9j907xp15d8pxt3q",clsUTTabelaHashP4P2.toString());
    assertEquals(951757455,clsUTTabelaHashP4P2.hashCode());
  }
}
