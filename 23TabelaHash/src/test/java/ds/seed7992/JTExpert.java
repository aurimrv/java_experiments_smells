package ds.seed7992;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
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
Evaluations : 62741
search time (ms): 42501
total runtime (ms): 44539
 */
public class JTExpert {
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->recuperaItens[], 
3)----->insere[String, -650], 
4)----->imprime[]
 Covered Branches:[32, 1, 34, 35, 36, 37, 5, 6, 38, 7, 8, 9, 10, 11, 12, 15, 16, 18, 19, 20, 23, 28, 29, 31]
 */
  @Test public void TestCase0() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    Object[] clsUTTabelaHashP2R=null;
      clsUTTabelaHashP2R=clsUTTabelaHash.recuperaItens();
    String clsUTTabelaHashP3P1=new String("|");
    Integer clsUTTabelaHashP3P2O0=-650;
    Object clsUTTabelaHashP3P2=clsUTTabelaHashP3P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP3P1,(Object)clsUTTabelaHashP3P2);
    assertEquals("|",clsUTTabelaHashP3P1.toString());
    assertEquals("-650",clsUTTabelaHashP3P2.toString());
    assertEquals(-650,clsUTTabelaHashP3P2.hashCode());
      clsUTTabelaHash.imprime();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, true], 
3)----->insere[String, 0]
 Covered Branches:[1, 6, 7, 8, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20, 21, 23]
 */
  @Test public void TestCase1() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
    Boolean clsUTTabelaHashP2P2O0=true;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("",clsUTTabelaHashP2P1.toString());
    assertEquals("true",clsUTTabelaHashP2P2.toString());
    assertEquals(1231,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3P1=new String("");
    Integer clsUTTabelaHashP3P2O0=0;
    Object clsUTTabelaHashP3P2=clsUTTabelaHashP3P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP3P1,(Object)clsUTTabelaHashP3P2);
    assertEquals("",clsUTTabelaHashP3P1.toString());
    assertEquals("0",clsUTTabelaHashP3P2.toString());
    assertEquals(0,clsUTTabelaHashP3P2.hashCode());
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->recuperaItens[], 
3)----->toString[]
 Covered Branches:[32, 34, 6, 7, 10, 11, 28, 29, 31]
 */
  @Test public void TestCase2() throws Throwable {
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
2)----->imprime[], 
3)----->pesquisa[String]
 Covered Branches:[35, 36, 6, 38, 7, 8, 9, 10, 11, 12, 15, 16, 18]
 */
  @Test public void TestCase3() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
      clsUTTabelaHash.imprime();
    String clsUTTabelaHashP3P1=new String("zh#b<nxitu");
    Object clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP3P1);
    assertEquals("zh#b<nxitu",clsUTTabelaHashP3P1.toString());
    assertNull(clsUTTabelaHashP3R);
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, true], 
3)----->pesquisa[String], 
4)----->toString[]
 Covered Branches:[1, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 18, 19, 20, 23]
 */
  @Test public void TestCase4() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
    boolean clsUTTabelaHashP2P2O0=true;
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("",clsUTTabelaHashP2P1.toString());
    assertEquals("true",clsUTTabelaHashP2P2.toString());
    assertEquals(1231,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3P1=new String("8118");
    Object clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.pesquisa(clsUTTabelaHashP3P1);
    assertEquals("8118",clsUTTabelaHashP3P1.toString());
    assertNull(clsUTTabelaHashP3R);
    String clsUTTabelaHashP4R=null;
      clsUTTabelaHashP4R=clsUTTabelaHash.toString();
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, 1], 
3)----->pesquisa[String], 
4)----->toString[]
 Covered Branches:[1, 6, 7, 8, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20, 23]
 */
  @Test public void TestCase5() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
    Integer clsUTTabelaHashP2P2O0=1;
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
    char clsUTTabelaHashP4RP0P1='\u006b';
    String clsUTTabelaHashP4RP0R=null;
      clsUTTabelaHashP4RP0R=String.valueOf(clsUTTabelaHashP4RP0P1);
    assertEquals("k",clsUTTabelaHashP4RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, \ua760], 
3)----->retira[String], 
4)----->toString[]
 Covered Branches:[1, 6, 7, 8, 10, 11, 12, 14, 15, 16, 18, 19, 20, 23, 25, 26]
 */
  @Test public void TestCase6() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("");
    char clsUTTabelaHashP2P2O0='\ua760';
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("",clsUTTabelaHashP2P1.toString());
    assertEquals("Ꝡ",clsUTTabelaHashP2P2.toString());
    assertEquals(42848,clsUTTabelaHashP2P2.hashCode());
    String clsUTTabelaHashP3P1=new String("");
      clsUTTabelaHash.retira(clsUTTabelaHashP3P1);
    assertEquals("",clsUTTabelaHashP3P1.toString());
    String clsUTTabelaHashP4R=null;
      clsUTTabelaHashP4R=clsUTTabelaHash.toString();
    String clsUTTabelaHashP4RP0P1=new String("yE_c'!6!`YX9&i.2i'iW_(gw-aw3pTI_xsng8;>(K4@");
    String[] clsUTTabelaHashP4RP0R=null;
//Exception
    try {
      clsUTTabelaHashP4RP0R=clsUTTabelaHashP4R.split(clsUTTabelaHashP4RP0P1);
		fail("Expected Exception");
    }
 catch (    Throwable exce) {
    }
    assertNull(clsUTTabelaHashP4RP0R);
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->recuperaItens[], 
3)----->toString[], 
4)----->retira[String]
 Covered Branches:[32, 34, 6, 7, 8, 9, 10, 11, 12, 15, 25, 27, 28, 29, 31]
 */
  @Test public void TestCase7() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    Object[] clsUTTabelaHashP2R=null;
      clsUTTabelaHashP2R=clsUTTabelaHash.recuperaItens();
    String clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.toString();
    String clsUTTabelaHashP4P1=new String("67#_'*a");
      clsUTTabelaHash.retira(clsUTTabelaHashP4P1);
    assertEquals("67#_'*a",clsUTTabelaHashP4P1.toString());
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, \u8fa0], 
3)----->imprime[], 
4)----->insere[String, -233]
 Covered Branches:[1, 35, 36, 37, 5, 6, 38, 7, 8, 9, 10, 11, 12, 13, 15, 16, 18, 19, 20, 22, 23]
 */
  @Test public void TestCase8() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("'}4/t+{zr&");
    char clsUTTabelaHashP2P2O0='\u8fa0';
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("'}4/t+{zr&",clsUTTabelaHashP2P1.toString());
    assertEquals("辠",clsUTTabelaHashP2P2.toString());
    assertEquals(36768,clsUTTabelaHashP2P2.hashCode());
      clsUTTabelaHash.imprime();
    String clsUTTabelaHashP4P1=new String("10");
    Integer clsUTTabelaHashP4P2O0=-233;
    Object clsUTTabelaHashP4P2=clsUTTabelaHashP4P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP4P1,(Object)clsUTTabelaHashP4P2);
    assertEquals("10",clsUTTabelaHashP4P1.toString());
    assertEquals("-233",clsUTTabelaHashP4P2.toString());
    assertEquals(-233,clsUTTabelaHashP4P2.hashCode());
  }
  /** 
 * Chromosome :
1)----->ds.TabelaHash[]
2)----->insere[String, String], 
3)----->recuperaItens[]
 Covered Branches:[32, 1, 33, 34, 6, 7, 8, 9, 10, 11, 12, 15, 16, 18, 19, 20, 23, 28, 29, 30, 31]
 */
  @Test public void TestCase9() throws Throwable {
    TabelaHash clsUTTabelaHash=null;
      clsUTTabelaHash=new TabelaHash();
    String clsUTTabelaHashP2P1=new String("7245860139");
    String clsUTTabelaHashP2P2O0=new String("1");
    Object clsUTTabelaHashP2P2=clsUTTabelaHashP2P2O0;
      clsUTTabelaHash.insere(clsUTTabelaHashP2P1,(Object)clsUTTabelaHashP2P2);
    assertEquals("7245860139",clsUTTabelaHashP2P1.toString());
    assertEquals("1",clsUTTabelaHashP2P2.toString());
    assertEquals(49,clsUTTabelaHashP2P2.hashCode());
    Object[] clsUTTabelaHashP3R=null;
      clsUTTabelaHashP3R=clsUTTabelaHash.recuperaItens();
  }
}
